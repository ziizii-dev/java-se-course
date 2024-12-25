<?php
session_start();

// Database connection
$host = 'localhost';        // Database host
$dbname = 'your_database';  // Database name
$username = 'your_username'; // Database username
$password = 'your_password'; // Database password

$conn = new PDO("mysql:host=$host;dbname=$dbname", $username, $password);
$conn->setAttribute(PDO::ATTR_ERRMODE, PDO::ERRMODE_EXCEPTION);

// Facebook App Configuration
define('APP_ID', 'your-app-id');
define('APP_SECRET', 'your-app-secret');
define('REDIRECT_URI', 'https://your-redirect-uri.com/');

// Step 1: Generate Facebook Login URL
if (!isset($_GET['code'])) {
    $loginUrl = "https://www.facebook.com/v12.0/dialog/oauth?client_id=" . APP_ID . 
                "&redirect_uri=" . urlencode(REDIRECT_URI) . 
                "&scope=email,public_profile";

    echo '<a href="' . $loginUrl . '">Login with Facebook</a>';
    exit();
}

// Step 2: Exchange Code for Access Token
if (isset($_GET['code'])) {
    $code = $_GET['code'];
    $tokenUrl = "https://graph.facebook.com/v12.0/oauth/access_token?" .
                "client_id=" . APP_ID .
                "&redirect_uri=" . urlencode(REDIRECT_URI) .
                "&client_secret=" . APP_SECRET .
                "&code=" . $code;

    $response = file_get_contents($tokenUrl);
    $tokenData = json_decode($response, true);

    if (isset($tokenData['access_token'])) {
        $_SESSION['access_token'] = $tokenData['access_token'];
        header('Location: ' . REDIRECT_URI);
        exit();
    } else {
        die("Error fetching access token.");
    }
}

// Step 3: Fetch User Data
if (isset($_SESSION['access_token'])) {
    $accessToken = $_SESSION['access_token'];
    $userUrl = "https://graph.facebook.com/v12.0/me?fields=id,name,email&access_token=" . $accessToken;

    $userResponse = file_get_contents($userUrl);
    $userData = json_decode($userResponse, true);

    if (isset($userData['id'])) {
        // Store user data in the database
        $stmt = $conn->prepare("INSERT INTO users (facebook_id, name, email) VALUES (:facebook_id, :name, :email)
                                ON DUPLICATE KEY UPDATE name = :name, email = :email");
        $stmt->execute([
            ':facebook_id' => $userData['id'],
            ':name' => $userData['name'],
            ':email' => $userData['email'] ?? null, // Email might not be provided
        ]);

        echo '<h1>User Data Stored</h1>';
        echo '<pre>' . print_r($userData, true) . '</pre>';
        exit();
    } else {
        die("Error fetching user data.");
    }
}
?>
