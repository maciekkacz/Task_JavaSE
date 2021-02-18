package TestPack;

import java.util.Arrays;

public class Testclass {
    public static void main(String[] args) {

        String name = "Hello world, first word when you start programing".replaceAll( ",",":" );
        String[] s = name.split( ":" );

        System.out.println(name);


        for (String s1 : s) {
            System.out.print(s1);
        }
    }
}
