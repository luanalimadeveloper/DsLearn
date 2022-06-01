package com.devsuperior.dslearnbds.entities;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tb_content")
public class Content extends Lesson{
	private static final long serialVersionUID = 1L;
	
	private String textContent;
	private String viedeoUri;
	
	public Content() {
		
	}

	public Content(Long id, String title, Integer position, Section section, String textContent, String viedeoUri) {
		super(id, title, position, section);
		this.textContent = textContent;
		this.viedeoUri = viedeoUri;
	}

	public String getTextContent() {
		return textContent;
	}

	public void setTextContent(String textContent) {
		this.textContent = textContent;
	}

	public String getViedeoUri() {
		return viedeoUri;
	}

	public void setViedeoUri(String viedeoUri) {
		this.viedeoUri = viedeoUri;
	}

}
