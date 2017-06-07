/**
 * Created by brandonmazzarella on 6/7/17.
 */



public class SnakeEyes1 {

    public static void main(String[] args){

        int rolls = 500;
        int snakeEyes = 0;

        int num1;
        int num2;



        Die dice1 = new Die();
        Die dice2 = new Die();

        for(int i = 0; i < rolls; i++)
        {
            num1 = dice1.roll();
            num2 = dice2.roll();


            if(num1 == num2 && num1 == 1)
            {
                snakeEyes++;
            }
        }
        float ratio = (float)snakeEyes/rolls;

        System.out.println("The number of snake eyes is: " +snakeEyes);
        System.out.println("The ratio is: " + ratio);

    }

}

class Die
        {

            private int faceValue = 1;

            public Die()
            {
                faceValue = 1;
            }

            public int roll()
            {
                faceValue = (int)(Math.random() * 6) + 1;
                return faceValue;
            }
        }
