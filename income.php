<?php 
// header('Content-Type: application/json');
$conn = mysqli_connect('localhost',"root","","rest_api");
if ($_SERVER["REQUEST_METHOD"] === 'POST')
{
    $reason = $_REQUEST["reason"];
    $amount = $_REQUEST["amount"];
    $date = $_REQUEST["date"];
    $query = "INSERT INTO income (`reason`,`amount`,`date`)   VALUES('$reason','$amount','$date')";
    $result = $conn->query($query);
    if ($result == 1)
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