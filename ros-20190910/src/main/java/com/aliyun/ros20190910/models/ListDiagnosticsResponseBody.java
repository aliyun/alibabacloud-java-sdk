// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class ListDiagnosticsResponseBody extends TeaModel {
    @NameInMap("Diagnostics")
    public java.util.List<ListDiagnosticsResponseBodyDiagnostics> diagnostics;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("DiagnosticKey")
        public String diagnosticKey;

        @NameInMap("DiagnosticProduct")
        public String diagnosticProduct;

        @NameInMap("ReportId")
        public String reportId;

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
