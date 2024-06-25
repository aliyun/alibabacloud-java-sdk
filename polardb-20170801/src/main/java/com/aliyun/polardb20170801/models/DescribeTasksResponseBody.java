// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeTasksResponseBody extends TeaModel {
    /**
     * <p>The ID of the cluster for which the task was created.</p>
     * 
     * <strong>example:</strong>
     * <p>pc-***************</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The end time of the query.</p>
     * 
     * <strong>example:</strong>
     * <p>2020-12-02T03:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The page number of the page returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageRecordCount")
    public Integer pageRecordCount;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>4352AD99-9FF5-41A6-A319-068089******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The start time of the query.</p>
     * 
     * <strong>example:</strong>
     * <p>2020-11-30T00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The details of the task.</p>
     */
    @NameInMap("Tasks")
    public DescribeTasksResponseBodyTasks tasks;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalRecordCount")
    public Integer totalRecordCount;

    public static DescribeTasksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeTasksResponseBody self = new DescribeTasksResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeTasksResponseBody setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DescribeTasksResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
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

    public DescribeTasksResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeTasksResponseBody setTasks(DescribeTasksResponseBodyTasks tasks) {
        this.tasks = tasks;
        return this;
    }
    public DescribeTasksResponseBodyTasks getTasks() {
        return this.tasks;
    }

    public DescribeTasksResponseBody setTotalRecordCount(Integer totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
        return this;
    }
    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static class DescribeTasksResponseBodyTasksTask extends TeaModel {
        /**
         * <p>The time when the task was started. The time follows the ISO 8601 standard in the <code>YYYY-MM-DDThh:mm:ssZ</code> format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-12-02T02:39:15Z</p>
         */
        @NameInMap("BeginTime")
        public String beginTime;

        /**
         * <p>The name of the current step.</p>
         * 
         * <strong>example:</strong>
         * <p>create_instance</p>
         */
        @NameInMap("CurrentStepName")
        public String currentStepName;

        /**
         * <p>The database name.</p>
         * <blockquote>
         * <p> This parameter is returned for only the tasks that involve database operations.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("DBName")
        public String DBName;

        /**
         * <p>The estimated end time of the task. In most cases, this parameter is empty.</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("ExpectedFinishTime")
        public String expectedFinishTime;

        /**
         * <p>The time when the task was completed. The time follows the ISO 8601 standard in the <code>YYYY-MM-DDThh:mm:ssZ</code> format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-12-02T02:40:15Z</p>
         */
        @NameInMap("FinishTime")
        public String finishTime;

        /**
         * <p>The progress of the task in percentage.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Progress")
        public Integer progress;

        /**
         * <p>The description of the task progress. If no progress description is provided for the task, this parameter is empty.</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("ProgressInfo")
        public String progressInfo;

        /**
         * <p>The estimated remaining duration of the task. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1767</p>
         */
        @NameInMap("Remain")
        public Integer remain;

        /**
         * <p>The progress of the subtasks. For example, the value <code>1/4</code> indicates that the task consists of four subtasks and the first subtask is in progress.</p>
         * 
         * <strong>example:</strong>
         * <p>1/4</p>
         */
        @NameInMap("StepProgressInfo")
        public String stepProgressInfo;

        /**
         * <p>The details of the subtasks.</p>
         * 
         * <strong>example:</strong>
         * <p>[{\&quot;remain\&quot;:0,\&quot;name\&quot;:\&quot;init_task\&quot;,\&quot;progress\&quot;:100},{\&quot;remain\&quot;:1764,\&quot;name\&quot;:\&quot;create_instance\&quot;,\&quot;progress\&quot;:0},{\&quot;remain\&quot;:1,\&quot;name\&quot;:\&quot;init_cluster\&quot;,\&quot;progress\&quot;:0},{\&quot;remain\&quot;:2,\&quot;name\&quot;:\&quot;create_backup\&quot;,\&quot;progress\&quot;:0}]</p>
         */
        @NameInMap("StepsInfo")
        public String stepsInfo;

        /**
         * <p>The API operation that is used by the task. Example: <code>CreateDBInstance</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>CreateDBInstance</p>
         */
        @NameInMap("TaskAction")
        public String taskAction;

        /**
         * <p>The error code that is returned when an error occurs.</p>
         * <blockquote>
         * <p> This parameter is returned only when the task is in the <strong>Stop</strong> state.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("TaskErrorCode")
        public String taskErrorCode;

        /**
         * <p>The error message that is returned when an error occurs.</p>
         * <blockquote>
         * <p> This parameter is returned only when the task is in the <strong>Stop</strong> state.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("TaskErrorMessage")
        public String taskErrorMessage;

        /**
         * <p>The ID of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>111111111</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        public static DescribeTasksResponseBodyTasksTask build(java.util.Map<String, ?> map) throws Exception {
            DescribeTasksResponseBodyTasksTask self = new DescribeTasksResponseBodyTasksTask();
            return TeaModel.build(map, self);
        }

        public DescribeTasksResponseBodyTasksTask setBeginTime(String beginTime) {
            this.beginTime = beginTime;
            return this;
        }
        public String getBeginTime() {
            return this.beginTime;
        }

        public DescribeTasksResponseBodyTasksTask setCurrentStepName(String currentStepName) {
            this.currentStepName = currentStepName;
            return this;
        }
        public String getCurrentStepName() {
            return this.currentStepName;
        }

        public DescribeTasksResponseBodyTasksTask setDBName(String DBName) {
            this.DBName = DBName;
            return this;
        }
        public String getDBName() {
            return this.DBName;
        }

        public DescribeTasksResponseBodyTasksTask setExpectedFinishTime(String expectedFinishTime) {
            this.expectedFinishTime = expectedFinishTime;
            return this;
        }
        public String getExpectedFinishTime() {
            return this.expectedFinishTime;
        }

        public DescribeTasksResponseBodyTasksTask setFinishTime(String finishTime) {
            this.finishTime = finishTime;
            return this;
        }
        public String getFinishTime() {
            return this.finishTime;
        }

        public DescribeTasksResponseBodyTasksTask setProgress(Integer progress) {
            this.progress = progress;
            return this;
        }
        public Integer getProgress() {
            return this.progress;
        }

        public DescribeTasksResponseBodyTasksTask setProgressInfo(String progressInfo) {
            this.progressInfo = progressInfo;
            return this;
        }
        public String getProgressInfo() {
            return this.progressInfo;
        }

        public DescribeTasksResponseBodyTasksTask setRemain(Integer remain) {
            this.remain = remain;
            return this;
        }
        public Integer getRemain() {
            return this.remain;
        }

        public DescribeTasksResponseBodyTasksTask setStepProgressInfo(String stepProgressInfo) {
            this.stepProgressInfo = stepProgressInfo;
            return this;
        }
        public String getStepProgressInfo() {
            return this.stepProgressInfo;
        }

        public DescribeTasksResponseBodyTasksTask setStepsInfo(String stepsInfo) {
            this.stepsInfo = stepsInfo;
            return this;
        }
        public String getStepsInfo() {
            return this.stepsInfo;
        }

        public DescribeTasksResponseBodyTasksTask setTaskAction(String taskAction) {
            this.taskAction = taskAction;
            return this;
        }
        public String getTaskAction() {
            return this.taskAction;
        }

        public DescribeTasksResponseBodyTasksTask setTaskErrorCode(String taskErrorCode) {
            this.taskErrorCode = taskErrorCode;
            return this;
        }
        public String getTaskErrorCode() {
            return this.taskErrorCode;
        }

        public DescribeTasksResponseBodyTasksTask setTaskErrorMessage(String taskErrorMessage) {
            this.taskErrorMessage = taskErrorMessage;
            return this;
        }
        public String getTaskErrorMessage() {
            return this.taskErrorMessage;
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
