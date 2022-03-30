package com.books.Monitoring.respositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.books.Monitoring.entities.BookEntity;

@Repository
public interface BookRepository extends JpaRepository<BookEntity,Long>{
	@Query(value = "SELECT * FROM BOOK WHERE CHAVE_BOOK = :chave AND VALUE_BOOK = :value", nativeQuery=true)
	BookEntity findExist(@Param(value="chave")Long chave,@Param(value="value")Double value);

	@Query(value = "SELECT * FROM BOOK WHERE CHAVE_BOOK = :chave", nativeQuery=true)
	BookEntity findByInterval(@Param(value="chave")Long chave);
}
