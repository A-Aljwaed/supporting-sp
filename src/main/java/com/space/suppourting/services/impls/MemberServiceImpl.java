package com.space.suppourting.services.impls;

import com.space.suppourting.etity.Member;
import com.space.suppourting.repos.MemberRepos;
import com.space.suppourting.services.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MemberServiceImpl implements MemberService {

@Autowired
private MemberRepos memberRepos;

@Autowired
public MemberServiceImpl(MemberRepos memberRepos) {

    super();
    this.memberRepos=memberRepos;
}
    @Override
    public List<Member> getAllMember() {
        return memberRepos.findAll();
    }

    @Override
    public Member saveMember(Member member) {
        return memberRepos.save(member);
    }

    @Override
    public Member getmEMBERId(Long id) {
        return memberRepos.findById(id).get();
    }

    @Override
    public Member updateMember(Member member) {
    return memberRepos.save(member);
    }

    @Override
    public Member deleteMember(Long id) {
    Member member = memberRepos.findById(id).get();
    memberRepos.delete(member);

        return null;
    }
}
