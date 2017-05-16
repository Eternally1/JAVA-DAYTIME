package miniProject;

/**
 * 用于生成玩游戏的人猜的数字
 * @author 14259
 *
 */
public class Player {
	int number = 0;//要被猜的数字
	public void guess(){
		number = (int)(Math.random()*10);
		System.out.println("I am guess "+number);
	}
}
