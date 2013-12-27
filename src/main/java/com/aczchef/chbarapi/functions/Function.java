/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.aczchef.chbarapi.functions;

import com.laytonsmith.PureUtilities.Version;
import com.laytonsmith.annotations.api;
import com.laytonsmith.core.CHVersion;
import com.laytonsmith.core.constructs.Construct;
import com.laytonsmith.core.constructs.Target;
import com.laytonsmith.core.environments.Environment;
import com.laytonsmith.core.exceptions.ConfigRuntimeException;
import com.laytonsmith.core.functions.AbstractFunction;
import com.laytonsmith.core.functions.Exceptions;

/**
 *
 * @author cgallarno
 */
public class Function {
    
    @api
    public static class set_bar_message extends AbstractFunction {

	public Exceptions.ExceptionType[] thrown() {
	    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	public boolean isRestricted() {
	    return true;
	}

	public Boolean runAsync() {
	    return false;
	}

	public Construct exec(Target t, Environment environment, Construct... args) throws ConfigRuntimeException {
	    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	public String getName() {
	    return "set_bar_message";
	}

	public Integer[] numArgs() {
	    return new Integer[] {1, 2, 3};
	}

	public String docs() {
	    return "";
	}

	public Version since() {
	    return CHVersion.V3_3_1;
	}
	
    }
    
    @api
    public static class set_timed_bar_message extends AbstractFunction {

	public Exceptions.ExceptionType[] thrown() {
	    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	public boolean isRestricted() {
	    return true;
	}

	public Boolean runAsync() {
	    return false;
	}

	public Construct exec(Target t, Environment environment, Construct... args) throws ConfigRuntimeException {
	    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	public String getName() {
	    return "bar_timed_set_message";
	}

	public Integer[] numArgs() {
	    return new Integer[] {2, 3};
	}

	public String docs() {
	    return "";
	}

	public Version since() {
	    return CHVersion.V3_3_1;
	}
	
    }
    
    @api
    public static class phas_bar extends AbstractFunction {

	public Exceptions.ExceptionType[] thrown() {
	    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	public boolean isRestricted() {
	    return true;
	}

	public Boolean runAsync() {
	    return false;
	}

	public Construct exec(Target t, Environment environment, Construct... args) throws ConfigRuntimeException {
	    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	public String getName() {
	    return "phas_bar";
	}

	public Integer[] numArgs() {
	    return new Integer[] {0, 1};
	}

	public String docs() {
	    return "";
	}

	public Version since() {
	    return CHVersion.V3_3_1;
	}
	
    }
    
    @api
    public static class premove_bar extends AbstractFunction {

	public Exceptions.ExceptionType[] thrown() {
	    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	public boolean isRestricted() {
	    return true;
	}

	public Boolean runAsync() {
	    return false;
	}

	public Construct exec(Target t, Environment environment, Construct... args) throws ConfigRuntimeException {
	    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	public String getName() {
	    return "premove_bar";
	}

	public Integer[] numArgs() {
	    return new Integer[] {0, 1};
	}

	public String docs() {
	    return "";
	}

	public Version since() {
	    return CHVersion.V3_3_1;
	}
	
    }
    
    @api
    public static class set_bar_health extends AbstractFunction {

	public Exceptions.ExceptionType[] thrown() {
	    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	public boolean isRestricted() {
	    return true;
	}

	public Boolean runAsync() {
	    return false;
	}

	public Construct exec(Target t, Environment environment, Construct... args) throws ConfigRuntimeException {
	    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	public String getName() {
	    return "set_bar_health";
	}

	public Integer[] numArgs() {
	    return new Integer[] {1, 2};
	}

	public String docs() {
	    return "";
	}

	public Version since() {
	    return CHVersion.V3_3_1;
	}
	
    }
    
}
