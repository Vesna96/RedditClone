package com.nsi.springredditclone.repository;

import com.nsi.springredditclone.model.Post;
import com.nsi.springredditclone.model.User;
import com.nsi.springredditclone.model.Vote;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface VoteRepository extends JpaRepository<Vote, Long> {
    Optional<Vote> findTopByPostAndUserOrderByVoteIdDesc(Post post, User currentUser);
}
