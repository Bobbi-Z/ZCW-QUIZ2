package rocks.zipcode.io.quiz3.collections;

/**
 * @author leon on 10/12/2018.
 */
public class Lab{

    private String labName;
    private LabStatus status;

    public Lab() {
    this(null);
    }

    public Lab(String labName) {
        this.labName = labName;

    }

    public String getName() {
        return labName;
    }

    public void setStatus(LabStatus status) {
        this.status = status;
    }

    public LabStatus getStatus() {

        return status;
    }
}
