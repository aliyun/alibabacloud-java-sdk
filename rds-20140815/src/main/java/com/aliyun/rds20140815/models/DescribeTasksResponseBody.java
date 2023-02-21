// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeTasksResponseBody extends TeaModel {
    /**
     * <p>The details of the task execution.</p>
     */
    @NameInMap("Items")
    public DescribeTasksResponseBodyItems items;

    /**
     * <p>The page number of the returned page.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries on the current page.</p>
     */
    @NameInMap("PageRecordCount")
    public Integer pageRecordCount;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of returned entries.</p>
     */
    @NameInMap("TotalRecordCount")
    public Integer totalRecordCount;

    public static DescribeTasksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeTasksResponseBody self = new DescribeTasksResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeTasksResponseBody setItems(DescribeTasksResponseBodyItems items) {
        this.items = items;
        return this;
    }
    public DescribeTasksResponseBodyItems getItems() {
        return this.items;
    }

    public DescribeTasksResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeTasksResponseBody setPageRecordCount(Integer pageRecordCount) {
        this.pageRecordCount = pageRecordCount;
        return this;
    }
    public Integer getPageRecordCount() {
        return this.pageRecordCount;
    }

    public DescribeTasksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeTasksResponseBody setTotalRecordCount(Integer totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
        return this;
    }
    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static class DescribeTasksResponseBodyItemsTaskProgressInfo extends TeaModel {
        /**
         * <p>The start time of the task. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm*Z format. The time is displayed in UTC .</p>
         */
        @NameInMap("BeginTime")
        public String beginTime;

        /**
         * <p>The name of the subtask.</p>
         */
        @NameInMap("CurrentStepName")
        public String currentStepName;

        /**
         * <p>The name of the database. If the task involves a database, the database name is returned.</p>
         */
        @NameInMap("DBName")
        public String DBName;

        /**
         * <p>The estimated end time of the task.</p>
         * <br>
         * <p>> In most cases, this parameter is empty.</p>
         */
        @NameInMap("ExpectedFinishTime")
        public String expectedFinishTime;

        /**
         * <p>The end time of the task. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm*Z format. The time is displayed in UTC.</p>
         */
        @NameInMap("FinishTime")
        public String finishTime;

        /**
         * <p>The progress of the task in percentage.</p>
         */
        @NameInMap("Progress")
        public String progress;

        /**
         * <p>The description of the task progress.</p>
         * <br>
         * <p>> If no progress description is provided for the task, this parameter is empty.</p>
         */
        @NameInMap("ProgressInfo")
        public String progressInfo;

        /**
         * <p>The estimated remaining time of the task. Unit: seconds.</p>
         * <br>
         * <p>>  If the task is not running, this parameter is not returned or the returned value is **0**.</p>
         */
        @NameInMap("Remain")
        public Integer remain;

        /**
         * <p>The status of the task.</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The progress of the subtask. For example, a value of `1/4` indicates that the task consists of four subtasks and the first subtask is in progress.</p>
         */
        @NameInMap("StepProgressInfo")
        public String stepProgressInfo;

        /**
         * <p>The details of the subtasks.</p>
         */
        @NameInMap("StepsInfo")
        public String stepsInfo;

        /**
         * <p>The operation that is used by the task, such as **CreateDBInstance**.</p>
         */
        @NameInMap("TaskAction")
        public String taskAction;

        /**
         * <p>The error code that is returned when an error occurs.</p>
         * <br>
         * <p>> This parameter is returned only when an error occurs.</p>
         */
        @NameInMap("TaskErrorCode")
        public String taskErrorCode;

        /**
         * <p>The error message that is returned when an error occurs.</p>
         * <br>
         * <p>>  This parameter is returned only when an error occurs.</p>
         */
        @NameInMap("TaskErrorMessage")
        public String taskErrorMessage;

        /**
         * <p>The ID of the task.</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        public static DescribeTasksResponseBodyItemsTaskProgressInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeTasksResponseBodyItemsTaskProgressInfo self = new DescribeTasksResponseBodyItemsTaskProgressInfo();
            return TeaModel.build(map, self);
        }

        public DescribeTasksResponseBodyItemsTaskProgressInfo setBeginTime(String beginTime) {
            this.beginTime = beginTime;
            return this;
        }
        public String getBeginTime() {
            return this.beginTime;
        }

        public DescribeTasksResponseBodyItemsTaskProgressInfo setCurrentStepName(String currentStepName) {
            this.currentStepName = currentStepName;
            return this;
        }
        public String getCurrentStepName() {
            return this.currentStepName;
        }

        public DescribeTasksResponseBodyItemsTaskProgressInfo setDBName(String DBName) {
            this.DBName = DBName;
            return this;
        }
        public String getDBName() {
            return this.DBName;
        }

        public DescribeTasksResponseBodyItemsTaskProgressInfo setExpectedFinishTime(String expectedFinishTime) {
            this.expectedFinishTime = expectedFinishTime;
            return this;
        }
        public String getExpectedFinishTime() {
            return this.expectedFinishTime;
        }

        public DescribeTasksResponseBodyItemsTaskProgressInfo setFinishTime(String finishTime) {
            this.finishTime = finishTime;
            return this;
        }
        public String getFinishTime() {
            return this.finishTime;
        }

        public DescribeTasksResponseBodyItemsTaskProgressInfo setProgress(String progress) {
            this.progress = progress;
            return this;
        }
        public String getProgress() {
            return this.progress;
        }

        public DescribeTasksResponseBodyItemsTaskProgressInfo setProgressInfo(String progressInfo) {
            this.progressInfo = progressInfo;
            return this;
        }
        public String getProgressInfo() {
            return this.progressInfo;
        }

        public DescribeTasksResponseBodyItemsTaskProgressInfo setRemain(Integer remain) {
            this.remain = remain;
            return this;
        }
        public Integer getRemain() {
            return this.remain;
        }

        public DescribeTasksResponseBodyItemsTaskProgressInfo setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeTasksResponseBodyItemsTaskProgressInfo setStepProgressInfo(String stepProgressInfo) {
            this.stepProgressInfo = stepProgressInfo;
            return this;
        }
        public String getStepProgressInfo() {
            return this.stepProgressInfo;
        }

        public DescribeTasksResponseBodyItemsTaskProgressInfo setStepsInfo(String stepsInfo) {
            this.stepsInfo = stepsInfo;
            return this;
        }
        public String getStepsInfo() {
            return this.stepsInfo;
        }

        public DescribeTasksResponseBodyItemsTaskProgressInfo setTaskAction(String taskAction) {
            this.taskAction = taskAction;
            return this;
        }
        public String getTaskAction() {
            return this.taskAction;
        }

        public DescribeTasksResponseBodyItemsTaskProgressInfo setTaskErrorCode(String taskErrorCode) {
            this.taskErrorCode = taskErrorCode;
            return this;
        }
        public String getTaskErrorCode() {
            return this.taskErrorCode;
        }

        public DescribeTasksResponseBodyItemsTaskProgressInfo setTaskErrorMessage(String taskErrorMessage) {
            this.taskErrorMessage = taskErrorMessage;
            return this;
        }
        public String getTaskErrorMessage() {
            return this.taskErrorMessage;
        }

        public DescribeTasksResponseBodyItemsTaskProgressInfo setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

    public static class DescribeTasksResponseBodyItems extends TeaModel {
        @NameInMap("TaskProgressInfo")
        public java.util.List<DescribeTasksResponseBodyItemsTaskProgressInfo> taskProgressInfo;

        public static DescribeTasksResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeTasksResponseBodyItems self = new DescribeTasksResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeTasksResponseBodyItems setTaskProgressInfo(java.util.List<DescribeTasksResponseBodyItemsTaskProgressInfo> taskProgressInfo) {
            this.taskProgressInfo = taskProgressInfo;
            return this;
        }
        public java.util.List<DescribeTasksResponseBodyItemsTaskProgressInfo> getTaskProgressInfo() {
            return this.taskProgressInfo;
        }

    }

}
