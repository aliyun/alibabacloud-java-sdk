// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class CreateLoadBalancerHTTPSListenerRequest extends TeaModel {
    /**
     * <p>The ID of the network access control list (ACL) that is associated with the listener.</p>
     * <br>
     * <p>>  If **AclStatus** is set to **on**, this parameter is required.</p>
     */
    @NameInMap("AclId")
    public String aclId;

    /**
     * <p>Specifies whether to enable access control. Valid values:</p>
     * <br>
     * <p>*   **on**: yes</p>
     * <p>*   **off**: no</p>
     */
    @NameInMap("AclStatus")
    public String aclStatus;

    /**
     * <p>The type of the network ACL. Valid values:</p>
     * <br>
     * <p>*   **white**: a whitelist. Only requests from the IP addresses or CIDR blocks in the network ACL are forwarded. Whitelists apply to scenarios in which you want to allow only specific IP addresses to access an application. Your service may be adversely affected if the allowlist is not properly configured. After a whitelist is configured, only requests from IP addresses that are added to the whitelist are forwarded by the listener.</p>
     * <br>
     * <p>    If you enable a whitelist but do not add an IP address to the ACL, the listener forwards all requests.</p>
     * <br>
     * <p>*   **black**: a blacklist. All requests from the IP addresses or CIDR blocks in the network ACL are denied. The blacklist applies to scenarios in which you want to deny access from specific IP addresses to an application.</p>
     * <br>
     * <p>    If a blacklist is configured for a listener but no IP address is added to the blacklist, the listener forwards all requests.</p>
     * <br>
     * <p>>  If **AclStatus** is set to **on**, this parameter is required.</p>
     */
    @NameInMap("AclType")
    public String aclType;

    /**
     * <p>The backend port that is used by the CLB instance. Valid values: **1** to **65535**.</p>
     * <br>
     * <p>If the VServerGroupId parameter is not set, this parameter is required.</p>
     */
    @NameInMap("BackendServerPort")
    public Integer backendServerPort;

    /**
     * <p>The maximum bandwidth of the listener. Unit: Mbit/s.</p>
     * <br>
     * <p>Valid values: **-1** and **1** to **5120**.</p>
     * <br>
     * <p>*   **-1**: For a pay-by-data-transfer Internet-facing CLB instance, you can set this parameter to **-1**. This way, the bandwidth of the listener is unlimited.</p>
     * <p>*   **1** to **5120**: For a pay-by-bandwidth Internet-facing SLB instance, you can specify the bandwidth limit of each listener. The sum of bandwidth limits that you set for all listeners cannot exceed the bandwidth limit of the SLB instance.</p>
     */
    @NameInMap("Bandwidth")
    public Integer bandwidth;

    /**
     * <p>The ID of the certification authority (CA) certificate.</p>
     * <br>
     * <p>If both the CA certificate and the server certificate are uploaded, mutual authentication is used.</p>
     * <br>
     * <p>If you upload only the server certificate, one-way authentication is used.</p>
     */
    @NameInMap("CACertificateId")
    public String CACertificateId;

    /**
     * <p>The cookie that is configured on the server.</p>
     * <br>
     * <p>The cookie must be 1 to 200 characters in length and can contain only ASCII characters and digits. It cannot contain commas (,), semicolons (;), or space characters. It cannot start with a dollar sign ($).</p>
     * <br>
     * <p>>  This parameter is required if the **StickySession** parameter is set to **on** and the **StickySessionType** parameter is set to **server**.</p>
     */
    @NameInMap("Cookie")
    public String cookie;

    /**
     * <p>The timeout period of a cookie. Unit: seconds.</p>
     * <br>
     * <p>Valid values: **1** to **86400**.</p>
     * <br>
     * <p>>  If **StickySession** is set to **on** and **StickySessionType** is set to **insert**, this parameter is required.</p>
     */
    @NameInMap("CookieTimeout")
    public Integer cookieTimeout;

    /**
     * <p>The name of the listener.</p>
     * <br>
     * <p>The name must be 1 to 256 characters in length and can contain letters, digits, hyphens (-), forward slashes (/), periods (.), and underscores (\_).</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Specifies whether to enable HTTP/2. Valid values:</p>
     * <br>
     * <p>*   **on**: yes</p>
     * <p>*   **off**: no</p>
     */
    @NameInMap("EnableHttp2")
    public String enableHttp2;

    /**
     * <p>Specifies whether to enable `Gzip` compression to compress specific types of files. Valid values:</p>
     * <br>
     * <p>*   **on**: yes</p>
     * <p>*   **off**: no</p>
     */
    @NameInMap("Gzip")
    public String gzip;

    /**
     * <p>Specifies whether to enable the health check feature. Valid values:</p>
     * <br>
     * <p>*   **on**: yes</p>
     * <p>*   **off**: no</p>
     */
    @NameInMap("HealthCheck")
    public String healthCheck;

    /**
     * <p>The port that is used for health checks.</p>
     * <br>
     * <p>Valid values: **1** to **65535**.</p>
     * <br>
     * <p>>  This parameter takes effect only if the **HealthCheck** parameter is set to **on**.</p>
     */
    @NameInMap("HealthCheckConnectPort")
    public Integer healthCheckConnectPort;

    /**
     * <p>The domain name that is used for health checks. Valid values:</p>
     * <br>
     * <p>*   **$\_ip**: the private IP address of a backend server. If you do not set the HealthCheckDomain parameter or set the parameter to $\_ip, the CLB instance uses the private IP address of each backend server for health checks.</p>
     * <p>*   **domain**: The domain name must be 1 to 80 characters in length and can contain letters, digits, periods (.), and hyphens (-).</p>
     * <br>
     * <p>>  This parameter takes effect only if the **HealthCheck** parameter is set to **on**.</p>
     */
    @NameInMap("HealthCheckDomain")
    public String healthCheckDomain;

    /**
     * <p>The HTTP status code for a successful health check. Separate multiple HTTP status codes with commas (,).</p>
     * <br>
     * <p>Valid values: **http\_2xx**, **http\_3xx**, **http\_4xx**, and **http\_5xx**.</p>
     * <br>
     * <p>>  This parameter takes effect only if the **HealthCheck** parameter is set to **on**.</p>
     */
    @NameInMap("HealthCheckHttpCode")
    public String healthCheckHttpCode;

    /**
     * <p>The interval between two consecutive health checks. Unit: seconds.</p>
     * <br>
     * <p>Valid values: **1** to **50**.</p>
     * <br>
     * <p>>  This parameter takes effect only if the **HealthCheck** parameter is set to **on**.</p>
     */
    @NameInMap("HealthCheckInterval")
    public Integer healthCheckInterval;

    /**
     * <p>The health check method used in HTTP health checks. Valid values: **head** and **get**.</p>
     * <br>
     * <p>>  This parameter takes effect only if the **HealthCheck** parameter is set to **on**.</p>
     */
    @NameInMap("HealthCheckMethod")
    public String healthCheckMethod;

    /**
     * <p>The timeout period of a health check response. If a backend server, such as an Elastic Compute Service (ECS) instance, does not return a health check response within the specified timeout period, the server fails the health check. Unit: seconds.</p>
     * <br>
     * <p>Valid values: **1** to **300**.</p>
     * <br>
     * <p>> </p>
     * <p>*   If the value of the **HealthCheckTimeout** parameter is smaller than that of the **HealthCheckInterval** parameter, the timeout period specified by the **HealthCheckTimeout** parameter is ignored and the period of time specified by the **HealthCheckInterval** parameter is used as the timeout period.</p>
     * <p>*   This parameter takes effect only if the **HealthCheck** parameter is set to **on**.</p>
     */
    @NameInMap("HealthCheckTimeout")
    public Integer healthCheckTimeout;

    /**
     * <p>The URI that is used for health checks.</p>
     * <br>
     * <p>The URI must be 1 to 80 characters in length, and can contain letters, digits, and the following special characters: `-/.%?#&`. The URI must start with a forward slash (`/`), but cannot be a single forward slash (`/`).</p>
     * <br>
     * <p>>  This parameter takes effect only if the **HealthCheck** parameter is set to **on**.</p>
     */
    @NameInMap("HealthCheckURI")
    public String healthCheckURI;

    /**
     * <p>The number of times that an unhealthy backend server must consecutively pass health checks before it is declared healthy. In this case, the health status is changed from **fail** to **success**.</p>
     * <br>
     * <p>Valid values: **2** to **10**.</p>
     * <br>
     * <p>>  This parameter takes effect only if the **HealthCheck** parameter is set to **on**.</p>
     */
    @NameInMap("HealthyThreshold")
    public Integer healthyThreshold;

    /**
     * <p>The timeout period of an idle connection. Valid values: **1 to 60**. Default value: **15**. Unit: seconds.</p>
     * <br>
     * <p>If no request is received within the specified timeout period, CLB closes the connection. When a request is received, CLB establishes a new connection.</p>
     */
    @NameInMap("IdleTimeout")
    public Integer idleTimeout;

    /**
     * <p>The frontend port that is used by the CLB instance.</p>
     * <br>
     * <p>Valid values: **1** to **65535**.</p>
     */
    @NameInMap("ListenerPort")
    public Integer listenerPort;

    /**
     * <p>The ID of the CLB instance.</p>
     */
    @NameInMap("LoadBalancerId")
    public String loadBalancerId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID of the CLB instance.</p>
     * <br>
     * <p>You can query the region ID from the [Regions and zones](~~40654~~) list or by calling the [DescribeRegions](~~25609~~) operation.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The timeout period of a request. Valid values: **1 to 180**. Default value: **60**. Unit: seconds.</p>
     * <br>
     * <p>If no response is received from a backend server within the specified timeout period, CLB returns the HTTP 504 status code to the client.</p>
     */
    @NameInMap("RequestTimeout")
    public Integer requestTimeout;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The scheduling algorithm. Valid values:</p>
     * <br>
     * <p>*   **wrr**: Backend servers with higher weights receive more requests than those with lower weights.</p>
     * <p>*   **rr**: Requests are distributed to backend servers in sequence.</p>
     */
    @NameInMap("Scheduler")
    public String scheduler;

    /**
     * <p>The ID of the server certificate.</p>
     */
    @NameInMap("ServerCertificateId")
    public String serverCertificateId;

    /**
     * <p>Specifies whether to enable session persistence. Valid values:</p>
     * <br>
     * <p>*   **on**: yes</p>
     * <p>*   **off**: no</p>
     */
    @NameInMap("StickySession")
    public String stickySession;

    /**
     * <p>The method that is used to handle a cookie. Valid values: **insert** and **server**.</p>
     * <br>
     * <p>*   **insert**: inserts a cookie.</p>
     * <br>
     * <p>    CLB inserts a cookie (SERVERID) into the first HTTP or HTTPS response packet that is sent to a client. The next request from the client will contain this cookie, and the listener will distribute this request to the recorded backend server.</p>
     * <br>
     * <p>*   **server**: rewrites a cookie.</p>
     * <br>
     * <p>    When CLB detects a user-defined cookie, it overwrites the original cookie with the user-defined cookie. The next request from the client carries the user-defined cookie, and the listener will distribute the request to the recorded backend server.</p>
     * <br>
     * <p>>  This parameter is required if the **StickySession** parameter is set to **on**.</p>
     */
    @NameInMap("StickySessionType")
    public String stickySessionType;

    /**
     * <p>The Transport Layer Security (TLS) security policy. Each security policy contains TLS protocol versions and cipher suites available for HTTPS.</p>
     * <br>
     * <p>*   **tls_cipher_policy\_1\_0**:</p>
     * <br>
     * <p>    Supported TLS versions: TLS 1.0, TLS 1.1, and TLS 1.2</p>
     * <br>
     * <p>    Supported cipher suites: ECDHE-RSA-AES128-GCM-SHA256, ECDHE-RSA-AES256-GCM-SHA384, ECDHE-RSA-AES128-SHA256, ECDHE-RSA-AES256-SHA384, AES128-GCM-SHA256, AES256-GCM-SHA384, AES128-SHA256, AES256-SHA256, ECDHE-RSA-AES128-SHA, ECDHE-RSA-AES256-SHA, AES128-SHA, AES256-SHA, and DES-CBC3-SHA</p>
     * <br>
     * <p>*   **tls_cipher_policy\_1\_1**:</p>
     * <br>
     * <p>    Supported TLS versions: TLS 1.1 and TLS 1.2</p>
     * <br>
     * <p>    Supported cipher suites: ECDHE-RSA-AES128-GCM-SHA256, ECDHE-RSA-AES256-GCM-SHA384, ECDHE-RSA-AES128-SHA256, ECDHE-RSA-AES256-SHA384, AES128-GCM-SHA256, AES256-GCM-SHA384, AES128-SHA256, AES256-SHA256, ECDHE-RSA-AES128-SHA, ECDHE-RSA-AES256-SHA, AES128-SHA, AES256-SHA, and DES-CBC3-SHA</p>
     * <br>
     * <p>*   **tls_cipher_policy\_1\_2**</p>
     * <br>
     * <p>    Supported TLS version: TLS 1.2</p>
     * <br>
     * <p>    Supported cipher suites: ECDHE-RSA-AES128-GCM-SHA256, ECDHE-RSA-AES256-GCM-SHA384, ECDHE-RSA-AES128-SHA256, ECDHE-RSA-AES256-SHA384, AES128-GCM-SHA256, AES256-GCM-SHA384, AES128-SHA256, AES256-SHA256, ECDHE-RSA-AES128-SHA, ECDHE-RSA-AES256-SHA, AES128-SHA, AES256-SHA, and DES-CBC3-SHA</p>
     * <br>
     * <p>*   **tls_cipher_policy\_1\_2\_strict**</p>
     * <br>
     * <p>    Supported TLS version: TLS 1.2</p>
     * <br>
     * <p>    Supported cipher suites: ECDHE-RSA-AES128-GCM-SHA256, ECDHE-RSA-AES256-GCM-SHA384, ECDHE-RSA-AES128-SHA256, ECDHE-RSA-AES256-SHA384, ECDHE-RSA-AES128-SHA, and ECDHE-RSA-AES256-SHA</p>
     * <br>
     * <p>*   **tls_cipher_policy\_1\_2\_strict_with\_1\_3**</p>
     * <br>
     * <p>    Supported TLS versions: TLS 1.2 and TLS 1.3</p>
     * <br>
     * <p>    Supported cipher suites: TLS_AES\_128\_GCM_SHA256, TLS_AES\_256\_GCM_SHA384, TLS_CHACHA20\_POLY1305\_SHA256, TLS_AES\_128\_CCM_SHA256, TLS_AES\_128\_CCM\_8\_SHA256, ECDHE-ECDSA-AES128-GCM-SHA256, ECDHE-ECDSA-AES256-GCM-SHA384, ECDHE-ECDSA-AES128-SHA256, ECDHE-ECDSA-AES256-SHA384, ECDHE-RSA-AES128-GCM-SHA256, ECDHE-RSA-AES256-GCM-SHA384, ECDHE-RSA-AES128-SHA256, ECDHE-RSA-AES256-SHA384, ECDHE-ECDSA-AES128-SHA, ECDHE-ECDSA-AES256-SHA, ECDHE-RSA-AES128-SHA, and ECDHE-RSA-AES256-SHA</p>
     */
    @NameInMap("TLSCipherPolicy")
    public String TLSCipherPolicy;

    /**
     * <p>The tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreateLoadBalancerHTTPSListenerRequestTag> tag;

    /**
     * <p>The number of times that a healthy backend server must consecutively fail health checks before it is declared unhealthy. In this case, the health status is changed from **success** to **fail**.</p>
     * <br>
     * <p>Valid values: **2** to **10**.</p>
     * <br>
     * <p>>  This parameter takes effect only if the **HealthCheck** parameter is set to **on**.</p>
     */
    @NameInMap("UnhealthyThreshold")
    public Integer unhealthyThreshold;

    /**
     * <p>The ID of the server group.</p>
     */
    @NameInMap("VServerGroupId")
    public String VServerGroupId;

    /**
     * <p>Specifies whether to use the `X-Forwarded-For` header to retrieve client IP addresses. Valid values:</p>
     * <br>
     * <p>*   **on**: yes</p>
     * <p>*   **off**: no</p>
     */
    @NameInMap("XForwardedFor")
    public String XForwardedFor;

    @NameInMap("XForwardedFor_ClientSrcPort")
    public String XForwardedFor_ClientSrcPort;

    /**
     * <p>Specifies whether to use the `SLB-ID` header to retrieve the ID of the CLB instance. Valid values:</p>
     * <br>
     * <p>*   **on**: yes</p>
     * <p>*   **off**: no</p>
     */
    @NameInMap("XForwardedFor_SLBID")
    public String XForwardedFor_SLBID;

    /**
     * <p>Specifies whether to use the `SLB-IP` header to retrieve the virtual IP address (VIP) of the client. Valid values:</p>
     * <br>
     * <p>*   **on**: yes</p>
     * <p>*   **off**: no</p>
     */
    @NameInMap("XForwardedFor_SLBIP")
    public String XForwardedFor_SLBIP;

    @NameInMap("XForwardedFor_SLBPORT")
    public String XForwardedFor_SLBPORT;

    /**
     * <p>Specifies whether to use the `X-Forwarded-Proto` header to retrieve the listener protocol. Valid values:</p>
     * <br>
     * <p>*   **on**: yes</p>
     * <p>*   **off**: no</p>
     */
    @NameInMap("XForwardedFor_proto")
    public String XForwardedFor_proto;

    public static CreateLoadBalancerHTTPSListenerRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLoadBalancerHTTPSListenerRequest self = new CreateLoadBalancerHTTPSListenerRequest();
        return TeaModel.build(map, self);
    }

    public CreateLoadBalancerHTTPSListenerRequest setAclId(String aclId) {
        this.aclId = aclId;
        return this;
    }
    public String getAclId() {
        return this.aclId;
    }

    public CreateLoadBalancerHTTPSListenerRequest setAclStatus(String aclStatus) {
        this.aclStatus = aclStatus;
        return this;
    }
    public String getAclStatus() {
        return this.aclStatus;
    }

    public CreateLoadBalancerHTTPSListenerRequest setAclType(String aclType) {
        this.aclType = aclType;
        return this;
    }
    public String getAclType() {
        return this.aclType;
    }

    public CreateLoadBalancerHTTPSListenerRequest setBackendServerPort(Integer backendServerPort) {
        this.backendServerPort = backendServerPort;
        return this;
    }
    public Integer getBackendServerPort() {
        return this.backendServerPort;
    }

    public CreateLoadBalancerHTTPSListenerRequest setBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }
    public Integer getBandwidth() {
        return this.bandwidth;
    }

    public CreateLoadBalancerHTTPSListenerRequest setCACertificateId(String CACertificateId) {
        this.CACertificateId = CACertificateId;
        return this;
    }
    public String getCACertificateId() {
        return this.CACertificateId;
    }

    public CreateLoadBalancerHTTPSListenerRequest setCookie(String cookie) {
        this.cookie = cookie;
        return this;
    }
    public String getCookie() {
        return this.cookie;
    }

    public CreateLoadBalancerHTTPSListenerRequest setCookieTimeout(Integer cookieTimeout) {
        this.cookieTimeout = cookieTimeout;
        return this;
    }
    public Integer getCookieTimeout() {
        return this.cookieTimeout;
    }

    public CreateLoadBalancerHTTPSListenerRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateLoadBalancerHTTPSListenerRequest setEnableHttp2(String enableHttp2) {
        this.enableHttp2 = enableHttp2;
        return this;
    }
    public String getEnableHttp2() {
        return this.enableHttp2;
    }

    public CreateLoadBalancerHTTPSListenerRequest setGzip(String gzip) {
        this.gzip = gzip;
        return this;
    }
    public String getGzip() {
        return this.gzip;
    }

    public CreateLoadBalancerHTTPSListenerRequest setHealthCheck(String healthCheck) {
        this.healthCheck = healthCheck;
        return this;
    }
    public String getHealthCheck() {
        return this.healthCheck;
    }

    public CreateLoadBalancerHTTPSListenerRequest setHealthCheckConnectPort(Integer healthCheckConnectPort) {
        this.healthCheckConnectPort = healthCheckConnectPort;
        return this;
    }
    public Integer getHealthCheckConnectPort() {
        return this.healthCheckConnectPort;
    }

    public CreateLoadBalancerHTTPSListenerRequest setHealthCheckDomain(String healthCheckDomain) {
        this.healthCheckDomain = healthCheckDomain;
        return this;
    }
    public String getHealthCheckDomain() {
        return this.healthCheckDomain;
    }

    public CreateLoadBalancerHTTPSListenerRequest setHealthCheckHttpCode(String healthCheckHttpCode) {
        this.healthCheckHttpCode = healthCheckHttpCode;
        return this;
    }
    public String getHealthCheckHttpCode() {
        return this.healthCheckHttpCode;
    }

    public CreateLoadBalancerHTTPSListenerRequest setHealthCheckInterval(Integer healthCheckInterval) {
        this.healthCheckInterval = healthCheckInterval;
        return this;
    }
    public Integer getHealthCheckInterval() {
        return this.healthCheckInterval;
    }

    public CreateLoadBalancerHTTPSListenerRequest setHealthCheckMethod(String healthCheckMethod) {
        this.healthCheckMethod = healthCheckMethod;
        return this;
    }
    public String getHealthCheckMethod() {
        return this.healthCheckMethod;
    }

    public CreateLoadBalancerHTTPSListenerRequest setHealthCheckTimeout(Integer healthCheckTimeout) {
        this.healthCheckTimeout = healthCheckTimeout;
        return this;
    }
    public Integer getHealthCheckTimeout() {
        return this.healthCheckTimeout;
    }

    public CreateLoadBalancerHTTPSListenerRequest setHealthCheckURI(String healthCheckURI) {
        this.healthCheckURI = healthCheckURI;
        return this;
    }
    public String getHealthCheckURI() {
        return this.healthCheckURI;
    }

    public CreateLoadBalancerHTTPSListenerRequest setHealthyThreshold(Integer healthyThreshold) {
        this.healthyThreshold = healthyThreshold;
        return this;
    }
    public Integer getHealthyThreshold() {
        return this.healthyThreshold;
    }

    public CreateLoadBalancerHTTPSListenerRequest setIdleTimeout(Integer idleTimeout) {
        this.idleTimeout = idleTimeout;
        return this;
    }
    public Integer getIdleTimeout() {
        return this.idleTimeout;
    }

    public CreateLoadBalancerHTTPSListenerRequest setListenerPort(Integer listenerPort) {
        this.listenerPort = listenerPort;
        return this;
    }
    public Integer getListenerPort() {
        return this.listenerPort;
    }

    public CreateLoadBalancerHTTPSListenerRequest setLoadBalancerId(String loadBalancerId) {
        this.loadBalancerId = loadBalancerId;
        return this;
    }
    public String getLoadBalancerId() {
        return this.loadBalancerId;
    }

    public CreateLoadBalancerHTTPSListenerRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateLoadBalancerHTTPSListenerRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateLoadBalancerHTTPSListenerRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateLoadBalancerHTTPSListenerRequest setRequestTimeout(Integer requestTimeout) {
        this.requestTimeout = requestTimeout;
        return this;
    }
    public Integer getRequestTimeout() {
        return this.requestTimeout;
    }

    public CreateLoadBalancerHTTPSListenerRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateLoadBalancerHTTPSListenerRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateLoadBalancerHTTPSListenerRequest setScheduler(String scheduler) {
        this.scheduler = scheduler;
        return this;
    }
    public String getScheduler() {
        return this.scheduler;
    }

    public CreateLoadBalancerHTTPSListenerRequest setServerCertificateId(String serverCertificateId) {
        this.serverCertificateId = serverCertificateId;
        return this;
    }
    public String getServerCertificateId() {
        return this.serverCertificateId;
    }

    public CreateLoadBalancerHTTPSListenerRequest setStickySession(String stickySession) {
        this.stickySession = stickySession;
        return this;
    }
    public String getStickySession() {
        return this.stickySession;
    }

    public CreateLoadBalancerHTTPSListenerRequest setStickySessionType(String stickySessionType) {
        this.stickySessionType = stickySessionType;
        return this;
    }
    public String getStickySessionType() {
        return this.stickySessionType;
    }

    public CreateLoadBalancerHTTPSListenerRequest setTLSCipherPolicy(String TLSCipherPolicy) {
        this.TLSCipherPolicy = TLSCipherPolicy;
        return this;
    }
    public String getTLSCipherPolicy() {
        return this.TLSCipherPolicy;
    }

    public CreateLoadBalancerHTTPSListenerRequest setTag(java.util.List<CreateLoadBalancerHTTPSListenerRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreateLoadBalancerHTTPSListenerRequestTag> getTag() {
        return this.tag;
    }

    public CreateLoadBalancerHTTPSListenerRequest setUnhealthyThreshold(Integer unhealthyThreshold) {
        this.unhealthyThreshold = unhealthyThreshold;
        return this;
    }
    public Integer getUnhealthyThreshold() {
        return this.unhealthyThreshold;
    }

    public CreateLoadBalancerHTTPSListenerRequest setVServerGroupId(String VServerGroupId) {
        this.VServerGroupId = VServerGroupId;
        return this;
    }
    public String getVServerGroupId() {
        return this.VServerGroupId;
    }

    public CreateLoadBalancerHTTPSListenerRequest setXForwardedFor(String XForwardedFor) {
        this.XForwardedFor = XForwardedFor;
        return this;
    }
    public String getXForwardedFor() {
        return this.XForwardedFor;
    }

    public CreateLoadBalancerHTTPSListenerRequest setXForwardedFor_ClientSrcPort(String XForwardedFor_ClientSrcPort) {
        this.XForwardedFor_ClientSrcPort = XForwardedFor_ClientSrcPort;
        return this;
    }
    public String getXForwardedFor_ClientSrcPort() {
        return this.XForwardedFor_ClientSrcPort;
    }

    public CreateLoadBalancerHTTPSListenerRequest setXForwardedFor_SLBID(String XForwardedFor_SLBID) {
        this.XForwardedFor_SLBID = XForwardedFor_SLBID;
        return this;
    }
    public String getXForwardedFor_SLBID() {
        return this.XForwardedFor_SLBID;
    }

    public CreateLoadBalancerHTTPSListenerRequest setXForwardedFor_SLBIP(String XForwardedFor_SLBIP) {
        this.XForwardedFor_SLBIP = XForwardedFor_SLBIP;
        return this;
    }
    public String getXForwardedFor_SLBIP() {
        return this.XForwardedFor_SLBIP;
    }

    public CreateLoadBalancerHTTPSListenerRequest setXForwardedFor_SLBPORT(String XForwardedFor_SLBPORT) {
        this.XForwardedFor_SLBPORT = XForwardedFor_SLBPORT;
        return this;
    }
    public String getXForwardedFor_SLBPORT() {
        return this.XForwardedFor_SLBPORT;
    }

    public CreateLoadBalancerHTTPSListenerRequest setXForwardedFor_proto(String XForwardedFor_proto) {
        this.XForwardedFor_proto = XForwardedFor_proto;
        return this;
    }
    public String getXForwardedFor_proto() {
        return this.XForwardedFor_proto;
    }

    public static class CreateLoadBalancerHTTPSListenerRequestTag extends TeaModel {
        /**
         * <p>The tag key.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateLoadBalancerHTTPSListenerRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreateLoadBalancerHTTPSListenerRequestTag self = new CreateLoadBalancerHTTPSListenerRequestTag();
            return TeaModel.build(map, self);
        }

        public CreateLoadBalancerHTTPSListenerRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateLoadBalancerHTTPSListenerRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
