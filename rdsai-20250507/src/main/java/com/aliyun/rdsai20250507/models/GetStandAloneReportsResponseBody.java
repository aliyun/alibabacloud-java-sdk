// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class GetStandAloneReportsResponseBody extends TeaModel {
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
    public java.util.List<GetStandAloneReportsResponseBodyReports> reports;

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

    public static GetStandAloneReportsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetStandAloneReportsResponseBody self = new GetStandAloneReportsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetStandAloneReportsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetStandAloneReportsResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public GetStandAloneReportsResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public GetStandAloneReportsResponseBody setReports(java.util.List<GetStandAloneReportsResponseBodyReports> reports) {
        this.reports = reports;
        return this;
    }
    public java.util.List<GetStandAloneReportsResponseBodyReports> getReports() {
        return this.reports;
    }

    public GetStandAloneReportsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetStandAloneReportsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetStandAloneReportsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class GetStandAloneReportsResponseBodyReports extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2026-01-22T08:20:31Z</p>
         */
        @NameInMap("CreatedTime")
        public String createdTime;

        /**
         * <strong>example:</strong>
         * <p>2026-01-23T08:20:31Z</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <strong>example:</strong>
         * <p>2026-01-23T08:00:31Z</p>
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
         * <p>0f19210c-7bb8-4e38-a099-f94152df****</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        public static GetStandAloneReportsResponseBodyReports build(java.util.Map<String, ?> map) throws Exception {
            GetStandAloneReportsResponseBodyReports self = new GetStandAloneReportsResponseBodyReports();
            return TeaModel.build(map, self);
        }

        public GetStandAloneReportsResponseBodyReports setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public String getCreatedTime() {
            return this.createdTime;
        }

        public GetStandAloneReportsResponseBodyReports setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public GetStandAloneReportsResponseBodyReports setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public GetStandAloneReportsResponseBodyReports setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetStandAloneReportsResponseBodyReports setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
