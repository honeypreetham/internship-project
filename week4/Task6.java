public class Task6 {
    private int id;
    private String name;
    private String course;
    private int age;

    public Task6(int id, String name, String course, int age) {
        this.id = id;
        this.name = name;
        this.course = course;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCourse() {
        return course;
    }

    public int getAge() {
        return age;
    }

    // Uses StringBuilder for dynamic output formatting
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("| %-6d | %-20s | %-5d | %-25s |", id, name, age, course));
        return sb.toString();
    }
}