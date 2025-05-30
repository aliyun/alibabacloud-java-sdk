// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class AssignJobsRequest extends TeaModel {
    @NameInMap("CallingNumber")
    public java.util.List<String> callingNumber;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>12f3dd08-0c55-44ce-9b64-e69d35ed3a76</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("IsAsynchrony")
    public Boolean isAsynchrony;

    /**
     * <strong>example:</strong>
     * <p>d004cfd2-6a81-491c-83c6-cbe186620c95</p>
     */
    @NameInMap("JobDataParsingTaskId")
    public String jobDataParsingTaskId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>d004cfd2-6a81-491c-83c6-cbe186620c95</p>
     */
    @NameInMap("JobGroupId")
    public String jobGroupId;

    @NameInMap("JobsJson")
    public java.util.List<String> jobsJson;

    /**
     * <strong>example:</strong>
     * <p>json</p>
     */
    @NameInMap("RosterType")
    public String rosterType;

    @NameInMap("StrategyJson")
    public String strategyJson;

    public static AssignJobsRequest build(java.util.Map<String, ?> map) throws Exception {
        AssignJobsRequest self = new AssignJobsRequest();
        return TeaModel.build(map, self);
    }

    public AssignJobsRequest setCallingNumber(java.util.List<String> callingNumber) {
        this.callingNumber = callingNumber;
        return this;
    }
    public java.util.List<String> getCallingNumber() {
        return this.callingNumber;
    }

    public AssignJobsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public AssignJobsRequest setIsAsynchrony(Boolean isAsynchrony) {
        this.isAsynchrony = isAsynchrony;
        return this;
    }
    public Boolean getIsAsynchrony() {
        return this.isAsynchrony;
    }

    public AssignJobsRequest setJobDataParsingTaskId(String jobDataParsingTaskId) {
        this.jobDataParsingTaskId = jobDataParsingTaskId;
        return this;
    }
    public String getJobDataParsingTaskId() {
        return this.jobDataParsingTaskId;
    }

    public AssignJobsRequest setJobGroupId(String jobGroupId) {
        this.jobGroupId = jobGroupId;
        return this;
    }
    public String getJobGroupId() {
        return this.jobGroupId;
    }

    public AssignJobsRequest setJobsJson(java.util.List<String> jobsJson) {
        this.jobsJson = jobsJson;
        return this;
    }
    public java.util.List<String> getJobsJson() {
        return this.jobsJson;
    }

    public AssignJobsRequest setRosterType(String rosterType) {
        this.rosterType = rosterType;
        return this;
    }
    public String getRosterType() {
        return this.rosterType;
    }

    public AssignJobsRequest setStrategyJson(String strategyJson) {
        this.strategyJson = strategyJson;
        return this;
    }
    public String getStrategyJson() {
        return this.strategyJson;
    }

}
