package ie.tudublin;

public class Tasks {
    private String task;
    private String start;
    private String end;

    public Tasks(String task, String start, String end) {
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
}
