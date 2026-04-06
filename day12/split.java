package day12;

public class split {
    public static void main(String[] args) {
        String s = "example    a good boy";
        String[] word = s.split("\\s+");
        for(int i=0 ; i<word.length ; i++){
            System.out.println(word[i]);
        }
    }
}
