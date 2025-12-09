// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeBotRuleLabelsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>AAAAAGBgV9tolsLfijC4wam2htS*****D/46H3X2wIS</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>D7861F61-5B61-46CE-A47C-6B19****5EB0</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("RuleLabels")
    public java.util.List<DescribeBotRuleLabelsResponseBodyRuleLabels> ruleLabels;

    /**
     * <strong>example:</strong>
     * <p>8</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeBotRuleLabelsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeBotRuleLabelsResponseBody self = new DescribeBotRuleLabelsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeBotRuleLabelsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeBotRuleLabelsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeBotRuleLabelsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeBotRuleLabelsResponseBody setRuleLabels(java.util.List<DescribeBotRuleLabelsResponseBodyRuleLabels> ruleLabels) {
        this.ruleLabels = ruleLabels;
        return this;
    }
    public java.util.List<DescribeBotRuleLabelsResponseBodyRuleLabels> getRuleLabels() {
        return this.ruleLabels;
    }

    public DescribeBotRuleLabelsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeBotRuleLabelsResponseBodyRuleLabels extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>malicious</p>
         */
        @NameInMap("BotBehavior")
        public String botBehavior;

        /**
         * <strong>example:</strong>
         * <p>malicious_crawler_python</p>
         */
        @NameInMap("LabelKey")
        public String labelKey;

        /**
         * <strong>example:</strong>
         * <p>human_machine_challenge</p>
         */
        @NameInMap("LabelType")
        public String labelType;

        /**
         * <strong>example:</strong>
         * <p>Web,app</p>
         */
        @NameInMap("SubScene")
        public String subScene;

        public static DescribeBotRuleLabelsResponseBodyRuleLabels build(java.util.Map<String, ?> map) throws Exception {
            DescribeBotRuleLabelsResponseBodyRuleLabels self = new DescribeBotRuleLabelsResponseBodyRuleLabels();
            return TeaModel.build(map, self);
        }

        public DescribeBotRuleLabelsResponseBodyRuleLabels setBotBehavior(String botBehavior) {
            this.botBehavior = botBehavior;
            return this;
        }
        public String getBotBehavior() {
            return this.botBehavior;
        }

        public DescribeBotRuleLabelsResponseBodyRuleLabels setLabelKey(String labelKey) {
            this.labelKey = labelKey;
            return this;
        }
        public String getLabelKey() {
            return this.labelKey;
        }

        public DescribeBotRuleLabelsResponseBodyRuleLabels setLabelType(String labelType) {
            this.labelType = labelType;
            return this;
        }
        public String getLabelType() {
            return this.labelType;
        }

        public DescribeBotRuleLabelsResponseBodyRuleLabels setSubScene(String subScene) {
            this.subScene = subScene;
            return this;
        }
        public String getSubScene() {
            return this.subScene;
        }

    }

}
