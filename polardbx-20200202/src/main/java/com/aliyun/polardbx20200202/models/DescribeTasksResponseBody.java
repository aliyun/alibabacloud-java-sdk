// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DescribeTasksResponseBody extends TeaModel {
    @NameInMap("Items")
    public java.util.List<DescribeTasksResponseBodyItems> items;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageRecordCount")
    public Integer pageRecordCount;

    /**
     * <strong>example:</strong>
     * <p>D6045D78-C119-5A17-9DEA-0F810394E008</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
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
         * <strong>example:</strong>
         * <p>2021-10-20T19:40:00Z</p>
         */
        @NameInMap("BeginTime")
        public String beginTime;

        /**
         * <strong>example:</strong>
         * <p>DBName</p>
         */
        @NameInMap("DBName")
        public String DBName;

        /**
         * <strong>example:</strong>
         * <p>2021-10-20T20:00:00Z</p>
         */
        @NameInMap("FinishTime")
        public String finishTime;

        /**
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("Progress")
        public String progress;

        /**
         * <strong>example:</strong>
         * <p>ProgressInfo</p>
         */
        @NameInMap("ProgressInfo")
        public String progressInfo;

        /**
         * <strong>example:</strong>
         * <p>FEA5DC20-6D8A-5979-97AA-FC57546ADC20</p>
         */
        @NameInMap("ScaleOutToken")
        public String scaleOutToken;

        /**
         * <strong>example:</strong>
         * <p>RUNNING</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>multi_scale_out</p>
         */
        @NameInMap("TaskAction")
        public String taskAction;

        /**
         * <strong>example:</strong>
         * <p>TaskErrorCode</p>
         */
        @NameInMap("TaskErrorCode")
        public String taskErrorCode;

        /**
         * <strong>example:</strong>
         * <p>TaskErrorMessage</p>
         */
        @NameInMap("TaskErrorMessage")
        public String taskErrorMessage;

        /**
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
