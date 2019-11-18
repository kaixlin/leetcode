//给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
//
// 示例 1:
//
// 输入: 123
//输出: 321
//
//
// 示例 2:
//
// 输入: -123
//输出: -321
//
//
// 示例 3:
//
// 输入: 120
//输出: 21
//
//
// 注意:
//
// 假设我们的环境只能存储得下 32 位的有符号整数，则其数值范围为 [−231, 231 − 1]。请根据这个假设，如果反转后整数溢出那么就返回 0。
// Related Topics 数学



//leetcode submit region begin(Prohibit modification and deletion)
class Reverse {
    public int reverse(int x) {
        int r = 0;

        String xStr = String.valueOf(x);
        boolean isPositive = true;
        if (xStr.charAt(0) == '-') {
            isPositive = false;
        }
        char[] rChars = new char[isPositive ? xStr.length() : xStr.length() - 1];

        for (int i = 0; i < rChars.length; i++) {
            rChars[i] = xStr.charAt(xStr.length() - 1 - i);
        }
        try {
            r = Integer.valueOf(String.valueOf(rChars));
        } catch (NumberFormatException ex) {
            r = 0;
        }

        return isPositive ? r : -r;
    }
}
//leetcode submit region end(Prohibit modification and deletion)