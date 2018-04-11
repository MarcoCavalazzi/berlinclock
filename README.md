# The Berlin Clock

The Berlin Clock is a rather strange way to show the time. On the top of the clock there is a YELLOW lamp that
blinks on/off every two seconds. The time is calculated by adding rectangular lamps.
 
The top two rows of lamps are RED. These indicate the hours of a day. In the top row there are 4 RED lamps. Every lamp represents 5 hours. 
In the lower row of RED lamps every lamp represents 1 hour. 
So if two lamps of the first row and three of the second row are switched on that indicates 5+5+3=13h or 1 pm.
 
The two rows of lamps at the bottom count the minutes. 
The first of these rows has 11 lamps, the second 4. 
In the first row every lamp represents 5 minutes. 
In this first row the 3rd, 6th and 9th lamp are RED and indicate the first quarter, half and last quarter of an hour. The other lamps are YELLOW. In the last row with 4 lamps every lamp represents 1 minute.

## Exercise instructions
There's number of acceptance tests for the Berlin Clock and your challenge is to get them passing.

You can run the unit test using:

`mvn test-compile failsafe:integration-test failsafe:verify`

## Exercise requirements
JDK 8

Maven
