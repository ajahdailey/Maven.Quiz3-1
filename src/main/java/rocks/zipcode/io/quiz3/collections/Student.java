package rocks.zipcode.io.quiz3.collections;

import jdk.net.SocketFlow;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;


/**
 * @author leon on 10/12/2018.
 */
public class Student {
    private Map<Lab, LabStatus> status;


    public Student() {

    }

    public Student(List<Lab> labs){ }

    public Lab getLab(String labName) {
        for(Lab lab : status.keySet()) {
            if (labName.equals(lab.getName())) {
                return lab;
            }
        }

        return null;
    }

    public void setLabStatus(String labName, LabStatus labStatus) {
        Lab lab = getLab(labName);
        if (lab == null) {
            throw new UnsupportedOperationException();
        }
        status.put(lab, labStatus);

    }

    public void forkLab(Lab lab) {
        status.put(lab, LabStatus.PENDING);
    }

    public LabStatus getLabStatus(String labName){
        Lab lab = getLab(labName);
        return status.get(lab);
    }



}
