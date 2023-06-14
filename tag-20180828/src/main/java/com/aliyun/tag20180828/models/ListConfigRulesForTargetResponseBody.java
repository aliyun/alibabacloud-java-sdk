// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tag20180828.models;

import com.aliyun.tea.*;

public class ListConfigRulesForTargetResponseBody extends TeaModel {
    /**
     * <p>The tag detection tasks.</p>
     */
    @NameInMap("Data")
    public java.util.List<ListConfigRulesForTargetResponseBodyData> data;

    /**
     * <p>Indicates whether the next query is required.</p>
     * <br>
     * <p>*   If the value of this parameter is empty (`"NextToken": ""`), all results are returned, and the next query is not required.</p>
     * <p>*   If the value of this parameter is not empty, the next query is required, and the value is the token used to start the next query.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the request.</p>
     */
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
        /**
         * <p>The ID of the account group.</p>
         * <br>
         * <p>You can use the ID to query the content of the related resource non-compliance report in Cloud Config.</p>
         * <br>
         * <p>>  This parameter is returned only if you use the Tag Policy feature in multi-account mode.</p>
         */
        @NameInMap("AggregatorId")
        public String aggregatorId;

        /**
         * <p>The ID of the rule.</p>
         */
        @NameInMap("ConfigRuleId")
        public String configRuleId;

        /**
         * <p>The use scenario of the tag policy. Valid values:</p>
         * <br>
         * <p>*   tags: enables tags with specified tag values to be added to resources.</p>
         * <p>*   rg_inherit: enables resources in a resource group to automatically inherit tags from the resource group.</p>
         */
        @NameInMap("PolicyType")
        public String policyType;

        /**
         * <p>Indicates whether automatic remediation is enabled. Valid values:</p>
         * <br>
         * <p>*   true: enabled</p>
         * <p>*   false: disabled</p>
         */
        @NameInMap("Remediation")
        public Boolean remediation;

        /**
         * <p>The tag key.</p>
         */
        @NameInMap("TagKey")
        public String tagKey;

        /**
         * <p>The ID of the object.</p>
         */
        @NameInMap("TargetId")
        public String targetId;

        /**
         * <p>The type of the object. Valid values:</p>
         * <br>
         * <p>*   USER: the current logon account. This value is available if you use the Tag Policy feature in single-account mode.</p>
         * <p>*   ROOT: the Root folder in the resource directory. This value is available if you use the Tag Policy feature in multi-account mode.</p>
         * <p>*   FOLDER: a folder other than the Root folder in the resource directory. This value is available if you use the Tag Policy feature in multi-account mode.</p>
         * <p>*   ACCOUNT: a member in the resource directory. This value is available if you use the Tag Policy feature in multi-account mode.</p>
         */
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
