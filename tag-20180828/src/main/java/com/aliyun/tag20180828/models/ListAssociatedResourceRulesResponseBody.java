// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tag20180828.models;

import com.aliyun.tea.*;

public class ListAssociatedResourceRulesResponseBody extends TeaModel {
    /**
     * <p>You can use the <code>NextToken</code> parameter to determine whether there is a token that can be used to start the next query. Valid values:</p>
     * <ul>
     * <li><p>If <code>NextToken</code> is empty, no next query is performed.</p>
     * </li>
     * <li><p>If a value is returned for <code>NextToken</code>, the value is the token that is used for the next query.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>caeba0bbb2be03f84eb48b699f0a****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>6E27F22C-EDA3-132E-A53F-77DE3BC2343D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>A list of associated resource rules.</p>
     */
    @NameInMap("Rules")
    public java.util.List<ListAssociatedResourceRulesResponseBodyRules> rules;

    public static ListAssociatedResourceRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAssociatedResourceRulesResponseBody self = new ListAssociatedResourceRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAssociatedResourceRulesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListAssociatedResourceRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAssociatedResourceRulesResponseBody setRules(java.util.List<ListAssociatedResourceRulesResponseBodyRules> rules) {
        this.rules = rules;
        return this;
    }
    public java.util.List<ListAssociatedResourceRulesResponseBodyRules> getRules() {
        return this.rules;
    }

    public static class ListAssociatedResourceRulesResponseBodyRules extends TeaModel {
        @NameInMap("ExistingStatus")
        public String existingStatus;

        /**
         * <p>The name of the associated resource rule.</p>
         * 
         * <strong>example:</strong>
         * <p>rule:UpdateLoadBalancerZones-UpdateLoadBalancerAddressTypeConfig-TagAlb:Alb-LoadBalancer:Vpc-Eip</p>
         */
        @NameInMap("SettingName")
        public String settingName;

        /**
         * <p>The status of the associated resource rule. Valid values: <code>Enable</code> and <code>Disable</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>Disable/Enable</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The Tag Keys to which the rule applies.</p>
         */
        @NameInMap("TagKeys")
        public java.util.List<String> tagKeys;

        public static ListAssociatedResourceRulesResponseBodyRules build(java.util.Map<String, ?> map) throws Exception {
            ListAssociatedResourceRulesResponseBodyRules self = new ListAssociatedResourceRulesResponseBodyRules();
            return TeaModel.build(map, self);
        }

        public ListAssociatedResourceRulesResponseBodyRules setExistingStatus(String existingStatus) {
            this.existingStatus = existingStatus;
            return this;
        }
        public String getExistingStatus() {
            return this.existingStatus;
        }

        public ListAssociatedResourceRulesResponseBodyRules setSettingName(String settingName) {
            this.settingName = settingName;
            return this;
        }
        public String getSettingName() {
            return this.settingName;
        }

        public ListAssociatedResourceRulesResponseBodyRules setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListAssociatedResourceRulesResponseBodyRules setTagKeys(java.util.List<String> tagKeys) {
            this.tagKeys = tagKeys;
            return this;
        }
        public java.util.List<String> getTagKeys() {
            return this.tagKeys;
        }

    }

}
