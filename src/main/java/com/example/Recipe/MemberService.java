package com.example.Recipe;

import com.google.api.core.ApiFuture;
import com.google.auth.oauth2.GoogleCredentials;
import com.google.cloud.firestore.DocumentReference;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.WriteResult;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.cloud.FirestoreClient;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;

public class MemberService {
    private static Member member;



    public MemberService(){}

    public static String addMember(String username, String email, String password, String name) throws ExecutionException, InterruptedException, IOException {
        member = new Member(username, email, password, name);
//        String url = "https://----.firebaseIO.com/";
//    Firebase dataRef = new Firebase(url);
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
