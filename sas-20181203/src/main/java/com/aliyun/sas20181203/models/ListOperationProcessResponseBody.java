// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListOperationProcessResponseBody extends TeaModel {
    @NameInMap("PageInfo")
    public ListOperationProcessResponseBodyPageInfo pageInfo;

    @NameInMap("Processes")
    public java.util.List<ListOperationProcessResponseBodyProcesses> processes;

    /**
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
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CurrentPage")
        public Integer currentPage;

        /**
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
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
         * <strong>example:</strong>
         * <p>1674388824000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <strong>example:</strong>
         * <p>1705467559000</p>
         */
        @NameInMap("EndTime")
        public Long endTime;

        /**
         * <strong>example:</strong>
         * <p>197</p>
         */
        @NameInMap("FinishCount")
        public Integer finishCount;

        /**
         * <strong>example:</strong>
         * <p>1705457102000</p>
         */
        @NameInMap("StartTime")
        public Long startTime;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("StatusCode")
        public Integer statusCode;

        /**
         * <strong>example:</strong>
         * <p>3d7a1b68-599f-4e16-9b45-e920a183b***</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <strong>example:</strong>
         * <p>CHECK_POLICY</p>
         */
        @NameInMap("TaskType")
        public String taskType;

        /**
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
