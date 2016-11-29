package com.bai;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA
 * project: jvmStudy
 * date:    2016/11/29
 * user:    bailinwei
 *
 * VM Args: -XX:PermSize=10M -XX:MaxPermSize=10M
 */
public class RuntimeConstantPoolOOM {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		int i = 0;
		for (;;) {
			list.add(String.valueOf(i++).intern());
		}
	}
}