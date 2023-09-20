// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class CreateDomainRequest extends TeaModel {
    /**
     * <p>The mode in which you want to add the domain name to WAF. Valid values:</p>
     * <br>
     * <p>*   **share:** adds the domain name to WAF in CNAME record mode. This is the default value.</p>
     * <p>*   **hybrid_cloud_cname:** adds the domain name to WAF in hybrid cloud reverse proxy mode.</p>
     */
    @NameInMap("AccessType")
    public String accessType;

    /**
     * <p>The domain name that you want to add to WAF.</p>
     */
    @NameInMap("Domain")
    public String domain;

    /**
     * <p>The ID of the Web Application Firewall (WAF) instance.</p>
     * <br>
     * <p>> You can call the [DescribeInstance](~~433756~~) operation to obtain the ID of the WAF instance.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The configurations of the listeners.</p>
     */
    @NameInMap("Listen")
    public CreateDomainRequestListen listen;

    /**
     * <p>The configurations of the forwarding rule.</p>
     */
    @NameInMap("Redirect")
    public CreateDomainRequestRedirect redirect;

    /**
     * <p>The region where the WAF instance resides. Valid values:</p>
     * <br>
     * <p>*   **cn-hangzhou**: the Chinese mainland</p>
     * <p>*   **ap-southeast-1**: outside the Chinese mainland</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group.</p>
     */
    @NameInMap("ResourceManagerResourceGroupId")
    public String resourceManagerResourceGroupId;

    /**
     * <p>The source IP address of the request. You do not need to specify this parameter. It is automatically obtained by the system.</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    public static CreateDomainRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDomainRequest self = new CreateDomainRequest();
        return TeaModel.build(map, self);
    }

    public CreateDomainRequest setAccessType(String accessType) {
        this.accessType = accessType;
        return this;
    }
    public String getAccessType() {
        return this.accessType;
    }

    public CreateDomainRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public CreateDomainRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateDomainRequest setListen(CreateDomainRequestListen listen) {
        this.listen = listen;
        return this;
    }
    public CreateDomainRequestListen getListen() {
        return this.listen;
    }

    public CreateDomainRequest setRedirect(CreateDomainRequestRedirect redirect) {
        this.redirect = redirect;
        return this;
    }
    public CreateDomainRequestRedirect getRedirect() {
        return this.redirect;
    }

    public CreateDomainRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateDomainRequest setResourceManagerResourceGroupId(String resourceManagerResourceGroupId) {
        this.resourceManagerResourceGroupId = resourceManagerResourceGroupId;
        return this;
    }
    public String getResourceManagerResourceGroupId() {
        return this.resourceManagerResourceGroupId;
    }

    public CreateDomainRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public static class CreateDomainRequestListen extends TeaModel {
        /**
         * <p>The ID of the certificate that you want to add. This parameter is available only if you specify **HttpsPorts**.</p>
         */
        @NameInMap("CertId")
        public String certId;

        /**
         * <p>The type of cipher suite that you want to add. This parameter is available only if you specify **HttpsPorts**. Valid values:</p>
         * <br>
         * <p>*   **1:** all cipher suites.</p>
         * <p>*   **2:** strong cipher suites. You can select this value only if you set **TLSVersion** to **tlsv1.2**.</p>
         * <p>*   **99:** custom cipher suites.</p>
         */
        @NameInMap("CipherSuite")
        public Integer cipherSuite;

        /**
         * <p>The custom cipher suites.</p>
         */
        @NameInMap("CustomCiphers")
        public java.util.List<String> customCiphers;

        /**
         * <p>Specifies whether to support TLS 1.3. This parameter is available only if you specify **HttpsPorts**. Valid values:</p>
         * <br>
         * <p>*   **true**</p>
         * <p>*   **false**</p>
         */
        @NameInMap("EnableTLSv3")
        public Boolean enableTLSv3;

        /**
         * <p>Specifies whether to enable an exclusive IP address. This parameter is available only if you set **IPv6Enabled** to **false** and **ProtectionResource** to **share**. Valid values:</p>
         * <br>
         * <p>*   **true**</p>
         * <p>*   **false** (default)</p>
         */
        @NameInMap("ExclusiveIp")
        public Boolean exclusiveIp;

        /**
         * <p>Specifies whether to enable the HTTP to HTTPS redirection feature. This parameter is available only if you specify HttpsPorts and leave HttpPorts empty. Valid values:</p>
         * <br>
         * <p>*   **true**</p>
         * <p>*   **false**</p>
         */
        @NameInMap("FocusHttps")
        public Boolean focusHttps;

        /**
         * <p>Specifies whether to enable HTTP/2. This parameter is available only if you specify **HttpsPorts**. Valid values:</p>
         * <br>
         * <p>*   true</p>
         * <p>*   **false** (default)</p>
         */
        @NameInMap("Http2Enabled")
        public Boolean http2Enabled;

        /**
         * <p>The HTTP listener port.</p>
         */
        @NameInMap("HttpPorts")
        public java.util.List<Integer> httpPorts;

        /**
         * <p>The HTTPS listener port.</p>
         */
        @NameInMap("HttpsPorts")
        public java.util.List<Integer> httpsPorts;

        /**
         * <p>Specifies whether to enable IPv6. Valid values:</p>
         * <br>
         * <p>*   **true**</p>
         * <p>*   **false** (default)</p>
         */
        @NameInMap("IPv6Enabled")
        public Boolean IPv6Enabled;

        /**
         * <p>The type of the protection resource. Valid values:</p>
         * <br>
         * <p>*   **share:** shared cluster. This is the default value.</p>
         * <p>*   **gslb:** shared cluster-based intelligent load balancing.</p>
         */
        @NameInMap("ProtectionResource")
        public String protectionResource;

        /**
         * <p>Specifies whether to allow access only from SM certificate-based clients. This parameter is available only if you set SM2Enabled to true.</p>
         * <br>
         * <p>*   true</p>
         * <p>*   false</p>
         */
        @NameInMap("SM2AccessOnly")
        public Boolean SM2AccessOnly;

        /**
         * <p>The ID of the SM certificate that you want to add. This parameter is available only if you set SM2Enabled to true.</p>
         */
        @NameInMap("SM2CertId")
        public String SM2CertId;

        /**
         * <p>Specifies whether to enable the SM certificate.</p>
         */
        @NameInMap("SM2Enabled")
        public Boolean SM2Enabled;

        /**
         * <p>The version of the Transport Layer Security (TLS) protocol. This parameter is available only if you specify **HttpsPorts**. Valid values:</p>
         * <br>
         * <p>*   **tlsv1**</p>
         * <p>*   **tlsv1.1**</p>
         * <p>*   **tlsv1.2**</p>
         */
        @NameInMap("TLSVersion")
        public String TLSVersion;

        /**
         * <p>The method that you want WAF to use to obtain the actual IP address of a client. Valid values:</p>
         * <br>
         * <p>*   **0:** No Layer 7 proxies are deployed in front of WAF. This is the default value.</p>
         * <p>*   **1:** WAF reads the first value of the X-Forwarded-For (XFF) header field as the IP address of the client.</p>
         * <p>*   **2:** WAF reads the value of a custom header field as the IP address of the client.</p>
         */
        @NameInMap("XffHeaderMode")
        public Integer xffHeaderMode;

        /**
         * <p>The custom header field that you want WAF to use to obtain the IP address of a client.</p>
         */
        @NameInMap("XffHeaders")
        public java.util.List<String> xffHeaders;

        public static CreateDomainRequestListen build(java.util.Map<String, ?> map) throws Exception {
            CreateDomainRequestListen self = new CreateDomainRequestListen();
            return TeaModel.build(map, self);
        }

        public CreateDomainRequestListen setCertId(String certId) {
            this.certId = certId;
            return this;
        }
        public String getCertId() {
            return this.certId;
        }

        public CreateDomainRequestListen setCipherSuite(Integer cipherSuite) {
            this.cipherSuite = cipherSuite;
            return this;
        }
        public Integer getCipherSuite() {
            return this.cipherSuite;
        }

        public CreateDomainRequestListen setCustomCiphers(java.util.List<String> customCiphers) {
            this.customCiphers = customCiphers;
            return this;
        }
        public java.util.List<String> getCustomCiphers() {
            return this.customCiphers;
        }

        public CreateDomainRequestListen setEnableTLSv3(Boolean enableTLSv3) {
            this.enableTLSv3 = enableTLSv3;
            return this;
        }
        public Boolean getEnableTLSv3() {
            return this.enableTLSv3;
        }

        public CreateDomainRequestListen setExclusiveIp(Boolean exclusiveIp) {
            this.exclusiveIp = exclusiveIp;
            return this;
        }
        public Boolean getExclusiveIp() {
            return this.exclusiveIp;
        }

        public CreateDomainRequestListen setFocusHttps(Boolean focusHttps) {
            this.focusHttps = focusHttps;
            return this;
        }
        public Boolean getFocusHttps() {
            return this.focusHttps;
        }

        public CreateDomainRequestListen setHttp2Enabled(Boolean http2Enabled) {
            this.http2Enabled = http2Enabled;
            return this;
        }
        public Boolean getHttp2Enabled() {
            return this.http2Enabled;
        }

        public CreateDomainRequestListen setHttpPorts(java.util.List<Integer> httpPorts) {
            this.httpPorts = httpPorts;
            return this;
        }
        public java.util.List<Integer> getHttpPorts() {
            return this.httpPorts;
        }

        public CreateDomainRequestListen setHttpsPorts(java.util.List<Integer> httpsPorts) {
            this.httpsPorts = httpsPorts;
            return this;
        }
        public java.util.List<Integer> getHttpsPorts() {
            return this.httpsPorts;
        }

        public CreateDomainRequestListen setIPv6Enabled(Boolean IPv6Enabled) {
            this.IPv6Enabled = IPv6Enabled;
            return this;
        }
        public Boolean getIPv6Enabled() {
            return this.IPv6Enabled;
        }

        public CreateDomainRequestListen setProtectionResource(String protectionResource) {
            this.protectionResource = protectionResource;
            return this;
        }
        public String getProtectionResource() {
            return this.protectionResource;
        }

        public CreateDomainRequestListen setSM2AccessOnly(Boolean SM2AccessOnly) {
            this.SM2AccessOnly = SM2AccessOnly;
            return this;
        }
        public Boolean getSM2AccessOnly() {
            return this.SM2AccessOnly;
        }

        public CreateDomainRequestListen setSM2CertId(String SM2CertId) {
            this.SM2CertId = SM2CertId;
            return this;
        }
        public String getSM2CertId() {
            return this.SM2CertId;
        }

        public CreateDomainRequestListen setSM2Enabled(Boolean SM2Enabled) {
            this.SM2Enabled = SM2Enabled;
            return this;
        }
        public Boolean getSM2Enabled() {
            return this.SM2Enabled;
        }

        public CreateDomainRequestListen setTLSVersion(String TLSVersion) {
            this.TLSVersion = TLSVersion;
            return this;
        }
        public String getTLSVersion() {
            return this.TLSVersion;
        }

        public CreateDomainRequestListen setXffHeaderMode(Integer xffHeaderMode) {
            this.xffHeaderMode = xffHeaderMode;
            return this;
        }
        public Integer getXffHeaderMode() {
            return this.xffHeaderMode;
        }

        public CreateDomainRequestListen setXffHeaders(java.util.List<String> xffHeaders) {
            this.xffHeaders = xffHeaders;
            return this;
        }
        public java.util.List<String> getXffHeaders() {
            return this.xffHeaders;
        }

    }

    public static class CreateDomainRequestRedirectRequestHeaders extends TeaModel {
        /**
         * <p>The key of the custom header field.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the custom header field.</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateDomainRequestRedirectRequestHeaders build(java.util.Map<String, ?> map) throws Exception {
            CreateDomainRequestRedirectRequestHeaders self = new CreateDomainRequestRedirectRequestHeaders();
            return TeaModel.build(map, self);
        }

        public CreateDomainRequestRedirectRequestHeaders setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateDomainRequestRedirectRequestHeaders setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateDomainRequestRedirect extends TeaModel {
        /**
         * <p>The back-to-origin IP addresses or domain names.</p>
         */
        @NameInMap("Backends")
        public java.util.List<String> backends;

        /**
         * <p>Specifies whether to enable the public cloud disaster recovery feature. Valid values:</p>
         * <br>
         * <p>*   **true**</p>
         * <p>*   **false** (default)</p>
         */
        @NameInMap("CnameEnabled")
        public Boolean cnameEnabled;

        /**
         * <p>The connection timeout period. Unit: seconds. Valid values: 1 to 3600.</p>
         */
        @NameInMap("ConnectTimeout")
        public Integer connectTimeout;

        /**
         * <p>Specifies whether to enable HTTPS to HTTP redirection for back-to-origin requests. This parameter is available only if you specify **HttpsPorts**. Valid values:</p>
         * <br>
         * <p>*   **true**</p>
         * <p>*   **false**</p>
         */
        @NameInMap("FocusHttpBackend")
        public Boolean focusHttpBackend;

        /**
         * <p>Specifies whether to enable the persistent connection feature. Valid values:</p>
         * <br>
         * <p>*   **true** (default)</p>
         * <p>*   **false**</p>
         */
        @NameInMap("Keepalive")
        public Boolean keepalive;

        /**
         * <p>The number of reused persistent connections. Valid values: 60 to 1000.</p>
         * <br>
         * <p>> This parameter specifies the number of reused persistent connections after you enable the persistent connection feature.</p>
         */
        @NameInMap("KeepaliveRequests")
        public Integer keepaliveRequests;

        /**
         * <p>The timeout period of persistent connections that are in the Idle state. Unit: seconds. Valid values: 1 to 60. Default value: 15.</p>
         * <br>
         * <p>> This parameter specifies the period of time during which a reused persistent connection is allowed to remain in the Idle state before the persistent connection is released.</p>
         */
        @NameInMap("KeepaliveTimeout")
        public Integer keepaliveTimeout;

        /**
         * <p>The load balancing algorithm that you want WAF to use to forward requests to the origin server. Valid values:</p>
         * <br>
         * <p>*   **iphash**</p>
         * <p>*   **roundRobin**</p>
         * <p>*   **leastTime**. You can select this value only if you set **ProtectionResource** to **gslb**.</p>
         */
        @NameInMap("Loadbalance")
        public String loadbalance;

        /**
         * <p>The read timeout period. Unit: seconds. Valid values: 1 to 3600.</p>
         */
        @NameInMap("ReadTimeout")
        public Integer readTimeout;

        /**
         * <p>The key-value pairs that you want to use to mark the requests that pass through the WAF instance.</p>
         * <br>
         * <p>WAF adds the key-value pairs to the request headers. This way, the requests that pass through WAF are identified.</p>
         */
        @NameInMap("RequestHeaders")
        public java.util.List<CreateDomainRequestRedirectRequestHeaders> requestHeaders;

        /**
         * <p>Specifies whether WAF retries to forward requests when the requests fail to be forwarded to the origin server. Valid values:</p>
         * <br>
         * <p>*   **true** (default)</p>
         * <p>*   **false**</p>
         */
        @NameInMap("Retry")
        public Boolean retry;

        /**
         * <p>The forwarding rules that you want to configure for the domain name that you want to add to WAF in hybrid cloud mode. Set this parameter to a string that consists of JSON arrays. Each element in a JSON array is a JSON struct that contains the following fields:</p>
         * <br>
         * <p>*   **rs:** The back-to-origin IP addresses or CNAMEs. The value must be of the ARRAY type.</p>
         * <p>*   **location:** The name of the protection node. The value must be of the STRING type.</p>
         * <p>*   **locationId:** The ID of the protection node. The value must be of the LONG type.</p>
         */
        @NameInMap("RoutingRules")
        public String routingRules;

        /**
         * <p>Specifies whether to enable origin Server Name Indication (SNI). This parameter is available only if you specify **HttpsPorts**. Valid values:</p>
         * <br>
         * <p>*   **true**</p>
         * <p>*   **false** (default)</p>
         */
        @NameInMap("SniEnabled")
        public Boolean sniEnabled;

        /**
         * <p>The value of the custom SNI field. If you do not specify this parameter, the value of the **Host** field in the request header is used. If you want WAF to use an SNI field value that is different from the value of the Host field in back-to-origin requests, you can specify a custom value for the SNI field.</p>
         * <br>
         * <p>> This parameter is available only if you set **SniEnabled** to **true**.</p>
         */
        @NameInMap("SniHost")
        public String sniHost;

        /**
         * <p>The write timeout period. Unit: seconds. Valid values: 1 to 3600.</p>
         */
        @NameInMap("WriteTimeout")
        public Integer writeTimeout;

        public static CreateDomainRequestRedirect build(java.util.Map<String, ?> map) throws Exception {
            CreateDomainRequestRedirect self = new CreateDomainRequestRedirect();
            return TeaModel.build(map, self);
        }

        public CreateDomainRequestRedirect setBackends(java.util.List<String> backends) {
            this.backends = backends;
            return this;
        }
        public java.util.List<String> getBackends() {
            return this.backends;
        }

        public CreateDomainRequestRedirect setCnameEnabled(Boolean cnameEnabled) {
            this.cnameEnabled = cnameEnabled;
            return this;
        }
        public Boolean getCnameEnabled() {
            return this.cnameEnabled;
        }

        public CreateDomainRequestRedirect setConnectTimeout(Integer connectTimeout) {
            this.connectTimeout = connectTimeout;
            return this;
        }
        public Integer getConnectTimeout() {
            return this.connectTimeout;
        }

        public CreateDomainRequestRedirect setFocusHttpBackend(Boolean focusHttpBackend) {
            this.focusHttpBackend = focusHttpBackend;
            return this;
        }
        public Boolean getFocusHttpBackend() {
            return this.focusHttpBackend;
        }

        public CreateDomainRequestRedirect setKeepalive(Boolean keepalive) {
            this.keepalive = keepalive;
            return this;
        }
        public Boolean getKeepalive() {
            return this.keepalive;
        }

        public CreateDomainRequestRedirect setKeepaliveRequests(Integer keepaliveRequests) {
            this.keepaliveRequests = keepaliveRequests;
            return this;
        }
        public Integer getKeepaliveRequests() {
            return this.keepaliveRequests;
        }

        public CreateDomainRequestRedirect setKeepaliveTimeout(Integer keepaliveTimeout) {
            this.keepaliveTimeout = keepaliveTimeout;
            return this;
        }
        public Integer getKeepaliveTimeout() {
            return this.keepaliveTimeout;
        }

        public CreateDomainRequestRedirect setLoadbalance(String loadbalance) {
            this.loadbalance = loadbalance;
            return this;
        }
        public String getLoadbalance() {
            return this.loadbalance;
        }

        public CreateDomainRequestRedirect setReadTimeout(Integer readTimeout) {
            this.readTimeout = readTimeout;
            return this;
        }
        public Integer getReadTimeout() {
            return this.readTimeout;
        }

        public CreateDomainRequestRedirect setRequestHeaders(java.util.List<CreateDomainRequestRedirectRequestHeaders> requestHeaders) {
            this.requestHeaders = requestHeaders;
            return this;
        }
        public java.util.List<CreateDomainRequestRedirectRequestHeaders> getRequestHeaders() {
            return this.requestHeaders;
        }

        public CreateDomainRequestRedirect setRetry(Boolean retry) {
            this.retry = retry;
            return this;
        }
        public Boolean getRetry() {
            return this.retry;
        }

        public CreateDomainRequestRedirect setRoutingRules(String routingRules) {
            this.routingRules = routingRules;
            return this;
        }
        public String getRoutingRules() {
            return this.routingRules;
        }

        public CreateDomainRequestRedirect setSniEnabled(Boolean sniEnabled) {
            this.sniEnabled = sniEnabled;
            return this;
        }
        public Boolean getSniEnabled() {
            return this.sniEnabled;
        }

        public CreateDomainRequestRedirect setSniHost(String sniHost) {
            this.sniHost = sniHost;
            return this;
        }
        public String getSniHost() {
            return this.sniHost;
        }

        public CreateDomainRequestRedirect setWriteTimeout(Integer writeTimeout) {
            this.writeTimeout = writeTimeout;
            return this;
        }
        public Integer getWriteTimeout() {
            return this.writeTimeout;
        }

    }

}
