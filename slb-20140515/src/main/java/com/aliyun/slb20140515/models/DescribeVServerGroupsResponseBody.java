// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class DescribeVServerGroupsResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The list of backend servers.</p>
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
        /**
         * <p>The listening port.</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <p>The listening protocol. Valid values: **tcp**, **udp**, **http**, and **https**.</p>
         */
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
        /**
         * <p>The requested domain name.</p>
         */
        @NameInMap("Domain")
        public String domain;

        /**
         * <p>The ID of the forwarding rule.</p>
         */
        @NameInMap("RuleId")
        public String ruleId;

        /**
         * <p>The name of the forwarding rule.</p>
         */
        @NameInMap("RuleName")
        public String ruleName;

        /**
         * <p>The request path.</p>
         */
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
         * <p>The list of listeners.</p>
         */
        @NameInMap("Listeners")
        public DescribeVServerGroupsResponseBodyVServerGroupsVServerGroupAssociatedObjectsListeners listeners;

        /**
         * <p>The list of forwarding rules.</p>
         */
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

    public static class DescribeVServerGroupsResponseBodyVServerGroupsVServerGroup extends TeaModel {
        /**
         * <p>The items associated with the server groups.</p>
         */
        @NameInMap("AssociatedObjects")
        public DescribeVServerGroupsResponseBodyVServerGroupsVServerGroupAssociatedObjects associatedObjects;

        /**
         * <p>The time when the CLB instance was created. The time follows the `YYYY-MM-DDThh:mm:ssZ` format.</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The number of servers. </p>
         * <br>
         * <p>>  The feature corresponding to this parameter is not available by default. If you want to use this feature, [submit a ticket](https://ticket-intl.console.aliyun.com/#/ticket/createIndex).</p>
         */
        @NameInMap("ServerCount")
        public Long serverCount;

        /**
         * <p>The ID of the server group.</p>
         */
        @NameInMap("VServerGroupId")
        public String VServerGroupId;

        /**
         * <p>The name of the server group.</p>
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
