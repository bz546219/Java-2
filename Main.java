public class Main{
    static public void main(String[] args){

        int x = 10;
        int y = 14;
        int randomNum = (int)(Math.random() * 101);
        if(x + y > randomNum){
            System.out.println("The sum of x and y is greater than " + randomNum);
        }
        else{
            System.out.println("The sum of x and y is less than " + randomNum);
        }

    }
}