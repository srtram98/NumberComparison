package model;

/**
 * @author Spencer Tramontina - srtramontina
 * CIS175 - Spring 2024
 * Feb 8, 2024
 */
public class NumberComparison {
	
	private int userNum1;
	private int userNum2;
	private int bigNum;
	private int smallNum;
	private int difference;
	private boolean isEqual;
	
	public NumberComparison() {
		super();
	}

	public NumberComparison(int userNum1, int userNum2) {
		super();
		this.userNum1 = userNum1;
		this.userNum2 = userNum2;
		makeComparison(userNum1, userNum2);
	}
	
	public int getUserNum1() {
		return userNum1;
	}

	public void setUserNum1(int userNum1) {
		this.userNum1 = userNum1;
	}

	public int getUserNum2() {
		return userNum2;
	}

	public void setUserNum2(int userNum2) {
		this.userNum2 = userNum2;
	}

	public int getBigNum() {
		return bigNum;
	}

	public void setBigNum(int bigNum) {
		this.bigNum = bigNum;
	}

	public int getSmallNum() {
		return smallNum;
	}

	public void setSmallNum(int smallNum) {
		this.smallNum = smallNum;
	}
	
	public int getDifference() {
		return difference;
	}

	public void setDifference(int difference) {
		this.difference = difference;
	}

	public boolean isEqual() {
		return isEqual;
	}

	public void setEqual(boolean isEqual) {
		this.isEqual = isEqual;
	}

	public void makeComparison(int userNum1, int userNum2) {
		
		if (userNum1 > userNum2) {
			setEqual(false);
			setBigNum(userNum1);
			setSmallNum(userNum2);
			setDifference(userNum1 - userNum2);
		}
		else if (userNum1 < userNum2) {
			setEqual(false);
			setBigNum(userNum2);
			setSmallNum(userNum1);
			setDifference(userNum2 - userNum1);
		}
		else {
			setEqual(true);
			setDifference(0);
		}
		
	}

	@Override
	public String toString() {
		
		if (this.isEqual) {
			return "Your numbers " + userNum1 + " and " + userNum2 + " are equal. The difference is: " + difference;
		}
		else {
			return bigNum + " is a bigger number than " + smallNum + ", with a difference of: " + difference;
		}
	}
	
	
}
