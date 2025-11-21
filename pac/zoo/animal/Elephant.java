package pac.zoo.animal;

public class Elephant extends AbstractAnimal{
    
    public Elephant(String name){
        super(name);
    }

    @Override
    public void eat(){
        System.out.println("ゾウの"+getName()+"は草をもしゃもしゃ食べます。");
    }
}