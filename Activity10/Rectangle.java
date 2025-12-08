class Rectangle{
    
    //Access only through Parameterized constructor or getters and setters
    private int width;
    private int height;
    
    //Default Constructor
    Rectangle(){
        width = 1;
        height =1;
    }
    
    //Parameterized Constructor
    Rectangle(int width, int height){
        this.width = width;
        this.height = height;
    }
    
    //getter for width
    
    public int getWidth(){
        return width;
    }
    
    //getter for height
    public int getHeight(){
        return height;
    }
    
    //setter for width
    public void setWidth(int width) throws NegativeValueException{
        if(width <0){
            throw new NegativeValueException();
            
        }else{
            this.width = width;
        }
        
    }
    
    //setter for height
    
    public void setHeight(int height) throws NegativeValueException{
         if(height <0){
            throw new NegativeValueException();
        } else {
        
        this.height = height;
        }
    }
    
    //Perimeter
    public int calculatePerimeter(){
        return height+width;   
    }
    
    @Override
    public String toString(){
        return "[Height of Rectangle:"+ height+"\tWidth of Rectangle:"+width+"]";
    }
    
    
}