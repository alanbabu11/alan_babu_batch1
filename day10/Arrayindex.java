package day10;

public class Arrayindex {
    public static void main(String[] args) {
        try{
            int[] ar = new int[]{1,2,3};
            System.out.println(ar[5]);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
