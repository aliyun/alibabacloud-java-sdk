// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class DescribeCacheAnalysisReportListResponseBody extends TeaModel {
    /**
     * <p>Details about the offline key analysis tasks.</p>
     */
    @NameInMap("DailyTasks")
    public DescribeCacheAnalysisReportListResponseBodyDailyTasks dailyTasks;

    /**
     * <p>The ID of the instance.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeCacheAnalysisReportListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCacheAnalysisReportListResponseBody self = new DescribeCacheAnalysisReportListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCacheAnalysisReportListResponseBody setDailyTasks(DescribeCacheAnalysisReportListResponseBodyDailyTasks dailyTasks) {
        this.dailyTasks = dailyTasks;
        return this;
    }
    public DescribeCacheAnalysisReportListResponseBodyDailyTasks getDailyTasks() {
        return this.dailyTasks;
    }

    public DescribeCacheAnalysisReportListResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeCacheAnalysisReportListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeCacheAnalysisReportListResponseBodyDailyTasksDailyTaskTasksTask extends TeaModel {
        /**
         * <p>The ID of the child node in the cluster instance.</p>
         */
        @NameInMap("NodeId")
        public String nodeId;

        /**
         * <p>The start time of the offline key analysis task.</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>The state of the offline key analysis task. Valid values:</p>
         * <br>
         * <p>*   **success**: The task is successful.</p>
         * <p>*   **running**: The task is running.</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The ID of the task.</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        public static DescribeCacheAnalysisReportListResponseBodyDailyTasksDailyTaskTasksTask build(java.util.Map<String, ?> map) throws Exception {
            DescribeCacheAnalysisReportListResponseBodyDailyTasksDailyTaskTasksTask self = new DescribeCacheAnalysisReportListResponseBodyDailyTasksDailyTaskTasksTask();
            return TeaModel.build(map, self);
        }

        public DescribeCacheAnalysisReportListResponseBodyDailyTasksDailyTaskTasksTask setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

        public DescribeCacheAnalysisReportListResponseBodyDailyTasksDailyTaskTasksTask setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeCacheAnalysisReportListResponseBodyDailyTasksDailyTaskTasksTask setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeCacheAnalysisReportListResponseBodyDailyTasksDailyTaskTasksTask setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

    public static class DescribeCacheAnalysisReportListResponseBodyDailyTasksDailyTaskTasks extends TeaModel {
        @NameInMap("Task")
        public java.util.List<DescribeCacheAnalysisReportListResponseBodyDailyTasksDailyTaskTasksTask> task;

        public static DescribeCacheAnalysisReportListResponseBodyDailyTasksDailyTaskTasks build(java.util.Map<String, ?> map) throws Exception {
            DescribeCacheAnalysisReportListResponseBodyDailyTasksDailyTaskTasks self = new DescribeCacheAnalysisReportListResponseBodyDailyTasksDailyTaskTasks();
            return TeaModel.build(map, self);
        }

        public DescribeCacheAnalysisReportListResponseBodyDailyTasksDailyTaskTasks setTask(java.util.List<DescribeCacheAnalysisReportListResponseBodyDailyTasksDailyTaskTasksTask> task) {
            this.task = task;
            return this;
        }
        public java.util.List<DescribeCacheAnalysisReportListResponseBodyDailyTasksDailyTaskTasksTask> getTask() {
            return this.task;
        }

    }

    public static class DescribeCacheAnalysisReportListResponseBodyDailyTasksDailyTask extends TeaModel {
        /**
         * <p>The date when the offline key analysis task was performed.</p>
         */
        @NameInMap("Date")
        public String date;

        /**
         * <p>Details about the offline key analysis tasks.</p>
         */
        @NameInMap("Tasks")
        public DescribeCacheAnalysisReportListResponseBodyDailyTasksDailyTaskTasks tasks;

        public static DescribeCacheAnalysisReportListResponseBodyDailyTasksDailyTask build(java.util.Map<String, ?> map) throws Exception {
            DescribeCacheAnalysisReportListResponseBodyDailyTasksDailyTask self = new DescribeCacheAnalysisReportListResponseBodyDailyTasksDailyTask();
            return TeaModel.build(map, self);
        }

        public DescribeCacheAnalysisReportListResponseBodyDailyTasksDailyTask setDate(String date) {
            this.date = date;
            return this;
        }
        public String getDate() {
            return this.date;
        }

        public DescribeCacheAnalysisReportListResponseBodyDailyTasksDailyTask setTasks(DescribeCacheAnalysisReportListResponseBodyDailyTasksDailyTaskTasks tasks) {
            this.tasks = tasks;
            return this;
        }
        public DescribeCacheAnalysisReportListResponseBodyDailyTasksDailyTaskTasks getTasks() {
            return this.tasks;
        }

    }

    public static class DescribeCacheAnalysisReportListResponseBodyDailyTasks extends TeaModel {
        @NameInMap("DailyTask")
        public java.util.List<DescribeCacheAnalysisReportListResponseBodyDailyTasksDailyTask> dailyTask;

        public static DescribeCacheAnalysisReportListResponseBodyDailyTasks build(java.util.Map<String, ?> map) throws Exception {
            DescribeCacheAnalysisReportListResponseBodyDailyTasks self = new DescribeCacheAnalysisReportListResponseBodyDailyTasks();
            return TeaModel.build(map, self);
        }

        public DescribeCacheAnalysisReportListResponseBodyDailyTasks setDailyTask(java.util.List<DescribeCacheAnalysisReportListResponseBodyDailyTasksDailyTask> dailyTask) {
            this.dailyTask = dailyTask;
            return this;
        }
        public java.util.List<DescribeCacheAnalysisReportListResponseBodyDailyTasksDailyTask> getDailyTask() {
            return this.dailyTask;
        }

    }

}
