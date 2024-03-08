package com.moon.questgraph.comment.entity;

import com.moon.questgraph.global.entity.TimeStamped;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Builder
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PROTECTED)

@Entity
public class Comment extends TimeStamped {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Long memberId;

    @Column(nullable = false)
    private Long questId;

    @Column(nullable = false)
    private String content;

    @Column(nullable = false)
    private Long likes;
}