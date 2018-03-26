package wulei.leetcode.traning;

import org.testng.reporters.jq.Main;

/**
 * https://leetcode-cn.com/problems/reverse-integer/description/
给定一个范围为 32 位 int 的整数，将其颠倒。

例 1:
输入: 123
输出:  321

例 2:
输入: -123
输出: -321

例 3:
输入: 120
输出: 21

注意:
假设我们的环境只能处理 32 位 int 范围内的整数。根据这个假设，如果颠倒后的结果超过这个范围，则返回 0。
**/
public class LeetCode_7 { 
    public static int reverse(int x) {
        long tmp = x;
        // 防止结果溢出
        long result = 0;

        while (tmp != 0) {
            result = result * 10 + tmp % 10;
            tmp = tmp / 10;
        }

        // 溢出判断 
        if (result < Integer.MIN_VALUE || result > Integer.MAX_VALUE) {
            result = 0;
        }

        return (int) result;
    }
    public static void main(String[] args) {
		System.out.println(reverse(-56748));
	}
}