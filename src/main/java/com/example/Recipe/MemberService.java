package com.example.Recipe;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.ValueEventListener;



public class MemberService {
    private static Member member;



    public MemberService(){}

    public static String addMember(String username, String email, String password, String name)  {
        member = new Member(username, email, password, name);
//       menu = setMenu(menu, memberId, menuFromWeb);
//
//        //set menu id
//        menu.setMenuId(setNewMenuId(menu.getCategory()));
//        menuFromWeb.setMenuId(menu.getMenuId());
//
//        //set manage
//        manage = new Manage();
//        manage.setMemberId(memberId);
//        manage.setMenu(menuFromWeb);
//        manage.setMenuId(menuFromWeb.getMenuId());
//
//        //call repo //save menu
//        manageRepository.save(menu);
//
//        //return manage
//        return manage;

        return "success";
    }

    public static Member getMember(String memberId){
        member = new Member();
        member.setUsername(memberId);

        return member;
    }
}
