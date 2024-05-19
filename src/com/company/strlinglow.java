package com.company;

import java.sql.SQLOutput;

public class strlinglow {
    public static void main(String[] args) {
        String name="PUJA";
       //ame=name.toLowerCase();
        System.out.println(name.toLowerCase());
        String text="i am a boy";
        text=text.replace(" ","_");
        System.out.println(text);
        String letter="Dear <|name|>,Thanks a lot";
        letter = letter.replace("<|name|>","puja");
        System.out.println(letter);
        String sent="i am a girl ";
        System.out.println(sent.indexOf("  "));
        System.out.println(sent.indexOf("   "));
        String lett="Dear harry.\n\tThis java course is nice.\n\tThanks.";
        System.out.println(lett);
}
}