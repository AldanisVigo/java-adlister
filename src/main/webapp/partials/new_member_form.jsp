<%--
  Created by IntelliJ IDEA.
  User: aldanisvigo
  Date: 12/15/22
  Time: 1:29 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<form action="/add-member.jsp" method="POST">
  <input type="text" placeholder="Member's Name" id="new_member_name"/>
  <input type="email" placeholder="Member's Email Address" id="new_member_email"/>
  <input type="password" placeholder="Member's Password" id="new_member_password"/>
  <label for="member_stack_preference">
    What part of the stack does this member like?
    <select name="member_stack_preference" id="member_stack_preference">
      <option value="frontend">Front-End</option>
      <option value="backend">Back-End</option>
      <option value="fullstack">Full-Stack</option>
    </select>
  </label>
  <textarea id="new_member_bio" rows="5">

  </textarea>
  <button>Create Account</button>
</form>
