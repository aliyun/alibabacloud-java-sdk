// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class PreCheckCreateOrderForDeleteDBNodesResponseBody extends TeaModel {
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
        @NameInMap("Code")
        public String code;

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
