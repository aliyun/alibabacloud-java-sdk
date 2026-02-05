// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class GetScheduledReportsResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("Reports")
    public java.util.List<GetScheduledReportsResponseBodyReports> reports;

    /**
     * <strong>example:</strong>
     * <p>FE9C65D7-930F-57A5-A207-8C396329****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static GetScheduledReportsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetScheduledReportsResponseBody self = new GetScheduledReportsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetScheduledReportsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetScheduledReportsResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public GetScheduledReportsResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public GetScheduledReportsResponseBody setReports(java.util.List<GetScheduledReportsResponseBodyReports> reports) {
        this.reports = reports;
        return this;
    }
    public java.util.List<GetScheduledReportsResponseBodyReports> getReports() {
        return this.reports;
    }

    public GetScheduledReportsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetScheduledReportsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetScheduledReportsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class GetScheduledReportsResponseBodyReports extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2025-01-01T22:59:59Z</p>
         */
        @NameInMap("CreatedTime")
        public String createdTime;

        /**
         * <strong>example:</strong>
         * <p>2025-01-01T23:59:59Z</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <strong>example:</strong>
         * <p>2025-01-01T00:00:00Z</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <strong>example:</strong>
         * <p>success</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>65f0053b-f933-49f5-bf65-4e4593e1****</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        public static GetScheduledReportsResponseBodyReports build(java.util.Map<String, ?> map) throws Exception {
            GetScheduledReportsResponseBodyReports self = new GetScheduledReportsResponseBodyReports();
            return TeaModel.build(map, self);
        }

        public GetScheduledReportsResponseBodyReports setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public String getCreatedTime() {
            return this.createdTime;
        }

        public GetScheduledReportsResponseBodyReports setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public GetScheduledReportsResponseBodyReports setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public GetScheduledReportsResponseBodyReports setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetScheduledReportsResponseBodyReports setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
