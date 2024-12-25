// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class DescribeLoadBalancerListenersResponseBody extends TeaModel {
    /**
     * <p>A list of listeners of the CLB instance.</p>
     * <blockquote>
     * <p> This parameter is not returned if the CLB instance does not have a listener.</p>
     * </blockquote>
     */
    @NameInMap("Listeners")
    public java.util.List<DescribeLoadBalancerListenersResponseBodyListeners> listeners;

    /**
     * <p>The number of entries returned per page.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token that determines the start point of the query. Valid values:</p>
     * <ul>
     * <li>If <strong>NextToken</strong> is empty, it indicates that no subsequent query is to be sent.</li>
     * <li>If a value is returned for <strong>NextToken</strong>, the value is the token that determines the start point of the next query.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>FFmyTO70tTpLG6I3FmYAXGKPd****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>365F4154-92F6-4AE4-92F8-7FF34B540710</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeLoadBalancerListenersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLoadBalancerListenersResponseBody self = new DescribeLoadBalancerListenersResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLoadBalancerListenersResponseBody setListeners(java.util.List<DescribeLoadBalancerListenersResponseBodyListeners> listeners) {
        this.listeners = listeners;
        return this;
    }
    public java.util.List<DescribeLoadBalancerListenersResponseBodyListeners> getListeners() {
        return this.listeners;
    }

    public DescribeLoadBalancerListenersResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeLoadBalancerListenersResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeLoadBalancerListenersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLoadBalancerListenersResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeLoadBalancerListenersResponseBodyListenersHTTPListenerConfig extends TeaModel {
        /**
         * <p>The cookie configures for the server.</p>
         * 
         * <strong>example:</strong>
         * <p>B490B5EBF6F3CD402E515D22BCDA****</p>
         */
        @NameInMap("Cookie")
        public String cookie;

        /**
         * <p>The maximum amount of time to wait before the session cookie expires. Unit: seconds.</p>
         * <p>Valid values: <strong>1</strong> to <strong>86400</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>500</p>
         */
        @NameInMap("CookieTimeout")
        public Integer cookieTimeout;

        /**
         * <p>The listener port that is used for HTTP-to-HTTPS redirection.</p>
         * <blockquote>
         * <p> If the <strong>ListenerForward</strong> parameter is set to <strong>off</strong>, this parameter is not returned.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("ForwardPort")
        public Integer forwardPort;

        /**
         * <p>Indicates whether GZIP compression is enabled. Valid values:</p>
         * <ul>
         * <li><strong>on</strong></li>
         * <li><strong>off</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("Gzip")
        public String gzip;

        /**
         * <p>Indicates whether the health check feature is enabled. Valid values:</p>
         * <ul>
         * <li><strong>on</strong></li>
         * <li><strong>off</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("HealthCheck")
        public String healthCheck;

        /**
         * <p>The port that is used for health checks.</p>
         * <blockquote>
         * <p> This parameter takes effect only when <strong>HealthCheck</strong> is set to <strong>on</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>8080</p>
         */
        @NameInMap("HealthCheckConnectPort")
        public Integer healthCheckConnectPort;

        /**
         * <p>The domain name that is used for health checks.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.example.com">www.example.com</a></p>
         */
        @NameInMap("HealthCheckDomain")
        public String healthCheckDomain;

        /**
         * <p>The HTTP status code that indicates a healthy backend server.</p>
         * 
         * <strong>example:</strong>
         * <p>http_2xx,http_3xx</p>
         */
        @NameInMap("HealthCheckHttpCode")
        public String healthCheckHttpCode;

        /**
         * <p>The HTTP version for health checks.</p>
         * 
         * <strong>example:</strong>
         * <p>HTTP 1.0</p>
         */
        @NameInMap("HealthCheckHttpVersion")
        public String healthCheckHttpVersion;

        /**
         * <p>The interval at which health checks are performed. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("HealthCheckInterval")
        public Integer healthCheckInterval;

        /**
         * <p>The health check method. Valid values: <strong>head</strong> and <strong>get</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>get</p>
         */
        @NameInMap("HealthCheckMethod")
        public String healthCheckMethod;

        /**
         * <p>The maximum timeout period of a health check. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("HealthCheckTimeout")
        public Integer healthCheckTimeout;

        /**
         * <p>The protocol that you want to use for health checks.</p>
         * 
         * <strong>example:</strong>
         * <p>tcp</p>
         */
        @NameInMap("HealthCheckType")
        public String healthCheckType;

        /**
         * <p>The URI that is used for health checks.</p>
         * 
         * <strong>example:</strong>
         * <p>/test/index.html</p>
         */
        @NameInMap("HealthCheckURI")
        public String healthCheckURI;

        /**
         * <p>The number of times that an unhealthy backend server must consecutively pass health checks before it is declared healthy. In this case, the health check status of the backend server changes from <strong>fail</strong> to <strong>success</strong>.</p>
         * <p>Valid values: <strong>2</strong> to <strong>10</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("HealthyThreshold")
        public Integer healthyThreshold;

        /**
         * <p>The timeout period of an idle connection. Unit: seconds. Valid values: <strong>1</strong> to <strong>60</strong>.</p>
         * <p>If no request is received within the specified timeout period, CLB closes the connection. When a request is received, CLB establishes a new connection.</p>
         * 
         * <strong>example:</strong>
         * <p>15</p>
         */
        @NameInMap("IdleTimeout")
        public Integer idleTimeout;

        /**
         * <p>Indicates whether HTTP-to-HTTPS redirection is enabled for the listener. Valid values:</p>
         * <ul>
         * <li><strong>on</strong></li>
         * <li><strong>off</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("ListenerForward")
        public String listenerForward;

        /**
         * <p>The timeout period of a request. Unit: seconds. Valid values: <strong>1</strong> to <strong>180</strong>.</p>
         * <p>If no response is received from a backend server during the request timeout period, CLB sends the <code>HTTP 504</code> status code to the client.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("RequestTimeout")
        public Integer requestTimeout;

        /**
         * <p>Indicates whether session persistence is enabled. Valid values:</p>
         * <ul>
         * <li><strong>on</strong></li>
         * <li><strong>off</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("StickySession")
        public String stickySession;

        /**
         * <p>The method used to handle the cookie. Valid values:</p>
         * <ul>
         * <li><strong>insert</strong>: inserts a cookie. CLB inserts the SERVERID cookie to the HTTP or HTTPS response to the first request from a client. Subsequent requests that carry the SERVERID cookie from the client are forwarded to the same backend server as the first request.</li>
         * <li><strong>server</strong>: rewrites the original cookie. CLB rewrites the custom cookies in requests from a client. Subsequent requests from the client that carry the new cookie are forwarded to the same backend server as the first request.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>insert</p>
         */
        @NameInMap("StickySessionType")
        public String stickySessionType;

        /**
         * <p>The number of times that a healthy backend server must consecutively fail health checks before it is declared unhealthy. In this case, the health check status of the backend server changes from <strong>success</strong> to <strong>fail</strong>.</p>
         * <p>Valid values: <strong>2</strong> to <strong>10</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("UnhealthyThreshold")
        public Integer unhealthyThreshold;

        /**
         * <p>Indicates whether the <code>X-Forwarded-For</code> header is used to preserve client IP addresses. Valid values:</p>
         * <ul>
         * <li><strong>on</strong></li>
         * <li><strong>off</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("XForwardedFor")
        public String XForwardedFor;

        /**
         * <p>Indicates whether the <code>XForwardedFor_ClientSrcPort</code> header is used to retrieve the client port. Valid values:</p>
         * <ul>
         * <li><strong>on</strong></li>
         * <li><strong>off</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("XForwardedFor_ClientSrcPort")
        public String XForwardedFor_ClientSrcPort;

        /**
         * <p>Indicates whether the <code>SLB-ID</code> header is used to retrieve the ID of the CLB instance. Valid values:</p>
         * <ul>
         * <li><strong>on</strong></li>
         * <li><strong>off</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("XForwardedFor_SLBID")
        public String XForwardedFor_SLBID;

        /**
         * <p>Indicates whether the <code>SLB-IP</code> header is used to retrieve the VIP of the client. Valid values:</p>
         * <ul>
         * <li><strong>on</strong></li>
         * <li><strong>off</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("XForwardedFor_SLBIP")
        public String XForwardedFor_SLBIP;

        /**
         * <p>Indicates whether the <code>XForwardedFor_SLBPORT</code> header is used to retrieve the listener port of the CLB instance. Valid values:</p>
         * <ul>
         * <li><strong>on</strong></li>
         * <li><strong>off</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("XForwardedFor_SLBPORT")
        public String XForwardedFor_SLBPORT;

        /**
         * <p>Indicates whether the <code>X-Forwarded-Proto</code> header is used to obtain the listener protocol. Valid values:</p>
         * <ul>
         * <li><strong>on</strong></li>
         * <li><strong>off</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("XForwardedFor_proto")
        public String XForwardedFor_proto;

        public static DescribeLoadBalancerListenersResponseBodyListenersHTTPListenerConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeLoadBalancerListenersResponseBodyListenersHTTPListenerConfig self = new DescribeLoadBalancerListenersResponseBodyListenersHTTPListenerConfig();
            return TeaModel.build(map, self);
        }

        public DescribeLoadBalancerListenersResponseBodyListenersHTTPListenerConfig setCookie(String cookie) {
            this.cookie = cookie;
            return this;
        }
        public String getCookie() {
            return this.cookie;
        }

        public DescribeLoadBalancerListenersResponseBodyListenersHTTPListenerConfig setCookieTimeout(Integer cookieTimeout) {
            this.cookieTimeout = cookieTimeout;
            return this;
        }
        public Integer getCookieTimeout() {
            return this.cookieTimeout;
        }

        public DescribeLoadBalancerListenersResponseBodyListenersHTTPListenerConfig setForwardPort(Integer forwardPort) {
            this.forwardPort = forwardPort;
            return this;
        }
        public Integer getForwardPort() {
            return this.forwardPort;
        }

        public DescribeLoadBalancerListenersResponseBodyListenersHTTPListenerConfig setGzip(String gzip) {
            this.gzip = gzip;
            return this;
        }
        public String getGzip() {
            return this.gzip;
        }

        public DescribeLoadBalancerListenersResponseBodyListenersHTTPListenerConfig setHealthCheck(String healthCheck) {
            this.healthCheck = healthCheck;
            return this;
        }
        public String getHealthCheck() {
            return this.healthCheck;
        }

        public DescribeLoadBalancerListenersResponseBodyListenersHTTPListenerConfig setHealthCheckConnectPort(Integer healthCheckConnectPort) {
            this.healthCheckConnectPort = healthCheckConnectPort;
            return this;
        }
        public Integer getHealthCheckConnectPort() {
            return this.healthCheckConnectPort;
        }

        public DescribeLoadBalancerListenersResponseBodyListenersHTTPListenerConfig setHealthCheckDomain(String healthCheckDomain) {
            this.healthCheckDomain = healthCheckDomain;
            return this;
        }
        public String getHealthCheckDomain() {
            return this.healthCheckDomain;
        }

        public DescribeLoadBalancerListenersResponseBodyListenersHTTPListenerConfig setHealthCheckHttpCode(String healthCheckHttpCode) {
            this.healthCheckHttpCode = healthCheckHttpCode;
            return this;
        }
        public String getHealthCheckHttpCode() {
            return this.healthCheckHttpCode;
        }

        public DescribeLoadBalancerListenersResponseBodyListenersHTTPListenerConfig setHealthCheckHttpVersion(String healthCheckHttpVersion) {
            this.healthCheckHttpVersion = healthCheckHttpVersion;
            return this;
        }
        public String getHealthCheckHttpVersion() {
            return this.healthCheckHttpVersion;
        }

        public DescribeLoadBalancerListenersResponseBodyListenersHTTPListenerConfig setHealthCheckInterval(Integer healthCheckInterval) {
            this.healthCheckInterval = healthCheckInterval;
            return this;
        }
        public Integer getHealthCheckInterval() {
            return this.healthCheckInterval;
        }

        public DescribeLoadBalancerListenersResponseBodyListenersHTTPListenerConfig setHealthCheckMethod(String healthCheckMethod) {
            this.healthCheckMethod = healthCheckMethod;
            return this;
        }
        public String getHealthCheckMethod() {
            return this.healthCheckMethod;
        }

        public DescribeLoadBalancerListenersResponseBodyListenersHTTPListenerConfig setHealthCheckTimeout(Integer healthCheckTimeout) {
            this.healthCheckTimeout = healthCheckTimeout;
            return this;
        }
        public Integer getHealthCheckTimeout() {
            return this.healthCheckTimeout;
        }

        public DescribeLoadBalancerListenersResponseBodyListenersHTTPListenerConfig setHealthCheckType(String healthCheckType) {
            this.healthCheckType = healthCheckType;
            return this;
        }
        public String getHealthCheckType() {
            return this.healthCheckType;
        }

        public DescribeLoadBalancerListenersResponseBodyListenersHTTPListenerConfig setHealthCheckURI(String healthCheckURI) {
            this.healthCheckURI = healthCheckURI;
            return this;
        }
        public String getHealthCheckURI() {
            return this.healthCheckURI;
        }

        public DescribeLoadBalancerListenersResponseBodyListenersHTTPListenerConfig setHealthyThreshold(Integer healthyThreshold) {
            this.healthyThreshold = healthyThreshold;
            return this;
        }
        public Integer getHealthyThreshold() {
            return this.healthyThreshold;
        }

        public DescribeLoadBalancerListenersResponseBodyListenersHTTPListenerConfig setIdleTimeout(Integer idleTimeout) {
            this.idleTimeout = idleTimeout;
            return this;
        }
        public Integer getIdleTimeout() {
            return this.idleTimeout;
        }

        public DescribeLoadBalancerListenersResponseBodyListenersHTTPListenerConfig setListenerForward(String listenerForward) {
            this.listenerForward = listenerForward;
            return this;
        }
        public String getListenerForward() {
            return this.listenerForward;
        }

        public DescribeLoadBalancerListenersResponseBodyListenersHTTPListenerConfig setRequestTimeout(Integer requestTimeout) {
            this.requestTimeout = requestTimeout;
            return this;
        }
        public Integer getRequestTimeout() {
            return this.requestTimeout;
        }

        public DescribeLoadBalancerListenersResponseBodyListenersHTTPListenerConfig setStickySession(String stickySession) {
            this.stickySession = stickySession;
            return this;
        }
        public String getStickySession() {
            return this.stickySession;
        }

        public DescribeLoadBalancerListenersResponseBodyListenersHTTPListenerConfig setStickySessionType(String stickySessionType) {
            this.stickySessionType = stickySessionType;
            return this;
        }
        public String getStickySessionType() {
            return this.stickySessionType;
        }

        public DescribeLoadBalancerListenersResponseBodyListenersHTTPListenerConfig setUnhealthyThreshold(Integer unhealthyThreshold) {
            this.unhealthyThreshold = unhealthyThreshold;
            return this;
        }
        public Integer getUnhealthyThreshold() {
            return this.unhealthyThreshold;
        }

        public DescribeLoadBalancerListenersResponseBodyListenersHTTPListenerConfig setXForwardedFor(String XForwardedFor) {
            this.XForwardedFor = XForwardedFor;
            return this;
        }
        public String getXForwardedFor() {
            return this.XForwardedFor;
        }

        public DescribeLoadBalancerListenersResponseBodyListenersHTTPListenerConfig setXForwardedFor_ClientSrcPort(String XForwardedFor_ClientSrcPort) {
            this.XForwardedFor_ClientSrcPort = XForwardedFor_ClientSrcPort;
            return this;
        }
        public String getXForwardedFor_ClientSrcPort() {
            return this.XForwardedFor_ClientSrcPort;
        }

        public DescribeLoadBalancerListenersResponseBodyListenersHTTPListenerConfig setXForwardedFor_SLBID(String XForwardedFor_SLBID) {
            this.XForwardedFor_SLBID = XForwardedFor_SLBID;
            return this;
        }
        public String getXForwardedFor_SLBID() {
            return this.XForwardedFor_SLBID;
        }

        public DescribeLoadBalancerListenersResponseBodyListenersHTTPListenerConfig setXForwardedFor_SLBIP(String XForwardedFor_SLBIP) {
            this.XForwardedFor_SLBIP = XForwardedFor_SLBIP;
            return this;
        }
        public String getXForwardedFor_SLBIP() {
            return this.XForwardedFor_SLBIP;
        }

        public DescribeLoadBalancerListenersResponseBodyListenersHTTPListenerConfig setXForwardedFor_SLBPORT(String XForwardedFor_SLBPORT) {
            this.XForwardedFor_SLBPORT = XForwardedFor_SLBPORT;
            return this;
        }
        public String getXForwardedFor_SLBPORT() {
            return this.XForwardedFor_SLBPORT;
        }

        public DescribeLoadBalancerListenersResponseBodyListenersHTTPListenerConfig setXForwardedFor_proto(String XForwardedFor_proto) {
            this.XForwardedFor_proto = XForwardedFor_proto;
            return this;
        }
        public String getXForwardedFor_proto() {
            return this.XForwardedFor_proto;
        }

    }

    public static class DescribeLoadBalancerListenersResponseBodyListenersHTTPSListenerConfig extends TeaModel {
        /**
         * <p>The ID of the CA certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>idkp-234-cn-test-0****</p>
         */
        @NameInMap("CACertificateId")
        public String CACertificateId;

        /**
         * <p>The cookie configures for the server.</p>
         * 
         * <strong>example:</strong>
         * <p>B490B5EBF6F3CD402E515D22BCDA****</p>
         */
        @NameInMap("Cookie")
        public String cookie;

        /**
         * <p>The maximum amount of time to wait before the session cookie expires. Unit: seconds.</p>
         * <p>Valid values: <strong>1</strong> to <strong>86400</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>500</p>
         */
        @NameInMap("CookieTimeout")
        public Integer cookieTimeout;

        /**
         * <p>Indicates whether <code>HTTP 2.0</code> is enabled. Valid values:</p>
         * <ul>
         * <li><strong>on</strong></li>
         * <li><strong>off</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("EnableHttp2")
        public String enableHttp2;

        /**
         * <p>Indicates whether GZIP compression is enabled. Valid values:</p>
         * <ul>
         * <li><strong>on</strong></li>
         * <li><strong>off</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("Gzip")
        public String gzip;

        /**
         * <p>Indicates whether the health check feature is enabled. Valid values:</p>
         * <ul>
         * <li><strong>on</strong></li>
         * <li><strong>off</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("HealthCheck")
        public String healthCheck;

        /**
         * <p>The port that is used for health checks.</p>
         * 
         * <strong>example:</strong>
         * <p>8080</p>
         */
        @NameInMap("HealthCheckConnectPort")
        public Integer healthCheckConnectPort;

        /**
         * <p>The domain name that is used for health checks.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.example.com">www.example.com</a></p>
         */
        @NameInMap("HealthCheckDomain")
        public String healthCheckDomain;

        /**
         * <p>The HTTP status code that indicates a healthy backend server.</p>
         * 
         * <strong>example:</strong>
         * <p>http_2xx,http_3xx</p>
         */
        @NameInMap("HealthCheckHttpCode")
        public String healthCheckHttpCode;

        /**
         * <p>The HTTP version for health checks.</p>
         * 
         * <strong>example:</strong>
         * <p>HTTP 1.0</p>
         */
        @NameInMap("HealthCheckHttpVersion")
        public String healthCheckHttpVersion;

        /**
         * <p>The interval at which health checks are performed. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("HealthCheckInterval")
        public Integer healthCheckInterval;

        /**
         * <p>The health check method.</p>
         * 
         * <strong>example:</strong>
         * <p>get</p>
         */
        @NameInMap("HealthCheckMethod")
        public String healthCheckMethod;

        /**
         * <p>The timeout period of a health check response. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("HealthCheckTimeout")
        public Integer healthCheckTimeout;

        /**
         * <p>The protocol that you want to use for health checks.</p>
         * 
         * <strong>example:</strong>
         * <p>tcp</p>
         */
        @NameInMap("HealthCheckType")
        public String healthCheckType;

        /**
         * <p>The URI that is used for health checks.</p>
         * 
         * <strong>example:</strong>
         * <p>/test/index.html</p>
         */
        @NameInMap("HealthCheckURI")
        public String healthCheckURI;

        /**
         * <p>The number of times that an unhealthy backend server must consecutively pass health checks before it is declared healthy. In this case, the health check status of the backend server changes from <strong>fail</strong> to <strong>success</strong>.</p>
         * <p>Valid values: <strong>2</strong> to <strong>10</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("HealthyThreshold")
        public Integer healthyThreshold;

        /**
         * <p>The timeout period of an idle connection. Unit: seconds. Valid values: <strong>1</strong> to <strong>60</strong>.</p>
         * <p>If no request is received within the specified timeout period, CLB closes the connection. When a request is received, CLB establishes a new connection.</p>
         * 
         * <strong>example:</strong>
         * <p>15</p>
         */
        @NameInMap("IdleTimeout")
        public Integer idleTimeout;

        /**
         * <p>The request timeout period. Unit: seconds. Valid values: <strong>1</strong> to <strong>180</strong>.</p>
         * <p>If no response is received from a backend server during the request timeout period, CLB sends the <code>HTTP 504</code> status code to the client.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("RequestTimeout")
        public Integer requestTimeout;

        /**
         * <p>The ID of the server certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>idkp-123-cn-test-0****</p>
         */
        @NameInMap("ServerCertificateId")
        public String serverCertificateId;

        /**
         * <p>Indicates whether session persistence is enabled. Valid values:</p>
         * <ul>
         * <li><strong>on</strong></li>
         * <li><strong>off</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("StickySession")
        public String stickySession;

        /**
         * <p>The method used to handle the cookie.</p>
         * <ul>
         * <li><strong>insert</strong>: inserts a cookie. CLB inserts the SERVERID cookie to the HTTP or HTTPS response to the first request from a client. Subsequent requests that carry the SERVERID cookie from the client are forwarded to the same backend server as the first request.</li>
         * <li><strong>server</strong>: rewrites the original cookie. CLB rewrites the custom cookies in requests from a client. Subsequent requests from the client that carry the new cookie are forwarded to the same backend server as the first request.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>insert</p>
         */
        @NameInMap("StickySessionType")
        public String stickySessionType;

        /**
         * <p>A TLS security policy contains TLS protocols and cipher suites available for HTTPS.</p>
         * <ul>
         * <li><p><strong>tls_cipher_policy_1_0</strong>:</p>
         * <p>Supported TLS versions: TLSv1.0, TLSv1.1, and TLSv1.2.</p>
         * <p>Supported cipher suites: ECDHE-RSA-AES128-GCM-SHA256, ECDHE-RSA-AES256-GCM-SHA384, ECDHE-RSA-AES128-SHA256, ECDHE-RSA-AES256-SHA384, AES128-GCM-SHA256, AES256-GCM-SHA384, AES128-SHA256, AES256-SHA256, ECDHE-RSA-AES128-SHA, ECDHE-RSA-AES256-SHA, AES128-SHA, AES256-SHA, and DES-CBC3-SHA.</p>
         * </li>
         * <li><p><strong>tls_cipher_policy_1_1</strong>:</p>
         * <p>Supported TLS versions: TLSv1.1 and TLSv1.2.</p>
         * <p>Supported cipher suites: ECDHE-RSA-AES128-GCM-SHA256, ECDHE-RSA-AES256-GCM-SHA384, ECDHE-RSA-AES128-SHA256, ECDHE-RSA-AES256-SHA384, AES128-GCM-SHA256, AES256-GCM-SHA384, AES128-SHA256, AES256-SHA256, ECDHE-RSA-AES128-SHA, ECDHE-RSA-AES256-SHA, AES128-SHA, AES256-SHA, and DES-CBC3-SHA.</p>
         * </li>
         * <li><p><strong>tls_cipher_policy_1_2</strong></p>
         * <p>Supported TLS versions: TLSv1.2.</p>
         * <p>Supported cipher suites: ECDHE-RSA-AES128-GCM-SHA256, ECDHE-RSA-AES256-GCM-SHA384, ECDHE-RSA-AES128-SHA256, ECDHE-RSA-AES256-SHA384, AES128-GCM-SHA256, AES256-GCM-SHA384, AES128-SHA256, AES256-SHA256, ECDHE-RSA-AES128-SHA, ECDHE-RSA-AES256-SHA, AES128-SHA, AES256-SHA, and DES-CBC3-SHA.</p>
         * </li>
         * <li><p><strong>tls_cipher_policy_1_2_strict</strong></p>
         * <p>Supported TLS versions: TLSv1.2.</p>
         * <p>Supported cipher suites: ECDHE-RSA-AES128-GCM-SHA256, ECDHE-RSA-AES256-GCM-SHA384, ECDHE-RSA-AES128-SHA256, ECDHE-RSA-AES256-SHA384, ECDHE-RSA-AES128-SHA, and ECDHE-RSA-AES256-SHA.</p>
         * </li>
         * <li><p><strong>tls_cipher_policy_1_2_strict_with_1_3</strong></p>
         * <p>Supported TLS versions: TLSv1.2 and TLSv1.3.</p>
         * <p>Supported cipher suites: TLS_AES_128_GCM_SHA256, TLS_AES_256_GCM_SHA384, TLS_CHACHA20_POLY1305_SHA256, TLS_AES_128_CCM_SHA256, TLS_AES_128_CCM_8_SHA256, ECDHE-ECDSA-AES128-GCM-SHA256, ECDHE-ECDSA-AES256-GCM-SHA384, ECDHE-ECDSA-AES128-SHA256, ECDHE-ECDSA-AES256-SHA384, ECDHE-RSA-AES128-GCM-SHA256, ECDHE-RSA-AES256-GCM-SHA384, ECDHE-RSA-AES128-SHA256, ECDHE-RSA-AES256-SHA384, ECDHE-ECDSA-AES128-SHA, ECDHE-ECDSA-AES256-SHA, ECDHE-RSA-AES128-SHA, and ECDHE-RSA-AES256-SHA.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>tls_cipher_policy_1_0</p>
         */
        @NameInMap("TLSCipherPolicy")
        public String TLSCipherPolicy;

        /**
         * <p>The number of times that a healthy backend server must consecutively fail health checks before it is declared unhealthy. In this case, the health check status of the backend server changes from <strong>success</strong> to <strong>fail</strong>.</p>
         * <p>Valid values: <strong>2</strong> to <strong>10</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("UnhealthyThreshold")
        public Integer unhealthyThreshold;

        /**
         * <p>Indicates whether the <code>X-Forwarded-For</code> header is used to retrieve client IP addresses. Valid values:</p>
         * <ul>
         * <li><strong>on</strong></li>
         * <li><strong>off</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("XForwardedFor")
        public String XForwardedFor;

        /**
         * <p>Indicates whether the <code>XForwardedFor_ClientCertClientVerify</code> header is used to obtain the verification result of the client certificate. Valid values:</p>
         * <ul>
         * <li><strong>on</strong></li>
         * <li><strong>off</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("XForwardedFor_ClientCertClientVerify")
        public String XForwardedFor_ClientCertClientVerify;

        /**
         * <p>Indicates whether the <code>XForwardedFor_ClientCertFingerprint</code> header is used to obtain the fingerprint of the client certificate. Valid values:</p>
         * <ul>
         * <li><strong>on</strong></li>
         * <li><strong>off</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("XForwardedFor_ClientCertFingerprint")
        public String XForwardedFor_ClientCertFingerprint;

        /**
         * <p>Indicates whether the <code>XForwardedFor_ClientCertIssuerDN</code> header is used to obtain information about the authority that issues the client certificate. Valid values:</p>
         * <ul>
         * <li><strong>on</strong></li>
         * <li><strong>off</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("XForwardedFor_ClientCertIssuerDN")
        public String XForwardedFor_ClientCertIssuerDN;

        /**
         * <p>Indicates whether the <code>XForwardedFor_ClientCertSubjectDN</code> header is used to obtain information about the owner of the client certificate. Valid values:</p>
         * <ul>
         * <li><strong>on</strong></li>
         * <li><strong>off</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("XForwardedFor_ClientCertSubjectDN")
        public String XForwardedFor_ClientCertSubjectDN;

        /**
         * <p>Indicates whether the <code>XForwardedFor_ClientSrcPort</code> header is used to retrieve the client port. Valid values:</p>
         * <ul>
         * <li><strong>on</strong></li>
         * <li><strong>off</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("XForwardedFor_ClientSrcPort")
        public String XForwardedFor_ClientSrcPort;

        /**
         * <p>Indicates whether the <code>SLB-ID</code> header is used to retrieve the ID of the CLB instance. Valid values:</p>
         * <ul>
         * <li><strong>on</strong></li>
         * <li><strong>off</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("XForwardedFor_SLBID")
        public String XForwardedFor_SLBID;

        /**
         * <p>Indicates whether the <code>SLB-IP</code> header is used to retrieve the VIP of the client. Valid values:</p>
         * <ul>
         * <li><strong>on</strong></li>
         * <li><strong>off</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("XForwardedFor_SLBIP")
        public String XForwardedFor_SLBIP;

        /**
         * <p>Indicates whether the <code>XForwardedFor_SLBPORT</code> header is used to retrieve the listener port of the CLB instance. Valid values:</p>
         * <ul>
         * <li><strong>on</strong></li>
         * <li><strong>off</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("XForwardedFor_SLBPORT")
        public String XForwardedFor_SLBPORT;

        /**
         * <p>Indicates whether the <code>X-Forwarded-Proto</code> header is used to obtain the listener protocol. Valid values:</p>
         * <ul>
         * <li><strong>on</strong></li>
         * <li><strong>off</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("XForwardedFor_proto")
        public String XForwardedFor_proto;

        public static DescribeLoadBalancerListenersResponseBodyListenersHTTPSListenerConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeLoadBalancerListenersResponseBodyListenersHTTPSListenerConfig self = new DescribeLoadBalancerListenersResponseBodyListenersHTTPSListenerConfig();
            return TeaModel.build(map, self);
        }

        public DescribeLoadBalancerListenersResponseBodyListenersHTTPSListenerConfig setCACertificateId(String CACertificateId) {
            this.CACertificateId = CACertificateId;
            return this;
        }
        public String getCACertificateId() {
            return this.CACertificateId;
        }

        public DescribeLoadBalancerListenersResponseBodyListenersHTTPSListenerConfig setCookie(String cookie) {
            this.cookie = cookie;
            return this;
        }
        public String getCookie() {
            return this.cookie;
        }

        public DescribeLoadBalancerListenersResponseBodyListenersHTTPSListenerConfig setCookieTimeout(Integer cookieTimeout) {
            this.cookieTimeout = cookieTimeout;
            return this;
        }
        public Integer getCookieTimeout() {
            return this.cookieTimeout;
        }

        public DescribeLoadBalancerListenersResponseBodyListenersHTTPSListenerConfig setEnableHttp2(String enableHttp2) {
            this.enableHttp2 = enableHttp2;
            return this;
        }
        public String getEnableHttp2() {
            return this.enableHttp2;
        }

        public DescribeLoadBalancerListenersResponseBodyListenersHTTPSListenerConfig setGzip(String gzip) {
            this.gzip = gzip;
            return this;
        }
        public String getGzip() {
            return this.gzip;
        }

        public DescribeLoadBalancerListenersResponseBodyListenersHTTPSListenerConfig setHealthCheck(String healthCheck) {
            this.healthCheck = healthCheck;
            return this;
        }
        public String getHealthCheck() {
            return this.healthCheck;
        }

        public DescribeLoadBalancerListenersResponseBodyListenersHTTPSListenerConfig setHealthCheckConnectPort(Integer healthCheckConnectPort) {
            this.healthCheckConnectPort = healthCheckConnectPort;
            return this;
        }
        public Integer getHealthCheckConnectPort() {
            return this.healthCheckConnectPort;
        }

        public DescribeLoadBalancerListenersResponseBodyListenersHTTPSListenerConfig setHealthCheckDomain(String healthCheckDomain) {
            this.healthCheckDomain = healthCheckDomain;
            return this;
        }
        public String getHealthCheckDomain() {
            return this.healthCheckDomain;
        }

        public DescribeLoadBalancerListenersResponseBodyListenersHTTPSListenerConfig setHealthCheckHttpCode(String healthCheckHttpCode) {
            this.healthCheckHttpCode = healthCheckHttpCode;
            return this;
        }
        public String getHealthCheckHttpCode() {
            return this.healthCheckHttpCode;
        }

        public DescribeLoadBalancerListenersResponseBodyListenersHTTPSListenerConfig setHealthCheckHttpVersion(String healthCheckHttpVersion) {
            this.healthCheckHttpVersion = healthCheckHttpVersion;
            return this;
        }
        public String getHealthCheckHttpVersion() {
            return this.healthCheckHttpVersion;
        }

        public DescribeLoadBalancerListenersResponseBodyListenersHTTPSListenerConfig setHealthCheckInterval(Integer healthCheckInterval) {
            this.healthCheckInterval = healthCheckInterval;
            return this;
        }
        public Integer getHealthCheckInterval() {
            return this.healthCheckInterval;
        }

        public DescribeLoadBalancerListenersResponseBodyListenersHTTPSListenerConfig setHealthCheckMethod(String healthCheckMethod) {
            this.healthCheckMethod = healthCheckMethod;
            return this;
        }
        public String getHealthCheckMethod() {
            return this.healthCheckMethod;
        }

        public DescribeLoadBalancerListenersResponseBodyListenersHTTPSListenerConfig setHealthCheckTimeout(Integer healthCheckTimeout) {
            this.healthCheckTimeout = healthCheckTimeout;
            return this;
        }
        public Integer getHealthCheckTimeout() {
            return this.healthCheckTimeout;
        }

        public DescribeLoadBalancerListenersResponseBodyListenersHTTPSListenerConfig setHealthCheckType(String healthCheckType) {
            this.healthCheckType = healthCheckType;
            return this;
        }
        public String getHealthCheckType() {
            return this.healthCheckType;
        }

        public DescribeLoadBalancerListenersResponseBodyListenersHTTPSListenerConfig setHealthCheckURI(String healthCheckURI) {
            this.healthCheckURI = healthCheckURI;
            return this;
        }
        public String getHealthCheckURI() {
            return this.healthCheckURI;
        }

        public DescribeLoadBalancerListenersResponseBodyListenersHTTPSListenerConfig setHealthyThreshold(Integer healthyThreshold) {
            this.healthyThreshold = healthyThreshold;
            return this;
        }
        public Integer getHealthyThreshold() {
            return this.healthyThreshold;
        }

        public DescribeLoadBalancerListenersResponseBodyListenersHTTPSListenerConfig setIdleTimeout(Integer idleTimeout) {
            this.idleTimeout = idleTimeout;
            return this;
        }
        public Integer getIdleTimeout() {
            return this.idleTimeout;
        }

        public DescribeLoadBalancerListenersResponseBodyListenersHTTPSListenerConfig setRequestTimeout(Integer requestTimeout) {
            this.requestTimeout = requestTimeout;
            return this;
        }
        public Integer getRequestTimeout() {
            return this.requestTimeout;
        }

        public DescribeLoadBalancerListenersResponseBodyListenersHTTPSListenerConfig setServerCertificateId(String serverCertificateId) {
            this.serverCertificateId = serverCertificateId;
            return this;
        }
        public String getServerCertificateId() {
            return this.serverCertificateId;
        }

        public DescribeLoadBalancerListenersResponseBodyListenersHTTPSListenerConfig setStickySession(String stickySession) {
            this.stickySession = stickySession;
            return this;
        }
        public String getStickySession() {
            return this.stickySession;
        }

        public DescribeLoadBalancerListenersResponseBodyListenersHTTPSListenerConfig setStickySessionType(String stickySessionType) {
            this.stickySessionType = stickySessionType;
            return this;
        }
        public String getStickySessionType() {
            return this.stickySessionType;
        }

        public DescribeLoadBalancerListenersResponseBodyListenersHTTPSListenerConfig setTLSCipherPolicy(String TLSCipherPolicy) {
            this.TLSCipherPolicy = TLSCipherPolicy;
            return this;
        }
        public String getTLSCipherPolicy() {
            return this.TLSCipherPolicy;
        }

        public DescribeLoadBalancerListenersResponseBodyListenersHTTPSListenerConfig setUnhealthyThreshold(Integer unhealthyThreshold) {
            this.unhealthyThreshold = unhealthyThreshold;
            return this;
        }
        public Integer getUnhealthyThreshold() {
            return this.unhealthyThreshold;
        }

        public DescribeLoadBalancerListenersResponseBodyListenersHTTPSListenerConfig setXForwardedFor(String XForwardedFor) {
            this.XForwardedFor = XForwardedFor;
            return this;
        }
        public String getXForwardedFor() {
            return this.XForwardedFor;
        }

        public DescribeLoadBalancerListenersResponseBodyListenersHTTPSListenerConfig setXForwardedFor_ClientCertClientVerify(String XForwardedFor_ClientCertClientVerify) {
            this.XForwardedFor_ClientCertClientVerify = XForwardedFor_ClientCertClientVerify;
            return this;
        }
        public String getXForwardedFor_ClientCertClientVerify() {
            return this.XForwardedFor_ClientCertClientVerify;
        }

        public DescribeLoadBalancerListenersResponseBodyListenersHTTPSListenerConfig setXForwardedFor_ClientCertFingerprint(String XForwardedFor_ClientCertFingerprint) {
            this.XForwardedFor_ClientCertFingerprint = XForwardedFor_ClientCertFingerprint;
            return this;
        }
        public String getXForwardedFor_ClientCertFingerprint() {
            return this.XForwardedFor_ClientCertFingerprint;
        }

        public DescribeLoadBalancerListenersResponseBodyListenersHTTPSListenerConfig setXForwardedFor_ClientCertIssuerDN(String XForwardedFor_ClientCertIssuerDN) {
            this.XForwardedFor_ClientCertIssuerDN = XForwardedFor_ClientCertIssuerDN;
            return this;
        }
        public String getXForwardedFor_ClientCertIssuerDN() {
            return this.XForwardedFor_ClientCertIssuerDN;
        }

        public DescribeLoadBalancerListenersResponseBodyListenersHTTPSListenerConfig setXForwardedFor_ClientCertSubjectDN(String XForwardedFor_ClientCertSubjectDN) {
            this.XForwardedFor_ClientCertSubjectDN = XForwardedFor_ClientCertSubjectDN;
            return this;
        }
        public String getXForwardedFor_ClientCertSubjectDN() {
            return this.XForwardedFor_ClientCertSubjectDN;
        }

        public DescribeLoadBalancerListenersResponseBodyListenersHTTPSListenerConfig setXForwardedFor_ClientSrcPort(String XForwardedFor_ClientSrcPort) {
            this.XForwardedFor_ClientSrcPort = XForwardedFor_ClientSrcPort;
            return this;
        }
        public String getXForwardedFor_ClientSrcPort() {
            return this.XForwardedFor_ClientSrcPort;
        }

        public DescribeLoadBalancerListenersResponseBodyListenersHTTPSListenerConfig setXForwardedFor_SLBID(String XForwardedFor_SLBID) {
            this.XForwardedFor_SLBID = XForwardedFor_SLBID;
            return this;
        }
        public String getXForwardedFor_SLBID() {
            return this.XForwardedFor_SLBID;
        }

        public DescribeLoadBalancerListenersResponseBodyListenersHTTPSListenerConfig setXForwardedFor_SLBIP(String XForwardedFor_SLBIP) {
            this.XForwardedFor_SLBIP = XForwardedFor_SLBIP;
            return this;
        }
        public String getXForwardedFor_SLBIP() {
            return this.XForwardedFor_SLBIP;
        }

        public DescribeLoadBalancerListenersResponseBodyListenersHTTPSListenerConfig setXForwardedFor_SLBPORT(String XForwardedFor_SLBPORT) {
            this.XForwardedFor_SLBPORT = XForwardedFor_SLBPORT;
            return this;
        }
        public String getXForwardedFor_SLBPORT() {
            return this.XForwardedFor_SLBPORT;
        }

        public DescribeLoadBalancerListenersResponseBodyListenersHTTPSListenerConfig setXForwardedFor_proto(String XForwardedFor_proto) {
            this.XForwardedFor_proto = XForwardedFor_proto;
            return this;
        }
        public String getXForwardedFor_proto() {
            return this.XForwardedFor_proto;
        }

    }

    public static class DescribeLoadBalancerListenersResponseBodyListenersTCPListenerConfig extends TeaModel {
        /**
         * <p>Indicates whether connection draining is enabled. Valid values:</p>
         * <ul>
         * <li><strong>on</strong></li>
         * <li><strong>off</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("ConnectionDrain")
        public String connectionDrain;

        /**
         * <p>The timeout period of connection draining. Unit: seconds.</p>
         * <p>Value values: <strong>10 to 900</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>300</p>
         */
        @NameInMap("ConnectionDrainTimeout")
        public Integer connectionDrainTimeout;

        /**
         * <p>The timeout period of a connection. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>500</p>
         */
        @NameInMap("EstablishedTimeout")
        public Integer establishedTimeout;

        /**
         * <p>Indicates whether the health check feature is enabled. Valid values:</p>
         * <ul>
         * <li><strong>on</strong></li>
         * <li><strong>off</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("HealthCheck")
        public String healthCheck;

        /**
         * <p>The port that is used for health checks.</p>
         * 
         * <strong>example:</strong>
         * <p>8080</p>
         */
        @NameInMap("HealthCheckConnectPort")
        public Integer healthCheckConnectPort;

        /**
         * <p>The timeout period of health checks. Unit: seconds.</p>
         * <p>Valid values: <strong>1</strong> to <strong>300</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("HealthCheckConnectTimeout")
        public Integer healthCheckConnectTimeout;

        /**
         * <p>The domain name that is used for health checks.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.example.com">www.example.com</a></p>
         */
        @NameInMap("HealthCheckDomain")
        public String healthCheckDomain;

        /**
         * <p>The HTTP status code that indicates a healthy backend server.</p>
         * 
         * <strong>example:</strong>
         * <p>http_2xx,http_3xx</p>
         */
        @NameInMap("HealthCheckHttpCode")
        public String healthCheckHttpCode;

        /**
         * <p>The interval between two consecutive health checks. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("HealthCheckInterval")
        public Integer healthCheckInterval;

        /**
         * <p>The health check method.</p>
         * 
         * <strong>example:</strong>
         * <p>get</p>
         */
        @NameInMap("HealthCheckMethod")
        public String healthCheckMethod;

        /**
         * <p>The protocol that you want to use for health checks.</p>
         * 
         * <strong>example:</strong>
         * <p>tcp</p>
         */
        @NameInMap("HealthCheckType")
        public String healthCheckType;

        /**
         * <p>The URI that is used for health checks.</p>
         * 
         * <strong>example:</strong>
         * <p>/test/index.html</p>
         */
        @NameInMap("HealthCheckURI")
        public String healthCheckURI;

        /**
         * <p>The number of times that an unhealthy backend server must consecutively pass health checks before it is declared healthy. In this case, the health check status of the backend server changes from <strong>fail</strong> to <strong>success</strong>.</p>
         * <p>Valid values: <strong>2</strong> to <strong>10</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("HealthyThreshold")
        public Integer healthyThreshold;

        /**
         * <p>The ID of the primary/secondary server group associated with the listener.</p>
         * 
         * <strong>example:</strong>
         * <p>rsp-0bfucw*****</p>
         */
        @NameInMap("MasterSlaveServerGroupId")
        public String masterSlaveServerGroupId;

        /**
         * <p>Indicates whether session persistence is enabled. Unit: seconds.</p>
         * <p>Valid values: <strong>0</strong> to <strong>3600</strong>.</p>
         * <p><strong>0</strong> indicates that session persistence is disabled.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("PersistenceTimeout")
        public Integer persistenceTimeout;

        /**
         * <p>Indicates whether the Proxy protocol is used to pass source client IP addresses to backend servers. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: enables the burst feature for the data disk.</li>
         * <li><strong>false</strong>: The task is not being retried.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("ProxyProtocolV2Enabled")
        public String proxyProtocolV2Enabled;

        /**
         * <p>The number of times that a healthy backend server must consecutively fail health checks before it is declared unhealthy. In this case, the health check status of the backend server changes from <strong>success</strong> to <strong>fail</strong>.</p>
         * <p>Valid values: <strong>2</strong> to <strong>10</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("UnhealthyThreshold")
        public Integer unhealthyThreshold;

        public static DescribeLoadBalancerListenersResponseBodyListenersTCPListenerConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeLoadBalancerListenersResponseBodyListenersTCPListenerConfig self = new DescribeLoadBalancerListenersResponseBodyListenersTCPListenerConfig();
            return TeaModel.build(map, self);
        }

        public DescribeLoadBalancerListenersResponseBodyListenersTCPListenerConfig setConnectionDrain(String connectionDrain) {
            this.connectionDrain = connectionDrain;
            return this;
        }
        public String getConnectionDrain() {
            return this.connectionDrain;
        }

        public DescribeLoadBalancerListenersResponseBodyListenersTCPListenerConfig setConnectionDrainTimeout(Integer connectionDrainTimeout) {
            this.connectionDrainTimeout = connectionDrainTimeout;
            return this;
        }
        public Integer getConnectionDrainTimeout() {
            return this.connectionDrainTimeout;
        }

        public DescribeLoadBalancerListenersResponseBodyListenersTCPListenerConfig setEstablishedTimeout(Integer establishedTimeout) {
            this.establishedTimeout = establishedTimeout;
            return this;
        }
        public Integer getEstablishedTimeout() {
            return this.establishedTimeout;
        }

        public DescribeLoadBalancerListenersResponseBodyListenersTCPListenerConfig setHealthCheck(String healthCheck) {
            this.healthCheck = healthCheck;
            return this;
        }
        public String getHealthCheck() {
            return this.healthCheck;
        }

        public DescribeLoadBalancerListenersResponseBodyListenersTCPListenerConfig setHealthCheckConnectPort(Integer healthCheckConnectPort) {
            this.healthCheckConnectPort = healthCheckConnectPort;
            return this;
        }
        public Integer getHealthCheckConnectPort() {
            return this.healthCheckConnectPort;
        }

        public DescribeLoadBalancerListenersResponseBodyListenersTCPListenerConfig setHealthCheckConnectTimeout(Integer healthCheckConnectTimeout) {
            this.healthCheckConnectTimeout = healthCheckConnectTimeout;
            return this;
        }
        public Integer getHealthCheckConnectTimeout() {
            return this.healthCheckConnectTimeout;
        }

        public DescribeLoadBalancerListenersResponseBodyListenersTCPListenerConfig setHealthCheckDomain(String healthCheckDomain) {
            this.healthCheckDomain = healthCheckDomain;
            return this;
        }
        public String getHealthCheckDomain() {
            return this.healthCheckDomain;
        }

        public DescribeLoadBalancerListenersResponseBodyListenersTCPListenerConfig setHealthCheckHttpCode(String healthCheckHttpCode) {
            this.healthCheckHttpCode = healthCheckHttpCode;
            return this;
        }
        public String getHealthCheckHttpCode() {
            return this.healthCheckHttpCode;
        }

        public DescribeLoadBalancerListenersResponseBodyListenersTCPListenerConfig setHealthCheckInterval(Integer healthCheckInterval) {
            this.healthCheckInterval = healthCheckInterval;
            return this;
        }
        public Integer getHealthCheckInterval() {
            return this.healthCheckInterval;
        }

        public DescribeLoadBalancerListenersResponseBodyListenersTCPListenerConfig setHealthCheckMethod(String healthCheckMethod) {
            this.healthCheckMethod = healthCheckMethod;
            return this;
        }
        public String getHealthCheckMethod() {
            return this.healthCheckMethod;
        }

        public DescribeLoadBalancerListenersResponseBodyListenersTCPListenerConfig setHealthCheckType(String healthCheckType) {
            this.healthCheckType = healthCheckType;
            return this;
        }
        public String getHealthCheckType() {
            return this.healthCheckType;
        }

        public DescribeLoadBalancerListenersResponseBodyListenersTCPListenerConfig setHealthCheckURI(String healthCheckURI) {
            this.healthCheckURI = healthCheckURI;
            return this;
        }
        public String getHealthCheckURI() {
            return this.healthCheckURI;
        }

        public DescribeLoadBalancerListenersResponseBodyListenersTCPListenerConfig setHealthyThreshold(Integer healthyThreshold) {
            this.healthyThreshold = healthyThreshold;
            return this;
        }
        public Integer getHealthyThreshold() {
            return this.healthyThreshold;
        }

        public DescribeLoadBalancerListenersResponseBodyListenersTCPListenerConfig setMasterSlaveServerGroupId(String masterSlaveServerGroupId) {
            this.masterSlaveServerGroupId = masterSlaveServerGroupId;
            return this;
        }
        public String getMasterSlaveServerGroupId() {
            return this.masterSlaveServerGroupId;
        }

        public DescribeLoadBalancerListenersResponseBodyListenersTCPListenerConfig setPersistenceTimeout(Integer persistenceTimeout) {
            this.persistenceTimeout = persistenceTimeout;
            return this;
        }
        public Integer getPersistenceTimeout() {
            return this.persistenceTimeout;
        }

        public DescribeLoadBalancerListenersResponseBodyListenersTCPListenerConfig setProxyProtocolV2Enabled(String proxyProtocolV2Enabled) {
            this.proxyProtocolV2Enabled = proxyProtocolV2Enabled;
            return this;
        }
        public String getProxyProtocolV2Enabled() {
            return this.proxyProtocolV2Enabled;
        }

        public DescribeLoadBalancerListenersResponseBodyListenersTCPListenerConfig setUnhealthyThreshold(Integer unhealthyThreshold) {
            this.unhealthyThreshold = unhealthyThreshold;
            return this;
        }
        public Integer getUnhealthyThreshold() {
            return this.unhealthyThreshold;
        }

    }

    public static class DescribeLoadBalancerListenersResponseBodyListenersTags extends TeaModel {
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>TestKey</p>
         */
        @NameInMap("TagKey")
        public String tagKey;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>TestValue</p>
         */
        @NameInMap("TagValue")
        public String tagValue;

        public static DescribeLoadBalancerListenersResponseBodyListenersTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeLoadBalancerListenersResponseBodyListenersTags self = new DescribeLoadBalancerListenersResponseBodyListenersTags();
            return TeaModel.build(map, self);
        }

        public DescribeLoadBalancerListenersResponseBodyListenersTags setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public DescribeLoadBalancerListenersResponseBodyListenersTags setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class DescribeLoadBalancerListenersResponseBodyListenersUDPListenerConfig extends TeaModel {
        /**
         * <p>Indicates whether connection draining is enabled. Valid values:</p>
         * <ul>
         * <li><strong>on</strong></li>
         * <li><strong>off</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("ConnectionDrain")
        public String connectionDrain;

        /**
         * <p>The timeout period of connection draining. Unit: seconds.</p>
         * <p>Value values: <strong>10 to 900</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>300</p>
         */
        @NameInMap("ConnectionDrainTimeout")
        public Integer connectionDrainTimeout;

        /**
         * <p>Indicates whether the health check feature is enabled. Valid values:</p>
         * <ul>
         * <li><strong>on</strong></li>
         * <li><strong>off</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("HealthCheck")
        public String healthCheck;

        /**
         * <p>The port that is used for health checks.</p>
         * 
         * <strong>example:</strong>
         * <p>8080</p>
         */
        @NameInMap("HealthCheckConnectPort")
        public Integer healthCheckConnectPort;

        /**
         * <p>The timeout period for a health check response.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("HealthCheckConnectTimeout")
        public Integer healthCheckConnectTimeout;

        /**
         * <p>The response string of UDP health checks.</p>
         * 
         * <strong>example:</strong>
         * <p>ok</p>
         */
        @NameInMap("HealthCheckExp")
        public String healthCheckExp;

        /**
         * <p>The interval between two consecutive health checks. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("HealthCheckInterval")
        public Integer healthCheckInterval;

        /**
         * <p>The request string of UDP health checks.</p>
         * 
         * <strong>example:</strong>
         * <p>hello</p>
         */
        @NameInMap("HealthCheckReq")
        public String healthCheckReq;

        /**
         * <p>The number of times that a backend server must consecutively pass health checks before it is declared healthy.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("HealthyThreshold")
        public Integer healthyThreshold;

        /**
         * <p>The ID of the primary/secondary server group that is associated with the listener.</p>
         * 
         * <strong>example:</strong>
         * <p>rsp-0bfucw****</p>
         */
        @NameInMap("MasterSlaveServerGroupId")
        public String masterSlaveServerGroupId;

        /**
         * <p>Indicates whether the Proxy protocol is used to pass source client IP addresses to backend servers. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: enables the burst feature for the data disk.</li>
         * <li><strong>false</strong>: The task is not being retried.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("ProxyProtocolV2Enabled")
        public String proxyProtocolV2Enabled;

        /**
         * <p>The number of times that a backend server must consecutively fail health checks before it is declared unhealthy.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("UnhealthyThreshold")
        public Integer unhealthyThreshold;

        public static DescribeLoadBalancerListenersResponseBodyListenersUDPListenerConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeLoadBalancerListenersResponseBodyListenersUDPListenerConfig self = new DescribeLoadBalancerListenersResponseBodyListenersUDPListenerConfig();
            return TeaModel.build(map, self);
        }

        public DescribeLoadBalancerListenersResponseBodyListenersUDPListenerConfig setConnectionDrain(String connectionDrain) {
            this.connectionDrain = connectionDrain;
            return this;
        }
        public String getConnectionDrain() {
            return this.connectionDrain;
        }

        public DescribeLoadBalancerListenersResponseBodyListenersUDPListenerConfig setConnectionDrainTimeout(Integer connectionDrainTimeout) {
            this.connectionDrainTimeout = connectionDrainTimeout;
            return this;
        }
        public Integer getConnectionDrainTimeout() {
            return this.connectionDrainTimeout;
        }

        public DescribeLoadBalancerListenersResponseBodyListenersUDPListenerConfig setHealthCheck(String healthCheck) {
            this.healthCheck = healthCheck;
            return this;
        }
        public String getHealthCheck() {
            return this.healthCheck;
        }

        public DescribeLoadBalancerListenersResponseBodyListenersUDPListenerConfig setHealthCheckConnectPort(Integer healthCheckConnectPort) {
            this.healthCheckConnectPort = healthCheckConnectPort;
            return this;
        }
        public Integer getHealthCheckConnectPort() {
            return this.healthCheckConnectPort;
        }

        public DescribeLoadBalancerListenersResponseBodyListenersUDPListenerConfig setHealthCheckConnectTimeout(Integer healthCheckConnectTimeout) {
            this.healthCheckConnectTimeout = healthCheckConnectTimeout;
            return this;
        }
        public Integer getHealthCheckConnectTimeout() {
            return this.healthCheckConnectTimeout;
        }

        public DescribeLoadBalancerListenersResponseBodyListenersUDPListenerConfig setHealthCheckExp(String healthCheckExp) {
            this.healthCheckExp = healthCheckExp;
            return this;
        }
        public String getHealthCheckExp() {
            return this.healthCheckExp;
        }

        public DescribeLoadBalancerListenersResponseBodyListenersUDPListenerConfig setHealthCheckInterval(Integer healthCheckInterval) {
            this.healthCheckInterval = healthCheckInterval;
            return this;
        }
        public Integer getHealthCheckInterval() {
            return this.healthCheckInterval;
        }

        public DescribeLoadBalancerListenersResponseBodyListenersUDPListenerConfig setHealthCheckReq(String healthCheckReq) {
            this.healthCheckReq = healthCheckReq;
            return this;
        }
        public String getHealthCheckReq() {
            return this.healthCheckReq;
        }

        public DescribeLoadBalancerListenersResponseBodyListenersUDPListenerConfig setHealthyThreshold(Integer healthyThreshold) {
            this.healthyThreshold = healthyThreshold;
            return this;
        }
        public Integer getHealthyThreshold() {
            return this.healthyThreshold;
        }

        public DescribeLoadBalancerListenersResponseBodyListenersUDPListenerConfig setMasterSlaveServerGroupId(String masterSlaveServerGroupId) {
            this.masterSlaveServerGroupId = masterSlaveServerGroupId;
            return this;
        }
        public String getMasterSlaveServerGroupId() {
            return this.masterSlaveServerGroupId;
        }

        public DescribeLoadBalancerListenersResponseBodyListenersUDPListenerConfig setProxyProtocolV2Enabled(String proxyProtocolV2Enabled) {
            this.proxyProtocolV2Enabled = proxyProtocolV2Enabled;
            return this;
        }
        public String getProxyProtocolV2Enabled() {
            return this.proxyProtocolV2Enabled;
        }

        public DescribeLoadBalancerListenersResponseBodyListenersUDPListenerConfig setUnhealthyThreshold(Integer unhealthyThreshold) {
            this.unhealthyThreshold = unhealthyThreshold;
            return this;
        }
        public Integer getUnhealthyThreshold() {
            return this.unhealthyThreshold;
        }

    }

    public static class DescribeLoadBalancerListenersResponseBodyListeners extends TeaModel {
        /**
         * <p>The ID of the access control list (ACL).</p>
         * 
         * <strong>example:</strong>
         * <p>nacl-a2do9e413e0spzasx****</p>
         */
        @NameInMap("AclId")
        public String aclId;

        /**
         * <p>The IDs of the ACLs.</p>
         */
        @NameInMap("AclIds")
        public java.util.List<String> aclIds;

        /**
         * <p>Indicates whether access control is enabled. Valid values:</p>
         * <ul>
         * <li><strong>on</strong></li>
         * <li><strong>off</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("AclStatus")
        public String aclStatus;

        /**
         * <p>The type of access control. Valid values:</p>
         * <ul>
         * <li><strong>white</strong>: The listener forwards requests only from IP addresses and CIDR blocks on the whitelist. Your service may be adversely affected if the whitelist is not properly configured. If a whitelist is configured, the listener forwards requests only from IP addresses that are added to the whitelist.</li>
         * </ul>
         * <p>If you configure a whitelist but no IP address is added to the whitelist, the listener forwards all requests.</p>
         * <ul>
         * <li><strong>black</strong>: The listener blocks requests from IP addresses and CIDR blocks on the blacklist.</li>
         * </ul>
         * <p>If you configure a blacklist but no IP address is added to the blacklist, the listener forwards all requests.</p>
         * 
         * <strong>example:</strong>
         * <p>white</p>
         */
        @NameInMap("AclType")
        public String aclType;

        /**
         * <p>The port of the backend server.</p>
         * <blockquote>
         * <p> This parameter takes effect only when the <code>VServerGroupId</code> and <code>MasterSlaveServerGroupId</code> parameters are both empty.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("BackendServerPort")
        public Integer backendServerPort;

        /**
         * <p>The maximum bandwidth of the listener. Unit: Mbit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>-1</p>
         */
        @NameInMap("Bandwidth")
        public Integer bandwidth;

        /**
         * <p>The description of the listener.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The configurations of the HTTP listener.</p>
         */
        @NameInMap("HTTPListenerConfig")
        public DescribeLoadBalancerListenersResponseBodyListenersHTTPListenerConfig HTTPListenerConfig;

        /**
         * <p>The configurations of the HTTPS listener.</p>
         */
        @NameInMap("HTTPSListenerConfig")
        public DescribeLoadBalancerListenersResponseBodyListenersHTTPSListenerConfig HTTPSListenerConfig;

        /**
         * <p>The listener port.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("ListenerPort")
        public Integer listenerPort;

        /**
         * <p>The protocol used by the listener.</p>
         * 
         * <strong>example:</strong>
         * <p>http</p>
         */
        @NameInMap("ListenerProtocol")
        public String listenerProtocol;

        /**
         * <p>The ID of the CLB instance.</p>
         * 
         * <strong>example:</strong>
         * <p>lb-bp1b6c719dfa****</p>
         */
        @NameInMap("LoadBalancerId")
        public String loadBalancerId;

        /**
         * <p>The scheduling algorithm. Valid values:</p>
         * <ul>
         * <li><strong>wrr</strong>: Backend servers with higher weights receive more requests than those with lower weights.</li>
         * <li><strong>rr</strong>: Requests are distributed to backend servers in sequence.</li>
         * <li><strong>sch</strong>: consistent hashing that is based on source IP addresses. Requests from the same source IP address are distributed to the same backend server.</li>
         * <li><strong>tch</strong>: specifies consistent hashing based on the source IP address, destination IP address, source port, and destination port. Requests that have the same four factors are distributed to the same backend server.</li>
         * <li><strong>qch</strong>: specifies consistent hashing based on Quick UDP Internet Connection (QUIC) IDs. Requests that contain the same QUIC ID are scheduled to the same backend server.</li>
         * </ul>
         * <blockquote>
         * <p> Only high-performance CLB instances support the <strong>sch</strong>, <strong>tch</strong>, and <strong>qch</strong> consistent hashing algorithms.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>wrr</p>
         */
        @NameInMap("Scheduler")
        public String scheduler;

        /**
         * <p>The status of the listener. Valid values:</p>
         * <ul>
         * <li><strong>running</strong></li>
         * <li><strong>stopped</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>running</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The configurations of the TCP listener.</p>
         */
        @NameInMap("TCPListenerConfig")
        public DescribeLoadBalancerListenersResponseBodyListenersTCPListenerConfig TCPListenerConfig;

        /**
         * <p>A list of tags.</p>
         */
        @NameInMap("Tags")
        public java.util.List<DescribeLoadBalancerListenersResponseBodyListenersTags> tags;

        /**
         * <p>The configurations of the UDP listener.</p>
         */
        @NameInMap("UDPListenerConfig")
        public DescribeLoadBalancerListenersResponseBodyListenersUDPListenerConfig UDPListenerConfig;

        /**
         * <p>The ID of the vServer group associated with the listener.</p>
         * 
         * <strong>example:</strong>
         * <p>rsp-cige6j****</p>
         */
        @NameInMap("VServerGroupId")
        public String VServerGroupId;

        public static DescribeLoadBalancerListenersResponseBodyListeners build(java.util.Map<String, ?> map) throws Exception {
            DescribeLoadBalancerListenersResponseBodyListeners self = new DescribeLoadBalancerListenersResponseBodyListeners();
            return TeaModel.build(map, self);
        }

        public DescribeLoadBalancerListenersResponseBodyListeners setAclId(String aclId) {
            this.aclId = aclId;
            return this;
        }
        public String getAclId() {
            return this.aclId;
        }

        public DescribeLoadBalancerListenersResponseBodyListeners setAclIds(java.util.List<String> aclIds) {
            this.aclIds = aclIds;
            return this;
        }
        public java.util.List<String> getAclIds() {
            return this.aclIds;
        }

        public DescribeLoadBalancerListenersResponseBodyListeners setAclStatus(String aclStatus) {
            this.aclStatus = aclStatus;
            return this;
        }
        public String getAclStatus() {
            return this.aclStatus;
        }

        public DescribeLoadBalancerListenersResponseBodyListeners setAclType(String aclType) {
            this.aclType = aclType;
            return this;
        }
        public String getAclType() {
            return this.aclType;
        }

        public DescribeLoadBalancerListenersResponseBodyListeners setBackendServerPort(Integer backendServerPort) {
            this.backendServerPort = backendServerPort;
            return this;
        }
        public Integer getBackendServerPort() {
            return this.backendServerPort;
        }

        public DescribeLoadBalancerListenersResponseBodyListeners setBandwidth(Integer bandwidth) {
            this.bandwidth = bandwidth;
            return this;
        }
        public Integer getBandwidth() {
            return this.bandwidth;
        }

        public DescribeLoadBalancerListenersResponseBodyListeners setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeLoadBalancerListenersResponseBodyListeners setHTTPListenerConfig(DescribeLoadBalancerListenersResponseBodyListenersHTTPListenerConfig HTTPListenerConfig) {
            this.HTTPListenerConfig = HTTPListenerConfig;
            return this;
        }
        public DescribeLoadBalancerListenersResponseBodyListenersHTTPListenerConfig getHTTPListenerConfig() {
            return this.HTTPListenerConfig;
        }

        public DescribeLoadBalancerListenersResponseBodyListeners setHTTPSListenerConfig(DescribeLoadBalancerListenersResponseBodyListenersHTTPSListenerConfig HTTPSListenerConfig) {
            this.HTTPSListenerConfig = HTTPSListenerConfig;
            return this;
        }
        public DescribeLoadBalancerListenersResponseBodyListenersHTTPSListenerConfig getHTTPSListenerConfig() {
            return this.HTTPSListenerConfig;
        }

        public DescribeLoadBalancerListenersResponseBodyListeners setListenerPort(Integer listenerPort) {
            this.listenerPort = listenerPort;
            return this;
        }
        public Integer getListenerPort() {
            return this.listenerPort;
        }

        public DescribeLoadBalancerListenersResponseBodyListeners setListenerProtocol(String listenerProtocol) {
            this.listenerProtocol = listenerProtocol;
            return this;
        }
        public String getListenerProtocol() {
            return this.listenerProtocol;
        }

        public DescribeLoadBalancerListenersResponseBodyListeners setLoadBalancerId(String loadBalancerId) {
            this.loadBalancerId = loadBalancerId;
            return this;
        }
        public String getLoadBalancerId() {
            return this.loadBalancerId;
        }

        public DescribeLoadBalancerListenersResponseBodyListeners setScheduler(String scheduler) {
            this.scheduler = scheduler;
            return this;
        }
        public String getScheduler() {
            return this.scheduler;
        }

        public DescribeLoadBalancerListenersResponseBodyListeners setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeLoadBalancerListenersResponseBodyListeners setTCPListenerConfig(DescribeLoadBalancerListenersResponseBodyListenersTCPListenerConfig TCPListenerConfig) {
            this.TCPListenerConfig = TCPListenerConfig;
            return this;
        }
        public DescribeLoadBalancerListenersResponseBodyListenersTCPListenerConfig getTCPListenerConfig() {
            return this.TCPListenerConfig;
        }

        public DescribeLoadBalancerListenersResponseBodyListeners setTags(java.util.List<DescribeLoadBalancerListenersResponseBodyListenersTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<DescribeLoadBalancerListenersResponseBodyListenersTags> getTags() {
            return this.tags;
        }

        public DescribeLoadBalancerListenersResponseBodyListeners setUDPListenerConfig(DescribeLoadBalancerListenersResponseBodyListenersUDPListenerConfig UDPListenerConfig) {
            this.UDPListenerConfig = UDPListenerConfig;
            return this;
        }
        public DescribeLoadBalancerListenersResponseBodyListenersUDPListenerConfig getUDPListenerConfig() {
            return this.UDPListenerConfig;
        }

        public DescribeLoadBalancerListenersResponseBodyListeners setVServerGroupId(String VServerGroupId) {
            this.VServerGroupId = VServerGroupId;
            return this;
        }
        public String getVServerGroupId() {
            return this.VServerGroupId;
        }

    }

}
