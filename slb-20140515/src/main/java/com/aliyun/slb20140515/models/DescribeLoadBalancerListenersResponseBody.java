// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class DescribeLoadBalancerListenersResponseBody extends TeaModel {
    /**
     * <p>The list of listeners on the CLB instance.</p>
     * <br>
     * <p>>  This parameter is not returned if no listener is created on the CLB instance.</p>
     */
    @NameInMap("Listeners")
    public java.util.List<DescribeLoadBalancerListenersResponseBodyListeners> listeners;

    /**
     * <p>The number of entries returned per page.</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token that determines the start point of the query. Valid values:</p>
     * <br>
     * <p>*   If **NextToken** is empty, it indicates that no subsequent query is to be sent.</p>
     * <p>*   If a value is returned for **NextToken**, the value is the token that determines the start point of the next query.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
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
         * <p>The cookie that is configured on the server.</p>
         */
        @NameInMap("Cookie")
        public String cookie;

        /**
         * <p>The timeout period of a cookie. Unit: seconds.</p>
         * <br>
         * <p>Valid values: **1** to **86400**.</p>
         */
        @NameInMap("CookieTimeout")
        public Integer cookieTimeout;

        /**
         * <p>The listening port that is used to redirect HTTP requests to HTTPS.</p>
         * <br>
         * <p>>  If the **ListenerForward** parameter is set to **off**, this parameter is not displayed.</p>
         */
        @NameInMap("ForwardPort")
        public Integer forwardPort;

        /**
         * <p>Indicates whether Gzip compression is enabled. Valid values:</p>
         * <br>
         * <p>*   **on**: yes</p>
         * <p>*   **off**: no</p>
         */
        @NameInMap("Gzip")
        public String gzip;

        /**
         * <p>Indicates whether the health check feature is enabled. Valid values:</p>
         * <br>
         * <p>*   **on**: yes</p>
         * <p>*   **off**: no</p>
         */
        @NameInMap("HealthCheck")
        public String healthCheck;

        /**
         * <p>The port that is used for health checks.</p>
         * <br>
         * <p>>  This parameter takes effect when the **HealthCheck** parameter is set to **on**.</p>
         */
        @NameInMap("HealthCheckConnectPort")
        public Integer healthCheckConnectPort;

        /**
         * <p>The domain name that is used for health checks.</p>
         */
        @NameInMap("HealthCheckDomain")
        public String healthCheckDomain;

        /**
         * <p>The HTTP status codes that are used to determine whether the backend server passes the health check.</p>
         */
        @NameInMap("HealthCheckHttpCode")
        public String healthCheckHttpCode;

        /**
         * <p>The HTTP version that is used for health checks.</p>
         */
        @NameInMap("HealthCheckHttpVersion")
        public String healthCheckHttpVersion;

        /**
         * <p>The interval at which health checks are performed. Unit: seconds.</p>
         */
        @NameInMap("HealthCheckInterval")
        public Integer healthCheckInterval;

        /**
         * <p>The health check method. Valid values: **head** and **get**.</p>
         */
        @NameInMap("HealthCheckMethod")
        public String healthCheckMethod;

        /**
         * <p>The maximum timeout period of a health check. Unit: seconds.</p>
         */
        @NameInMap("HealthCheckTimeout")
        public Integer healthCheckTimeout;

        /**
         * <p>The protocol that is used for health checks.</p>
         */
        @NameInMap("HealthCheckType")
        public String healthCheckType;

        /**
         * <p>The URI that is used for health checks.</p>
         */
        @NameInMap("HealthCheckURI")
        public String healthCheckURI;

        /**
         * <p>The number of times that an unhealthy backend server must consecutively pass health checks before it is declared healthy. In this case, the health status is changed from **fail** to **success**.</p>
         * <br>
         * <p>Valid values: **2** to **10**.</p>
         */
        @NameInMap("HealthyThreshold")
        public Integer healthyThreshold;

        /**
         * <p>The timeout period of an idle connection. Unit: seconds. Valid values: **1** to **60**.</p>
         * <br>
         * <p>If no request is received within the specified timeout period, CLB closes the connection. When a request is received, CLB establishes a new connection.</p>
         */
        @NameInMap("IdleTimeout")
        public Integer idleTimeout;

        /**
         * <p>Indicates whether HTTP-to-HTTPS redirection is enabled. Valid values:</p>
         * <br>
         * <p>*   **on**: yes</p>
         * <p>*   **off**: no</p>
         */
        @NameInMap("ListenerForward")
        public String listenerForward;

        /**
         * <p>The timeout period of a request. Unit: seconds. Valid values: **1** to **180**.</p>
         * <br>
         * <p>If no response is received from a backend server during the request timeout period, CLB sends the `HTTP 504` status code to the client.</p>
         */
        @NameInMap("RequestTimeout")
        public Integer requestTimeout;

        /**
         * <p>Indicates whether session persistence is enabled. Valid values:</p>
         * <br>
         * <p>*   **on**: yes</p>
         * <p>*   **off**: no</p>
         */
        @NameInMap("StickySession")
        public String stickySession;

        /**
         * <p>The method that is used to handle a cookie. Valid values:</p>
         * <br>
         * <p>*   **insert**: inserts a cookie. CLB inserts a cookie (SERVERID) into the first HTTP or HTTPS response that is sent to a client. The next request from the client contains this cookie, and the listener forwards this request to the recorded backend server.</p>
         * <p>*   **server**: rewrites a cookie. When CLB detects a user-defined cookie, it overwrites the original cookie with the user-defined cookie. The next request from the client carries the user-defined cookie, and the listener will distribute the request to the recorded backend server.</p>
         */
        @NameInMap("StickySessionType")
        public String stickySessionType;

        /**
         * <p>The number of times that a healthy backend server must consecutively fail health checks before it is declared unhealthy. In this case, the health status is changed from **success** to **fail**.</p>
         * <br>
         * <p>Valid values: **2** to **10**.</p>
         */
        @NameInMap("UnhealthyThreshold")
        public Integer unhealthyThreshold;

        /**
         * <p>Indicates whether the `XForwardedFor` header is used to retrieve client IP addresses. Valid values:</p>
         * <br>
         * <p>*   **on**: yes</p>
         * <p>*   **off**: no</p>
         */
        @NameInMap("XForwardedFor")
        public String XForwardedFor;

        /**
         * <p>Indicates whether the `XForwardedFor_ClientSrcPort` header is used to retrieve the client port. Valid values:</p>
         * <br>
         * <p>*   **on**: yes</p>
         * <p>*   **off**: no</p>
         */
        @NameInMap("XForwardedFor_ClientSrcPort")
        public String XForwardedFor_ClientSrcPort;

        /**
         * <p>Indicates whether the `SLB-ID` header is used to retrieve the ID of the CLB instance. Valid values:</p>
         * <br>
         * <p>*   **on**: yes</p>
         * <p>*   **off**: no</p>
         */
        @NameInMap("XForwardedFor_SLBID")
        public String XForwardedFor_SLBID;

        /**
         * <p>Indicates whether the `SLB-IP` header is used to retrieve the virtual IP address requested by the client. Valid values:</p>
         * <br>
         * <p>*   **on**: yes</p>
         * <p>*   **off**: no</p>
         */
        @NameInMap("XForwardedFor_SLBIP")
        public String XForwardedFor_SLBIP;

        /**
         * <p>Indicates whether the `XForwardedFor_SLBPORT` header is used to retrieve the listening port. Valid values:</p>
         * <br>
         * <p>*   **on**: yes</p>
         * <p>*   **off**: no</p>
         */
        @NameInMap("XForwardedFor_SLBPORT")
        public String XForwardedFor_SLBPORT;

        /**
         * <p>Indicates whether the `X-Forwarded-Proto` header is used to retrieve the listening protocol. Valid values:</p>
         * <br>
         * <p>*   **on**: yes</p>
         * <p>*   **off**: no</p>
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
         * <p>The ID of the certificate authority (CA) certificate.</p>
         */
        @NameInMap("CACertificateId")
        public String CACertificateId;

        /**
         * <p>The cookie that is configured on the server.</p>
         */
        @NameInMap("Cookie")
        public String cookie;

        /**
         * <p>The timeout period of a cookie. Unit: seconds.</p>
         * <br>
         * <p>Valid values: **1** to **86400**.</p>
         */
        @NameInMap("CookieTimeout")
        public Integer cookieTimeout;

        /**
         * <p>Indicates whether `HTTP 2.0` is enabled. Valid values:</p>
         * <br>
         * <p>*   **on**: yes</p>
         * <p>*   **off**: no</p>
         */
        @NameInMap("EnableHttp2")
        public String enableHttp2;

        /**
         * <p>Indicates whether Gzip compression is enabled. Valid values:</p>
         * <br>
         * <p>*   **on**: yes</p>
         * <p>*   **off**: no</p>
         */
        @NameInMap("Gzip")
        public String gzip;

        /**
         * <p>Indicates whether the health check feature is enabled. Valid values:</p>
         * <br>
         * <p>*   **on**: yes</p>
         * <p>*   **off**: no</p>
         */
        @NameInMap("HealthCheck")
        public String healthCheck;

        /**
         * <p>The port that is used for health checks.</p>
         */
        @NameInMap("HealthCheckConnectPort")
        public Integer healthCheckConnectPort;

        /**
         * <p>The domain name that is used for health checks.</p>
         */
        @NameInMap("HealthCheckDomain")
        public String healthCheckDomain;

        /**
         * <p>The HTTP status codes that are used to determine whether the backend server passes the health check.</p>
         */
        @NameInMap("HealthCheckHttpCode")
        public String healthCheckHttpCode;

        /**
         * <p>The HTTP version that is used for health checks.</p>
         */
        @NameInMap("HealthCheckHttpVersion")
        public String healthCheckHttpVersion;

        /**
         * <p>The interval at which health checks are performed. Unit: seconds.</p>
         */
        @NameInMap("HealthCheckInterval")
        public Integer healthCheckInterval;

        /**
         * <p>The health check method.</p>
         */
        @NameInMap("HealthCheckMethod")
        public String healthCheckMethod;

        /**
         * <p>The maximum timeout period of a health check. Unit: seconds.</p>
         */
        @NameInMap("HealthCheckTimeout")
        public Integer healthCheckTimeout;

        /**
         * <p>The protocol that is used for health checks.</p>
         */
        @NameInMap("HealthCheckType")
        public String healthCheckType;

        /**
         * <p>The URI that is used for health checks.</p>
         */
        @NameInMap("HealthCheckURI")
        public String healthCheckURI;

        /**
         * <p>The number of times that an unhealthy backend server must consecutively pass health checks before it is declared healthy. In this case, the health status is changed from **fail** to **success**.</p>
         * <br>
         * <p>Valid values: **2** to **10**.</p>
         */
        @NameInMap("HealthyThreshold")
        public Integer healthyThreshold;

        /**
         * <p>The timeout period of an idle connection. Unit: seconds. Valid values: **1** to **60**.</p>
         * <br>
         * <p>If no request is received within the specified timeout period, CLB closes the connection. When a request is received, CLB establishes a new connection.</p>
         */
        @NameInMap("IdleTimeout")
        public Integer idleTimeout;

        /**
         * <p>The request timeout period. Unit: seconds. Valid values: **1** to **180**.</p>
         * <br>
         * <p>If no response is received from a backend server during the request timeout period, CLB sends the `HTTP 504` status code to the client.</p>
         */
        @NameInMap("RequestTimeout")
        public Integer requestTimeout;

        /**
         * <p>The ID of the server certificate.</p>
         */
        @NameInMap("ServerCertificateId")
        public String serverCertificateId;

        /**
         * <p>Indicates whether session persistence is enabled. Valid values:</p>
         * <br>
         * <p>*   **on**: yes</p>
         * <p>*   **off**: no</p>
         */
        @NameInMap("StickySession")
        public String stickySession;

        /**
         * <p>The method that is used to handle a cookie.</p>
         * <br>
         * <p>*   **insert**: inserts a cookie. CLB inserts a cookie (SERVERID) into the first HTTP or HTTPS response that is sent to a client. The next request from the client contains this cookie, and the listener forwards this request to the recorded backend server.</p>
         * <p>*   **server**: rewrites a cookie. When CLB detects a user-defined cookie, it overwrites the original cookie with the user-defined cookie. The next request from the client carries the user-defined cookie, and the listener will distribute the request to the recorded backend server.</p>
         */
        @NameInMap("StickySessionType")
        public String stickySessionType;

        /**
         * <p>The Transport Layer Security (TLS) security policy. Each security policy contains TLS protocol versions and cipher suites available for HTTPS.</p>
         * <br>
         * <p>*   **tls_cipher_policy_1_0**:</p>
         * <br>
         * <p>    Supported TLS versions: TLS 1.0, TLS 1.1, and TLS 1.2</p>
         * <br>
         * <p>    Supported cipher suites: ECDHE-RSA-AES128-GCM-SHA256, ECDHE-RSA-AES256-GCM-SHA384, ECDHE-RSA-AES128-SHA256, ECDHE-RSA-AES256-SHA384, AES128-GCM-SHA256, AES256-GCM-SHA384, AES128-SHA256, AES256-SHA256, ECDHE-RSA-AES128-SHA, ECDHE-RSA-AES256-SHA, AES128-SHA, AES256-SHA, and DES-CBC3-SHA</p>
         * <br>
         * <p>*   **tls_cipher_policy_1_1**:</p>
         * <br>
         * <p>    Supported TLS versions: TLS 1.1 and TLS 1.2</p>
         * <br>
         * <p>    Supported cipher suites: ECDHE-RSA-AES128-GCM-SHA256, ECDHE-RSA-AES256-GCM-SHA384, ECDHE-RSA-AES128-SHA256, ECDHE-RSA-AES256-SHA384, AES128-GCM-SHA256, AES256-GCM-SHA384, AES128-SHA256, AES256-SHA256, ECDHE-RSA-AES128-SHA, ECDHE-RSA-AES256-SHA, AES128-SHA, AES256-SHA, and DES-CBC3-SHA</p>
         * <br>
         * <p>*   **tls_cipher_policy_1_2**</p>
         * <br>
         * <p>    Supported TLS version: TLS 1.2</p>
         * <br>
         * <p>    Supported cipher suites: ECDHE-RSA-AES128-GCM-SHA256, ECDHE-RSA-AES256-GCM-SHA384, ECDHE-RSA-AES128-SHA256, ECDHE-RSA-AES256-SHA384, AES128-GCM-SHA256, AES256-GCM-SHA384, AES128-SHA256, AES256-SHA256, ECDHE-RSA-AES128-SHA, ECDHE-RSA-AES256-SHA, AES128-SHA, AES256-SHA, and DES-CBC3-SHA</p>
         * <br>
         * <p>*   **tls_cipher_policy_1_2_strict**</p>
         * <br>
         * <p>    Supported TLS version: TLS 1.2</p>
         * <br>
         * <p>    Supported cipher suites: ECDHE-RSA-AES128-GCM-SHA256, ECDHE-RSA-AES256-GCM-SHA384, ECDHE-RSA-AES128-SHA256, ECDHE-RSA-AES256-SHA384, ECDHE-RSA-AES128-SHA, and ECDHE-RSA-AES256-SHA</p>
         * <br>
         * <p>*   **tls_cipher_policy_1_2_strict_with_1_3**</p>
         * <br>
         * <p>    Supported TLS versions: TLS 1.2 and TLS 1.3</p>
         * <br>
         * <p>    Supported cipher suites: TLS_AES_128_GCM_SHA256, TLS_AES_256_GCM_SHA384, TLS_CHACHA20_POLY1305_SHA256, TLS_AES_128_CCM_SHA256, TLS_AES_128_CCM_8_SHA256, ECDHE-ECDSA-AES128-GCM-SHA256, ECDHE-ECDSA-AES256-GCM-SHA384, ECDHE-ECDSA-AES128-SHA256, ECDHE-ECDSA-AES256-SHA384, ECDHE-RSA-AES128-GCM-SHA256, ECDHE-RSA-AES256-GCM-SHA384, ECDHE-RSA-AES128-SHA256, ECDHE-RSA-AES256-SHA384, ECDHE-ECDSA-AES128-SHA, ECDHE-ECDSA-AES256-SHA, ECDHE-RSA-AES128-SHA, and ECDHE-RSA-AES256-SHA</p>
         */
        @NameInMap("TLSCipherPolicy")
        public String TLSCipherPolicy;

        /**
         * <p>The number of times that a healthy backend server must consecutively fail health checks before it is declared unhealthy. In this case, the health status is changed from **success** to **fail**.</p>
         * <br>
         * <p>Valid values: **2** to **10**.</p>
         */
        @NameInMap("UnhealthyThreshold")
        public Integer unhealthyThreshold;

        /**
         * <p>Indicates whether the `XForwardedFor` header is used to retrieve client IP addresses. Valid values:</p>
         * <br>
         * <p>*   **on**: yes</p>
         * <p>*   **off**: no</p>
         */
        @NameInMap("XForwardedFor")
        public String XForwardedFor;

        /**
         * <p>Indicates whether the `XForwardedFor_ClientCertClientVerify` header is used to retrieve the verification result of the client certificate. Valid values:</p>
         * <br>
         * <p>*   **on**: yes</p>
         * <p>*   **off**: no</p>
         */
        @NameInMap("XForwardedFor_ClientCertClientVerify")
        public String XForwardedFor_ClientCertClientVerify;

        /**
         * <p>Indicates whether the `XForwardedFor_ClientCertFingerprint` header is used to retrieve the fingerprint of the client certificate. Valid values:</p>
         * <br>
         * <p>*   **on**: yes</p>
         * <p>*   **off**: no</p>
         */
        @NameInMap("XForwardedFor_ClientCertFingerprint")
        public String XForwardedFor_ClientCertFingerprint;

        /**
         * <p>Indicates whether the `XForwardedFor_ClientCertIssuerDN` header is used to retrieve information about the authority that issues the client certificate. Valid values:</p>
         * <br>
         * <p>*   **on**: yes</p>
         * <p>*   **off**: no</p>
         */
        @NameInMap("XForwardedFor_ClientCertIssuerDN")
        public String XForwardedFor_ClientCertIssuerDN;

        /**
         * <p>Indicates whether the `XForwardedFor_ClientCertSubjectDN` header is used to retrieve information about the owner of the client certificate. Valid values:</p>
         * <br>
         * <p>*   **on**: yes</p>
         * <p>*   **off**: no</p>
         */
        @NameInMap("XForwardedFor_ClientCertSubjectDN")
        public String XForwardedFor_ClientCertSubjectDN;

        /**
         * <p>Indicates whether the `XForwardedFor_ClientSrcPort` header is used to retrieve the client port. Valid values:</p>
         * <br>
         * <p>*   **on**: yes</p>
         * <p>*   **off**: no</p>
         */
        @NameInMap("XForwardedFor_ClientSrcPort")
        public String XForwardedFor_ClientSrcPort;

        /**
         * <p>Indicates whether the `SLB-ID` header is used to retrieve the ID of the CLB instance. Valid values:</p>
         * <br>
         * <p>*   **on**: yes</p>
         * <p>*   **off**: no</p>
         */
        @NameInMap("XForwardedFor_SLBID")
        public String XForwardedFor_SLBID;

        /**
         * <p>Indicates whether the `SLB-IP` header is used to retrieve the virtual IP address requested by the client. Valid values:</p>
         * <br>
         * <p>*   **on**: yes</p>
         * <p>*   **off**: no</p>
         */
        @NameInMap("XForwardedFor_SLBIP")
        public String XForwardedFor_SLBIP;

        /**
         * <p>Indicates whether the `XForwardedFor_SLBPORT` header is used to retrieve the listening port. Valid values:</p>
         * <br>
         * <p>*   **on**: yes</p>
         * <p>*   **off**: no</p>
         */
        @NameInMap("XForwardedFor_SLBPORT")
        public String XForwardedFor_SLBPORT;

        /**
         * <p>Indicates whether the `X-Forwarded-Proto` header is used to retrieve the listening protocol. Valid values:</p>
         * <br>
         * <p>*   **on**: yes</p>
         * <p>*   **off**: no</p>
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
         * <br>
         * <p>*   **on**: yes</p>
         * <p>*   **off**: no</p>
         */
        @NameInMap("ConnectionDrain")
        public String connectionDrain;

        /**
         * <p>The timeout period of connection draining. Unit: seconds.</p>
         * <br>
         * <p>Value values: **10 to 900**.</p>
         */
        @NameInMap("ConnectionDrainTimeout")
        public Integer connectionDrainTimeout;

        /**
         * <p>The timeout period of a connection. Unit: seconds.</p>
         */
        @NameInMap("EstablishedTimeout")
        public Integer establishedTimeout;

        /**
         * <p>Indicates whether the health check feature is enabled. Valid values:</p>
         * <br>
         * <p>*   **on**: yes</p>
         * <p>*   **off**: no</p>
         */
        @NameInMap("HealthCheck")
        public String healthCheck;

        /**
         * <p>The port that is used for health checks.</p>
         */
        @NameInMap("HealthCheckConnectPort")
        public Integer healthCheckConnectPort;

        /**
         * <p>The timeout period of health checks. Unit: seconds.</p>
         * <br>
         * <p>Valid values: **1** to **300**.</p>
         */
        @NameInMap("HealthCheckConnectTimeout")
        public Integer healthCheckConnectTimeout;

        /**
         * <p>The domain name that is used for health checks.</p>
         */
        @NameInMap("HealthCheckDomain")
        public String healthCheckDomain;

        /**
         * <p>The HTTP status codes that are used to determine whether the backend server passes the health check.</p>
         */
        @NameInMap("HealthCheckHttpCode")
        public String healthCheckHttpCode;

        /**
         * <p>The interval between two consecutive health checks. Unit: seconds.</p>
         */
        @NameInMap("HealthCheckInterval")
        public Integer healthCheckInterval;

        /**
         * <p>The health check method.</p>
         */
        @NameInMap("HealthCheckMethod")
        public String healthCheckMethod;

        /**
         * <p>The protocol that is used for health checks.</p>
         */
        @NameInMap("HealthCheckType")
        public String healthCheckType;

        /**
         * <p>The URI that is used for health checks.</p>
         */
        @NameInMap("HealthCheckURI")
        public String healthCheckURI;

        /**
         * <p>The number of times that an unhealthy backend server must consecutively pass health checks before it is declared healthy. In this case, the health status is changed from **fail** to **success**.</p>
         * <br>
         * <p>Valid values: **2** to **10**.</p>
         */
        @NameInMap("HealthyThreshold")
        public Integer healthyThreshold;

        /**
         * <p>The ID of the primary/secondary server group that is associated with the listener.</p>
         */
        @NameInMap("MasterSlaveServerGroupId")
        public String masterSlaveServerGroupId;

        /**
         * <p>Indicates whether session persistence is enabled. Unit: seconds.</p>
         * <br>
         * <p>Valid values: **0** to **3600**.</p>
         * <br>
         * <p>**0** indicates that session persistence is disabled.</p>
         */
        @NameInMap("PersistenceTimeout")
        public Integer persistenceTimeout;

        /**
         * <p>Indicates whether the Proxy protocol is used to pass client IP addresses to backend servers. Valid values:</p>
         * <br>
         * <p>*   **true**: yes</p>
         * <p>*   **false**: no</p>
         */
        @NameInMap("ProxyProtocolV2Enabled")
        public String proxyProtocolV2Enabled;

        /**
         * <p>The number of times that a healthy backend server must consecutively fail health checks before it is declared unhealthy. In this case, the health status is changed from **success** to **fail**.</p>
         * <br>
         * <p>Valid values: **2** to **10**.</p>
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
         */
        @NameInMap("TagKey")
        public String tagKey;

        /**
         * <p>The tag value.</p>
         * <br>
         * <p>For more information about how to obtain a tag value, see [DescribeTagKeyList](https://help.aliyun.com/document_detail/145557.html).</p>
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
         * <br>
         * <p>*   **on**: yes</p>
         * <p>*   **off**: no</p>
         */
        @NameInMap("ConnectionDrain")
        public String connectionDrain;

        /**
         * <p>The timeout period of connection draining. Unit: seconds.</p>
         * <br>
         * <p>Value values: **10 to 900**.</p>
         */
        @NameInMap("ConnectionDrainTimeout")
        public Integer connectionDrainTimeout;

        /**
         * <p>Indicates whether the health check feature is enabled. Valid values:</p>
         * <br>
         * <p>*   **on**: yes</p>
         * <p>*   **off**: no</p>
         */
        @NameInMap("HealthCheck")
        public String healthCheck;

        /**
         * <p>The port that is used for health checks.</p>
         */
        @NameInMap("HealthCheckConnectPort")
        public Integer healthCheckConnectPort;

        /**
         * <p>The timeout period for a health check response.</p>
         */
        @NameInMap("HealthCheckConnectTimeout")
        public Integer healthCheckConnectTimeout;

        /**
         * <p>The response string for UDP listener health checks.</p>
         */
        @NameInMap("HealthCheckExp")
        public String healthCheckExp;

        /**
         * <p>The interval between two consecutive health checks. Unit: seconds.</p>
         */
        @NameInMap("HealthCheckInterval")
        public Integer healthCheckInterval;

        /**
         * <p>The request string for UDP listener health checks.</p>
         */
        @NameInMap("HealthCheckReq")
        public String healthCheckReq;

        /**
         * <p>The number of times that a backend server must consecutively pass health checks before it is declared healthy.</p>
         */
        @NameInMap("HealthyThreshold")
        public Integer healthyThreshold;

        /**
         * <p>The ID of the primary/secondary server group that is associated with the listener.</p>
         */
        @NameInMap("MasterSlaveServerGroupId")
        public String masterSlaveServerGroupId;

        /**
         * <p>Indicates whether the Proxy protocol is used to pass client IP addresses to backend servers. Valid values:</p>
         * <br>
         * <p>*   **true**: yes</p>
         * <p>*   **false**: no</p>
         */
        @NameInMap("ProxyProtocolV2Enabled")
        public String proxyProtocolV2Enabled;

        /**
         * <p>The number of times that a backend server must consecutively fail health checks before it is declared unhealthy.</p>
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
         * <p>The ID of the network ACL.</p>
         */
        @NameInMap("AclId")
        public String aclId;

        /**
         * <p>Indicates whether access control is enabled. Valid values:</p>
         * <br>
         * <p>*   **on**: yes</p>
         * <p>*   **off**: no</p>
         */
        @NameInMap("AclStatus")
        public String aclStatus;

        /**
         * <p>The type of the network access control list (ACL). Valid values:</p>
         * <br>
         * <p>*   **white**: a whitelist. Only requests from the IP addresses or CIDR blocks in the network ACL are forwarded. Whitelists apply to scenarios in which you want to allow only specific IP addresses to access an application. Your service may be adversely affected if the whitelist is not properly configured. After a whitelist is configured, only requests from IP addresses that are added to the whitelist are forwarded by the listener.</p>
         * <br>
         * <p>If you enable a whitelist but do not add an IP address to the whitelist, the listener forwards all requests.</p>
         * <br>
         * <p>*   **black**: a blacklist. All requests from the IP addresses or CIDR blocks in the network ACL are denied. A blacklist applies to scenarios in which you want to deny access from specific IP addresses.</p>
         * <br>
         * <p>If a blacklist is configured for a listener but no IP address is added to the blacklist, the listener forwards all requests.</p>
         */
        @NameInMap("AclType")
        public String aclType;

        /**
         * <p>The port of the backend server.</p>
         * <br>
         * <p>>  This parameter takes effect when the `VServerGroupId` parameter and the `MasterSlaveServerGroupId` parameter are empty.</p>
         */
        @NameInMap("BackendServerPort")
        public Integer backendServerPort;

        /**
         * <p>The maximum bandwidth of the listener. Unit: Mbit/s. Valid values:</p>
         * <br>
         * <p>*   **-1**: If -1 is returned, it indicates that the bandwidth of the listener is unlimited.</p>
         * <p>*   **1 to 5120**: If a value from 1 to 5120 is returned, the value indicates the maximum bandwidth of the listener. The sum of the maximum bandwidth of all listeners added to a CLB instance does not exceed the maximum bandwidth of the CLB instance.</p>
         */
        @NameInMap("Bandwidth")
        public Integer bandwidth;

        /**
         * <p>The description of the listener.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The configuration of the HTTP listener.</p>
         */
        @NameInMap("HTTPListenerConfig")
        public DescribeLoadBalancerListenersResponseBodyListenersHTTPListenerConfig HTTPListenerConfig;

        /**
         * <p>The configuration of the HTTPS listener.</p>
         */
        @NameInMap("HTTPSListenerConfig")
        public DescribeLoadBalancerListenersResponseBodyListenersHTTPSListenerConfig HTTPSListenerConfig;

        /**
         * <p>The listening port.</p>
         */
        @NameInMap("ListenerPort")
        public Integer listenerPort;

        /**
         * <p>The protocol used by the listener.</p>
         */
        @NameInMap("ListenerProtocol")
        public String listenerProtocol;

        /**
         * <p>The ID of the CLB instance.</p>
         */
        @NameInMap("LoadBalancerId")
        public String loadBalancerId;

        /**
         * <p>The scheduling algorithm. Valid values:</p>
         * <br>
         * <p>*   **wrr**: Backend servers with higher weights receive more requests than those with lower weights.</p>
         * <p>*   **rr**: Requests are distributed to backend servers in sequence.</p>
         */
        @NameInMap("Scheduler")
        public String scheduler;

        /**
         * <p>The status of the listener. Valid values:</p>
         * <br>
         * <p>*   **running**: The listener runs as expected.</p>
         * <p>*   **stopped**: The listener is disabled.</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The configuration of the TCP listener.</p>
         */
        @NameInMap("TCPListenerConfig")
        public DescribeLoadBalancerListenersResponseBodyListenersTCPListenerConfig TCPListenerConfig;

        /**
         * <p>The tags.</p>
         */
        @NameInMap("Tags")
        public java.util.List<DescribeLoadBalancerListenersResponseBodyListenersTags> tags;

        /**
         * <p>The configuration of the UDP listener.</p>
         */
        @NameInMap("UDPListenerConfig")
        public DescribeLoadBalancerListenersResponseBodyListenersUDPListenerConfig UDPListenerConfig;

        /**
         * <p>The ID of the vServer group that is associated with the listener.</p>
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
