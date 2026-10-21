public class Class123{
    public static void main(String[] args){
        Son S1 = new Son();
        S1.bike();
    }
}

class grandFather{
    int sbi=1000;
    void bike(){
        System.out.println("Bike from Grand father");
    }
}
class Father extends grandFather{
    int sbi=1000;
    void bike(){
        System.out.println("Bike from father");
        super.bike();
    }
}

class Son extends Father{
    int hdfc=100;
    void oldCycle(){
        System.out.println("oldCycle from son");
    }
    void bike(){
        System.out.println("Bike from Son");
        super.bike();
    }
}
