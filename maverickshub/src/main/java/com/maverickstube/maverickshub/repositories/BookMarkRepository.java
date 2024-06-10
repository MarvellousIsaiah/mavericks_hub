package com.maverickstube.maverickshub.repositories;

import com.maverickstube.maverickshub.models.BookMark;
import com.maverickstube.maverickshub.models.Media;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookMarkRepository  extends JpaRepository<BookMark, Long> {
    BookMark findBookMarkById(Long id);
}
