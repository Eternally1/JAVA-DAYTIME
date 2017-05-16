package miniProject;

public class GuessGame {
	/**
	 * 定义三个玩家
	 */
	Player p1;
	Player p2;
	Player p3;
	
	//定义开始游戏的方法。
	public void startGame(){
		//产生一个谜底数字
		int targetNumber = (int)(Math.random()*10);
		//初始化三个玩家猜的数字
		int guessNum1 = 0;
		int guessNum2 = 0;
		int guessNum3 = 0;
		
		p1 = new Player();
		p2 = new Player();
		p3 = new Player();
		
		//当猜的数字和要猜的数字一定的时候，就赋值为true
		boolean p1isRight = false;
		boolean p2isRight = false;
		boolean p3isRight = false;
		
		while(true){
			System.out.println("targetNumber is "+targetNumber);
			//三个玩家猜数字
			p1.guess();
			p2.guess();
			p3.guess();
			
			guessNum1 = p1.number;
			guessNum2 = p2.number;
			guessNum3 = p3.number;
			
			if(guessNum1 == targetNumber){
				p1isRight = true;
			}
			if(guessNum2 == targetNumber){
				p2isRight = true;
			}
			if(guessNum3 == targetNumber){
				p3isRight = true;
			}
			
			if(p1isRight || p2isRight || p3isRight){
				//如果有一个人猜中了，输出猜中的是哪个玩家，然后结束游戏
				System.out.println("target number is"+targetNumber);
				System.out.println("player1 get right?"+p1isRight);
				System.out.println("player2 get right?"+p2isRight);
				System.out.println("player3 get right?"+p3isRight);
				break;//跳出循环，游戏结束
			}else{
				//否则游戏还要继续下去
				System.out.println("we will have to try again!");
			}
		}
	}

}
