// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeBotRuleLabelsResponseBody extends TeaModel {
    /**
     * <p>The number of entries per page for paging. Valid values: 1 to 200. Default value: 20.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token for the next page. If a next page exists, this field has a return value.</p>
     * <blockquote>
     * <p>If this parameter has a return value, a next page exists. You can use the returned <strong>NextToken</strong> as a request parameter to obtain the data on the next page. Repeat this process until no value is returned, which indicates that all data has been retrieved.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>AAAAAGBgV9tolsLfijC4wam2htS*****D/46H3X2wIS</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>D7861F61-5B61-46CE-A47C-6B19****5EB0</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The list of bot management rule tags.</p>
     */
    @NameInMap("RuleLabels")
    public java.util.List<DescribeBotRuleLabelsResponseBodyRuleLabels> ruleLabels;

    /**
     * <p>The total number of entries returned.</p>
     * 
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
         * <p>The crawler behavior corresponding to the rule tag.</p>
         * <ul>
         * <li><strong>malicious</strong>: malicious crawler.</li>
         * <li><strong>suspicious</strong>: suspected crawler.</li>
         * <li><strong>normal</strong>: normal crawler.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>malicious</p>
         */
        @NameInMap("BotBehavior")
        public String botBehavior;

        /**
         * <p>The default action. Valid values:</p>
         * <ul>
         * <li><strong>block</strong>: Block.</li>
         * <li><strong>monitor</strong>: Monitor.</li>
         * <li><strong>js</strong>: JavaScript verification.</li>
         * <li><strong>captcha</strong>: Slider CAPTCHA.</li>
         * <li><strong>captcha_strict</strong>: Strict slider CAPTCHA.</li>
         * <li><strong>bypass</strong>: Allow.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>block</p>
         */
        @NameInMap("DefaultAction")
        public String defaultAction;

        /**
         * <p>The default configurations corresponding to the label.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;crawlerStatusMap&quot;:{&quot;360&quot;:1,&quot;bytedance&quot;:1}}</p>
         */
        @NameInMap("DefaultConfig")
        public String defaultConfig;

        /**
         * <p>The default status of the tag rule.</p>
         * <ul>
         * <li><strong>1</strong>: The rule is enabled.</li>
         * <li><strong>0</strong>: The rule is disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("DefaultStatus")
        public Integer defaultStatus;

        /**
         * <p>The bot management rule tag.</p>
         * 
         * <strong>example:</strong>
         * <p>malicious_crawler_python</p>
         */
        @NameInMap("LabelKey")
        public String labelKey;

        /**
         * <p>The tag status.</p>
         * <ul>
         * <li><strong>online</strong>: Online.</li>
         * <li><strong>wait_offline</strong>: Pending offline.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>online</p>
         */
        @NameInMap("LabelStatus")
        public String labelStatus;

        /**
         * <p>The type of the bot rule tag.</p>
         * 
         * <strong>example:</strong>
         * <p>human_machine_challenge</p>
         */
        @NameInMap("LabelType")
        public String labelType;

        /**
         * <p>The set of bot management protection scenarios to which the rule belongs. Multiple scenarios are separated by commas (,). Valid values:</p>
         * <ul>
         * <li><strong>web</strong>: Web protection scenario.</li>
         * <li><strong>app</strong>: App protection scenario.</li>
         * </ul>
         * 
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

        public DescribeBotRuleLabelsResponseBodyRuleLabels setDefaultAction(String defaultAction) {
            this.defaultAction = defaultAction;
            return this;
        }
        public String getDefaultAction() {
            return this.defaultAction;
        }

        public DescribeBotRuleLabelsResponseBodyRuleLabels setDefaultConfig(String defaultConfig) {
            this.defaultConfig = defaultConfig;
            return this;
        }
        public String getDefaultConfig() {
            return this.defaultConfig;
        }

        public DescribeBotRuleLabelsResponseBodyRuleLabels setDefaultStatus(Integer defaultStatus) {
            this.defaultStatus = defaultStatus;
            return this;
        }
        public Integer getDefaultStatus() {
            return this.defaultStatus;
        }

        public DescribeBotRuleLabelsResponseBodyRuleLabels setLabelKey(String labelKey) {
            this.labelKey = labelKey;
            return this;
        }
        public String getLabelKey() {
            return this.labelKey;
        }

        public DescribeBotRuleLabelsResponseBodyRuleLabels setLabelStatus(String labelStatus) {
            this.labelStatus = labelStatus;
            return this;
        }
        public String getLabelStatus() {
            return this.labelStatus;
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
