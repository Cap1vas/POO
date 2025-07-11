import java.util.*;
public class OláMundo {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String r = "amor";
        String s = sc.nextLine();
        String nova = new String();
         if(s.contains(r)){
           nova = s.replaceAll(r, ("#".repeat(r.length())));
        }
        System.out.println(nova);
        sc.close();
    }
}
