// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class CreateDomainRequest extends TeaModel {
    /**
     * <p>The access type of the WAF instance. Valid values:</p>
     * <ul>
     * <li><p><strong>share</strong> (default): CNAME access.</p>
     * </li>
     * <li><p><strong>hybrid_cloud_cname</strong>: hybrid cloud CNAME access.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>share</p>
     */
    @NameInMap("AccessType")
    public String accessType;

    /**
     * <p>The domain name to query.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://www.aliyundoc.com">www.aliyundoc.com</a></p>
     */
    @NameInMap("Domain")
    public String domain;

    /**
     * <p>The ID of the WAF instance.</p>
     * <blockquote>
     * <p>You can call <a href="https://help.aliyun.com/document_detail/433756.html">DescribeInstance</a> to query the ID of the current WAF instance.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>waf_cdnsdf3****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The listening configuration.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Listen")
    public CreateDomainRequestListen listen;

    /**
     * <p>The forwarding configuration.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Redirect")
    public CreateDomainRequestRedirect redirect;

    /**
     * <p>The region where the WAF instance is deployed. Valid values:</p>
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

    /**
     * <p>The Alibaba Cloud resource group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfm***q</p>
     */
    @NameInMap("ResourceManagerResourceGroupId")
    public String resourceManagerResourceGroupId;

    /**
     * <p>The tag list, which contains a maximum of 20 items.</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreateDomainRequestTag> tag;

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

    public CreateDomainRequest setTag(java.util.List<CreateDomainRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreateDomainRequestTag> getTag() {
        return this.tag;
    }

    public static class CreateDomainRequestListen extends TeaModel {
        /**
         * <p>The ID of the certificate to add. This parameter is used only when <strong>HttpsPorts</strong> is not empty, which indicates that the domain name uses HTTPS.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         * 
         * <strong>if can be null:</strong>
         * <p>true</p>
         */
        @NameInMap("CertId")
        public String certId;

        /**
         * <p>The type of cipher suite to add. This parameter is used only when <strong>HttpsPorts</strong> is not empty, which indicates that the domain name uses HTTPS. Valid values:</p>
         * <ul>
         * <li><p><strong>1</strong>: all cipher suites.</p>
         * </li>
         * <li><p><strong>2</strong>: strong cipher suites. This value is available only when <strong>TLSVersion</strong> is set to <strong>tlsv1.2</strong>.</p>
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
         * <p>The custom cipher suites to add.</p>
         */
        @NameInMap("CustomCiphers")
        public java.util.List<String> customCiphers;

        /**
         * <p>Specifies whether to support TLS 1.3. This parameter is used only when <strong>HttpsPorts</strong> is not empty, which indicates that the domain name uses HTTPS. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: TLS 1.3 is supported.</p>
         * </li>
         * <li><p><strong>false</strong>: TLS 1.3 is not supported.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         * 
         * <strong>if can be null:</strong>
         * <p>true</p>
         */
        @NameInMap("EnableTLSv3")
        public Boolean enableTLSv3;

        /**
         * <p>Specifies whether to enable an exclusive IP address. This parameter is used only when <strong>IPv6Enabled</strong> is set to <strong>false</strong> (which indicates that IPv6 is not enabled) and <strong>ProtectionResource</strong> is set to <strong>share</strong> (which indicates that a shared cluster is used). Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: An exclusive IP address is enabled.</p>
         * </li>
         * <li><p><strong>false</strong> (default): An exclusive IP address is not enabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("ExclusiveIp")
        public Boolean exclusiveIp;

        /**
         * <p>Specifies whether to enable forced HTTPS redirect. This parameter is used only when HttpsPorts is not empty (which indicates that the domain name uses HTTPS) and HttpPorts is empty (which indicates that the domain name does not use HTTP). Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: Forced HTTPS redirect is enabled.</p>
         * </li>
         * <li><p><strong>false</strong>: Forced HTTPS redirect is not enabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("FocusHttps")
        public Boolean focusHttps;

        /**
         * <p>Specifies whether HSTS includes subdomains. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: Enabled.</p>
         * </li>
         * <li><p><strong>false</strong>: Not enabled.</p>
         * </li>
         * </ul>
         */
        @NameInMap("HstsIncludeSubDomain")
        public Boolean hstsIncludeSubDomain;

        /**
         * <p>The HSTS expiration time. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>365000</p>
         */
        @NameInMap("HstsMaxAge")
        public Long hstsMaxAge;

        /**
         * <p>Specifies whether to enable HSTS preloading. This feature is disabled by default. Valid values:</p>
         * <ul>
         * <li>true: Enabled.</li>
         * <li>false: Disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("HstsPreload")
        public Boolean hstsPreload;

        /**
         * <p>Specifies whether to enable HTTP/2. This parameter is used only when <strong>HttpsPorts</strong> is not empty, which indicates that the domain name uses HTTPS. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: HTTP/2 is enabled.</p>
         * </li>
         * <li><p><strong>false</strong> (default): HTTP/2 is not enabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Http2Enabled")
        public Boolean http2Enabled;

        /**
         * <p>The listening ports for HTTP.</p>
         */
        @NameInMap("HttpPorts")
        public java.util.List<Integer> httpPorts;

        /**
         * <p>The listening ports for HTTPS.</p>
         */
        @NameInMap("HttpsPorts")
        public java.util.List<Integer> httpsPorts;

        /**
         * <p>Specifies whether to enable IPv6. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: IPv6 is enabled.</p>
         * </li>
         * <li><p><strong>false</strong> (default): IPv6 is not enabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IPv6Enabled")
        public Boolean IPv6Enabled;

        /**
         * <p>The type of protection resource to use. Valid values:</p>
         * <ul>
         * <li><p><strong>share</strong> (default): shared cluster.</p>
         * </li>
         * <li><p><strong>gslb</strong>: shared cluster-based intelligent load balancing.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>share</p>
         */
        @NameInMap("ProtectionResource")
        public String protectionResource;

        /**
         * <p>Specifies whether only China Encryption (SM) clients can access the domain name. This parameter is used only when SM2Enabled is set to true.</p>
         * <ul>
         * <li><p>true: Only China Encryption (SM) clients can access the domain name.</p>
         * </li>
         * <li><p>false: Both China Encryption (SM) and non-China Encryption (SM) clients can access the domain name.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         * 
         * <strong>if can be null:</strong>
         * <p>true</p>
         */
        @NameInMap("SM2AccessOnly")
        public Boolean SM2AccessOnly;

        /**
         * <p>The ID of the China Encryption (SM) certificate to add. This parameter is used only when SM2Enabled is set to true.</p>
         * 
         * <strong>example:</strong>
         * <p>123-cn-hangzhou</p>
         * 
         * <strong>if can be null:</strong>
         * <p>true</p>
         */
        @NameInMap("SM2CertId")
        public String SM2CertId;

        /**
         * <p>Specifies whether to enable the China Encryption (SM) certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         * 
         * <strong>if can be null:</strong>
         * <p>true</p>
         */
        @NameInMap("SM2Enabled")
        public Boolean SM2Enabled;

        /**
         * <p>The TLS version to add. This parameter is used only when <strong>HttpsPorts</strong> is not empty, which indicates that the domain name uses HTTPS. Valid values:</p>
         * <ul>
         * <li><strong>tlsv1</strong></li>
         * <li><strong>tlsv1.1</strong></li>
         * <li><strong>tlsv1.2</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>tlsv1</p>
         */
        @NameInMap("TLSVersion")
        public String TLSVersion;

        /**
         * <p>The method that WAF uses to obtain the originating IP address of the client. Valid values:</p>
         * <ul>
         * <li><p><strong>0</strong> (default): The client traffic has not been forwarded by any Layer 7 proxy before reaching WAF.</p>
         * </li>
         * <li><p><strong>1</strong>: WAF reads the first value in the X-Forwarded-For (XFF) header as the client IP address.</p>
         * </li>
         * <li><p><strong>2</strong>: WAF reads the value of a custom header field that you specify as the client IP address.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("XffHeaderMode")
        public Integer xffHeaderMode;

        /**
         * <p>The list of custom header fields used to obtain the client IP address.</p>
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

        public CreateDomainRequestListen setHstsIncludeSubDomain(Boolean hstsIncludeSubDomain) {
            this.hstsIncludeSubDomain = hstsIncludeSubDomain;
            return this;
        }
        public Boolean getHstsIncludeSubDomain() {
            return this.hstsIncludeSubDomain;
        }

        public CreateDomainRequestListen setHstsMaxAge(Long hstsMaxAge) {
            this.hstsMaxAge = hstsMaxAge;
            return this;
        }
        public Long getHstsMaxAge() {
            return this.hstsMaxAge;
        }

        public CreateDomainRequestListen setHstsPreload(Boolean hstsPreload) {
            this.hstsPreload = hstsPreload;
            return this;
        }
        public Boolean getHstsPreload() {
            return this.hstsPreload;
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

    public static class CreateDomainRequestRedirectBackendPorts extends TeaModel {
        /**
         * <p>The back-to-origin port.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("BackendPort")
        public Integer backendPort;

        /**
         * <p>The listening port.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("ListenPort")
        public Integer listenPort;

        /**
         * <p>The protocol of the listening port. Valid values:</p>
         * <ul>
         * <li><p><strong>http</strong>: The protocol of the listening port is HTTP.</p>
         * </li>
         * <li><p><strong>https</strong>: The protocol of the listening port is HTTPS.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>http</p>
         */
        @NameInMap("Protocol")
        public String protocol;

        public static CreateDomainRequestRedirectBackendPorts build(java.util.Map<String, ?> map) throws Exception {
            CreateDomainRequestRedirectBackendPorts self = new CreateDomainRequestRedirectBackendPorts();
            return TeaModel.build(map, self);
        }

        public CreateDomainRequestRedirectBackendPorts setBackendPort(Integer backendPort) {
            this.backendPort = backendPort;
            return this;
        }
        public Integer getBackendPort() {
            return this.backendPort;
        }

        public CreateDomainRequestRedirectBackendPorts setListenPort(Integer listenPort) {
            this.listenPort = listenPort;
            return this;
        }
        public Integer getListenPort() {
            return this.listenPort;
        }

        public CreateDomainRequestRedirectBackendPorts setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

    }

    public static class CreateDomainRequestRedirectRequestHeaders extends TeaModel {
        /**
         * <p>The specified custom request header field.</p>
         * 
         * <strong>example:</strong>
         * <p>aaa</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value set for the custom request header field.</p>
         * 
         * <strong>example:</strong>
         * <p>bbb</p>
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
         * <p>The custom port configuration.</p>
         */
        @NameInMap("BackendPorts")
        public java.util.List<CreateDomainRequestRedirectBackendPorts> backendPorts;

        /**
         * <p>The IP addresses or back-to-origin domain names of the origin server corresponding to the domain name.</p>
         */
        @NameInMap("Backends")
        public java.util.List<String> backends;

        /**
         * <p>The backup origin server IP addresses or back-to-origin domain names corresponding to the domain name.</p>
         */
        @NameInMap("BackupBackends")
        public java.util.List<String> backupBackends;

        /**
         * <p>Specifies whether to enable public cloud disaster recovery. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: Public cloud disaster recovery is enabled.</p>
         * </li>
         * <li><p><strong>false</strong> (default): Public cloud disaster recovery is not enabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("CnameEnabled")
        public Boolean cnameEnabled;

        /**
         * <p>The connection timeout period. Unit: seconds.
         * Valid values: 1 to 3600.
         * Default value: 5.</p>
         * 
         * <strong>example:</strong>
         * <p>120</p>
         */
        @NameInMap("ConnectTimeout")
        public Integer connectTimeout;

        /**
         * <p>Specifies whether to enable forced HTTP back-to-origin. This parameter is used only when <strong>HttpsPorts</strong> is not empty, which indicates that the domain name uses HTTPS. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: Forced HTTP back-to-origin is enabled.</p>
         * </li>
         * <li><p><strong>false</strong>: Forced HTTP back-to-origin is not enabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("FocusHttpBackend")
        public Boolean focusHttpBackend;

        /**
         * <p>Specifies whether to enable HTTP/2 back-to-origin. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: HTTP/2 back-to-origin is enabled.</p>
         * </li>
         * <li><p><strong>false</strong>: HTTP/2 back-to-origin is not enabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Http2Origin")
        public Boolean http2Origin;

        /**
         * <p>The maximum number of concurrent connections for HTTP/2 back-to-origin. Valid values: 1 to 512. Default value: 128.</p>
         * 
         * <strong>example:</strong>
         * <p>128</p>
         */
        @NameInMap("Http2OriginMaxConcurrency")
        public Integer http2OriginMaxConcurrency;

        /**
         * <p>Specifies whether to enable persistent connections. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong> (default): Persistent connections are enabled.</p>
         * </li>
         * <li><p><strong>false</strong>: Persistent connections are not enabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Keepalive")
        public Boolean keepalive;

        /**
         * <p>The number of requests that reuse persistent connections. Valid values: 60 to 1000. Default value: 1000.</p>
         * <blockquote>
         * <p>The number of persistent connections to reuse after persistent connections are enabled.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("KeepaliveRequests")
        public Integer keepaliveRequests;

        /**
         * <p>The idle timeout period for persistent connections. Valid values: 1 to 60. Default value: 15. Unit: seconds.</p>
         * <blockquote>
         * <p>The idle time after which a reused persistent connection is released.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>15</p>
         */
        @NameInMap("KeepaliveTimeout")
        public Integer keepaliveTimeout;

        /**
         * <p>The load balancing algorithm used for back-to-origin. Valid values:</p>
         * <ul>
         * <li><p><strong>iphash</strong>: IP hash algorithm.</p>
         * </li>
         * <li><p><strong>roundRobin</strong>: round-robin algorithm.</p>
         * </li>
         * <li><p><strong>leastTime</strong>: Least Time algorithm. This value is available only when <strong>ProtectionResource</strong> is set to <strong>gslb</strong>, which indicates that the shared cluster-based intelligent load balancing is used.</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>roundRobin</p>
         */
        @NameInMap("Loadbalance")
        public String loadbalance;

        /**
         * <p>The maximum request body size. Valid values: 2 to 10. Default value: 2. Unit: GB.</p>
         * <blockquote>
         * <p>Only the Ultimate Edition supports this feature.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("MaxBodySize")
        public Integer maxBodySize;

        /**
         * <p>Specifies whether the client source IP preservation feature is enabled.</p>
         * <ul>
         * <li><strong>true</strong>: The client source IP preservation feature is enabled. After this feature is enabled, the backend service can view the originating IP address of the client.</li>
         * <li><strong>false</strong>: The client source IP preservation feature is not enabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("ProxyProtocol")
        public Boolean proxyProtocol;

        /**
         * <p>The read timeout period. Unit: seconds.
         * Valid values: 1 to 3600.
         * Default value: 120.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("ReadTimeout")
        public Integer readTimeout;

        /**
         * <p>The traffic mark field and value of the domain name, used to mark traffic processed by WAF.</p>
         * <p>By specifying custom request header fields and corresponding values, when the access traffic of the domain name passes through WAF, WAF automatically adds the specified custom field values to the request header as traffic marks, which helps the backend service collect relevant information.</p>
         */
        @NameInMap("RequestHeaders")
        public java.util.List<CreateDomainRequestRedirectRequestHeaders> requestHeaders;

        /**
         * <p>Specifies whether to retry when WAF fails to forward requests to the origin server. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong> (default): Retry is enabled.</p>
         * </li>
         * <li><p><strong>false</strong>: Retry is not enabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Retry")
        public Boolean retry;

        /**
         * <p>The hybrid cloud forwarding rules. The value is a string converted from a JSON array. Each element in the JSON array is a structure that contains the following fields:</p>
         * <ul>
         * <li><p><strong>rs</strong>: Array type | The list of back-to-origin IP addresses or back-to-origin CNAMEs.</p>
         * </li>
         * <li><p><strong>backupRs</strong>: Array type | The list of backup back-to-origin IP addresses or back-to-origin CNAMEs. This field is required. Use [] to indicate that no backup is set.</p>
         * </li>
         * <li><p><strong>location</strong>: String type | The name of the protection node.</p>
         * </li>
         * <li><p><strong>locationId</strong>: Long type | The ID of the protection node.</p>
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
         * <p>Specifies whether to enable back-to-origin SNI. This parameter is used only when <strong>HttpsPorts</strong> is not empty, which indicates that the domain name uses HTTPS. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: Back-to-origin SNI is enabled.</p>
         * </li>
         * <li><p><strong>false</strong> (default): Back-to-origin SNI is not enabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("SniEnabled")
        public Boolean sniEnabled;

        /**
         * <p>The value of the custom SNI extension field. If this parameter is not set, the value of the <strong>Host</strong> field in the request header is used as the SNI extension field value by default.
         * In most cases, you do not need to customize the SNI unless your service has special configuration requirements and you want WAF to use an SNI that is different from the actual request Host in back-to-origin requests (the custom SNI set here).</p>
         * <blockquote>
         * <p>This parameter is required only when <strong>SniEnabled</strong> is set to <strong>true</strong>, which indicates that back-to-origin SNI is enabled.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.aliyundoc.com">www.aliyundoc.com</a></p>
         */
        @NameInMap("SniHost")
        public String sniHost;

        /**
         * <p>Specifies whether to allow WAF to overwrite WL-Proxy-Client-IP. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong> (default): WAF is allowed to overwrite.</p>
         * </li>
         * <li><p><strong>false</strong>: WAF is not allowed to overwrite.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("WLProxyClientIp")
        public Boolean WLProxyClientIp;

        /**
         * <p>Specifies whether to allow WAF to overwrite Web-Server-Type. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong> (default): WAF is allowed to overwrite.</p>
         * </li>
         * <li><p><strong>false</strong>: WAF is not allowed to overwrite.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("WebServerType")
        public Boolean webServerType;

        /**
         * <p>The write timeout period. Unit: seconds.
         * Valid values: 1 to 3600.
         * Default value: 120.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("WriteTimeout")
        public Integer writeTimeout;

        /**
         * <p>Specifies whether to allow WAF to overwrite X-Client-IP. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong> (default): WAF is allowed to overwrite.</p>
         * </li>
         * <li><p><strong>false</strong>: WAF is not allowed to overwrite.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("XClientIp")
        public Boolean XClientIp;

        /**
         * <p>Specifies whether to allow WAF to overwrite X-True-IP. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong> (default): WAF is allowed to overwrite.</p>
         * </li>
         * <li><p><strong>false</strong>: WAF is not allowed to overwrite.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("XTrueIp")
        public Boolean XTrueIp;

        /**
         * <p>Specifies whether to use X-Forward-For-Proto to pass the protocol used by WAF. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong> (default): The protocol used by WAF is passed.</p>
         * </li>
         * <li><p><strong>false</strong>: The protocol used by WAF is not passed.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("XffProto")
        public Boolean xffProto;

        public static CreateDomainRequestRedirect build(java.util.Map<String, ?> map) throws Exception {
            CreateDomainRequestRedirect self = new CreateDomainRequestRedirect();
            return TeaModel.build(map, self);
        }

        public CreateDomainRequestRedirect setBackendPorts(java.util.List<CreateDomainRequestRedirectBackendPorts> backendPorts) {
            this.backendPorts = backendPorts;
            return this;
        }
        public java.util.List<CreateDomainRequestRedirectBackendPorts> getBackendPorts() {
            return this.backendPorts;
        }

        public CreateDomainRequestRedirect setBackends(java.util.List<String> backends) {
            this.backends = backends;
            return this;
        }
        public java.util.List<String> getBackends() {
            return this.backends;
        }

        public CreateDomainRequestRedirect setBackupBackends(java.util.List<String> backupBackends) {
            this.backupBackends = backupBackends;
            return this;
        }
        public java.util.List<String> getBackupBackends() {
            return this.backupBackends;
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

        public CreateDomainRequestRedirect setHttp2Origin(Boolean http2Origin) {
            this.http2Origin = http2Origin;
            return this;
        }
        public Boolean getHttp2Origin() {
            return this.http2Origin;
        }

        public CreateDomainRequestRedirect setHttp2OriginMaxConcurrency(Integer http2OriginMaxConcurrency) {
            this.http2OriginMaxConcurrency = http2OriginMaxConcurrency;
            return this;
        }
        public Integer getHttp2OriginMaxConcurrency() {
            return this.http2OriginMaxConcurrency;
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

        public CreateDomainRequestRedirect setMaxBodySize(Integer maxBodySize) {
            this.maxBodySize = maxBodySize;
            return this;
        }
        public Integer getMaxBodySize() {
            return this.maxBodySize;
        }

        public CreateDomainRequestRedirect setProxyProtocol(Boolean proxyProtocol) {
            this.proxyProtocol = proxyProtocol;
            return this;
        }
        public Boolean getProxyProtocol() {
            return this.proxyProtocol;
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

        public CreateDomainRequestRedirect setWLProxyClientIp(Boolean WLProxyClientIp) {
            this.WLProxyClientIp = WLProxyClientIp;
            return this;
        }
        public Boolean getWLProxyClientIp() {
            return this.WLProxyClientIp;
        }

        public CreateDomainRequestRedirect setWebServerType(Boolean webServerType) {
            this.webServerType = webServerType;
            return this;
        }
        public Boolean getWebServerType() {
            return this.webServerType;
        }

        public CreateDomainRequestRedirect setWriteTimeout(Integer writeTimeout) {
            this.writeTimeout = writeTimeout;
            return this;
        }
        public Integer getWriteTimeout() {
            return this.writeTimeout;
        }

        public CreateDomainRequestRedirect setXClientIp(Boolean XClientIp) {
            this.XClientIp = XClientIp;
            return this;
        }
        public Boolean getXClientIp() {
            return this.XClientIp;
        }

        public CreateDomainRequestRedirect setXTrueIp(Boolean XTrueIp) {
            this.XTrueIp = XTrueIp;
            return this;
        }
        public Boolean getXTrueIp() {
            return this.XTrueIp;
        }

        public CreateDomainRequestRedirect setXffProto(Boolean xffProto) {
            this.xffProto = xffProto;
            return this;
        }
        public Boolean getXffProto() {
            return this.xffProto;
        }

    }

    public static class CreateDomainRequestTag extends TeaModel {
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>Tagkey1</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>TagValue1</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateDomainRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreateDomainRequestTag self = new CreateDomainRequestTag();
            return TeaModel.build(map, self);
        }

        public CreateDomainRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateDomainRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
