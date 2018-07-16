public class main {
    public static void main(String[] args){
        //create values
        calculateScore(true, 800, 5, 100);
        calculateScore(true, 1000, 8, 200);

    }
        //define values
        public static void calculateScore(
                boolean gameOver,
                int score,
                int levelCompleted,
                int bonus
        ){
            if(gameOver){
                int finalScore = score + (levelCompleted * bonus);
                finalScore += 2000;
                System.out.println("Your final score was " + finalScore);
            }
        }

}
//first calculateScore : 5 * 100 = 500 + 800 = 1300 + 2000 = 3300
//second calculateScore : 8 * 200 = 1600 + 1000 = 2600 + 2000 = 4600