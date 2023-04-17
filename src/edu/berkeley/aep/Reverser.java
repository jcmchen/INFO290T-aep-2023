package edu.berkeley.aep;

//Understands reverseString
public class Reverser {
    private final String original;

    public Reverser(String original){
        this.original = original;
    }

//    public String reverse(){
//        return original;
//    }

    public String reverse(){
        var length = original.length();
        if(length ==1){
            return original;
        }
        return original.charAt(length -1) + new Reverser(original.substring(0, length-1)).reverse();

    }


}
