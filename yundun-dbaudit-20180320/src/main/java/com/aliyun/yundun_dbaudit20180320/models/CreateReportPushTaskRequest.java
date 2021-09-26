// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class CreateReportPushTaskRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("InstanceId")
    public String instanceId;

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

    public static CreateReportPushTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateReportPushTaskRequest self = new CreateReportPushTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateReportPushTaskRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateReportPushTaskRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateReportPushTaskRequest setScheduleType(String scheduleType) {
        this.scheduleType = scheduleType;
        return this;
    }
    public String getScheduleType() {
        return this.scheduleType;
    }

    public CreateReportPushTaskRequest setScheduleTime(String scheduleTime) {
        this.scheduleTime = scheduleTime;
        return this;
    }
    public String getScheduleTime() {
        return this.scheduleTime;
    }

    public CreateReportPushTaskRequest setJobStatus(Integer jobStatus) {
        this.jobStatus = jobStatus;
        return this;
    }
    public Integer getJobStatus() {
        return this.jobStatus;
    }

    public CreateReportPushTaskRequest setReportType(java.util.List<String> reportType) {
        this.reportType = reportType;
        return this;
    }
    public java.util.List<String> getReportType() {
        return this.reportType;
    }

    public CreateReportPushTaskRequest setDbList(java.util.List<String> dbList) {
        this.dbList = dbList;
        return this;
    }
    public java.util.List<String> getDbList() {
        return this.dbList;
    }

    public CreateReportPushTaskRequest setEmailList(java.util.List<String> emailList) {
        this.emailList = emailList;
        return this;
    }
    public java.util.List<String> getEmailList() {
        return this.emailList;
    }

}
