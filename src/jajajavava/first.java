package jajajavava;

public class first {

	/*������ ��ǻ�� ������ ����(marine)�� Ŭ������ ������ ���̴�. �� Ŭ������ ���
	�߿� static�� �ٿ��� �ϴ� ���� � �͵��̰� �� ������ �����ΰ�?
	(��, ��� ������ ���ݷ°� ������ ���ƾ� �Ѵ�.)*/

	int x=0, y=0; // Marine�� ��ġ��ǥ(x,y)
	int hp = 60; // ���� ü��
	static int weapon = 6; // ���ݷ�
	static int armor = 0; // ����
	static void weaponUp() {
	weapon++;
	}
	static void armorUp() {
	armor++;
	}
	void move(int x, int y) {
	this.x = x; // this.x�� �ν��Ͻ� ����, x�� ��������
	this.y = y; // this.y�� �ν��Ͻ� ����, y�� ��������
	}
	
	/*weapon, armor - ��� Marine�ν��Ͻ��� ���� ������ ���̾�� �ϹǷ�.
 	weaponUp(), armorUp() - static������ ���� �۾��� �ϴ� �޼����̹Ƿ�*/

}
