

class Main{
    
    public static void main(String args[]){
        
        Animal animal1 = new Animal();
        
        animal1.setAnimalName("Simba");
        System.out.printf("Animal name: %s\n",animal1.getAnimalName() );
        
        Cat cat1 = new Cat();
        cat1.setBreed("Lion");
        
        
        System.out.println("Cat breed: "+ cat1.getBreed());
        cat1.setAnimalName("Simba");
        System.out.printf("Cat Name: %s",cat1.getAnimalName());
        
        
        
    }
}