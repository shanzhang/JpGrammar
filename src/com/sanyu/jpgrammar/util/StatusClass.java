package com.sanyu.jpgrammar.util;

public class StatusClass {

	private static final StatusClass statusClass = new StatusClass();

	private static String level;

	private static Integer gramSeqForN1;

	private static Integer gramSeqForN2;

	private static Integer pageForN1;

	private static Integer pageForN2;

	private static Integer favPageForN1;

	private static Integer favPageForN2;

	private static Integer favN1Count;

	private static Integer favN2Count;

	private StatusClass() {
		pageForN1 = 0;
		pageForN2 = 0;
		favPageForN1 = 0;
		favPageForN2 = 0;
		favN1Count = 231;
		favN2Count = 170;
	}

	public static StatusClass getInstance() {
		return statusClass;
	}

	public void nextWord() {
		if (getLevel().equals("1")) {
			setGramSeqForN1(getGramSeqForN1() + 1);
		} else if (getLevel().equals("2")) {
			setGramSeqForN2(getGramSeqForN2() + 1);
		}
	}

	public void previousWord() {
		if (getLevel().equals("1")) {
			setGramSeqForN1(getGramSeqForN1() - 1);
		} else if (getLevel().equals("2")) {
			setGramSeqForN2(getGramSeqForN2() - 1);
		}
	}

	public void nextPage() {
		if (getLevel().equals("1")) {
			setPageForN1(getPageForN1() + 50);
		} else if (getLevel().equals("2")) {
			setPageForN2(getPageForN2() + 50);
		}
	}

	public void previousPage() {
		if (getLevel().equals("1")) {
			setPageForN1(getPageForN1() - 50);
		} else if (getLevel().equals("2")) {
			setPageForN2(getPageForN2() - 50);
		}
	}

	public void nextFavPage() {
		if (getLevel().equals("1")) {
			setFavPageForN1(getFavPageForN1() + 50);
		} else if (getLevel().equals("2")) {
			setFavPageForN2(getFavPageForN2() + 50);
		}
	}

	public void previousFavPage() {
		if (getLevel().equals("1")) {
			setFavPageForN1(getFavPageForN1() - 50);
		} else if (getLevel().equals("2")) {
			setFavPageForN2(getFavPageForN2() - 50);
		}
	}

	public void setPage(Integer index) {
		if (getLevel().equals("1")) {
			setPageForN1(index);
		} else if (getLevel().equals("2")) {
			setPageForN2(index);
		}
	}

	public void setFavPage(Integer index) {
		if (getLevel().equals("1")) {
			setFavPageForN1(index);
		} else if (getLevel().equals("2")) {
			setFavPageForN2(index);
		}
	}

	public void setGramSeq(Integer index) {
		if (getLevel().equals("1")) {
			setGramSeqForN1(index + getPageForN1());
		} else if (getLevel().equals("2")) {
			setGramSeqForN2(index + getPageForN2());
		}
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String levelStr) {
		level = levelStr;
	}

	public Integer getGramSeqForN1() {
		return gramSeqForN1;
	}

	public void setGramSeqForN1(Integer gramSeqForN1Str) {
		if (gramSeqForN1Str >= 1 && gramSeqForN1Str <= 231) {
			gramSeqForN1 = gramSeqForN1Str;
		}
	}

	public Integer getGramSeqForN2() {
		return gramSeqForN2;
	}

	public void setGramSeqForN2(Integer gramSeqForN2Str) {
		if (gramSeqForN2Str >= 1 && gramSeqForN2Str <= 170) {
			gramSeqForN2 = gramSeqForN2Str;
		}
	}

	public Integer getPageForN1() {
		return pageForN1;
	}

	public void setPageForN1(Integer pageForN1Str) {
		if (pageForN1Str >= 0 && pageForN1Str <= 231) {
			pageForN1 = pageForN1Str;
		}
	}

	public Integer getPageForN2() {
		return pageForN2;
	}

	public void setPageForN2(Integer pageForN2Str) {
		if (pageForN2Str >= 0 && pageForN2Str <= 170) {
			pageForN2 = pageForN2Str;
		}
	}

	public Integer getFavPageForN1() {
		return favPageForN1;
	}

	public void setFavPageForN1(Integer favPageForN1Int) {
		if (favPageForN1Int >= 0 && favPageForN1Int <= favN1Count) {
			favPageForN1 = favPageForN1Int;
		}
	}

	public Integer getFavPageForN2() {
		return favPageForN2;
	}

	public void setFavPageForN2(Integer favPageForN2Int) {
		if (favPageForN2Int >= 0 && favPageForN2Int <= favN2Count) {
			favPageForN2 = favPageForN2Int;
		}
	}

	public Integer getFavN1Count() {
		return favN1Count;
	}

	public void setFavN1Count(Integer favN1CountInt) {
		favN1Count = favN1CountInt;
	}

	public Integer getFavN2Count() {
		return favN2Count;
	}

	public void setFavN2Count(Integer favN2CountInt) {
		favN2Count = favN2CountInt;
	}

	public Integer getGramSeq() {
		if (getLevel().equals("1")) {
			return getGramSeqForN1();
		} else if (getLevel().equals("2")) {
			return getGramSeqForN2();
		}
		return null;
	}

	public Integer getPage() {
		if (getLevel().equals("1")) {
			return getPageForN1();
		} else if (getLevel().equals("2")) {
			return getPageForN2();
		}
		return null;
	}

	public Integer getFavPage() {
		if (getLevel().equals("1")) {
			return getFavPageForN1();
		} else if (getLevel().equals("2")) {
			return getFavPageForN2();
		}
		return null;
	}

	public void setFavCount(Integer index) {
		if (getLevel().equals("1")) {
			setFavN1Count(index);
		} else if (getLevel().equals("2")) {
			setFavN2Count(index);
		}
	}

}
