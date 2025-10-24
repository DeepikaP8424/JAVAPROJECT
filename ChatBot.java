package com.agri.AGRIBOT;

import java.util.Scanner;

public class ChatBot {

    private CropInfoDAO cropInfoDAO = new CropInfoDAO();

    public void startChat() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Agrichatbot! Ask me about crops.");

        while (true) {
            System.out.print("You: ");
            String query = sc.nextLine();

            if (query.equalsIgnoreCase("exit")) {
                System.out.println("Chatbot: Goodbye!");
                break;
            }

            String answer = cropInfoDAO.getAnswer(query);
            System.out.println("Chatbot: " + answer);
        }
    }
}
