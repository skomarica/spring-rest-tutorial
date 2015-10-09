package io.github.skomarica.bookmark.repository;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.skomarica.bookmark.model.Bookmark;

public interface BookmarkRepository extends JpaRepository<Bookmark, Long> {
	Collection<Bookmark> findByAccountUsername(String username);
}