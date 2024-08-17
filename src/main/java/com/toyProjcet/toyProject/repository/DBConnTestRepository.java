package com.toyProjcet.toyProject.repository;

// JpaRepository 의 메소드를 상속받는 인터페이스를 만든다. 몸체를 직접 구현하지 않아도, Hibernate 가 자동으로 만들어주므로 이 한 줄이면 된다.
import com.toyProjcet.toyProject.domain.DBConnTest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DBConnTestRepository extends JpaRepository<DBConnTest, Long>{
}
