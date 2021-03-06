package io.github.wrywolfy.rpplus.commands.networks;

import io.github.wrywolfy.rpplus.RolePlayPlus;
import org.spongepowered.api.command.CommandException;
import org.spongepowered.api.command.CommandResult;
import org.spongepowered.api.command.CommandSource;
import org.spongepowered.api.command.args.CommandContext;
import org.spongepowered.api.command.spec.CommandExecutor;
import org.spongepowered.api.entity.living.player.Player;

import static io.github.wrywolfy.rpplus.UtilityMethods.rppLog;

public class CommandSetPos1 implements CommandExecutor
{
    private RolePlayPlus plugin;
    public CommandSetPos1(RolePlayPlus plugin)
    {
        this.plugin = plugin;
    }
    @Override
    public CommandResult execute(CommandSource src, CommandContext args) throws CommandException
    {
        if (src instanceof Player)
        {
            Player player = (Player) src;
            plugin.getNetworks().setPos1(player.getLocation().getPosition());
            player.sendMessage(rppLog("Position 1 set ..."));
            return CommandResult.success();
        }
        return CommandResult.empty();
    }
}
