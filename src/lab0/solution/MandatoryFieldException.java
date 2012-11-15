package lab0.solution;

import lab0.*;

/**
 *
 * @author rbath1
 */
public class MandatoryFieldException extends IllegalArgumentException {
    private static String MSG = "Field is required";
    
    public MandatoryFieldException(){
        super();
    }
    public MandatoryFieldException(String msg){
        super(MSG);
    }
    @Override
    public String getMessage(){
        return MSG;
    }
    @Override
    public String getLocalizedMessage(){
        return MSG;
    }
    @Override
    public String toString(){
        return MSG;
    }
}
