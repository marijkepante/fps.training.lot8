# Spending Kata 

The goal of this Kata is to practice Mocking using Mockito()
Start with the test class by breaking the problem in multiple parts (separation of concerns)

# Instructions
You work at a credit card company and as a value-add they want to start providing alerts to users when their spending in any particular category is higher than usual.

1. A Payment is a simple value object with a price, description, and category
1. A Category is an enumerable type of a collection of things like "entertainment", "restaurants", and "golf"
1. For a given userId, fetch the payments for the current month and the previous month
1. Compare the total amount paid for the each month, grouped by category; filter down to the categories for which the user spent at least 50% more this month than last month
1. Compose an e-mail message to the user that lists the categories for which spending was unusually high, with a subject like "Unusual spending of $1076 detected!" and this body:

Hello card user!

We have detected unusually high spending on your card in these categories:

* You spent $148 on groceries
* You spent $928 on travel

Love,

The Credit Card Company

# Resources 
1. [Mockito and JUnit5](https://www.baeldung.com/mockito-junit-5-extension)
1. Sources forked from [Unusual Spending](https://github.com/testdouble/java-testing-example/tree/master/unusual-spending)
