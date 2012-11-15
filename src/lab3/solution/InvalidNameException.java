package lab3.solution;

/**
 *
 * @author Bob
 */
public class InvalidNameException extends IllegalArgumentException {
    
    public InvalidNameException(){    
    }
    
    public InvalidNameException(String msg){
        super(msg);
    }
    
}
