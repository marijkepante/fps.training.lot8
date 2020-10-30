# Exercise 02

## Description 
> In this section, the goal is to explore POST endpoints

## The REST API Documentation
[API endpoint](https://myfakeapi.com/)

## JSON escape 
For JSON [escape](https://www.freeformatter.com/json-escape.html)

## Instructions 

* Following the example of `test_contact_example`
* Start your own REST API with `json-server` (from npm) via the command `json-server --watch src/test/resources/data.json`
* Create a new test scenario following these steps
   * Fetch a record from the endpoint `catFacts` using an `id`
   * Delete that record
   * Fetch the previous record and match the status code
* Create a new test scenario following these steps
   * Fetch a record from the endpoint `catFacts` using an `id`
   * Update that record
   * Fetch the updated record 
   * Assert the changes made