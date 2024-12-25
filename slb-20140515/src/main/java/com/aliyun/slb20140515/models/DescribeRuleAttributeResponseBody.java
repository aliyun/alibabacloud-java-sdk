// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class DescribeRuleAttributeResponseBody extends TeaModel {
    /**
     * <p>The cookie to be configured on the backend server.</p>
     * <p>The cookie must be 1 to 200 characters in length and can contain ASCII letters and digits. It cannot contain commas (,), semicolons (;), or whitespace characters. It cannot start with a dollar sign ($).</p>
     * <p>If you set the <strong>StickySession</strong> parameter to <strong>on</strong> and the <strong>StickySessionType</strong> parameter to <strong>server</strong>, this parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>wwe</p>
     */
    @NameInMap("Cookie")
    public String cookie;

    /**
     * <p>The timeout period of a cookie.</p>
     * <p>Valid values: <strong>1 to 86400</strong>. Unit: seconds.</p>
     * <blockquote>
     * <p> If you set the <strong>StickySession</strong> parameter to <strong>on</strong> and the <strong>StickySessionType</strong> parameter to <strong>insert</strong>, this parameter is required.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>12</p>
     */
    @NameInMap("CookieTimeout")
    public Integer cookieTimeout;

    /**
     * <p>The domain name that is configured in the forwarding rule.</p>
     * 
     * <strong>example:</strong>
     * <p>test.com</p>
     */
    @NameInMap("Domain")
    public String domain;

    /**
     * <p>Specifies whether to enable health checks.</p>
     * <p>Valid values: <strong>on</strong> and <strong>off</strong>.</p>
     * <blockquote>
     * <p> If you set the <strong>ListenerSync</strong> parameter to <strong>off</strong>, this parameter is required. If you set the parameter to <strong>on</strong>, the configuration of the listener is used.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>off</p>
     */
    @NameInMap("HealthCheck")
    public String healthCheck;

    /**
     * <p>The backend port that is used for health checks.</p>
     * <p>Valid values: <strong>1</strong> to <strong>65535</strong>.</p>
     * <blockquote>
     * <p> If you set the <strong>HealthCheck</strong> parameter to <strong>on</strong>, this parameter is required. If this parameter is empty but <strong>HealthCheck</strong> is set to <strong>on</strong>, the listener port is used for health checks.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>23</p>
     */
    @NameInMap("HealthCheckConnectPort")
    public Integer healthCheckConnectPort;

    /**
     * <p>The domain name that is used for health checks. Valid values:</p>
     * <ul>
     * <li><strong>$_ip</strong>: The private IP address of the backend server. If the $_ip parameter is set or the HealthCheckDomain parameter is not set, SLB uses the private IP addresses of backend servers as the domain names for health checks.</li>
     * <li><strong>domain</strong>: The domain name must be 1 to 80 characters in length. It can contain only letters, digits, periods (.),and hyphens (-).</li>
     * </ul>
     * <blockquote>
     * <p> If you set the <strong>HealthCheck</strong> parameter to <strong>on</strong>, this parameter is required.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p><a href="http://www.example.com">www.example.com</a></p>
     */
    @NameInMap("HealthCheckDomain")
    public String healthCheckDomain;

    /**
     * <p>The HTTP status code that indicates a successful health check. Separate multiple HTTP status codes with commas (,). Default value: <strong>http_2xx</strong>.</p>
     * <p>Valid values: <strong>http_2xx</strong>, <strong>http_3xx</strong>, <strong>http_4xx</strong>, and <strong>http_5xx</strong>.</p>
     * <blockquote>
     * <p> If you set the <strong>HealthCheck</strong> parameter to <strong>on</strong>, this parameter is required.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>http_3xx</p>
     */
    @NameInMap("HealthCheckHttpCode")
    public String healthCheckHttpCode;

    /**
     * <p>The time interval between two consecutive health checks.</p>
     * <p>Valid values: <strong>1</strong> to <strong>50</strong>. Unit: seconds.</p>
     * <blockquote>
     * <p> If you set the <strong>HealthCheck</strong> parameter to <strong>on</strong>, this parameter is required.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>34</p>
     */
    @NameInMap("HealthCheckInterval")
    public Integer healthCheckInterval;

    /**
     * <p>The timeout period of a health check response. If a backend ECS instance does not respond within the specified timeout period, the ECS instance fails the health check.</p>
     * <p>Valid values: <strong>1</strong> to <strong>300</strong>. Unit: seconds.</p>
     * <blockquote>
     * <p> If you set the <strong>HealthCheck</strong> parameter to <strong>on</strong>, this parameter is required.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>34</p>
     */
    @NameInMap("HealthCheckTimeout")
    public Integer healthCheckTimeout;

    /**
     * <p>The URI that is used for health checks.</p>
     * <blockquote>
     * <p> If you set the <strong>HealthCheck</strong> parameter to <strong>on</strong>, this parameter is required.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>10.21.22.1</p>
     */
    @NameInMap("HealthCheckURI")
    public String healthCheckURI;

    /**
     * <p>The number of consecutive successful health checks that must occur before an unhealthy backend server is declared healthy. In this case, the health check state is changed from <strong>fail</strong> to <strong>success</strong>.</p>
     * <p>Valid values: <strong>2</strong> to <strong>10</strong>.</p>
     * <blockquote>
     * <p> If you set the <strong>HealthCheck</strong> parameter to <strong>on</strong>, this parameter is required.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("HealthyThreshold")
    public Integer healthyThreshold;

    /**
     * <p>The listener port that is used by the SLB instance.</p>
     * 
     * <strong>example:</strong>
     * <p>90</p>
     */
    @NameInMap("ListenerPort")
    public String listenerPort;

    /**
     * <p>Indicates whether the forwarding rule uses the scheduling algorithm, session persistence, and health check configurations of the listener.</p>
     * <p>Valid values: <strong>on</strong> and <strong>off</strong>.</p>
     * <ul>
     * <li><strong>off</strong>: does not use the configurations of the listener. You can customize health check and session persistence configurations for the forwarding rule.</li>
     * <li><strong>on</strong>: uses the configurations of the listener.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>off</p>
     */
    @NameInMap("ListenerSync")
    public String listenerSync;

    /**
     * <p>The ID of the SLB instance.</p>
     * 
     * <strong>example:</strong>
     * <p>lb-bp1ca0zt07t934wxe****</p>
     */
    @NameInMap("LoadBalancerId")
    public String loadBalancerId;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>9DEC9C28-AB05-4DDF-9A78-6B08EC9CE18C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the forwarding rule.</p>
     * 
     * <strong>example:</strong>
     * <p>rule-hfgnd*****</p>
     */
    @NameInMap("RuleId")
    public String ruleId;

    /**
     * <p>The name of the forwarding rule.</p>
     * 
     * <strong>example:</strong>
     * <p>Rule1</p>
     */
    @NameInMap("RuleName")
    public String ruleName;

    /**
     * <p>The scheduling algorithm. Valid values:</p>
     * <ul>
     * <li><strong>wrr</strong> (default): Backend servers that have higher weights receive more requests than backend servers that have lower weights.</li>
     * <li><strong>rr</strong>: Requests are distributed to backend servers in sequence.</li>
     * </ul>
     * <blockquote>
     * <p> If you set the <strong>ListenerSync</strong> parameter to <strong>off</strong>, this parameter is required. If you set the parameter to <strong>on</strong>, the configuration of the listener is used.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>wrr</p>
     */
    @NameInMap("Scheduler")
    public String scheduler;

    /**
     * <p>Indicates whether session persistence is enabled.</p>
     * <p>Valid values: <strong>on</strong> and <strong>off</strong>.</p>
     * <blockquote>
     * <p> If you set the <strong>ListenerSync</strong> parameter to <strong>off</strong>, this parameter is required. If you set the parameter to <strong>on</strong>, the configuration of the listener is used.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>off</p>
     */
    @NameInMap("StickySession")
    public String stickySession;

    /**
     * <p>The method that is used to handle a cookie. Valid values:</p>
     * <ul>
     * <li><strong>insert</strong>: inserts a cookie into the response. SLB inserts a cookie (SERVERID) into the first HTTP or HTTPS response packet that is sent to a client. The next request from the client will contain this cookie, and the listener will distribute this request to the recorded backend server.</li>
     * <li><strong>server</strong>: rewrites a cookie. When SLB detects a user-defined cookie, SLB overwrites the original cookie with the user-defined cookie. The next request from the client contains the user-defined cookie, and the listener distributes the request to the recorded backend server.</li>
     * </ul>
     * <blockquote>
     * <p> If you set the <strong>StickySession</strong> parameter to <strong>on</strong>, this parameter is required.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>insert</p>
     */
    @NameInMap("StickySessionType")
    public String stickySessionType;

    /**
     * <p>The number of consecutive failed health checks that must occur before a healthy backend server is declared unhealthy. In this case, the health check state is changed from <strong>success</strong> to <strong>fail</strong>.</p>
     * <p>Valid values: <strong>2</strong> to <strong>10</strong>.</p>
     * <blockquote>
     * <p> If you set the <strong>HealthCheck</strong> parameter to <strong>on</strong>, this parameter is required.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("UnhealthyThreshold")
    public Integer unhealthyThreshold;

    /**
     * <p>The URL that is configured in the forwarding rule.</p>
     * 
     * <strong>example:</strong>
     * <p>/cache</p>
     */
    @NameInMap("Url")
    public String url;

    /**
     * <p>The ID of the vServer group that is associated with the forwarding rule.</p>
     * 
     * <strong>example:</strong>
     * <p>rsp-cige6j****</p>
     */
    @NameInMap("VServerGroupId")
    public String VServerGroupId;

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

    public DescribeRuleAttributeResponseBody setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public DescribeRuleAttributeResponseBody setHealthCheck(String healthCheck) {
        this.healthCheck = healthCheck;
        return this;
    }
    public String getHealthCheck() {
        return this.healthCheck;
    }

    public DescribeRuleAttributeResponseBody setHealthCheckConnectPort(Integer healthCheckConnectPort) {
        this.healthCheckConnectPort = healthCheckConnectPort;
        return this;
    }
    public Integer getHealthCheckConnectPort() {
        return this.healthCheckConnectPort;
    }

    public DescribeRuleAttributeResponseBody setHealthCheckDomain(String healthCheckDomain) {
        this.healthCheckDomain = healthCheckDomain;
        return this;
    }
    public String getHealthCheckDomain() {
        return this.healthCheckDomain;
    }

    public DescribeRuleAttributeResponseBody setHealthCheckHttpCode(String healthCheckHttpCode) {
        this.healthCheckHttpCode = healthCheckHttpCode;
        return this;
    }
    public String getHealthCheckHttpCode() {
        return this.healthCheckHttpCode;
    }

    public DescribeRuleAttributeResponseBody setHealthCheckInterval(Integer healthCheckInterval) {
        this.healthCheckInterval = healthCheckInterval;
        return this;
    }
    public Integer getHealthCheckInterval() {
        return this.healthCheckInterval;
    }

    public DescribeRuleAttributeResponseBody setHealthCheckTimeout(Integer healthCheckTimeout) {
        this.healthCheckTimeout = healthCheckTimeout;
        return this;
    }
    public Integer getHealthCheckTimeout() {
        return this.healthCheckTimeout;
    }

    public DescribeRuleAttributeResponseBody setHealthCheckURI(String healthCheckURI) {
        this.healthCheckURI = healthCheckURI;
        return this;
    }
    public String getHealthCheckURI() {
        return this.healthCheckURI;
    }

    public DescribeRuleAttributeResponseBody setHealthyThreshold(Integer healthyThreshold) {
        this.healthyThreshold = healthyThreshold;
        return this;
    }
    public Integer getHealthyThreshold() {
        return this.healthyThreshold;
    }

    public DescribeRuleAttributeResponseBody setListenerPort(String listenerPort) {
        this.listenerPort = listenerPort;
        return this;
    }
    public String getListenerPort() {
        return this.listenerPort;
    }

    public DescribeRuleAttributeResponseBody setListenerSync(String listenerSync) {
        this.listenerSync = listenerSync;
        return this;
    }
    public String getListenerSync() {
        return this.listenerSync;
    }

    public DescribeRuleAttributeResponseBody setLoadBalancerId(String loadBalancerId) {
        this.loadBalancerId = loadBalancerId;
        return this;
    }
    public String getLoadBalancerId() {
        return this.loadBalancerId;
    }

    public DescribeRuleAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRuleAttributeResponseBody setRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public String getRuleId() {
        return this.ruleId;
    }

    public DescribeRuleAttributeResponseBody setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public DescribeRuleAttributeResponseBody setScheduler(String scheduler) {
        this.scheduler = scheduler;
        return this;
    }
    public String getScheduler() {
        return this.scheduler;
    }

    public DescribeRuleAttributeResponseBody setStickySession(String stickySession) {
        this.stickySession = stickySession;
        return this;
    }
    public String getStickySession() {
        return this.stickySession;
    }

    public DescribeRuleAttributeResponseBody setStickySessionType(String stickySessionType) {
        this.stickySessionType = stickySessionType;
        return this;
    }
    public String getStickySessionType() {
        return this.stickySessionType;
    }

    public DescribeRuleAttributeResponseBody setUnhealthyThreshold(Integer unhealthyThreshold) {
        this.unhealthyThreshold = unhealthyThreshold;
        return this;
    }
    public Integer getUnhealthyThreshold() {
        return this.unhealthyThreshold;
    }

    public DescribeRuleAttributeResponseBody setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

    public DescribeRuleAttributeResponseBody setVServerGroupId(String VServerGroupId) {
        this.VServerGroupId = VServerGroupId;
        return this;
    }
    public String getVServerGroupId() {
        return this.VServerGroupId;
    }

}
