// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tag20180828.models;

import com.aliyun.tea.*;

public class ListConfigRulesForTargetResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<ListConfigRulesForTargetResponseBodyData> data;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    public static ListConfigRulesForTargetResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListConfigRulesForTargetResponseBody self = new ListConfigRulesForTargetResponseBody();
        return TeaModel.build(map, self);
    }

    public ListConfigRulesForTargetResponseBody setData(java.util.List<ListConfigRulesForTargetResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListConfigRulesForTargetResponseBodyData> getData() {
        return this.data;
    }

    public ListConfigRulesForTargetResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListConfigRulesForTargetResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListConfigRulesForTargetResponseBodyData extends TeaModel {
        @NameInMap("AggregatorId")
        public String aggregatorId;

        @NameInMap("ConfigRuleId")
        public String configRuleId;

        @NameInMap("PolicyType")
        public String policyType;

        @NameInMap("Remediation")
        public Boolean remediation;

        @NameInMap("TagKey")
        public String tagKey;

        @NameInMap("TargetId")
        public String targetId;

        @NameInMap("TargetType")
        public String targetType;

        public static ListConfigRulesForTargetResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListConfigRulesForTargetResponseBodyData self = new ListConfigRulesForTargetResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListConfigRulesForTargetResponseBodyData setAggregatorId(String aggregatorId) {
            this.aggregatorId = aggregatorId;
            return this;
        }
        public String getAggregatorId() {
            return this.aggregatorId;
        }

        public ListConfigRulesForTargetResponseBodyData setConfigRuleId(String configRuleId) {
            this.configRuleId = configRuleId;
            return this;
        }
        public String getConfigRuleId() {
            return this.configRuleId;
        }

        public ListConfigRulesForTargetResponseBodyData setPolicyType(String policyType) {
            this.policyType = policyType;
            return this;
        }
        public String getPolicyType() {
            return this.policyType;
        }

        public ListConfigRulesForTargetResponseBodyData setRemediation(Boolean remediation) {
            this.remediation = remediation;
            return this;
        }
        public Boolean getRemediation() {
            return this.remediation;
        }

        public ListConfigRulesForTargetResponseBodyData setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public ListConfigRulesForTargetResponseBodyData setTargetId(String targetId) {
            this.targetId = targetId;
            return this;
        }
        public String getTargetId() {
            return this.targetId;
        }

        public ListConfigRulesForTargetResponseBodyData setTargetType(String targetType) {
            this.targetType = targetType;
            return this;
        }
        public String getTargetType() {
            return this.targetType;
        }

    }

}
