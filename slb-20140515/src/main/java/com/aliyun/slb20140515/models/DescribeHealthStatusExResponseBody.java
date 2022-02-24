// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class DescribeHealthStatusExResponseBody extends TeaModel {
    @NameInMap("ListenerServerGroup")
    public DescribeHealthStatusExResponseBodyListenerServerGroup listenerServerGroup;

    // 分页token
    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("RuleServerGroups")
    public DescribeHealthStatusExResponseBodyRuleServerGroups ruleServerGroups;

    public static DescribeHealthStatusExResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeHealthStatusExResponseBody self = new DescribeHealthStatusExResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeHealthStatusExResponseBody setListenerServerGroup(DescribeHealthStatusExResponseBodyListenerServerGroup listenerServerGroup) {
        this.listenerServerGroup = listenerServerGroup;
        return this;
    }
    public DescribeHealthStatusExResponseBodyListenerServerGroup getListenerServerGroup() {
        return this.listenerServerGroup;
    }

    public DescribeHealthStatusExResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeHealthStatusExResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeHealthStatusExResponseBody setRuleServerGroups(DescribeHealthStatusExResponseBodyRuleServerGroups ruleServerGroups) {
        this.ruleServerGroups = ruleServerGroups;
        return this;
    }
    public DescribeHealthStatusExResponseBodyRuleServerGroups getRuleServerGroups() {
        return this.ruleServerGroups;
    }

    public static class DescribeHealthStatusExResponseBodyListenerServerGroupNonNormalServersNonNormalServerReason extends TeaModel {
        @NameInMap("ActualResponse")
        public String actualResponse;

        @NameInMap("ExpectedResponse")
        public String expectedResponse;

        @NameInMap("ReasonCode")
        public String reasonCode;

        public static DescribeHealthStatusExResponseBodyListenerServerGroupNonNormalServersNonNormalServerReason build(java.util.Map<String, ?> map) throws Exception {
            DescribeHealthStatusExResponseBodyListenerServerGroupNonNormalServersNonNormalServerReason self = new DescribeHealthStatusExResponseBodyListenerServerGroupNonNormalServersNonNormalServerReason();
            return TeaModel.build(map, self);
        }

        public DescribeHealthStatusExResponseBodyListenerServerGroupNonNormalServersNonNormalServerReason setActualResponse(String actualResponse) {
            this.actualResponse = actualResponse;
            return this;
        }
        public String getActualResponse() {
            return this.actualResponse;
        }

        public DescribeHealthStatusExResponseBodyListenerServerGroupNonNormalServersNonNormalServerReason setExpectedResponse(String expectedResponse) {
            this.expectedResponse = expectedResponse;
            return this;
        }
        public String getExpectedResponse() {
            return this.expectedResponse;
        }

        public DescribeHealthStatusExResponseBodyListenerServerGroupNonNormalServersNonNormalServerReason setReasonCode(String reasonCode) {
            this.reasonCode = reasonCode;
            return this;
        }
        public String getReasonCode() {
            return this.reasonCode;
        }

    }

    public static class DescribeHealthStatusExResponseBodyListenerServerGroupNonNormalServersNonNormalServer extends TeaModel {
        @NameInMap("Port")
        public Integer port;

        @NameInMap("Reason")
        public DescribeHealthStatusExResponseBodyListenerServerGroupNonNormalServersNonNormalServerReason reason;

        @NameInMap("ServerId")
        public String serverId;

        @NameInMap("ServerIp")
        public String serverIp;

        @NameInMap("ServerType")
        public String serverType;

        @NameInMap("Status")
        public String status;

        public static DescribeHealthStatusExResponseBodyListenerServerGroupNonNormalServersNonNormalServer build(java.util.Map<String, ?> map) throws Exception {
            DescribeHealthStatusExResponseBodyListenerServerGroupNonNormalServersNonNormalServer self = new DescribeHealthStatusExResponseBodyListenerServerGroupNonNormalServersNonNormalServer();
            return TeaModel.build(map, self);
        }

        public DescribeHealthStatusExResponseBodyListenerServerGroupNonNormalServersNonNormalServer setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public DescribeHealthStatusExResponseBodyListenerServerGroupNonNormalServersNonNormalServer setReason(DescribeHealthStatusExResponseBodyListenerServerGroupNonNormalServersNonNormalServerReason reason) {
            this.reason = reason;
            return this;
        }
        public DescribeHealthStatusExResponseBodyListenerServerGroupNonNormalServersNonNormalServerReason getReason() {
            return this.reason;
        }

        public DescribeHealthStatusExResponseBodyListenerServerGroupNonNormalServersNonNormalServer setServerId(String serverId) {
            this.serverId = serverId;
            return this;
        }
        public String getServerId() {
            return this.serverId;
        }

        public DescribeHealthStatusExResponseBodyListenerServerGroupNonNormalServersNonNormalServer setServerIp(String serverIp) {
            this.serverIp = serverIp;
            return this;
        }
        public String getServerIp() {
            return this.serverIp;
        }

        public DescribeHealthStatusExResponseBodyListenerServerGroupNonNormalServersNonNormalServer setServerType(String serverType) {
            this.serverType = serverType;
            return this;
        }
        public String getServerType() {
            return this.serverType;
        }

        public DescribeHealthStatusExResponseBodyListenerServerGroupNonNormalServersNonNormalServer setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeHealthStatusExResponseBodyListenerServerGroupNonNormalServers extends TeaModel {
        @NameInMap("NonNormalServer")
        public java.util.List<DescribeHealthStatusExResponseBodyListenerServerGroupNonNormalServersNonNormalServer> nonNormalServer;

        public static DescribeHealthStatusExResponseBodyListenerServerGroupNonNormalServers build(java.util.Map<String, ?> map) throws Exception {
            DescribeHealthStatusExResponseBodyListenerServerGroupNonNormalServers self = new DescribeHealthStatusExResponseBodyListenerServerGroupNonNormalServers();
            return TeaModel.build(map, self);
        }

        public DescribeHealthStatusExResponseBodyListenerServerGroupNonNormalServers setNonNormalServer(java.util.List<DescribeHealthStatusExResponseBodyListenerServerGroupNonNormalServersNonNormalServer> nonNormalServer) {
            this.nonNormalServer = nonNormalServer;
            return this;
        }
        public java.util.List<DescribeHealthStatusExResponseBodyListenerServerGroupNonNormalServersNonNormalServer> getNonNormalServer() {
            return this.nonNormalServer;
        }

    }

    public static class DescribeHealthStatusExResponseBodyListenerServerGroupServerGroupStatusServerGroupStatusNonNormalServersNonNormalServerReason extends TeaModel {
        @NameInMap("ActualResponse")
        public String actualResponse;

        @NameInMap("ExpectedResponse")
        public String expectedResponse;

        @NameInMap("ReasonCode")
        public String reasonCode;

        public static DescribeHealthStatusExResponseBodyListenerServerGroupServerGroupStatusServerGroupStatusNonNormalServersNonNormalServerReason build(java.util.Map<String, ?> map) throws Exception {
            DescribeHealthStatusExResponseBodyListenerServerGroupServerGroupStatusServerGroupStatusNonNormalServersNonNormalServerReason self = new DescribeHealthStatusExResponseBodyListenerServerGroupServerGroupStatusServerGroupStatusNonNormalServersNonNormalServerReason();
            return TeaModel.build(map, self);
        }

        public DescribeHealthStatusExResponseBodyListenerServerGroupServerGroupStatusServerGroupStatusNonNormalServersNonNormalServerReason setActualResponse(String actualResponse) {
            this.actualResponse = actualResponse;
            return this;
        }
        public String getActualResponse() {
            return this.actualResponse;
        }

        public DescribeHealthStatusExResponseBodyListenerServerGroupServerGroupStatusServerGroupStatusNonNormalServersNonNormalServerReason setExpectedResponse(String expectedResponse) {
            this.expectedResponse = expectedResponse;
            return this;
        }
        public String getExpectedResponse() {
            return this.expectedResponse;
        }

        public DescribeHealthStatusExResponseBodyListenerServerGroupServerGroupStatusServerGroupStatusNonNormalServersNonNormalServerReason setReasonCode(String reasonCode) {
            this.reasonCode = reasonCode;
            return this;
        }
        public String getReasonCode() {
            return this.reasonCode;
        }

    }

    public static class DescribeHealthStatusExResponseBodyListenerServerGroupServerGroupStatusServerGroupStatusNonNormalServersNonNormalServer extends TeaModel {
        @NameInMap("Port")
        public Integer port;

        @NameInMap("Reason")
        public DescribeHealthStatusExResponseBodyListenerServerGroupServerGroupStatusServerGroupStatusNonNormalServersNonNormalServerReason reason;

        @NameInMap("ServerId")
        public String serverId;

        @NameInMap("ServerIp")
        public String serverIp;

        @NameInMap("ServerType")
        public String serverType;

        @NameInMap("Status")
        public String status;

        public static DescribeHealthStatusExResponseBodyListenerServerGroupServerGroupStatusServerGroupStatusNonNormalServersNonNormalServer build(java.util.Map<String, ?> map) throws Exception {
            DescribeHealthStatusExResponseBodyListenerServerGroupServerGroupStatusServerGroupStatusNonNormalServersNonNormalServer self = new DescribeHealthStatusExResponseBodyListenerServerGroupServerGroupStatusServerGroupStatusNonNormalServersNonNormalServer();
            return TeaModel.build(map, self);
        }

        public DescribeHealthStatusExResponseBodyListenerServerGroupServerGroupStatusServerGroupStatusNonNormalServersNonNormalServer setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public DescribeHealthStatusExResponseBodyListenerServerGroupServerGroupStatusServerGroupStatusNonNormalServersNonNormalServer setReason(DescribeHealthStatusExResponseBodyListenerServerGroupServerGroupStatusServerGroupStatusNonNormalServersNonNormalServerReason reason) {
            this.reason = reason;
            return this;
        }
        public DescribeHealthStatusExResponseBodyListenerServerGroupServerGroupStatusServerGroupStatusNonNormalServersNonNormalServerReason getReason() {
            return this.reason;
        }

        public DescribeHealthStatusExResponseBodyListenerServerGroupServerGroupStatusServerGroupStatusNonNormalServersNonNormalServer setServerId(String serverId) {
            this.serverId = serverId;
            return this;
        }
        public String getServerId() {
            return this.serverId;
        }

        public DescribeHealthStatusExResponseBodyListenerServerGroupServerGroupStatusServerGroupStatusNonNormalServersNonNormalServer setServerIp(String serverIp) {
            this.serverIp = serverIp;
            return this;
        }
        public String getServerIp() {
            return this.serverIp;
        }

        public DescribeHealthStatusExResponseBodyListenerServerGroupServerGroupStatusServerGroupStatusNonNormalServersNonNormalServer setServerType(String serverType) {
            this.serverType = serverType;
            return this;
        }
        public String getServerType() {
            return this.serverType;
        }

        public DescribeHealthStatusExResponseBodyListenerServerGroupServerGroupStatusServerGroupStatusNonNormalServersNonNormalServer setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeHealthStatusExResponseBodyListenerServerGroupServerGroupStatusServerGroupStatusNonNormalServers extends TeaModel {
        @NameInMap("NonNormalServer")
        public java.util.List<DescribeHealthStatusExResponseBodyListenerServerGroupServerGroupStatusServerGroupStatusNonNormalServersNonNormalServer> nonNormalServer;

        public static DescribeHealthStatusExResponseBodyListenerServerGroupServerGroupStatusServerGroupStatusNonNormalServers build(java.util.Map<String, ?> map) throws Exception {
            DescribeHealthStatusExResponseBodyListenerServerGroupServerGroupStatusServerGroupStatusNonNormalServers self = new DescribeHealthStatusExResponseBodyListenerServerGroupServerGroupStatusServerGroupStatusNonNormalServers();
            return TeaModel.build(map, self);
        }

        public DescribeHealthStatusExResponseBodyListenerServerGroupServerGroupStatusServerGroupStatusNonNormalServers setNonNormalServer(java.util.List<DescribeHealthStatusExResponseBodyListenerServerGroupServerGroupStatusServerGroupStatusNonNormalServersNonNormalServer> nonNormalServer) {
            this.nonNormalServer = nonNormalServer;
            return this;
        }
        public java.util.List<DescribeHealthStatusExResponseBodyListenerServerGroupServerGroupStatusServerGroupStatusNonNormalServersNonNormalServer> getNonNormalServer() {
            return this.nonNormalServer;
        }

    }

    public static class DescribeHealthStatusExResponseBodyListenerServerGroupServerGroupStatusServerGroupStatus extends TeaModel {
        @NameInMap("NonNormalServers")
        public DescribeHealthStatusExResponseBodyListenerServerGroupServerGroupStatusServerGroupStatusNonNormalServers nonNormalServers;

        @NameInMap("ServerGroupId")
        public String serverGroupId;

        @NameInMap("ServerGroupType")
        public String serverGroupType;

        public static DescribeHealthStatusExResponseBodyListenerServerGroupServerGroupStatusServerGroupStatus build(java.util.Map<String, ?> map) throws Exception {
            DescribeHealthStatusExResponseBodyListenerServerGroupServerGroupStatusServerGroupStatus self = new DescribeHealthStatusExResponseBodyListenerServerGroupServerGroupStatusServerGroupStatus();
            return TeaModel.build(map, self);
        }

        public DescribeHealthStatusExResponseBodyListenerServerGroupServerGroupStatusServerGroupStatus setNonNormalServers(DescribeHealthStatusExResponseBodyListenerServerGroupServerGroupStatusServerGroupStatusNonNormalServers nonNormalServers) {
            this.nonNormalServers = nonNormalServers;
            return this;
        }
        public DescribeHealthStatusExResponseBodyListenerServerGroupServerGroupStatusServerGroupStatusNonNormalServers getNonNormalServers() {
            return this.nonNormalServers;
        }

        public DescribeHealthStatusExResponseBodyListenerServerGroupServerGroupStatusServerGroupStatus setServerGroupId(String serverGroupId) {
            this.serverGroupId = serverGroupId;
            return this;
        }
        public String getServerGroupId() {
            return this.serverGroupId;
        }

        public DescribeHealthStatusExResponseBodyListenerServerGroupServerGroupStatusServerGroupStatus setServerGroupType(String serverGroupType) {
            this.serverGroupType = serverGroupType;
            return this;
        }
        public String getServerGroupType() {
            return this.serverGroupType;
        }

    }

    public static class DescribeHealthStatusExResponseBodyListenerServerGroupServerGroupStatus extends TeaModel {
        @NameInMap("ServerGroupStatus")
        public java.util.List<DescribeHealthStatusExResponseBodyListenerServerGroupServerGroupStatusServerGroupStatus> serverGroupStatus;

        public static DescribeHealthStatusExResponseBodyListenerServerGroupServerGroupStatus build(java.util.Map<String, ?> map) throws Exception {
            DescribeHealthStatusExResponseBodyListenerServerGroupServerGroupStatus self = new DescribeHealthStatusExResponseBodyListenerServerGroupServerGroupStatus();
            return TeaModel.build(map, self);
        }

        public DescribeHealthStatusExResponseBodyListenerServerGroupServerGroupStatus setServerGroupStatus(java.util.List<DescribeHealthStatusExResponseBodyListenerServerGroupServerGroupStatusServerGroupStatus> serverGroupStatus) {
            this.serverGroupStatus = serverGroupStatus;
            return this;
        }
        public java.util.List<DescribeHealthStatusExResponseBodyListenerServerGroupServerGroupStatusServerGroupStatus> getServerGroupStatus() {
            return this.serverGroupStatus;
        }

    }

    public static class DescribeHealthStatusExResponseBodyListenerServerGroup extends TeaModel {
        @NameInMap("HealthCheck")
        public String healthCheck;

        @NameInMap("NonNormalServers")
        public DescribeHealthStatusExResponseBodyListenerServerGroupNonNormalServers nonNormalServers;

        @NameInMap("ServerGroupId")
        public String serverGroupId;

        @NameInMap("ServerGroupStatus")
        public DescribeHealthStatusExResponseBodyListenerServerGroupServerGroupStatus serverGroupStatus;

        @NameInMap("ServerGroupType")
        public String serverGroupType;

        public static DescribeHealthStatusExResponseBodyListenerServerGroup build(java.util.Map<String, ?> map) throws Exception {
            DescribeHealthStatusExResponseBodyListenerServerGroup self = new DescribeHealthStatusExResponseBodyListenerServerGroup();
            return TeaModel.build(map, self);
        }

        public DescribeHealthStatusExResponseBodyListenerServerGroup setHealthCheck(String healthCheck) {
            this.healthCheck = healthCheck;
            return this;
        }
        public String getHealthCheck() {
            return this.healthCheck;
        }

        public DescribeHealthStatusExResponseBodyListenerServerGroup setNonNormalServers(DescribeHealthStatusExResponseBodyListenerServerGroupNonNormalServers nonNormalServers) {
            this.nonNormalServers = nonNormalServers;
            return this;
        }
        public DescribeHealthStatusExResponseBodyListenerServerGroupNonNormalServers getNonNormalServers() {
            return this.nonNormalServers;
        }

        public DescribeHealthStatusExResponseBodyListenerServerGroup setServerGroupId(String serverGroupId) {
            this.serverGroupId = serverGroupId;
            return this;
        }
        public String getServerGroupId() {
            return this.serverGroupId;
        }

        public DescribeHealthStatusExResponseBodyListenerServerGroup setServerGroupStatus(DescribeHealthStatusExResponseBodyListenerServerGroupServerGroupStatus serverGroupStatus) {
            this.serverGroupStatus = serverGroupStatus;
            return this;
        }
        public DescribeHealthStatusExResponseBodyListenerServerGroupServerGroupStatus getServerGroupStatus() {
            return this.serverGroupStatus;
        }

        public DescribeHealthStatusExResponseBodyListenerServerGroup setServerGroupType(String serverGroupType) {
            this.serverGroupType = serverGroupType;
            return this;
        }
        public String getServerGroupType() {
            return this.serverGroupType;
        }

    }

    public static class DescribeHealthStatusExResponseBodyRuleServerGroupsRuleServerGroupNonNormalServersNonNormalServerReason extends TeaModel {
        @NameInMap("ActualResponse")
        public String actualResponse;

        @NameInMap("ExpectedResponse")
        public String expectedResponse;

        @NameInMap("ReasonCode")
        public String reasonCode;

        public static DescribeHealthStatusExResponseBodyRuleServerGroupsRuleServerGroupNonNormalServersNonNormalServerReason build(java.util.Map<String, ?> map) throws Exception {
            DescribeHealthStatusExResponseBodyRuleServerGroupsRuleServerGroupNonNormalServersNonNormalServerReason self = new DescribeHealthStatusExResponseBodyRuleServerGroupsRuleServerGroupNonNormalServersNonNormalServerReason();
            return TeaModel.build(map, self);
        }

        public DescribeHealthStatusExResponseBodyRuleServerGroupsRuleServerGroupNonNormalServersNonNormalServerReason setActualResponse(String actualResponse) {
            this.actualResponse = actualResponse;
            return this;
        }
        public String getActualResponse() {
            return this.actualResponse;
        }

        public DescribeHealthStatusExResponseBodyRuleServerGroupsRuleServerGroupNonNormalServersNonNormalServerReason setExpectedResponse(String expectedResponse) {
            this.expectedResponse = expectedResponse;
            return this;
        }
        public String getExpectedResponse() {
            return this.expectedResponse;
        }

        public DescribeHealthStatusExResponseBodyRuleServerGroupsRuleServerGroupNonNormalServersNonNormalServerReason setReasonCode(String reasonCode) {
            this.reasonCode = reasonCode;
            return this;
        }
        public String getReasonCode() {
            return this.reasonCode;
        }

    }

    public static class DescribeHealthStatusExResponseBodyRuleServerGroupsRuleServerGroupNonNormalServersNonNormalServer extends TeaModel {
        @NameInMap("Port")
        public Integer port;

        @NameInMap("Reason")
        public DescribeHealthStatusExResponseBodyRuleServerGroupsRuleServerGroupNonNormalServersNonNormalServerReason reason;

        @NameInMap("ServerId")
        public String serverId;

        @NameInMap("ServerIp")
        public String serverIp;

        @NameInMap("ServerType")
        public String serverType;

        @NameInMap("Status")
        public String status;

        public static DescribeHealthStatusExResponseBodyRuleServerGroupsRuleServerGroupNonNormalServersNonNormalServer build(java.util.Map<String, ?> map) throws Exception {
            DescribeHealthStatusExResponseBodyRuleServerGroupsRuleServerGroupNonNormalServersNonNormalServer self = new DescribeHealthStatusExResponseBodyRuleServerGroupsRuleServerGroupNonNormalServersNonNormalServer();
            return TeaModel.build(map, self);
        }

        public DescribeHealthStatusExResponseBodyRuleServerGroupsRuleServerGroupNonNormalServersNonNormalServer setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public DescribeHealthStatusExResponseBodyRuleServerGroupsRuleServerGroupNonNormalServersNonNormalServer setReason(DescribeHealthStatusExResponseBodyRuleServerGroupsRuleServerGroupNonNormalServersNonNormalServerReason reason) {
            this.reason = reason;
            return this;
        }
        public DescribeHealthStatusExResponseBodyRuleServerGroupsRuleServerGroupNonNormalServersNonNormalServerReason getReason() {
            return this.reason;
        }

        public DescribeHealthStatusExResponseBodyRuleServerGroupsRuleServerGroupNonNormalServersNonNormalServer setServerId(String serverId) {
            this.serverId = serverId;
            return this;
        }
        public String getServerId() {
            return this.serverId;
        }

        public DescribeHealthStatusExResponseBodyRuleServerGroupsRuleServerGroupNonNormalServersNonNormalServer setServerIp(String serverIp) {
            this.serverIp = serverIp;
            return this;
        }
        public String getServerIp() {
            return this.serverIp;
        }

        public DescribeHealthStatusExResponseBodyRuleServerGroupsRuleServerGroupNonNormalServersNonNormalServer setServerType(String serverType) {
            this.serverType = serverType;
            return this;
        }
        public String getServerType() {
            return this.serverType;
        }

        public DescribeHealthStatusExResponseBodyRuleServerGroupsRuleServerGroupNonNormalServersNonNormalServer setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeHealthStatusExResponseBodyRuleServerGroupsRuleServerGroupNonNormalServers extends TeaModel {
        @NameInMap("NonNormalServer")
        public java.util.List<DescribeHealthStatusExResponseBodyRuleServerGroupsRuleServerGroupNonNormalServersNonNormalServer> nonNormalServer;

        public static DescribeHealthStatusExResponseBodyRuleServerGroupsRuleServerGroupNonNormalServers build(java.util.Map<String, ?> map) throws Exception {
            DescribeHealthStatusExResponseBodyRuleServerGroupsRuleServerGroupNonNormalServers self = new DescribeHealthStatusExResponseBodyRuleServerGroupsRuleServerGroupNonNormalServers();
            return TeaModel.build(map, self);
        }

        public DescribeHealthStatusExResponseBodyRuleServerGroupsRuleServerGroupNonNormalServers setNonNormalServer(java.util.List<DescribeHealthStatusExResponseBodyRuleServerGroupsRuleServerGroupNonNormalServersNonNormalServer> nonNormalServer) {
            this.nonNormalServer = nonNormalServer;
            return this;
        }
        public java.util.List<DescribeHealthStatusExResponseBodyRuleServerGroupsRuleServerGroupNonNormalServersNonNormalServer> getNonNormalServer() {
            return this.nonNormalServer;
        }

    }

    public static class DescribeHealthStatusExResponseBodyRuleServerGroupsRuleServerGroup extends TeaModel {
        @NameInMap("Domain")
        public String domain;

        @NameInMap("HealthCheck")
        public String healthCheck;

        @NameInMap("NonNormalServers")
        public DescribeHealthStatusExResponseBodyRuleServerGroupsRuleServerGroupNonNormalServers nonNormalServers;

        @NameInMap("RuleId")
        public String ruleId;

        @NameInMap("ServerGroupId")
        public String serverGroupId;

        @NameInMap("Url")
        public String url;

        public static DescribeHealthStatusExResponseBodyRuleServerGroupsRuleServerGroup build(java.util.Map<String, ?> map) throws Exception {
            DescribeHealthStatusExResponseBodyRuleServerGroupsRuleServerGroup self = new DescribeHealthStatusExResponseBodyRuleServerGroupsRuleServerGroup();
            return TeaModel.build(map, self);
        }

        public DescribeHealthStatusExResponseBodyRuleServerGroupsRuleServerGroup setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public DescribeHealthStatusExResponseBodyRuleServerGroupsRuleServerGroup setHealthCheck(String healthCheck) {
            this.healthCheck = healthCheck;
            return this;
        }
        public String getHealthCheck() {
            return this.healthCheck;
        }

        public DescribeHealthStatusExResponseBodyRuleServerGroupsRuleServerGroup setNonNormalServers(DescribeHealthStatusExResponseBodyRuleServerGroupsRuleServerGroupNonNormalServers nonNormalServers) {
            this.nonNormalServers = nonNormalServers;
            return this;
        }
        public DescribeHealthStatusExResponseBodyRuleServerGroupsRuleServerGroupNonNormalServers getNonNormalServers() {
            return this.nonNormalServers;
        }

        public DescribeHealthStatusExResponseBodyRuleServerGroupsRuleServerGroup setRuleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public String getRuleId() {
            return this.ruleId;
        }

        public DescribeHealthStatusExResponseBodyRuleServerGroupsRuleServerGroup setServerGroupId(String serverGroupId) {
            this.serverGroupId = serverGroupId;
            return this;
        }
        public String getServerGroupId() {
            return this.serverGroupId;
        }

        public DescribeHealthStatusExResponseBodyRuleServerGroupsRuleServerGroup setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class DescribeHealthStatusExResponseBodyRuleServerGroups extends TeaModel {
        @NameInMap("RuleServerGroup")
        public java.util.List<DescribeHealthStatusExResponseBodyRuleServerGroupsRuleServerGroup> ruleServerGroup;

        public static DescribeHealthStatusExResponseBodyRuleServerGroups build(java.util.Map<String, ?> map) throws Exception {
            DescribeHealthStatusExResponseBodyRuleServerGroups self = new DescribeHealthStatusExResponseBodyRuleServerGroups();
            return TeaModel.build(map, self);
        }

        public DescribeHealthStatusExResponseBodyRuleServerGroups setRuleServerGroup(java.util.List<DescribeHealthStatusExResponseBodyRuleServerGroupsRuleServerGroup> ruleServerGroup) {
            this.ruleServerGroup = ruleServerGroup;
            return this;
        }
        public java.util.List<DescribeHealthStatusExResponseBodyRuleServerGroupsRuleServerGroup> getRuleServerGroup() {
            return this.ruleServerGroup;
        }

    }

}
