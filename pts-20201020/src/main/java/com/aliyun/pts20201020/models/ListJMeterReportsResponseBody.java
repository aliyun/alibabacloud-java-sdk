// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20201020.models;

import com.aliyun.tea.*;

public class ListJMeterReportsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("Reports")
    public java.util.List<ListJMeterReportsResponseBodyReports> reports;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListJMeterReportsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListJMeterReportsResponseBody self = new ListJMeterReportsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListJMeterReportsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListJMeterReportsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListJMeterReportsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListJMeterReportsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListJMeterReportsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListJMeterReportsResponseBody setReports(java.util.List<ListJMeterReportsResponseBodyReports> reports) {
        this.reports = reports;
        return this;
    }
    public java.util.List<ListJMeterReportsResponseBodyReports> getReports() {
        return this.reports;
    }

    public ListJMeterReportsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListJMeterReportsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListJMeterReportsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListJMeterReportsResponseBodyReports extends TeaModel {
        // 压测开始时间
        @NameInMap("ActualStartTime")
        public Long actualStartTime;

        // 压测持续时间
        @NameInMap("Duration")
        public String duration;

        // 报告id
        @NameInMap("ReportId")
        public String reportId;

        // 报告名称
        @NameInMap("ReportName")
        public String reportName;

        // 消耗的vum
        @NameInMap("Vum")
        public Long vum;

        public static ListJMeterReportsResponseBodyReports build(java.util.Map<String, ?> map) throws Exception {
            ListJMeterReportsResponseBodyReports self = new ListJMeterReportsResponseBodyReports();
            return TeaModel.build(map, self);
        }

        public ListJMeterReportsResponseBodyReports setActualStartTime(Long actualStartTime) {
            this.actualStartTime = actualStartTime;
            return this;
        }
        public Long getActualStartTime() {
            return this.actualStartTime;
        }

        public ListJMeterReportsResponseBodyReports setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public ListJMeterReportsResponseBodyReports setReportId(String reportId) {
            this.reportId = reportId;
            return this;
        }
        public String getReportId() {
            return this.reportId;
        }

        public ListJMeterReportsResponseBodyReports setReportName(String reportName) {
            this.reportName = reportName;
            return this;
        }
        public String getReportName() {
            return this.reportName;
        }

        public ListJMeterReportsResponseBodyReports setVum(Long vum) {
            this.vum = vum;
            return this;
        }
        public Long getVum() {
            return this.vum;
        }

    }

}
