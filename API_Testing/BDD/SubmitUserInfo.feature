https://5x9m5ed0tj.execute-api.us-east-1.amazonaws.com/test/submit

Feature: Submit user info

    Scenario:   Submit user info and validate the userid
    
        Given  Endpoint: https://5x9m5ed0tj.execute-api.us-east-1.amazonaws.com/test/submit
        And Request Type: POST
        And Headers Content-Type=application/json, Authorization=Bearer access_token
        And Body Application/json {
                                    "name" : "Monir",
                                    "id" : "101"               
                                }
        When Make a call to the /test/submit end point 
        Then Verify response looks like below
                {
                    "statusCode": 200,
                    "userName": "101Monir"
                }