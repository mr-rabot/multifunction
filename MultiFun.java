
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;



class fun {
    public void arlist(){
        ArrayList<String> ar = new ArrayList<String>();
        ar.add("           Hello");
        ar.add("           welcome");
        Collections.sort(ar);

        System.out.println("\r================== Array List ===============\n");

        for (String i : ar) {

        System.out.println(i);
        }
    
    }
    public void llist(){
        LinkedList<String> ll = new LinkedList<String>();
        System.out.println("\r=================== Linked List ==============\n");
        ll.add("this");
        ll.add("Is");
        ll.add("LInked List");

        System.out.println(ll);
            
        

    }
    public void HMap() {
        HashMap<String, String> hm = new HashMap<String, String>();
        System.out.println("\r=================== HasMap ==============\n");
        hm.put("MP ", " Bhopal");
        hm.put("UP "," Lucknow");
        hm.put("TS "," Hyderabad");
        hm.put("Bihar "," Patna");
        System.out.println(hm);
    
    }
    public void HSet() {
        HashSet<String> hs = new HashSet<String>();
        System.out.println("\r=================== HasSet ==============\n");
        hs.add("Narmada");
        hs.add("Chambal");
        hs.add("Sone");
        hs.add("Betwa");
        System.out.println(hs);
    
    }
    
}

public class MultiFun extends fun{ 

    static String user ="raman", psd ="rawat", usr, pwd;
      
        public void lpage(){
        try{
            BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("\r==================== Login Page ==============\n");
            System.out.print("\r\tEnter your Username : ");
            usr = sc.readLine();
            System.out.print("\r\tEnter Password : ");
            pwd = sc.readLine();
        }catch(IOException e){System.out.println(e);
        }
    }
public static void main(String args[]){
     
    String ch ;

    System.out.println("============== WElcome this is multi functional prongrame =======\r\n\n");
    MultiFun mf = new MultiFun();
    mf.lpage();

    if(user.equalsIgnoreCase(usr) && psd.equalsIgnoreCase(pwd)){

        System.out.println("\r\t\nCongratulations Login success \n\n");
        System.out.print("\rDo You Want to print array list : ");
        Scanner sc1 = new Scanner(System.in);
        ch = sc1.nextLine();
        if(ch.equalsIgnoreCase("yes") || ch.equalsIgnoreCase("y")){
            mf.arlist(); 
        }else{
            System.out.println("\r\tThank you\n\n");
        }
        System.out.print("\r\nDo You Want to print linked list : ");
        String ch2 = sc1.nextLine();
        if(ch2.equalsIgnoreCase("yes") || ch2.equalsIgnoreCase("y")){
        mf.llist();
        }else{
            System.out.println("\r\tThank you\n\n");   
        }
        System.out.print("\r\nDo You Want to print HasMap : ");
        String ch3 = sc1.nextLine();
        if(ch3.equalsIgnoreCase("yes") || ch3.equalsIgnoreCase("y")){
        mf.HMap();
        }else{
            System.out.println("\r\tThank you\n\n");   
        }
        System.out.print("\r\nDo You Want to print HasSet : ");
        String ch4 = sc1.nextLine();
        if(ch4.equalsIgnoreCase("yes") || ch4.equalsIgnoreCase("y")){
        mf.HSet();
        }else{
            System.out.println("\r\tThank you\n\n");   
        }
        System.out.println("\r\t\nPrograme Successful \n\n");
        }
        else{
        System.out.println("\r\tWrong User and Password !\n\n");
    }
}
}
