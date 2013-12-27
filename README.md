CHBarAPI
========
# Functions
### boolean phas\_bar([player]):
Returns whether the specified player has a boss bar set. If no player is given it defaults to the running player.

### void premove\_bar([player]):
Removes the boss bar from the given player. If no player is given it defaults to the running player.

### void set\_bar\_health([player] percent):
Sets the health of the boss bar for the given player. If no player is given it defaults to the running player. Percent should be between 0-100

### void set\_bar\_message([player] message | player message [percent]):
Sets a boss bar with a message for the given player. If no player is given it defaults to the running player. Percent can be set to speify how much to fill up the bar from 0 - 100.

### void set\_timed\_bar\_message([player] message seconds):
Sets a boss bar with a message for the given player. If no player is given it defaults to the running player. 		     Seconds will show the message for that many seconds with the bar decreasing as the time runs out.

