class NegativeValueException extends RuntimeException{
    
    NegativeValueException(){
        super();
    }
    
    NegativeValueException(String message){
        super(message);
    }
    
}