// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class DescribeVServerGroupsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("VServerGroups")
    public java.util.List<DescribeVServerGroupsResponseBodyVServerGroups> VServerGroups;

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

    public DescribeVServerGroupsResponseBody setVServerGroups(java.util.List<DescribeVServerGroupsResponseBodyVServerGroups> VServerGroups) {
        this.VServerGroups = VServerGroups;
        return this;
    }
    public java.util.List<DescribeVServerGroupsResponseBodyVServerGroups> getVServerGroups() {
        return this.VServerGroups;
    }

    public static class DescribeVServerGroupsResponseBodyVServerGroupsAssociatedObjectsListeners extends TeaModel {
        @NameInMap("Protocol")
        public String protocol;

        @NameInMap("Port")
        public Integer port;

        public static DescribeVServerGroupsResponseBodyVServerGroupsAssociatedObjectsListeners build(java.util.Map<String, ?> map) throws Exception {
            DescribeVServerGroupsResponseBodyVServerGroupsAssociatedObjectsListeners self = new DescribeVServerGroupsResponseBodyVServerGroupsAssociatedObjectsListeners();
            return TeaModel.build(map, self);
        }

        public DescribeVServerGroupsResponseBodyVServerGroupsAssociatedObjectsListeners setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public DescribeVServerGroupsResponseBodyVServerGroupsAssociatedObjectsListeners setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

    }

    public static class DescribeVServerGroupsResponseBodyVServerGroupsAssociatedObjectsRules extends TeaModel {
        @NameInMap("Domain")
        public String domain;

        @NameInMap("Url")
        public String url;

        @NameInMap("RuleName")
        public String ruleName;

        @NameInMap("RuleId")
        public String ruleId;

        public static DescribeVServerGroupsResponseBodyVServerGroupsAssociatedObjectsRules build(java.util.Map<String, ?> map) throws Exception {
            DescribeVServerGroupsResponseBodyVServerGroupsAssociatedObjectsRules self = new DescribeVServerGroupsResponseBodyVServerGroupsAssociatedObjectsRules();
            return TeaModel.build(map, self);
        }

        public DescribeVServerGroupsResponseBodyVServerGroupsAssociatedObjectsRules setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public DescribeVServerGroupsResponseBodyVServerGroupsAssociatedObjectsRules setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

        public DescribeVServerGroupsResponseBodyVServerGroupsAssociatedObjectsRules setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public DescribeVServerGroupsResponseBodyVServerGroupsAssociatedObjectsRules setRuleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public String getRuleId() {
            return this.ruleId;
        }

    }

    public static class DescribeVServerGroupsResponseBodyVServerGroupsAssociatedObjects extends TeaModel {
        @NameInMap("Listeners")
        public java.util.List<DescribeVServerGroupsResponseBodyVServerGroupsAssociatedObjectsListeners> listeners;

        @NameInMap("Rules")
        public java.util.List<DescribeVServerGroupsResponseBodyVServerGroupsAssociatedObjectsRules> rules;

        public static DescribeVServerGroupsResponseBodyVServerGroupsAssociatedObjects build(java.util.Map<String, ?> map) throws Exception {
            DescribeVServerGroupsResponseBodyVServerGroupsAssociatedObjects self = new DescribeVServerGroupsResponseBodyVServerGroupsAssociatedObjects();
            return TeaModel.build(map, self);
        }

        public DescribeVServerGroupsResponseBodyVServerGroupsAssociatedObjects setListeners(java.util.List<DescribeVServerGroupsResponseBodyVServerGroupsAssociatedObjectsListeners> listeners) {
            this.listeners = listeners;
            return this;
        }
        public java.util.List<DescribeVServerGroupsResponseBodyVServerGroupsAssociatedObjectsListeners> getListeners() {
            return this.listeners;
        }

        public DescribeVServerGroupsResponseBodyVServerGroupsAssociatedObjects setRules(java.util.List<DescribeVServerGroupsResponseBodyVServerGroupsAssociatedObjectsRules> rules) {
            this.rules = rules;
            return this;
        }
        public java.util.List<DescribeVServerGroupsResponseBodyVServerGroupsAssociatedObjectsRules> getRules() {
            return this.rules;
        }

    }

    public static class DescribeVServerGroupsResponseBodyVServerGroups extends TeaModel {
        @NameInMap("VServerGroupId")
        public String VServerGroupId;

        @NameInMap("VServerGroupName")
        public String VServerGroupName;

        @NameInMap("AssociatedObjects")
        public DescribeVServerGroupsResponseBodyVServerGroupsAssociatedObjects associatedObjects;

        public static DescribeVServerGroupsResponseBodyVServerGroups build(java.util.Map<String, ?> map) throws Exception {
            DescribeVServerGroupsResponseBodyVServerGroups self = new DescribeVServerGroupsResponseBodyVServerGroups();
            return TeaModel.build(map, self);
        }

        public DescribeVServerGroupsResponseBodyVServerGroups setVServerGroupId(String VServerGroupId) {
            this.VServerGroupId = VServerGroupId;
            return this;
        }
        public String getVServerGroupId() {
            return this.VServerGroupId;
        }

        public DescribeVServerGroupsResponseBodyVServerGroups setVServerGroupName(String VServerGroupName) {
            this.VServerGroupName = VServerGroupName;
            return this;
        }
        public String getVServerGroupName() {
            return this.VServerGroupName;
        }

        public DescribeVServerGroupsResponseBodyVServerGroups setAssociatedObjects(DescribeVServerGroupsResponseBodyVServerGroupsAssociatedObjects associatedObjects) {
            this.associatedObjects = associatedObjects;
            return this;
        }
        public DescribeVServerGroupsResponseBodyVServerGroupsAssociatedObjects getAssociatedObjects() {
            return this.associatedObjects;
        }

    }

}
