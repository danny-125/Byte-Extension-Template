# Byte Extension Template
 Template for custom Byte Utility Mod extensions

# Usage
- Step 1: Clone this repository
- Step 2: Create modules or commands and add register them in an extension
- Step 3: Build & put into your mods folder
- Step 4: You're done, you have successfully added custom modules and commands to Byte

# Important Information
- You may need to put the latest version of byte into the depend folder (this example uses version 0.4)
- You may need to reconfigure the classpath (Add it to client)
- You may need to run buildDependents with gradle (do this if you're getting an error that says Class not found)
- You may need to configure build.gradle if you need to change the name of the jar
- You need to add byte to the mods folder in the run folder in order to test your modules / commands
- You should probably make the modules and commands in client rather than main

# Useful Information
- You can create your own events by extending the Event class and firing it with Initialize.onEvent(Event e) (Do this with mixins)