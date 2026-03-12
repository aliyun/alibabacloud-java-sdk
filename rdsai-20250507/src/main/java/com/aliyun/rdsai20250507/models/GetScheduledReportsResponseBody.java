// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class GetScheduledReportsResponseBody extends TeaModel {
    /**
     * <p>The response message.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The page number. Pages start from 1. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The number of reports returned on each page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The details of the report.</p>
     */
    @NameInMap("Reports")
    public java.util.List<GetScheduledReportsResponseBodyReports> reports;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>FE9C65D7-930F-57A5-A207-8C396329****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The total number of returned reports.</p>
     * 
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
         * <p>The creation time of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-01-01T22:59:59Z</p>
         */
        @NameInMap("CreatedTime")
        public String createdTime;

        /**
         * <p>The end time of the inspection task. The time follows the ISO 8601 standard in the YYYY-MM-DDTHH:mm:ssZ format.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-01-01T23:59:59Z</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("ReportLanguage")
        public String reportLanguage;

        /**
         * <p>The start time of the inspection task. The time follows the ISO 8601 standard in the YYYY-MM-DDTHH:mm:ssZ format.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-01-01T00:00:00Z</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>The status of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The ID of the report.</p>
         * 
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

        public GetScheduledReportsResponseBodyReports setReportLanguage(String reportLanguage) {
            this.reportLanguage = reportLanguage;
            return this;
        }
        public String getReportLanguage() {
            return this.reportLanguage;
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
