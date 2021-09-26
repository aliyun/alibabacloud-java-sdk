// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class ListReportPushTasksResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TaskList")
    public java.util.List<ListReportPushTasksResponseBodyTaskList> taskList;

    public static ListReportPushTasksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListReportPushTasksResponseBody self = new ListReportPushTasksResponseBody();
        return TeaModel.build(map, self);
    }

    public ListReportPushTasksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListReportPushTasksResponseBody setTaskList(java.util.List<ListReportPushTasksResponseBodyTaskList> taskList) {
        this.taskList = taskList;
        return this;
    }
    public java.util.List<ListReportPushTasksResponseBodyTaskList> getTaskList() {
        return this.taskList;
    }

    public static class ListReportPushTasksResponseBodyTaskList extends TeaModel {
        @NameInMap("ScheduleTime")
        public String scheduleTime;

        @NameInMap("JobStatus")
        public Integer jobStatus;

        @NameInMap("JobId")
        public Integer jobId;

        @NameInMap("ScheduleType")
        public String scheduleType;

        @NameInMap("DbList")
        public java.util.List<String> dbList;

        @NameInMap("ReportType")
        public java.util.List<String> reportType;

        @NameInMap("EmailList")
        public java.util.List<String> emailList;

        public static ListReportPushTasksResponseBodyTaskList build(java.util.Map<String, ?> map) throws Exception {
            ListReportPushTasksResponseBodyTaskList self = new ListReportPushTasksResponseBodyTaskList();
            return TeaModel.build(map, self);
        }

        public ListReportPushTasksResponseBodyTaskList setScheduleTime(String scheduleTime) {
            this.scheduleTime = scheduleTime;
            return this;
        }
        public String getScheduleTime() {
            return this.scheduleTime;
        }

        public ListReportPushTasksResponseBodyTaskList setJobStatus(Integer jobStatus) {
            this.jobStatus = jobStatus;
            return this;
        }
        public Integer getJobStatus() {
            return this.jobStatus;
        }

        public ListReportPushTasksResponseBodyTaskList setJobId(Integer jobId) {
            this.jobId = jobId;
            return this;
        }
        public Integer getJobId() {
            return this.jobId;
        }

        public ListReportPushTasksResponseBodyTaskList setScheduleType(String scheduleType) {
            this.scheduleType = scheduleType;
            return this;
        }
        public String getScheduleType() {
            return this.scheduleType;
        }

        public ListReportPushTasksResponseBodyTaskList setDbList(java.util.List<String> dbList) {
            this.dbList = dbList;
            return this;
        }
        public java.util.List<String> getDbList() {
            return this.dbList;
        }

        public ListReportPushTasksResponseBodyTaskList setReportType(java.util.List<String> reportType) {
            this.reportType = reportType;
            return this;
        }
        public java.util.List<String> getReportType() {
            return this.reportType;
        }

        public ListReportPushTasksResponseBodyTaskList setEmailList(java.util.List<String> emailList) {
            this.emailList = emailList;
            return this;
        }
        public java.util.List<String> getEmailList() {
            return this.emailList;
        }

    }

}
