// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class ModifyDomainRequest extends TeaModel {
    /**
     * <p>The access mode of the WAF instance. Valid values:</p>
     * <ul>
     * <li><p><strong>share</strong> (default): onboarding by using a CNAME record.</p>
     * </li>
     * <li><p><strong>hybrid_cloud_cname</strong>: onboarding by using a hybrid cloud CNAME record.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>share</p>
     */
    @NameInMap("AccessType")
    public String accessType;

    /**
     * <p>The domain name whose configurations you want to modify.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://www.aliyundoc.com">www.aliyundoc.com</a></p>
     */
    @NameInMap("Domain")
    public String domain;

    /**
     * <p>The ID of the domain name.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://www.aliyundoc.com-waf">www.aliyundoc.com-waf</a></p>
     */
    @NameInMap("DomainId")
    public String domainId;

    /**
     * <p>The ID of the WAF instance.</p>
     * <blockquote>
     * <p>Call the <a href="https://help.aliyun.com/document_detail/433756.html">DescribeInstance</a> operation to query the ID of the WAF instance.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>waf_cdnsdf3****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The listening settings.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Listen")
    public ModifyDomainRequestListen listen;

    /**
     * <p>The forwarding settings.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Redirect")
    public ModifyDomainRequestRedirect redirect;

    /**
     * <p>The region where the WAF instance resides. Valid values:</p>
     * <ul>
     * <li><p><strong>cn-hangzhou</strong>: the Chinese mainland.</p>
     * </li>
     * <li><p><strong>ap-southeast-1</strong>: outside the Chinese mainland.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
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

    public ModifyDomainRequest setDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }
    public String getDomainId() {
        return this.domainId;
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
         * <p>The ID of the certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("CertId")
        public String certId;

        /**
         * <p>The type of the cipher suite. This parameter is available only when <strong>HttpsPorts</strong> is not empty, which indicates that the domain uses HTTPS. Valid values:</p>
         * <ul>
         * <li><p><strong>1</strong>: all cipher suites.</p>
         * </li>
         * <li><p><strong>2</strong>: strong cipher suites. You can select this value only when you set <strong>TLSVersion</strong> to <strong>tlsv1.2</strong>.</p>
         * </li>
         * <li><p><strong>99</strong>: custom cipher suites.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("CipherSuite")
        public Integer cipherSuite;

        /**
         * <p>The custom cipher suites. This parameter is available only when you set <strong>CipherSuite</strong> to <strong>99</strong>.</p>
         */
        @NameInMap("CustomCiphers")
        public java.util.List<String> customCiphers;

        /**
         * <p>Indicates whether TLS 1.3 is supported. This parameter is available only when <strong>HttpsPorts</strong> is not empty, which indicates that the domain uses HTTPS. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: TLS 1.3 is supported.</p>
         * </li>
         * <li><p><strong>false</strong>: TLS 1.3 is not supported.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EnableTLSv3")
        public Boolean enableTLSv3;

        /**
         * <p>Indicates whether an exclusive IP address is enabled. This parameter is available only when you set <strong>IPv6Enabled</strong> to false and <strong>ProtectionResource</strong> to <strong>share</strong>. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: An exclusive IP address is enabled.</p>
         * </li>
         * <li><p><strong>false</strong> (default): An exclusive IP address is disabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("ExclusiveIp")
        public Boolean exclusiveIp;

        /**
         * <p>Indicates whether forced HTTPS redirection is enabled. This parameter is available only when the domain uses HTTPS but not HTTP. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: Forced HTTPS redirection is enabled.</p>
         * </li>
         * <li><p><strong>false</strong>: Forced HTTPS redirection is disabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("FocusHttps")
        public Boolean focusHttps;

        /**
         * <p>Indicates whether subdomains are included in the HTTP Strict Transport Security (HSTS) policy. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: Subdomains are included.</p>
         * </li>
         * <li><p><strong>false</strong>: Subdomains are not included.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("HstsIncludeSubDomain")
        public Boolean hstsIncludeSubDomain;

        /**
         * <p>The time-to-live (TTL) of the HSTS policy. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>365000</p>
         */
        @NameInMap("HstsMaxAge")
        public Long hstsMaxAge;

        /**
         * <p>Indicates whether HSTS preload is enabled. Default value: false. Valid values:</p>
         * <ul>
         * <li><p>true: HSTS preload is enabled.</p>
         * </li>
         * <li><p>false: HSTS preload is disabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("HstsPreload")
        public Boolean hstsPreload;

        /**
         * <p>Indicates whether HTTP/2 is enabled. This parameter is available only when <strong>HttpsPorts</strong> is not empty, which indicates that the domain uses HTTPS. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: HTTP/2 is enabled.</p>
         * </li>
         * <li><p><strong>false</strong> (default): HTTP/2 is disabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Http2Enabled")
        public Boolean http2Enabled;

        /**
         * <p>The HTTP listening ports. The format is [<strong>port1,port2,...</strong>].</p>
         */
        @NameInMap("HttpPorts")
        public java.util.List<Integer> httpPorts;

        /**
         * <p>The HTTPS listening ports. The format is [<strong>port1,port2,...</strong>].</p>
         */
        @NameInMap("HttpsPorts")
        public java.util.List<Integer> httpsPorts;

        /**
         * <p>Indicates whether IPv6 is enabled. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: IPv6 is enabled.</p>
         * </li>
         * <li><p><strong>false</strong> (default): IPv6 is disabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IPv6Enabled")
        public Boolean IPv6Enabled;

        /**
         * <p>The type of the protection resource. Valid values:</p>
         * <ul>
         * <li><p><strong>share</strong> (default): a shared cluster.</p>
         * </li>
         * <li><p><strong>gslb</strong>: a shared cluster with global server load balancing.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>share</p>
         */
        @NameInMap("ProtectionResource")
        public String protectionResource;

        /**
         * <p>Indicates whether access is allowed only from SM clients. This parameter is available only when SM2Enabled is set to true. Valid values:</p>
         * <ul>
         * <li><p>true: Only SM clients can access the website.</p>
         * </li>
         * <li><p>false: Both SM and non-SM clients can access the website.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("SM2AccessOnly")
        public Boolean SM2AccessOnly;

        /**
         * <p>The ID of the SM certificate. This parameter is required only when SM2Enabled is set to true.</p>
         * 
         * <strong>example:</strong>
         * <p>123-cn-hangzhou</p>
         */
        @NameInMap("SM2CertId")
        public String SM2CertId;

        /**
         * <p>Indicates whether SM certificates are enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("SM2Enabled")
        public Boolean SM2Enabled;

        /**
         * <p>The TLS version. This parameter is available only when <strong>HttpsPorts</strong> is not empty, which indicates that the domain uses HTTPS. Valid values:</p>
         * <ul>
         * <li><p><strong>tlsv1</strong></p>
         * </li>
         * <li><p><strong>tlsv1.1</strong></p>
         * </li>
         * <li><p><strong>tlsv1.2</strong></p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>tlsv1</p>
         */
        @NameInMap("TLSVersion")
        public String TLSVersion;

        /**
         * <p>The method that WAF uses to obtain the real IP address of a client. Valid values:</p>
         * <ul>
         * <li><p><strong>0</strong> (default): WAF obtains the client IP address from the TCP connection. This option is suitable if no Layer 7 proxies are deployed in front of WAF.</p>
         * </li>
         * <li><p><strong>1</strong>: WAF obtains the client IP address from the first value of the X-Forwarded-For (XFF) header.</p>
         * </li>
         * <li><p><strong>2</strong>: WAF obtains the client IP address from a custom header field.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("XffHeaderMode")
        public Integer xffHeaderMode;

        /**
         * <p>The custom header fields that are used to obtain the client IP address. The format is [<strong>&quot;header1&quot;,&quot;header2&quot;,...</strong>].</p>
         * <blockquote>
         * <p>This parameter is required only when you set <strong>XffHeaderMode</strong> to 2.</p>
         * </blockquote>
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

        public ModifyDomainRequestListen setHstsIncludeSubDomain(Boolean hstsIncludeSubDomain) {
            this.hstsIncludeSubDomain = hstsIncludeSubDomain;
            return this;
        }
        public Boolean getHstsIncludeSubDomain() {
            return this.hstsIncludeSubDomain;
        }

        public ModifyDomainRequestListen setHstsMaxAge(Long hstsMaxAge) {
            this.hstsMaxAge = hstsMaxAge;
            return this;
        }
        public Long getHstsMaxAge() {
            return this.hstsMaxAge;
        }

        public ModifyDomainRequestListen setHstsPreload(Boolean hstsPreload) {
            this.hstsPreload = hstsPreload;
            return this;
        }
        public Boolean getHstsPreload() {
            return this.hstsPreload;
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

    public static class ModifyDomainRequestRedirectBackendPorts extends TeaModel {
        /**
         * <p>The port of the origin server.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("BackendPort")
        public Integer backendPort;

        /**
         * <p>The WAF listening port.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("ListenPort")
        public Integer listenPort;

        /**
         * <p>The protocol of the listening port. Valid values:</p>
         * <ul>
         * <li><p><strong>http</strong>: HTTP.</p>
         * </li>
         * <li><p><strong>https</strong>: HTTPS.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>http</p>
         */
        @NameInMap("Protocol")
        public String protocol;

        public static ModifyDomainRequestRedirectBackendPorts build(java.util.Map<String, ?> map) throws Exception {
            ModifyDomainRequestRedirectBackendPorts self = new ModifyDomainRequestRedirectBackendPorts();
            return TeaModel.build(map, self);
        }

        public ModifyDomainRequestRedirectBackendPorts setBackendPort(Integer backendPort) {
            this.backendPort = backendPort;
            return this;
        }
        public Integer getBackendPort() {
            return this.backendPort;
        }

        public ModifyDomainRequestRedirectBackendPorts setListenPort(Integer listenPort) {
            this.listenPort = listenPort;
            return this;
        }
        public Integer getListenPort() {
            return this.listenPort;
        }

        public ModifyDomainRequestRedirectBackendPorts setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

    }

    public static class ModifyDomainRequestRedirectRequestHeaders extends TeaModel {
        /**
         * <p>The custom request header field.</p>
         * 
         * <strong>example:</strong>
         * <p>aaa</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the custom header field.</p>
         * 
         * <strong>example:</strong>
         * <p>bbb</p>
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
         * <p>The custom port mappings for back-to-origin.</p>
         */
        @NameInMap("BackendPorts")
        public java.util.List<ModifyDomainRequestRedirectBackendPorts> backendPorts;

        /**
         * <p>The IP addresses or domain names of the origin server. You can specify only one type of address. If you specify a domain name, only IPv4 is supported. IPv6 is not supported.</p>
         * <ul>
         * <li><p>IP addresses: The format is [<strong>&quot;ip1&quot;,&quot;ip2&quot;,...</strong>]. You can specify up to 20 IP addresses.</p>
         * </li>
         * <li><p>Domain names: The format is [<strong>&quot;domain&quot;</strong>]. You can specify up to 20 domain names.</p>
         * </li>
         * </ul>
         */
        @NameInMap("Backends")
        public java.util.List<String> backends;

        /**
         * <p>The IP addresses or domain names of the backup origin server.</p>
         */
        @NameInMap("BackupBackends")
        public java.util.List<String> backupBackends;

        /**
         * <p>Indicates whether public cloud disaster recovery is enabled. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: Public cloud disaster recovery is enabled.</p>
         * </li>
         * <li><p><strong>false</strong> (default): Public cloud disaster recovery is disabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("CnameEnabled")
        public Boolean cnameEnabled;

        /**
         * <p>The connection timeout period. Unit: seconds. Valid values: 1 to 3600. Default value: 5.</p>
         * 
         * <strong>example:</strong>
         * <p>120</p>
         */
        @NameInMap("ConnectTimeout")
        public Integer connectTimeout;

        /**
         * <p>Indicates whether forced HTTP back-to-origin is enabled. This parameter is available only when you specify <strong>HttpsPorts</strong>. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: Forced HTTP back-to-origin is enabled.</p>
         * </li>
         * <li><p><strong>false</strong>: Forced HTTP back-to-origin is disabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("FocusHttpBackend")
        public Boolean focusHttpBackend;

        /**
         * <p>Indicates whether HTTP/2 is enabled for back-to-origin requests. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: HTTP/2 is enabled for back-to-origin requests.</p>
         * </li>
         * <li><p><strong>false</strong>: HTTP/2 is disabled for back-to-origin requests.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Http2Origin")
        public Boolean http2Origin;

        /**
         * <p>The maximum number of concurrent HTTP/2 back-to-origin requests. Valid values: 1 to 512. Default value: 2.</p>
         * 
         * <strong>example:</strong>
         * <p>128</p>
         */
        @NameInMap("Http2OriginMaxConcurrency")
        public Integer http2OriginMaxConcurrency;

        /**
         * <p>Indicates whether persistent connections are enabled. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong> (default): Persistent connections are enabled.</p>
         * </li>
         * <li><p><strong>false</strong>: Persistent connections are disabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Keepalive")
        public Boolean keepalive;

        /**
         * <p>The number of requests that can be reused in a persistent connection. Valid values: 60 to 1000. Default value: 1000.</p>
         * <blockquote>
         * <p>This parameter is available only when you enable persistent connections.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("KeepaliveRequests")
        public Integer keepaliveRequests;

        /**
         * <p>The idle timeout for a persistent connection. Unit: seconds. Valid values: 1 to 60. Default value: 15.</p>
         * <blockquote>
         * <p>This parameter specifies the amount of time that an idle persistent connection can remain open.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>15</p>
         */
        @NameInMap("KeepaliveTimeout")
        public Integer keepaliveTimeout;

        /**
         * <p>The load balancing algorithm for back-to-origin requests. Valid values:</p>
         * <ul>
         * <li><p><strong>iphash</strong>: the IP hash algorithm.</p>
         * </li>
         * <li><p><strong>roundRobin</strong>: the round-robin algorithm.</p>
         * </li>
         * <li><p><strong>leastTime</strong>: the least time algorithm. This value is available only when you set <strong>ProtectionResource</strong> to <strong>gslb</strong>.</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>iphash</p>
         */
        @NameInMap("Loadbalance")
        public String loadbalance;

        /**
         * <p>The maximum size of a request body. Unit: GB. Valid values: 2 to 10. Default value: 2.</p>
         * <blockquote>
         * <p>This parameter is supported only by the WAF Ultimate edition.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("MaxBodySize")
        public Integer maxBodySize;

        /**
         * <p>Indicates whether the Proxy Protocol is enabled to preserve client IP addresses.</p>
         * <ul>
         * <li><p><strong>true</strong>: The Proxy Protocol is enabled. If you select this option, you can view the client IP address on the origin server.</p>
         * </li>
         * <li><p><strong>false</strong>: The Proxy Protocol is disabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("ProxyProtocol")
        public Boolean proxyProtocol;

        /**
         * <p>The read timeout period. Unit: seconds. Valid values: 1 to 3600. Default value: 120.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("ReadTimeout")
        public Integer readTimeout;

        /**
         * <p>The custom header fields and their values for traffic marking.</p>
         * <p>WAF adds these fields and values to the request headers when traffic passes through WAF. This helps backend services identify and collect statistics on WAF-processed traffic.</p>
         */
        @NameInMap("RequestHeaders")
        public java.util.List<ModifyDomainRequestRedirectRequestHeaders> requestHeaders;

        /**
         * <p>Indicates whether forwarding requests to the origin server are retried when the requests fail. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong> (default): Requests are retried.</p>
         * </li>
         * <li><p><strong>false</strong>: Requests are not retried.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Retry")
        public Boolean retry;

        /**
         * <p>The forwarding rules for a hybrid cloud deployment. This parameter is a string that contains a JSON array. Each element in the array is a struct that contains the following fields:</p>
         * <ul>
         * <li><p><strong>rs</strong>: an array of strings. The back-to-origin IP addresses or CNAMEs.</p>
         * </li>
         * <li><p><strong>backupRs</strong>: an array of strings. The backup back-to-origin IP addresses or CNAMEs. This field is required. If you do not want to specify backup addresses, set it to [].</p>
         * </li>
         * <li><p><strong>location</strong>: a string. The name of the protection node.</p>
         * </li>
         * <li><p><strong>locationId</strong>: a long integer. The ID of the protection node.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>[
         *     {
         *         &quot;rs&quot;:
         *         [
         *             &quot;1.1.XX.XX&quot;
         *         ],
         *         &quot;backupRs&quot;:
         *         [
         *             &quot;2.2.XX.XX&quot;
         *         ],
         *         &quot;locationId&quot;: 535,
         *         &quot;location&quot;: &quot;test1111&quot;
         *     }
         * ]</p>
         */
        @NameInMap("RoutingRules")
        public String routingRules;

        /**
         * <p>Indicates whether back-to-origin Server Name Indication (SNI) is enabled. This parameter is available only when you specify <strong>HttpsPorts</strong>. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: Back-to-origin SNI is enabled.</p>
         * </li>
         * <li><p><strong>false</strong> (default): Back-to-origin SNI is disabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("SniEnabled")
        public Boolean sniEnabled;

        /**
         * <p>The value of the custom SNI field. If you do not set this parameter, the value of the <strong>Host</strong> field from the request header is used by default. You typically do not need to set this parameter unless your business requires a custom SNI value for back-to-origin requests.</p>
         * <blockquote>
         * <p>This parameter is available only when you set <strong>SniEnabled</strong> to true.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.aliyundoc.com">www.aliyundoc.com</a></p>
         */
        @NameInMap("SniHost")
        public String sniHost;

        /**
         * <p>Indicates whether WAF is allowed to overwrite the WL-Proxy-Client-IP header. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong> (default): WAF is allowed to overwrite the header.</p>
         * </li>
         * <li><p><strong>false</strong>: WAF is not allowed to overwrite the header.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         * 
         * <strong>if can be null:</strong>
         * <p>true</p>
         */
        @NameInMap("WLProxyClientIp")
        public Boolean WLProxyClientIp;

        /**
         * <p>Indicates whether WAF is allowed to overwrite the Web-Server-Type header. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong> (default): WAF is allowed to overwrite the header.</p>
         * </li>
         * <li><p><strong>false</strong>: WAF is not allowed to overwrite the header.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         * 
         * <strong>if can be null:</strong>
         * <p>true</p>
         */
        @NameInMap("WebServerType")
        public Boolean webServerType;

        /**
         * <p>The write timeout period. Unit: seconds. Valid values: 1 to 3600. Default value: 120.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("WriteTimeout")
        public Integer writeTimeout;

        /**
         * <p>Indicates whether WAF is allowed to overwrite the X-Client-IP header. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong> (default): WAF is allowed to overwrite the header.</p>
         * </li>
         * <li><p><strong>false</strong>: WAF is not allowed to overwrite the header.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         * 
         * <strong>if can be null:</strong>
         * <p>true</p>
         */
        @NameInMap("XClientIp")
        public Boolean XClientIp;

        /**
         * <p>Indicates whether WAF is allowed to overwrite the X-True-IP header. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong> (default): WAF is allowed to overwrite the header.</p>
         * </li>
         * <li><p><strong>false</strong>: WAF is not allowed to overwrite the header.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         * 
         * <strong>if can be null:</strong>
         * <p>true</p>
         */
        @NameInMap("XTrueIp")
        public Boolean XTrueIp;

        /**
         * <p>Indicates whether the X-Forwarded-Proto header is used to pass the protocol used by WAF to the origin server. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong> (default): The WAF protocol is passed.</p>
         * </li>
         * <li><p><strong>false</strong>: The WAF protocol is not passed.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("XffProto")
        public Boolean xffProto;

        public static ModifyDomainRequestRedirect build(java.util.Map<String, ?> map) throws Exception {
            ModifyDomainRequestRedirect self = new ModifyDomainRequestRedirect();
            return TeaModel.build(map, self);
        }

        public ModifyDomainRequestRedirect setBackendPorts(java.util.List<ModifyDomainRequestRedirectBackendPorts> backendPorts) {
            this.backendPorts = backendPorts;
            return this;
        }
        public java.util.List<ModifyDomainRequestRedirectBackendPorts> getBackendPorts() {
            return this.backendPorts;
        }

        public ModifyDomainRequestRedirect setBackends(java.util.List<String> backends) {
            this.backends = backends;
            return this;
        }
        public java.util.List<String> getBackends() {
            return this.backends;
        }

        public ModifyDomainRequestRedirect setBackupBackends(java.util.List<String> backupBackends) {
            this.backupBackends = backupBackends;
            return this;
        }
        public java.util.List<String> getBackupBackends() {
            return this.backupBackends;
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

        public ModifyDomainRequestRedirect setHttp2Origin(Boolean http2Origin) {
            this.http2Origin = http2Origin;
            return this;
        }
        public Boolean getHttp2Origin() {
            return this.http2Origin;
        }

        public ModifyDomainRequestRedirect setHttp2OriginMaxConcurrency(Integer http2OriginMaxConcurrency) {
            this.http2OriginMaxConcurrency = http2OriginMaxConcurrency;
            return this;
        }
        public Integer getHttp2OriginMaxConcurrency() {
            return this.http2OriginMaxConcurrency;
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

        public ModifyDomainRequestRedirect setMaxBodySize(Integer maxBodySize) {
            this.maxBodySize = maxBodySize;
            return this;
        }
        public Integer getMaxBodySize() {
            return this.maxBodySize;
        }

        public ModifyDomainRequestRedirect setProxyProtocol(Boolean proxyProtocol) {
            this.proxyProtocol = proxyProtocol;
            return this;
        }
        public Boolean getProxyProtocol() {
            return this.proxyProtocol;
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

        public ModifyDomainRequestRedirect setWLProxyClientIp(Boolean WLProxyClientIp) {
            this.WLProxyClientIp = WLProxyClientIp;
            return this;
        }
        public Boolean getWLProxyClientIp() {
            return this.WLProxyClientIp;
        }

        public ModifyDomainRequestRedirect setWebServerType(Boolean webServerType) {
            this.webServerType = webServerType;
            return this;
        }
        public Boolean getWebServerType() {
            return this.webServerType;
        }

        public ModifyDomainRequestRedirect setWriteTimeout(Integer writeTimeout) {
            this.writeTimeout = writeTimeout;
            return this;
        }
        public Integer getWriteTimeout() {
            return this.writeTimeout;
        }

        public ModifyDomainRequestRedirect setXClientIp(Boolean XClientIp) {
            this.XClientIp = XClientIp;
            return this;
        }
        public Boolean getXClientIp() {
            return this.XClientIp;
        }

        public ModifyDomainRequestRedirect setXTrueIp(Boolean XTrueIp) {
            this.XTrueIp = XTrueIp;
            return this;
        }
        public Boolean getXTrueIp() {
            return this.XTrueIp;
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
