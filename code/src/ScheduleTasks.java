import java.util.*;

public class ScheduleTasks {
    public static List<Task> scheduleTasks(List<Task> tasks) {
        // Sắp xếp các hoạt động theo thứ tự tăng dần của thời gian kết thúc
        Collections.sort(tasks, Comparator.comparing(Task::getEndTime));

        List<Task> selectedTasks = new ArrayList<>();
        Task lastSelectedTask = null;

        for (Task task : tasks) {
            if (lastSelectedTask == null || task.getStartTime() >= lastSelectedTask.getEndTime()) {
                selectedTasks.add(task);
                lastSelectedTask = task;
            }
        }

        return selectedTasks;
    }

    public static void main(String[] args) {
        // Code minh họa việc sử dụng hàm scheduleTasks
    }
}

class Task {
    private int startTime;
    private int endTime;

    public Task(int startTime, int endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public int getStartTime() {
        return startTime;
    }

    public int getEndTime() {
        return endTime;
    }
}
