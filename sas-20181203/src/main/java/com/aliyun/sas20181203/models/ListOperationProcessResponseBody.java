// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListOperationProcessResponseBody extends TeaModel {
    /**
     * <p>The pagination information.</p>
     */
    @NameInMap("PageInfo")
    public ListOperationProcessResponseBodyPageInfo pageInfo;

    /**
     * <p>The information about the operation tasks.</p>
     */
    @NameInMap("Processes")
    public java.util.List<ListOperationProcessResponseBodyProcesses> processes;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>F8B6F758-BCD4-597A-8A2C-DA5A552C****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListOperationProcessResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListOperationProcessResponseBody self = new ListOperationProcessResponseBody();
        return TeaModel.build(map, self);
    }

    public ListOperationProcessResponseBody setPageInfo(ListOperationProcessResponseBodyPageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public ListOperationProcessResponseBodyPageInfo getPageInfo() {
        return this.pageInfo;
    }

    public ListOperationProcessResponseBody setProcesses(java.util.List<ListOperationProcessResponseBodyProcesses> processes) {
        this.processes = processes;
        return this;
    }
    public java.util.List<ListOperationProcessResponseBodyProcesses> getProcesses() {
        return this.processes;
    }

    public ListOperationProcessResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListOperationProcessResponseBodyPageInfo extends TeaModel {
        /**
         * <p>The number of entries returned on the current page.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CurrentPage")
        public Integer currentPage;

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>263</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListOperationProcessResponseBodyPageInfo build(java.util.Map<String, ?> map) throws Exception {
            ListOperationProcessResponseBodyPageInfo self = new ListOperationProcessResponseBodyPageInfo();
            return TeaModel.build(map, self);
        }

        public ListOperationProcessResponseBodyPageInfo setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public ListOperationProcessResponseBodyPageInfo setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public ListOperationProcessResponseBodyPageInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListOperationProcessResponseBodyPageInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

    public static class ListOperationProcessResponseBodyProcesses extends TeaModel {
        /**
         * <p>The time when the task was created. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1674388824000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The end time of the task. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1705467559000</p>
         */
        @NameInMap("EndTime")
        public Long endTime;

        /**
         * <p>The number of tasks that are complete.</p>
         * 
         * <strong>example:</strong>
         * <p>197</p>
         */
        @NameInMap("FinishCount")
        public Integer finishCount;

        /**
         * <p>The start time of the task. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1705457102000</p>
         */
        @NameInMap("StartTime")
        public Long startTime;

        /**
         * <p>The task status code. Valid values:</p>
         * <ul>
         * <li>0: not started.</li>
         * <li>1: running.</li>
         * <li>2: complete.</li>
         * <li>3: times out.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("StatusCode")
        public Integer statusCode;

        /**
         * <p>The ID of the operation task.</p>
         * 
         * <strong>example:</strong>
         * <p>3d7a1b68-599f-4e16-9b45-e920a183b***</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <p>The task type. Valid values:</p>
         * <ul>
         * <li>CHECK_ALL: full check.</li>
         * <li>CHECK_POLICY: policy-based check for which check items are configured.</li>
         * <li>CHECK_SCHEDULE: scheduled check.</li>
         * <li>CHECK_ITEM: specific check item-based check.</li>
         * <li>CHECK_INSTANCE: specific check item-based check on specific instances.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CHECK_POLICY</p>
         */
        @NameInMap("TaskType")
        public String taskType;

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>337</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListOperationProcessResponseBodyProcesses build(java.util.Map<String, ?> map) throws Exception {
            ListOperationProcessResponseBodyProcesses self = new ListOperationProcessResponseBodyProcesses();
            return TeaModel.build(map, self);
        }

        public ListOperationProcessResponseBodyProcesses setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListOperationProcessResponseBodyProcesses setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public ListOperationProcessResponseBodyProcesses setFinishCount(Integer finishCount) {
            this.finishCount = finishCount;
            return this;
        }
        public Integer getFinishCount() {
            return this.finishCount;
        }

        public ListOperationProcessResponseBodyProcesses setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public ListOperationProcessResponseBodyProcesses setStatusCode(Integer statusCode) {
            this.statusCode = statusCode;
            return this;
        }
        public Integer getStatusCode() {
            return this.statusCode;
        }

        public ListOperationProcessResponseBodyProcesses setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public ListOperationProcessResponseBodyProcesses setTaskType(String taskType) {
            this.taskType = taskType;
            return this;
        }
        public String getTaskType() {
            return this.taskType;
        }

        public ListOperationProcessResponseBodyProcesses setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
