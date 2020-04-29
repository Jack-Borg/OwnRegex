package com.company;

public class Main {

    public static void main(String[] args) {
        String pattern = "(A*B|AC)D";
        NFA nfa = new NFA(pattern);

        System.out.println("pattern " + pattern);
        System.out.println("AC " + nfa.recognizes("AC"));
        System.out.println("AD " + nfa.recognizes("AD"));
        System.out.println("AAA " + nfa.recognizes("AAA"));
        System.out.println("ABD " + nfa.recognizes("ABD"));
        System.out.println("ADD " + nfa.recognizes("ADD"));
        System.out.println("BCD " + nfa.recognizes("BCD"));
        System.out.println("ABCCBD " + nfa.recognizes("ABCCBD"));
        System.out.println("BABAAA " + nfa.recognizes("BABAAA"));
        System.out.println("BABBAAA " + nfa.recognizes("BABBAAA"));
    }
}
