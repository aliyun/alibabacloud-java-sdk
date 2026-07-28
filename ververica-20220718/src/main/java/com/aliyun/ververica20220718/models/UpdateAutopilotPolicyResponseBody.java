// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class UpdateAutopilotPolicyResponseBody extends TeaModel {
    /**
     * <p>The Autopilot tuning policy response data.</p>
     */
    @NameInMap("data")
    public UpdateAutopilotPolicyResponseBodyData data;

    /**
     * <p>The error code. This parameter is not empty when success is false, indicating a business error code. This parameter is empty when success is true.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("errorCode")
    public String errorCode;

    /**
     * <p>The error message. This parameter is not empty when success is false, indicating a business error message. This parameter is empty when success is true.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("errorMessage")
    public String errorMessage;

    /**
     * <p>The HTTP status code, which is always 200. Use the success parameter to determine whether the request was successful.</p>
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
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static UpdateAutopilotPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateAutopilotPolicyResponseBody self = new UpdateAutopilotPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateAutopilotPolicyResponseBody setData(UpdateAutopilotPolicyResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UpdateAutopilotPolicyResponseBodyData getData() {
        return this.data;
    }

    public UpdateAutopilotPolicyResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public UpdateAutopilotPolicyResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public UpdateAutopilotPolicyResponseBody setHttpCode(Integer httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public Integer getHttpCode() {
        return this.httpCode;
    }

    public UpdateAutopilotPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateAutopilotPolicyResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class UpdateAutopilotPolicyResponseBodyData extends TeaModel {
        /**
         * <p>Indicates whether automatic tuning is enabled. A value of true indicates that automatic tuning is active (ACTIVE), and a value of false indicates that tuning is not enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enabled")
        public Boolean enabled;

        /**
         * <p>The tuning policy configuration. This parameter uses full PUT mode: when specified, the complete policy object replaces the existing configuration entirely (fields not included are cleared). If this parameter is not specified, the existing configuration is retained.</p>
         */
        @NameInMap("policyConfig")
        public AutopilotPolicy policyConfig;

        public static UpdateAutopilotPolicyResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UpdateAutopilotPolicyResponseBodyData self = new UpdateAutopilotPolicyResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UpdateAutopilotPolicyResponseBodyData setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public UpdateAutopilotPolicyResponseBodyData setPolicyConfig(AutopilotPolicy policyConfig) {
            this.policyConfig = policyConfig;
            return this;
        }
        public AutopilotPolicy getPolicyConfig() {
            return this.policyConfig;
        }

    }

}
