/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 first_name last_name
 */
package ex46.base;

import java.util.ArrayList;
import java.util.Arrays;

public class WordCounter {
	public ArrayList<Word> wordCount;
	public ArrayList<String> allWords;


	public WordCounter() {
		allWords = new ArrayList<>();
		wordCount = new ArrayList<>();
	}

	public void addWords(String text) {
		String[] newWordsArray = text.replace("\n", " ").split(" ");
		allWords.addAll(Arrays.asList(newWordsArray));
		allWords.removeIf(word -> word.equals(""));
		updateWordCount();
	}

	private void updateWordCount() {
		int lowerBound = getTotalWords();
		int upperBound = allWords.size();

		for (int i = lowerBound; i < upperBound; i++) {
			boolean flag = false;

			for (Word word : wordCount) {
				if (word.getWord().contentEquals(allWords.get(i))) {
					word.setCount(word.getCount() + 1);
					flag = true;
				}
			}

			if(!flag) {
				wordCount.add(new Word(allWords.get(i), 1));
			}

		}
		sortByFrequency();
	}

	private void sortByFrequency() {
		for (int i = 0; i < wordCount.size(); i++) {

			for (int j = i; j < wordCount.size(); j++) {

				if(wordCount.get(j).getCount() > wordCount.get(i).getCount())
					wordCount.add(i, wordCount.remove(j));
			}
		}
	}

	public int getUniqueTotal() {
		return wordCount.size();
	}

	public int getTotalWords() {
		int total=0;
		for (Word word : wordCount)
			total += word.getCount();
		return total;
	}

	public String toGraph() {

		StringBuilder tempWord;
		StringBuilder output = new StringBuilder();
		for (Word word : wordCount) {

			tempWord = new StringBuilder(word.getWord());

			tempWord.append(":");
			while(tempWord.length() < 20) {
				tempWord.append(" ");
			}

			output.append(tempWord);

			for (int i = 0; i < word.getCount(); i++) {
				output.append("*");
			}
			output.append("\n");
		}


		return output.toString();
	}
}
