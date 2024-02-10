package notepad_interface;

import java.util.ArrayList;
import java.io.File;
import java.io.FileWriter;

import java.util.Scanner;

public class Notepad_interface {
    
    private static Scanner scanner = new Scanner(System.in);
    // static void main 내부에서 쓰려면 모든 필드와 메소드는 정적 멤버여야 한다는 사실.
    private static File current;
    private static FileWriter fw;
    private static ArrayList<String> doc = new ArrayList<>();

    public static void main(String[] args) {
       
    	while (true) {
            displayMainMenu();
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    handleMenu("My_daily_recipe_recommendation");
                    break;
                case 2:
                    handleMenu("My_daily_recipe_memo");
                    break;
                case 3:
                    handleMenu("Other's daily recipe recommendation");
                    break;
                case 4:
                    handleMenu("Other's daily recipe memo");
                    break;
                    
                case 5:
                    System.out.println("Exiting program.");
                    System.exit(0);
             // default 가 switch(){ case~1:,..,case~n:~ default:~ } 형식에 필요하다는 걸 기억하자. 
                default:
                    System.out.println("Invalid int choice. Please insert in int 1 to int 5.");
            }
        }
    }

    private static void displayMainMenu() {
        System.out.println(
        		" 1: My_daily_recipe_recommendation | "
        		+ "\n 2: My_daily_recipe_memo | "
        		+ "\n 3: Other's daily recipe recommendation | "
        		+ "\n 4: Other's daily recipe memo |"
        		+ "\n 5: Exit the daily_recipe_sharing |"
        		+ "\n insert the integer according with menu that you want."
        		);
    }


    private static void handleMenu(String menuTitle) {
    	switch(menuTitle) {
    	case "My_daily_recipe_memo":
    		System.out.println("My_daily_recipe_memo");
    		System.out.println("1: Breakfast");
    		System.out.println("2: Lunch");
    		System.out.println("3: Dinner");
    		int choice1 = scanner.nextInt();
    		switch(choice1) {
    		case 1:
    			// 여기서 우리는 current 폴더 내부에 접근해서 어떤 제목의 텍스트 파일들이 있는지 차례대로 추출해 숫자와 대응시켜 출력해 주는 for 반복문을 넣을 겁니다. 
    			// 그 수단에 있어서는 chatgpt 의 도움을 받을 거예요.
    			current=new File("C:\\Users\\정동진\\Desktop\\포트폴리오\\coding file administrating\\files_for daily_recipe\\My_daily_recipe_memo\\아침 메뉴");
    			List_files_in_dir("C:\\Users\\정동진\\Desktop\\포트폴리오\\coding file administrating\\files_for daily_recipe\\My_daily_recipe_memo\\아침 메뉴");
    			
    			break;
    		case 2:
    			current=new File("C:\\Users\\정동진\\Desktop\\포트폴리오\\coding file administrating\\files_for daily_recipe\\My_daily_recipe_memo\\점심 메뉴");
    			List_files_in_dir("C:\\Users\\정동진\\Desktop\\포트폴리오\\coding file administrating\\files_for daily_recipe\\My_daily_recipe_memo\\점심 메뉴");
    			
    			break;
    		case 3:
    			current=new File("C:\\Users\\정동진\\Desktop\\포트폴리오\\coding file administrating\\files_for daily_recipe\\My_daily_recipe_memo\\저녁 메뉴");
    			List_files_in_dir("C:\\Users\\정동진\\Desktop\\포트폴리오\\coding file administrating\\files_for daily_recipe\\My_daily_recipe_memo\\저녁 메뉴");
    			
    			break;
    		}
    		break;
    		
    	
    	case "My_daily_recipe_recommendation":
    		System.out.println("My_daily_recipe_recommendation");
    		System.out.println("1: Breakfast");
    		System.out.println("2: Lunch");
    		System.out.println("3: Dinner");
    		int choice2 = scanner.nextInt();
    		switch(choice2) {
    		case 1:
    			current=new File("C:\\Users\\정동진\\Desktop\\포트폴리오\\coding file administrating\\files_for daily_recipe\\My_daily_recipe_in_recommendation\\아침 메뉴");
    			List_files_in_dir("C:\\Users\\정동진\\Desktop\\포트폴리오\\coding file administrating\\files_for daily_recipe\\My_daily_recipe_in_recommendation\\아침 메뉴");
    			
    			break;
    		case 2:
    			current=new File("C:\\Users\\정동진\\Desktop\\포트폴리오\\coding file administrating\\files_for daily_recipe\\My_daily_recipe_in_recommendation\\점심 메뉴");
    			List_files_in_dir("C:\\Users\\정동진\\Desktop\\포트폴리오\\coding file administrating\\files_for daily_recipe\\My_daily_recipe_in_recommendation\\점심 메뉴");
    			
    			break;
    		case 3:
    			current=new File("C:\\Users\\정동진\\Desktop\\포트폴리오\\coding file administrating\\files_for daily_recipe\\My_daily_recipe_in_recommendation\\저녁 메뉴");
    			List_files_in_dir("C:\\Users\\정동진\\Desktop\\포트폴리오\\coding file administrating\\files_for daily_recipe\\My_daily_recipe_in_recommendation\\저녁 메뉴");
    			
    			break;
    		}
    		
    		break;
    	
    	case "Other's daily recipe recommendation":
    		System.out.println("Other's daily recipe recommendation");
    		System.out.println("1: Breakfast");
    		System.out.println("2: Lunch");
    		System.out.println("3: Dinner");
    		int choice3 = scanner.nextInt();
    		switch(choice3) {
    		case 1:
    			current=new File("C:\\Users\\정동진\\Desktop\\포트폴리오\\coding file administrating\\files_for daily_recipe\\Other's daily_recipe_in_recommendation\\아침 메뉴");
    			List_files_in_dir("C:\\Users\\정동진\\Desktop\\포트폴리오\\coding file administrating\\files_for daily_recipe\\Other's daily_recipe_in_recommendation\\아침 메뉴");
    			
    			break;
    		case 2:
    			current=new File("C:\\Users\\정동진\\Desktop\\포트폴리오\\coding file administrating\\files_for daily_recipe\\Other's daily_recipe_in_recommendation\\점심 메뉴");
    			List_files_in_dir("C:\\Users\\정동진\\Desktop\\포트폴리오\\coding file administrating\\files_for daily_recipe\\Other's daily_recipe_in_recommendation\\점심 메뉴");
    			
    			break;
    		case 3:
    			current=new File("C:\\Users\\정동진\\Desktop\\포트폴리오\\coding file administrating\\files_for daily_recipe\\Other's daily_recipe_in_recommendation\\저녁 메뉴");
    			List_files_in_dir("C:\\Users\\정동진\\Desktop\\포트폴리오\\coding file administrating\\files_for daily_recipe\\Other's daily_recipe_in_recommendation\\저녁 메뉴");
    			
    			break;
    		}
    		
    		break;
    	
    	case "Other's daily recipe memo":
    		System.out.println("Other's daily recipe memo");
    		System.out.println("1: Breakfast");
    		System.out.println("2: Lunch");
    		System.out.println("3: Dinner");
    		int choice4 = scanner.nextInt();
    		switch(choice4) {
    		case 1:
    			current=new File("C:\\Users\\정동진\\Desktop\\포트폴리오\\coding file administrating\\files_for daily_recipe\\Other's daily_recipe_memo\\아침 메뉴");
    			List_files_in_dir("C:\\Users\\정동진\\Desktop\\포트폴리오\\coding file administrating\\files_for daily_recipe\\Other's daily_recipe_memo\\아침 메뉴");
    			
    			break;
    		case 2:
    			current=new File("C:\\Users\\정동진\\Desktop\\포트폴리오\\coding file administrating\\files_for daily_recipe\\Other's daily_recipe_memo\\점심 메뉴");
    			List_files_in_dir("C:\\Users\\정동진\\Desktop\\포트폴리오\\coding file administrating\\files_for daily_recipe\\Other's daily_recipe_memo\\점심 메뉴");
    			
    			break;
    		case 3:
    			current=new File("C:\\Users\\정동진\\Desktop\\포트폴리오\\coding file administrating\\files_for daily_recipe\\Other's daily_recipe_memo\\저녁 메뉴");
    			List_files_in_dir("C:\\Users\\정동진\\Desktop\\포트폴리오\\coding file administrating\\files_for daily_recipe\\Other's daily_recipe_memo\\저녁 메뉴");
    			
    			break;
    		}
    		
    		break;
    		
    	}
    }
    
    private static void List_files_in_dir(String d) {
    	// Create a File object representing the directory
        File direc = new File(d);

        // Check if the directory exists
        if (direc.exists() && direc.isDirectory()) {
            // List all files in the directory
        	
            File[] files = direc.listFiles();
            if (files != null) {
                System.out.println("Files in " + d + ":");
                for (File file : files) {
                    if (file.isFile()) {
                        System.out.println(file.getName());
                    }
                }
            } else {
                System.err.println("Failed to list files.");
            }
        } else {
            System.err.println("Directory does not exist or is not a directory.");
        }
    }

    private static void createNewMenu(ArrayList<String> menu) {
        System.out.println("Enter the name of the new menu:");
        String newMenuName = scanner.nextLine();
        menu.add(newMenuName);

        // (Add logic to enter recipe details)

        System.out.println("Menu '" + newMenuName + "' created successfully.");
    }

    private static void displayRecipe(String menu) {
        // (Implement logic to display and edit the recipe details)
    }
}

