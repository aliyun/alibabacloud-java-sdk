// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class DescribeCacheAnalysisReportListResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("DailyTasks")
    public DescribeCacheAnalysisReportListResponseBodyDailyTasks dailyTasks;

    public static DescribeCacheAnalysisReportListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCacheAnalysisReportListResponseBody self = new DescribeCacheAnalysisReportListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCacheAnalysisReportListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCacheAnalysisReportListResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeCacheAnalysisReportListResponseBody setDailyTasks(DescribeCacheAnalysisReportListResponseBodyDailyTasks dailyTasks) {
        this.dailyTasks = dailyTasks;
        return this;
    }
    public DescribeCacheAnalysisReportListResponseBodyDailyTasks getDailyTasks() {
        return this.dailyTasks;
    }

    public static class DescribeCacheAnalysisReportListResponseBodyDailyTasksDailyTaskTasksTask extends TeaModel {
        @NameInMap("TaskId")
        public String taskId;

        @NameInMap("NodeId")
        public String nodeId;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("Status")
        public String status;

        public static DescribeCacheAnalysisReportListResponseBodyDailyTasksDailyTaskTasksTask build(java.util.Map<String, ?> map) throws Exception {
            DescribeCacheAnalysisReportListResponseBodyDailyTasksDailyTaskTasksTask self = new DescribeCacheAnalysisReportListResponseBodyDailyTasksDailyTaskTasksTask();
            return TeaModel.build(map, self);
        }

        public DescribeCacheAnalysisReportListResponseBodyDailyTasksDailyTaskTasksTask setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
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
        @NameInMap("Date")
        public String date;

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
