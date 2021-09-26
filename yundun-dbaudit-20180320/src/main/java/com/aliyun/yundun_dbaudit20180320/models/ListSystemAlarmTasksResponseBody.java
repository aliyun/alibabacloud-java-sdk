// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class ListSystemAlarmTasksResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TaskList")
    public java.util.List<ListSystemAlarmTasksResponseBodyTaskList> taskList;

    public static ListSystemAlarmTasksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSystemAlarmTasksResponseBody self = new ListSystemAlarmTasksResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSystemAlarmTasksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListSystemAlarmTasksResponseBody setTaskList(java.util.List<ListSystemAlarmTasksResponseBodyTaskList> taskList) {
        this.taskList = taskList;
        return this;
    }
    public java.util.List<ListSystemAlarmTasksResponseBodyTaskList> getTaskList() {
        return this.taskList;
    }

    public static class ListSystemAlarmTasksResponseBodyTaskList extends TeaModel {
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

        public static ListSystemAlarmTasksResponseBodyTaskList build(java.util.Map<String, ?> map) throws Exception {
            ListSystemAlarmTasksResponseBodyTaskList self = new ListSystemAlarmTasksResponseBodyTaskList();
            return TeaModel.build(map, self);
        }

        public ListSystemAlarmTasksResponseBodyTaskList setTaskStatus(Integer taskStatus) {
            this.taskStatus = taskStatus;
            return this;
        }
        public Integer getTaskStatus() {
            return this.taskStatus;
        }

        public ListSystemAlarmTasksResponseBodyTaskList setTaskId(Integer taskId) {
            this.taskId = taskId;
            return this;
        }
        public Integer getTaskId() {
            return this.taskId;
        }

        public ListSystemAlarmTasksResponseBodyTaskList setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListSystemAlarmTasksResponseBodyTaskList setTaskName(String taskName) {
            this.taskName = taskName;
            return this;
        }
        public String getTaskName() {
            return this.taskName;
        }

        public ListSystemAlarmTasksResponseBodyTaskList setToMailList(java.util.List<String> toMailList) {
            this.toMailList = toMailList;
            return this;
        }
        public java.util.List<String> getToMailList() {
            return this.toMailList;
        }

    }

}
