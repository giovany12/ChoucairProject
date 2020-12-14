#Autor: Geovany Oquendo Murillo
  @stories
  Feature: Academy choucair
    As a user, I want to learn how to automate in screenplay at the Choucair Academy with the automation course
    @scenario1
    Scenario Outline: Search for the automation course
      Given than Geovany wants to learn automation at the academy choucair
        | strUser   | strPassword   |
        | <strUser> | <strPassword> |
      When he search for the course on the choucair academy platform
        | strCourse   |
        | <strCourse> |
      Then he finds the course called
        | strCourseQuestion   |
        | <strCourseQuestion> |

      Examples:
        | strUser    | strPassword   | strCourse                      | strCourseQuestion            |
        | 1214715696 | Choucair2020* | "ISTQB Agile Tester Extension" | ISTQB Agile Tester Extension |

