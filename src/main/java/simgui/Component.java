package simgui;

public class Component {

    private String name;
    private String id;
    private String type;
    private String[] connections;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String[] getConnections() {
        return connections;
    }

    public void setConnections(String[] connections) {
        this.connections = connections;
    }

    public String getRequestServiceFieldLabel() {
        return String.format("Request %s Service Time Seconds (%s)", type, name);
    }

    public String getRequestQueueFieldLabel() {
        return String.format("Request %s Queue Time Seconds (%s)", type, name);
    }

    public String getResponseServiceFieldLabel() {
        return String.format("Response %s Service Time Seconds (%s)", type, name);
    }

    public String getResponseQueueFieldLabel() {
        return String.format("Response %s Queue Time Seconds (%s)", type, name);
    }

    @Override
    public String toString() {
        return name;
    }
}
