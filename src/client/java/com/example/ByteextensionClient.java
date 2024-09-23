package com.example;

import com.example.commands.ExampleCommand;
import com.example.modules.ExampleModule;
import me.danny125.byteutilitymod.Initialize;
import me.danny125.byteutilitymod.commands.Command;
import me.danny125.byteutilitymod.extension.Extension;
import me.danny125.byteutilitymod.modules.Module;
import net.fabricmc.api.ClientModInitializer;

import java.util.concurrent.CopyOnWriteArrayList;

public class ByteextensionClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		System.out.println("Loading ExampleExtension for Byte Utility Mod");
		// Modules and command lists (doesn't have to be multiple and it can be empty if youre not adding modules/commands)
		CopyOnWriteArrayList<Module> modules = new CopyOnWriteArrayList<Module>();
		CopyOnWriteArrayList<Command> commands = new CopyOnWriteArrayList<Command>();

		//add commands / modules to the lists
		modules.add(new ExampleModule());
		commands.add(new ExampleCommand());

		//name and description
		String name = "ExampleExtension";
		String description = "Lorem ipsum dolor sit amet";

		Initialize.registerExtension(new Extension(name,description,modules,commands));
	}
}