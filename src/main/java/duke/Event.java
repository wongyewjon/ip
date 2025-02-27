package duke;

/**
 * Encapsulates an Event task.
 */
public class Event extends Task {
    private String time;

    /**
     * Creates an Event object.
     * @param description The description of the Event object.
     * @param isDone Boolean value of the status of Event.
     * @param time The time of the Event.
     */
    public Event(String description, boolean isDone, String time, PriorityLevel.Priority level) {
        super(description, isDone, level);
        this.time = time;
    }

    /**
     * Returns the String representation of the Event.
     *
     * @return String representation of the Event.
     */
    @Override
    public String toString() {
        return String.format("[E][%s] %s (at: %s) (Priority: %s)", super.getStatusIcon(),
                super.toString(), this.time, super.getPriorityLevel());
    }

    /**
     * Returns the String representation of the Event that is stored in a file.
     * @return String representation of Event.
     */
    @Override
    public String toFileString() {
        return String.format("E | %s | %s | %s | %s", super.getFileIcon(), super.toString(), this.time,
                super.getPriorityLevel());
    }
}
