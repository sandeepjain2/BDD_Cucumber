$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:/E:/MyIntellij/Java/BDD_Cucumber/Features/Hooks.feature");
formatter.feature({
  "name": "Hooks in cucumber",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "add new customer",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on add customer page",
  "keyword": "Given "
});
formatter.match({
  "location": "HooksStepDefinitions.user_is_on_add_customer_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user fills the customer details",
  "keyword": "When "
});
formatter.match({
  "location": "HooksStepDefinitions.user_fills_the_customer_details()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "customer is added",
  "keyword": "Then "
});
formatter.match({
  "location": "HooksStepDefinitions.customer_is_added()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Edit customer",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on edit customer page",
  "keyword": "Given "
});
formatter.match({
  "location": "HooksStepDefinitions.user_is_on_edit_customer_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user edit contact details",
  "keyword": "When "
});
formatter.match({
  "location": "HooksStepDefinitions.user_edit_contact_details()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "contact details updated",
  "keyword": "Then "
});
formatter.match({
  "location": "HooksStepDefinitions.contact_details_updated()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Delete customer",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on delete customer page",
  "keyword": "Given "
});
formatter.match({
  "location": "HooksStepDefinitions.user_is_on_delete_customer_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user delete customer",
  "keyword": "When "
});
formatter.match({
  "location": "HooksStepDefinitions.user_delete_customer()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "customer deleted",
  "keyword": "Then "
});
formatter.match({
  "location": "HooksStepDefinitions.customer_deleted()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});