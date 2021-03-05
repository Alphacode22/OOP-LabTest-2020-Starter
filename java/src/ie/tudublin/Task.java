package ie.tudublin;

import processing.data.TableRow;

public class Task {
    private String task;
    private String start;
    private String end;

    public Task(TableRow row){
        this(
            row.getString("Task"),
            row.getString("Start"),
            row.getString("End")
        );
    }

    public Task(String task, String start, String end) {
        this.setTask(task);
        this.setStart(start);
        this.setEnd(end);
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    @Override
    public String toString() {
        return "Tasks [end=" + end + ", start=" + start + ", task=" + task + "]";
    }
}
