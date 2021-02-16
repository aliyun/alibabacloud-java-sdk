// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeTasksResponseBody extends TeaModel {
    @NameInMap("TotalRecordCount")
    public Integer totalRecordCount;

    @NameInMap("PageRecordCount")
    public Integer pageRecordCount;

    @NameInMap("Tasks")
    public DescribeTasksResponseBodyTasks tasks;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("DBClusterId")
    public String DBClusterId;

    public static DescribeTasksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeTasksResponseBody self = new DescribeTasksResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeTasksResponseBody setTotalRecordCount(Integer totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
        return this;
    }
    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public DescribeTasksResponseBody setPageRecordCount(Integer pageRecordCount) {
        this.pageRecordCount = pageRecordCount;
        return this;
    }
    public Integer getPageRecordCount() {
        return this.pageRecordCount;
    }

    public DescribeTasksResponseBody setTasks(DescribeTasksResponseBodyTasks tasks) {
        this.tasks = tasks;
        return this;
    }
    public DescribeTasksResponseBodyTasks getTasks() {
        return this.tasks;
    }

    public DescribeTasksResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeTasksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeTasksResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeTasksResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeTasksResponseBody setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public static class DescribeTasksResponseBodyTasksTask extends TeaModel {
        @NameInMap("FinishTime")
        public String finishTime;

        @NameInMap("StepsInfo")
        public String stepsInfo;

        @NameInMap("Progress")
        public Integer progress;

        @NameInMap("ExpectedFinishTime")
        public String expectedFinishTime;

        @NameInMap("BeginTime")
        public String beginTime;

        @NameInMap("TaskErrorCode")
        public String taskErrorCode;

        @NameInMap("ProgressInfo")
        public String progressInfo;

        @NameInMap("CurrentStepName")
        public String currentStepName;

        @NameInMap("StepProgressInfo")
        public String stepProgressInfo;

        @NameInMap("TaskErrorMessage")
        public String taskErrorMessage;

        @NameInMap("TaskAction")
        public String taskAction;

        @NameInMap("DBName")
        public String DBName;

        @NameInMap("Remain")
        public Integer remain;

        @NameInMap("TaskId")
        public String taskId;

        public static DescribeTasksResponseBodyTasksTask build(java.util.Map<String, ?> map) throws Exception {
            DescribeTasksResponseBodyTasksTask self = new DescribeTasksResponseBodyTasksTask();
            return TeaModel.build(map, self);
        }

        public DescribeTasksResponseBodyTasksTask setFinishTime(String finishTime) {
            this.finishTime = finishTime;
            return this;
        }
        public String getFinishTime() {
            return this.finishTime;
        }

        public DescribeTasksResponseBodyTasksTask setStepsInfo(String stepsInfo) {
            this.stepsInfo = stepsInfo;
            return this;
        }
        public String getStepsInfo() {
            return this.stepsInfo;
        }

        public DescribeTasksResponseBodyTasksTask setProgress(Integer progress) {
            this.progress = progress;
            return this;
        }
        public Integer getProgress() {
            return this.progress;
        }

        public DescribeTasksResponseBodyTasksTask setExpectedFinishTime(String expectedFinishTime) {
            this.expectedFinishTime = expectedFinishTime;
            return this;
        }
        public String getExpectedFinishTime() {
            return this.expectedFinishTime;
        }

        public DescribeTasksResponseBodyTasksTask setBeginTime(String beginTime) {
            this.beginTime = beginTime;
            return this;
        }
        public String getBeginTime() {
            return this.beginTime;
        }

        public DescribeTasksResponseBodyTasksTask setTaskErrorCode(String taskErrorCode) {
            this.taskErrorCode = taskErrorCode;
            return this;
        }
        public String getTaskErrorCode() {
            return this.taskErrorCode;
        }

        public DescribeTasksResponseBodyTasksTask setProgressInfo(String progressInfo) {
            this.progressInfo = progressInfo;
            return this;
        }
        public String getProgressInfo() {
            return this.progressInfo;
        }

        public DescribeTasksResponseBodyTasksTask setCurrentStepName(String currentStepName) {
            this.currentStepName = currentStepName;
            return this;
        }
        public String getCurrentStepName() {
            return this.currentStepName;
        }

        public DescribeTasksResponseBodyTasksTask setStepProgressInfo(String stepProgressInfo) {
            this.stepProgressInfo = stepProgressInfo;
            return this;
        }
        public String getStepProgressInfo() {
            return this.stepProgressInfo;
        }

        public DescribeTasksResponseBodyTasksTask setTaskErrorMessage(String taskErrorMessage) {
            this.taskErrorMessage = taskErrorMessage;
            return this;
        }
        public String getTaskErrorMessage() {
            return this.taskErrorMessage;
        }

        public DescribeTasksResponseBodyTasksTask setTaskAction(String taskAction) {
            this.taskAction = taskAction;
            return this;
        }
        public String getTaskAction() {
            return this.taskAction;
        }

        public DescribeTasksResponseBodyTasksTask setDBName(String DBName) {
            this.DBName = DBName;
            return this;
        }
        public String getDBName() {
            return this.DBName;
        }

        public DescribeTasksResponseBodyTasksTask setRemain(Integer remain) {
            this.remain = remain;
            return this;
        }
        public Integer getRemain() {
            return this.remain;
        }

        public DescribeTasksResponseBodyTasksTask setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

    public static class DescribeTasksResponseBodyTasks extends TeaModel {
        @NameInMap("Task")
        public java.util.List<DescribeTasksResponseBodyTasksTask> task;

        public static DescribeTasksResponseBodyTasks build(java.util.Map<String, ?> map) throws Exception {
            DescribeTasksResponseBodyTasks self = new DescribeTasksResponseBodyTasks();
            return TeaModel.build(map, self);
        }

        public DescribeTasksResponseBodyTasks setTask(java.util.List<DescribeTasksResponseBodyTasksTask> task) {
            this.task = task;
            return this;
        }
        public java.util.List<DescribeTasksResponseBodyTasksTask> getTask() {
            return this.task;
        }

    }

}
