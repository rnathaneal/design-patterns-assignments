package main.java.net.media.training.designpattern.adapter;

import net.media.training.designpattern.adapter.Employee;
import net.media.training.designpattern.adapter.LeaveRecord;
import net.media.training.designpattern.adapter.thirdparty.ThirdPartyLeaveRecord;

public class LeaveRecordAdapter  implements LeaveRecord{
    
    ThirdPartyLeaveRecord leaveRecord = new ThirdPartyLeaveRecord();

    public String getMostAbsentEmployee(){
        return leaveRecord.getMostAbsentEmployee().getName();
    };

    public int getEmployeeAbsences(String employeeName){
        return leaveRecord.getEmployeeAbsences(new Employee(employeeName));
    };
}
