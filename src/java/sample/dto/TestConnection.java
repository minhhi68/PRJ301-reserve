/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample.dto;

import sample.dao.AccountDAO;

/**
 *
 * @author minhh
 */
public class TestConnection {
      public static void main(String[] args){
          //test login
          Account acc = AccountDAO.getAccount("test@gmail.com", "test");
          if(acc!=null){
              if(acc.getRole()==1)
                  System.out.println("i am an admin");
              else
                  System.out.println("i am a user");
          }
          else 
              System.out.println("login fail");
          
          // Test the first challenge
          /*
          ArrayList<Account> list = AccountDAO.getAccount();
          for (Account account : list){
          System.out.println(account.getAccID()+","+account.getEmail()+","+account.getFullname()+","+accouny.getPassword());
          }
          */
          
          //Test the second challenge
          /*
          if(AccountDAO.updateAccountStatus("test@gmail.com", 0))
          System.out.println("update status successfully");
          else System.out.println("cannot update status ");
          
          */
          
          //test the third challenge
          /*
          if(AccountDAO.updateAccount("test@gmail.com","999999","thino","65432111"))
          System.out.println("update profile");
          else System.out.println("update profile failed");
          
          */
          
          //test the fourth challenge 
          
          if(AccountDAO.insertAccount("test@gmail.com","222222", "chi pheo", "123123123", 1, 0))
          System.out.println("added new account");
          else System.out.println("insert new account failed");
          
          
                
      }
}
