// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class GetDiagnosticResponseBody extends TeaModel {
    /**
     * <p>The error code returned.</p>
     * 
     * <strong>example:</strong>
     * <p>Forbidden</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The keyword in the diagnosis.</p>
     * 
     * <strong>example:</strong>
     * <p>0938F60C-A2CA-5A2E-9983-03EB1E6D7AE2</p>
     */
    @NameInMap("DiagnosticKey")
    public String diagnosticKey;

    /**
     * <p>The name of the diagnostic item.</p>
     * 
     * <strong>example:</strong>
     * <p>ros</p>
     */
    @NameInMap("DiagnosticProduct")
    public String diagnosticProduct;

    /**
     * <p>The diagnosis result.</p>
     */
    @NameInMap("DiagnosticResult")
    public GetDiagnosticResponseBodyDiagnosticResult diagnosticResult;

    /**
     * <p>The time when the diagnosis was performed.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-03-27T03:32:03Z</p>
     */
    @NameInMap("DiagnosticTime")
    public String diagnosticTime;

    /**
     * <p>The HTTP status code</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpCode")
    public String httpCode;

    /**
     * <p>The HTTP status code returned.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The error message returned.</p>
     * 
     * <strong>example:</strong>
     * <p>The specified parameter ReportId is invalid, Can not find diagnostic report dr-5f6135782f104b0f****.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The suggestion for the diagnosis.</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;RosActionMessages\&quot;: {\&quot;Reason\&quot;: \&quot;Fail to delete stack (fc966920-450a-456b-983c-deeaec8e****), as deletion protection is enabled.\&quot;, \&quot;Recommend\&quot;: \&quot;\&quot;}}</p>
     */
    @NameInMap("Recommends")
    public java.util.Map<String, ?> recommends;

    /**
     * <p>The ID of the diagnostic report.</p>
     * 
     * <strong>example:</strong>
     * <p>dr-cc80afc48c8741e9****</p>
     */
    @NameInMap("ReportId")
    public String reportId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>96A24844-9603-5E79-BDF4-EFD412FC5D4C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The diagnosis status. Valid values:</p>
     * <ul>
     * <li>Running: The diagnosis is in progress.</li>
     * <li>Complete: The diagnosis is complete.</li>
     * <li>Failed: The diagnosis failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Running</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The reason for the diagnosis status.</p>
     * 
     * <strong>example:</strong>
     * <p>Complete</p>
     */
    @NameInMap("StatusReason")
    public String statusReason;

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
    public String success;

    public static GetDiagnosticResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDiagnosticResponseBody self = new GetDiagnosticResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDiagnosticResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetDiagnosticResponseBody setDiagnosticKey(String diagnosticKey) {
        this.diagnosticKey = diagnosticKey;
        return this;
    }
    public String getDiagnosticKey() {
        return this.diagnosticKey;
    }

    public GetDiagnosticResponseBody setDiagnosticProduct(String diagnosticProduct) {
        this.diagnosticProduct = diagnosticProduct;
        return this;
    }
    public String getDiagnosticProduct() {
        return this.diagnosticProduct;
    }

    public GetDiagnosticResponseBody setDiagnosticResult(GetDiagnosticResponseBodyDiagnosticResult diagnosticResult) {
        this.diagnosticResult = diagnosticResult;
        return this;
    }
    public GetDiagnosticResponseBodyDiagnosticResult getDiagnosticResult() {
        return this.diagnosticResult;
    }

    public GetDiagnosticResponseBody setDiagnosticTime(String diagnosticTime) {
        this.diagnosticTime = diagnosticTime;
        return this;
    }
    public String getDiagnosticTime() {
        return this.diagnosticTime;
    }

    public GetDiagnosticResponseBody setHttpCode(String httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public String getHttpCode() {
        return this.httpCode;
    }

    public GetDiagnosticResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetDiagnosticResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetDiagnosticResponseBody setRecommends(java.util.Map<String, ?> recommends) {
        this.recommends = recommends;
        return this;
    }
    public java.util.Map<String, ?> getRecommends() {
        return this.recommends;
    }

    public GetDiagnosticResponseBody setReportId(String reportId) {
        this.reportId = reportId;
        return this;
    }
    public String getReportId() {
        return this.reportId;
    }

    public GetDiagnosticResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDiagnosticResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetDiagnosticResponseBody setStatusReason(String statusReason) {
        this.statusReason = statusReason;
        return this;
    }
    public String getStatusReason() {
        return this.statusReason;
    }

    public GetDiagnosticResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class GetDiagnosticResponseBodyDiagnosticResult extends TeaModel {
        /**
         * <p>The resources that failed to be diagnosed.</p>
         */
        @NameInMap("FailedResources")
        public java.util.Map<String, ?> failedResources;

        /**
         * <p>The information about Resource Orchestration Service (ROS) calling.</p>
         */
        @NameInMap("RosActionMessages")
        public java.util.Map<String, ?> rosActionMessages;

        /**
         * <p>The stack information.</p>
         */
        @NameInMap("StackMessages")
        public java.util.Map<String, ?> stackMessages;

        public static GetDiagnosticResponseBodyDiagnosticResult build(java.util.Map<String, ?> map) throws Exception {
            GetDiagnosticResponseBodyDiagnosticResult self = new GetDiagnosticResponseBodyDiagnosticResult();
            return TeaModel.build(map, self);
        }

        public GetDiagnosticResponseBodyDiagnosticResult setFailedResources(java.util.Map<String, ?> failedResources) {
            this.failedResources = failedResources;
            return this;
        }
        public java.util.Map<String, ?> getFailedResources() {
            return this.failedResources;
        }

        public GetDiagnosticResponseBodyDiagnosticResult setRosActionMessages(java.util.Map<String, ?> rosActionMessages) {
            this.rosActionMessages = rosActionMessages;
            return this;
        }
        public java.util.Map<String, ?> getRosActionMessages() {
            return this.rosActionMessages;
        }

        public GetDiagnosticResponseBodyDiagnosticResult setStackMessages(java.util.Map<String, ?> stackMessages) {
            this.stackMessages = stackMessages;
            return this;
        }
        public java.util.Map<String, ?> getStackMessages() {
            return this.stackMessages;
        }

    }

}
