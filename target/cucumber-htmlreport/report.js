$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("myfeature1.feature");
formatter.feature({
  "line": 1,
  "name": "login feature",
  "description": "",
  "id": "login-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Validate first name user field",
  "description": "",
  "id": "login-feature;validate-first-name-user-field",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "User is at facebook login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User enters user first name",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User checks user first name is present",
  "keyword": "Then "
});
formatter.match({
  "location": "Myfirststepdef.User_is_at_facebook_login_page()"
});
formatter.result({
  "duration": 6609796660,
  "status": "passed"
});
formatter.match({
  "location": "Myfirststepdef.User_enters_user_first_name()"
});
formatter.result({
  "duration": 344304988,
  "status": "passed"
});
formatter.match({
  "location": "Myfirststepdef.User_checks_user_first_name_is_present()"
});
formatter.result({
  "duration": 71910881,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "Validate create user multiple fields",
  "description": "",
  "id": "login-feature;validate-create-user-multiple-fields",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 10,
  "name": "User is at facebook login page",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "User enters user first name",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "User enters user last name",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "User checks user first name is present",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "Mobile field should be blank",
  "keyword": "But "
});
formatter.match({
  "location": "Myfirststepdef.User_is_at_facebook_login_page()"
});
formatter.result({
  "duration": 5721180697,
  "status": "passed"
});
formatter.match({
  "location": "Myfirststepdef.User_enters_user_first_name()"
});
formatter.result({
  "duration": 197711732,
  "status": "passed"
});
formatter.match({
  "location": "Myfirststepdef.User_enters_user_last_name()"
});
formatter.result({
  "duration": 225228250,
  "status": "passed"
});
formatter.match({
  "location": "Myfirststepdef.User_checks_user_first_name_is_present()"
});
formatter.result({
  "duration": 53917338,
  "status": "passed"
});
formatter.match({
  "location": "Myfirststepdef.Mobile_field_should_be_blank()"
});
formatter.result({
  "duration": 46255426,
  "error_message": "java.lang.AssertionError: expected:\u003cnull\u003e but was:\u003c\u003e\r\n\tat org.junit.Assert.fail(Assert.java:88)\r\n\tat org.junit.Assert.failNotEquals(Assert.java:834)\r\n\tat org.junit.Assert.assertEquals(Assert.java:118)\r\n\tat org.junit.Assert.assertEquals(Assert.java:144)\r\n\tat Sample.Myfirststepdef.Mobile_field_should_be_blank(Myfirststepdef.java:53)\r\n\tat ✽.But Mobile field should be blank(myfeature1.feature:14)\r\n",
  "status": "failed"
});
});