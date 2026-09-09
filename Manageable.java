import java.util.List;

public interface Manageable {
    void addRecord(Student student);
    void viewAllRecords();
    void searchRecord(String id);
    void updateRecord(String id);
    void deleteRecord(String id);
}