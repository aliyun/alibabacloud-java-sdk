// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DeepCopyRuleResponseBody extends TeaModel {
    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A32FE941-35F2-5378-B37C-4B8FDB16F094</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Returned result information</p>
     */
    @NameInMap("ResultObject")
    public DeepCopyRuleResponseBodyResultObject resultObject;

    public static DeepCopyRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeepCopyRuleResponseBody self = new DeepCopyRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public DeepCopyRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeepCopyRuleResponseBody setResultObject(DeepCopyRuleResponseBodyResultObject resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public DeepCopyRuleResponseBodyResultObject getResultObject() {
        return this.resultObject;
    }

    public static class DeepCopyRuleResponseBodyResultObject extends TeaModel {
        /**
         * <p>Whether to redirect to details</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("BatchCopyFlag")
        public Boolean batchCopyFlag;

        /**
         * <p>Primary key of the policy</p>
         * 
         * <strong>example:</strong>
         * <p>2346</p>
         */
        @NameInMap("ConsoleRuleId")
        public Long consoleRuleId;

        /**
         * <p>Policy ID</p>
         * 
         * <strong>example:</strong>
         * <p>104556</p>
         */
        @NameInMap("RuleId")
        public String ruleId;

        /**
         * <p>Primary key of the policy version</p>
         * 
         * <strong>example:</strong>
         * <p>1135</p>
         */
        @NameInMap("RuleVersionId")
        public Long ruleVersionId;

        public static DeepCopyRuleResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            DeepCopyRuleResponseBodyResultObject self = new DeepCopyRuleResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public DeepCopyRuleResponseBodyResultObject setBatchCopyFlag(Boolean batchCopyFlag) {
            this.batchCopyFlag = batchCopyFlag;
            return this;
        }
        public Boolean getBatchCopyFlag() {
            return this.batchCopyFlag;
        }

        public DeepCopyRuleResponseBodyResultObject setConsoleRuleId(Long consoleRuleId) {
            this.consoleRuleId = consoleRuleId;
            return this;
        }
        public Long getConsoleRuleId() {
            return this.consoleRuleId;
        }

        public DeepCopyRuleResponseBodyResultObject setRuleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public String getRuleId() {
            return this.ruleId;
        }

        public DeepCopyRuleResponseBodyResultObject setRuleVersionId(Long ruleVersionId) {
            this.ruleVersionId = ruleVersionId;
            return this;
        }
        public Long getRuleVersionId() {
            return this.ruleVersionId;
        }

    }

}
