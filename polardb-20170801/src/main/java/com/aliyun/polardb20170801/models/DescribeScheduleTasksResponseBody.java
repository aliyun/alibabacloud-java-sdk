// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeScheduleTasksResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("Data")
    public DescribeScheduleTasksResponseBodyData data;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeScheduleTasksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeScheduleTasksResponseBody self = new DescribeScheduleTasksResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeScheduleTasksResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeScheduleTasksResponseBody setData(DescribeScheduleTasksResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeScheduleTasksResponseBodyData getData() {
        return this.data;
    }

    public DescribeScheduleTasksResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeScheduleTasksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeScheduleTasksResponseBodyDataTimerInfos extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("Action")
        public String action;

        @NameInMap("PlannedEndTime")
        public String plannedEndTime;

        @NameInMap("PlannedTime")
        public String plannedTime;

        @NameInMap("DBClusterId")
        public String DBClusterId;

        @NameInMap("Region")
        public String region;

        @NameInMap("PlannedStartTime")
        public String plannedStartTime;

        @NameInMap("TaskId")
        public String taskId;

        @NameInMap("OrderId")
        public String orderId;

        @NameInMap("DbClusterStatus")
        public String dbClusterStatus;

        @NameInMap("DbClusterDescription")
        public String dbClusterDescription;

        public static DescribeScheduleTasksResponseBodyDataTimerInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeScheduleTasksResponseBodyDataTimerInfos self = new DescribeScheduleTasksResponseBodyDataTimerInfos();
            return TeaModel.build(map, self);
        }

        public DescribeScheduleTasksResponseBodyDataTimerInfos setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeScheduleTasksResponseBodyDataTimerInfos setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public DescribeScheduleTasksResponseBodyDataTimerInfos setPlannedEndTime(String plannedEndTime) {
            this.plannedEndTime = plannedEndTime;
            return this;
        }
        public String getPlannedEndTime() {
            return this.plannedEndTime;
        }

        public DescribeScheduleTasksResponseBodyDataTimerInfos setPlannedTime(String plannedTime) {
            this.plannedTime = plannedTime;
            return this;
        }
        public String getPlannedTime() {
            return this.plannedTime;
        }

        public DescribeScheduleTasksResponseBodyDataTimerInfos setDBClusterId(String DBClusterId) {
            this.DBClusterId = DBClusterId;
            return this;
        }
        public String getDBClusterId() {
            return this.DBClusterId;
        }

        public DescribeScheduleTasksResponseBodyDataTimerInfos setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public DescribeScheduleTasksResponseBodyDataTimerInfos setPlannedStartTime(String plannedStartTime) {
            this.plannedStartTime = plannedStartTime;
            return this;
        }
        public String getPlannedStartTime() {
            return this.plannedStartTime;
        }

        public DescribeScheduleTasksResponseBodyDataTimerInfos setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public DescribeScheduleTasksResponseBodyDataTimerInfos setOrderId(String orderId) {
            this.orderId = orderId;
            return this;
        }
        public String getOrderId() {
            return this.orderId;
        }

        public DescribeScheduleTasksResponseBodyDataTimerInfos setDbClusterStatus(String dbClusterStatus) {
            this.dbClusterStatus = dbClusterStatus;
            return this;
        }
        public String getDbClusterStatus() {
            return this.dbClusterStatus;
        }

        public DescribeScheduleTasksResponseBodyDataTimerInfos setDbClusterDescription(String dbClusterDescription) {
            this.dbClusterDescription = dbClusterDescription;
            return this;
        }
        public String getDbClusterDescription() {
            return this.dbClusterDescription;
        }

    }

    public static class DescribeScheduleTasksResponseBodyData extends TeaModel {
        @NameInMap("TimerInfos")
        public java.util.List<DescribeScheduleTasksResponseBodyDataTimerInfos> timerInfos;

        @NameInMap("TotalRecordCount")
        public Integer totalRecordCount;

        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

        public static DescribeScheduleTasksResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeScheduleTasksResponseBodyData self = new DescribeScheduleTasksResponseBodyData();
            return TeaModel.build(map, self);
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

    }

}
