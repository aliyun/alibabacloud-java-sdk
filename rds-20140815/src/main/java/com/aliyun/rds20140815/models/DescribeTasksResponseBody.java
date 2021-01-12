// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeTasksResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalRecordCount")
    public Integer totalRecordCount;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageRecordCount")
    public Integer pageRecordCount;

    @NameInMap("Items")
    public DescribeTasksResponseBodyItems items;

    public static DescribeTasksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeTasksResponseBody self = new DescribeTasksResponseBody();
        return TeaModel.build(map, self);
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

    public DescribeTasksResponseBody setItems(DescribeTasksResponseBodyItems items) {
        this.items = items;
        return this;
    }
    public DescribeTasksResponseBodyItems getItems() {
        return this.items;
    }

    public static class DescribeTasksResponseBodyItemsTaskProgressInfo extends TeaModel {
        @NameInMap("DBName")
        public String DBName;

        @NameInMap("BeginTime")
        public String beginTime;

        @NameInMap("ProgressInfo")
        public String progressInfo;

        @NameInMap("FinishTime")
        public String finishTime;

        @NameInMap("TaskAction")
        public String taskAction;

        @NameInMap("TaskId")
        public String taskId;

        @NameInMap("Progress")
        public String progress;

        @NameInMap("ExpectedFinishTime")
        public String expectedFinishTime;

        @NameInMap("Status")
        public String status;

        @NameInMap("TaskErrorCode")
        public String taskErrorCode;

        @NameInMap("TaskErrorMessage")
        public String taskErrorMessage;

        @NameInMap("StepsInfo")
        public String stepsInfo;

        @NameInMap("Remain")
        public Integer remain;

        @NameInMap("StepProgressInfo")
        public String stepProgressInfo;

        @NameInMap("CurrentStepName")
        public String currentStepName;

        public static DescribeTasksResponseBodyItemsTaskProgressInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeTasksResponseBodyItemsTaskProgressInfo self = new DescribeTasksResponseBodyItemsTaskProgressInfo();
            return TeaModel.build(map, self);
        }

        public DescribeTasksResponseBodyItemsTaskProgressInfo setDBName(String DBName) {
            this.DBName = DBName;
            return this;
        }
        public String getDBName() {
            return this.DBName;
        }

        public DescribeTasksResponseBodyItemsTaskProgressInfo setBeginTime(String beginTime) {
            this.beginTime = beginTime;
            return this;
        }
        public String getBeginTime() {
            return this.beginTime;
        }

        public DescribeTasksResponseBodyItemsTaskProgressInfo setProgressInfo(String progressInfo) {
            this.progressInfo = progressInfo;
            return this;
        }
        public String getProgressInfo() {
            return this.progressInfo;
        }

        public DescribeTasksResponseBodyItemsTaskProgressInfo setFinishTime(String finishTime) {
            this.finishTime = finishTime;
            return this;
        }
        public String getFinishTime() {
            return this.finishTime;
        }

        public DescribeTasksResponseBodyItemsTaskProgressInfo setTaskAction(String taskAction) {
            this.taskAction = taskAction;
            return this;
        }
        public String getTaskAction() {
            return this.taskAction;
        }

        public DescribeTasksResponseBodyItemsTaskProgressInfo setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public DescribeTasksResponseBodyItemsTaskProgressInfo setProgress(String progress) {
            this.progress = progress;
            return this;
        }
        public String getProgress() {
            return this.progress;
        }

        public DescribeTasksResponseBodyItemsTaskProgressInfo setExpectedFinishTime(String expectedFinishTime) {
            this.expectedFinishTime = expectedFinishTime;
            return this;
        }
        public String getExpectedFinishTime() {
            return this.expectedFinishTime;
        }

        public DescribeTasksResponseBodyItemsTaskProgressInfo setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
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

        public DescribeTasksResponseBodyItemsTaskProgressInfo setStepsInfo(String stepsInfo) {
            this.stepsInfo = stepsInfo;
            return this;
        }
        public String getStepsInfo() {
            return this.stepsInfo;
        }

        public DescribeTasksResponseBodyItemsTaskProgressInfo setRemain(Integer remain) {
            this.remain = remain;
            return this;
        }
        public Integer getRemain() {
            return this.remain;
        }

        public DescribeTasksResponseBodyItemsTaskProgressInfo setStepProgressInfo(String stepProgressInfo) {
            this.stepProgressInfo = stepProgressInfo;
            return this;
        }
        public String getStepProgressInfo() {
            return this.stepProgressInfo;
        }

        public DescribeTasksResponseBodyItemsTaskProgressInfo setCurrentStepName(String currentStepName) {
            this.currentStepName = currentStepName;
            return this;
        }
        public String getCurrentStepName() {
            return this.currentStepName;
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
