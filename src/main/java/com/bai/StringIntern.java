package com.bai;

/**
 * Created by IntelliJ IDEA
 * project: jvmStudy
 * date:    2016/11/29
 * user:    bailinwei
 */
public class StringIntern {
	public static void main(String[] args) {
		String linwbai = new StringBuilder("lin").append("w").append("bai").toString();
		System.out.println(linwbai.intern() == linwbai);

		String java = new StringBuilder("ja").append("va").toString();
		System.out.println(java.intern() == java);
	}
}
