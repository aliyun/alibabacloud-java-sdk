// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class GetAutopilotPolicyResponseBody extends TeaModel {
    /**
     * <p>The Autopilot tuning policy response data.</p>
     */
    @NameInMap("data")
    public GetAutopilotPolicyResponseBodyData data;

    /**
     * <p>The error code. This field is not empty when success is false. This field is empty when success is true.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("errorCode")
    public String errorCode;

    /**
     * <p>The error message. This field is not empty when success is false. This field is empty when success is true.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("errorMessage")
    public String errorMessage;

    /**
     * <p>The business status code, which is always 200. Use the success field to determine whether the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpCode")
    public Integer httpCode;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>CBC799F0-AS7S-1D30-8A4F-882ED4DD****</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static GetAutopilotPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAutopilotPolicyResponseBody self = new GetAutopilotPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAutopilotPolicyResponseBody setData(GetAutopilotPolicyResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetAutopilotPolicyResponseBodyData getData() {
        return this.data;
    }

    public GetAutopilotPolicyResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetAutopilotPolicyResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetAutopilotPolicyResponseBody setHttpCode(Integer httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public Integer getHttpCode() {
        return this.httpCode;
    }

    public GetAutopilotPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAutopilotPolicyResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetAutopilotPolicyResponseBodyData extends TeaModel {
        /**
         * <p>Indicates whether automatic tuning is enabled. A value of true indicates that automatic tuning is active (ACTIVE). A value of false indicates that tuning is not enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("enabled")
        public Boolean enabled;

        /**
         * <p>The tuning policy configuration.</p>
         */
        @NameInMap("policyConfig")
        public AutopilotPolicy policyConfig;

        public static GetAutopilotPolicyResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetAutopilotPolicyResponseBodyData self = new GetAutopilotPolicyResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetAutopilotPolicyResponseBodyData setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public GetAutopilotPolicyResponseBodyData setPolicyConfig(AutopilotPolicy policyConfig) {
            this.policyConfig = policyConfig;
            return this;
        }
        public AutopilotPolicy getPolicyConfig() {
            return this.policyConfig;
        }

    }

}
