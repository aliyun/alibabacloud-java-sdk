// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class DescribeVServerGroupsResponseBody extends TeaModel {
    /**
     * <p>The listening port.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The name of the server group.</p>
     */
    @NameInMap("VServerGroups")
    public DescribeVServerGroupsResponseBodyVServerGroups VServerGroups;

    public static DescribeVServerGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVServerGroupsResponseBody self = new DescribeVServerGroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVServerGroupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeVServerGroupsResponseBody setVServerGroups(DescribeVServerGroupsResponseBodyVServerGroups VServerGroups) {
        this.VServerGroups = VServerGroups;
        return this;
    }
    public DescribeVServerGroupsResponseBodyVServerGroups getVServerGroups() {
        return this.VServerGroups;
    }

    public static class DescribeVServerGroupsResponseBodyVServerGroupsVServerGroupAssociatedObjectsListenersListener extends TeaModel {
        @NameInMap("Port")
        public Integer port;

        @NameInMap("Protocol")
        public String protocol;

        public static DescribeVServerGroupsResponseBodyVServerGroupsVServerGroupAssociatedObjectsListenersListener build(java.util.Map<String, ?> map) throws Exception {
            DescribeVServerGroupsResponseBodyVServerGroupsVServerGroupAssociatedObjectsListenersListener self = new DescribeVServerGroupsResponseBodyVServerGroupsVServerGroupAssociatedObjectsListenersListener();
            return TeaModel.build(map, self);
        }

        public DescribeVServerGroupsResponseBodyVServerGroupsVServerGroupAssociatedObjectsListenersListener setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public DescribeVServerGroupsResponseBodyVServerGroupsVServerGroupAssociatedObjectsListenersListener setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

    }

    public static class DescribeVServerGroupsResponseBodyVServerGroupsVServerGroupAssociatedObjectsListeners extends TeaModel {
        @NameInMap("Listener")
        public java.util.List<DescribeVServerGroupsResponseBodyVServerGroupsVServerGroupAssociatedObjectsListenersListener> listener;

        public static DescribeVServerGroupsResponseBodyVServerGroupsVServerGroupAssociatedObjectsListeners build(java.util.Map<String, ?> map) throws Exception {
            DescribeVServerGroupsResponseBodyVServerGroupsVServerGroupAssociatedObjectsListeners self = new DescribeVServerGroupsResponseBodyVServerGroupsVServerGroupAssociatedObjectsListeners();
            return TeaModel.build(map, self);
        }

        public DescribeVServerGroupsResponseBodyVServerGroupsVServerGroupAssociatedObjectsListeners setListener(java.util.List<DescribeVServerGroupsResponseBodyVServerGroupsVServerGroupAssociatedObjectsListenersListener> listener) {
            this.listener = listener;
            return this;
        }
        public java.util.List<DescribeVServerGroupsResponseBodyVServerGroupsVServerGroupAssociatedObjectsListenersListener> getListener() {
            return this.listener;
        }

    }

    public static class DescribeVServerGroupsResponseBodyVServerGroupsVServerGroupAssociatedObjectsRulesRule extends TeaModel {
        @NameInMap("Domain")
        public String domain;

        @NameInMap("RuleId")
        public String ruleId;

        @NameInMap("RuleName")
        public String ruleName;

        @NameInMap("Url")
        public String url;

        public static DescribeVServerGroupsResponseBodyVServerGroupsVServerGroupAssociatedObjectsRulesRule build(java.util.Map<String, ?> map) throws Exception {
            DescribeVServerGroupsResponseBodyVServerGroupsVServerGroupAssociatedObjectsRulesRule self = new DescribeVServerGroupsResponseBodyVServerGroupsVServerGroupAssociatedObjectsRulesRule();
            return TeaModel.build(map, self);
        }

        public DescribeVServerGroupsResponseBodyVServerGroupsVServerGroupAssociatedObjectsRulesRule setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public DescribeVServerGroupsResponseBodyVServerGroupsVServerGroupAssociatedObjectsRulesRule setRuleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public String getRuleId() {
            return this.ruleId;
        }

        public DescribeVServerGroupsResponseBodyVServerGroupsVServerGroupAssociatedObjectsRulesRule setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public DescribeVServerGroupsResponseBodyVServerGroupsVServerGroupAssociatedObjectsRulesRule setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class DescribeVServerGroupsResponseBodyVServerGroupsVServerGroupAssociatedObjectsRules extends TeaModel {
        @NameInMap("Rule")
        public java.util.List<DescribeVServerGroupsResponseBodyVServerGroupsVServerGroupAssociatedObjectsRulesRule> rule;

        public static DescribeVServerGroupsResponseBodyVServerGroupsVServerGroupAssociatedObjectsRules build(java.util.Map<String, ?> map) throws Exception {
            DescribeVServerGroupsResponseBodyVServerGroupsVServerGroupAssociatedObjectsRules self = new DescribeVServerGroupsResponseBodyVServerGroupsVServerGroupAssociatedObjectsRules();
            return TeaModel.build(map, self);
        }

        public DescribeVServerGroupsResponseBodyVServerGroupsVServerGroupAssociatedObjectsRules setRule(java.util.List<DescribeVServerGroupsResponseBodyVServerGroupsVServerGroupAssociatedObjectsRulesRule> rule) {
            this.rule = rule;
            return this;
        }
        public java.util.List<DescribeVServerGroupsResponseBodyVServerGroupsVServerGroupAssociatedObjectsRulesRule> getRule() {
            return this.rule;
        }

    }

    public static class DescribeVServerGroupsResponseBodyVServerGroupsVServerGroupAssociatedObjects extends TeaModel {
        /**
         * <p>Queries server groups of a Classic Load Balancer (CLB) instance.</p>
         */
        @NameInMap("Listeners")
        public DescribeVServerGroupsResponseBodyVServerGroupsVServerGroupAssociatedObjectsListeners listeners;

        @NameInMap("Rules")
        public DescribeVServerGroupsResponseBodyVServerGroupsVServerGroupAssociatedObjectsRules rules;

        public static DescribeVServerGroupsResponseBodyVServerGroupsVServerGroupAssociatedObjects build(java.util.Map<String, ?> map) throws Exception {
            DescribeVServerGroupsResponseBodyVServerGroupsVServerGroupAssociatedObjects self = new DescribeVServerGroupsResponseBodyVServerGroupsVServerGroupAssociatedObjects();
            return TeaModel.build(map, self);
        }

        public DescribeVServerGroupsResponseBodyVServerGroupsVServerGroupAssociatedObjects setListeners(DescribeVServerGroupsResponseBodyVServerGroupsVServerGroupAssociatedObjectsListeners listeners) {
            this.listeners = listeners;
            return this;
        }
        public DescribeVServerGroupsResponseBodyVServerGroupsVServerGroupAssociatedObjectsListeners getListeners() {
            return this.listeners;
        }

        public DescribeVServerGroupsResponseBodyVServerGroupsVServerGroupAssociatedObjects setRules(DescribeVServerGroupsResponseBodyVServerGroupsVServerGroupAssociatedObjectsRules rules) {
            this.rules = rules;
            return this;
        }
        public DescribeVServerGroupsResponseBodyVServerGroupsVServerGroupAssociatedObjectsRules getRules() {
            return this.rules;
        }

    }

    public static class DescribeVServerGroupsResponseBodyVServerGroupsVServerGroupTagsTag extends TeaModel {
        @NameInMap("TagKey")
        public String tagKey;

        @NameInMap("TagValue")
        public String tagValue;

        public static DescribeVServerGroupsResponseBodyVServerGroupsVServerGroupTagsTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeVServerGroupsResponseBodyVServerGroupsVServerGroupTagsTag self = new DescribeVServerGroupsResponseBodyVServerGroupsVServerGroupTagsTag();
            return TeaModel.build(map, self);
        }

        public DescribeVServerGroupsResponseBodyVServerGroupsVServerGroupTagsTag setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public DescribeVServerGroupsResponseBodyVServerGroupsVServerGroupTagsTag setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class DescribeVServerGroupsResponseBodyVServerGroupsVServerGroupTags extends TeaModel {
        @NameInMap("Tag")
        public java.util.List<DescribeVServerGroupsResponseBodyVServerGroupsVServerGroupTagsTag> tag;

        public static DescribeVServerGroupsResponseBodyVServerGroupsVServerGroupTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeVServerGroupsResponseBodyVServerGroupsVServerGroupTags self = new DescribeVServerGroupsResponseBodyVServerGroupsVServerGroupTags();
            return TeaModel.build(map, self);
        }

        public DescribeVServerGroupsResponseBodyVServerGroupsVServerGroupTags setTag(java.util.List<DescribeVServerGroupsResponseBodyVServerGroupsVServerGroupTagsTag> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<DescribeVServerGroupsResponseBodyVServerGroupsVServerGroupTagsTag> getTag() {
            return this.tag;
        }

    }

    public static class DescribeVServerGroupsResponseBodyVServerGroupsVServerGroup extends TeaModel {
        /**
         * <p>The ID of the request.</p>
         */
        @NameInMap("AssociatedObjects")
        public DescribeVServerGroupsResponseBodyVServerGroupsVServerGroupAssociatedObjects associatedObjects;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("ServerCount")
        public Long serverCount;

        @NameInMap("Tags")
        public DescribeVServerGroupsResponseBodyVServerGroupsVServerGroupTags tags;

        /**
         * <p>Specifies whether to return information about the associated listeners. Valid values:</p>
         * <br>
         * <p>*   **true**: yes</p>
         * <p>*   **false** (default): no</p>
         */
        @NameInMap("VServerGroupId")
        public String VServerGroupId;

        /**
         * <p>The list of backend servers.</p>
         */
        @NameInMap("VServerGroupName")
        public String VServerGroupName;

        public static DescribeVServerGroupsResponseBodyVServerGroupsVServerGroup build(java.util.Map<String, ?> map) throws Exception {
            DescribeVServerGroupsResponseBodyVServerGroupsVServerGroup self = new DescribeVServerGroupsResponseBodyVServerGroupsVServerGroup();
            return TeaModel.build(map, self);
        }

        public DescribeVServerGroupsResponseBodyVServerGroupsVServerGroup setAssociatedObjects(DescribeVServerGroupsResponseBodyVServerGroupsVServerGroupAssociatedObjects associatedObjects) {
            this.associatedObjects = associatedObjects;
            return this;
        }
        public DescribeVServerGroupsResponseBodyVServerGroupsVServerGroupAssociatedObjects getAssociatedObjects() {
            return this.associatedObjects;
        }

        public DescribeVServerGroupsResponseBodyVServerGroupsVServerGroup setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeVServerGroupsResponseBodyVServerGroupsVServerGroup setServerCount(Long serverCount) {
            this.serverCount = serverCount;
            return this;
        }
        public Long getServerCount() {
            return this.serverCount;
        }

        public DescribeVServerGroupsResponseBodyVServerGroupsVServerGroup setTags(DescribeVServerGroupsResponseBodyVServerGroupsVServerGroupTags tags) {
            this.tags = tags;
            return this;
        }
        public DescribeVServerGroupsResponseBodyVServerGroupsVServerGroupTags getTags() {
            return this.tags;
        }

        public DescribeVServerGroupsResponseBodyVServerGroupsVServerGroup setVServerGroupId(String VServerGroupId) {
            this.VServerGroupId = VServerGroupId;
            return this;
        }
        public String getVServerGroupId() {
            return this.VServerGroupId;
        }

        public DescribeVServerGroupsResponseBodyVServerGroupsVServerGroup setVServerGroupName(String VServerGroupName) {
            this.VServerGroupName = VServerGroupName;
            return this;
        }
        public String getVServerGroupName() {
            return this.VServerGroupName;
        }

    }

    public static class DescribeVServerGroupsResponseBodyVServerGroups extends TeaModel {
        @NameInMap("VServerGroup")
        public java.util.List<DescribeVServerGroupsResponseBodyVServerGroupsVServerGroup> VServerGroup;

        public static DescribeVServerGroupsResponseBodyVServerGroups build(java.util.Map<String, ?> map) throws Exception {
            DescribeVServerGroupsResponseBodyVServerGroups self = new DescribeVServerGroupsResponseBodyVServerGroups();
            return TeaModel.build(map, self);
        }

        public DescribeVServerGroupsResponseBodyVServerGroups setVServerGroup(java.util.List<DescribeVServerGroupsResponseBodyVServerGroupsVServerGroup> VServerGroup) {
            this.VServerGroup = VServerGroup;
            return this;
        }
        public java.util.List<DescribeVServerGroupsResponseBodyVServerGroupsVServerGroup> getVServerGroup() {
            return this.VServerGroup;
        }

    }

}
