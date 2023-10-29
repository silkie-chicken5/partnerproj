package codeAlong4;

import java.util.ArrayList;

public class ArrayExample {

  private int[] numbers;
  private ArrayList<String> coolWords;

  public ArrayExample(){
    this.numbers = new int[10];
    this.populateArray();
    this.coolWords = new ArrayList<>();
    this.coolWords.add("Andy");
    this.coolWords.add("Django");
    this.coolWords.add("CodeAlong");
  }

  private void populateArray() {
    for(int i = 0; i <= 10; i++) {
      this.numbers[i] = i;
    }
  }

  public void printArray() {
    for(int i = 0; i < 10; i++) {
      System.out.println("numbers[" + i + "] is " + this.numbers[i]);
    }
  }

  public void changeArrayList() {
    for (String word: this.coolWords) {
      System.out.println(word);
      if (word.equals("Andy")) {
        this.coolWords.remove(word);
      }
    }
  }
}
