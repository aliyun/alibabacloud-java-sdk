// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20201020.models;

import com.aliyun.tea.*;

public class ListPtsReportsResponseBody extends TeaModel {
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
    public java.util.List<ListPtsReportsResponseBodyReports> reports;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListPtsReportsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPtsReportsResponseBody self = new ListPtsReportsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPtsReportsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListPtsReportsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListPtsReportsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListPtsReportsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListPtsReportsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListPtsReportsResponseBody setReports(java.util.List<ListPtsReportsResponseBodyReports> reports) {
        this.reports = reports;
        return this;
    }
    public java.util.List<ListPtsReportsResponseBodyReports> getReports() {
        return this.reports;
    }

    public ListPtsReportsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListPtsReportsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListPtsReportsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListPtsReportsResponseBodyReports extends TeaModel {
        @NameInMap("ActualStartTime")
        public Long actualStartTime;

        @NameInMap("Duration")
        public String duration;

        @NameInMap("ReportId")
        public String reportId;

        @NameInMap("ReportName")
        public String reportName;

        @NameInMap("Vum")
        public Long vum;

        public static ListPtsReportsResponseBodyReports build(java.util.Map<String, ?> map) throws Exception {
            ListPtsReportsResponseBodyReports self = new ListPtsReportsResponseBodyReports();
            return TeaModel.build(map, self);
        }

        public ListPtsReportsResponseBodyReports setActualStartTime(Long actualStartTime) {
            this.actualStartTime = actualStartTime;
            return this;
        }
        public Long getActualStartTime() {
            return this.actualStartTime;
        }

        public ListPtsReportsResponseBodyReports setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public ListPtsReportsResponseBodyReports setReportId(String reportId) {
            this.reportId = reportId;
            return this;
        }
        public String getReportId() {
            return this.reportId;
        }

        public ListPtsReportsResponseBodyReports setReportName(String reportName) {
            this.reportName = reportName;
            return this;
        }
        public String getReportName() {
            return this.reportName;
        }

        public ListPtsReportsResponseBodyReports setVum(Long vum) {
            this.vum = vum;
            return this;
        }
        public Long getVum() {
            return this.vum;
        }

    }

}
