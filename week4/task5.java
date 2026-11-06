public class task5 {
    public static void main(String[] args) {
        // 1. Create a string using StringBuilder
        StringBuilder sb = new StringBuilder("Java Developer");
        System.out.println("1. Initial StringBuilder: " + sb);

        // 2. Append additional text
        sb.append(" Internship");
        System.out.println("2. After Append:          " + sb);

        // 3. Insert text at a specific position (index 5)
        sb.insert(5, "Backend ");
        System.out.println("3. After Insert:          " + sb);

        // 4. Replace a portion of the text (indices 5 to 12)
        sb.replace(5, 12, "Full Stack");
        System.out.println("4. After Replace:         " + sb);

        // 5. Reverse the final string
        sb.reverse();
        System.out.println("5. After Reverse:         " + sb);
    }
}