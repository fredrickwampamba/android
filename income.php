<?php 
// header('Content-Type: application/json');
$conn = mysqli_connect('localhost',"root","","rest_api");
if ($_SERVER["REQUEST_METHOD"] === 'POST')
{   
    $jsonData = json_decode($_POST);
    $reason = $jsonData["name"];
    $amount = $jsonData["amount"];
    $date = $jsonData["date"];
    $query = "INSERT INTO income (`name`,`amount`,`date`)   VALUES('$reason','$amount','$date')";
    $result = $conn->query($query);
    if ($result)
    {
        $data["message"] = "Saved";
        $data["status"] = "Ok";
    }
    else
    {
        $data["message"] = "Failed";
        $data["status"] = "error";    
    }
}
else
{
    $data["message"] = "Invalid";
    $data["status"] = "error";    
}
    echo json_encode($data);