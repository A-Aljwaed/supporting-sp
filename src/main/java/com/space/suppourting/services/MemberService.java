package com.space.suppourting.services;

import com.space.suppourting.etity.Member;
import com.space.suppourting.etity.Student;

import java.util.List;

public interface MemberService
{

    List<Member> getAllMember();

    Member saveMember(Member  member);

    Member  getmEMBERId(Long id);

    Member updateMember(Member member);

    Member deleteMember(Long id);






}
