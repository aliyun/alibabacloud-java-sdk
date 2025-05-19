// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paifeaturestore20230621.models;

import com.aliyun.tea.*;

public class CheckModelFeatureFGFeatureResponseBody extends TeaModel {
    @NameInMap("FGCheckResults")
    public java.util.List<CheckModelFeatureFGFeatureResponseBodyFGCheckResults> FGCheckResults;

    /**
     * <strong>example:</strong>
     * <p>ED4DEA2F-F216-57F0-AE28-08D791233280</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static CheckModelFeatureFGFeatureResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckModelFeatureFGFeatureResponseBody self = new CheckModelFeatureFGFeatureResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckModelFeatureFGFeatureResponseBody setFGCheckResults(java.util.List<CheckModelFeatureFGFeatureResponseBodyFGCheckResults> FGCheckResults) {
        this.FGCheckResults = FGCheckResults;
        return this;
    }
    public java.util.List<CheckModelFeatureFGFeatureResponseBodyFGCheckResults> getFGCheckResults() {
        return this.FGCheckResults;
    }

    public CheckModelFeatureFGFeatureResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CheckModelFeatureFGFeatureResponseBodyFGCheckResults extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>f1[1]: these lookup_features\&quot;s LookupValueFeature(key) not exist in model features</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <strong>example:</strong>
         * <p>SeqSubEx</p>
         */
        @NameInMap("RuleCode")
        public String ruleCode;

        /**
         * <strong>example:</strong>
         * <p>True</p>
         */
        @NameInMap("Status")
        public Boolean status;

        public static CheckModelFeatureFGFeatureResponseBodyFGCheckResults build(java.util.Map<String, ?> map) throws Exception {
            CheckModelFeatureFGFeatureResponseBodyFGCheckResults self = new CheckModelFeatureFGFeatureResponseBodyFGCheckResults();
            return TeaModel.build(map, self);
        }

        public CheckModelFeatureFGFeatureResponseBodyFGCheckResults setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public CheckModelFeatureFGFeatureResponseBodyFGCheckResults setRuleCode(String ruleCode) {
            this.ruleCode = ruleCode;
            return this;
        }
        public String getRuleCode() {
            return this.ruleCode;
        }

        public CheckModelFeatureFGFeatureResponseBodyFGCheckResults setStatus(Boolean status) {
            this.status = status;
            return this;
        }
        public Boolean getStatus() {
            return this.status;
        }

    }

}
