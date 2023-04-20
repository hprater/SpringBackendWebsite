package edu.uark.csce.databasehb.web.job;

import lombok.Data;

import static org.apache.commons.lang3.StringUtils.isAlpha;
import static org.apache.commons.lang3.StringUtils.isBlank;

@Data
public class JobForm {
    private Integer jobId;
    private String companyName;
    private String jobTitle;
    private Integer salary;
    private Integer major;

    //create method check if inputs are valid.boolean
    public Boolean isValid() {
        if(isBlank(this.jobTitle) || !isAlpha(this.jobTitle)) return false;

        if(isBlank(this.companyName) || !isAlpha(this.companyName)) return false;
        return true;
    }
}
