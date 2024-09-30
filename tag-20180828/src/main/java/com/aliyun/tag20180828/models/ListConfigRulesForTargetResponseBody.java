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
     * <ul>
     * <li>If the value of this parameter is empty (<code>&quot;NextToken&quot;: &quot;&quot;</code>), all results are returned, and the next query is not required.</li>
     * <li>If the value of this parameter is not empty, the next query is required, and the value is the token used to start the next query.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>caeba0bbb2be03f84eb48b699f0a****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>7126AECD-D7AD-5073-8E88-DD2BD1FC139E</p>
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
         * <p>You can use the ID to query the content of the related resource non-compliance report in Cloud Config.</p>
         * <blockquote>
         * <p> This parameter is returned only if you use the Tag Policy feature in multi-account mode.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>ca-efdc33dc9b37002d****</p>
         */
        @NameInMap("AggregatorId")
        public String aggregatorId;

        /**
         * <p>The ID of the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>cr-0lb4866180880069****</p>
         */
        @NameInMap("ConfigRuleId")
        public String configRuleId;

        /**
         * <p>The use scenario of the tag policy. Valid values:</p>
         * <ul>
         * <li>tags: enables tags with specified tag values to be added to resources.</li>
         * <li>rg_inherit: enables resources in a resource group to automatically inherit tags from the resource group.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>tags</p>
         */
        @NameInMap("PolicyType")
        public String policyType;

        /**
         * <p>Indicates whether automatic remediation is enabled. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Remediation")
        public Boolean remediation;

        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>CostCenter</p>
         */
        @NameInMap("TagKey")
        public String tagKey;

        /**
         * <p>The tag value for automatic remediation.</p>
         * 
         * <strong>example:</strong>
         * <p>Project</p>
         */
        @NameInMap("TagValue")
        public String tagValue;

        /**
         * <p>The ID of the object.</p>
         * 
         * <strong>example:</strong>
         * <p>134254031178****</p>
         */
        @NameInMap("TargetId")
        public String targetId;

        /**
         * <p>The type of the object. Valid values:</p>
         * <ul>
         * <li>USER: the current logon account. This value is available if you use the Tag Policy feature in single-account mode.</li>
         * <li>ROOT: the Root folder in the resource directory. This value is available if you use the Tag Policy feature in multi-account mode.</li>
         * <li>FOLDER: a folder other than the Root folder in the resource directory. This value is available if you use the Tag Policy feature in multi-account mode.</li>
         * <li>ACCOUNT: a member in the resource directory. This value is available if you use the Tag Policy feature in multi-account mode.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>USER</p>
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

        public ListConfigRulesForTargetResponseBodyData setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
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
