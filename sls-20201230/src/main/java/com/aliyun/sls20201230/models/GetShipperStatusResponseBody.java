// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class GetShipperStatusResponseBody extends TeaModel {
    @NameInMap("count")
    public Long count;

    @NameInMap("statistics")
    public GetShipperStatusResponseBodyStatistics statistics;

    @NameInMap("tasks")
    public GetShipperStatusResponseBodyTasks tasks;

    @NameInMap("total")
    public Long total;

    public static GetShipperStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetShipperStatusResponseBody self = new GetShipperStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public GetShipperStatusResponseBody setCount(Long count) {
        this.count = count;
        return this;
    }
    public Long getCount() {
        return this.count;
    }

    public GetShipperStatusResponseBody setStatistics(GetShipperStatusResponseBodyStatistics statistics) {
        this.statistics = statistics;
        return this;
    }
    public GetShipperStatusResponseBodyStatistics getStatistics() {
        return this.statistics;
    }

    public GetShipperStatusResponseBody setTasks(GetShipperStatusResponseBodyTasks tasks) {
        this.tasks = tasks;
        return this;
    }
    public GetShipperStatusResponseBodyTasks getTasks() {
        return this.tasks;
    }

    public GetShipperStatusResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public static class GetShipperStatusResponseBodyStatistics extends TeaModel {
        @NameInMap("fail")
        public Long fail;

        @NameInMap("running")
        public Long running;

        @NameInMap("success")
        public Long success;

        public static GetShipperStatusResponseBodyStatistics build(java.util.Map<String, ?> map) throws Exception {
            GetShipperStatusResponseBodyStatistics self = new GetShipperStatusResponseBodyStatistics();
            return TeaModel.build(map, self);
        }

        public GetShipperStatusResponseBodyStatistics setFail(Long fail) {
            this.fail = fail;
            return this;
        }
        public Long getFail() {
            return this.fail;
        }

        public GetShipperStatusResponseBodyStatistics setRunning(Long running) {
            this.running = running;
            return this;
        }
        public Long getRunning() {
            return this.running;
        }

        public GetShipperStatusResponseBodyStatistics setSuccess(Long success) {
            this.success = success;
            return this;
        }
        public Long getSuccess() {
            return this.success;
        }

    }

    public static class GetShipperStatusResponseBodyTasks extends TeaModel {
        @NameInMap("id")
        public String id;

        @NameInMap("taskCode")
        public String taskCode;

        @NameInMap("taskCreateTime")
        public Long taskCreateTime;

        @NameInMap("taskDataLines")
        public Integer taskDataLines;

        @NameInMap("taskFinishTime")
        public Long taskFinishTime;

        @NameInMap("taskLastDataReceiveTime")
        public Long taskLastDataReceiveTime;

        @NameInMap("taskMessage")
        public String taskMessage;

        @NameInMap("taskStatus")
        public String taskStatus;

        public static GetShipperStatusResponseBodyTasks build(java.util.Map<String, ?> map) throws Exception {
            GetShipperStatusResponseBodyTasks self = new GetShipperStatusResponseBodyTasks();
            return TeaModel.build(map, self);
        }

        public GetShipperStatusResponseBodyTasks setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetShipperStatusResponseBodyTasks setTaskCode(String taskCode) {
            this.taskCode = taskCode;
            return this;
        }
        public String getTaskCode() {
            return this.taskCode;
        }

        public GetShipperStatusResponseBodyTasks setTaskCreateTime(Long taskCreateTime) {
            this.taskCreateTime = taskCreateTime;
            return this;
        }
        public Long getTaskCreateTime() {
            return this.taskCreateTime;
        }

        public GetShipperStatusResponseBodyTasks setTaskDataLines(Integer taskDataLines) {
            this.taskDataLines = taskDataLines;
            return this;
        }
        public Integer getTaskDataLines() {
            return this.taskDataLines;
        }

        public GetShipperStatusResponseBodyTasks setTaskFinishTime(Long taskFinishTime) {
            this.taskFinishTime = taskFinishTime;
            return this;
        }
        public Long getTaskFinishTime() {
            return this.taskFinishTime;
        }

        public GetShipperStatusResponseBodyTasks setTaskLastDataReceiveTime(Long taskLastDataReceiveTime) {
            this.taskLastDataReceiveTime = taskLastDataReceiveTime;
            return this;
        }
        public Long getTaskLastDataReceiveTime() {
            return this.taskLastDataReceiveTime;
        }

        public GetShipperStatusResponseBodyTasks setTaskMessage(String taskMessage) {
            this.taskMessage = taskMessage;
            return this;
        }
        public String getTaskMessage() {
            return this.taskMessage;
        }

        public GetShipperStatusResponseBodyTasks setTaskStatus(String taskStatus) {
            this.taskStatus = taskStatus;
            return this;
        }
        public String getTaskStatus() {
            return this.taskStatus;
        }

    }

}
