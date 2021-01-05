
Feature: People Feature (Endpoint: https://swapi.dev/people/1)

   Scenario: Valid call to the end shall return a valid name
       Given Prepare endpoint and API call to make a request 
       When Make a call using the endpoint (Do some Action)
       Then Verify the response for "name": "Luke Skywalker"

    Scenario:  Valid call to the end shall return a status code 200
        Given  Prepare endpoint and API call to make a request
        When Make a call using the endpoint 
        Then Verify the response for Status Code 200

    Scenario:  Valid call to the endpoint shall return a list of 4 film URL
        Given Prepare endpoint and API call to make a request
        When Make a call using the endpoint 
        Then Verify the response for a list of 4 film URL
        
    Scenario:  Valid call to the endpoint shall return a Header element named Content/Type: application/json
        Given Prepare endpoint and API call to make a request
        When Make a call using the endpoint 
        Then Verify the response header for Content/Type: application/json

