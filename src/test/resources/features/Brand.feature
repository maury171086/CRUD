
Feature: Crear, Editar Brand

  Background: Brand page is loaded
    Given 'Brand' page is loaded


  Scenario Outline : Crear Brand
    And click on 'new brand' button in 'Brand' page' page
    And insert "<BrandName>" brand name field in 'Dialog Brand' page
    And click on 'save' button in 'Dialog Brand' page
    Examples:
      | BrandName |
      | brand1111 |

   Scenario Outline: Editar Brand
     And click on 'edit brand' button in 'Brand' page
     And insert "<BrandName>" brand name field in 'Dialog Brand' page
     And click on 'save' button in 'Edit Dialog Brand' page
     Then verify "<BrandNameUpdated>" brand is displayed in 'Brand' page
     Examples:
      | BrandName |
      | brand2222    |







