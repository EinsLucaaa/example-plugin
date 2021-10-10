package org.example.example;

import co.aikar.commands.PaperCommandManager;
import lombok.Getter;
import net.kyori.adventure.text.minimessage.MiniMessage;
import net.kyori.adventure.text.minimessage.transformation.TransformationType;
import org.bukkit.plugin.java.JavaPlugin;
import org.example.example.command.ExampleCommand;

/*
 * In this test plugin, the ACF paper and adventure framework is briefly presented or demostrated.
 */

@Getter
public class ExamplePlugin extends JavaPlugin {

    public static ExamplePlugin instance;
    private PaperCommandManager manager;

    @Override
    public void onEnable() {
        instance = this;

        manager = new PaperCommandManager(this);
        manager.registerCommand(new ExampleCommand());

    }

    @Override
    public void onDisable() {

    }

    public static ExamplePlugin getInstance() {
        return instance;
    }

    public final MiniMessage minimessage = MiniMessage.builder()
            .removeDefaultTransformations()
            .transformation(TransformationType.COLOR)
            .transformation(TransformationType.DECORATION)
            .transformation(TransformationType.RAINBOW)
            .transformation(TransformationType.GRADIENT)
            .transformation(TransformationType.CLICK_EVENT)
            .transformation(TransformationType.HOVER_EVENT)
            .build();;


}
