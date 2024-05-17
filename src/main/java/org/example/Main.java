package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        try {
            Scanner input = new Scanner(System.in);
            NoNameBank nameBank = new NoNameBank();
            String option = "";

            do {
                System.out.println("1 : DEPOSITE");
                System.out.println("2 : WITHDRAW");
                System.out.println("3 : BALANCE ENQUIRY");
                System.out.println("4 : ENTER OPTION");
                option = input.next();

                switch (option) {
                    case "1": {
                        System.out.println("ENTER DEPOSITE AMOUNT");
                        double amt = input.nextDouble();
                        nameBank.deposite(amt);
                        nameBank.balanceEnquiry();
                        break;
                    }
                    case "2": {
                        System.out.println("ENTER WITHDRAW AMOUNT");
                        double amt = input.nextDouble();
                        double o = nameBank.withdraw(amt);
                        System.out.println("WITHDRAW AMOUNT IS : " + o);
                        nameBank.balanceEnquiry();
                        break;
                    }
                    case "3":
                        nameBank.balanceEnquiry();
                        break;
                    default:
                        System.out.println("INVALID OPTION ");
                }
                System.out.println("do you want to continue (yes/no)");
                option=input.next();
            }
            while (option.equalsIgnoreCase("yes"));
        }
        catch (InvalidAmountException iae ){
            System.out.println(iae.getMessage());
        }catch (InsufficientFundsException ife){
            System.out.println(ife.getMessage());
        }catch (NumberFormatException nfe){
            System.out.println(nfe.getMessage());
        }catch (InputMismatchException ime){
            System.out.println(ime.getMessage());
        }

    }
}