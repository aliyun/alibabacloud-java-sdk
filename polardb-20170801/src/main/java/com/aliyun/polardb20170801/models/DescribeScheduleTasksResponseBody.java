// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeScheduleTasksResponseBody extends TeaModel {
    /**
     * <p>The result data that is returned.</p>
     */
    @NameInMap("Data")
    public DescribeScheduleTasksResponseBodyData data;

    /**
     * <p>The message that is returned for the request.</p>
     * <blockquote>
     * <p> If the request is successful, <strong>Successful</strong> is returned. If the request fails, an error message such as an error code is returned.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>936C7025-27A5-4CB1-BB31-540E1F0CCA12</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DescribeScheduleTasksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeScheduleTasksResponseBody self = new DescribeScheduleTasksResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeScheduleTasksResponseBody setData(DescribeScheduleTasksResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeScheduleTasksResponseBodyData getData() {
        return this.data;
    }

    public DescribeScheduleTasksResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeScheduleTasksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeScheduleTasksResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeScheduleTasksResponseBodyDataTimerInfos extends TeaModel {
        /**
         * <p>The type of the scheduled tasks.</p>
         * 
         * <strong>example:</strong>
         * <p>CreateDBNodes</p>
         */
        @NameInMap("Action")
        public String action;

        /**
         * <p>The cluster ID.</p>
         * 
         * <strong>example:</strong>
         * <p>pc-**************</p>
         */
        @NameInMap("DBClusterId")
        public String DBClusterId;

        /**
         * <p>The description of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>test_cluster</p>
         */
        @NameInMap("DbClusterDescription")
        public String dbClusterDescription;

        /**
         * <p>The state of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("DbClusterStatus")
        public String dbClusterStatus;

        /**
         * <p>The ID of the order.</p>
         * <blockquote>
         * <p> This parameter is returned only when you set the <code>Action</code> parameter to <strong>CreateDBNodes</strong> or <strong>ModifyDBNodeClass</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>208161753******</p>
         */
        @NameInMap("OrderId")
        public String orderId;

        /**
         * <p>The latest start time of the task that you specified when you created the scheduled task. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-01-28T12:30Z</p>
         */
        @NameInMap("PlannedEndTime")
        public String plannedEndTime;

        /**
         * <p>The earliest start time of the task that you specified when you created the scheduled task. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-01-28T12:00Z</p>
         */
        @NameInMap("PlannedStartTime")
        public String plannedStartTime;

        /**
         * <p>The expected start time of the task. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-01-28T12:16Z</p>
         */
        @NameInMap("PlannedTime")
        public String plannedTime;

        /**
         * <p>The ID of the region in which the scheduled task runs.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <p>The state of the scheduled task.</p>
         * 
         * <strong>example:</strong>
         * <p>finish</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>Indicates whether the scheduled task can be canceled. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("TaskCancel")
        public Boolean taskCancel;

        /**
         * <p>The ID of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>53879cdb-9a00-428e-acaf-ff4cff******</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        public static DescribeScheduleTasksResponseBodyDataTimerInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeScheduleTasksResponseBodyDataTimerInfos self = new DescribeScheduleTasksResponseBodyDataTimerInfos();
            return TeaModel.build(map, self);
        }

        public DescribeScheduleTasksResponseBodyDataTimerInfos setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public DescribeScheduleTasksResponseBodyDataTimerInfos setDBClusterId(String DBClusterId) {
            this.DBClusterId = DBClusterId;
            return this;
        }
        public String getDBClusterId() {
            return this.DBClusterId;
        }

        public DescribeScheduleTasksResponseBodyDataTimerInfos setDbClusterDescription(String dbClusterDescription) {
            this.dbClusterDescription = dbClusterDescription;
            return this;
        }
        public String getDbClusterDescription() {
            return this.dbClusterDescription;
        }

        public DescribeScheduleTasksResponseBodyDataTimerInfos setDbClusterStatus(String dbClusterStatus) {
            this.dbClusterStatus = dbClusterStatus;
            return this;
        }
        public String getDbClusterStatus() {
            return this.dbClusterStatus;
        }

        public DescribeScheduleTasksResponseBodyDataTimerInfos setOrderId(String orderId) {
            this.orderId = orderId;
            return this;
        }
        public String getOrderId() {
            return this.orderId;
        }

        public DescribeScheduleTasksResponseBodyDataTimerInfos setPlannedEndTime(String plannedEndTime) {
            this.plannedEndTime = plannedEndTime;
            return this;
        }
        public String getPlannedEndTime() {
            return this.plannedEndTime;
        }

        public DescribeScheduleTasksResponseBodyDataTimerInfos setPlannedStartTime(String plannedStartTime) {
            this.plannedStartTime = plannedStartTime;
            return this;
        }
        public String getPlannedStartTime() {
            return this.plannedStartTime;
        }

        public DescribeScheduleTasksResponseBodyDataTimerInfos setPlannedTime(String plannedTime) {
            this.plannedTime = plannedTime;
            return this;
        }
        public String getPlannedTime() {
            return this.plannedTime;
        }

        public DescribeScheduleTasksResponseBodyDataTimerInfos setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public DescribeScheduleTasksResponseBodyDataTimerInfos setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeScheduleTasksResponseBodyDataTimerInfos setTaskCancel(Boolean taskCancel) {
            this.taskCancel = taskCancel;
            return this;
        }
        public Boolean getTaskCancel() {
            return this.taskCancel;
        }

        public DescribeScheduleTasksResponseBodyDataTimerInfos setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

    public static class DescribeScheduleTasksResponseBodyData extends TeaModel {
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
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The details of the scheduled task.</p>
         */
        @NameInMap("TimerInfos")
        public java.util.List<DescribeScheduleTasksResponseBodyDataTimerInfos> timerInfos;

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TotalRecordCount")
        public Integer totalRecordCount;

        public static DescribeScheduleTasksResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeScheduleTasksResponseBodyData self = new DescribeScheduleTasksResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeScheduleTasksResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public DescribeScheduleTasksResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public DescribeScheduleTasksResponseBodyData setTimerInfos(java.util.List<DescribeScheduleTasksResponseBodyDataTimerInfos> timerInfos) {
            this.timerInfos = timerInfos;
            return this;
        }
        public java.util.List<DescribeScheduleTasksResponseBodyDataTimerInfos> getTimerInfos() {
            return this.timerInfos;
        }

        public DescribeScheduleTasksResponseBodyData setTotalRecordCount(Integer totalRecordCount) {
            this.totalRecordCount = totalRecordCount;
            return this;
        }
        public Integer getTotalRecordCount() {
            return this.totalRecordCount;
        }

    }

}
