package io.github.skomarica.bookmark;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import io.github.skomarica.bookmark.model.Account;
import io.github.skomarica.bookmark.model.Bookmark;
import io.github.skomarica.bookmark.repository.AccountRepository;
import io.github.skomarica.bookmark.repository.BookmarkRepository;

@SpringBootApplication
public class SpringRestTutorialApplication {

	@Bean
	CommandLineRunner init(AccountRepository accountRepository, BookmarkRepository bookmarkRepository) {

		return (String... args) -> Arrays
				.asList("jhoeller,dsyer,pwebb,ogierke,rwinch,mfisher,mpollack,jlong".split(",")).forEach(a -> {
					Account account = accountRepository.save(new Account(a, "password"));
					bookmarkRepository.save(new Bookmark(account, "http://bookmark.com/1/" + a, "A description"));
					bookmarkRepository.save(new Bookmark(account, "http://bookmark.com/2/" + a, "A description"));
				});
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringRestTutorialApplication.class, args);
	}
}
