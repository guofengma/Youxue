package com.mycompany.myapp.repository;

import com.mycompany.myapp.domain.TuanMember;
import org.springframework.stereotype.Repository;

import org.springframework.data.jpa.repository.*;


/**
 * Spring Data JPA repository for the TuanMember entity.
 */
@SuppressWarnings("unused")
@Repository
public interface TuanMemberRepository extends JpaRepository<TuanMember, Long> {

}
