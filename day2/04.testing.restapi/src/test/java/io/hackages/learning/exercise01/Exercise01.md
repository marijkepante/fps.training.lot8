# Exercise 01

## Description 
> In this section, the goal is to explore GET endpoints using query parameter

## The REST API Documentation
[API endpoint](https://restcountries.eu/#api-endpoints)

## Instructions 
* Following the format of `test_using_query_parameter_example`, 
create a test using the endpoint `/region/oceania`
   * Apply the filter with value `timezones;area;regionalBlocs`
   * Assert that response `statusCode` is 200   
   * Use `assertThat` with different fields in the response object