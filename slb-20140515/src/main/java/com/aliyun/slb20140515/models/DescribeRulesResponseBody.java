// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class DescribeRulesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Rules")
    public java.util.List<DescribeRulesResponseBodyRules> rules;

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

    public DescribeRulesResponseBody setRules(java.util.List<DescribeRulesResponseBodyRules> rules) {
        this.rules = rules;
        return this;
    }
    public java.util.List<DescribeRulesResponseBodyRules> getRules() {
        return this.rules;
    }

    public static class DescribeRulesResponseBodyRules extends TeaModel {
        @NameInMap("VServerGroupId")
        public String VServerGroupId;

        @NameInMap("HealthCheckHttpCode")
        public String healthCheckHttpCode;

        @NameInMap("Domain")
        public String domain;

        @NameInMap("Cookie")
        public String cookie;

        @NameInMap("Url")
        public String url;

        @NameInMap("HealthCheckInterval")
        public Integer healthCheckInterval;

        @NameInMap("HealthCheckURI")
        public String healthCheckURI;

        @NameInMap("RuleId")
        public String ruleId;

        @NameInMap("RuleName")
        public String ruleName;

        @NameInMap("StickySessionType")
        public String stickySessionType;

        @NameInMap("Scheduler")
        public String scheduler;

        @NameInMap("HealthCheckConnectPort")
        public Integer healthCheckConnectPort;

        @NameInMap("HealthCheckTimeout")
        public Integer healthCheckTimeout;

        @NameInMap("ListenerSync")
        public String listenerSync;

        @NameInMap("HealthyThreshold")
        public Integer healthyThreshold;

        @NameInMap("CookieTimeout")
        public Integer cookieTimeout;

        @NameInMap("HealthCheckDomain")
        public String healthCheckDomain;

        @NameInMap("UnhealthyThreshold")
        public Integer unhealthyThreshold;

        @NameInMap("StickySession")
        public String stickySession;

        @NameInMap("HealthCheck")
        public String healthCheck;

        public static DescribeRulesResponseBodyRules build(java.util.Map<String, ?> map) throws Exception {
            DescribeRulesResponseBodyRules self = new DescribeRulesResponseBodyRules();
            return TeaModel.build(map, self);
        }

        public DescribeRulesResponseBodyRules setVServerGroupId(String VServerGroupId) {
            this.VServerGroupId = VServerGroupId;
            return this;
        }
        public String getVServerGroupId() {
            return this.VServerGroupId;
        }

        public DescribeRulesResponseBodyRules setHealthCheckHttpCode(String healthCheckHttpCode) {
            this.healthCheckHttpCode = healthCheckHttpCode;
            return this;
        }
        public String getHealthCheckHttpCode() {
            return this.healthCheckHttpCode;
        }

        public DescribeRulesResponseBodyRules setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public DescribeRulesResponseBodyRules setCookie(String cookie) {
            this.cookie = cookie;
            return this;
        }
        public String getCookie() {
            return this.cookie;
        }

        public DescribeRulesResponseBodyRules setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

        public DescribeRulesResponseBodyRules setHealthCheckInterval(Integer healthCheckInterval) {
            this.healthCheckInterval = healthCheckInterval;
            return this;
        }
        public Integer getHealthCheckInterval() {
            return this.healthCheckInterval;
        }

        public DescribeRulesResponseBodyRules setHealthCheckURI(String healthCheckURI) {
            this.healthCheckURI = healthCheckURI;
            return this;
        }
        public String getHealthCheckURI() {
            return this.healthCheckURI;
        }

        public DescribeRulesResponseBodyRules setRuleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public String getRuleId() {
            return this.ruleId;
        }

        public DescribeRulesResponseBodyRules setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public DescribeRulesResponseBodyRules setStickySessionType(String stickySessionType) {
            this.stickySessionType = stickySessionType;
            return this;
        }
        public String getStickySessionType() {
            return this.stickySessionType;
        }

        public DescribeRulesResponseBodyRules setScheduler(String scheduler) {
            this.scheduler = scheduler;
            return this;
        }
        public String getScheduler() {
            return this.scheduler;
        }

        public DescribeRulesResponseBodyRules setHealthCheckConnectPort(Integer healthCheckConnectPort) {
            this.healthCheckConnectPort = healthCheckConnectPort;
            return this;
        }
        public Integer getHealthCheckConnectPort() {
            return this.healthCheckConnectPort;
        }

        public DescribeRulesResponseBodyRules setHealthCheckTimeout(Integer healthCheckTimeout) {
            this.healthCheckTimeout = healthCheckTimeout;
            return this;
        }
        public Integer getHealthCheckTimeout() {
            return this.healthCheckTimeout;
        }

        public DescribeRulesResponseBodyRules setListenerSync(String listenerSync) {
            this.listenerSync = listenerSync;
            return this;
        }
        public String getListenerSync() {
            return this.listenerSync;
        }

        public DescribeRulesResponseBodyRules setHealthyThreshold(Integer healthyThreshold) {
            this.healthyThreshold = healthyThreshold;
            return this;
        }
        public Integer getHealthyThreshold() {
            return this.healthyThreshold;
        }

        public DescribeRulesResponseBodyRules setCookieTimeout(Integer cookieTimeout) {
            this.cookieTimeout = cookieTimeout;
            return this;
        }
        public Integer getCookieTimeout() {
            return this.cookieTimeout;
        }

        public DescribeRulesResponseBodyRules setHealthCheckDomain(String healthCheckDomain) {
            this.healthCheckDomain = healthCheckDomain;
            return this;
        }
        public String getHealthCheckDomain() {
            return this.healthCheckDomain;
        }

        public DescribeRulesResponseBodyRules setUnhealthyThreshold(Integer unhealthyThreshold) {
            this.unhealthyThreshold = unhealthyThreshold;
            return this;
        }
        public Integer getUnhealthyThreshold() {
            return this.unhealthyThreshold;
        }

        public DescribeRulesResponseBodyRules setStickySession(String stickySession) {
            this.stickySession = stickySession;
            return this;
        }
        public String getStickySession() {
            return this.stickySession;
        }

        public DescribeRulesResponseBodyRules setHealthCheck(String healthCheck) {
            this.healthCheck = healthCheck;
            return this;
        }
        public String getHealthCheck() {
            return this.healthCheck;
        }

    }

}
