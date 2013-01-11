$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("\u0027PlaceOrder.feature\u0027");
formatter.feature({
  "id": "place-order",
  "description": "",
  "name": "Place Order",
  "keyword": "Feature",
  "line": 1
});
formatter.scenario({
  "id": "place-order;place-order-online",
  "description": "",
  "name": "Place Order online",
  "keyword": "Scenario",
  "line": 3,
  "type": "scenario"
});
formatter.step({
  "name": "I visit the merchant site",
  "keyword": "Given ",
  "line": 4
});
formatter.step({
  "name": "I place the order",
  "keyword": "When ",
  "line": 5
});
formatter.step({
  "name": "I should see successful update message",
  "keyword": "Then ",
  "line": 6
});
formatter.match({
  "location": "PlaceOrderStepDefn.I_visit_the_merchant_site()"
});
formatter.result({
  "duration": 7173194000,
  "status": "passed"
});
formatter.match({
  "location": "PlaceOrderStepDefn.place_the_order()"
});
formatter.result({
  "duration": 585542000,
  "status": "passed"
});
formatter.match({
  "location": "PlaceOrderStepDefn.I_should_see_successful_update_message()"
});
formatter.result({
  "duration": 9296000,
  "status": "passed"
});
formatter.scenario({
  "id": "place-order;verify-order-delivery",
  "description": "",
  "name": "Verify Order delivery",
  "keyword": "Scenario",
  "line": 9,
  "type": "scenario"
});
formatter.step({
  "name": "I visit order status page",
  "keyword": "Given ",
  "line": 10
});
formatter.step({
  "name": "I should see order delivered status",
  "keyword": "Then ",
  "line": 11
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});