@KEEGGO @AOS 
Feature: AOS002_AdvantageShopping_Login
	Acesso o site do Advantage Online Shopping
	Para realizar um login

Background: 
	Given acesso o site da Advantage Online Shopping
	When valido se estou na Home Page
	And clico no menu de usuario
	
@AOS002 @LOGIN
Scenario Outline: AOS002_AdvantageShopping_Login
	
	And preecho o "<usuario>" e "<senha>"
	And clico em login
	Then valido o login com o "<usuario>"

Examples:
	| usuario    | senha      |
	| KEEGGO4748 | 4748Keeggo |