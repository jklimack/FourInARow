# FourInARow

Simple state-based game simulator used to implement Four in a Row (Connect Four). 

The Runner class is the main game controller, which moves the game between states, determines which players turn it is to perform actions, etc. 

Player and Environment are interfaces which are used in the Runner, allowing alternative games to be easily implemented using the same game controller. Players can be implemented as either NPC's or human players. 

BasePlayer is an implementation of the Player interface, where the actions at each stage are determined randomly (there is no decision making process). 

ConnectFour is an implementation of the Environment interface, which is used to determine the state of the game at any given time. 
