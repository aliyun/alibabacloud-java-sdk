// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class PreCheckCreateOrderForDeleteDBNodesResponseBody extends TeaModel {
    /**
     * <p>The information about the failed order.</p>
     */
    @NameInMap("Failures")
    public PreCheckCreateOrderForDeleteDBNodesResponseBodyFailures failures;

    /**
     * <p>The precheck result.</p>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("PreCheckResult")
    public Boolean preCheckResult;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>9B415BC6-FE84-5323-A255-42CF330DB99C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static PreCheckCreateOrderForDeleteDBNodesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PreCheckCreateOrderForDeleteDBNodesResponseBody self = new PreCheckCreateOrderForDeleteDBNodesResponseBody();
        return TeaModel.build(map, self);
    }

    public PreCheckCreateOrderForDeleteDBNodesResponseBody setFailures(PreCheckCreateOrderForDeleteDBNodesResponseBodyFailures failures) {
        this.failures = failures;
        return this;
    }
    public PreCheckCreateOrderForDeleteDBNodesResponseBodyFailures getFailures() {
        return this.failures;
    }

    public PreCheckCreateOrderForDeleteDBNodesResponseBody setPreCheckResult(Boolean preCheckResult) {
        this.preCheckResult = preCheckResult;
        return this;
    }
    public Boolean getPreCheckResult() {
        return this.preCheckResult;
    }

    public PreCheckCreateOrderForDeleteDBNodesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class PreCheckCreateOrderForDeleteDBNodesResponseBodyFailuresFailures extends TeaModel {
        /**
         * <p>The response code. Valid values:</p>
         * <ul>
         * <li><strong>200</strong>: success</li>
         * <li><strong>400</strong>: client error</li>
         * <li><strong>401</strong>: identity authentication failed</li>
         * <li><strong>404</strong>: requested page not found</li>
         * <li><strong>500</strong>: server error</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The returned message.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        @NameInMap("Message")
        public String message;

        public static PreCheckCreateOrderForDeleteDBNodesResponseBodyFailuresFailures build(java.util.Map<String, ?> map) throws Exception {
            PreCheckCreateOrderForDeleteDBNodesResponseBodyFailuresFailures self = new PreCheckCreateOrderForDeleteDBNodesResponseBodyFailuresFailures();
            return TeaModel.build(map, self);
        }

        public PreCheckCreateOrderForDeleteDBNodesResponseBodyFailuresFailures setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public PreCheckCreateOrderForDeleteDBNodesResponseBodyFailuresFailures setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

    public static class PreCheckCreateOrderForDeleteDBNodesResponseBodyFailures extends TeaModel {
        @NameInMap("Failures")
        public java.util.List<PreCheckCreateOrderForDeleteDBNodesResponseBodyFailuresFailures> failures;

        public static PreCheckCreateOrderForDeleteDBNodesResponseBodyFailures build(java.util.Map<String, ?> map) throws Exception {
            PreCheckCreateOrderForDeleteDBNodesResponseBodyFailures self = new PreCheckCreateOrderForDeleteDBNodesResponseBodyFailures();
            return TeaModel.build(map, self);
        }

        public PreCheckCreateOrderForDeleteDBNodesResponseBodyFailures setFailures(java.util.List<PreCheckCreateOrderForDeleteDBNodesResponseBodyFailuresFailures> failures) {
            this.failures = failures;
            return this;
        }
        public java.util.List<PreCheckCreateOrderForDeleteDBNodesResponseBodyFailuresFailures> getFailures() {
            return this.failures;
        }

    }

}
