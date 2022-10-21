package homework1;

import java.util.Scanner;

public class homework1 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("请输入利润");
		double profit=input.nextFloat();
		double bonus;
		if(profit<=10) {
			bonus = 0.1*profit;
		}else if(profit < 20) {
			bonus = 0.1*10 + 0.075*(profit-10);
		}else if(profit < 40) {
			bonus = 0.1*10 + 0.075*10 + 0.05*(profit-20);
		}else if(profit <60) {
			bonus = 0.1*10 + 0.075*10 +0.05*20 + 0.03*(profit-40);
		}else if(profit<100) {
			bonus = 0.1*10 + 0.075*10 +0.05*20 + 0.03*20 + 0.015*(profit-60);			
		}else
			bonus = 0.1*10 + 0.075*10 +0.05*20 + 0.03*20 + 0.015*40 + 0.001*(profit-100);
		System.out.println("应发奖金数为："+bonus);

	}

}
