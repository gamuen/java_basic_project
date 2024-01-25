package recipe_recommending_app;

import java.util.Scanner;

public class Platter_food extends Food_type_list{
	
	public void menu_recommend() {
		System.out.println("----------- Platter_food_five_Recommend ---------- ");
		System.out.println("----------- 1: Lobster platter ---------- ");
		System.out.println("----------- 2: Barbecue Platter ---------- ");
		System.out.println("----------- 3: Apple Jack ---------- ");
		System.out.println("----------- 4: Rose Wine ---------- ");
		System.out.println("----------- 5: White jin_fan_del Wine ---------- ");
		System.out.println("----------- Among above 5, insert your choice: ---------- ");
	}
	
	static Scanner s = new Scanner(System.in);
	// 아래는 무조건 필드로 선언해야 하고, 변수로 선언할 수는 없을리가 없죠. 그럼 어떻게 line 을 호출합니까? 무조건 객체에서 필드를 호출해야 한다? 아닐 겁니다. 변수에도
	// 저장가능한 객체가 scanner 일 거예요. 
	
	public static void main(String[] args) {
		
		Platter_food food = new Platter_food();
		food.menu_recommend();
		
		Scanner s = new Scanner(System.in);
		int s1=s.nextInt();
		switch(s1) {
		case 1:
			Food_type_list.pr("https://blog.naver.com/baby0817/221254061236");
			Food_type_list.pr("https://blog.naver.com/nana_80/221822463349");
			Food_type_list.pr("copy above urls and enter to it.");
			break;
		case 2:
			Food_type_list.pr("https://blog.naver.com/twin_couple/222197544234");
			Food_type_list.pr("https://blog.naver.com/band2886/223301149771");
			Food_type_list.pr("https://blog.naver.com/peace8012/223322086358?&isInf=true&infParams=eyJzY2lkIjoxMzU5Njg3NjAxNTU5NjgsInNraWQiOjI1MzU2MDczMDE3OTM2MCwiY2lkIjo2NTA5MjMzNTA4NzgxNzYsInF1ZXJ5IjoiJUVCJThGJUJDJUVDJUE3JTgwJUVCJUFBJUE5JUVDJTgyJUI0JUVBJUI1JUFDJUVDJTlEJUI0In0=");
			Food_type_list.pr("https://blog.naver.com/d_eggya/223317975521?&isInf=true&infParams=eyJzY2lkIjoxMzU5Njg3NjAxNTU5NjgsInNraWQiOjI1MzU2MDU0NzE1Nzc5MiwiY2lkIjo2NDk0MjkxMzEzMjc0NTYsInF1ZXJ5IjoiJUVCJThCJUFEJUVCJThCJUE0JUVCJUE2JUFDJUVDJTgyJUI0JUVBJUI1JUFDJUVDJTlEJUI0In0=");
			Food_type_list.pr("copy above urls and enter to it.");
			break;
		case 3: 
			Food_type_list.pr("https://blog.naver.com/baby0817/223128468805");
			Food_type_list.pr("copy above urls and enter to it.");
			break;
		case 4:
			Food_type_list.pr("https://blog.naver.com/baby0817/223208203851");
			Food_type_list.pr("copy above urls and enter to it.");
			break;
		case 5:
			Food_type_list.pr("https://blog.naver.com/baby0817/222940104091");
			Food_type_list.pr("copy above urls and enter to it.");
			break;
		}
	}
}
