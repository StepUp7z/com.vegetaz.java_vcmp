package com.vegetaz.vcmp.commands;

import static com.vegetaz.vcmp.controllers.MainController.server;

import com.maxorator.vcmp.java.plugin.integration.generic.Colour;
import com.maxorator.vcmp.java.plugin.integration.player.Player;
import com.maxorator.vcmp.java.tools.commands.Command;
import com.maxorator.vcmp.java.tools.commands.CommandController;



public class OpenCommands implements CommandController {

    private final static Colour RESPONSE_COLOUR = new Colour(200, 255, 200);

    public OpenCommands() {
    }

    @Override
    public boolean checkAccess(Player player) {
        return true;
    }

    

    @Command(usage = "<password>")
    public void login(Player player, final String password) {
        server.sendClientMessage(player, RESPONSE_COLOUR, "You have used the /login command");
        
    }

    @Command
    public void rules(Player player) {
    }
	
	
	@Command
    public void test(Player player) {
		server.sendClientMessage(player, RESPONSE_COLOUR, "test command: ");
    }

   

}
