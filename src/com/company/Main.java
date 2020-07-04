package com.company;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.lang.reflect.Array;
import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer>a1=new ArrayList<>(Arrays.asList(1,2,3,4,5));
        ArrayList<Integer>a2=new ArrayList<>(Arrays.asList(1,2,3,4,7,6));
       ArrayList<Integer> al3= new ArrayList<>();


        // contains() Method
        for (Integer temp : a2)
            al3.add(a1.contains(temp) ? 1 : 2);
        System.out.println(al3);

        //Equals() Method
        if(a1.equals(a2))
            System.out.println("Equal");
        else
        System.out.println("Not Equal");

        //to obtain common elements
        a1.retainAll(a2);
        System.out.println(a1);

        //to reverse
        Collections.reverse(a1);
        System.out.println(a1);


        List<String> fruitList = new ArrayList<String>();
        fruitList.add("Mango");
        fruitList.add("Banana");
        fruitList.add("Apple");
        fruitList.add("Strawberry");
        fruitList.add("Pineapple");
        System.out.println(fruitList);

        // Creating unmodifiable List
        List<String> unmodifiableList= Collections.unmodifiableList(fruitList);
        fruitList.add("INDIA");
        System.out.println(fruitList);

        // creating Array and converting Arraylist into Array
        String[] s = new String[fruitList.size()];
        s=fruitList.toArray(s);
        for(String i:s) {
            System.out.println(i);
        }

        //converting Array into Arraylist
        ArrayList<String> ar=new ArrayList<>(Arrays.asList(s));
        ListIterator<String> ls=ar.listIterator((ar.size()));
        while(ls.hasPrevious()) // printing elements in reverse
            System.out.println(ls.previous());


        //creating sublist
        ArrayList<Integer> in=new ArrayList<>(a1.subList(0,3));
        System.out.println(in);


        //creating clone
        ArrayList<Integer> cl=(ArrayList<Integer>)in.clone();
        System.out.println(cl);

        // Synchronization performed on ArrayList
        List<String>syn=Collections.synchronizedList(new ArrayList<String>());
        syn.add("kukku");
        syn.add("Shiraz Hussain");
        synchronized (syn)
        {
            System.out.println("Collections.Synchronized() Method Applied");
            Iterator<String>itr=syn.iterator();
            while(itr.hasNext())
                System.out.println(itr.next());
        }

        CopyOnWriteArrayList<String> ca=new CopyOnWriteArrayList<>();
        ca.add("kukku");
        ca.add("Shiraz Hussain");
        System.out.println("CopyOnWriteArrayList() method performed");
        Iterator<String> cn= ca.iterator();
        while(cn.hasNext())
            System.out.println(cn.next());


    }
}
