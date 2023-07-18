
public class Reverse {

	public static void main(String[] args) {
		String first = "one";
	    String second = "FiftyThree";
	    

	    System.out.println(reverseString(first.toCharArray()));
	    System.out.println(reverseString(second.toCharArray()));
	   
	  }

	  public static String reverseString(char[] charArray) {
	   
	    if (charArray == null) return "";
	    if (charArray.length == 1) return new String(charArray);

	    int start = 0;
	    int end = charArray.length - 1;

	    while (start < end) {
	      char ch = charArray[start];
	      charArray[start] = charArray[end];
	      charArray[end] = ch;

	      start++;
	      end--;
	    }
	    return new String(charArray);
	  }
	

	}


