package com.ssafy.dingdong.domain.member.repository;

import com.ssafy.dingdong.domain.member.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {

}
