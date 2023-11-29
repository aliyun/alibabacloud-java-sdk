// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class GetShipperStatusResponseBody extends TeaModel {
    /**
     * <p>The number of log shipping jobs returned on the current page.</p>
     */
    @NameInMap("count")
    public Long count;

    /**
     * <p>The statistics about log shipping jobs.</p>
     */
    @NameInMap("statistics")
    public GetShipperStatusResponseBodyStatistics statistics;

    /**
     * <p>The details of log shipping jobs.</p>
     */
    @NameInMap("tasks")
    public GetShipperStatusResponseBodyTasks tasks;

    /**
     * <p>The total number of log shipping jobs.</p>
     */
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
        /**
         * <p>The number of log shipping jobs that are in the fail state.</p>
         */
        @NameInMap("fail")
        public Long fail;

        /**
         * <p>The number of log shipping jobs that are in the running state.</p>
         */
        @NameInMap("running")
        public Long running;

        /**
         * <p>The number of log shipping jobs that are in the success state.</p>
         */
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
        /**
         * <p>The ID of the log shipping job.</p>
         */
        @NameInMap("id")
        public String id;

        /**
         * <p>The error code of the log shipping job.</p>
         */
        @NameInMap("taskCode")
        public String taskCode;

        /**
         * <p>The start time of the log shipping job. The value is a UNIX timestamp representing the number of seconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC.</p>
         */
        @NameInMap("taskCreateTime")
        public Long taskCreateTime;

        /**
         * <p>The number of logs that are shipped in the log shipping job.</p>
         */
        @NameInMap("taskDataLines")
        public Integer taskDataLines;

        /**
         * <p>The end time of the log shipping job. The value is a UNIX timestamp representing the number of seconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC.</p>
         */
        @NameInMap("taskFinishTime")
        public Long taskFinishTime;

        /**
         * <p>The time when Simple Log Service receives the most recent log of the log shipping job. The value is a UNIX timestamp representing the number of seconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC.</p>
         */
        @NameInMap("taskLastDataReceiveTime")
        public Long taskLastDataReceiveTime;

        /**
         * <p>The error message of the log shipping job.</p>
         */
        @NameInMap("taskMessage")
        public String taskMessage;

        /**
         * <p>The status of the log shipping job. Valid values: running, success, and fail.</p>
         */
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
