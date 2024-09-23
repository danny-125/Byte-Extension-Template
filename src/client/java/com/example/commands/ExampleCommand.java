package com.example.commands;

import me.danny125.byteutilitymod.commands.Command;
import net.minecraft.client.MinecraftClient;
import net.minecraft.text.Text;

public class ExampleCommand extends Command {
    public ExampleCommand() {
        super("example","Byte Utility Mod extension command example","#example");
    }

    @Override
    public void runCommand(String msg) {
        super.runCommand(msg);
        MinecraftClient.getInstance().player.sendMessage(Text.literal("Hello World!"));
    }
}
