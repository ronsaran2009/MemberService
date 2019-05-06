package com.example.Recipe;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.ValueEventListener;



public class MemberService {
    private static Member member;



    public MemberService(){}

    public static String addMember(String username, String email, String password, String name)  {
        member = new Member(username, email, password, name);
//        String url = "https://----.firebaseIO.com/";
//        Firebase dataRef = new Firebase(url);
//
//    dataRef.addListenerForSingleValueEvent(new ValueEventListener() {
//         @Override
//         public void onDataChange(DataSnapshot snapshot) {
//             System.out.println("data");
//         }
//
//         @Override
//         public void onCancelled() {
//             System.err.println("Listener was cancelled");
//         }
//    });
//
//    System.out.println("hi");

        return "success";
    }

    public static Member getMember(String memberId){
        member = new Member();
        member.setUsername(memberId);

        return member;
    }
}
