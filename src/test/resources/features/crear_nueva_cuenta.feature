#Autor: adbatis.bancolombia.com.co
  #language:en

@stories
Feature: Adrian
  As a user I want to create an account on Utest

  @scenario1
  Scenario: Successful registration

    Given that the user is on the page
    When the user enter their information
      |firstname  | lastname |          email             | month | day  | year  | mobile  |  model        | operatingsystem    |
      |jUANCHO    | Batista  | abatistaa@ufpso.edu.co     | July  | 26   | 1996  | Xiaomi  | Redmi Note 9  |     Android    10  |

    Then the user will see his profile