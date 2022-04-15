package com.example.RedditBackend.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.lang.Nullable;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.time.Instant;

@Data
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long postId;

    @Column(name = "postname")
    @NotBlank(message = "post name can not be empty or null")
    private String postName;

    @Column(name = "url")
    @Nullable
    private String url;

    @Nullable
    @Lob
    @Column(name = "description")
    private String description;

    @Column(name = "votecount")
    private Integer voteCount;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "userId", referencedColumnName = "userId")
    private User user;

    private Instant createdDate;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "subId", referencedColumnName = "subId")
    private Subreddit subReddit;

}