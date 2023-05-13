package com.codingrecipe.member.repository;

import com.codingrecipe.member.entity.MemberEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MemberRepository extends JpaRepository<MemberEntity,Long> {

    //이메일로 회원 정보 조회(select * from membber_Tabble where member_email=? ㅇ이거랑 비슷
    Optional<MemberEntity> findByMemberEmail(String memberEmail);

}
