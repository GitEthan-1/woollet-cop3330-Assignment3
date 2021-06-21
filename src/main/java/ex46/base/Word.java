/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 first_name last_name
 */
package ex46.base;

public class Word {
	private String word;
	private int count=0;

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	@Override
	public String toString() {
		return "Word{" +
				"word='" + word + '\'' +
				", count=" + count +
				'}';
	}

	public Word(String word, int count) {
		this.word = word;
		this.count = count;
	}
}
