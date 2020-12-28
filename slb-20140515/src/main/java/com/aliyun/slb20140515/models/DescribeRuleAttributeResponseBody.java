// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class DescribeRuleAttributeResponseBody extends TeaModel {
    @NameInMap("Cookie")
    public String cookie;

    @NameInMap("CookieTimeout")
    public Integer cookieTimeout;

    @NameInMap("VServerGroupId")
    public String VServerGroupId;

    @NameInMap("ListenerPort")
    public String listenerPort;

    @NameInMap("HealthCheckInterval")
    public Integer healthCheckInterval;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("UnhealthyThreshold")
    public Integer unhealthyThreshold;

    @NameInMap("HealthCheckURI")
    public String healthCheckURI;

    @NameInMap("Scheduler")
    public String scheduler;

    @NameInMap("RuleId")
    public String ruleId;

    @NameInMap("HealthCheck")
    public String healthCheck;

    @NameInMap("LoadBalancerId")
    public String loadBalancerId;

    @NameInMap("HealthCheckTimeout")
    public Integer healthCheckTimeout;

    @NameInMap("Url")
    public String url;

    @NameInMap("StickySession")
    public String stickySession;

    @NameInMap("HealthCheckConnectPort")
    public Integer healthCheckConnectPort;

    @NameInMap("HealthyThreshold")
    public Integer healthyThreshold;

    @NameInMap("ListenerSync")
    public String listenerSync;

    @NameInMap("HealthCheckDomain")
    public String healthCheckDomain;

    @NameInMap("StickySessionType")
    public String stickySessionType;

    @NameInMap("Domain")
    public String domain;

    @NameInMap("HealthCheckHttpCode")
    public String healthCheckHttpCode;

    @NameInMap("RuleName")
    public String ruleName;

    public static DescribeRuleAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRuleAttributeResponseBody self = new DescribeRuleAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRuleAttributeResponseBody setCookie(String cookie) {
        this.cookie = cookie;
        return this;
    }
    public String getCookie() {
        return this.cookie;
    }

    public DescribeRuleAttributeResponseBody setCookieTimeout(Integer cookieTimeout) {
        this.cookieTimeout = cookieTimeout;
        return this;
    }
    public Integer getCookieTimeout() {
        return this.cookieTimeout;
    }

    public DescribeRuleAttributeResponseBody setVServerGroupId(String VServerGroupId) {
        this.VServerGroupId = VServerGroupId;
        return this;
    }
    public String getVServerGroupId() {
        return this.VServerGroupId;
    }

    public DescribeRuleAttributeResponseBody setListenerPort(String listenerPort) {
        this.listenerPort = listenerPort;
        return this;
    }
    public String getListenerPort() {
        return this.listenerPort;
    }

    public DescribeRuleAttributeResponseBody setHealthCheckInterval(Integer healthCheckInterval) {
        this.healthCheckInterval = healthCheckInterval;
        return this;
    }
    public Integer getHealthCheckInterval() {
        return this.healthCheckInterval;
    }

    public DescribeRuleAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRuleAttributeResponseBody setUnhealthyThreshold(Integer unhealthyThreshold) {
        this.unhealthyThreshold = unhealthyThreshold;
        return this;
    }
    public Integer getUnhealthyThreshold() {
        return this.unhealthyThreshold;
    }

    public DescribeRuleAttributeResponseBody setHealthCheckURI(String healthCheckURI) {
        this.healthCheckURI = healthCheckURI;
        return this;
    }
    public String getHealthCheckURI() {
        return this.healthCheckURI;
    }

    public DescribeRuleAttributeResponseBody setScheduler(String scheduler) {
        this.scheduler = scheduler;
        return this;
    }
    public String getScheduler() {
        return this.scheduler;
    }

    public DescribeRuleAttributeResponseBody setRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public String getRuleId() {
        return this.ruleId;
    }

    public DescribeRuleAttributeResponseBody setHealthCheck(String healthCheck) {
        this.healthCheck = healthCheck;
        return this;
    }
    public String getHealthCheck() {
        return this.healthCheck;
    }

    public DescribeRuleAttributeResponseBody setLoadBalancerId(String loadBalancerId) {
        this.loadBalancerId = loadBalancerId;
        return this;
    }
    public String getLoadBalancerId() {
        return this.loadBalancerId;
    }

    public DescribeRuleAttributeResponseBody setHealthCheckTimeout(Integer healthCheckTimeout) {
        this.healthCheckTimeout = healthCheckTimeout;
        return this;
    }
    public Integer getHealthCheckTimeout() {
        return this.healthCheckTimeout;
    }

    public DescribeRuleAttributeResponseBody setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

    public DescribeRuleAttributeResponseBody setStickySession(String stickySession) {
        this.stickySession = stickySession;
        return this;
    }
    public String getStickySession() {
        return this.stickySession;
    }

    public DescribeRuleAttributeResponseBody setHealthCheckConnectPort(Integer healthCheckConnectPort) {
        this.healthCheckConnectPort = healthCheckConnectPort;
        return this;
    }
    public Integer getHealthCheckConnectPort() {
        return this.healthCheckConnectPort;
    }

    public DescribeRuleAttributeResponseBody setHealthyThreshold(Integer healthyThreshold) {
        this.healthyThreshold = healthyThreshold;
        return this;
    }
    public Integer getHealthyThreshold() {
        return this.healthyThreshold;
    }

    public DescribeRuleAttributeResponseBody setListenerSync(String listenerSync) {
        this.listenerSync = listenerSync;
        return this;
    }
    public String getListenerSync() {
        return this.listenerSync;
    }

    public DescribeRuleAttributeResponseBody setHealthCheckDomain(String healthCheckDomain) {
        this.healthCheckDomain = healthCheckDomain;
        return this;
    }
    public String getHealthCheckDomain() {
        return this.healthCheckDomain;
    }

    public DescribeRuleAttributeResponseBody setStickySessionType(String stickySessionType) {
        this.stickySessionType = stickySessionType;
        return this;
    }
    public String getStickySessionType() {
        return this.stickySessionType;
    }

    public DescribeRuleAttributeResponseBody setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public DescribeRuleAttributeResponseBody setHealthCheckHttpCode(String healthCheckHttpCode) {
        this.healthCheckHttpCode = healthCheckHttpCode;
        return this;
    }
    public String getHealthCheckHttpCode() {
        return this.healthCheckHttpCode;
    }

    public DescribeRuleAttributeResponseBody setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

}
