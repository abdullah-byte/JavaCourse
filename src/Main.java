public class Main {
    public static void main(String[] args) {
        tester myObj = new tester();
        System.out.println(myObj.x);

        //Concatenation
        String name = "1";
        char na = 'g';
        System.out.println("Hello and welcome "+ name + na);
        String firstName = "Seun";
        String secondName = "Tobi";
        String fullName = firstName +" " + secondName ;
        System.out.println(fullName);
        String thisName = "Wale";
        String thatName = "Edun";
        System.out.println(thisName.concat(thatName));

        //java operators
        int x = 6, y = 11, z = 24;
        System.out.println(x + y + z);

        //If and else statements
        int myAge = 15;
        int votingAge = 18;
        if (myAge >= votingAge){
            System.out.println("You are eligible to vote");
        }else {
            System.out.println("You are not old enough to vote");
        }
        //Or we use ternary operator

        String result = (myAge >= votingAge) ? "You can vote" : "You can't vote";
        System.out.println(result);

        //Java math
        int randomNum = (int)(Math.random() * 51);
        System.out.println(randomNum);

        //For loop
        for (int i = 10 ;i >= 1 && i <= 10 ; i--) {
            System.out.println("i = " + i);
        }

        //Switch
        int day = 8;
        switch (day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Enter a valid number between 1 and 7");
        }
        // While loop
        int r = 1;
        while (r < 5){
            System.out.println(r);
            r++;
        }
        System.out.println("Do while loop");

        //Do while loop
        int b = 0;
        do {
            System.out.println(b);
            b++;
        }
        while (b < 8);

        //Nested loop
        System.out.println("Nested loop");
        for (int i = 1; i <=3; i++){
            System.out.println("Girl " + i);

            for (int j = 1; j <=5; j++){
                System.out.println("Days: "+ j);
            }
        }

        //For - each
        System.out.println("For - each loop");

        String[] colors = {"Blue", "Red", "Green", "White", "Black"};
        for (String i : colors){
            System.out.println(i);
        }

        //Arrays
        int[] myNum = {1,2,3,4};
        System.out.println(myNum[3]);

        for (int i : myNum) {
            System.out.println(i);
        }

        //or
        for(int j = 0; j < myNum.length; ++j){
            System.out.println(myNum[j]);
        }
        //Multi dimensional array
        System.out.println("Multi dimensional array");
        int[][] num = {{2,4,6,8},{1,3,5,7}};
        for(int i = 0; i < num.length; ++i){
            for (int j = 0; j < num[i].length; ++j) {
                System.out.println(num[i][j]);
            }
        }

    }
}

