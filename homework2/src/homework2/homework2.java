package homework2;

public class homework2 {

	public static void main(String[] args) {
		//假设获得一等奖、二等奖、三等奖的人数分别为x,y,z
		for(int x = 0;x <= 30;x++) {
			for(int y = 0;y <= 30;y++) {
				for(int z = 0;z <= 30;z++) {
					if(x + y + z == 30 && 3*x+2*y+z == 50) {
						System.out.println("x的值为"+x);
						System.out.println("y的值为"+y);
						System.out.println("z的值为"+z);
						System.out.println("------------");
				}
			}
		}

	}

}
}
