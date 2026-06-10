// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class GetRealtimeConcurrencyReportResponseBody extends TeaModel {
    /**
     * <p>API status code</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>HTTP status code</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>Response message</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Report generation time</p>
     * 
     * <strong>example:</strong>
     * <p>1743474900488</p>
     */
    @NameInMap("ReportDate")
    public Long reportDate;

    /**
     * <p>Report details.</p>
     */
    @NameInMap("Reports")
    public GetRealtimeConcurrencyReportResponseBodyReports reports;

    /**
     * <p>Request ID</p>
     * 
     * <strong>example:</strong>
     * <p>254EB995-DEDF-48A4-9101-9CA5B72FFBCC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Is successful</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetRealtimeConcurrencyReportResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetRealtimeConcurrencyReportResponseBody self = new GetRealtimeConcurrencyReportResponseBody();
        return TeaModel.build(map, self);
    }

    public GetRealtimeConcurrencyReportResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetRealtimeConcurrencyReportResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetRealtimeConcurrencyReportResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetRealtimeConcurrencyReportResponseBody setReportDate(Long reportDate) {
        this.reportDate = reportDate;
        return this;
    }
    public Long getReportDate() {
        return this.reportDate;
    }

    public GetRealtimeConcurrencyReportResponseBody setReports(GetRealtimeConcurrencyReportResponseBodyReports reports) {
        this.reports = reports;
        return this;
    }
    public GetRealtimeConcurrencyReportResponseBodyReports getReports() {
        return this.reports;
    }

    public GetRealtimeConcurrencyReportResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetRealtimeConcurrencyReportResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetRealtimeConcurrencyReportResponseBodyReportsList extends TeaModel {
        /**
         * <p>Instance ID</p>
         * 
         * <strong>example:</strong>
         * <p>85bf7efa-a07c-498a-850e-99a5849b8589</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>Instance name</p>
         * 
         * <strong>example:</strong>
         * <p>智能外呼场景</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>Job ID</p>
         * 
         * <strong>example:</strong>
         * <p>c62e6789-28a8-41db-941e-171a01d3b3b9</p>
         */
        @NameInMap("JobGroupId")
        public String jobGroupId;

        /**
         * <p>Job name.</p>
         * 
         * <strong>example:</strong>
         * <p>第一个作业组</p>
         */
        @NameInMap("JobGroupName")
        public String jobGroupName;

        /**
         * <p>Maximum configured concurrency limit</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("MaxConcurrencyLimit")
        public Long maxConcurrencyLimit;

        /**
         * <p>Minimum concurrency limit for the job</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("MinConcurrencyLimit")
        public Long minConcurrencyLimit;

        /**
         * <p>Occupied concurrency value</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("OccupiedConcurrencyCount")
        public Long occupiedConcurrencyCount;

        /**
         * <p>Report generation time</p>
         * 
         * <strong>example:</strong>
         * <p>1743474900488</p>
         */
        @NameInMap("ReportDate")
        public Long reportDate;

        public static GetRealtimeConcurrencyReportResponseBodyReportsList build(java.util.Map<String, ?> map) throws Exception {
            GetRealtimeConcurrencyReportResponseBodyReportsList self = new GetRealtimeConcurrencyReportResponseBodyReportsList();
            return TeaModel.build(map, self);
        }

        public GetRealtimeConcurrencyReportResponseBodyReportsList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetRealtimeConcurrencyReportResponseBodyReportsList setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public GetRealtimeConcurrencyReportResponseBodyReportsList setJobGroupId(String jobGroupId) {
            this.jobGroupId = jobGroupId;
            return this;
        }
        public String getJobGroupId() {
            return this.jobGroupId;
        }

        public GetRealtimeConcurrencyReportResponseBodyReportsList setJobGroupName(String jobGroupName) {
            this.jobGroupName = jobGroupName;
            return this;
        }
        public String getJobGroupName() {
            return this.jobGroupName;
        }

        public GetRealtimeConcurrencyReportResponseBodyReportsList setMaxConcurrencyLimit(Long maxConcurrencyLimit) {
            this.maxConcurrencyLimit = maxConcurrencyLimit;
            return this;
        }
        public Long getMaxConcurrencyLimit() {
            return this.maxConcurrencyLimit;
        }

        public GetRealtimeConcurrencyReportResponseBodyReportsList setMinConcurrencyLimit(Long minConcurrencyLimit) {
            this.minConcurrencyLimit = minConcurrencyLimit;
            return this;
        }
        public Long getMinConcurrencyLimit() {
            return this.minConcurrencyLimit;
        }

        public GetRealtimeConcurrencyReportResponseBodyReportsList setOccupiedConcurrencyCount(Long occupiedConcurrencyCount) {
            this.occupiedConcurrencyCount = occupiedConcurrencyCount;
            return this;
        }
        public Long getOccupiedConcurrencyCount() {
            return this.occupiedConcurrencyCount;
        }

        public GetRealtimeConcurrencyReportResponseBodyReportsList setReportDate(Long reportDate) {
            this.reportDate = reportDate;
            return this;
        }
        public Long getReportDate() {
            return this.reportDate;
        }

    }

    public static class GetRealtimeConcurrencyReportResponseBodyReports extends TeaModel {
        /**
         * <p>Report collection data</p>
         */
        @NameInMap("List")
        public java.util.List<GetRealtimeConcurrencyReportResponseBodyReportsList> list;

        /**
         * <p>Page number</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <p>Page size</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>Total count</p>
         * 
         * <strong>example:</strong>
         * <p>16</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static GetRealtimeConcurrencyReportResponseBodyReports build(java.util.Map<String, ?> map) throws Exception {
            GetRealtimeConcurrencyReportResponseBodyReports self = new GetRealtimeConcurrencyReportResponseBodyReports();
            return TeaModel.build(map, self);
        }

        public GetRealtimeConcurrencyReportResponseBodyReports setList(java.util.List<GetRealtimeConcurrencyReportResponseBodyReportsList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<GetRealtimeConcurrencyReportResponseBodyReportsList> getList() {
            return this.list;
        }

        public GetRealtimeConcurrencyReportResponseBodyReports setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public GetRealtimeConcurrencyReportResponseBodyReports setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public GetRealtimeConcurrencyReportResponseBodyReports setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
