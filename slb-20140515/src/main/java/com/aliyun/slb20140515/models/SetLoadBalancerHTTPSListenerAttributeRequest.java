// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class SetLoadBalancerHTTPSListenerAttributeRequest extends TeaModel {
    /**
     * <p>The ID of the network access control list (ACL) that is associated with the listener.</p>
     * <p>This parameter is required if <strong>AclStatus</strong> is set to <strong>on</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>nacl-a2do9e413e0spzasx****</p>
     */
    @NameInMap("AclId")
    public String aclId;

    /**
     * <p>Specifies whether to enable access control. Valid values:</p>
     * <ul>
     * <li><strong>on</strong>: enables access control</li>
     * <li><strong>off</strong>: disables access control</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>off</p>
     */
    @NameInMap("AclStatus")
    public String aclStatus;

    /**
     * <p>The type of network ACL. Valid values:</p>
     * <ul>
     * <li><p><strong>white</strong>: a whitelist. Only requests from the IP addresses or CIDR blocks in the network ACL are forwarded. Whitelists apply to scenarios where you want to allow only specific IP addresses to access an application. Your business may be adversely affected if the whitelist is not set properly. After a whitelist is configured, only IP addresses in the whitelist can access the CLB listener.</p>
     * <p>If no IP address is added to the whitelist, the CLB listener forwards all requests.</p>
     * </li>
     * <li><p><strong>black</strong>: a blacklist. All requests from the IP addresses or CIDR blocks in the network ACL are denied. Blacklists apply to scenarios where you want to deny access from specified IP addresses to an application.</p>
     * <p>If no IP address is added to the blacklist, the listener forwards all requests.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p> This parameter takes effect only when <strong>AclStatus</strong> is set to <strong>on</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>white</p>
     */
    @NameInMap("AclType")
    public String aclType;

    /**
     * <p>The maximum bandwidth of the listener. Unit: Mbit/s.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><strong>-1</strong>: If you set the value to -1, the bandwidth of the listener is unlimited.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>-1</p>
     */
    @NameInMap("Bandwidth")
    public Integer bandwidth;

    /**
     * <p>The ID of the CA certificate.</p>
     * <ul>
     * <li>If both the CA certificate and the server certificate are uploaded, mutual authentication is used.</li>
     * <li>If you upload only the server certificate, one-way authentication is used.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>139a00604ad-cn-east-****</p>
     */
    @NameInMap("CACertificateId")
    public String CACertificateId;

    /**
     * <p>The cookie that you want to configure for the server.</p>
     * <p>The cookie must be 1 to 200 characters in length, and can contain only ASCII letters and digits. It cannot contain commas (,), semicolons (;), or space characters. It cannot start with a dollar sign ($).</p>
     * <blockquote>
     * <p> This parameter is required when you set the <strong>StickySession</strong> parameter to <strong>on</strong> and the <strong>StickySessionType</strong> parameter to <strong>server</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>B490B5EBF6F3CD4****</p>
     */
    @NameInMap("Cookie")
    public String cookie;

    /**
     * <p>The timeout period of the cookie. Unit: seconds.</p>
     * <p>Valid values: <strong>1</strong> to <strong>86400</strong>.</p>
     * <blockquote>
     * <p> This parameter is required if the <strong>StickySession</strong> parameter is set to <strong>on</strong> and the <strong>StickySessionType</strong> parameter is set to <strong>insert</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>500</p>
     */
    @NameInMap("CookieTimeout")
    public Integer cookieTimeout;

    /**
     * <p>The description of the listener.
     * The name must be 1 to 256 characters in length and can contain letters, digits, hyphens (-), forward slashes (/), periods (.), and underscores (_).</p>
     * 
     * <strong>example:</strong>
     * <p>Listener1</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Specifies whether to use <code>HTTP 2.0</code>. Valid values:</p>
     * <ul>
     * <li><strong>on</strong>: yes</li>
     * <li><strong>off</strong>: no</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>off</p>
     */
    @NameInMap("EnableHttp2")
    public String enableHttp2;

    /**
     * <p>Specifies whether to enable <code>Gzip</code> compression to compress specific types of files. Valid values:</p>
     * <ul>
     * <li><strong>on</strong>: yes</li>
     * <li><strong>off</strong>: no</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("Gzip")
    public String gzip;

    /**
     * <p>Specifies whether to enable health checks. Valid values:</p>
     * <ul>
     * <li><strong>on</strong>: yes</li>
     * <li><strong>off</strong>: no</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("HealthCheck")
    public String healthCheck;

    /**
     * <p>The port that is used for health checks.</p>
     * <p>Valid values: <strong>1</strong> to <strong>65535</strong>.</p>
     * <blockquote>
     * <p> This parameter takes effect only when the <strong>HealthCheck</strong> parameter is set to <strong>on</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>8080</p>
     */
    @NameInMap("HealthCheckConnectPort")
    public Integer healthCheckConnectPort;

    /**
     * <p>The domain name that is used for health checks. Valid values:</p>
     * <ul>
     * <li><strong>$_ip</strong>: the private IP address of a backend server. If you do not set this parameter or set the parameter to $_ip, the CLB instance uses the private IP address of each backend server as the domain name for health checks.</li>
     * <li><strong>domain</strong>: The domain name must be 1 to 80 characters in length, and can contain letters, digits, periods (.),and hyphens (-).</li>
     * </ul>
     * <blockquote>
     * <p> This parameter takes effect only when the <strong>HealthCheck</strong> parameter is set to <strong>on</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>172.XX.XX.16</p>
     */
    @NameInMap("HealthCheckDomain")
    public String healthCheckDomain;

    /**
     * <p>The HTTP status code of a successful health check. Separate multiple HTTP status codes with commas (,).</p>
     * <p>Valid values: <strong>http_2xx</strong>, <strong>http_3xx</strong>, <strong>http_4xx</strong>, and <strong>http_5xx</strong>.</p>
     * <blockquote>
     * <p> This parameter takes effect only when the <strong>HealthCheck</strong> parameter is set to <strong>on</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>http_2xx,http_3xx</p>
     */
    @NameInMap("HealthCheckHttpCode")
    public String healthCheckHttpCode;

    /**
     * <p>The interval between two consecutive health checks. Unit: seconds.</p>
     * <p>Valid values: <strong>1</strong> to <strong>50</strong>.</p>
     * <blockquote>
     * <p> This parameter takes effect only when the <strong>HealthCheck</strong> parameter is set to <strong>on</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("HealthCheckInterval")
    public Integer healthCheckInterval;

    /**
     * <p>The HTTP method that is used for health checks. Valid values: <strong>head</strong> and <strong>get</strong>.</p>
     * <blockquote>
     * <p> This parameter takes effect only when the <strong>HealthCheck</strong> parameter is set to <strong>on</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>get</p>
     */
    @NameInMap("HealthCheckMethod")
    public String healthCheckMethod;

    /**
     * <p>The timeout period of a health check response. If a backend ECS instance does not respond within the specified timeout period, the ECS instance fails the health check. Unit: seconds Valid values: <strong>1</strong> to <strong>300</strong>.</p>
     * <blockquote>
     * <p> This parameter takes effect only if the <strong>HealthCheck</strong> parameter is set to <strong>on</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("HealthCheckTimeout")
    public Integer healthCheckTimeout;

    /**
     * <p>The URL that is used for health checks.</p>
     * <p>The URL must be 1 to 80 characters in length and can contain letters, digits, and the following characters: - / . % ? # &amp;. The URL must not be a single forward slash (/) but it must start with a forward slash (/).</p>
     * <blockquote>
     * <p> This parameter takes effect only when the <strong>HealthCheck</strong> parameter is set to <strong>on</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>/test/index.html</p>
     */
    @NameInMap("HealthCheckURI")
    public String healthCheckURI;

    /**
     * <p>The number of health checks that an unhealthy backend server must consecutively pass before it can be declared healthy (from <strong>fail</strong> to <strong>success</strong>).</p>
     * <p>Valid values: <strong>2</strong> to <strong>10</strong>.</p>
     * <blockquote>
     * <p> This parameter takes effect only when the <strong>HealthCheck</strong> parameter is set to <strong>on</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("HealthyThreshold")
    public Integer healthyThreshold;

    /**
     * <p>The timeout period of an idle connection. Unit: seconds. Valid values: <strong>1 to 60</strong>. Default value: <strong>15</strong>.</p>
     * <p>If no request is received within the specified timeout period, CLB closes the connection. When another request is received, CLB establishes a new connection.</p>
     * 
     * <strong>example:</strong>
     * <p>23</p>
     */
    @NameInMap("IdleTimeout")
    public Integer idleTimeout;

    /**
     * <p>The frontend port that is used by the CLB instance.</p>
     * <p>Valid values: <strong>1</strong> to <strong>65535</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>80</p>
     */
    @NameInMap("ListenerPort")
    public Integer listenerPort;

    /**
     * <p>The ID of the CLB instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>lb-sjhfdji****</p>
     */
    @NameInMap("LoadBalancerId")
    public String loadBalancerId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The ID of the region where the CLB instance is deployed.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The timeout period of a request. Unit: seconds. Valid values: <strong>1 to 180</strong>. Default value: <strong>60</strong>.</p>
     * <p>If no response is received from the backend server during the request timeout period, CLB sends an HTTP 504 error code to the client.</p>
     * 
     * <strong>example:</strong>
     * <p>223</p>
     */
    @NameInMap("RequestTimeout")
    public Integer requestTimeout;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The scheduling algorithm. Valid values:</p>
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
     * <p>The ID of the server certificate.</p>
     * 
     * <strong>example:</strong>
     * <p>idkp-123-cn-te****</p>
     */
    @NameInMap("ServerCertificateId")
    public String serverCertificateId;

    /**
     * <p>Specifies whether to enable session persistence. Valid values:</p>
     * <ul>
     * <li><strong>on</strong>: yes</li>
     * <li><strong>off</strong>: no</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("StickySession")
    public String stickySession;

    /**
     * <p>The method that is used to handle a cookie. Valid values:</p>
     * <ul>
     * <li><p><strong>insert</strong>: inserts a cookie.</p>
     * <p>CLB inserts a cookie (SERVERID) into the first HTTP or HTTPS response that is sent to a client. The next request from the client will contain this cookie, and the listener will distribute this request to the recorded backend server.</p>
     * </li>
     * <li><p><strong>server</strong>: rewrites a cookie.</p>
     * <p>When CLB detects a user-defined cookie, it overwrites the original cookie with the user-defined cookie. The next request from the client will contain the user-defined cookie, and the listener will distribute this request to the recorded backend server.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p> This parameter is required if the <strong>StickySession</strong> parameter is set to <strong>on</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>insert</p>
     */
    @NameInMap("StickySessionType")
    public String stickySessionType;

    /**
     * <p>The Transport Layer Security (TLS) security policy. Each security policy contains TLS protocol versions and cipher suites available for HTTPS.</p>
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
     * <p>tls_cipher_policy_1_2</p>
     */
    @NameInMap("TLSCipherPolicy")
    public String TLSCipherPolicy;

    /**
     * <p>The number of health checks that a healthy backend server must consecutively fail before it can be declared unhealthy (from <strong>success</strong> to <strong>fail</strong>).</p>
     * <p>Valid values: <strong>2</strong> to <strong>10</strong>.</p>
     * <blockquote>
     * <p> This parameter takes effect only when the <strong>HealthCheck</strong> parameter is set to <strong>on</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("UnhealthyThreshold")
    public Integer unhealthyThreshold;

    /**
     * <p>Specifies whether to use a vServer group. Valid values:</p>
     * <ul>
     * <li><strong>on</strong>: yes</li>
     * <li><strong>off</strong>: no</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("VServerGroup")
    public String VServerGroup;

    /**
     * <p>The ID of the vServer group.</p>
     * 
     * <strong>example:</strong>
     * <p>rsp-cige6j****</p>
     */
    @NameInMap("VServerGroupId")
    public String VServerGroupId;

    /**
     * <p>Specifies whether to use the <code>X-Forwarded-For</code> header to retrieve client IP addresses. Valid values:</p>
     * <ul>
     * <li><strong>on</strong>: yes</li>
     * <li><strong>off</strong>: no</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("XForwardedFor")
    public String XForwardedFor;

    /**
     * <p>Specifies whether to use the <code>XForwardedFor_ClientSrcPort</code> header to retrieve the client port. Valid values:</p>
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
     * <p>Specifies whether to use the <code>SLB-ID</code> header to retrieve the ID of the CLB instance. Valid values:</p>
     * <ul>
     * <li><strong>on</strong>: yes</li>
     * <li><strong>off</strong>: no</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("XForwardedFor_SLBID")
    public String XForwardedFor_SLBID;

    /**
     * <p>Specifies whether to use the <code>SLB-IP</code> header to obtain the virtual IP address (VIP) requested by the client. Valid values:</p>
     * <ul>
     * <li><strong>on</strong>: yes</li>
     * <li><strong>off</strong>: no</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("XForwardedFor_SLBIP")
    public String XForwardedFor_SLBIP;

    /**
     * <p>Specifies whether to use the <code>XForwardedFor_SLBPORT</code> header to retrieve the listener port of the CLB instance. Valid values:</p>
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
     * <p>Specifies whether to use the <code>X-Forwarded-Proto</code> header to retrieve the listener protocol. Valid values:</p>
     * <ul>
     * <li><strong>on</strong>: yes</li>
     * <li><strong>off</strong>: no</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("XForwardedFor_proto")
    public String XForwardedFor_proto;

    public static SetLoadBalancerHTTPSListenerAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        SetLoadBalancerHTTPSListenerAttributeRequest self = new SetLoadBalancerHTTPSListenerAttributeRequest();
        return TeaModel.build(map, self);
    }

    public SetLoadBalancerHTTPSListenerAttributeRequest setAclId(String aclId) {
        this.aclId = aclId;
        return this;
    }
    public String getAclId() {
        return this.aclId;
    }

    public SetLoadBalancerHTTPSListenerAttributeRequest setAclStatus(String aclStatus) {
        this.aclStatus = aclStatus;
        return this;
    }
    public String getAclStatus() {
        return this.aclStatus;
    }

    public SetLoadBalancerHTTPSListenerAttributeRequest setAclType(String aclType) {
        this.aclType = aclType;
        return this;
    }
    public String getAclType() {
        return this.aclType;
    }

    public SetLoadBalancerHTTPSListenerAttributeRequest setBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }
    public Integer getBandwidth() {
        return this.bandwidth;
    }

    public SetLoadBalancerHTTPSListenerAttributeRequest setCACertificateId(String CACertificateId) {
        this.CACertificateId = CACertificateId;
        return this;
    }
    public String getCACertificateId() {
        return this.CACertificateId;
    }

    public SetLoadBalancerHTTPSListenerAttributeRequest setCookie(String cookie) {
        this.cookie = cookie;
        return this;
    }
    public String getCookie() {
        return this.cookie;
    }

    public SetLoadBalancerHTTPSListenerAttributeRequest setCookieTimeout(Integer cookieTimeout) {
        this.cookieTimeout = cookieTimeout;
        return this;
    }
    public Integer getCookieTimeout() {
        return this.cookieTimeout;
    }

    public SetLoadBalancerHTTPSListenerAttributeRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public SetLoadBalancerHTTPSListenerAttributeRequest setEnableHttp2(String enableHttp2) {
        this.enableHttp2 = enableHttp2;
        return this;
    }
    public String getEnableHttp2() {
        return this.enableHttp2;
    }

    public SetLoadBalancerHTTPSListenerAttributeRequest setGzip(String gzip) {
        this.gzip = gzip;
        return this;
    }
    public String getGzip() {
        return this.gzip;
    }

    public SetLoadBalancerHTTPSListenerAttributeRequest setHealthCheck(String healthCheck) {
        this.healthCheck = healthCheck;
        return this;
    }
    public String getHealthCheck() {
        return this.healthCheck;
    }

    public SetLoadBalancerHTTPSListenerAttributeRequest setHealthCheckConnectPort(Integer healthCheckConnectPort) {
        this.healthCheckConnectPort = healthCheckConnectPort;
        return this;
    }
    public Integer getHealthCheckConnectPort() {
        return this.healthCheckConnectPort;
    }

    public SetLoadBalancerHTTPSListenerAttributeRequest setHealthCheckDomain(String healthCheckDomain) {
        this.healthCheckDomain = healthCheckDomain;
        return this;
    }
    public String getHealthCheckDomain() {
        return this.healthCheckDomain;
    }

    public SetLoadBalancerHTTPSListenerAttributeRequest setHealthCheckHttpCode(String healthCheckHttpCode) {
        this.healthCheckHttpCode = healthCheckHttpCode;
        return this;
    }
    public String getHealthCheckHttpCode() {
        return this.healthCheckHttpCode;
    }

    public SetLoadBalancerHTTPSListenerAttributeRequest setHealthCheckInterval(Integer healthCheckInterval) {
        this.healthCheckInterval = healthCheckInterval;
        return this;
    }
    public Integer getHealthCheckInterval() {
        return this.healthCheckInterval;
    }

    public SetLoadBalancerHTTPSListenerAttributeRequest setHealthCheckMethod(String healthCheckMethod) {
        this.healthCheckMethod = healthCheckMethod;
        return this;
    }
    public String getHealthCheckMethod() {
        return this.healthCheckMethod;
    }

    public SetLoadBalancerHTTPSListenerAttributeRequest setHealthCheckTimeout(Integer healthCheckTimeout) {
        this.healthCheckTimeout = healthCheckTimeout;
        return this;
    }
    public Integer getHealthCheckTimeout() {
        return this.healthCheckTimeout;
    }

    public SetLoadBalancerHTTPSListenerAttributeRequest setHealthCheckURI(String healthCheckURI) {
        this.healthCheckURI = healthCheckURI;
        return this;
    }
    public String getHealthCheckURI() {
        return this.healthCheckURI;
    }

    public SetLoadBalancerHTTPSListenerAttributeRequest setHealthyThreshold(Integer healthyThreshold) {
        this.healthyThreshold = healthyThreshold;
        return this;
    }
    public Integer getHealthyThreshold() {
        return this.healthyThreshold;
    }

    public SetLoadBalancerHTTPSListenerAttributeRequest setIdleTimeout(Integer idleTimeout) {
        this.idleTimeout = idleTimeout;
        return this;
    }
    public Integer getIdleTimeout() {
        return this.idleTimeout;
    }

    public SetLoadBalancerHTTPSListenerAttributeRequest setListenerPort(Integer listenerPort) {
        this.listenerPort = listenerPort;
        return this;
    }
    public Integer getListenerPort() {
        return this.listenerPort;
    }

    public SetLoadBalancerHTTPSListenerAttributeRequest setLoadBalancerId(String loadBalancerId) {
        this.loadBalancerId = loadBalancerId;
        return this;
    }
    public String getLoadBalancerId() {
        return this.loadBalancerId;
    }

    public SetLoadBalancerHTTPSListenerAttributeRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public SetLoadBalancerHTTPSListenerAttributeRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public SetLoadBalancerHTTPSListenerAttributeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public SetLoadBalancerHTTPSListenerAttributeRequest setRequestTimeout(Integer requestTimeout) {
        this.requestTimeout = requestTimeout;
        return this;
    }
    public Integer getRequestTimeout() {
        return this.requestTimeout;
    }

    public SetLoadBalancerHTTPSListenerAttributeRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public SetLoadBalancerHTTPSListenerAttributeRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public SetLoadBalancerHTTPSListenerAttributeRequest setScheduler(String scheduler) {
        this.scheduler = scheduler;
        return this;
    }
    public String getScheduler() {
        return this.scheduler;
    }

    public SetLoadBalancerHTTPSListenerAttributeRequest setServerCertificateId(String serverCertificateId) {
        this.serverCertificateId = serverCertificateId;
        return this;
    }
    public String getServerCertificateId() {
        return this.serverCertificateId;
    }

    public SetLoadBalancerHTTPSListenerAttributeRequest setStickySession(String stickySession) {
        this.stickySession = stickySession;
        return this;
    }
    public String getStickySession() {
        return this.stickySession;
    }

    public SetLoadBalancerHTTPSListenerAttributeRequest setStickySessionType(String stickySessionType) {
        this.stickySessionType = stickySessionType;
        return this;
    }
    public String getStickySessionType() {
        return this.stickySessionType;
    }

    public SetLoadBalancerHTTPSListenerAttributeRequest setTLSCipherPolicy(String TLSCipherPolicy) {
        this.TLSCipherPolicy = TLSCipherPolicy;
        return this;
    }
    public String getTLSCipherPolicy() {
        return this.TLSCipherPolicy;
    }

    public SetLoadBalancerHTTPSListenerAttributeRequest setUnhealthyThreshold(Integer unhealthyThreshold) {
        this.unhealthyThreshold = unhealthyThreshold;
        return this;
    }
    public Integer getUnhealthyThreshold() {
        return this.unhealthyThreshold;
    }

    public SetLoadBalancerHTTPSListenerAttributeRequest setVServerGroup(String VServerGroup) {
        this.VServerGroup = VServerGroup;
        return this;
    }
    public String getVServerGroup() {
        return this.VServerGroup;
    }

    public SetLoadBalancerHTTPSListenerAttributeRequest setVServerGroupId(String VServerGroupId) {
        this.VServerGroupId = VServerGroupId;
        return this;
    }
    public String getVServerGroupId() {
        return this.VServerGroupId;
    }

    public SetLoadBalancerHTTPSListenerAttributeRequest setXForwardedFor(String XForwardedFor) {
        this.XForwardedFor = XForwardedFor;
        return this;
    }
    public String getXForwardedFor() {
        return this.XForwardedFor;
    }

    public SetLoadBalancerHTTPSListenerAttributeRequest setXForwardedFor_ClientSrcPort(String XForwardedFor_ClientSrcPort) {
        this.XForwardedFor_ClientSrcPort = XForwardedFor_ClientSrcPort;
        return this;
    }
    public String getXForwardedFor_ClientSrcPort() {
        return this.XForwardedFor_ClientSrcPort;
    }

    public SetLoadBalancerHTTPSListenerAttributeRequest setXForwardedFor_SLBID(String XForwardedFor_SLBID) {
        this.XForwardedFor_SLBID = XForwardedFor_SLBID;
        return this;
    }
    public String getXForwardedFor_SLBID() {
        return this.XForwardedFor_SLBID;
    }

    public SetLoadBalancerHTTPSListenerAttributeRequest setXForwardedFor_SLBIP(String XForwardedFor_SLBIP) {
        this.XForwardedFor_SLBIP = XForwardedFor_SLBIP;
        return this;
    }
    public String getXForwardedFor_SLBIP() {
        return this.XForwardedFor_SLBIP;
    }

    public SetLoadBalancerHTTPSListenerAttributeRequest setXForwardedFor_SLBPORT(String XForwardedFor_SLBPORT) {
        this.XForwardedFor_SLBPORT = XForwardedFor_SLBPORT;
        return this;
    }
    public String getXForwardedFor_SLBPORT() {
        return this.XForwardedFor_SLBPORT;
    }

    public SetLoadBalancerHTTPSListenerAttributeRequest setXForwardedFor_proto(String XForwardedFor_proto) {
        this.XForwardedFor_proto = XForwardedFor_proto;
        return this;
    }
    public String getXForwardedFor_proto() {
        return this.XForwardedFor_proto;
    }

}
