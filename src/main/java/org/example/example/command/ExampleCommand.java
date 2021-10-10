package org.example.example.command;

import co.aikar.commands.BaseCommand;
import co.aikar.commands.annotation.*;
import org.bukkit.entity.Player;
import org.example.example.ExamplePlugin;

@CommandAlias("example")
public class ExampleCommand extends BaseCommand {

    /*
     * Adventure Minimessage Docs -> https://docs.adventure.kyori.net/minimessage
     * ACF-Paper Docs -> https://github.com/aikar/commands/wiki
     */


    @Default
    @HelpCommand
    @CommandPermission("example.test")
    public void execute(Player player) {
        player.sendMessage(ExamplePlugin.getInstance().getMinimessage().parse("<red>This is cool"));
        player.sendMessage(ExamplePlugin.getInstance().getMinimessage().parse("<red>/example player"));
        player.sendMessage(ExamplePlugin.getInstance().getMinimessage().parse("<red>/example self"));
    }

    @Subcommand("player")
    @CommandCompletion("@players")
    public void executeSubPlayerCommand(Player player, Player target) {
        target.sendMessage(ExamplePlugin.getInstance().getMinimessage().parse("<color:#FF5555>This is a <color:#55FF55>test!"));
    }

    @Subcommand("self")
    public void executeSubSelfCommand(Player player) {
        player.sendMessage(ExamplePlugin.getInstance().getMinimessage().parse("<hover:show_text:'<red>test'>TEST"));
    }

}
