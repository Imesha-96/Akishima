package pac.zoo.animal;

public class Gorilla extends AbstractAnimal{
    
    public Gorilla(String name){
        super(name);
    }

    @Override
    public void eat(){
        System.out.println("ゴリラの"+getName()+"はバナナをもぐもぐ食べます。");
    }
}