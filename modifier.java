/*
 * Comments
 * Famous Foods
 * Indian
 * Arabian
 * Canada
 * USA
 */

package moodifier; /* Package */
import java.util.*; /* Import statements */
class Opps {  /* Main class */
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in); /* Scanner class */
        System.out.println("1.A1 Hotel  2.Kavin Hotel  3.AJ Hotel");
        System.out.println("Choose your hotel");
        int choose = sc.nextInt();
        System.out.println("1.IndianFoods  2.CanadaFoods  3.ArabianFoods  4.USAFoods");
        System.out.println("1.IndianSweets  2.CanadaSweets  3.ArabianSweet  4.USASweets");
        System.out.println("enter your choice");
        int choice = sc.nextInt();
        System.out.println("TIFFEN: Idly Pongal Poori Chapathi Dhosai" +"LUNCH: Briyani Rice CurdRice LemonRice");
        System.out.println("Choose your food");
        int chef = sc.nextInt();
        System.out.println("1.GrandMaster Chef  2.Master Chef  3.Chef");
        System.out.println("choose your chef to cook your food");
        SpecialFoods sp = new SpecialFoods(); /* Object Creation */
        SpecialSweets ss = new SpecialSweets();
        Encapsulation e = new Encapsulation();
        e.orderItem(); /* Method Calling */
        Polymorphism p = new Polymorphism();
        Hote1 h = new Hote1();
        p.work();
        p = new Poly1();
        p.work();
        p = new Poly2();
        p.work();
        switch(choice){ /* switch Case */
            case 1:
                h.A1Hotel();
               sp.indianFood();
               ss.indianSweet();
               break;
            case 2:
                h.KavinHotel();
                sp.canadaFood();
                ss.canadaSweet();
                break;
            case 3:
                h.AjHotel();
                sp.arabianFood();
                ss.arbianSweet();
                break;
            case 4:
                sp.USAFood();
                ss.USASweet();
                break;
            default:
                System.out.println("choose a correct option");
        }
        }
}
abstract class Foods{ /* Abstract class */
    abstract void indianFood();
    abstract void canadaFood();
    abstract void arabianFood();
    abstract void USAFood();
}
class SpecialFoods extends Foods{ /* inheritance */
    void indianFood() {
        System.out.println("Briyani is a special food for indian");
    }
    void canadaFood() {
        System.out.println("Poutine is a special food for canada");
    }
    void arabianFood() {
        System.out.println("shawarma is a special food for arabian");
    }
    void USAFood() {
        System.out.println("cheeseburger is a special food for USA");
    }
}
class SpecialSweets extends SpecialFoods{ /* Inheritance */
    void indianSweet() {
        System.out.println("Gulab jamun is a special sweet for indian");
    }
    void canadaSweet() {
        System.out.println("Butter tarts is a special sweet for canada");
    }
    void arbianSweet() {
        System.out.println("Halva is a special sweet for arabian");
    }
    void USASweet() {
        System.out.println("Cheesecake is a special sweet for USA");
    }
}
class Polymorphism{ /* Polymorphism */
    void work(){
        System.out.println("GrandMaster Chef");
    }
}
class Poly1 extends Polymorphism{
    void work(){
        System.out.println("Master Chef");
    }
}
class Poly2 extends Polymorphism{
    void work(){
        System.out.println("Chef");
    }
}
class Encapsulation { /* Encapsulation */
    Scanner sc = new Scanner(System.in);
    private String order = sc.nextLine(); /* Private */

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }
    public void orderItem() {
        System.out.println(order);
            if (order == "Tiffen") {
                System.out.println("Dinner price == 100");
            } else {
                System.out.println("Lunch price == 200");
            }
    }
}
interface Hotels { /* interface */
    abstract void A1Hotel();
    abstract void KavinHotel();
    abstract void AjHotel();
}
class Hote1 implements Hotels{
        public void A1Hotel () {
            System.out.println("A1 hotel Location: kovipatti");
        }
        public void KavinHotel () {
            System.out.println("Kavin hotel Location: Sankarankvil");
        }
        public void AjHotel () {
            System.out.println("Aj hotel Location: Thirunelveli");
        }
}


