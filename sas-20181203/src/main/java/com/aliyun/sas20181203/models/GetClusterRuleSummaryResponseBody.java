// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetClusterRuleSummaryResponseBody extends TeaModel {
    /**
     * <p>The overall information about the cluster defense rules.</p>
     */
    @NameInMap("ClusterRuleSummary")
    public GetClusterRuleSummaryResponseBodyClusterRuleSummary clusterRuleSummary;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetClusterRuleSummaryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetClusterRuleSummaryResponseBody self = new GetClusterRuleSummaryResponseBody();
        return TeaModel.build(map, self);
    }

    public GetClusterRuleSummaryResponseBody setClusterRuleSummary(GetClusterRuleSummaryResponseBodyClusterRuleSummary clusterRuleSummary) {
        this.clusterRuleSummary = clusterRuleSummary;
        return this;
    }
    public GetClusterRuleSummaryResponseBodyClusterRuleSummary getClusterRuleSummary() {
        return this.clusterRuleSummary;
    }

    public GetClusterRuleSummaryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetClusterRuleSummaryResponseBodyClusterRuleSummary extends TeaModel {
        /**
         * <p>The number of disabled cluster defense rules.</p>
         */
        @NameInMap("CloseRuleCount")
        public Integer closeRuleCount;

        /**
         * <p>The number of alerts that are triggered by the cluster defense rules in the last seven days.</p>
         */
        @NameInMap("InterceptionCount7Day")
        public Long interceptionCount7Day;

        /**
         * <p>The status of the container firewall feature. Valid values:</p>
         * <br>
         * <p>*   **0**: disabled</p>
         * <p>*   **1**: enabled</p>
         */
        @NameInMap("InterceptionSwitch")
        public Integer interceptionSwitch;

        /**
         * <p>The interception mode.</p>
         */
        @NameInMap("InterceptionType")
        public Integer interceptionType;

        /**
         * <p>The number of enabled cluster defense rules.</p>
         */
        @NameInMap("OpenRuleCount")
        public Integer openRuleCount;

        /**
         * <p>The total number of configured cluster defense rules.</p>
         */
        @NameInMap("RuleCount")
        public Integer ruleCount;

        /**
         * <p>The number of recommended cluster defense rules.</p>
         */
        @NameInMap("SuggestRuleCount")
        public Integer suggestRuleCount;

        public static GetClusterRuleSummaryResponseBodyClusterRuleSummary build(java.util.Map<String, ?> map) throws Exception {
            GetClusterRuleSummaryResponseBodyClusterRuleSummary self = new GetClusterRuleSummaryResponseBodyClusterRuleSummary();
            return TeaModel.build(map, self);
        }

        public GetClusterRuleSummaryResponseBodyClusterRuleSummary setCloseRuleCount(Integer closeRuleCount) {
            this.closeRuleCount = closeRuleCount;
            return this;
        }
        public Integer getCloseRuleCount() {
            return this.closeRuleCount;
        }

        public GetClusterRuleSummaryResponseBodyClusterRuleSummary setInterceptionCount7Day(Long interceptionCount7Day) {
            this.interceptionCount7Day = interceptionCount7Day;
            return this;
        }
        public Long getInterceptionCount7Day() {
            return this.interceptionCount7Day;
        }

        public GetClusterRuleSummaryResponseBodyClusterRuleSummary setInterceptionSwitch(Integer interceptionSwitch) {
            this.interceptionSwitch = interceptionSwitch;
            return this;
        }
        public Integer getInterceptionSwitch() {
            return this.interceptionSwitch;
        }

        public GetClusterRuleSummaryResponseBodyClusterRuleSummary setInterceptionType(Integer interceptionType) {
            this.interceptionType = interceptionType;
            return this;
        }
        public Integer getInterceptionType() {
            return this.interceptionType;
        }

        public GetClusterRuleSummaryResponseBodyClusterRuleSummary setOpenRuleCount(Integer openRuleCount) {
            this.openRuleCount = openRuleCount;
            return this;
        }
        public Integer getOpenRuleCount() {
            return this.openRuleCount;
        }

        public GetClusterRuleSummaryResponseBodyClusterRuleSummary setRuleCount(Integer ruleCount) {
            this.ruleCount = ruleCount;
            return this;
        }
        public Integer getRuleCount() {
            return this.ruleCount;
        }

        public GetClusterRuleSummaryResponseBodyClusterRuleSummary setSuggestRuleCount(Integer suggestRuleCount) {
            this.suggestRuleCount = suggestRuleCount;
            return this;
        }
        public Integer getSuggestRuleCount() {
            return this.suggestRuleCount;
        }

    }

}
