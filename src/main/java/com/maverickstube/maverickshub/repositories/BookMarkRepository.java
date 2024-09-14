package com.maverickstube.maverickshub.repositories;

import com.maverickstube.maverickshub.models.BookMark;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookMarkRepository  extends JpaRepository<BookMark, Long> {
    BookMark findBookMarkById(Long id);
}
