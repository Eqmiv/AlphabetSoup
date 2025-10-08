// Eliazar Montemayor IV - This project produce soup that will only contain letters that spell out specific words



public class Soup {
    //these are instance variables 
    private String letters;
    private String company;

    //this is a constructor it sets the instance variables (more on this later in the year)
    public Soup(){
        letters ="";
        company = "none";
    }


    //sets the name of the company to the provided name
    public void setCompany(String company){
        this.company = company;
    }

    //returns the company name
    public String getCompany(){
        return company;
    }

    //returns letters
    public String getLetters(){
        return letters;
    }

//below are the functions you'll be writing.

// PostCondition - Creates a pool of letters called letters
// PreCondition - It needs the word
    //adds a word to the pool of letters known as "letters"
    public void add(String word){
        letters += word;
    }

// PostCondition - Letters has a word in the pool of letters
// PreCondition - It needs the length of the word
    //Use Math.random() to get a random character from the letters string and return it.
    public String randomLetter(){
    int x = (int)(Math.random()*letters.length());
        return      letters.substring(x,x+1);

    }

// PostCondition - Company name exists, puts word in the center
// PreCondition - It needs the company name and where the center is
    //returns the letters currently stored with the company name placed directly in the center of all
    //the letters
    public String companyCentered(){

        return letters.substring(0,letters.length()/2)+company+letters.substring(letters.length()/2);
    }

// PostCondition - removes the first vowel that appears in the word
// PreCondition - Needs a vowel
    //should remove the first available vowel from letters. If there are no vowels this method has no effect.
    public void removeFirstVowel(){
        letters = letters.replaceFirst("[AEIOUaeiou]","");
    }
// PostCondition - removes a random number of letters in a random spot of the word
// PreCondition - Needs the length of the word, the random number to remove letters, 
    //should remove "num" letters from a random spot in the string letters. You may assume num never exceeds the length of the string.
    public void removeSome(int num){
        int x = (int)(Math.random()*(letters.length()-num));
        letters = letters.substring(0,x)+letters.substring(x+num);
    }
// PostCondition - removes the word "word" from the letters, 0therwise it doesn't do anything
// PreCondition - needs the word "word"
    //should remove the word "word" from the string letters. If the word is not found in letters then it does nothing.
    public void removeWord(String word){
        letters = letters.replaceFirst("word", "");
    }
}
