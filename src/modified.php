<?php 
$servername = "localhost";
$username = "root";
$password = "";
$conn = mysqli_connect ($servername , $username , $password,"seleniumass") or die("unable to connect to host");
if(!($conn)){
    echo "Unable to connect";
}
$uid = "";
$fname = "";
$lname = "";
$email = "";
$dob = "";
$flat= "";
$street= "";
$locality= "";
$city= "";
$state= "";
$pin= "";
$sod = "";
$laddress = "";
$lab_director = "";
$method = "";
$performed_date = "";
$result = "";
if(isset($_POST['button1'])){
$uid = $_POST['uid'];
$fname = $_POST['fname'];
$lname = $_POST['lname'];
$email = $_POST['email'];
$dob = $_POST['dob'];
$flat= $_POST['flat'];
$street=$_POST['street'];
$locality= $_POST['locality'];
$city= $_POST['city'];
$state= $_POST['state'];
$pin= $_POST['pin'];
$sod = $_POST['sod'];
$laddress = $_POST['laddress'];
$lab_director = $_POST['lab_director'];
$method = $_POST['tmethod'];
$performed_date = $_POST['performed_date'];
$result = $_POST['result'];
$sql_id = "SELECT * FROM covid WHERE uid='$uid'";
$res_id = mysqli_query($conn,$sql_id);
if (mysqli_num_rows($res_id) > 0) {
        $sql_update = "UPDATE covid SET fname='$fname',lname='$lname' , email = '$email', dob='$dob', flat='$flat',street = '$street' ,locality = '$locality' ,city = '$city', state='$state', pin='$pin',sod='$sod', laddress='$laddress', lab_director='$lab_director', testmethod='$method', tdate='$performed_date', tres='$result' WHERE uid='$uid'";
        mysqli_query($conn,$sql_update);
        echo "Updated!";
        exit();
    }
else{
$sql="INSERT INTO covid (uid, fname, lname, email, dob, flat, street, locality, city, state, pin, sod, laddress, lab_director, testmethod, tdate, tres) VALUES ('$uid','$fname','$lname' , '$email','$dob','$flat','$street' ,'$locality' ,'$city','$state','$pin','$sod','$laddress', '$lab_director', '$method','$performed_date','$result')";
mysqli_query($conn,$sql);
echo "Saved!";
exit();
}
}
?>

