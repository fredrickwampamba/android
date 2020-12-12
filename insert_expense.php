<?php 
$conn = mysqli_connect('localhost',"root","","rest_api");
if ($_SERVER["REQUEST_METHOD"] === 'POST')
{
    $reason = $_REQUEST["reason"];
    $amount = $_REQUEST["amount"];
    $date = $_REQUEST["date"];
    $query = "INSERT INTO expenditure (`reason`,`amount`,`date`)   VALUES('$reason','$amount','$date')";
    $result = $conn->query($query);
    if ($result == 1)
    {
        $data["message"] = "data saved successfully";
        $data["status"] = "Ok";
    }
    else
    {
        $data["message"] = "data not saved successfully";
        $data["status"] = "error";    
    }
}
else
{
    $data["message"] = "Format not supported";
    $data["status"] = "error";    
}
    echo json_encode($data);