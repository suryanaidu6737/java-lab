// Program to demonstrate insert and delete using StringBuffer
class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("HelloWorld");
        System.out.println("Original: " + sb);
        sb.insert(5, ' ');
        System.out.println("After insert: " + sb);
        sb.delete(5, 6);
        System.out.println("After delete: " + sb);
    }
}
