$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("findRestaurants.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: dvotran@yahoo.com"
    }
  ],
  "line": 3,
  "name": "Use the website to find restaurants",
  "description": "\t\t\t\tSo that I can order food\n\t\t\t\tAs a hungry customer\n\t\t\t\tI want to be able to find restaurants in my area",
  "id": "use-the-website-to-find-restaurants",
  "keyword": "Feature"
});
formatter.before({
  "duration": 7590081300,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "Search for restaurants in an area",
  "description": "",
  "id": "use-the-website-to-find-restaurants;search-for-restaurants-in-an-area",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 10,
      "name": "@search"
    }
  ]
});
formatter.step({
  "line": 12,
  "name": "I want food in \"AR51 1AA\"",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "I search for restaurants",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "I should see some restaurants in that area",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "AR51 1AA",
      "offset": 16
    }
  ],
  "location": "SearchSteps.iWantFoodIn(String)"
});
formatter.result({
  "duration": 560536800,
  "status": "passed"
});
formatter.match({
  "location": "SearchSteps.iSearchForRestaurants()"
});
formatter.result({
  "duration": 19079046400,
  "status": "passed"
});
formatter.match({
  "location": "SearchSteps.iShouldSeeSomeRestaurantsIn()"
});
formatter.result({
  "duration": 92237700,
  "status": "passed"
});
formatter.after({
  "duration": 1001136300,
  "status": "passed"
});
});