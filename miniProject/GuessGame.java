package miniProject;

public class GuessGame {
	/**
	 * �����������
	 */
	Player p1;
	Player p2;
	Player p3;
	
	//���忪ʼ��Ϸ�ķ�����
	public void startGame(){
		//����һ���յ�����
		int targetNumber = (int)(Math.random()*10);
		//��ʼ��������Ҳµ�����
		int guessNum1 = 0;
		int guessNum2 = 0;
		int guessNum3 = 0;
		
		p1 = new Player();
		p2 = new Player();
		p3 = new Player();
		
		//���µ����ֺ�Ҫ�µ�����һ����ʱ�򣬾͸�ֵΪtrue
		boolean p1isRight = false;
		boolean p2isRight = false;
		boolean p3isRight = false;
		
		while(true){
			System.out.println("targetNumber is "+targetNumber);
			//������Ҳ�����
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
				//�����һ���˲����ˣ�������е����ĸ���ң�Ȼ�������Ϸ
				System.out.println("target number is"+targetNumber);
				System.out.println("player1 get right?"+p1isRight);
				System.out.println("player2 get right?"+p2isRight);
				System.out.println("player3 get right?"+p3isRight);
				break;//����ѭ������Ϸ����
			}else{
				//������Ϸ��Ҫ������ȥ
				System.out.println("we will have to try again!");
			}
		}
	}

}
