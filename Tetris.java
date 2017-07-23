package last;
import java.util.Scanner;
import java.util.Random;

class Game{
	public static void gameStart(){
		System.out.println("游戏说明：");
		System.out.println("输入0~100的数字，系统会提示数字的正确性，大于随机数会提示猜大了，小于随机数会提示猜小了"
		+"直到猜对为止");
		Scanner y= new Scanner(System.in );
		int i= 0;
		while(true){
			i++;
			System.out.println("请输入猜的数：");
			int guessNumber = y.nextInt();
			int compareResult =compare(guessNumber);
			if(compareResult == 0){
				System.out.println("恭喜你经历"+i+"轮回，终于猜对了。Game Over.");
				break;
			}
			else
				continue;
		}
		reset();
		
	}
	
	public static void reset(){
		System.out.println("是否继续游戏"+"(Yes or No)");
		Scanner str= new Scanner(System.in );
		String s = str.nextLine();
		if(s.equals("Yes")){
			gameStart();
		}else{
			System.out.println("游戏结束。");
			System.exit(0);
		}
		
	}

	private static int  num = (int)(Math.random()*100 + 1);
	
	private static int  compare(int guessNumber){
		if(num<guessNumber){
			System.out.println("猜大了");
			return 1;
		}
		else if(guessNumber>num){
			System.out.println("猜小了");
			return -1;
		}
		else{
			return 0;
		}
	}
}

class Tetris{
	public static void main(String[] args) {
		Game game = new Game();
		game.gameStart();
//		game.reset();
		
	}
}

