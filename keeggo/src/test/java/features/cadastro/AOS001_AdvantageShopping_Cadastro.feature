@KEEGGO @AOS 
Feature: AOS001_AdvantageShopping_Cadastro
	Acesso o site do Advantage Online Shopping
	Realizo um cadastro de um novo usuario

Background: 
	Given acesso o site da Advantage Online Shopping
	When valido se estou na Home Page
	And clico no menu de usuario
	
@AOS001 @CADASTRO
Scenario Outline: AOS001_AdvantageShopping_Cadastro
	
	And clico em "<btnnovaconta>" por texto
	And preecho detalhes da conta com usuario e senha randomicamente e com email "<email>"
	And preecho dados pessoais com nome completo e numero de telefone randomico
	And preecho endereco com "<localidade>" e com os outros campos randomico
	And aceito os termos e condicoes do cadastro
	And clico em "<btnregistrar>" por texto
	Then valido a criacao da nova conta

Examples:
	| btnnovaconta		 | email 			| localidade | btnregistrar |
	| CREATE NEW ACCOUNT | keeggo@teste.com	| Brazil	 | REGISTER     |