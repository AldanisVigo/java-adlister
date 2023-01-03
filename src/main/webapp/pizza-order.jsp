<%--
  Created by IntelliJ IDEA.
  User: aldanisvigo
  Date: 12/16/22
  Time: 11:20 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Super Slice Pizza - Come get it</title>
    <style>
        body{
            display: flex;
            justify-content: center;
            align-items: center;
            background: linear-gradient(to bottom, darkred, lightcoral,lightcoral);
        }

        form {
            background: lightblue;
            border-radius: 40px;
            padding: 40px;
            display: grid;
            grid-template-columns : 1fr;
            grid-template-rows: 1fr 1fr 1fr 1fr 1fr 1fr;
            max-width: 400px;
            max-height: 40vh;
        }
    </style>
</head>
<body>
  <form action="/ordersomepizza" method="POST">
<%--    This form features choices to select the
crust type, sauce type, size type (use select inputs),
toppings (checkboxes), and delivery address (text input).--%>
    <h1>What's Your SuperOrder?</h1>
    <label for="crust">
      Select Your Crust
      <select id="crust" name="crust">
        <option value="regular">Regular Crust</option>
        <option value="thin">Thin Crust</option>
        <option value="deepdish">Deep Dish</option>
        <option value="handtossed">Hand Tossed</option>
      </select>
    </label>
    <label for="sauce">
      Select Your Sauce:
      <select id="sauce" name="sauce">
        <option value="marinara">Marinara</option>
        <option value="pesto">Pesto</option>
        <option value="alfredo">Alfredo</option>
        <option value="barbecue">Barbecue</option>
      </select>
    </label>
    <label for="size">
      Select Your Size:
      <select id="size" name="size">
        <option value="small">Small</option>
        <option value="medium">Medium</option>
        <option value="large">Large</option>
      </select>
    </label>
    <label for="toppings">
      <fieldset id="toppings">
        <legend>Select Your Toppings:</legend>
        <input type="checkbox" name="toppings[]" value="sausage">Sausage</input>
        <input type="checkbox" name="toppings[]" value="pepperoni">Pepperoni</input>
        <input type="checkbox" name="toppings[]" value="chicken">Chicken</input>
      </fieldset>
    </label>
    <label for="address">
        <input type="address" id="address" name="address" placeholder="Delivery Address"></input>
    </label>
    <button type="submit">Place Order</button>
  </form>
</body>
</html>
