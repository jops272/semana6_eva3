Feature: Realizacion de casos ingresando nombre de usuario y contraseña
Scenario: verificacion de ingreso de sesion
Given Abrir Chrome
When ingresar Username "user" y Password "user"
Then inicia sesion
