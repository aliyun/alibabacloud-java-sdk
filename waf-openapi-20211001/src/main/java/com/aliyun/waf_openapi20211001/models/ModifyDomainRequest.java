// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class ModifyDomainRequest extends TeaModel {
    /**
     * <p>The mode in which you want to add the domain name to WAF. Set the value to share.</p>
     * <br>
     * <p>*   **share:** adds the domain name to WAF in CNAME record mode. This is the default value.</p>
     */
    @NameInMap("AccessType")
    public String accessType;

    /**
     * <p>The domain name whose access configurations you want to modify.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Domain")
    public String domain;

    /**
     * <p>The ID of the WAF instance.</p>
     * <br>
     * <p>>  You can call the [DescribeInstance](https://help.aliyun.com/document_detail/433756.html) operation to obtain the ID of the WAF instance.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The configurations of the listeners.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Listen")
    public ModifyDomainRequestListen listen;

    /**
     * <p>The configurations of the forwarding rule.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Redirect")
    public ModifyDomainRequestRedirect redirect;

    /**
     * <p>The region where the WAF instance resides. Valid values:</p>
     * <br>
     * <p>*   **cn-hangzhou:** the Chinese mainland.</p>
     * <p>*   **ap-southeast-1:** outside the Chinese mainland.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static ModifyDomainRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDomainRequest self = new ModifyDomainRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDomainRequest setAccessType(String accessType) {
        this.accessType = accessType;
        return this;
    }
    public String getAccessType() {
        return this.accessType;
    }

    public ModifyDomainRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public ModifyDomainRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyDomainRequest setListen(ModifyDomainRequestListen listen) {
        this.listen = listen;
        return this;
    }
    public ModifyDomainRequestListen getListen() {
        return this.listen;
    }

    public ModifyDomainRequest setRedirect(ModifyDomainRequestRedirect redirect) {
        this.redirect = redirect;
        return this;
    }
    public ModifyDomainRequestRedirect getRedirect() {
        return this.redirect;
    }

    public ModifyDomainRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public static class ModifyDomainRequestListen extends TeaModel {
        /**
         * <p>The ID of the certificate that you want to add.</p>
         */
        @NameInMap("CertId")
        public String certId;

        /**
         * <p>The type of cipher suite that you want to add. This parameter is available only when you specify the **HttpsPorts** parameter. Valid values:</p>
         * <br>
         * <p>*   **1:** all cipher suites.</p>
         * <p>*   **2:** strong cipher suites. You can select this value only when you set the **TLSVersion** parameter to **tlsv1.2**.</p>
         * <p>*   **99:** custom cipher suites.</p>
         */
        @NameInMap("CipherSuite")
        public Integer cipherSuite;

        /**
         * <p>The custom cipher suites that you want to add. This parameter is available only when you set the **CipherSuite** parameter to **99**.</p>
         */
        @NameInMap("CustomCiphers")
        public java.util.List<String> customCiphers;

        /**
         * <p>Specifies whether to support TLS 1.3. This parameter is available only when you specify the **HttpsPorts** parameter. Valid values:</p>
         * <br>
         * <p>*   **true:** supports TLS 1.3.</p>
         * <p>*   **false:** does not support TLS 1.3.</p>
         */
        @NameInMap("EnableTLSv3")
        public Boolean enableTLSv3;

        /**
         * <p>Specifies whether to enable an exclusive IP address for the domain name. This parameter is available only when you set the **IPv6Enabled** parameter to false and the **ProtectionResource** parameter to **share**. Valid values:</p>
         * <br>
         * <p>*   **true:** enables an exclusive IP address for the domain name.</p>
         * <p>*   **false:** does not enable an exclusive IP address for the domain name. This is the default value.</p>
         */
        @NameInMap("ExclusiveIp")
        public Boolean exclusiveIp;

        /**
         * <p>Specifies whether to enable HTTP to HTTPS redirection for the domain name. This parameter is available only when you specify the **HttpsPorts** parameter and leave the **HttpPorts** parameter empty. Valid values:</p>
         * <br>
         * <p>*   **true:** enables HTTP to HTTPS redirection.</p>
         * <p>*   **false:** disables HTTP to HTTPS redirection.</p>
         */
        @NameInMap("FocusHttps")
        public Boolean focusHttps;

        /**
         * <p>Specifies whether to enable HTTP/2. This parameter is available only when you specify the **HttpsPorts** parameter. Valid values:</p>
         * <br>
         * <p>*   **true:** enables HTTP/2.</p>
         * <p>*   **false:** disables HTTP/2. This is the default value.</p>
         */
        @NameInMap("Http2Enabled")
        public Boolean http2Enabled;

        /**
         * <p>An array of HTTP listener ports. Specify the value of this parameter in the [port1,port2,...] format.</p>
         */
        @NameInMap("HttpPorts")
        public java.util.List<Integer> httpPorts;

        /**
         * <p>An array of HTTPS listener ports. Specify the value of this parameter in the [port1,port2,...] format.</p>
         */
        @NameInMap("HttpsPorts")
        public java.util.List<Integer> httpsPorts;

        /**
         * <p>Specifies whether to enable IPv6. Valid values:</p>
         * <br>
         * <p>*   **true:** enables IPv6.</p>
         * <p>*   **false:** disables IPv6. This is the default value.</p>
         */
        @NameInMap("IPv6Enabled")
        public Boolean IPv6Enabled;

        /**
         * <p>The type of the protection resource that you want to use. Valid values:</p>
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
         * <p>Indicates whether SM certificate-based verification is enabled. Valid values:</p>
         * <br>
         * <p>*   **true**</p>
         * <p>*   **false**</p>
         */
        @NameInMap("SM2Enabled")
        public Boolean SM2Enabled;

        /**
         * <p>The version of the Transport Layer Security (TLS) protocol. This parameter is available only when you specify the **HttpsPorts** parameter. Valid values:</p>
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
         * <p>*   **1:** WAF reads the first value of the X-Forwarded-For (XFF) header field as the actual IP address of the client.</p>
         * <p>*   **2:** WAF reads the value of a custom header field as the actual IP address of the client.</p>
         */
        @NameInMap("XffHeaderMode")
        public Integer xffHeaderMode;

        /**
         * <p>The custom header fields that you want to use to obtain the actual IP address of a client. Specify the value of this parameter in the ["header1","header2",...] format.</p>
         * <br>
         * <p>>  If you set the **XffHeaderMode** parameter to 2, this parameter is required.</p>
         */
        @NameInMap("XffHeaders")
        public java.util.List<String> xffHeaders;

        public static ModifyDomainRequestListen build(java.util.Map<String, ?> map) throws Exception {
            ModifyDomainRequestListen self = new ModifyDomainRequestListen();
            return TeaModel.build(map, self);
        }

        public ModifyDomainRequestListen setCertId(String certId) {
            this.certId = certId;
            return this;
        }
        public String getCertId() {
            return this.certId;
        }

        public ModifyDomainRequestListen setCipherSuite(Integer cipherSuite) {
            this.cipherSuite = cipherSuite;
            return this;
        }
        public Integer getCipherSuite() {
            return this.cipherSuite;
        }

        public ModifyDomainRequestListen setCustomCiphers(java.util.List<String> customCiphers) {
            this.customCiphers = customCiphers;
            return this;
        }
        public java.util.List<String> getCustomCiphers() {
            return this.customCiphers;
        }

        public ModifyDomainRequestListen setEnableTLSv3(Boolean enableTLSv3) {
            this.enableTLSv3 = enableTLSv3;
            return this;
        }
        public Boolean getEnableTLSv3() {
            return this.enableTLSv3;
        }

        public ModifyDomainRequestListen setExclusiveIp(Boolean exclusiveIp) {
            this.exclusiveIp = exclusiveIp;
            return this;
        }
        public Boolean getExclusiveIp() {
            return this.exclusiveIp;
        }

        public ModifyDomainRequestListen setFocusHttps(Boolean focusHttps) {
            this.focusHttps = focusHttps;
            return this;
        }
        public Boolean getFocusHttps() {
            return this.focusHttps;
        }

        public ModifyDomainRequestListen setHttp2Enabled(Boolean http2Enabled) {
            this.http2Enabled = http2Enabled;
            return this;
        }
        public Boolean getHttp2Enabled() {
            return this.http2Enabled;
        }

        public ModifyDomainRequestListen setHttpPorts(java.util.List<Integer> httpPorts) {
            this.httpPorts = httpPorts;
            return this;
        }
        public java.util.List<Integer> getHttpPorts() {
            return this.httpPorts;
        }

        public ModifyDomainRequestListen setHttpsPorts(java.util.List<Integer> httpsPorts) {
            this.httpsPorts = httpsPorts;
            return this;
        }
        public java.util.List<Integer> getHttpsPorts() {
            return this.httpsPorts;
        }

        public ModifyDomainRequestListen setIPv6Enabled(Boolean IPv6Enabled) {
            this.IPv6Enabled = IPv6Enabled;
            return this;
        }
        public Boolean getIPv6Enabled() {
            return this.IPv6Enabled;
        }

        public ModifyDomainRequestListen setProtectionResource(String protectionResource) {
            this.protectionResource = protectionResource;
            return this;
        }
        public String getProtectionResource() {
            return this.protectionResource;
        }

        public ModifyDomainRequestListen setSM2AccessOnly(Boolean SM2AccessOnly) {
            this.SM2AccessOnly = SM2AccessOnly;
            return this;
        }
        public Boolean getSM2AccessOnly() {
            return this.SM2AccessOnly;
        }

        public ModifyDomainRequestListen setSM2CertId(String SM2CertId) {
            this.SM2CertId = SM2CertId;
            return this;
        }
        public String getSM2CertId() {
            return this.SM2CertId;
        }

        public ModifyDomainRequestListen setSM2Enabled(Boolean SM2Enabled) {
            this.SM2Enabled = SM2Enabled;
            return this;
        }
        public Boolean getSM2Enabled() {
            return this.SM2Enabled;
        }

        public ModifyDomainRequestListen setTLSVersion(String TLSVersion) {
            this.TLSVersion = TLSVersion;
            return this;
        }
        public String getTLSVersion() {
            return this.TLSVersion;
        }

        public ModifyDomainRequestListen setXffHeaderMode(Integer xffHeaderMode) {
            this.xffHeaderMode = xffHeaderMode;
            return this;
        }
        public Integer getXffHeaderMode() {
            return this.xffHeaderMode;
        }

        public ModifyDomainRequestListen setXffHeaders(java.util.List<String> xffHeaders) {
            this.xffHeaders = xffHeaders;
            return this;
        }
        public java.util.List<String> getXffHeaders() {
            return this.xffHeaders;
        }

    }

    public static class ModifyDomainRequestRedirectRequestHeaders extends TeaModel {
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

        public static ModifyDomainRequestRedirectRequestHeaders build(java.util.Map<String, ?> map) throws Exception {
            ModifyDomainRequestRedirectRequestHeaders self = new ModifyDomainRequestRedirectRequestHeaders();
            return TeaModel.build(map, self);
        }

        public ModifyDomainRequestRedirectRequestHeaders setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ModifyDomainRequestRedirectRequestHeaders setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ModifyDomainRequestRedirect extends TeaModel {
        /**
         * <p>The IP addresses or domain names of the origin server. You can use only one of the address types. If you use the domain name type, the domain name can be resolved only to an IPv4 address.</p>
         * <br>
         * <p>*   If you use the IP address type, specify the value in the ["ip1","ip2",...] format. You can enter up to 20 IP addresses.</p>
         * <p>*   If you use the domain name type, specify the value in the ["domain"] format. You can enter up to 20 domain names.</p>
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
         * <p>The timeout period for connections. Unit: seconds. Valid values: 1 to 3600.</p>
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
         * <p>>  This parameter specifies the number of reused persistent connections after you enable the persistent connection feature.</p>
         */
        @NameInMap("KeepaliveRequests")
        public Integer keepaliveRequests;

        /**
         * <p>The timeout period for idle persistent connections. Valid values: 1 to 60. Default value: 15. Unit: seconds.</p>
         * <br>
         * <p>>  This parameter specifies the time for which a reused persistent connection can remain in the Idle state before the persistent connection is released.</p>
         */
        @NameInMap("KeepaliveTimeout")
        public Integer keepaliveTimeout;

        /**
         * <p>The load balancing algorithm that you want to use to forward requests to the origin server. Valid values:</p>
         * <br>
         * <p>*   **ip_hash**</p>
         * <p>*   **roundRobin**</p>
         * <p>*   **leastTime** You can set the parameter to this value only if you set **ProtectionResource** to **gslb**.</p>
         * <br>
         * <p>This parameter is required.</p>
         */
        @NameInMap("Loadbalance")
        public String loadbalance;

        /**
         * <p>The timeout period for read connections. Unit: seconds. Valid values: 1 to 3600.</p>
         */
        @NameInMap("ReadTimeout")
        public Integer readTimeout;

        /**
         * <p>The custom header field that you want to use to label requests that are processed by WAF.</p>
         * <br>
         * <p>When a request passes through WAF, the custom header field is automatically used to label the request. This way, the backend service can identify requests that are processed by WAF.</p>
         */
        @NameInMap("RequestHeaders")
        public java.util.List<ModifyDomainRequestRedirectRequestHeaders> requestHeaders;

        /**
         * <p>Specifies whether WAF retries forwarding requests to the origin server when the requests fail to be forwarded to the origin server. Valid values:</p>
         * <br>
         * <p>*   **true** (default)</p>
         * <p>*   **false**</p>
         */
        @NameInMap("Retry")
        public Boolean retry;

        /**
         * <p>The forwarding rules that you want to configure for the domain name that you want to add to WAF in hybrid cloud mode. This parameter is a string that consists of JSON arrays. Each element in a JSON array is a JSON struct that contains the following fields:</p>
         * <br>
         * <p>*   **rs**: the back-to-origin IP addresses or CNAMEs. The value must be of the ARRAY type.</p>
         * <p>*   **location**: the name of the protection node. The value must be of the STRING type.</p>
         * <p>*   **locationId**: the ID of the protection node. The value must be of the LONG type.</p>
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
         * <p>The value of the SNI field. If you do not specify this parameter, the value of the **Host** field is automatically used. This parameter is optional. If you want WAF to use an SNI field value that is different from the Host field value in back-to-origin requests, you can specify a custom value for the SNI field.</p>
         * <br>
         * <p>>  This parameter is required only if you set **SniEnalbed** to xxx.</p>
         */
        @NameInMap("SniHost")
        public String sniHost;

        /**
         * <p>The timeout period for write connections. Unit: seconds. Valid values: 1 to 3600.</p>
         */
        @NameInMap("WriteTimeout")
        public Integer writeTimeout;

        /**
         * <p>Specifies whether to use the X-Forward-For-Proto header to identify the protocol used by WAF to forward requests to the origin server. Valid values:</p>
         * <br>
         * <p>*   **true** (default)</p>
         * <p>*   **false**</p>
         */
        @NameInMap("XffProto")
        public Boolean xffProto;

        public static ModifyDomainRequestRedirect build(java.util.Map<String, ?> map) throws Exception {
            ModifyDomainRequestRedirect self = new ModifyDomainRequestRedirect();
            return TeaModel.build(map, self);
        }

        public ModifyDomainRequestRedirect setBackends(java.util.List<String> backends) {
            this.backends = backends;
            return this;
        }
        public java.util.List<String> getBackends() {
            return this.backends;
        }

        public ModifyDomainRequestRedirect setCnameEnabled(Boolean cnameEnabled) {
            this.cnameEnabled = cnameEnabled;
            return this;
        }
        public Boolean getCnameEnabled() {
            return this.cnameEnabled;
        }

        public ModifyDomainRequestRedirect setConnectTimeout(Integer connectTimeout) {
            this.connectTimeout = connectTimeout;
            return this;
        }
        public Integer getConnectTimeout() {
            return this.connectTimeout;
        }

        public ModifyDomainRequestRedirect setFocusHttpBackend(Boolean focusHttpBackend) {
            this.focusHttpBackend = focusHttpBackend;
            return this;
        }
        public Boolean getFocusHttpBackend() {
            return this.focusHttpBackend;
        }

        public ModifyDomainRequestRedirect setKeepalive(Boolean keepalive) {
            this.keepalive = keepalive;
            return this;
        }
        public Boolean getKeepalive() {
            return this.keepalive;
        }

        public ModifyDomainRequestRedirect setKeepaliveRequests(Integer keepaliveRequests) {
            this.keepaliveRequests = keepaliveRequests;
            return this;
        }
        public Integer getKeepaliveRequests() {
            return this.keepaliveRequests;
        }

        public ModifyDomainRequestRedirect setKeepaliveTimeout(Integer keepaliveTimeout) {
            this.keepaliveTimeout = keepaliveTimeout;
            return this;
        }
        public Integer getKeepaliveTimeout() {
            return this.keepaliveTimeout;
        }

        public ModifyDomainRequestRedirect setLoadbalance(String loadbalance) {
            this.loadbalance = loadbalance;
            return this;
        }
        public String getLoadbalance() {
            return this.loadbalance;
        }

        public ModifyDomainRequestRedirect setReadTimeout(Integer readTimeout) {
            this.readTimeout = readTimeout;
            return this;
        }
        public Integer getReadTimeout() {
            return this.readTimeout;
        }

        public ModifyDomainRequestRedirect setRequestHeaders(java.util.List<ModifyDomainRequestRedirectRequestHeaders> requestHeaders) {
            this.requestHeaders = requestHeaders;
            return this;
        }
        public java.util.List<ModifyDomainRequestRedirectRequestHeaders> getRequestHeaders() {
            return this.requestHeaders;
        }

        public ModifyDomainRequestRedirect setRetry(Boolean retry) {
            this.retry = retry;
            return this;
        }
        public Boolean getRetry() {
            return this.retry;
        }

        public ModifyDomainRequestRedirect setRoutingRules(String routingRules) {
            this.routingRules = routingRules;
            return this;
        }
        public String getRoutingRules() {
            return this.routingRules;
        }

        public ModifyDomainRequestRedirect setSniEnabled(Boolean sniEnabled) {
            this.sniEnabled = sniEnabled;
            return this;
        }
        public Boolean getSniEnabled() {
            return this.sniEnabled;
        }

        public ModifyDomainRequestRedirect setSniHost(String sniHost) {
            this.sniHost = sniHost;
            return this;
        }
        public String getSniHost() {
            return this.sniHost;
        }

        public ModifyDomainRequestRedirect setWriteTimeout(Integer writeTimeout) {
            this.writeTimeout = writeTimeout;
            return this;
        }
        public Integer getWriteTimeout() {
            return this.writeTimeout;
        }

        public ModifyDomainRequestRedirect setXffProto(Boolean xffProto) {
            this.xffProto = xffProto;
            return this;
        }
        public Boolean getXffProto() {
            return this.xffProto;
        }

    }

}
