// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class DescribeRulesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Rules")
    public DescribeRulesResponseBodyRules rules;

    public static DescribeRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRulesResponseBody self = new DescribeRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRulesResponseBody setRules(DescribeRulesResponseBodyRules rules) {
        this.rules = rules;
        return this;
    }
    public DescribeRulesResponseBodyRules getRules() {
        return this.rules;
    }

    public static class DescribeRulesResponseBodyRulesRule extends TeaModel {
        @NameInMap("Cookie")
        public String cookie;

        @NameInMap("CookieTimeout")
        public Integer cookieTimeout;

        @NameInMap("Domain")
        public String domain;

        @NameInMap("HealthCheck")
        public String healthCheck;

        @NameInMap("HealthCheckConnectPort")
        public Integer healthCheckConnectPort;

        @NameInMap("HealthCheckDomain")
        public String healthCheckDomain;

        @NameInMap("HealthCheckHttpCode")
        public String healthCheckHttpCode;

        @NameInMap("HealthCheckInterval")
        public Integer healthCheckInterval;

        @NameInMap("HealthCheckTimeout")
        public Integer healthCheckTimeout;

        @NameInMap("HealthCheckURI")
        public String healthCheckURI;

        @NameInMap("HealthyThreshold")
        public Integer healthyThreshold;

        @NameInMap("ListenerSync")
        public String listenerSync;

        @NameInMap("RuleId")
        public String ruleId;

        @NameInMap("RuleName")
        public String ruleName;

        @NameInMap("Scheduler")
        public String scheduler;

        @NameInMap("StickySession")
        public String stickySession;

        @NameInMap("StickySessionType")
        public String stickySessionType;

        @NameInMap("UnhealthyThreshold")
        public Integer unhealthyThreshold;

        @NameInMap("Url")
        public String url;

        @NameInMap("VServerGroupId")
        public String VServerGroupId;

        public static DescribeRulesResponseBodyRulesRule build(java.util.Map<String, ?> map) throws Exception {
            DescribeRulesResponseBodyRulesRule self = new DescribeRulesResponseBodyRulesRule();
            return TeaModel.build(map, self);
        }

        public DescribeRulesResponseBodyRulesRule setCookie(String cookie) {
            this.cookie = cookie;
            return this;
        }
        public String getCookie() {
            return this.cookie;
        }

        public DescribeRulesResponseBodyRulesRule setCookieTimeout(Integer cookieTimeout) {
            this.cookieTimeout = cookieTimeout;
            return this;
        }
        public Integer getCookieTimeout() {
            return this.cookieTimeout;
        }

        public DescribeRulesResponseBodyRulesRule setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public DescribeRulesResponseBodyRulesRule setHealthCheck(String healthCheck) {
            this.healthCheck = healthCheck;
            return this;
        }
        public String getHealthCheck() {
            return this.healthCheck;
        }

        public DescribeRulesResponseBodyRulesRule setHealthCheckConnectPort(Integer healthCheckConnectPort) {
            this.healthCheckConnectPort = healthCheckConnectPort;
            return this;
        }
        public Integer getHealthCheckConnectPort() {
            return this.healthCheckConnectPort;
        }

        public DescribeRulesResponseBodyRulesRule setHealthCheckDomain(String healthCheckDomain) {
            this.healthCheckDomain = healthCheckDomain;
            return this;
        }
        public String getHealthCheckDomain() {
            return this.healthCheckDomain;
        }

        public DescribeRulesResponseBodyRulesRule setHealthCheckHttpCode(String healthCheckHttpCode) {
            this.healthCheckHttpCode = healthCheckHttpCode;
            return this;
        }
        public String getHealthCheckHttpCode() {
            return this.healthCheckHttpCode;
        }

        public DescribeRulesResponseBodyRulesRule setHealthCheckInterval(Integer healthCheckInterval) {
            this.healthCheckInterval = healthCheckInterval;
            return this;
        }
        public Integer getHealthCheckInterval() {
            return this.healthCheckInterval;
        }

        public DescribeRulesResponseBodyRulesRule setHealthCheckTimeout(Integer healthCheckTimeout) {
            this.healthCheckTimeout = healthCheckTimeout;
            return this;
        }
        public Integer getHealthCheckTimeout() {
            return this.healthCheckTimeout;
        }

        public DescribeRulesResponseBodyRulesRule setHealthCheckURI(String healthCheckURI) {
            this.healthCheckURI = healthCheckURI;
            return this;
        }
        public String getHealthCheckURI() {
            return this.healthCheckURI;
        }

        public DescribeRulesResponseBodyRulesRule setHealthyThreshold(Integer healthyThreshold) {
            this.healthyThreshold = healthyThreshold;
            return this;
        }
        public Integer getHealthyThreshold() {
            return this.healthyThreshold;
        }

        public DescribeRulesResponseBodyRulesRule setListenerSync(String listenerSync) {
            this.listenerSync = listenerSync;
            return this;
        }
        public String getListenerSync() {
            return this.listenerSync;
        }

        public DescribeRulesResponseBodyRulesRule setRuleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public String getRuleId() {
            return this.ruleId;
        }

        public DescribeRulesResponseBodyRulesRule setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public DescribeRulesResponseBodyRulesRule setScheduler(String scheduler) {
            this.scheduler = scheduler;
            return this;
        }
        public String getScheduler() {
            return this.scheduler;
        }

        public DescribeRulesResponseBodyRulesRule setStickySession(String stickySession) {
            this.stickySession = stickySession;
            return this;
        }
        public String getStickySession() {
            return this.stickySession;
        }

        public DescribeRulesResponseBodyRulesRule setStickySessionType(String stickySessionType) {
            this.stickySessionType = stickySessionType;
            return this;
        }
        public String getStickySessionType() {
            return this.stickySessionType;
        }

        public DescribeRulesResponseBodyRulesRule setUnhealthyThreshold(Integer unhealthyThreshold) {
            this.unhealthyThreshold = unhealthyThreshold;
            return this;
        }
        public Integer getUnhealthyThreshold() {
            return this.unhealthyThreshold;
        }

        public DescribeRulesResponseBodyRulesRule setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

        public DescribeRulesResponseBodyRulesRule setVServerGroupId(String VServerGroupId) {
            this.VServerGroupId = VServerGroupId;
            return this;
        }
        public String getVServerGroupId() {
            return this.VServerGroupId;
        }

    }

    public static class DescribeRulesResponseBodyRules extends TeaModel {
        @NameInMap("Rule")
        public java.util.List<DescribeRulesResponseBodyRulesRule> rule;

        public static DescribeRulesResponseBodyRules build(java.util.Map<String, ?> map) throws Exception {
            DescribeRulesResponseBodyRules self = new DescribeRulesResponseBodyRules();
            return TeaModel.build(map, self);
        }

        public DescribeRulesResponseBodyRules setRule(java.util.List<DescribeRulesResponseBodyRulesRule> rule) {
            this.rule = rule;
            return this;
        }
        public java.util.List<DescribeRulesResponseBodyRulesRule> getRule() {
            return this.rule;
        }

    }

}
