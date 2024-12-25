// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class DescribeLoadBalancerHTTPSListenerAttributeResponseBody extends TeaModel {
    /**
     * <p>The ID of the network ACL that is associated with a listener.</p>
     * <blockquote>
     * <p>This parameter is required when <strong>AclStatus</strong> is set to <strong>on</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>nacl-a2do9e413e0spzasx****</p>
     */
    @NameInMap("AclId")
    public String aclId;

    @NameInMap("AclIds")
    public DescribeLoadBalancerHTTPSListenerAttributeResponseBodyAclIds aclIds;

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
     * <p>The type of the access control list (ACL). Valid values:</p>
     * <ul>
     * <li><strong>white</strong>: a whitelist. Only requests from the IP addresses or CIDR blocks in the ACL are forwarded. Whitelists apply to scenarios where you want to allow only specific IP addresses to access an application. Your service may be adversely affected if the whitelist is not properly configured. If a whitelist is configured, only requests from IP addresses that are added to the whitelist are forwarded by the listener.</li>
     * </ul>
     * <p>If you enable a whitelist but do not add an IP address to the ACL, the listener forwards all requests.</p>
     * <ul>
     * <li><strong>black</strong>: a blacklist. All requests from the IP addresses or CIDR blocks in the network ACL are rejected. Blacklists apply to scenarios where you want to block access from specified IP addresses to an application.</li>
     * </ul>
     * <p>If a blacklist is configured for a listener but no IP address is added to the blacklist, the listener forwards all requests.</p>
     * <blockquote>
     * <p>This parameter is required when <strong>AclStatus</strong> is set to <strong>on</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>white</p>
     */
    @NameInMap("AclType")
    public String aclType;

    /**
     * <p>The backend port that is used by the CLB instance.</p>
     * 
     * <strong>example:</strong>
     * <p>8080</p>
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
     * <p>The ID of the certification authority (CA) certificate.</p>
     * 
     * <strong>example:</strong>
     * <p>idkp-234-cn-test-0**</p>
     */
    @NameInMap("CACertificateId")
    public String CACertificateId;

    /**
     * <p>The cookie that is configured on the server.</p>
     * 
     * <strong>example:</strong>
     * <p>B490B5EBF6F3CD402E515D22BCDA1598</p>
     */
    @NameInMap("Cookie")
    public String cookie;

    /**
     * <p>The timeout period of a cookie.</p>
     * 
     * <strong>example:</strong>
     * <p>500</p>
     */
    @NameInMap("CookieTimeout")
    public Integer cookieTimeout;

    /**
     * <p>The name of the listener.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>A list of additional certificates.</p>
     */
    @NameInMap("DomainExtensions")
    public DescribeLoadBalancerHTTPSListenerAttributeResponseBodyDomainExtensions domainExtensions;

    /**
     * <p>Indicates whether <code>HTTP/2</code> is used. Valid values:</p>
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
     * <p>Indicates whether <code>Gzip</code> compression is enabled. Valid values:</p>
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
     * <p>This parameter is required when <strong>HealthCheck</strong> is set to <strong>on</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>8080</p>
     */
    @NameInMap("HealthCheckConnectPort")
    public Integer healthCheckConnectPort;

    /**
     * <p>The domain name that you want to use for health checks.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://www.test.com">www.test.com</a></p>
     */
    @NameInMap("HealthCheckDomain")
    public String healthCheckDomain;

    /**
     * <p>The HTTP status code for a successful health check.</p>
     * 
     * <strong>example:</strong>
     * <p>http_2xx,http_3xx</p>
     */
    @NameInMap("HealthCheckHttpCode")
    public String healthCheckHttpCode;

    /**
     * <p>The interval at which health checks are performed. Unit: seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("HealthCheckInterval")
    public Integer healthCheckInterval;

    /**
     * <p>The health check method used by HTTP listeners. Valid values: <strong>head</strong> and <strong>get</strong>.</p>
     * <blockquote>
     * <p>This parameter is available only when <strong>HealthCheck</strong> is set to <strong>on</strong>.</p>
     * </blockquote>
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
     * <p>The URL path that is used for health checks.</p>
     * 
     * <strong>example:</strong>
     * <p>/test/index.html</p>
     */
    @NameInMap("HealthCheckURI")
    public String healthCheckURI;

    /**
     * <p>The healthy threshold.</p>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("HealthyThreshold")
    public Integer healthyThreshold;

    /**
     * <p>The timeout period of an idle connection. Valid values: <strong>1</strong> to <strong>60</strong>. Default value: <strong>15</strong>. Unit: seconds.</p>
     * <p>If no request is received within the specified timeout period, CLB closes the connection. When a request is received, CLB establishes a new connection.</p>
     * 
     * <strong>example:</strong>
     * <p>23</p>
     */
    @NameInMap("IdleTimeout")
    public Integer idleTimeout;

    /**
     * <p>The frontend port that is used by the CLB instance.</p>
     * 
     * <strong>example:</strong>
     * <p>80</p>
     */
    @NameInMap("ListenerPort")
    public Integer listenerPort;

    /**
     * <p>The CLB instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>lb-bp1mxu5r8lau****</p>
     */
    @NameInMap("LoadBalancerId")
    public String loadBalancerId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>365F4154-92F6-4AE4-92F8-7FF3********</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The timeout period of a request. Valid values: <strong>1</strong> to <strong>180</strong>. Default value: <strong>60</strong>. Unit: seconds.</p>
     * <p>If no response is received from a backend server within the specified timeout period, CLB returns the HTTP 504 status code to the client.</p>
     * 
     * <strong>example:</strong>
     * <p>43</p>
     */
    @NameInMap("RequestTimeout")
    public Integer requestTimeout;

    /**
     * <p>The list of forwarding rules that are associated with the listener.</p>
     */
    @NameInMap("Rules")
    public DescribeLoadBalancerHTTPSListenerAttributeResponseBodyRules rules;

    /**
     * <p>The routing algorithm. Valid values: <strong>wrr</strong> and <strong>rr</strong>.</p>
     * <ul>
     * <li><strong>wrr</strong>: Backend servers that have higher weights receive more requests than backend servers that have lower weights.</li>
     * <li><strong>rr</strong>: Requests are distributed to backend servers in sequence.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>wrr</p>
     */
    @NameInMap("Scheduler")
    public String scheduler;

    /**
     * <p>Indicates whether the listener is in the Secure state. Valid values:</p>
     * <ul>
     * <li><strong>on</strong></li>
     * <li><strong>off</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("SecurityStatus")
    public String securityStatus;

    /**
     * <p>The ID of the server certificate.</p>
     * 
     * <strong>example:</strong>
     * <p>idkp-123-cn-test-0**</p>
     */
    @NameInMap("ServerCertificateId")
    public String serverCertificateId;

    /**
     * <p>The status of the listener. Valid values:</p>
     * <ul>
     * <li><strong>running</strong></li>
     * <li><strong>stopped</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>stopped</p>
     */
    @NameInMap("Status")
    public String status;

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
     * <p>The method that is used to handle a cookie.</p>
     * <p>Valid values: <strong>insert</strong> and <strong>server</strong>.</p>
     * <ul>
     * <li><p><strong>insert</strong>: inserts a cookie.</p>
     * <p>CLB inserts a cookie (SERVERID) into the first HTTP or HTTPS response packet that is sent to a client. The next request from the client will contain this cookie, and the listener will distribute this request to the recorded backend server.</p>
     * </li>
     * <li><p><strong>server</strong>: rewrites a cookie.</p>
     * <p>When CLB detects a user-defined cookie, it overwrites the original cookie with the user-defined cookie. The next request from the client carries the user-defined cookie, and the listener will distribute the request to the recorded backend server.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>insert</p>
     */
    @NameInMap("StickySessionType")
    public String stickySessionType;

    /**
     * <p>The Transport Layer Security (TLS) security policy for a high-performance CLB instance.</p>
     * <p>Each security policy contains TLS protocol versions and cipher suites available for HTTPS. Valid values:</p>
     * <ul>
     * <li><p><strong>tls_cipher_policy_1_0</strong>:</p>
     * <p>Supported TLS versions: TLS 1.0, TLS 1.1, and TLS 1.2</p>
     * <p>Supported cipher suites: ECDHE-RSA-AES128-GCM-SHA256, ECDHE-RSA-AES256-GCM-SHA384, ECDHE-RSA-AES128-SHA256, ECDHE-RSA-AES256-SHA384, AES128-GCM-SHA256, AES256-GCM-SHA384, AES128-SHA256, AES256-SHA256, ECDHE-RSA-AES128-SHA, ECDHE-RSA-AES256-SHA, AES128-SHA, AES256-SHA, and DES-CBC3-SHA</p>
     * </li>
     * <li><p><strong>tls_cipher_policy_1_1</strong>:</p>
     * <p>Supported TLS versions: TLS 1.1 and TLS 1.2</p>
     * <p>Supported cipher suites: ECDHE-RSA-AES128-GCM-SHA256, ECDHE-RSA-AES256-GCM-SHA384, ECDHE-RSA-AES128-SHA256, ECDHE-RSA-AES256-SHA384, AES128-GCM-SHA256, AES256-GCM-SHA384, AES128-SHA256, AES256-SHA256, ECDHE-RSA-AES128-SHA, ECDHE-RSA-AES256-SHA, AES128-SHA, AES256-SHA, and DES-CBC3-SHA</p>
     * </li>
     * <li><p><strong>tls_cipher_policy_1_2</strong></p>
     * <p>Supported TLS version: TLS 1.2</p>
     * <p>Supported cipher suites: ECDHE-RSA-AES128-GCM-SHA256, ECDHE-RSA-AES256-GCM-SHA384, ECDHE-RSA-AES128-SHA256, ECDHE-RSA-AES256-SHA384, AES128-GCM-SHA256, AES256-GCM-SHA384, AES128-SHA256, AES256-SHA256, ECDHE-RSA-AES128-SHA, ECDHE-RSA-AES256-SHA, AES128-SHA, AES256-SHA, and DES-CBC3-SHA</p>
     * </li>
     * <li><p><strong>tls_cipher_policy_1_2_strict</strong></p>
     * <p>Supported TLS version: TLS 1.2</p>
     * <p>Supported cipher suites: ECDHE-RSA-AES128-GCM-SHA256, ECDHE-RSA-AES256-GCM-SHA384, ECDHE-RSA-AES128-SHA256, ECDHE-RSA-AES256-SHA384, ECDHE-RSA-AES128-SHA, and ECDHE-RSA-AES256-SHA</p>
     * </li>
     * <li><p><strong>tls_cipher_policy_1_2_strict_with_1_3</strong></p>
     * <p>Supported TLS versions: TLS 1.2 and TLS 1.3</p>
     * <p>Supported cipher suites: TLS_AES_128_GCM_SHA256, TLS_AES_256_GCM_SHA384, TLS_CHACHA20_POLY1305_SHA256, TLS_AES_128_CCM_SHA256, TLS_AES_128_CCM_8_SHA256, ECDHE-ECDSA-AES128-GCM-SHA256, ECDHE-ECDSA-AES256-GCM-SHA384, ECDHE-ECDSA-AES128-SHA256, ECDHE-ECDSA-AES256-SHA384, ECDHE-RSA-AES128-GCM-SHA256, ECDHE-RSA-AES256-GCM-SHA384, ECDHE-RSA-AES128-SHA256, ECDHE-RSA-AES256-SHA384, ECDHE-ECDSA-AES128-SHA, ECDHE-ECDSA-AES256-SHA, ECDHE-RSA-AES128-SHA, and ECDHE-RSA-AES256-SHA</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>tls_cipher_policy_1_0</p>
     */
    @NameInMap("TLSCipherPolicy")
    public String TLSCipherPolicy;

    /**
     * <p>The tags.</p>
     */
    @NameInMap("Tags")
    public DescribeLoadBalancerHTTPSListenerAttributeResponseBodyTags tags;

    /**
     * <p>The unhealthy threshold.</p>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("UnhealthyThreshold")
    public Integer unhealthyThreshold;

    /**
     * <p>The ID of the associated server group.</p>
     * 
     * <strong>example:</strong>
     * <p>rsp-cige6j5e********</p>
     */
    @NameInMap("VServerGroupId")
    public String VServerGroupId;

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
     * <p>Indicates whether the <code>XForwardedFor_ClientCertClientVerify</code> header is used to retrieve the verification result of the client certificate. Valid values:</p>
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
     * <p>Indicates whether the <code>XForwardedFor_ClientCertFingerprint</code> header is used to retrieve the fingerprint of the client certificate. Valid values:</p>
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
     * <p>Indicates whether the <code>XForwardedFor_ClientCertIssuerDN</code> header is used to retrieve information about the authority that issues the client certificate. Valid values:</p>
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
     * <p>Indicates whether the <code>XForwardedFor_ClientCertSubjectDN</code> header is used to retrieve information about the owner of the client certificate. Valid values:</p>
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
     * <p>Indicates whether the <code>SLB-ID</code> header is used to retrieve the ID of the ALB instance. Valid values:</p>
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
     * <p>Indicates whether the <code>SLB-IP</code> header is used to retrieve the virtual IP address requested by the client. Valid values:</p>
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
     * <p>Indicates whether the <code>XForwardedFor_SLBPORT</code> header is used to retrieve the listening port. Valid values:</p>
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
     * <p>Indicates whether the <code>X-Forwarded-Proto</code> header is used to retrieve the listener protocol. Valid values:</p>
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

    public static DescribeLoadBalancerHTTPSListenerAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLoadBalancerHTTPSListenerAttributeResponseBody self = new DescribeLoadBalancerHTTPSListenerAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLoadBalancerHTTPSListenerAttributeResponseBody setAclId(String aclId) {
        this.aclId = aclId;
        return this;
    }
    public String getAclId() {
        return this.aclId;
    }

    public DescribeLoadBalancerHTTPSListenerAttributeResponseBody setAclIds(DescribeLoadBalancerHTTPSListenerAttributeResponseBodyAclIds aclIds) {
        this.aclIds = aclIds;
        return this;
    }
    public DescribeLoadBalancerHTTPSListenerAttributeResponseBodyAclIds getAclIds() {
        return this.aclIds;
    }

    public DescribeLoadBalancerHTTPSListenerAttributeResponseBody setAclStatus(String aclStatus) {
        this.aclStatus = aclStatus;
        return this;
    }
    public String getAclStatus() {
        return this.aclStatus;
    }

    public DescribeLoadBalancerHTTPSListenerAttributeResponseBody setAclType(String aclType) {
        this.aclType = aclType;
        return this;
    }
    public String getAclType() {
        return this.aclType;
    }

    public DescribeLoadBalancerHTTPSListenerAttributeResponseBody setBackendServerPort(Integer backendServerPort) {
        this.backendServerPort = backendServerPort;
        return this;
    }
    public Integer getBackendServerPort() {
        return this.backendServerPort;
    }

    public DescribeLoadBalancerHTTPSListenerAttributeResponseBody setBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }
    public Integer getBandwidth() {
        return this.bandwidth;
    }

    public DescribeLoadBalancerHTTPSListenerAttributeResponseBody setCACertificateId(String CACertificateId) {
        this.CACertificateId = CACertificateId;
        return this;
    }
    public String getCACertificateId() {
        return this.CACertificateId;
    }

    public DescribeLoadBalancerHTTPSListenerAttributeResponseBody setCookie(String cookie) {
        this.cookie = cookie;
        return this;
    }
    public String getCookie() {
        return this.cookie;
    }

    public DescribeLoadBalancerHTTPSListenerAttributeResponseBody setCookieTimeout(Integer cookieTimeout) {
        this.cookieTimeout = cookieTimeout;
        return this;
    }
    public Integer getCookieTimeout() {
        return this.cookieTimeout;
    }

    public DescribeLoadBalancerHTTPSListenerAttributeResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DescribeLoadBalancerHTTPSListenerAttributeResponseBody setDomainExtensions(DescribeLoadBalancerHTTPSListenerAttributeResponseBodyDomainExtensions domainExtensions) {
        this.domainExtensions = domainExtensions;
        return this;
    }
    public DescribeLoadBalancerHTTPSListenerAttributeResponseBodyDomainExtensions getDomainExtensions() {
        return this.domainExtensions;
    }

    public DescribeLoadBalancerHTTPSListenerAttributeResponseBody setEnableHttp2(String enableHttp2) {
        this.enableHttp2 = enableHttp2;
        return this;
    }
    public String getEnableHttp2() {
        return this.enableHttp2;
    }

    public DescribeLoadBalancerHTTPSListenerAttributeResponseBody setGzip(String gzip) {
        this.gzip = gzip;
        return this;
    }
    public String getGzip() {
        return this.gzip;
    }

    public DescribeLoadBalancerHTTPSListenerAttributeResponseBody setHealthCheck(String healthCheck) {
        this.healthCheck = healthCheck;
        return this;
    }
    public String getHealthCheck() {
        return this.healthCheck;
    }

    public DescribeLoadBalancerHTTPSListenerAttributeResponseBody setHealthCheckConnectPort(Integer healthCheckConnectPort) {
        this.healthCheckConnectPort = healthCheckConnectPort;
        return this;
    }
    public Integer getHealthCheckConnectPort() {
        return this.healthCheckConnectPort;
    }

    public DescribeLoadBalancerHTTPSListenerAttributeResponseBody setHealthCheckDomain(String healthCheckDomain) {
        this.healthCheckDomain = healthCheckDomain;
        return this;
    }
    public String getHealthCheckDomain() {
        return this.healthCheckDomain;
    }

    public DescribeLoadBalancerHTTPSListenerAttributeResponseBody setHealthCheckHttpCode(String healthCheckHttpCode) {
        this.healthCheckHttpCode = healthCheckHttpCode;
        return this;
    }
    public String getHealthCheckHttpCode() {
        return this.healthCheckHttpCode;
    }

    public DescribeLoadBalancerHTTPSListenerAttributeResponseBody setHealthCheckInterval(Integer healthCheckInterval) {
        this.healthCheckInterval = healthCheckInterval;
        return this;
    }
    public Integer getHealthCheckInterval() {
        return this.healthCheckInterval;
    }

    public DescribeLoadBalancerHTTPSListenerAttributeResponseBody setHealthCheckMethod(String healthCheckMethod) {
        this.healthCheckMethod = healthCheckMethod;
        return this;
    }
    public String getHealthCheckMethod() {
        return this.healthCheckMethod;
    }

    public DescribeLoadBalancerHTTPSListenerAttributeResponseBody setHealthCheckTimeout(Integer healthCheckTimeout) {
        this.healthCheckTimeout = healthCheckTimeout;
        return this;
    }
    public Integer getHealthCheckTimeout() {
        return this.healthCheckTimeout;
    }

    public DescribeLoadBalancerHTTPSListenerAttributeResponseBody setHealthCheckURI(String healthCheckURI) {
        this.healthCheckURI = healthCheckURI;
        return this;
    }
    public String getHealthCheckURI() {
        return this.healthCheckURI;
    }

    public DescribeLoadBalancerHTTPSListenerAttributeResponseBody setHealthyThreshold(Integer healthyThreshold) {
        this.healthyThreshold = healthyThreshold;
        return this;
    }
    public Integer getHealthyThreshold() {
        return this.healthyThreshold;
    }

    public DescribeLoadBalancerHTTPSListenerAttributeResponseBody setIdleTimeout(Integer idleTimeout) {
        this.idleTimeout = idleTimeout;
        return this;
    }
    public Integer getIdleTimeout() {
        return this.idleTimeout;
    }

    public DescribeLoadBalancerHTTPSListenerAttributeResponseBody setListenerPort(Integer listenerPort) {
        this.listenerPort = listenerPort;
        return this;
    }
    public Integer getListenerPort() {
        return this.listenerPort;
    }

    public DescribeLoadBalancerHTTPSListenerAttributeResponseBody setLoadBalancerId(String loadBalancerId) {
        this.loadBalancerId = loadBalancerId;
        return this;
    }
    public String getLoadBalancerId() {
        return this.loadBalancerId;
    }

    public DescribeLoadBalancerHTTPSListenerAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLoadBalancerHTTPSListenerAttributeResponseBody setRequestTimeout(Integer requestTimeout) {
        this.requestTimeout = requestTimeout;
        return this;
    }
    public Integer getRequestTimeout() {
        return this.requestTimeout;
    }

    public DescribeLoadBalancerHTTPSListenerAttributeResponseBody setRules(DescribeLoadBalancerHTTPSListenerAttributeResponseBodyRules rules) {
        this.rules = rules;
        return this;
    }
    public DescribeLoadBalancerHTTPSListenerAttributeResponseBodyRules getRules() {
        return this.rules;
    }

    public DescribeLoadBalancerHTTPSListenerAttributeResponseBody setScheduler(String scheduler) {
        this.scheduler = scheduler;
        return this;
    }
    public String getScheduler() {
        return this.scheduler;
    }

    public DescribeLoadBalancerHTTPSListenerAttributeResponseBody setSecurityStatus(String securityStatus) {
        this.securityStatus = securityStatus;
        return this;
    }
    public String getSecurityStatus() {
        return this.securityStatus;
    }

    public DescribeLoadBalancerHTTPSListenerAttributeResponseBody setServerCertificateId(String serverCertificateId) {
        this.serverCertificateId = serverCertificateId;
        return this;
    }
    public String getServerCertificateId() {
        return this.serverCertificateId;
    }

    public DescribeLoadBalancerHTTPSListenerAttributeResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeLoadBalancerHTTPSListenerAttributeResponseBody setStickySession(String stickySession) {
        this.stickySession = stickySession;
        return this;
    }
    public String getStickySession() {
        return this.stickySession;
    }

    public DescribeLoadBalancerHTTPSListenerAttributeResponseBody setStickySessionType(String stickySessionType) {
        this.stickySessionType = stickySessionType;
        return this;
    }
    public String getStickySessionType() {
        return this.stickySessionType;
    }

    public DescribeLoadBalancerHTTPSListenerAttributeResponseBody setTLSCipherPolicy(String TLSCipherPolicy) {
        this.TLSCipherPolicy = TLSCipherPolicy;
        return this;
    }
    public String getTLSCipherPolicy() {
        return this.TLSCipherPolicy;
    }

    public DescribeLoadBalancerHTTPSListenerAttributeResponseBody setTags(DescribeLoadBalancerHTTPSListenerAttributeResponseBodyTags tags) {
        this.tags = tags;
        return this;
    }
    public DescribeLoadBalancerHTTPSListenerAttributeResponseBodyTags getTags() {
        return this.tags;
    }

    public DescribeLoadBalancerHTTPSListenerAttributeResponseBody setUnhealthyThreshold(Integer unhealthyThreshold) {
        this.unhealthyThreshold = unhealthyThreshold;
        return this;
    }
    public Integer getUnhealthyThreshold() {
        return this.unhealthyThreshold;
    }

    public DescribeLoadBalancerHTTPSListenerAttributeResponseBody setVServerGroupId(String VServerGroupId) {
        this.VServerGroupId = VServerGroupId;
        return this;
    }
    public String getVServerGroupId() {
        return this.VServerGroupId;
    }

    public DescribeLoadBalancerHTTPSListenerAttributeResponseBody setXForwardedFor(String XForwardedFor) {
        this.XForwardedFor = XForwardedFor;
        return this;
    }
    public String getXForwardedFor() {
        return this.XForwardedFor;
    }

    public DescribeLoadBalancerHTTPSListenerAttributeResponseBody setXForwardedFor_ClientCertClientVerify(String XForwardedFor_ClientCertClientVerify) {
        this.XForwardedFor_ClientCertClientVerify = XForwardedFor_ClientCertClientVerify;
        return this;
    }
    public String getXForwardedFor_ClientCertClientVerify() {
        return this.XForwardedFor_ClientCertClientVerify;
    }

    public DescribeLoadBalancerHTTPSListenerAttributeResponseBody setXForwardedFor_ClientCertFingerprint(String XForwardedFor_ClientCertFingerprint) {
        this.XForwardedFor_ClientCertFingerprint = XForwardedFor_ClientCertFingerprint;
        return this;
    }
    public String getXForwardedFor_ClientCertFingerprint() {
        return this.XForwardedFor_ClientCertFingerprint;
    }

    public DescribeLoadBalancerHTTPSListenerAttributeResponseBody setXForwardedFor_ClientCertIssuerDN(String XForwardedFor_ClientCertIssuerDN) {
        this.XForwardedFor_ClientCertIssuerDN = XForwardedFor_ClientCertIssuerDN;
        return this;
    }
    public String getXForwardedFor_ClientCertIssuerDN() {
        return this.XForwardedFor_ClientCertIssuerDN;
    }

    public DescribeLoadBalancerHTTPSListenerAttributeResponseBody setXForwardedFor_ClientCertSubjectDN(String XForwardedFor_ClientCertSubjectDN) {
        this.XForwardedFor_ClientCertSubjectDN = XForwardedFor_ClientCertSubjectDN;
        return this;
    }
    public String getXForwardedFor_ClientCertSubjectDN() {
        return this.XForwardedFor_ClientCertSubjectDN;
    }

    public DescribeLoadBalancerHTTPSListenerAttributeResponseBody setXForwardedFor_ClientSrcPort(String XForwardedFor_ClientSrcPort) {
        this.XForwardedFor_ClientSrcPort = XForwardedFor_ClientSrcPort;
        return this;
    }
    public String getXForwardedFor_ClientSrcPort() {
        return this.XForwardedFor_ClientSrcPort;
    }

    public DescribeLoadBalancerHTTPSListenerAttributeResponseBody setXForwardedFor_SLBID(String XForwardedFor_SLBID) {
        this.XForwardedFor_SLBID = XForwardedFor_SLBID;
        return this;
    }
    public String getXForwardedFor_SLBID() {
        return this.XForwardedFor_SLBID;
    }

    public DescribeLoadBalancerHTTPSListenerAttributeResponseBody setXForwardedFor_SLBIP(String XForwardedFor_SLBIP) {
        this.XForwardedFor_SLBIP = XForwardedFor_SLBIP;
        return this;
    }
    public String getXForwardedFor_SLBIP() {
        return this.XForwardedFor_SLBIP;
    }

    public DescribeLoadBalancerHTTPSListenerAttributeResponseBody setXForwardedFor_SLBPORT(String XForwardedFor_SLBPORT) {
        this.XForwardedFor_SLBPORT = XForwardedFor_SLBPORT;
        return this;
    }
    public String getXForwardedFor_SLBPORT() {
        return this.XForwardedFor_SLBPORT;
    }

    public DescribeLoadBalancerHTTPSListenerAttributeResponseBody setXForwardedFor_proto(String XForwardedFor_proto) {
        this.XForwardedFor_proto = XForwardedFor_proto;
        return this;
    }
    public String getXForwardedFor_proto() {
        return this.XForwardedFor_proto;
    }

    public static class DescribeLoadBalancerHTTPSListenerAttributeResponseBodyAclIds extends TeaModel {
        @NameInMap("AclId")
        public java.util.List<String> aclId;

        public static DescribeLoadBalancerHTTPSListenerAttributeResponseBodyAclIds build(java.util.Map<String, ?> map) throws Exception {
            DescribeLoadBalancerHTTPSListenerAttributeResponseBodyAclIds self = new DescribeLoadBalancerHTTPSListenerAttributeResponseBodyAclIds();
            return TeaModel.build(map, self);
        }

        public DescribeLoadBalancerHTTPSListenerAttributeResponseBodyAclIds setAclId(java.util.List<String> aclId) {
            this.aclId = aclId;
            return this;
        }
        public java.util.List<String> getAclId() {
            return this.aclId;
        }

    }

    public static class DescribeLoadBalancerHTTPSListenerAttributeResponseBodyDomainExtensionsDomainExtension extends TeaModel {
        /**
         * <p>The endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.example.com">www.example.com</a></p>
         */
        @NameInMap("Domain")
        public String domain;

        /**
         * <p>The ID of the additional domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("DomainExtensionId")
        public String domainExtensionId;

        /**
         * <p>The ID of the server certificate that is associated with the domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>13344444****</p>
         */
        @NameInMap("ServerCertificateId")
        public String serverCertificateId;

        public static DescribeLoadBalancerHTTPSListenerAttributeResponseBodyDomainExtensionsDomainExtension build(java.util.Map<String, ?> map) throws Exception {
            DescribeLoadBalancerHTTPSListenerAttributeResponseBodyDomainExtensionsDomainExtension self = new DescribeLoadBalancerHTTPSListenerAttributeResponseBodyDomainExtensionsDomainExtension();
            return TeaModel.build(map, self);
        }

        public DescribeLoadBalancerHTTPSListenerAttributeResponseBodyDomainExtensionsDomainExtension setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public DescribeLoadBalancerHTTPSListenerAttributeResponseBodyDomainExtensionsDomainExtension setDomainExtensionId(String domainExtensionId) {
            this.domainExtensionId = domainExtensionId;
            return this;
        }
        public String getDomainExtensionId() {
            return this.domainExtensionId;
        }

        public DescribeLoadBalancerHTTPSListenerAttributeResponseBodyDomainExtensionsDomainExtension setServerCertificateId(String serverCertificateId) {
            this.serverCertificateId = serverCertificateId;
            return this;
        }
        public String getServerCertificateId() {
            return this.serverCertificateId;
        }

    }

    public static class DescribeLoadBalancerHTTPSListenerAttributeResponseBodyDomainExtensions extends TeaModel {
        @NameInMap("DomainExtension")
        public java.util.List<DescribeLoadBalancerHTTPSListenerAttributeResponseBodyDomainExtensionsDomainExtension> domainExtension;

        public static DescribeLoadBalancerHTTPSListenerAttributeResponseBodyDomainExtensions build(java.util.Map<String, ?> map) throws Exception {
            DescribeLoadBalancerHTTPSListenerAttributeResponseBodyDomainExtensions self = new DescribeLoadBalancerHTTPSListenerAttributeResponseBodyDomainExtensions();
            return TeaModel.build(map, self);
        }

        public DescribeLoadBalancerHTTPSListenerAttributeResponseBodyDomainExtensions setDomainExtension(java.util.List<DescribeLoadBalancerHTTPSListenerAttributeResponseBodyDomainExtensionsDomainExtension> domainExtension) {
            this.domainExtension = domainExtension;
            return this;
        }
        public java.util.List<DescribeLoadBalancerHTTPSListenerAttributeResponseBodyDomainExtensionsDomainExtension> getDomainExtension() {
            return this.domainExtension;
        }

    }

    public static class DescribeLoadBalancerHTTPSListenerAttributeResponseBodyRulesRule extends TeaModel {
        /**
         * <p>The endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.example.com">www.example.com</a></p>
         */
        @NameInMap("Domain")
        public String domain;

        /**
         * <p>The ID of the forwarding rule.</p>
         * 
         * <strong>example:</strong>
         * <p>23</p>
         */
        @NameInMap("RuleId")
        public String ruleId;

        /**
         * <p>The name of the forwarding rule.</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        @NameInMap("RuleName")
        public String ruleName;

        /**
         * <p>The request path.</p>
         * 
         * <strong>example:</strong>
         * <p>/example</p>
         */
        @NameInMap("Url")
        public String url;

        /**
         * <p>The ID of the server group that is associated with the forwarding rule.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("VServerGroupId")
        public String VServerGroupId;

        public static DescribeLoadBalancerHTTPSListenerAttributeResponseBodyRulesRule build(java.util.Map<String, ?> map) throws Exception {
            DescribeLoadBalancerHTTPSListenerAttributeResponseBodyRulesRule self = new DescribeLoadBalancerHTTPSListenerAttributeResponseBodyRulesRule();
            return TeaModel.build(map, self);
        }

        public DescribeLoadBalancerHTTPSListenerAttributeResponseBodyRulesRule setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public DescribeLoadBalancerHTTPSListenerAttributeResponseBodyRulesRule setRuleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public String getRuleId() {
            return this.ruleId;
        }

        public DescribeLoadBalancerHTTPSListenerAttributeResponseBodyRulesRule setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public DescribeLoadBalancerHTTPSListenerAttributeResponseBodyRulesRule setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

        public DescribeLoadBalancerHTTPSListenerAttributeResponseBodyRulesRule setVServerGroupId(String VServerGroupId) {
            this.VServerGroupId = VServerGroupId;
            return this;
        }
        public String getVServerGroupId() {
            return this.VServerGroupId;
        }

    }

    public static class DescribeLoadBalancerHTTPSListenerAttributeResponseBodyRules extends TeaModel {
        @NameInMap("Rule")
        public java.util.List<DescribeLoadBalancerHTTPSListenerAttributeResponseBodyRulesRule> rule;

        public static DescribeLoadBalancerHTTPSListenerAttributeResponseBodyRules build(java.util.Map<String, ?> map) throws Exception {
            DescribeLoadBalancerHTTPSListenerAttributeResponseBodyRules self = new DescribeLoadBalancerHTTPSListenerAttributeResponseBodyRules();
            return TeaModel.build(map, self);
        }

        public DescribeLoadBalancerHTTPSListenerAttributeResponseBodyRules setRule(java.util.List<DescribeLoadBalancerHTTPSListenerAttributeResponseBodyRulesRule> rule) {
            this.rule = rule;
            return this;
        }
        public java.util.List<DescribeLoadBalancerHTTPSListenerAttributeResponseBodyRulesRule> getRule() {
            return this.rule;
        }

    }

    public static class DescribeLoadBalancerHTTPSListenerAttributeResponseBodyTagsTag extends TeaModel {
        /**
         * <p>The key of tag N. Valid values of N: <strong>1</strong> to <strong>20</strong>. The tag key cannot be an empty string. The tag key can be up to 64 characters in length, and cannot start with <code>aliyun</code> or <code>acs:</code>. The tag key cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>TestKey</p>
         */
        @NameInMap("TagKey")
        public String tagKey;

        /**
         * <p>The value of tag N. Valid values of N: <strong>1</strong> to <strong>20</strong>. The tag value can be an empty string. The tag value can be up to 128 characters in length, and cannot start with <code>acs:</code>. The tag value cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>TestValue</p>
         */
        @NameInMap("TagValue")
        public String tagValue;

        public static DescribeLoadBalancerHTTPSListenerAttributeResponseBodyTagsTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeLoadBalancerHTTPSListenerAttributeResponseBodyTagsTag self = new DescribeLoadBalancerHTTPSListenerAttributeResponseBodyTagsTag();
            return TeaModel.build(map, self);
        }

        public DescribeLoadBalancerHTTPSListenerAttributeResponseBodyTagsTag setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public DescribeLoadBalancerHTTPSListenerAttributeResponseBodyTagsTag setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class DescribeLoadBalancerHTTPSListenerAttributeResponseBodyTags extends TeaModel {
        @NameInMap("Tag")
        public java.util.List<DescribeLoadBalancerHTTPSListenerAttributeResponseBodyTagsTag> tag;

        public static DescribeLoadBalancerHTTPSListenerAttributeResponseBodyTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeLoadBalancerHTTPSListenerAttributeResponseBodyTags self = new DescribeLoadBalancerHTTPSListenerAttributeResponseBodyTags();
            return TeaModel.build(map, self);
        }

        public DescribeLoadBalancerHTTPSListenerAttributeResponseBodyTags setTag(java.util.List<DescribeLoadBalancerHTTPSListenerAttributeResponseBodyTagsTag> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<DescribeLoadBalancerHTTPSListenerAttributeResponseBodyTagsTag> getTag() {
            return this.tag;
        }

    }

}
