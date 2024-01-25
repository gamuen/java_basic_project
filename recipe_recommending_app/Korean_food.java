package recipe_recommending_app;
import java.util.Scanner;

public class Korean_food extends Food_type_list{
	
	static String type="Korean_Food";
	
	public void menu_recommend() {
		System.out.println("----------- Korean_Food_five_Recommend ---------- ");
		System.out.println("----------- 1: Acorn Jelly Salad rice ---------- ");
		System.out.println("----------- 2: Festival Noodles ---------- ");
		System.out.println("----------- 3: tuna radish Bibimbap ---------- ");
		System.out.println("----------- 4: Avocado salted pollack roe rice ---------- ");
		System.out.println("----------- 5: Seafood&Green Onion Pancake ---------- ");
		System.out.println("----------- Among above 5, insert your choice: ---------- ");
	}
	// 아래는 무조건 필드로 선언해야 하고, 변수로 선언할 수는 없을리가 없죠. 그럼 어떻게 line 을 호출합니까? 무조건 객체에서 필드를 호출해야 한다? 아닐 겁니다. 변수에도
	// 저장가능한 객체가 scanner 일 거예요. 
	
	public static void main(String[] args) {
		
		Korean_food food = new Korean_food();
		food.menu_recommend();
		
		Scanner s = new Scanner(System.in);
		int s1=s.nextInt();
		switch(s1) {
		case 1:
			Food_type_list.pr("https://blog.naver.com/baby0817/222807036739");
			Food_type_list.pr("copy above url and enter to it.");
			break;
		case 2:
			Food_type_list.pr("https://blog.naver.com/baby0817/222859419613");
			Food_type_list.pr("copy above url and enter to it.");
			break;
		case 3: 
			Food_type_list.pr("https://blog.naver.com/baby0817/223128468805");
			Food_type_list.pr("copy above url and enter to it.");
			break;
		case 4:
			Food_type_list.pr("https://blog.naver.com/baby0817/223208203851");
			Food_type_list.pr("copy above url and enter to it.");
			break;
		case 5:
			Food_type_list.pr("https://blog.naver.com/baby0817/222940104091");
			Food_type_list.pr("copy above url and enter to it.");
			break;
		}
	}

}
