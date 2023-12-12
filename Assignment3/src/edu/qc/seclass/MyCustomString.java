package edu.qc.seclass;

public class MyCustomString implements MyCustomStringInterface{

    String currentString = null;

    public String getString() {

        return this.currentString;
    }

    public void setString(String string) {
        this.currentString = string;
    }

    public int countNumbers() {
        if(this.currentString.isEmpty()){ //return 0, if string empty
            return 0;
        }
        if (this.currentString==null){ //throw null, if string is null
            throw new NullPointerException("NullPointerException: the current is null");
        }

        int countDigit =0;

        for(int i= 0; i<this.currentString.length();i++){

            // temp return specified index in a string
            char temp = this.currentString.charAt(i);

            //check if it's digit, else skip this and move forward
            if(!Character.isDigit(temp)) continue;

            //increment if it's last digit
            else if(i==this.currentString.length()-1){
                countDigit++;
            }

            //check if next element is a digit, else skip this and move forward
            else if(Character.isDigit(this.currentString.charAt(i+1)))continue;

            // is a digit
            else{
                countDigit++;
            }
        }

        return countDigit;
    }

    public String getEveryNthCharacterFromBeginningOrEnd(int n, boolean startFromEnd) {

        String result = "" ;

        //empty or less than n
        if(this.currentString.isEmpty()||this.currentString.length()<n){
            //return empty string
            return "";

        }

        //throw IllegalArgumentException message, if it satisfied the condition
        if(n<=0){
            throw new IllegalArgumentException("IllegalArgumentException: n is either less than zero or is 0");
        }

        //throw NullPointerException, if its satisfied the condition
        if(n>0 && this.currentString==null){
            throw new NullPointerException("NullPointerException: The current string is null and is greater than zero");
        }

        //temporary String
        String tempString = "";
        //do not flip
        if(!startFromEnd){
            tempString = this.currentString;
        }
        //flip the tempString as it is true
        else
            tempString = new StringBuilder(this.currentString).reverse().toString();

        int start = 1;
        while((n*start) <= tempString.length()){
            //get actual index
            int pointer = (n*start)-1;
            result = result +String.valueOf(tempString.charAt(pointer));
            start++;
        }

        //flip the result if it starts from end
        if(startFromEnd){
            result = new StringBuilder(result).reverse().toString();

        }

        return result;
    }

    public void convertDigitsToNamesInSubstring(int startPosition, int endPosition) {

        if(startPosition > endPosition){
            throw new IllegalArgumentException("Illegal Argument Exception: startPosition > endPosition");
        }
        if ((startPosition<= endPosition) && (startPosition<1 || endPosition<1 ||
                startPosition>this.currentString.length()||endPosition>this.currentString.length())){
            throw new MyIndexOutOfBoundsException("MyIndexOutOfBoundsException: Index out of bonds");
        }
        if(startPosition<=endPosition && (startPosition>0 && endPosition>0 ) && this.currentString==null){
            throw new NullPointerException("NullPointerException: The string is empty");
        }

        String temp ="";
        //leftHandString
        String lhs = "";
        //rightHandString
        String rhs = "";
        //the first letter is considered to be 1
        int startIndex = startPosition-1;
        int endIndex = endPosition;
        //temp holds a substring of the input
        temp= currentString.substring(startIndex, endIndex);

        lhs = currentString.substring(0, startIndex);
        rhs = currentString.substring(endIndex);

        //replace digits
        temp= temp.replaceAll("0","Zero");
        temp= temp.replaceAll("1","One");
        temp= temp.replaceAll("2","Two");
        temp= temp.replaceAll("3","Three");
        temp= temp.replaceAll("4","Four");
        temp= temp.replaceAll("5","Five");
        temp= temp.replaceAll("6","Six");
        temp= temp.replaceAll("7","Seven");
        temp= temp.replaceAll("8","Eight");
        temp= temp.replaceAll("9","Nine");


        //Set string to leftHandSide Converted String RightHandSide
        setString(lhs+temp+rhs);


    }
}
