package com.example.test;

import java.util.HashMap;
import java.util.Map;

public class MapProgram {

    public static void main(String[] args) {


        Map<String, String> languages = new HashMap<>();
        if (languages.containsKey("Java")){
            System.out.println("Java already exists");
        }else{
            languages.put("Java", " a compiled high level, object-oriented, platform independent language");
            System.out.println("Java successfully added");
        }

        languages.put("Python", "an interpreted, object-oriented, high-level programming language with dynamic semantics");
        languages.put("Algol", "an algorithmic language");
        System.out.println(languages.put("BASIC", "Beginners All Purposes Symbolic Instruction Code"));
        System.out.println(languages.put("Lisp", "Therein lies madness"));

        if (languages.containsKey("Java")){
            System.out.println("Java is already in the map");
        }else{
            languages.put("Java", "another post with java");
        }

        System.out.println("=====================================================================");

       // languages.remove("Lips");
        if (languages.remove("Algol", "an algorithmic language")){
            System.out.println("Algol removed");
        }else{
            System.out.println("Algol not removed, key/value pair not found");
        }
        //System.out.println(languages.replace("Lisp", "a functional programming language"));
        if (languages.replace("Lisp", "Therein lies madness", "Replaced with new string")){
            System.out.println("Lisp replaced");
        }else{
            System.out.println("Lisp was not replaced");
        }
        System.out.println(languages.replace("Ruby", "this wont be added"));

        for (String key: languages.keySet()){
            System.out.println(key + " : " + languages.get(key));
        }




    }
}
