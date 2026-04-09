// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openapiexplorer20241130.models;

import com.aliyun.tea.*;

public class ApiMcpServerValidateHclResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Argument or block definition required: An argument or block definition is required here.</p>
     */
    @NameInMap("diagnosticReport")
    public Object diagnosticReport;

    @NameInMap("errors")
    public java.util.List<String> errors;

    /**
     * <strong>example:</strong>
     * <p>0628e13692023222bef9d6377dd03da3304b689e1b2df60f584ea27b4163bf07</p>
     */
    @NameInMap("hash")
    public String hash;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("isValid")
    public Boolean isValid;

    @NameInMap("parameters")
    public java.util.List<?> parameters;

    /**
     * <strong>example:</strong>
     * <p>9BFC4AC1-6BE4-5405-BDEC-CA288D404812</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("warnings")
    public java.util.List<String> warnings;

    public static ApiMcpServerValidateHclResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ApiMcpServerValidateHclResponseBody self = new ApiMcpServerValidateHclResponseBody();
        return TeaModel.build(map, self);
    }

    public ApiMcpServerValidateHclResponseBody setDiagnosticReport(Object diagnosticReport) {
        this.diagnosticReport = diagnosticReport;
        return this;
    }
    public Object getDiagnosticReport() {
        return this.diagnosticReport;
    }

    public ApiMcpServerValidateHclResponseBody setErrors(java.util.List<String> errors) {
        this.errors = errors;
        return this;
    }
    public java.util.List<String> getErrors() {
        return this.errors;
    }

    public ApiMcpServerValidateHclResponseBody setHash(String hash) {
        this.hash = hash;
        return this;
    }
    public String getHash() {
        return this.hash;
    }

    public ApiMcpServerValidateHclResponseBody setIsValid(Boolean isValid) {
        this.isValid = isValid;
        return this;
    }
    public Boolean getIsValid() {
        return this.isValid;
    }

    public ApiMcpServerValidateHclResponseBody setParameters(java.util.List<?> parameters) {
        this.parameters = parameters;
        return this;
    }
    public java.util.List<?> getParameters() {
        return this.parameters;
    }

    public ApiMcpServerValidateHclResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ApiMcpServerValidateHclResponseBody setWarnings(java.util.List<String> warnings) {
        this.warnings = warnings;
        return this;
    }
    public java.util.List<String> getWarnings() {
        return this.warnings;
    }

}
