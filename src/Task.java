import java.time.LocalDate;
import java.time.LocalDateTime;

public abstract class Task {
    private static int counter = 0;
    private final int id;
    private final String title;     //заголовок задачи
    private final String description;    //описание
    private final LocalDateTime taskDateTime;
    private final TaskType taskType;     //тип задачи

    public Task(String title, String description, LocalDateTime taskDateTime, TaskType taskType) {
        this.id = counter++;
        this.title = title;
        this.description = description;
        this.taskDateTime = taskDateTime;
        this.taskType = taskType;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public LocalDateTime getTaskDateTime() {
        return taskDateTime;
    }

    public TaskType getTaskType() {
        return taskType;
    }

    public abstract boolean appearsIn(LocalDate localDate);    //для повторяющихся задач

    public abstract Repeatability getRepeatabilityType();    //возращает тип повтора
}
