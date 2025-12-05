// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20201020.models;

import com.aliyun.tea.*;

public class ListJMeterReportsResponseBody extends TeaModel {
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
     * <p>The returned message. If the request was successful, this parameter is left empty.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The number of the returned report page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of returned reports.</p>
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
    public java.util.List<ListJMeterReportsResponseBodyReports> reports;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A8E16480-15C1-555A-922F-B736A005E52D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
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
        /**
         * <p>The start time of the stress testing.</p>
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
         * <p>7R4RE352</p>
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
