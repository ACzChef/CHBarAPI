package com.aczchef.chbarapi.functions;

import com.laytonsmith.PureUtilities.Version;
import com.laytonsmith.abstraction.MCPlayer;
import com.laytonsmith.abstraction.bukkit.BukkitMCPlayer;
import com.laytonsmith.annotations.api;
import com.laytonsmith.core.CHVersion;
import com.laytonsmith.core.Static;
import com.laytonsmith.core.constructs.CBoolean;
import com.laytonsmith.core.constructs.CVoid;
import com.laytonsmith.core.constructs.Construct;
import com.laytonsmith.core.constructs.Target;
import com.laytonsmith.core.environments.CommandHelperEnvironment;
import com.laytonsmith.core.environments.Environment;
import com.laytonsmith.core.exceptions.ConfigRuntimeException;
import com.laytonsmith.core.functions.AbstractFunction;
import com.laytonsmith.core.functions.Exceptions;
import com.laytonsmith.core.functions.Exceptions.ExceptionType;
import me.confuser.barapi.BarAPI;

/**
 *
 * @author cgallarno
 */
public class Function {
    
    @api
    public static class set_bar_message extends AbstractFunction {

	public Exceptions.ExceptionType[] thrown() {
	    return new Exceptions.ExceptionType[] {ExceptionType.CastException, ExceptionType.PlayerOfflineException, ExceptionType.RangeException};
	}

	public boolean isRestricted() {
	    return true;
	}

	public Boolean runAsync() {
	    return false;
	}

	public Construct exec(Target t, Environment environment, Construct... args) throws ConfigRuntimeException {
	    MCPlayer p = environment.getEnv(CommandHelperEnvironment.class).GetPlayer();
	    String message = "";
	    Float percent = 100F;
	    switch(args.length) {
		case 3:
		    p = Static.GetPlayer(args[0].val(), t);
		    message = args[1].val();
		    percent = Static.getDouble32(args[2], t);
		    break;
		case 2:
		    p = Static.GetPlayer(args[0].val(), t);
		    message = args[1].val();
		    break;
		case 1:
		    message = args[0].val();
		    break;
	    }
	    BarAPI.setMessage(((BukkitMCPlayer)p)._Player(), message, percent);
	    return new CVoid(t);
	}

	public String getName() {
	    return "set_bar_message";
	}

	public Integer[] numArgs() {
	    return new Integer[] {1, 2, 3};
	}

	public String docs() {
	    return "void {[player] message | player message [percent]} Sets a boss bar with a message for the given player. If no player is given it defaults to the running player. " + 
		    "Percent can be set to speify how much to fill up the bar from 0 - 100.";
	}

	public Version since() {
	    return CHVersion.V3_3_1;
	}
	
    }
    
    @api
    public static class set_timed_bar_message extends AbstractFunction {

	public Exceptions.ExceptionType[] thrown() {
	    return new Exceptions.ExceptionType[] {ExceptionType.CastException, ExceptionType.PlayerOfflineException};
	}

	public boolean isRestricted() {
	    return true;
	}

	public Boolean runAsync() {
	    return false;
	}

	public Construct exec(Target t, Environment environment, Construct... args) throws ConfigRuntimeException {
	    MCPlayer p = environment.getEnv(CommandHelperEnvironment.class).GetPlayer();
	    String message = "";
	    int seconds = 1;
	    switch(args.length) {
		case 3:
		    p = Static.GetPlayer(args[0].val(), t);
		    message = args[1].val();
		    seconds = Static.getInt32(args[2], t);
		    break;
		case 2:
		    message = args[0].val();
		    seconds = Static.getInt32(args[1], t);
		    break;
	    }
	    BarAPI.setMessage(((BukkitMCPlayer)p)._Player(), message, seconds);
	    return new CVoid(t);
	}

	public String getName() {
	    return "set_timed_bar_message";
	}

	public Integer[] numArgs() {
	    return new Integer[] {2, 3};
	}

	public String docs() {
	    return "void {[player] message seconds} Sets a boss bar with a message for the given player. If no player is given it defaults to the running player. " +
"		     Seconds will show the message for that many seconds with the bar decreasing as the time runs out.";
	}

	public Version since() {
	    return CHVersion.V3_3_1;
	}
	
    }
    
    @api
    public static class phas_bar extends AbstractFunction {

	public Exceptions.ExceptionType[] thrown() {
	    return new Exceptions.ExceptionType[] {ExceptionType.PlayerOfflineException};
	}

	public boolean isRestricted() {
	    return true;
	}

	public Boolean runAsync() {
	    return false;
	}

	public Construct exec(Target t, Environment environment, Construct... args) throws ConfigRuntimeException {
	    MCPlayer p = environment.getEnv(CommandHelperEnvironment.class).GetPlayer();
	    if (args.length == 1) {
		p = Static.GetPlayer(args[0].val(), t);
	    }
	    
	    return new CBoolean(BarAPI.hasBar(((BukkitMCPlayer)p)._Player()), t);
	}

	public String getName() {
	    return "phas_bar";
	}

	public Integer[] numArgs() {
	    return new Integer[] {0, 1};
	}

	public String docs() {
	    return "boolean {[player]} Returns whether the specified player has a boss bar set. If no player is given it defaults to the running player.";
	}

	public Version since() {
	    return CHVersion.V3_3_1;
	}
	
    }
    
    @api
    public static class premove_bar extends AbstractFunction {

	public Exceptions.ExceptionType[] thrown() {
	    return new Exceptions.ExceptionType[] {ExceptionType.PlayerOfflineException};
	}

	public boolean isRestricted() {
	    return true;
	}

	public Boolean runAsync() {
	    return false;
	}

	public Construct exec(Target t, Environment environment, Construct... args) throws ConfigRuntimeException {
	    MCPlayer p = environment.getEnv(CommandHelperEnvironment.class).GetPlayer();
	    if (args.length == 1) {
		p = Static.GetPlayer(args[0].val(), t);
	    }
	    
	    BarAPI.removeBar(((BukkitMCPlayer)p)._Player());
	    return new CVoid(t);
	}

	public String getName() {
	    return "premove_bar";
	}

	public Integer[] numArgs() {
	    return new Integer[] {0, 1};
	}

	public String docs() {
	    return "void {[player]} Removes the boss bar from the given player. If no player is given it defaults to the running player.";
	}

	public Version since() {
	    return CHVersion.V3_3_1;
	}
	
    }
    
    @api
    public static class set_bar_health extends AbstractFunction {

	public Exceptions.ExceptionType[] thrown() {
	    return new Exceptions.ExceptionType[] {ExceptionType.CastException, ExceptionType.PlayerOfflineException, ExceptionType.RangeException};
	}

	public boolean isRestricted() {
	    return true;
	}

	public Boolean runAsync() {
	    return false;
	}

	public Construct exec(Target t, Environment environment, Construct... args) throws ConfigRuntimeException {
	    MCPlayer p = environment.getEnv(CommandHelperEnvironment.class).GetPlayer();
	    float percent = 100F;
	    if (args.length == 2) {
		p = Static.GetPlayer(args[0].val(), t);
		percent = Static.getDouble32(args[1], t);
	    } else {
		percent = Static.getDouble32(args[0], t);
	    }
	    BarAPI.setHealth(((BukkitMCPlayer)p)._Player(), percent);
	    return new CVoid(t);
	}

	public String getName() {
	    return "set_bar_health";
	}

	public Integer[] numArgs() {
	    return new Integer[] {1, 2};
	}

	public String docs() {
	    return "void {[player] percent} Sets the health of the boss bar for the given player. If no player is given it defaults to the running player. " +
		    "Percent should be between 0-100";
	}

	public Version since() {
	    return CHVersion.V3_3_1;
	}
	
    }
    
}
