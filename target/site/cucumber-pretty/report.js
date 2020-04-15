$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("DarkSky.feature");
formatter.feature({
  "line": 3,
  "name": "Verify DarkSky",
  "description": "",
  "id": "verify-darksky",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@web"
    }
  ]
});
formatter.before({
  "duration": 4115022853,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "I am on DarkSky Home Page",
  "keyword": "Given "
});
formatter.match({
  "location": "DarkSkySD.setup()"
});
formatter.result({
  "duration": 3824653336,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "Verify timeline is displayed in correct format",
  "description": "",
  "id": "verify-darksky;verify-timeline-is-displayed-in-correct-format",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 9,
      "name": "@temptimeline-1"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "I verify timeline is displayed with two hours incremented",
  "keyword": "Then "
});
formatter.match({
  "location": "DarkSkySD.verifyTimes()"
});
formatter.result({
  "duration": 56334972152,
  "status": "passed"
});
formatter.after({
  "duration": 152954796,
  "status": "passed"
});
formatter.before({
  "duration": 2347604645,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "I am on DarkSky Home Page",
  "keyword": "Given "
});
formatter.match({
  "location": "DarkSkySD.setup()"
});
formatter.result({
  "duration": 3515297316,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "Verify individual day temp timeline",
  "description": "",
  "id": "verify-darksky;verify-individual-day-temp-timeline",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 13,
      "name": "@individualtemptimeline"
    }
  ]
});
formatter.step({
  "line": 15,
  "name": "I verify the lowest and the highest temp is displayed correctly",
  "keyword": "Then "
});
formatter.match({
  "location": "DarkSkySD.verifyTemps()"
});
formatter.result({
  "duration": 41271241968,
  "status": "passed"
});
formatter.after({
  "duration": 162974790,
  "status": "passed"
});
});