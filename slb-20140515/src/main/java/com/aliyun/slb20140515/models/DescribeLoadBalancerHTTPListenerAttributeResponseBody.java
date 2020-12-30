// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class DescribeLoadBalancerHTTPListenerAttributeResponseBody extends TeaModel {
    @NameInMap("CookieTimeout")
    public Integer cookieTimeout;

    @NameInMap("VServerGroupId")
    public String VServerGroupId;

    @NameInMap("Description")
    public String description;

    @NameInMap("UnhealthyThreshold")
    public Integer unhealthyThreshold;

    @NameInMap("HealthCheckURI")
    public String healthCheckURI;

    @NameInMap("Scheduler")
    public String scheduler;

    @NameInMap("HealthCheck")
    public String healthCheck;

    @NameInMap("IdleTimeout")
    public Integer idleTimeout;

    @NameInMap("BackendServerPort")
    public Integer backendServerPort;

    @NameInMap("XForwardedFor_SLBID")
    public String XForwardedFor_SLBID;

    @NameInMap("HealthCheckConnectPort")
    public Integer healthCheckConnectPort;

    @NameInMap("Bandwidth")
    public Integer bandwidth;

    @NameInMap("SecurityStatus")
    public String securityStatus;

    @NameInMap("Gzip")
    public String gzip;

    @NameInMap("StickySessionType")
    public String stickySessionType;

    @NameInMap("XForwardedFor_SLBIP")
    public String XForwardedFor_SLBIP;

    @NameInMap("HealthCheckHttpCode")
    public String healthCheckHttpCode;

    @NameInMap("Status")
    public String status;

    @NameInMap("Cookie")
    public String cookie;

    @NameInMap("RequestTimeout")
    public Integer requestTimeout;

    @NameInMap("ListenerPort")
    public Integer listenerPort;

    @NameInMap("HealthCheckInterval")
    public Integer healthCheckInterval;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("AclId")
    public String aclId;

    @NameInMap("HealthCheckTimeout")
    public Integer healthCheckTimeout;

    @NameInMap("Rules")
    public DescribeLoadBalancerHTTPListenerAttributeResponseBodyRules rules;

    @NameInMap("ListenerForward")
    public String listenerForward;

    @NameInMap("StickySession")
    public String stickySession;

    @NameInMap("AclStatus")
    public String aclStatus;

    @NameInMap("ForwardPort")
    public Integer forwardPort;

    @NameInMap("HealthyThreshold")
    public Integer healthyThreshold;

    @NameInMap("XForwardedFor")
    public String XForwardedFor;

    @NameInMap("HealthCheckDomain")
    public String healthCheckDomain;

    @NameInMap("AclType")
    public String aclType;

    @NameInMap("XForwardedFor_proto")
    public String XForwardedFor_proto;

    public static DescribeLoadBalancerHTTPListenerAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLoadBalancerHTTPListenerAttributeResponseBody self = new DescribeLoadBalancerHTTPListenerAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLoadBalancerHTTPListenerAttributeResponseBody setCookieTimeout(Integer cookieTimeout) {
        this.cookieTimeout = cookieTimeout;
        return this;
    }
    public Integer getCookieTimeout() {
        return this.cookieTimeout;
    }

    public DescribeLoadBalancerHTTPListenerAttributeResponseBody setVServerGroupId(String VServerGroupId) {
        this.VServerGroupId = VServerGroupId;
        return this;
    }
    public String getVServerGroupId() {
        return this.VServerGroupId;
    }

    public DescribeLoadBalancerHTTPListenerAttributeResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DescribeLoadBalancerHTTPListenerAttributeResponseBody setUnhealthyThreshold(Integer unhealthyThreshold) {
        this.unhealthyThreshold = unhealthyThreshold;
        return this;
    }
    public Integer getUnhealthyThreshold() {
        return this.unhealthyThreshold;
    }

    public DescribeLoadBalancerHTTPListenerAttributeResponseBody setHealthCheckURI(String healthCheckURI) {
        this.healthCheckURI = healthCheckURI;
        return this;
    }
    public String getHealthCheckURI() {
        return this.healthCheckURI;
    }

    public DescribeLoadBalancerHTTPListenerAttributeResponseBody setScheduler(String scheduler) {
        this.scheduler = scheduler;
        return this;
    }
    public String getScheduler() {
        return this.scheduler;
    }

    public DescribeLoadBalancerHTTPListenerAttributeResponseBody setHealthCheck(String healthCheck) {
        this.healthCheck = healthCheck;
        return this;
    }
    public String getHealthCheck() {
        return this.healthCheck;
    }

    public DescribeLoadBalancerHTTPListenerAttributeResponseBody setIdleTimeout(Integer idleTimeout) {
        this.idleTimeout = idleTimeout;
        return this;
    }
    public Integer getIdleTimeout() {
        return this.idleTimeout;
    }

    public DescribeLoadBalancerHTTPListenerAttributeResponseBody setBackendServerPort(Integer backendServerPort) {
        this.backendServerPort = backendServerPort;
        return this;
    }
    public Integer getBackendServerPort() {
        return this.backendServerPort;
    }

    public DescribeLoadBalancerHTTPListenerAttributeResponseBody setXForwardedFor_SLBID(String XForwardedFor_SLBID) {
        this.XForwardedFor_SLBID = XForwardedFor_SLBID;
        return this;
    }
    public String getXForwardedFor_SLBID() {
        return this.XForwardedFor_SLBID;
    }

    public DescribeLoadBalancerHTTPListenerAttributeResponseBody setHealthCheckConnectPort(Integer healthCheckConnectPort) {
        this.healthCheckConnectPort = healthCheckConnectPort;
        return this;
    }
    public Integer getHealthCheckConnectPort() {
        return this.healthCheckConnectPort;
    }

    public DescribeLoadBalancerHTTPListenerAttributeResponseBody setBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }
    public Integer getBandwidth() {
        return this.bandwidth;
    }

    public DescribeLoadBalancerHTTPListenerAttributeResponseBody setSecurityStatus(String securityStatus) {
        this.securityStatus = securityStatus;
        return this;
    }
    public String getSecurityStatus() {
        return this.securityStatus;
    }

    public DescribeLoadBalancerHTTPListenerAttributeResponseBody setGzip(String gzip) {
        this.gzip = gzip;
        return this;
    }
    public String getGzip() {
        return this.gzip;
    }

    public DescribeLoadBalancerHTTPListenerAttributeResponseBody setStickySessionType(String stickySessionType) {
        this.stickySessionType = stickySessionType;
        return this;
    }
    public String getStickySessionType() {
        return this.stickySessionType;
    }

    public DescribeLoadBalancerHTTPListenerAttributeResponseBody setXForwardedFor_SLBIP(String XForwardedFor_SLBIP) {
        this.XForwardedFor_SLBIP = XForwardedFor_SLBIP;
        return this;
    }
    public String getXForwardedFor_SLBIP() {
        return this.XForwardedFor_SLBIP;
    }

    public DescribeLoadBalancerHTTPListenerAttributeResponseBody setHealthCheckHttpCode(String healthCheckHttpCode) {
        this.healthCheckHttpCode = healthCheckHttpCode;
        return this;
    }
    public String getHealthCheckHttpCode() {
        return this.healthCheckHttpCode;
    }

    public DescribeLoadBalancerHTTPListenerAttributeResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeLoadBalancerHTTPListenerAttributeResponseBody setCookie(String cookie) {
        this.cookie = cookie;
        return this;
    }
    public String getCookie() {
        return this.cookie;
    }

    public DescribeLoadBalancerHTTPListenerAttributeResponseBody setRequestTimeout(Integer requestTimeout) {
        this.requestTimeout = requestTimeout;
        return this;
    }
    public Integer getRequestTimeout() {
        return this.requestTimeout;
    }

    public DescribeLoadBalancerHTTPListenerAttributeResponseBody setListenerPort(Integer listenerPort) {
        this.listenerPort = listenerPort;
        return this;
    }
    public Integer getListenerPort() {
        return this.listenerPort;
    }

    public DescribeLoadBalancerHTTPListenerAttributeResponseBody setHealthCheckInterval(Integer healthCheckInterval) {
        this.healthCheckInterval = healthCheckInterval;
        return this;
    }
    public Integer getHealthCheckInterval() {
        return this.healthCheckInterval;
    }

    public DescribeLoadBalancerHTTPListenerAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLoadBalancerHTTPListenerAttributeResponseBody setAclId(String aclId) {
        this.aclId = aclId;
        return this;
    }
    public String getAclId() {
        return this.aclId;
    }

    public DescribeLoadBalancerHTTPListenerAttributeResponseBody setHealthCheckTimeout(Integer healthCheckTimeout) {
        this.healthCheckTimeout = healthCheckTimeout;
        return this;
    }
    public Integer getHealthCheckTimeout() {
        return this.healthCheckTimeout;
    }

    public DescribeLoadBalancerHTTPListenerAttributeResponseBody setRules(DescribeLoadBalancerHTTPListenerAttributeResponseBodyRules rules) {
        this.rules = rules;
        return this;
    }
    public DescribeLoadBalancerHTTPListenerAttributeResponseBodyRules getRules() {
        return this.rules;
    }

    public DescribeLoadBalancerHTTPListenerAttributeResponseBody setListenerForward(String listenerForward) {
        this.listenerForward = listenerForward;
        return this;
    }
    public String getListenerForward() {
        return this.listenerForward;
    }

    public DescribeLoadBalancerHTTPListenerAttributeResponseBody setStickySession(String stickySession) {
        this.stickySession = stickySession;
        return this;
    }
    public String getStickySession() {
        return this.stickySession;
    }

    public DescribeLoadBalancerHTTPListenerAttributeResponseBody setAclStatus(String aclStatus) {
        this.aclStatus = aclStatus;
        return this;
    }
    public String getAclStatus() {
        return this.aclStatus;
    }

    public DescribeLoadBalancerHTTPListenerAttributeResponseBody setForwardPort(Integer forwardPort) {
        this.forwardPort = forwardPort;
        return this;
    }
    public Integer getForwardPort() {
        return this.forwardPort;
    }

    public DescribeLoadBalancerHTTPListenerAttributeResponseBody setHealthyThreshold(Integer healthyThreshold) {
        this.healthyThreshold = healthyThreshold;
        return this;
    }
    public Integer getHealthyThreshold() {
        return this.healthyThreshold;
    }

    public DescribeLoadBalancerHTTPListenerAttributeResponseBody setXForwardedFor(String XForwardedFor) {
        this.XForwardedFor = XForwardedFor;
        return this;
    }
    public String getXForwardedFor() {
        return this.XForwardedFor;
    }

    public DescribeLoadBalancerHTTPListenerAttributeResponseBody setHealthCheckDomain(String healthCheckDomain) {
        this.healthCheckDomain = healthCheckDomain;
        return this;
    }
    public String getHealthCheckDomain() {
        return this.healthCheckDomain;
    }

    public DescribeLoadBalancerHTTPListenerAttributeResponseBody setAclType(String aclType) {
        this.aclType = aclType;
        return this;
    }
    public String getAclType() {
        return this.aclType;
    }

    public DescribeLoadBalancerHTTPListenerAttributeResponseBody setXForwardedFor_proto(String XForwardedFor_proto) {
        this.XForwardedFor_proto = XForwardedFor_proto;
        return this;
    }
    public String getXForwardedFor_proto() {
        return this.XForwardedFor_proto;
    }

    public static class DescribeLoadBalancerHTTPListenerAttributeResponseBodyRulesRule extends TeaModel {
        @NameInMap("VServerGroupId")
        public String VServerGroupId;

        @NameInMap("Domain")
        public String domain;

        @NameInMap("Url")
        public String url;

        @NameInMap("RuleName")
        public String ruleName;

        @NameInMap("RuleId")
        public String ruleId;

        public static DescribeLoadBalancerHTTPListenerAttributeResponseBodyRulesRule build(java.util.Map<String, ?> map) throws Exception {
            DescribeLoadBalancerHTTPListenerAttributeResponseBodyRulesRule self = new DescribeLoadBalancerHTTPListenerAttributeResponseBodyRulesRule();
            return TeaModel.build(map, self);
        }

        public DescribeLoadBalancerHTTPListenerAttributeResponseBodyRulesRule setVServerGroupId(String VServerGroupId) {
            this.VServerGroupId = VServerGroupId;
            return this;
        }
        public String getVServerGroupId() {
            return this.VServerGroupId;
        }

        public DescribeLoadBalancerHTTPListenerAttributeResponseBodyRulesRule setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public DescribeLoadBalancerHTTPListenerAttributeResponseBodyRulesRule setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

        public DescribeLoadBalancerHTTPListenerAttributeResponseBodyRulesRule setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public DescribeLoadBalancerHTTPListenerAttributeResponseBodyRulesRule setRuleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public String getRuleId() {
            return this.ruleId;
        }

    }

    public static class DescribeLoadBalancerHTTPListenerAttributeResponseBodyRules extends TeaModel {
        @NameInMap("Rule")
        public java.util.List<DescribeLoadBalancerHTTPListenerAttributeResponseBodyRulesRule> rule;

        public static DescribeLoadBalancerHTTPListenerAttributeResponseBodyRules build(java.util.Map<String, ?> map) throws Exception {
            DescribeLoadBalancerHTTPListenerAttributeResponseBodyRules self = new DescribeLoadBalancerHTTPListenerAttributeResponseBodyRules();
            return TeaModel.build(map, self);
        }

        public DescribeLoadBalancerHTTPListenerAttributeResponseBodyRules setRule(java.util.List<DescribeLoadBalancerHTTPListenerAttributeResponseBodyRulesRule> rule) {
            this.rule = rule;
            return this;
        }
        public java.util.List<DescribeLoadBalancerHTTPListenerAttributeResponseBodyRulesRule> getRule() {
            return this.rule;
        }

    }

}
