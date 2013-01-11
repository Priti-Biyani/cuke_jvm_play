$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("\u0027test/cuke/VerifyOrder.feature\u0027");
formatter.feature({
  "id": "verify-order",
  "description": "",
  "name": "Verify Order",
  "keyword": "Feature",
  "line": 1
});
formatter.scenario({
  "id": "verify-order;verify-order-delivery",
  "description": "",
  "name": "Verify Order delivery",
  "keyword": "Scenario",
  "line": 3,
  "type": "scenario"
});
formatter.step({
  "name": "I visit order status page",
  "keyword": "Given ",
  "line": 4
});
formatter.step({
  "name": "I should see order delivered status",
  "keyword": "Then ",
  "line": 5
});
formatter.match({
  "location": "VerifyOrderStatus_step.I_visit_order_status_page()"
});
formatter.result({
  "duration": 6937722000,
  "status": "passed"
});
formatter.match({
  "location": "VerifyOrderStatus_step.I_should_see_order_delivered_status()"
});
formatter.result({
  "duration": 79297000,
  "status": "passed"
});
});