// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class PreCheckCreateOrderForCreateDBNodesResponseBody extends TeaModel {
    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Failures")
    public PreCheckCreateOrderForCreateDBNodesResponseBodyFailures failures;

    /**
     * <p>Indicates the result of the precheck task.</p>
     */
    @NameInMap("PreCheckResult")
    public Boolean preCheckResult;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static PreCheckCreateOrderForCreateDBNodesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PreCheckCreateOrderForCreateDBNodesResponseBody self = new PreCheckCreateOrderForCreateDBNodesResponseBody();
        return TeaModel.build(map, self);
    }

    public PreCheckCreateOrderForCreateDBNodesResponseBody setFailures(PreCheckCreateOrderForCreateDBNodesResponseBodyFailures failures) {
        this.failures = failures;
        return this;
    }
    public PreCheckCreateOrderForCreateDBNodesResponseBodyFailures getFailures() {
        return this.failures;
    }

    public PreCheckCreateOrderForCreateDBNodesResponseBody setPreCheckResult(Boolean preCheckResult) {
        this.preCheckResult = preCheckResult;
        return this;
    }
    public Boolean getPreCheckResult() {
        return this.preCheckResult;
    }

    public PreCheckCreateOrderForCreateDBNodesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class PreCheckCreateOrderForCreateDBNodesResponseBodyFailuresFailures extends TeaModel {
        /**
         * <p>The response code returned. Valid values:</p>
         * <br>
         * <p>*   **200**: success</p>
         * <p>*   **400**: client error</p>
         * <p>*   **401**: identity authentication failed</p>
         * <p>*   **404**: request page not found</p>
         * <p>*   **500**: server error</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The returned message.</p>
         */
        @NameInMap("Message")
        public String message;

        public static PreCheckCreateOrderForCreateDBNodesResponseBodyFailuresFailures build(java.util.Map<String, ?> map) throws Exception {
            PreCheckCreateOrderForCreateDBNodesResponseBodyFailuresFailures self = new PreCheckCreateOrderForCreateDBNodesResponseBodyFailuresFailures();
            return TeaModel.build(map, self);
        }

        public PreCheckCreateOrderForCreateDBNodesResponseBodyFailuresFailures setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public PreCheckCreateOrderForCreateDBNodesResponseBodyFailuresFailures setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

    public static class PreCheckCreateOrderForCreateDBNodesResponseBodyFailures extends TeaModel {
        @NameInMap("Failures")
        public java.util.List<PreCheckCreateOrderForCreateDBNodesResponseBodyFailuresFailures> failures;

        public static PreCheckCreateOrderForCreateDBNodesResponseBodyFailures build(java.util.Map<String, ?> map) throws Exception {
            PreCheckCreateOrderForCreateDBNodesResponseBodyFailures self = new PreCheckCreateOrderForCreateDBNodesResponseBodyFailures();
            return TeaModel.build(map, self);
        }

        public PreCheckCreateOrderForCreateDBNodesResponseBodyFailures setFailures(java.util.List<PreCheckCreateOrderForCreateDBNodesResponseBodyFailuresFailures> failures) {
            this.failures = failures;
            return this;
        }
        public java.util.List<PreCheckCreateOrderForCreateDBNodesResponseBodyFailuresFailures> getFailures() {
            return this.failures;
        }

    }

}
