package com.example.modules;

import me.danny125.byteutilitymod.event.Event;
import me.danny125.byteutilitymod.event.JoinWorldEvent;
import me.danny125.byteutilitymod.event.TickEvent;
import me.danny125.byteutilitymod.modules.Module;
import me.danny125.byteutilitymod.settings.BooleanSetting;
import me.danny125.byteutilitymod.settings.ModeSetting;
import me.danny125.byteutilitymod.settings.NumberSetting;
import net.minecraft.client.MinecraftClient;
import net.minecraft.text.Text;

public class ExampleModule extends Module {
    // EXAMPLE MODULE FOR BYTE EXTENSION
    // This should give you everything you need to make an extension

    // Values for BooleanSetting
    String BooleanSettingName = "BooleanSetting";
    Boolean DefaultBooleanSetting = false;
    // End of values for BooleanSetting

    // Values for NumberSetting
    String NumberSettingName = "NumberSetting";
    double DefaultValue = 50.0;
    double Minimum = 0.0;
    double Maximum = 100.0;
    double Increment = 5.0;
    String Units = "blocks";
    //End of values for NumberSetting

    //Values For ModeSetting
    String ModeSettingName = "Mode";
    String DefaultMode = "Mode1";
    String[] modes = {"Mode1","Mode2"};


    public BooleanSetting booleanSetting = new BooleanSetting("BooleanSetting",false);
    public NumberSetting numberSetting = new NumberSetting(NumberSettingName,DefaultValue,Minimum,Maximum,Increment,Units);
    public ModeSetting modeSetting = new ModeSetting(ModeSettingName,DefaultMode,modes);

    public ExampleModule() {
        //String modulename, int keybind, CATEGORY category, Boolean EnableOnStart
        super("ExampleModule",0,CATEGORY.MISCELLANEOUS,false);
        // Add settings to module
        this.addSettings(booleanSetting,numberSetting,modeSetting);
    }

    @Override
    public void onEnable() {
        super.onEnable();
        //This code will run when the module is toggled
        MinecraftClient.getInstance().player.sendMessage(Text.literal("ExampleModule enabled"));
    }
    @Override
    public void onDisable() {
        super.onDisable();
        //This code will run when the module is disabled
        MinecraftClient.getInstance().player.sendMessage(Text.literal("ExampleModule disabled"));
    }

    @Override
    public void onEvent(Event e) {
        super.onEvent(e);
        //This code will run everytime an event is fired
        if(e instanceof TickEvent){ // Check if the event is a certain type of event
            System.out.println("TickEvent has been fired");
        }
        if(e instanceof JoinWorldEvent){ // Run different code if the event is a different type of event
            System.out.println("JoinWorldEvent has been fired");
        }
    }
}
