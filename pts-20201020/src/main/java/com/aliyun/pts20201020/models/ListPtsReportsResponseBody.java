// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20201020.models;

import com.aliyun.tea.*;

public class ListPtsReportsResponseBody extends TeaModel {
    /**
     * <p>The system status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The returned message. If the request was successful, an empty string is returned.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The number of the returned page. The page number starts from 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of reports returned per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The reports.</p>
     */
    @NameInMap("Reports")
    public java.util.List<ListPtsReportsResponseBodyReports> reports;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A8E4LR80-15P1-555A-9ZZF-B736AZO5E5ID</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values: true false</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The total number of reports returned based on the condition.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
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
        /**
         * <p>The timestamp when the stress testing starts. Unit: ms.</p>
         * 
         * <strong>example:</strong>
         * <p>1637157073000</p>
         */
        @NameInMap("ActualStartTime")
        public Long actualStartTime;

        /**
         * <p>The stress testing duration.</p>
         * 
         * <strong>example:</strong>
         * <p>10分钟</p>
         */
        @NameInMap("Duration")
        public String duration;

        /**
         * <p>The report ID.</p>
         * 
         * <strong>example:</strong>
         * <p>7RLPM3Y2</p>
         */
        @NameInMap("ReportId")
        public String reportId;

        /**
         * <p>The report name.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("ReportName")
        public String reportName;

        /**
         * <p>The consumed Virtual User Minutes (VUM).</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
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
