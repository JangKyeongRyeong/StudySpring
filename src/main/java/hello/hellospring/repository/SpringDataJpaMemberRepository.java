package hello.hellospring.repository;

import hello.hellospring.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

// interface가 interface를 받을 때는 extends
// interface는 다중 상속이 가능하다.
public interface SpringDataJpaMemberRepository extends JpaRepository<Member, Long>, MemberRepository {

    // findByName() JPQL : select m from Member m where m.name = ?
    @Override
    Optional<Member> findByName(String name);
}
