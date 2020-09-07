// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeTasksResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("TotalRecordCount")
    @Validation(required = true)
    public Integer totalRecordCount;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Integer pageNumber;

    @NameInMap("PageRecordCount")
    @Validation(required = true)
    public Integer pageRecordCount;

    @NameInMap("Items")
    @Validation(required = true)
    public DescribeTasksResponseItems items;

    public static DescribeTasksResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeTasksResponse self = new DescribeTasksResponse();
        return TeaModel.build(map, self);
    }

    public DescribeTasksResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeTasksResponse setTotalRecordCount(Integer totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
        return this;
    }
    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public DescribeTasksResponse setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeTasksResponse setPageRecordCount(Integer pageRecordCount) {
        this.pageRecordCount = pageRecordCount;
        return this;
    }
    public Integer getPageRecordCount() {
        return this.pageRecordCount;
    }

    public DescribeTasksResponse setItems(DescribeTasksResponseItems items) {
        this.items = items;
        return this;
    }
    public DescribeTasksResponseItems getItems() {
        return this.items;
    }

    public static class DescribeTasksResponseItemsTaskProgressInfo extends TeaModel {
        @NameInMap("DBName")
        @Validation(required = true)
        public String DBName;

        @NameInMap("BeginTime")
        @Validation(required = true)
        public String beginTime;

        @NameInMap("ProgressInfo")
        @Validation(required = true)
        public String progressInfo;

        @NameInMap("FinishTime")
        @Validation(required = true)
        public String finishTime;

        @NameInMap("TaskAction")
        @Validation(required = true)
        public String taskAction;

        @NameInMap("TaskId")
        @Validation(required = true)
        public String taskId;

        @NameInMap("Progress")
        @Validation(required = true)
        public String progress;

        @NameInMap("ExpectedFinishTime")
        @Validation(required = true)
        public String expectedFinishTime;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("TaskErrorCode")
        @Validation(required = true)
        public String taskErrorCode;

        @NameInMap("TaskErrorMessage")
        @Validation(required = true)
        public String taskErrorMessage;

        @NameInMap("StepsInfo")
        @Validation(required = true)
        public String stepsInfo;

        @NameInMap("Remain")
        @Validation(required = true)
        public Integer remain;

        @NameInMap("StepProgressInfo")
        @Validation(required = true)
        public String stepProgressInfo;

        @NameInMap("CurrentStepName")
        @Validation(required = true)
        public String currentStepName;

        public static DescribeTasksResponseItemsTaskProgressInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeTasksResponseItemsTaskProgressInfo self = new DescribeTasksResponseItemsTaskProgressInfo();
            return TeaModel.build(map, self);
        }

        public DescribeTasksResponseItemsTaskProgressInfo setDBName(String DBName) {
            this.DBName = DBName;
            return this;
        }
        public String getDBName() {
            return this.DBName;
        }

        public DescribeTasksResponseItemsTaskProgressInfo setBeginTime(String beginTime) {
            this.beginTime = beginTime;
            return this;
        }
        public String getBeginTime() {
            return this.beginTime;
        }

        public DescribeTasksResponseItemsTaskProgressInfo setProgressInfo(String progressInfo) {
            this.progressInfo = progressInfo;
            return this;
        }
        public String getProgressInfo() {
            return this.progressInfo;
        }

        public DescribeTasksResponseItemsTaskProgressInfo setFinishTime(String finishTime) {
            this.finishTime = finishTime;
            return this;
        }
        public String getFinishTime() {
            return this.finishTime;
        }

        public DescribeTasksResponseItemsTaskProgressInfo setTaskAction(String taskAction) {
            this.taskAction = taskAction;
            return this;
        }
        public String getTaskAction() {
            return this.taskAction;
        }

        public DescribeTasksResponseItemsTaskProgressInfo setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public DescribeTasksResponseItemsTaskProgressInfo setProgress(String progress) {
            this.progress = progress;
            return this;
        }
        public String getProgress() {
            return this.progress;
        }

        public DescribeTasksResponseItemsTaskProgressInfo setExpectedFinishTime(String expectedFinishTime) {
            this.expectedFinishTime = expectedFinishTime;
            return this;
        }
        public String getExpectedFinishTime() {
            return this.expectedFinishTime;
        }

        public DescribeTasksResponseItemsTaskProgressInfo setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeTasksResponseItemsTaskProgressInfo setTaskErrorCode(String taskErrorCode) {
            this.taskErrorCode = taskErrorCode;
            return this;
        }
        public String getTaskErrorCode() {
            return this.taskErrorCode;
        }

        public DescribeTasksResponseItemsTaskProgressInfo setTaskErrorMessage(String taskErrorMessage) {
            this.taskErrorMessage = taskErrorMessage;
            return this;
        }
        public String getTaskErrorMessage() {
            return this.taskErrorMessage;
        }

        public DescribeTasksResponseItemsTaskProgressInfo setStepsInfo(String stepsInfo) {
            this.stepsInfo = stepsInfo;
            return this;
        }
        public String getStepsInfo() {
            return this.stepsInfo;
        }

        public DescribeTasksResponseItemsTaskProgressInfo setRemain(Integer remain) {
            this.remain = remain;
            return this;
        }
        public Integer getRemain() {
            return this.remain;
        }

        public DescribeTasksResponseItemsTaskProgressInfo setStepProgressInfo(String stepProgressInfo) {
            this.stepProgressInfo = stepProgressInfo;
            return this;
        }
        public String getStepProgressInfo() {
            return this.stepProgressInfo;
        }

        public DescribeTasksResponseItemsTaskProgressInfo setCurrentStepName(String currentStepName) {
            this.currentStepName = currentStepName;
            return this;
        }
        public String getCurrentStepName() {
            return this.currentStepName;
        }

    }

    public static class DescribeTasksResponseItems extends TeaModel {
        @NameInMap("TaskProgressInfo")
        @Validation(required = true)
        public java.util.List<DescribeTasksResponseItemsTaskProgressInfo> taskProgressInfo;

        public static DescribeTasksResponseItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeTasksResponseItems self = new DescribeTasksResponseItems();
            return TeaModel.build(map, self);
        }

        public DescribeTasksResponseItems setTaskProgressInfo(java.util.List<DescribeTasksResponseItemsTaskProgressInfo> taskProgressInfo) {
            this.taskProgressInfo = taskProgressInfo;
            return this;
        }
        public java.util.List<DescribeTasksResponseItemsTaskProgressInfo> getTaskProgressInfo() {
            return this.taskProgressInfo;
        }

    }

}
