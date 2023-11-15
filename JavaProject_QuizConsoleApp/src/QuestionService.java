import java.util.Scanner;

public class QuestionService {

	Question[] que=new Question[5];

	public void displayQuestion() {
		
		
		que[0]= new Question(1,"size of int","2","4","6","8","4");
		que[1]= new Question(2,"Select even number","1","2","3","5","2");
		que[2]= new Question(3,"Select odd number","2","7","6","8","7");
		que[3]= new Question(4,"size of double","2","4","6","8","8");
		que[4]= new Question(5,"size of long","2","4","6","16","16");
		
		int i=0;
		int score=0;
		for(Question q:que) {
			System.out.println(q.getId()+": "+q.getQuestion());
			System.out.println(q.getOpt1()+ "," +q.getOpt2()+", "+q.getOpt3()+", "+q.getOpt4());
			Scanner sc=new Scanner(System.in);
			String result= sc.nextLine();
			if(q.getAns().equals(result)) {
				score++;
		}				
	}
		System.out.println("Total Score is: "+score);
		
//		Question que=new Question(1,"size of int","2","4","6","8","4");
//		System.out.println(que);
//		Scanner sc=new Scanner(System.in);
//		String result= sc.nextLine();
//		
//		if(que.getAns().equals(result)) {
//			System.out.println("Congrats");
//		}
//		else {
//			System.out.println("Sorry");
//		}
		
		
		
		
	}

}
