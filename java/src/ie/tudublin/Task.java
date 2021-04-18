package ie.tudublin;

import processing.data.TableRow;

public class Task {
    private String task;
    private float start;
    private float end;

    public Task(TableRow row){
        this(
            row.getString("Task"),
            row.getFloat("Start"),
            row.getFloat("End")
        );
    }

    public Task(String task, float start, float end) {
        this.setTask(task);
        this.setStart(start);
        this.setEnd(end);
    }

    public float getEnd() {
        return end;
    }

    public void setEnd(float end) {
        this.end = end;
    }

    public float getStart() {
        return start;
    }

    public void setStart(float start) {
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
