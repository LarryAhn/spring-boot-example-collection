package com.geekswise;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Ahn
 */
public interface MemberRepository extends JpaRepository<MemberEntity, String> {

}
