package miniProject;

/**
 * ������������Ϸ���˲µ�����
 * @author 14259
 *
 */
public class Player {
	int number = 0;//Ҫ���µ�����
	public void guess(){
		number = (int)(Math.random()*10);
		System.out.println("I am guess "+number);
	}
}
