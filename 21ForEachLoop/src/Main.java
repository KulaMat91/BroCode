import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String[] animals ={"Dog","Cat","Rat","Bird"};

        for (String element: animals){
            System.out.println(element);
        }

        System.out.println();

        ArrayList<String> anim = new ArrayList<String>();
        anim.add("Dogs");
        anim.add("Zebra");
        anim.add("Hippo");

        for (String element: anim){
            System.out.println(element);
        }
        System.out.println(anim);
    }
}
