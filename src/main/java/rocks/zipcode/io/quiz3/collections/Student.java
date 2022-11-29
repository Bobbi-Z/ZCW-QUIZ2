package rocks.zipcode.io.quiz3.collections;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 10/12/2018.
 */
public class Student  {

   private ArrayList<Lab> labs = new ArrayList<>();
    private LabStatus status;

    public Student() {
    this(null);

    }

    public Student(ArrayList<Lab> labs) {
        this.labs = labs;

    }

    public Lab getLab(String labName) {
    for (Lab lab : labs){
        if (lab.getName().equals(labName)) {
            return lab;
        }
    }
    return null;
    }

    public void setLabStatus(String labName, LabStatus status) {
        Lab lab = this.getLab(labName);
        lab.setStatus(status);
    }


    public void forkLab(Lab lab) {
        this.setLabStatus(lab.getName(), status);
        this.labs.add(lab);

    }

    public LabStatus getLabStatus(String labName) {

        return getLab(labName).getStatus();
    }
}
