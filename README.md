# FourInARow

Simple state-based game simulator used to implement Four in a Row (Connect Four). The main purpose of the simulator is to be able to test different player controllers for a state-based game against one another to determine which action selection methods perform the best. Implemented is a BasePlayer where all the actions are determined randomly for any given game state. 

The Runner class is the main game controller, which moves the game between states, determines which players turn it is to perform actions, etc. 

Player and Environment are interfaces which are used in the Runner, allowing alternative games to be easily implemented using the same game controller. Players can be implemented as either NPC's or human players. 

ConnectFour is an implementation of the Environment interface, which is used to determine the state of the game at any given time. 
