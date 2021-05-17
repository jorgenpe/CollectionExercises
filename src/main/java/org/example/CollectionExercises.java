package org.example;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

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
        List<String> weekList = new ArrayList<>();

        weekHash.add("Monday");
        weekHash.add("Tuesday");
        weekHash.add("Wednesday");
        weekHash.add("Thursday");
        weekHash.add("Friday");
        weekHash.add("Saturday");
        weekHash.add("Sunday");


        System.out.println("Exercises6\n");

        System.out.println(weekHash.toString());
        System.out.println();
        weekList.addAll(weekHash);


        for (String s : weekList) {

            System.out.println(s);
        }
        System.out.println();
    }


    public static void Exercises7(){

        HashSet<String> nameHash = new HashSet<>();
        List<String> nameList = new ArrayList<>();

        nameHash.add("Monday");
        nameHash.add("Tuesday");
        nameHash.add("Wednesday");
        nameHash.add("Thursday");
        nameHash.add("Friday");
        nameHash.add("Saturday");
        nameHash.add("Sunday");


        System.out.println("Exercises7\n");

        System.out.println(nameHash.toString());
        System.out.println();
        nameList.addAll(nameHash);


        for (String s : nameList) {

            System.out.println(s);
        }
        System.out.println();
    }


}
