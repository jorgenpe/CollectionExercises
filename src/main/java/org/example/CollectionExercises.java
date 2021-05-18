package org.example;


import java.util.*;

public class CollectionExercises
{
    public static void main( String[] args )
    {

        Exercises1();
        Exercises2();
        Exercises3();
        Exercises4();
        Exercises5();
        Exercises6();
        Exercises7();
        Exercises8();
        Exercises9();
        Exercises10();
        Exercises11();
        Exercises12();


    }

    public static void Exercises1(){

        List<String> weekList = new ArrayList<>();

        weekList.add("Monday");
        weekList.add("Tuesday");
        weekList.add("Wednesday");
        weekList.add("Thursday");
        weekList.add("Friday");
        weekList.add("Saturday");
        weekList.add("Sunday");

        System.out.println("Exercises1\n");
        System.out.println(weekList.toString());
        System.out.println();

    }

    public static void Exercises2(){

        List<String> weekList = new ArrayList<>();

        weekList.add("Monday");
        weekList.add("Tuesday");
        weekList.add("Wednesday");
        weekList.add("Thursday");
        weekList.add("Friday");
        weekList.add("Saturday");
        weekList.add("Sunday");

        System.out.println("Exercises2\n");
        for (String s : weekList) {

            System.out.println(s);
        }
        System.out.println();

    }

    public static void Exercises3(){

        List<String> weekList = new ArrayList<>();

        weekList.add("Monday");
        weekList.add("Tuesday");
        weekList.add("Wednesday");
        weekList.add("Friday");
        weekList.add("Saturday");
        weekList.add("Sunday");


        System.out.println("Exercises3\n");
        for (String s : weekList) {

            System.out.println(s);
        }

        weekList.add(3, "Thursday");

        System.out.println();
        for (String s : weekList) {

            System.out.println(s);
        }
        System.out.println();
    }


    public static void Exercises4(){

        List<String> weekList = new ArrayList<>();
        List<String> subWeek = new ArrayList<>();

        weekList.add("Monday");
        weekList.add("Tuesday");
        weekList.add("Wednesday");
        weekList.add("Thursday");
        weekList.add("Friday");
        weekList.add("Saturday");
        weekList.add("Sunday");


        System.out.println("Exercises4\n");
        for (String s : weekList) {

            System.out.println(s);
        }

         subWeek = weekList.subList(0,3);

        System.out.println();
        for (String s : subWeek) {

            System.out.println(s);
        }
        System.out.println();
    }

    public static void Exercises5(){

        HashSet<String> weekHash = new HashSet<>();


        weekHash.add("Monday");
        weekHash.add("Tuesday");
        weekHash.add("Wednesday");
        weekHash.add("Thursday");
        weekHash.add("Friday");
        weekHash.add("Saturday");
        weekHash.add("Sunday");


        System.out.println("Exercises5\n");

        System.out.println(weekHash.toString());

        System.out.println();
    }

    public static void Exercises6(){

        HashSet<String> weekHash = new HashSet<>();


        weekHash.add("Monday");
        weekHash.add("Tuesday");
        weekHash.add("Wednesday");
        weekHash.add("Thursday");
        weekHash.add("Friday");
        weekHash.add("Saturday");
        weekHash.add("Sunday");

        List<String> weekList = new ArrayList<>(weekHash);
        System.out.println("Exercises6\n");

        System.out.println(weekHash.toString());
        System.out.println();


        for (String s : weekList) {

            System.out.println(s);
        }
        System.out.println();
    }


    public static void Exercises7(){

        HashSet<String> nameHash = new HashSet<>();


        nameHash.add("Lars");
        nameHash.add("Lisa");
        nameHash.add("Anna");
        nameHash.add("Börje");
        nameHash.add("Ann");
        nameHash.add("Nisse");
        nameHash.add("Johan");
        List<String> nameList = new ArrayList<>(nameHash);

        System.out.println("Exercises7\n");

        System.out.println(nameHash.toString());
        System.out.println();


        for(int i = 0; i < nameList.size(); i++){

            for( int j = 0; j < nameList.size(); j++){

                if(nameList.get(i).compareTo(nameList.get(j)) < 0){

                    String temp = nameList.get(i);

                    nameList.set(i,nameList.get(j));
                     nameList.set(j,temp);
                }
            }
        }

        for (String s : nameList) {

            System.out.println(s);
        }
        System.out.println();
    }


    public static void Exercises8(){

        HashSet<String> nameHash = new HashSet<>();


        nameHash.add("Lars");
        nameHash.add("Lisa");
        nameHash.add("Anna");
        nameHash.add("Börje");
        nameHash.add("Ann");
        nameHash.add("Nisse");
        nameHash.add("Johan");

        TreeSet<String> nameTree = new TreeSet<String>(nameHash);


        System.out.println("Exercises8\n");

        System.out.println(nameTree.toString());
        System.out.println();

    }


    public static void Exercises9(){

        HashMap<Integer, String> hashMap = new HashMap<Integer, String>();

        hashMap.put(1,"Lars");
        hashMap.put(2,"Ann");
        hashMap.put(3,"Johan");
        hashMap.put(4,"Jessica");
        hashMap.put(5,"Ove");

        System.out.println("Exercises9\n");

        System.out.println(hashMap.toString());
        System.out.println();

    }

    public static void Exercises10(){

        HashMap<Integer, String> hashMap = new HashMap<Integer, String>();

        hashMap.put(1,"Lars");
        hashMap.put(2,"Ann");
        hashMap.put(3,"Johan");
        hashMap.put(4,"Jessica");
        hashMap.put(5,"Ove");

        System.out.println("Exercises10\n");

        for(Map.Entry m : hashMap.entrySet()) {
            System.out.println("IdKey: " + m.getKey());
        }
        System.out.println();

    }

    public static void Exercises11(){

        HashMap<Integer, String> hashMap = new HashMap<Integer, String>();

        hashMap.put(1,"Lars");
        hashMap.put(2,"Ann");
        hashMap.put(3,"Johan");
        hashMap.put(4,"Jessica");
        hashMap.put(5,"Ove");

        System.out.println("Exercises11\n");

        for(Map.Entry m : hashMap.entrySet()) {
            System.out.println("Name: " + m.getValue());
        }
        System.out.println();

    }

    public static void Exercises12(){

        HashMap<Integer, Car> hashMap = new HashMap<Integer, Car>();

        hashMap.put(1,new Car(1, "Ford", "Focus"));
        hashMap.put(2,new Car(2, "Volvo", "V40"));
        hashMap.put(3, new Car(3,"Volvo", "V60"));
        hashMap.put(4, new Car(4, "Saab", "9000"));
        hashMap.put(5,new Car(5, "Audi", "A6"));

        System.out.println("Exercises12\n");

        for(Integer Id  : hashMap.keySet()) {
            System.out.println("Brand name: " + hashMap.get(Id).getBrand());
        }
        System.out.println();

    }
}
