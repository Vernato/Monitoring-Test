package com.books.Monitoring.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="BOOK")
public class BookEntity implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID_BOOK")
	private Long id_book;
	
	@Column(name="CHAVE_BOOK")
	private Long chave_book;
	
	@Column(name="VALUE_BOOK")
	private Double value_book;

	public BookEntity() {
	}

	public BookEntity(Long id_book, Long chave_book, Double value_book) {
		this.id_book = id_book;
		this.chave_book = chave_book;
		this.value_book = value_book;
	}

	public Long getId_book() {
		return id_book;
	}

	public void setId_book(Long id_book) {
		this.id_book = id_book;
	}

	public Long getChave_book() {
		return chave_book;
	}

	public void setChave_book(Long chave_book) {
		this.chave_book = chave_book;
	}

	public Double getValue_book() {
		return value_book;
	}

	public void setValue_book(Double value_book) {
		this.value_book = value_book;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((chave_book == null) ? 0 : chave_book.hashCode());
		result = prime * result + ((id_book == null) ? 0 : id_book.hashCode());
		result = prime * result + ((value_book == null) ? 0 : value_book.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BookEntity other = (BookEntity) obj;
		if (chave_book == null) {
			if (other.chave_book != null)
				return false;
		} else if (!chave_book.equals(other.chave_book))
			return false;
		if (id_book == null) {
			if (other.id_book != null)
				return false;
		} else if (!id_book.equals(other.id_book))
			return false;
		if (value_book == null) {
			if (other.value_book != null)
				return false;
		} else if (!value_book.equals(other.value_book))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "BookEntity [id_book=" + id_book + ", chave_book=" + chave_book + ", value_book=" + value_book + "]";
	}
	
}
