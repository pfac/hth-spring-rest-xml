package com.iampfac.hth.spring.mvc.xml;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Greeting {

	private String subject;

	/* ===== CONSTRUCTORS ===== */

	public Greeting() {
		this(null);
	}

	public Greeting(final String subject) {
		setSubject(subject);
	}

	/* ===== FROM: java.lang.Object ===== */

	@Override
	public String toString() {
		return String.format("Hello %s!", getSubject());
	}

	/* ===== GETTERS ===== */

	@XmlElement
	public String getSubject() {
		return subject;
	}

	/* ===== SETTERS ===== */

	protected void setSubject(final String subject) {
		this.subject = subject;
	}
}
