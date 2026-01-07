public class Dessert {

    public static  int counts = 0;

    int flavor;
    int price;

    public Dessert(int f, int p){
        this.flavor = f;
        this.price = p;
        counts += 1;
    }

    public void printDessert(){
        System.out.println(this.flavor+" "+this.price+" "+counts);
    }

    public static void main(String[] args){
        System.out.println("I love dessert!");
    }

}
