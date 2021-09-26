// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class ModifyReportPushTaskRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("JobId")
    public Integer jobId;

    @NameInMap("ScheduleType")
    public String scheduleType;

    @NameInMap("ScheduleTime")
    public String scheduleTime;

    @NameInMap("JobStatus")
    public Integer jobStatus;

    @NameInMap("ReportType")
    public java.util.List<String> reportType;

    @NameInMap("DbList")
    public java.util.List<String> dbList;

    @NameInMap("EmailList")
    public java.util.List<String> emailList;

    public static ModifyReportPushTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyReportPushTaskRequest self = new ModifyReportPushTaskRequest();
        return TeaModel.build(map, self);
    }

    public ModifyReportPushTaskRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyReportPushTaskRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyReportPushTaskRequest setJobId(Integer jobId) {
        this.jobId = jobId;
        return this;
    }
    public Integer getJobId() {
        return this.jobId;
    }

    public ModifyReportPushTaskRequest setScheduleType(String scheduleType) {
        this.scheduleType = scheduleType;
        return this;
    }
    public String getScheduleType() {
        return this.scheduleType;
    }

    public ModifyReportPushTaskRequest setScheduleTime(String scheduleTime) {
        this.scheduleTime = scheduleTime;
        return this;
    }
    public String getScheduleTime() {
        return this.scheduleTime;
    }

    public ModifyReportPushTaskRequest setJobStatus(Integer jobStatus) {
        this.jobStatus = jobStatus;
        return this;
    }
    public Integer getJobStatus() {
        return this.jobStatus;
    }

    public ModifyReportPushTaskRequest setReportType(java.util.List<String> reportType) {
        this.reportType = reportType;
        return this;
    }
    public java.util.List<String> getReportType() {
        return this.reportType;
    }

    public ModifyReportPushTaskRequest setDbList(java.util.List<String> dbList) {
        this.dbList = dbList;
        return this;
    }
    public java.util.List<String> getDbList() {
        return this.dbList;
    }

    public ModifyReportPushTaskRequest setEmailList(java.util.List<String> emailList) {
        this.emailList = emailList;
        return this;
    }
    public java.util.List<String> getEmailList() {
        return this.emailList;
    }

}
