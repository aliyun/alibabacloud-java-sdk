// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class DescribeRulesResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The list of forwarding rules.</p>
     */
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
        /**
         * <p>The cookie that is configured on the backend server.</p>
         * <br>
         * <p>The value must be 1 to 200 characters in length, and can contain only ASCII letters and digits. It cannot contain commas (,), semicolons (;), or spaces. It cannot start with a dollar sign ($).</p>
         * <br>
         * <p>>  If you set the **StickySession** parameter to **on** and the **StickySessionType** parameter to **server**, this parameter is required.</p>
         */
        @NameInMap("Cookie")
        public String cookie;

        /**
         * <p>The timeout period of a cookie. Valid values: **1 to 86400**. Unit: seconds.</p>
         * <br>
         * <p>>  If you set the **StickySession** parameter to **on** and the **StickySessionType** parameter to **insert**, this parameter is required.</p>
         */
        @NameInMap("CookieTimeout")
        public Integer cookieTimeout;

        /**
         * <p>The requested domain name specified in the forwarding rule.</p>
         */
        @NameInMap("Domain")
        public String domain;

        /**
         * <p>Indicates whether health checks are enabled.</p>
         * <br>
         * <p>Valid values: **on** and **off**.</p>
         * <br>
         * <p>>  If you set the **ListenerSync** parameter to **off**, this parameter is required. If you set the parameter to **on**, the configuration of the listener is used.</p>
         */
        @NameInMap("HealthCheck")
        public String healthCheck;

        /**
         * <p>The port of the backend server that is used for health check.</p>
         * <br>
         * <p>Valid values: **1 to 65535**.</p>
         * <br>
         * <p>>  If you set the **HealthCheck** parameter to **on**, this parameter is required. If you left this parameter empty and the **HealthCheck** parameter is set to **on**, the backend port configuration of the listener is used by default.</p>
         */
        @NameInMap("HealthCheckConnectPort")
        public Integer healthCheckConnectPort;

        /**
         * <p>The domain name that is used for health checks. Valid values:</p>
         * <br>
         * <p>*   **$\_ip**: The private IP address of the backend server.</p>
         * <br>
         * <p>    If you do not set this parameter or set the parameter to $\_ip, the SLB instance uses the private IP address of each backend server as the domain name for health checks.</p>
         * <br>
         * <p>*   **domain**: The domain name must be 1 to 80 characters in length. The domain name can contain only letters, digits, periods (.),and hyphens (-).</p>
         * <br>
         * <p>>  If you set the **HealthCheck** parameter to **on**, this parameter is required.</p>
         */
        @NameInMap("HealthCheckDomain")
        public String healthCheckDomain;

        /**
         * <p>The HTTP status code that indicates a successful health check. Multiple HTTP status codes are separated by commas (,). Default value: **http\_2xx**.</p>
         * <br>
         * <p>Valid values: **http\_2xx**, **http\_3xx**, **http\_4xx**, and **http\_5xx**.</p>
         * <br>
         * <p>>  If you set the **HealthCheck** parameter to **on**, this parameter is required.</p>
         */
        @NameInMap("HealthCheckHttpCode")
        public String healthCheckHttpCode;

        /**
         * <p>The time interval between two consecutive health checks.</p>
         * <br>
         * <p>Valid values: **1 to 50**. Unit: seconds.</p>
         * <br>
         * <p>>  If you set the **HealthCheck** parameter to **on**, this parameter is required.</p>
         */
        @NameInMap("HealthCheckInterval")
        public Integer healthCheckInterval;

        /**
         * <p>The timeout period for a health check response. If the backend Elastic Compute Service (ECS) instance does not send an expected response within the specified period of time, the health check fails.</p>
         * <br>
         * <p>Valid values: **1 to 300**. Unit: seconds.</p>
         * <br>
         * <p>>  If the value of the **HealthCHeckTimeout** parameter is smaller than that of the **HealthCheckInterval** parameter, the value of the **HealthCHeckTimeout** parameter is ignored and the value of the **HealthCheckInterval** parameter is regarded as the waiting period. If you set the **HealthCheck** parameter to **on**, this parameter is required.</p>
         */
        @NameInMap("HealthCheckTimeout")
        public Integer healthCheckTimeout;

        /**
         * <p>The URI that is used for health checks.</p>
         * <br>
         * <p>>  If you set the **HealthCheck** parameter to **on**, this parameter is required.</p>
         */
        @NameInMap("HealthCheckURI")
        public String healthCheckURI;

        /**
         * <p>Specifies the number of successful health checks that must be consecutively performed before a backend server can be declared healthy (from **fail** to **success**).</p>
         * <br>
         * <p>Valid values: **2 to 10**.</p>
         * <br>
         * <p>>  If you set the **HealthCheck** parameter to **on**, this parameter is required.</p>
         */
        @NameInMap("HealthyThreshold")
        public Integer healthyThreshold;

        /**
         * <p>Indicates whether the forwarding rule uses the scheduling algorithm, session persistence, and health check configurations of the listener.</p>
         * <br>
         * <p>Valid values: **on** and **off**.</p>
         * <br>
         * <p>*   **off**: does not use the configurations of the listener. You can customize health check and session persistence configurations for the forwarding rule.</p>
         * <p>*   **on**: uses the configurations of the listener.</p>
         */
        @NameInMap("ListenerSync")
        public String listenerSync;

        /**
         * <p>The ID of the forwarding rule.</p>
         */
        @NameInMap("RuleId")
        public String ruleId;

        /**
         * <p>The name of the forwarding rule. The name must be 1 to 80 characters in length, and can contain only letters, digits, hyphens (-), forward slashes (/), periods (.),and underscores (\_).</p>
         * <br>
         * <p>>  The name of each forwarding rule must be unique within a listener.</p>
         */
        @NameInMap("RuleName")
        public String ruleName;

        /**
         * <p>The scheduling algorithm. Valid values:</p>
         * <br>
         * <p>*   **wrr** (default): Backend servers that have higher weights receive more requests than backend servers that have lower weights.</p>
         * <p>*   **rr**: Requests are distributed to backend servers in sequence.</p>
         * <br>
         * <p>>  If you set the **ListenerSync** parameter to **off**, this parameter is required. If you set the parameter to **on**, the configuration of the listener is used.</p>
         */
        @NameInMap("Scheduler")
        public String scheduler;

        /**
         * <p>Specifies whether to enable session persistence.</p>
         * <br>
         * <p>Valid values: **on** and **off**.</p>
         * <br>
         * <p>>  If you set the **ListenerSync** parameter to **off**, this parameter is required. If you set the parameter to **on**, the configuration of the listener is used.</p>
         */
        @NameInMap("StickySession")
        public String stickySession;

        /**
         * <p>The method that is used to handle a cookie. Valid values:</p>
         * <br>
         * <p>*   **insert**: inserts a cookie into the response. SLB inserts a cookie (SERVERID) into the first HTTP or HTTPS response packet that is sent to a client. The next request from the client will contain this cookie, and the listener will distribute this request to the recorded backend server.</p>
         * <p>*   **server**: rewrites a cookie. When SLB detects a user-defined cookie, SLB overwrites the original cookie with the user-defined cookie. The next request from the client contains the user-defined cookie, and the listener distributes the request to the recorded backend server.</p>
         * <br>
         * <p>>  If you set the **StickySession** parameter to **on**, this parameter is required.</p>
         */
        @NameInMap("StickySessionType")
        public String stickySessionType;

        /**
         * <p>Specifies the number of times that a healthy backend server must consecutively fail health checks before it is declared unhealthy (from **success** to **fail**).</p>
         * <br>
         * <p>Valid values: **2 to 10**</p>
         * <br>
         * <p>>  If you set the **HealthCheck** parameter to **on**, this parameter is required.</p>
         */
        @NameInMap("UnhealthyThreshold")
        public Integer unhealthyThreshold;

        /**
         * <p>The requested path specified in the forwarding rule.</p>
         */
        @NameInMap("Url")
        public String url;

        /**
         * <p>The ID of the destination vServer group specified in the forwarding rule.</p>
         */
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
