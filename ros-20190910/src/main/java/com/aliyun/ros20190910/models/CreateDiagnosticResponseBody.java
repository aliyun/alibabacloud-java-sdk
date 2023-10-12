// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class CreateDiagnosticResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("DiagnosticType")
    public String diagnosticType;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("ReportId")
    public String reportId;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public String success;

    public static CreateDiagnosticResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDiagnosticResponseBody self = new CreateDiagnosticResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDiagnosticResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateDiagnosticResponseBody setDiagnosticType(String diagnosticType) {
        this.diagnosticType = diagnosticType;
        return this;
    }
    public String getDiagnosticType() {
        return this.diagnosticType;
    }

    public CreateDiagnosticResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public CreateDiagnosticResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateDiagnosticResponseBody setReportId(String reportId) {
        this.reportId = reportId;
        return this;
    }
    public String getReportId() {
        return this.reportId;
    }

    public CreateDiagnosticResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateDiagnosticResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

}
