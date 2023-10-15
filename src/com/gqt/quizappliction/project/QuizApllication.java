
package com.gqt.quizappliction.project;
import java.util.Scanner;
public class QuizApllication {
	public static int amount;
	public static int key;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Quiz application");
		System.out.println("the first questionis :");
		System.out.println(QuizQuestions.question_1);
		System.out.println(QuizQuestions.question_1_option);
		key = sc.nextInt();
		if(key==QuizQuestions.question_1_answer) {
			amount=1000;
			System.out.println("you are answer is corect");
			System.out.println("you won the amount"+ amount);
			System.out.println("the second questionis :");
			System.out.println(QuizQuestions.question_2);
			System.out.println(QuizQuestions.question_2_option);
			key = sc.nextInt();
			if(key==QuizQuestions.question_2_answer) {
				amount=2000;
				System.out.println("you are answer is corect");
				System.out.println("you won the amount"+ amount);
				
			}
			
		else {
			System.out.println("you are answer is wrong");
			System.out.println("you won"+ amount);
		}
			System.out.println("the third question is:");
			System.out.println(QuizQuestions.question_3);
			System.out.println(QuizQuestions.question_3_option);
			key = sc.nextInt();
			if(key==QuizQuestions.question_3_answer) {
				amount=3000;
				System.out.println("you are answer is correct");
				System.out.println("you won the amount"+ amount);
				System.out.println();
			}
			else {
				System.out.println("you are answer is correct");
				System.out.println("you won the amount" + amount);
			}
			System.out.println("the fourth question is:");
			System.out.println(QuizQuestions.question_4);
			System.out.println(QuizQuestions.question_4_option);
			key = sc.nextInt();
			if(key==QuizQuestions.question_4_answer) {
				amount=4000;
				System.out.println("you are answer is correct");
				System.out.println("you won the amount"+ amount);
				System.out.println();
			}
			else {
				System.out.println("you are answer is correct");
				System.out.println("you won the amount" + amount);
			}
			System.out.println("the fifth question is:");
			System.out.println(QuizQuestions.question_5);
			System.out.println(QuizQuestions.question_5_option);
			key = sc.nextInt();
			if(key==QuizQuestions.question_5_answer) {
				amount=5000;
				System.out.println("you are answer is correct");
				System.out.println("you won the amount"+ amount);
				System.out.println();
			}
			else {
				System.out.println("you are answer is correct");
				System.out.println("you won the amount" + amount);
			}
			System.out.println("the sixth question is:");
			System.out.println(QuizQuestions.question_6);
			System.out.println(QuizQuestions.question_6_option);
			key = sc.nextInt();
			if(key==QuizQuestions.question_6_answer) {
				amount=6000;
				System.out.println("you are answer is correct");
				System.out.println("you won the amount"+ amount);
				System.out.println();
			}
			else {
				System.out.println("you are answer is correct");
				System.out.println("you won the amount" + amount);
			}
			System.out.println("the seventh question is:");
			System.out.println(QuizQuestions.question_7);
			System.out.println(QuizQuestions.question_7_option);
			key = sc.nextInt();
			if(key==QuizQuestions.question_7_answer) {
				amount=6000;
				System.out.println("you are answer is correct");
				System.out.println("you won the amount"+ amount);
				System.out.println();
			}
			else {
				System.out.println("you are answer is correct");
				System.out.println("you won the amount" + amount);
			}
			System.out.println("the eighth question is:");
			System.out.println(QuizQuestions.question_8);
			System.out.println(QuizQuestions.question_8_option);
			key = sc.nextInt();
			if(key==QuizQuestions.question_8_answer) {
				amount=8000;
				System.out.println("you are answer is correct");
				System.out.println("you won the amount"+ amount);
				System.out.println();
			}
			else {
				System.out.println("you are answer is correct");
				System.out.println("you won the amount" + amount);
			}
			System.out.println("the ninth question is:");
			System.out.println(QuizQuestions.question_9);
			System.out.println(QuizQuestions.question_9_option);
			key = sc.nextInt();
			if(key==QuizQuestions.question_9_answer) {
				amount=9000;
				System.out.println("you are answer is correct");
				System.out.println("you won the amount"+ amount);
				System.out.println();
			}
			else {
				System.out.println("you are answer is correct");
				System.out.println("you won the amount" + amount);
			}
			System.out.println("the tenth question is:");
			System.out.println(QuizQuestions.question_10);
			System.out.println(QuizQuestions.question_10_option);
			key = sc.nextInt();
			if(key==QuizQuestions.question_10_answer) {
				amount=10000;
				System.out.println("you are answer is correct");
				System.out.println("you won the amount"+ amount);
				System.out.println();
			}
			else {
				System.out.println("you are answer is correct");
				System.out.println("you won the amount" + amount);
			}
		}
			else {
				System.out.println("you are answer is wrong");
				System.out.println("you won"+ amount);
			}
		}
}

