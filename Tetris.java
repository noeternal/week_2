package last;
import java.util.Scanner;
import java.util.Random;

class Game{
	public static void gameStart(){
		System.out.println("��Ϸ˵����");
		System.out.println("����0~100�����֣�ϵͳ����ʾ���ֵ���ȷ�ԣ��������������ʾ�´��ˣ�С�����������ʾ��С��"
		+"ֱ���¶�Ϊֹ");
		Scanner y= new Scanner(System.in );
		int i= 0;
		while(true){
			i++;
			System.out.println("������µ�����");
			int guessNumber = y.nextInt();
			int compareResult =compare(guessNumber);
			if(compareResult == 0){
				System.out.println("��ϲ�㾭��"+i+"�ֻأ����ڲ¶��ˡ�Game Over.");
				break;
			}
			else
				continue;
		}
		reset();
		
	}
	
	public static void reset(){
		System.out.println("�Ƿ������Ϸ"+"(Yes or No)");
		Scanner str= new Scanner(System.in );
		String s = str.nextLine();
		if(s.equals("Yes")){
			gameStart();
		}else{
			System.out.println("��Ϸ������");
			System.exit(0);
		}
		
	}

	private static int  num = (int)(Math.random()*100 + 1);
	
	private static int  compare(int guessNumber){
		if(num<guessNumber){
			System.out.println("�´���");
			return 1;
		}
		else if(guessNumber>num){
			System.out.println("��С��");
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

