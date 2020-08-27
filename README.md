# Bowling_Simulation
A Java Project



In the project, I developed a Java system that displayed a simulation driven by random numbers and manipulation of an array in a game of bowling. For our purposes, the game of bowling consists of throwing a heavy ball down an alley at a set of ten pins. The player bowls ten frames and, except for the tenth frame, has up to two throws per frame. If the player knocks down all ten pins on the first throw, the frame is complete. Otherwise, the player gets one more chance to knock down the remaining pins in that frame. The tenth frame works a little differently, however. The bowler still gets two throws that work the same as in the other frames but if the bowler knocks down all 10 pins, either in the first throw alone or in two throws, then the bowler gets a third throw for that frame. So in frames 1-9, the maximum a bowler can get is 10 pins each. In frame 10, the bowler may get up to 20 pins. Hence, the maximum total score in the bowling game is 110. I wrote methods like displayFrame, updateScore, reset, and playAllGames (that stores the result of each game in an array) etc. to implement the game, in its full form.
