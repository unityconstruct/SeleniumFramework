$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/com/uc/test/selenium/bdd/features/CreateArticle.feature");
formatter.feature({
  "line": 1,
  "name": "Create a new article",
  "description": "",
  "id": "create-a-new-article",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Free CRM Login Test Scenario",
  "description": "",
  "id": "create-a-new-article;free-crm-login-test-scenario",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "User is on home page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "title of home page is correct",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user clicks on LoginLink",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user enters username \"\u003cusername\u003e\" and password \"\u003cpassword\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user clicks new article link",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user enters title \"\u003ctitle\u003e\" and body \"\u003cbody\u003e\" and tags \"\u003ctags\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "user closes browser",
  "keyword": "Then "
});
formatter.examples({
  "line": 13,
  "name": "",
  "description": "",
  "id": "create-a-new-article;free-crm-login-test-scenario;",
  "rows": [
    {
      "cells": [
        "username",
        "password",
        "title",
        "body",
        "tags"
      ],
      "line": 15,
      "id": "create-a-new-article;free-crm-login-test-scenario;;1"
    },
    {
      "cells": [
        "UnityAdmin",
        "UnityAdmin@2017",
        "NewArticle",
        "NewBody",
        "_deleteme"
      ],
      "line": 16,
      "id": "create-a-new-article;free-crm-login-test-scenario;;2"
    },
    {
      "cells": [
        "UnityAdmin",
        "UnityAdmin@2017",
        "NewArticle2",
        "NewBody2",
        "_deleteme"
      ],
      "line": 17,
      "id": "create-a-new-article;free-crm-login-test-scenario;;3"
    },
    {
      "cells": [
        "UnityAdmin",
        "UnityAdmin@2017",
        "NewArticle3",
        "NewBody3",
        "_deleteme"
      ],
      "line": 18,
      "id": "create-a-new-article;free-crm-login-test-scenario;;4"
    },
    {
      "cells": [
        "UnityAdmin",
        "UnityAdmin@2017",
        "NewArticle4",
        "NewBody4",
        "_deleteme"
      ],
      "line": 19,
      "id": "create-a-new-article;free-crm-login-test-scenario;;5"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 16,
  "name": "Free CRM Login Test Scenario",
  "description": "",
  "id": "create-a-new-article;free-crm-login-test-scenario;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "User is on home page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "title of home page is correct",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user clicks on LoginLink",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user enters username \"UnityAdmin\" and password \"UnityAdmin@2017\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user clicks new article link",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user enters title \"NewArticle\" and body \"NewBody\" and tags \"_deleteme\"",
  "matchedColumns": [
    2,
    3,
    4
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "user closes browser",
  "keyword": "Then "
});
formatter.match({
  "location": "CreateArticle_Definitions.user_is_on_home_page()"
});
formatter.result({
  "duration": 6711407788,
  "status": "passed"
});
formatter.match({
  "location": "CreateArticle_Definitions.title_of_home_page_is_correct()"
});
formatter.result({
  "duration": 28028572,
  "status": "passed"
});
formatter.match({
  "location": "CreateArticle_Definitions.user_clicks_on_LoginLink()"
});
formatter.result({
  "duration": 1992593186,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "UnityAdmin",
      "offset": 22
    },
    {
      "val": "UnityAdmin@2017",
      "offset": 48
    }
  ],
  "location": "CreateArticle_Definitions.user_enters_username_and_password(String,String)"
});
formatter.result({
  "duration": 2237701157,
  "status": "passed"
});
formatter.match({
  "location": "CreateArticle_Definitions.user_clicks_new_article_link()"
});
formatter.result({
  "duration": 5658595230,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "NewArticle",
      "offset": 19
    },
    {
      "val": "NewBody",
      "offset": 41
    },
    {
      "val": "_deleteme",
      "offset": 60
    }
  ],
  "location": "CreateArticle_Definitions.user_enters_title_and_body_and_tags(String,String,String)"
});
formatter.result({
  "duration": 936339478,
  "status": "passed"
});
formatter.match({
  "location": "CreateArticle_Definitions.user_closes_browser()"
});
formatter.result({
  "duration": 226710003,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "Free CRM Login Test Scenario",
  "description": "",
  "id": "create-a-new-article;free-crm-login-test-scenario;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "User is on home page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "title of home page is correct",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user clicks on LoginLink",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user enters username \"UnityAdmin\" and password \"UnityAdmin@2017\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user clicks new article link",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user enters title \"NewArticle2\" and body \"NewBody2\" and tags \"_deleteme\"",
  "matchedColumns": [
    2,
    3,
    4
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "user closes browser",
  "keyword": "Then "
});
formatter.match({
  "location": "CreateArticle_Definitions.user_is_on_home_page()"
});
formatter.result({
  "duration": 5528318542,
  "status": "passed"
});
formatter.match({
  "location": "CreateArticle_Definitions.title_of_home_page_is_correct()"
});
formatter.result({
  "duration": 7848185,
  "status": "passed"
});
formatter.match({
  "location": "CreateArticle_Definitions.user_clicks_on_LoginLink()"
});
formatter.result({
  "duration": 1834127287,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "UnityAdmin",
      "offset": 22
    },
    {
      "val": "UnityAdmin@2017",
      "offset": 48
    }
  ],
  "location": "CreateArticle_Definitions.user_enters_username_and_password(String,String)"
});
formatter.result({
  "duration": 2258373211,
  "status": "passed"
});
formatter.match({
  "location": "CreateArticle_Definitions.user_clicks_new_article_link()"
});
formatter.result({
  "duration": 2797054210,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "NewArticle2",
      "offset": 19
    },
    {
      "val": "NewBody2",
      "offset": 42
    },
    {
      "val": "_deleteme",
      "offset": 62
    }
  ],
  "location": "CreateArticle_Definitions.user_enters_title_and_body_and_tags(String,String,String)"
});
formatter.result({
  "duration": 920654399,
  "status": "passed"
});
formatter.match({
  "location": "CreateArticle_Definitions.user_closes_browser()"
});
formatter.result({
  "duration": 209642305,
  "status": "passed"
});
formatter.scenario({
  "line": 18,
  "name": "Free CRM Login Test Scenario",
  "description": "",
  "id": "create-a-new-article;free-crm-login-test-scenario;;4",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "User is on home page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "title of home page is correct",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user clicks on LoginLink",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user enters username \"UnityAdmin\" and password \"UnityAdmin@2017\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user clicks new article link",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user enters title \"NewArticle3\" and body \"NewBody3\" and tags \"_deleteme\"",
  "matchedColumns": [
    2,
    3,
    4
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "user closes browser",
  "keyword": "Then "
});
formatter.match({
  "location": "CreateArticle_Definitions.user_is_on_home_page()"
});
formatter.result({
  "duration": 5384780721,
  "status": "passed"
});
formatter.match({
  "location": "CreateArticle_Definitions.title_of_home_page_is_correct()"
});
formatter.result({
  "duration": 8184859,
  "status": "passed"
});
formatter.match({
  "location": "CreateArticle_Definitions.user_clicks_on_LoginLink()"
});
formatter.result({
  "duration": 2114102508,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "UnityAdmin",
      "offset": 22
    },
    {
      "val": "UnityAdmin@2017",
      "offset": 48
    }
  ],
  "location": "CreateArticle_Definitions.user_enters_username_and_password(String,String)"
});
formatter.result({
  "duration": 2362804571,
  "status": "passed"
});
formatter.match({
  "location": "CreateArticle_Definitions.user_clicks_new_article_link()"
});
formatter.result({
  "duration": 3025316195,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "NewArticle3",
      "offset": 19
    },
    {
      "val": "NewBody3",
      "offset": 42
    },
    {
      "val": "_deleteme",
      "offset": 62
    }
  ],
  "location": "CreateArticle_Definitions.user_enters_title_and_body_and_tags(String,String,String)"
});
formatter.result({
  "duration": 925122506,
  "status": "passed"
});
formatter.match({
  "location": "CreateArticle_Definitions.user_closes_browser()"
});
formatter.result({
  "duration": 151028804,
  "status": "passed"
});
formatter.scenario({
  "line": 19,
  "name": "Free CRM Login Test Scenario",
  "description": "",
  "id": "create-a-new-article;free-crm-login-test-scenario;;5",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "User is on home page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "title of home page is correct",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user clicks on LoginLink",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user enters username \"UnityAdmin\" and password \"UnityAdmin@2017\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user clicks new article link",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user enters title \"NewArticle4\" and body \"NewBody4\" and tags \"_deleteme\"",
  "matchedColumns": [
    2,
    3,
    4
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "user closes browser",
  "keyword": "Then "
});
formatter.match({
  "location": "CreateArticle_Definitions.user_is_on_home_page()"
});
formatter.result({
  "duration": 6495791069,
  "status": "passed"
});
formatter.match({
  "location": "CreateArticle_Definitions.title_of_home_page_is_correct()"
});
formatter.result({
  "duration": 7606458,
  "status": "passed"
});
formatter.match({
  "location": "CreateArticle_Definitions.user_clicks_on_LoginLink()"
});
formatter.result({
  "duration": 1817378300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "UnityAdmin",
      "offset": 22
    },
    {
      "val": "UnityAdmin@2017",
      "offset": 48
    }
  ],
  "location": "CreateArticle_Definitions.user_enters_username_and_password(String,String)"
});
formatter.result({
  "duration": 2235807369,
  "status": "passed"
});
formatter.match({
  "location": "CreateArticle_Definitions.user_clicks_new_article_link()"
});
formatter.result({
  "duration": 3281004744,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "NewArticle4",
      "offset": 19
    },
    {
      "val": "NewBody4",
      "offset": 42
    },
    {
      "val": "_deleteme",
      "offset": 62
    }
  ],
  "location": "CreateArticle_Definitions.user_enters_title_and_body_and_tags(String,String,String)"
});
formatter.result({
  "duration": 912893974,
  "status": "passed"
});
formatter.match({
  "location": "CreateArticle_Definitions.user_closes_browser()"
});
formatter.result({
  "duration": 185236564,
  "status": "passed"
});
});