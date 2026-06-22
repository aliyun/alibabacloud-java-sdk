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
     * <p>The list of operation task information.</p>
     */
    @NameInMap("Processes")
    public java.util.List<ListOperationProcessResponseBodyProcesses> processes;

    /**
     * <p>The ID of the request. Alibaba Cloud generates a unique identifier for each request. You can use this ID to troubleshoot issues.</p>
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
         * <p>The number of entries on the current page.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <p>The page number of the current page to display in a paged query. This parameter is used for paging.</p>
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
         * <p>The creation time of the task. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1674388824000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The number of completed subtasks.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("DetailTaskReadyCount")
        public Integer detailTaskReadyCount;

        /**
         * <p>The total number of subtasks.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("DetailTaskTotalCount")
        public Integer detailTaskTotalCount;

        /**
         * <p>The end time of the task. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1705467559000</p>
         */
        @NameInMap("EndTime")
        public Long endTime;

        /**
         * <p>The number of completed items.</p>
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
         * <p>The check task status code. Valid values:</p>
         * <ul>
         * <li>0: not started.</li>
         * <li>1: checking.</li>
         * <li>2: check completed.</li>
         * <li>3: timed out.</li>
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
         * <p>The task source. Valid values:</p>
         * <ul>
         * <li><strong>YAO_CHI</strong>: ApsaraDB.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>YAO_CHI</p>
         */
        @NameInMap("TaskSource")
        public String taskSource;

        /**
         * <p>The task type. Valid values:</p>
         * <ul>
         * <li>CHECK_ALL: full check.</li>
         * <li>CHECK_POLICY: check performed based on check items in the configured policy.</li>
         * <li>CHECK_SCHEDULE: scheduled check.</li>
         * <li>CHECK_ITEM: check performed based on specified check items.</li>
         * <li>CHECK_INSTANCE: check performed based on specified check items and instances.</li>
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

        public ListOperationProcessResponseBodyProcesses setDetailTaskReadyCount(Integer detailTaskReadyCount) {
            this.detailTaskReadyCount = detailTaskReadyCount;
            return this;
        }
        public Integer getDetailTaskReadyCount() {
            return this.detailTaskReadyCount;
        }

        public ListOperationProcessResponseBodyProcesses setDetailTaskTotalCount(Integer detailTaskTotalCount) {
            this.detailTaskTotalCount = detailTaskTotalCount;
            return this;
        }
        public Integer getDetailTaskTotalCount() {
            return this.detailTaskTotalCount;
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

        public ListOperationProcessResponseBodyProcesses setTaskSource(String taskSource) {
            this.taskSource = taskSource;
            return this;
        }
        public String getTaskSource() {
            return this.taskSource;
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
