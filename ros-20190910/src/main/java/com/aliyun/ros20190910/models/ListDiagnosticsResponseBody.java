// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class ListDiagnosticsResponseBody extends TeaModel {
    /**
     * <p>The items that are diagnosed.</p>
     */
    @NameInMap("Diagnostics")
    public java.util.List<ListDiagnosticsResponseBodyDiagnostics> diagnostics;

    /**
     * <p>The HTTP status code returned. The value 200 indicates that the request was successful.</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The error message returned.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <br>
     * <p>*   true</p>
     * <p>*   false</p>
     */
    @NameInMap("Success")
    public String success;

    public static ListDiagnosticsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDiagnosticsResponseBody self = new ListDiagnosticsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDiagnosticsResponseBody setDiagnostics(java.util.List<ListDiagnosticsResponseBodyDiagnostics> diagnostics) {
        this.diagnostics = diagnostics;
        return this;
    }
    public java.util.List<ListDiagnosticsResponseBodyDiagnostics> getDiagnostics() {
        return this.diagnostics;
    }

    public ListDiagnosticsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListDiagnosticsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListDiagnosticsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListDiagnosticsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDiagnosticsResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class ListDiagnosticsResponseBodyDiagnostics extends TeaModel {
        /**
         * <p>The time when the diagnostic report was generated.</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The keyword in the diagnosis.</p>
         */
        @NameInMap("DiagnosticKey")
        public String diagnosticKey;

        /**
         * <p>The product that is diagnosed.</p>
         */
        @NameInMap("DiagnosticProduct")
        public String diagnosticProduct;

        /**
         * <p>The ID of the diagnostic report.</p>
         */
        @NameInMap("ReportId")
        public String reportId;

        /**
         * <p>The diagnosis status.</p>
         */
        @NameInMap("Status")
        public String status;

        public static ListDiagnosticsResponseBodyDiagnostics build(java.util.Map<String, ?> map) throws Exception {
            ListDiagnosticsResponseBodyDiagnostics self = new ListDiagnosticsResponseBodyDiagnostics();
            return TeaModel.build(map, self);
        }

        public ListDiagnosticsResponseBodyDiagnostics setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListDiagnosticsResponseBodyDiagnostics setDiagnosticKey(String diagnosticKey) {
            this.diagnosticKey = diagnosticKey;
            return this;
        }
        public String getDiagnosticKey() {
            return this.diagnosticKey;
        }

        public ListDiagnosticsResponseBodyDiagnostics setDiagnosticProduct(String diagnosticProduct) {
            this.diagnosticProduct = diagnosticProduct;
            return this;
        }
        public String getDiagnosticProduct() {
            return this.diagnosticProduct;
        }

        public ListDiagnosticsResponseBodyDiagnostics setReportId(String reportId) {
            this.reportId = reportId;
            return this;
        }
        public String getReportId() {
            return this.reportId;
        }

        public ListDiagnosticsResponseBodyDiagnostics setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
