// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class GetStandAloneReportsResponseBody extends TeaModel {
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
     * <p>The number of records on each page. Default value: 20. Maximum value: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The reports.</p>
     */
    @NameInMap("Reports")
    public java.util.List<GetStandAloneReportsResponseBodyReports> reports;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>FE9C65D7-930F-57A5-A207-8C396329****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The returned results.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The total number of records.</p>
     * 
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
         * <p>The creation time of the inspection task.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-01-22T08:20:31Z</p>
         */
        @NameInMap("CreatedTime")
        public String createdTime;

        /**
         * <p>The end time of the inspection. The time is in the YYYY-MM-DDTHH:mm:ssZ format.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-01-23T08:20:31Z</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("InspectionItems")
        public String inspectionItems;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("ReportLanguage")
        public String reportLanguage;

        @NameInMap("ReportType")
        public String reportType;

        /**
         * <p>The start time of the inspection. The time is in the YYYY-MM-DDTHH:mm:ssZ format.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-01-23T08:00:31Z</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>The status of the inspection task.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The ID of the inspection report.</p>
         * 
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

        public GetStandAloneReportsResponseBodyReports setInspectionItems(String inspectionItems) {
            this.inspectionItems = inspectionItems;
            return this;
        }
        public String getInspectionItems() {
            return this.inspectionItems;
        }

        public GetStandAloneReportsResponseBodyReports setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public GetStandAloneReportsResponseBodyReports setReportLanguage(String reportLanguage) {
            this.reportLanguage = reportLanguage;
            return this;
        }
        public String getReportLanguage() {
            return this.reportLanguage;
        }

        public GetStandAloneReportsResponseBodyReports setReportType(String reportType) {
            this.reportType = reportType;
            return this;
        }
        public String getReportType() {
            return this.reportType;
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
