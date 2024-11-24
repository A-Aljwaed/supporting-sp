package com.space.suppourting.repos;


import com.space.suppourting.etity.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepos  extends JpaRepository<Member , Long>
{





}
