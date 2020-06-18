<?php include('modified.php') ?>
<!DOCTYPE html>
<html>
	<head>
		<title>covid</title>
		<link rel="stylesheet" href="styles.css" >
	</head>
	<body>
	    <div class="simple-form">
		<form id="form" action="modified.php" method="POST">
		        <table align="center" cellpadding="10">
		        <tr><td><h3>PATIENT DEMOGRAPHICS</h3></td></tr>
				<tr>
					<td>UNIQUE MEDICAL ID *</td>
					<td>
					 <input type="number" name="uid" id="uid" required> 
					</td>				
				</tr>
				
				<tr>
					<td>FIRST NAME *</td>
					<td>
					<input type="text" name="fname" id="fname" required>
					</td>
				</tr>
				<tr>
					<td>LAST NAME *</td>
					<td>
					<input type="text" name="lname" id="lname" required>
					</td>
				</tr>
				<tr>
					<td>EMAIL</td>
				 <td><input type="email" name="email" id="email"></td>
				</tr>
				<tr>
					<td>DATE OF BIRTH *</td>
					<td><input type="date" name="dob" id="dob" min = <?php echo date('1900-01-01')?>  max = <?php echo date('Y-m-d'); ?> required></td>
				</tr>
				<tr>
					<td>HOUSE/FLAT NUMBER *</td>
					<td><input type="text" name="flat" id="flat"  required></td>
				</tr>
				<tr>
					<td>STREET *</td>
					<td><input type="text" name="street" id="street"  required></td>
				</tr>
				<tr>
					<td>LOCALITY *</td>
					<td><input type="text" name="locality" id="locality"  required></td>
				</tr>
				<tr>
					<td>CITY *</td>
					<td><input type="text" name="city" id="city" required></td>
				</tr>
				<tr>
					<td>STATE *</td>
					<td><input type="text" name="state" id="state" required></td>
				</tr>
				<tr>
					<td>PIN CODE *</td>
					<td><input type ="text" name="pin" id="pin" pattern = "[0-9]{6}" required></td>
				</tr>
				<tr>
					<td>SOURCE OF DISEASE *</td>
					<td><input type="text" name="sod" id="sod" required></td>
				</tr>
			    <tr><td><h3>LAB DETAILS </h3></td></tr>
				<tr>
					<td>ADDRESS *</td>
					<td><textarea name="laddress" id="laddress" placeholder="Laboratory Address" rows="4" columns="50" required></textarea></td>
				</tr>
				<tr>
					<td>LAB DIRECTOR *</td>
					<td><input type="text" name="lab_director" id="lab_director" required></td>
				</tr>
				<tr>
					<td>TEST METHOD *</td>
					<td>
						<select name="tmethod" id="tmethod" required>
                    		<option value="" >Select method</option>
							<option value="genesig Real-Time PCR Coronavirus">genesig Real-Time PCR Coronavirus</option>
							<option value="cobas SARS-Cov-2">cobas SARS-Cov-2</option>
						</select>
					</td>
				</tr>
				<tr>
					<td>PERFORMED DATE *</td>
					<td><input type="date" name="performed_date" id="performed_date"  min = <?php echo date('2019-12-01')?>  max = <?php echo date('Y-m-d'); ?> required></td>
				</tr>
			    <tr><td><h3>RESULTS</h3></td></tr>
				<tr>
					<td>TEST RESULT *</td>
					<tr>
					<td>
					<input type="radio" id="positive" name="result" value="positive" required>
					<label for="positive">POSITIVE</label>
					</td>
					</tr>
					<tr>
					<td>
					<input type="radio" id="negative" name="result" value="negative">
					<label for="negative">NEGATIVE</label>
					</td>
					</tr>
					<tr>
					<td colspan="4" align="center">
					<button type="submit" name="button1" id="button1">Submit</button>
					<button type="reset" name="button2" id="button2">Reset</button>
					</td>
					</tr>
					</table>	
			</form>
			</div>
	</body>
</html>