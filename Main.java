public class Main{
    static public void main(String[] args){

        int x = 10;
        int y = 14;
        int randomNum = (int)(Math.random() * 101);
        String result = (x + y > randomNum) ? "The sum of x and y is greater than " + randomNum : "The sum of x and y is less than " + randomNum;
        System.out.println(result);

    }
}