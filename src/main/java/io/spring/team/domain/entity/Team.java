package io.spring.team.domain.entity;


import jakarta.persistence.*;
import lombok.*;

@Entity @Table("teams")
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Builder @Getter
public class Team {
    @Id @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
}
