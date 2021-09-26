// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class ListLogAlarmTasksResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TaskList")
    public java.util.List<ListLogAlarmTasksResponseBodyTaskList> taskList;

    public static ListLogAlarmTasksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListLogAlarmTasksResponseBody self = new ListLogAlarmTasksResponseBody();
        return TeaModel.build(map, self);
    }

    public ListLogAlarmTasksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListLogAlarmTasksResponseBody setTaskList(java.util.List<ListLogAlarmTasksResponseBodyTaskList> taskList) {
        this.taskList = taskList;
        return this;
    }
    public java.util.List<ListLogAlarmTasksResponseBodyTaskList> getTaskList() {
        return this.taskList;
    }

    public static class ListLogAlarmTasksResponseBodyTaskList extends TeaModel {
        @NameInMap("TaskStatus")
        public Integer taskStatus;

        @NameInMap("TaskId")
        public Integer taskId;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("TaskName")
        public String taskName;

        @NameInMap("ToMailList")
        public java.util.List<String> toMailList;

        @NameInMap("RiskLevelList")
        public java.util.List<String> riskLevelList;

        @NameInMap("DbIdList")
        public java.util.List<String> dbIdList;

        public static ListLogAlarmTasksResponseBodyTaskList build(java.util.Map<String, ?> map) throws Exception {
            ListLogAlarmTasksResponseBodyTaskList self = new ListLogAlarmTasksResponseBodyTaskList();
            return TeaModel.build(map, self);
        }

        public ListLogAlarmTasksResponseBodyTaskList setTaskStatus(Integer taskStatus) {
            this.taskStatus = taskStatus;
            return this;
        }
        public Integer getTaskStatus() {
            return this.taskStatus;
        }

        public ListLogAlarmTasksResponseBodyTaskList setTaskId(Integer taskId) {
            this.taskId = taskId;
            return this;
        }
        public Integer getTaskId() {
            return this.taskId;
        }

        public ListLogAlarmTasksResponseBodyTaskList setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListLogAlarmTasksResponseBodyTaskList setTaskName(String taskName) {
            this.taskName = taskName;
            return this;
        }
        public String getTaskName() {
            return this.taskName;
        }

        public ListLogAlarmTasksResponseBodyTaskList setToMailList(java.util.List<String> toMailList) {
            this.toMailList = toMailList;
            return this;
        }
        public java.util.List<String> getToMailList() {
            return this.toMailList;
        }

        public ListLogAlarmTasksResponseBodyTaskList setRiskLevelList(java.util.List<String> riskLevelList) {
            this.riskLevelList = riskLevelList;
            return this;
        }
        public java.util.List<String> getRiskLevelList() {
            return this.riskLevelList;
        }

        public ListLogAlarmTasksResponseBodyTaskList setDbIdList(java.util.List<String> dbIdList) {
            this.dbIdList = dbIdList;
            return this;
        }
        public java.util.List<String> getDbIdList() {
            return this.dbIdList;
        }

    }

}
