package com.toyProjcet.toyProject.domain;

import lombok.*;
// javax.persistence.*; = > jakarta.persistence.*;
import jakarta.persistence.*;

@Entity                 //jpa entity 로 선언
@Table(name="DBCONNTEST")    //table 정보
@Getter @Setter         //getter, setter 메소드
@NoArgsConstructor      //인자 없는 기본 생성자
@AllArgsConstructor     //모든 인자 가지는 생성자
@Builder                //빌더 패턴으로 생성하게 해줌.
public class DBConnTest {

    @Id // PK필드선언
    @Column(name="testId", nullable = false) // 테이블 컬럼과 매핑
    @GeneratedValue(strategy = GenerationType.IDENTITY) //auto increment
    private int testId;
}
