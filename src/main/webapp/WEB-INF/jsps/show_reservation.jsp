<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display Reservation Page</title>
</head>
<body>
<h3>Display reservation | display</h3>
<hr>
Passenger First Name   : ${reservation.getPassenger().firstName}<br/>
Passenger Last  Name   : ${reservation.getPassenger().lastName}<br/>
Passenger Middle Name  : ${reservation.getPassenger().middleName}<br/>
Email                  : ${reservation.getPassenger().email}<br/>
Passenger Phone        : ${reservation.getPassenger().phone}<br/>
Flight Number          : ${reservation.getFlight().flightNumber}<br/>
Operating Airlines     : ${reservation.getFlight().operatingAirlines}<br/>
Departure City         : ${reservation.getFlight().departureCity}<br/>
Arrival City           : ${reservation.getFlight().arrivalCity}<br/>
Departure Date         : ${reservation.getFlight().dateOfDeparture}<br/>
<form action="proceedCheckIn" method="post">
<pre>
Reservation id         : <input type = "text" name = "id" value="${reservation.id}" />
Number of bags         : <input type = "text" name = "numberOfBags" />

<input type = "submit" value="proceed">
</pre>
</form>

</body>
</html>