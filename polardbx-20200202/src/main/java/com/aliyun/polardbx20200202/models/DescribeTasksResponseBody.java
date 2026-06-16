// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DescribeTasksResponseBody extends TeaModel {
    /**
     * <p>The list of result items.</p>
     */
    @NameInMap("Items")
    public java.util.List<DescribeTasksResponseBodyItems> items;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
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
     * <p>D6045D78-C119-5A17-9DEA-0F810394E008</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("TotalRecordCount")
    public Integer totalRecordCount;

    public static DescribeTasksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeTasksResponseBody self = new DescribeTasksResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeTasksResponseBody setItems(java.util.List<DescribeTasksResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<DescribeTasksResponseBodyItems> getItems() {
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

    public static class DescribeTasksResponseBodyItems extends TeaModel {
        /**
         * <p>The start time of the task, in the yyyy-MM-dd\&quot;T\&quot;HH:mm:ss\&quot;Z\&quot; format.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-10-20T19:40:00Z</p>
         */
        @NameInMap("BeginTime")
        public String beginTime;

        /**
         * <p>The database name associated with the task. This parameter is generally empty.</p>
         * 
         * <strong>example:</strong>
         * <p>DBName</p>
         */
        @NameInMap("DBName")
        public String DBName;

        /**
         * <p>The end time of the task, in the yyyy-MM-dd\&quot;T\&quot;HH:mm:ss\&quot;Z\&quot; format.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-10-20T20:00:00Z</p>
         */
        @NameInMap("FinishTime")
        public String finishTime;

        /**
         * <p>The task progress, in percentage.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("Progress")
        public String progress;

        /**
         * <p>The detailed progress information of the task. This parameter is generally empty.</p>
         * 
         * <strong>example:</strong>
         * <p>ProgressInfo</p>
         */
        @NameInMap("ProgressInfo")
        public String progressInfo;

        /**
         * <p>The scale-out ID if the task is a scale-out task. This value serves as a unique key in the backend.</p>
         * 
         * <strong>example:</strong>
         * <p>FEA5DC20-6D8A-5979-97AA-FC57546ADC20</p>
         */
        @NameInMap("ScaleOutToken")
        public String scaleOutToken;

        /**
         * <p>The task status. Valid values:</p>
         * <ul>
         * <li><strong>RUNNING</strong>: The task is running.</li>
         * <li><strong>FAILED</strong>: The task failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>RUNNING</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The task action, which serves as the unique key for the backend task type.</p>
         * 
         * <strong>example:</strong>
         * <p>multi_scale_out</p>
         */
        @NameInMap("TaskAction")
        public String taskAction;

        /**
         * <p>The error code of the failed task.</p>
         * 
         * <strong>example:</strong>
         * <p>TaskErrorCode</p>
         */
        @NameInMap("TaskErrorCode")
        public String taskErrorCode;

        /**
         * <p>The error message of the failed task.</p>
         * 
         * <strong>example:</strong>
         * <p>TaskErrorMessage</p>
         */
        @NameInMap("TaskErrorMessage")
        public String taskErrorMessage;

        /**
         * <p>The task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>20089398</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        public static DescribeTasksResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeTasksResponseBodyItems self = new DescribeTasksResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeTasksResponseBodyItems setBeginTime(String beginTime) {
            this.beginTime = beginTime;
            return this;
        }
        public String getBeginTime() {
            return this.beginTime;
        }

        public DescribeTasksResponseBodyItems setDBName(String DBName) {
            this.DBName = DBName;
            return this;
        }
        public String getDBName() {
            return this.DBName;
        }

        public DescribeTasksResponseBodyItems setFinishTime(String finishTime) {
            this.finishTime = finishTime;
            return this;
        }
        public String getFinishTime() {
            return this.finishTime;
        }

        public DescribeTasksResponseBodyItems setProgress(String progress) {
            this.progress = progress;
            return this;
        }
        public String getProgress() {
            return this.progress;
        }

        public DescribeTasksResponseBodyItems setProgressInfo(String progressInfo) {
            this.progressInfo = progressInfo;
            return this;
        }
        public String getProgressInfo() {
            return this.progressInfo;
        }

        public DescribeTasksResponseBodyItems setScaleOutToken(String scaleOutToken) {
            this.scaleOutToken = scaleOutToken;
            return this;
        }
        public String getScaleOutToken() {
            return this.scaleOutToken;
        }

        public DescribeTasksResponseBodyItems setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeTasksResponseBodyItems setTaskAction(String taskAction) {
            this.taskAction = taskAction;
            return this;
        }
        public String getTaskAction() {
            return this.taskAction;
        }

        public DescribeTasksResponseBodyItems setTaskErrorCode(String taskErrorCode) {
            this.taskErrorCode = taskErrorCode;
            return this;
        }
        public String getTaskErrorCode() {
            return this.taskErrorCode;
        }

        public DescribeTasksResponseBodyItems setTaskErrorMessage(String taskErrorMessage) {
            this.taskErrorMessage = taskErrorMessage;
            return this;
        }
        public String getTaskErrorMessage() {
            return this.taskErrorMessage;
        }

        public DescribeTasksResponseBodyItems setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
