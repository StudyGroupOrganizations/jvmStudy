package com.bai;

/**
 * Created by IntelliJ IDEA
 * project: jvmStudy
 * date:    2017/1/9
 * user:    bailinwei
 */
public class MinorGC {

	private static final int _1MB = 1024 * 1024;

	public static void main(String[] args) {
//		testAllocation();
		testPretenureSizeThreshold();
	}

	/**
	 * 参数 -verbose:gc -Xms20M -Xmx20M -Xmn10M -XX:+PrintGCDetails -XX:SurvivorRatio=8
	 *
	 * Heap
		 PSYoungGen      total 9216K, used 7823K [0x00000007bf600000, 0x00000007c0000000, 0x00000007c0000000)
		 eden space 8192K, 95% used [0x00000007bf600000,0x00000007bfda3d60,0x00000007bfe00000)
		 from space 1024K, 0% used [0x00000007bff00000,0x00000007bff00000,0x00000007c0000000)
		 to   space 1024K, 0% used [0x00000007bfe00000,0x00000007bfe00000,0x00000007bff00000)
		 ParOldGen       total 10240K, used 4096K [0x00000007bec00000, 0x00000007bf600000, 0x00000007bf600000)
		 object space 10240K, 40% used [0x00000007bec00000,0x00000007bf000010,0x00000007bf600000)
		 Metaspace       used 3069K, capacity 4494K, committed 4864K, reserved 1056768K
		 class space    used 334K, capacity 386K, committed 512K, reserved 1048576K
	 */
	public static void testAllocation() {
		byte[] allocation1,allocation2,allocation3,allocation4;
		allocation1 = new byte[2 * _1MB];
		allocation2 = new byte[2 * _1MB];
		allocation3 = new byte[2 * _1MB];
		allocation4 = new byte[4 * _1MB];
	}

	/**
	 * 参数 -verbose:gc -Xms20M -Xmx20M -Xmn10M -XX:+PrintGCDetails -XX:SurvivorRatio=8 -XX:PretenureSizeThreshold=3145728
	 *
	 */
	public static void testPretenureSizeThreshold() {
		byte[] allocation;
		allocation = new byte[4 * _1MB];
	}
}
