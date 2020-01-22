package org.fasttrackit.transfer;

import java.time.LocalDate;

public class UpdateTaskRequest {



    private String description;
    private LocalDate deadline;
    private boolean done;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getDeadline() {
        return deadline;
    }

    @Override
    public String toString() {
        return "UpdateTaskRequest{" +
                "description='" + description + '\'' +
                ", deadline=" + deadline +
                ", done=" + done +
                '}';
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public void setDeadline(LocalDate deadline) {
        this.deadline = deadline;

    }

}

