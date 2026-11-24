// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class ModifyDomainRequest extends TeaModel {
    /**
     * <p>The access mode of the WAF instance. Valid values:</p>
     * <ul>
     * <li><p><strong>share</strong>: CNAME access. This is the default value.</p>
     * </li>
     * <li><p><strong>hybrid_cloud_cname</strong>: Hybrid Cloud CNAME access.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>share</p>
     */
    @NameInMap("AccessType")
    public String accessType;

    /**
     * <p>The domain name.</p>
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
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/433756.html">DescribeInstance</a> operation to query the ID of the WAF instance.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>waf_cdnsdf3****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The listener configurations.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Listen")
    public ModifyDomainRequestListen listen;

    /**
     * <p>The forwarding configurations.</p>
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
         * <p>The ID of the certificate to be added.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("CertId")
        public String certId;

        /**
         * <p>The type of cipher suite to be added. This parameter takes effect only when <strong>HttpsPorts</strong> is not empty, which indicates that the domain name uses HTTPS. Valid values:</p>
         * <ul>
         * <li><p><strong>1</strong>: adds all cipher suites.</p>
         * </li>
         * <li><p><strong>2</strong>: adds strong cipher suites. You can select this value only when <strong>TLSVersion</strong> is set to <strong>tlsv1.2</strong>.</p>
         * </li>
         * <li><p><strong>99</strong>: adds custom cipher suites. You can select this value only when <strong>TLSVersion</strong> is not set to <strong>tlsv1.3</strong>.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("CipherSuite")
        public Integer cipherSuite;

        /**
         * <p>The custom cipher suites to be added. This parameter takes effect only when <strong>CipherSuite</strong> is set to <strong>99</strong>.</p>
         */
        @NameInMap("CustomCiphers")
        public java.util.List<String> customCiphers;

        /**
         * <p>Specifies whether to support TLS 1.3. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: supports TLS 1.3.</p>
         * </li>
         * <li><p><strong>false</strong>: does not support TLS 1.3.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>This parameter takes effect only when HttpsPorts is not empty, which indicates that the domain name uses HTTPS. If TLSVersion is set to tlsv1.3, this parameter must be set to true.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EnableTLSv3")
        public Boolean enableTLSv3;

        /**
         * <p>Specifies whether to enable an exclusive IP address. This parameter takes effect only when <strong>IPv6Enabled</strong> is set to false, which indicates that IPv6 is disabled, and <strong>ProtectionResource</strong> is set to <strong>share</strong>, which indicates that a shared cluster is used. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: enables an exclusive IP address.</p>
         * </li>
         * <li><p><strong>false</strong>: disables an exclusive IP address. This is the default value.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("ExclusiveIp")
        public Boolean exclusiveIp;

        /**
         * <p>Specifies whether to enable force redirect to HTTPS. This parameter takes effect only when <strong>HttpsPorts</strong> is not empty, which indicates that the domain name uses HTTPS, and <strong>HttpPorts</strong> is empty, which indicates that the domain name does not use HTTP. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: enables force redirect to HTTPS.</p>
         * </li>
         * <li><p><strong>false</strong>: disables force redirect to HTTPS.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("FocusHttps")
        public Boolean focusHttps;

        /**
         * <p>Specifies whether HTTP Strict Transport Security (HSTS) includes subdomains. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: includes subdomains.</p>
         * </li>
         * <li><p><strong>false</strong>: does not include subdomains.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("HstsIncludeSubDomain")
        public Boolean hstsIncludeSubDomain;

        /**
         * <p>The expiration time of HSTS. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>365000</p>
         */
        @NameInMap("HstsMaxAge")
        public Long hstsMaxAge;

        /**
         * <p>Specifies whether to enable HSTS preload. By default, this feature is disabled. Valid values:</p>
         * <ul>
         * <li>true: enables HSTS preload.</li>
         * <li>false: disables HSTS preload.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("HstsPreload")
        public Boolean hstsPreload;

        /**
         * <p>Specifies whether to enable HTTP/2. This parameter takes effect only when <strong>HttpsPorts</strong> is not empty, which indicates that the domain name uses HTTPS. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: enables HTTP/2.</p>
         * </li>
         * <li><p><strong>false</strong>: disables HTTP/2. This is the default value.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Http2Enabled")
        public Boolean http2Enabled;

        /**
         * <p>The listening ports for HTTP. Specify the ports in the [<strong>port1,port2,...</strong>] format.</p>
         */
        @NameInMap("HttpPorts")
        public java.util.List<Integer> httpPorts;

        /**
         * <p>The listening ports for HTTPS. Specify the ports in the [<strong>port1,port2,...</strong>] format.</p>
         */
        @NameInMap("HttpsPorts")
        public java.util.List<Integer> httpsPorts;

        /**
         * <p>Specifies whether to enable IPv6. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: enables IPv6.</p>
         * </li>
         * <li><p><strong>false</strong>: disables IPv6. This is the default value.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IPv6Enabled")
        public Boolean IPv6Enabled;

        /**
         * <p>The type of protection resource to be used. Valid values:</p>
         * <ul>
         * <li><p><strong>share</strong>: uses a shared cluster. This is the default value.</p>
         * </li>
         * <li><p><strong>gslb</strong>: uses intelligent load balancing of a shared cluster.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>share</p>
         */
        @NameInMap("ProtectionResource")
        public String protectionResource;

        /**
         * <p>Specifies whether to allow access only from clients that support SM2. This parameter takes effect only when SM2Enabled is set to true. Valid values:</p>
         * <ul>
         * <li><p>true: allows access only from clients that support SM2.</p>
         * </li>
         * <li><p>false: allows access from clients that support SM2 and clients that do not support SM2.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("SM2AccessOnly")
        public Boolean SM2AccessOnly;

        /**
         * <p>The ID of the SM2 certificate to be added. This parameter takes effect only when SM2Enabled is set to true.</p>
         * 
         * <strong>example:</strong>
         * <p>123-cn-hangzhou</p>
         */
        @NameInMap("SM2CertId")
        public String SM2CertId;

        /**
         * <p>Specifies whether to enable the SM2 certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("SM2Enabled")
        public Boolean SM2Enabled;

        /**
         * <p>The TLS version. This parameter takes effect only when <strong>HttpsPorts</strong> is not empty, which indicates that the domain name uses HTTPS. Valid values:</p>
         * <ul>
         * <li><strong>tlsv1</strong>: supports TLS 1.0 and later. This version provides the highest compatibility but lower security.</li>
         * <li><strong>tlsv1.1</strong>: supports TLS 1.1 and later. This version provides good compatibility and security.</li>
         * <li><strong>tlsv1.2</strong>: supports TLS 1.2 and later. This version provides good compatibility and the highest security.</li>
         * <li><strong>tlsv1.3</strong>: supports only TLS 1.3. This version provides the highest security but lower compatibility.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>tlsv1</p>
         */
        @NameInMap("TLSVersion")
        public String TLSVersion;

        /**
         * <p>The method for WAF to obtain the actual IP address of the client.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("XffHeaderMode")
        public Integer xffHeaderMode;

        /**
         * <p>The list of custom fields used to obtain the client IP address. Specify the fields in the [<strong>&quot;header1&quot;,&quot;header2&quot;,...</strong>] format.</p>
         * <blockquote>
         * <p>You must specify this parameter only when <strong>XffHeaderMode</strong> is set to 2, which indicates that WAF reads the value of a custom field that you specify in the request header as the client IP address.</p>
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

    public static class ModifyDomainRequestRedirectBackendConfig extends TeaModel {
        /**
         * <p>The origin server.</p>
         * 
         * <strong>example:</strong>
         * <p>1.1.XX.XX</p>
         */
        @NameInMap("Backend")
        public String backend;

        /**
         * <p>The weight.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Weight")
        public Integer weight;

        public static ModifyDomainRequestRedirectBackendConfig build(java.util.Map<String, ?> map) throws Exception {
            ModifyDomainRequestRedirectBackendConfig self = new ModifyDomainRequestRedirectBackendConfig();
            return TeaModel.build(map, self);
        }

        public ModifyDomainRequestRedirectBackendConfig setBackend(String backend) {
            this.backend = backend;
            return this;
        }
        public String getBackend() {
            return this.backend;
        }

        public ModifyDomainRequestRedirectBackendConfig setWeight(Integer weight) {
            this.weight = weight;
            return this;
        }
        public Integer getWeight() {
            return this.weight;
        }

    }

    public static class ModifyDomainRequestRedirectBackendPorts extends TeaModel {
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
         * <p>The value of the custom request header field.</p>
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
         * <p>The custom back-to-origin configurations.</p>
         */
        @NameInMap("BackendConfig")
        public java.util.List<ModifyDomainRequestRedirectBackendConfig> backendConfig;

        /**
         * <p>The custom port configurations.</p>
         */
        @NameInMap("BackendPorts")
        public java.util.List<ModifyDomainRequestRedirectBackendPorts> backendPorts;

        /**
         * <p>The IP addresses of the origin servers or the domain names to which requests are forwarded for the domain name. You can specify either IP addresses or domain names. If you specify domain names, only IPv4 addresses are supported. IPv6 addresses are not supported.</p>
         * <ul>
         * <li><p>To specify IP addresses of origin servers, use the [<strong>&quot;ip1&quot;,&quot;ip2&quot;,...</strong>] format. You can add up to 20 IP addresses.</p>
         * </li>
         * <li><p>To specify domain names, use the [<strong>&quot;domain&quot;</strong>] format. You can add up to 20 domain names.</p>
         * </li>
         * </ul>
         */
        @NameInMap("Backends")
        public java.util.List<String> backends;

        /**
         * <p>The IP addresses of the secondary origin servers or the secondary domain names to which requests are forwarded for the domain name.</p>
         */
        @NameInMap("BackupBackends")
        public java.util.List<String> backupBackends;

        /**
         * <p>Specifies whether to enable disaster recovery on Alibaba Cloud. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: enables disaster recovery on Alibaba Cloud.</p>
         * </li>
         * <li><p><strong>false</strong>: disables disaster recovery on Alibaba Cloud. This is the default value.</p>
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
         * <p>Specifies whether to enable force redirect to HTTP for back-to-origin requests. This parameter takes effect only when <strong>HttpsPorts</strong> is not empty, which indicates that the domain name uses HTTPS. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: enables force redirect to HTTP for back-to-origin requests.</p>
         * </li>
         * <li><p><strong>false</strong>: disables force redirect to HTTP for back-to-origin requests.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("FocusHttpBackend")
        public Boolean focusHttpBackend;

        /**
         * <p>Specifies whether to enable HTTP/2 for back-to-origin requests. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: enables HTTP/2 for back-to-origin requests.</p>
         * </li>
         * <li><p><strong>false</strong>: disables HTTP/2 for back-to-origin requests.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Http2Origin")
        public Boolean http2Origin;

        /**
         * <p>The maximum number of concurrent HTTP/2 back-to-origin connections. Valid values: 1 to 512. Default value: 2.</p>
         * 
         * <strong>example:</strong>
         * <p>128</p>
         */
        @NameInMap("Http2OriginMaxConcurrency")
        public Integer http2OriginMaxConcurrency;

        /**
         * <p>Specifies whether to maintain persistent connections. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: maintains persistent connections. This is the default value.</p>
         * </li>
         * <li><p><strong>false</strong>: does not maintain persistent connections.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Keepalive")
        public Boolean keepalive;

        /**
         * <p>The number of requests that can be reused over a persistent connection. Valid values: 60 to 1000. Default value: 1000.</p>
         * <blockquote>
         * <p>This parameter specifies the number of requests that can be multiplexed over a persistent connection after persistent connections are enabled.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("KeepaliveRequests")
        public Integer keepaliveRequests;

        /**
         * <p>The timeout period for an idle persistent connection. Valid values: 1 to 60. Default value: 15. Unit: seconds.</p>
         * <blockquote>
         * <p>This parameter specifies the duration after which an idle persistent connection is released.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>15</p>
         */
        @NameInMap("KeepaliveTimeout")
        public Integer keepaliveTimeout;

        /**
         * <p>The load balancing algorithm used for back-to-origin requests. Valid values:</p>
         * <ul>
         * <li><p><strong>iphash</strong>: the IP hash algorithm.</p>
         * </li>
         * <li><p><strong>roundRobin</strong>: the round-robin algorithm.</p>
         * </li>
         * <li><p><strong>leastTime</strong>: the least time algorithm. You can select this value only when <strong>ProtectionResource</strong> is set to <strong>gslb</strong>, which indicates that intelligent load balancing of a shared cluster is used.</p>
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
         * <p>The maximum size of the request body. Valid values: 2 to 10. Default value: 2. Unit: GB.</p>
         * <blockquote>
         * <p>This parameter is supported only by WAF Ultimate Edition.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("MaxBodySize")
        public Integer maxBodySize;

        /**
         * <p>Specifies whether to enable the feature of preserving the originating IP address of the client. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: enables the feature. After this feature is enabled, backend services can view the originating IP address of the client.</p>
         * </li>
         * <li><p><strong>false</strong>: disables the feature.</p>
         * </li>
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
         * <p>The traffic marking fields and values for the domain name, which are used to mark the traffic processed by WAF.</p>
         * <p>By specifying custom request header fields and their values, WAF automatically adds the specified custom field values to the request headers as traffic marks when the access traffic of the domain name passes through WAF. This facilitates the collection of related information by backend services.</p>
         */
        @NameInMap("RequestHeaders")
        public java.util.List<ModifyDomainRequestRedirectRequestHeaders> requestHeaders;

        /**
         * <p>Specifies whether to retry when WAF fails to forward requests to the origin server. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: retries. This is the default value.</p>
         * </li>
         * <li><p><strong>false</strong>: does not retry.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Retry")
        public Boolean retry;

        /**
         * <p>The forwarding rules for Hybrid Cloud WAF. The value is a string transformed from a JSON array. Each element in the JSON array is a struct that contains the following fields:</p>
         * <ul>
         * <li><p><strong>rs</strong>: Array | The list of back-to-origin IP addresses or CNAME records.</p>
         * </li>
         * <li><p><strong>backupRs</strong>: Array | The list of secondary back-to-origin IP addresses or CNAME records. This field is required. An empty array [] indicates that no secondary back-to-origin addresses are configured.</p>
         * </li>
         * <li><p><strong>location</strong>: String | The name of the protection node.</p>
         * </li>
         * <li><p><strong>locationId</strong>: Long | The ID of the protection node.</p>
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
         * <p>Specifies whether to enable Server Name Indication (SNI) for back-to-origin requests. This parameter takes effect only when <strong>HttpsPorts</strong> is not empty, which indicates that the domain name uses HTTPS. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: enables SNI for back-to-origin requests.</p>
         * </li>
         * <li><p><strong>false</strong>: disables SNI for back-to-origin requests. This is the default value.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("SniEnabled")
        public Boolean sniEnabled;

        /**
         * <p>The value of the custom SNI extension field. If you do not specify this parameter, the value of the <strong>Host</strong> field in the request header is used as the value of the SNI extension field by default.
         * In most cases, you do not need to customize the SNI. You can customize the SNI only when your service has special configuration requirements and you want WAF to use an SNI that is different from the actual request Host in back-to-origin requests.</p>
         * <blockquote>
         * <p>You must specify this parameter only when <strong>SniEnabled</strong> is set to true, which indicates that a custom SNI is used for back-to-origin requests.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.aliyundoc.com">www.aliyundoc.com</a></p>
         */
        @NameInMap("SniHost")
        public String sniHost;

        /**
         * <p>Specifies whether to allow WAF to overwrite the WL-Proxy-Client-IP header. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: allows WAF to overwrite the header. This is the default value.</p>
         * </li>
         * <li><p><strong>false</strong>: does not allow WAF to overwrite the header.</p>
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
         * <p>Specifies whether to allow WAF to overwrite the Web-Server-Type header. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: allows WAF to overwrite the header. This is the default value.</p>
         * </li>
         * <li><p><strong>false</strong>: does not allow WAF to overwrite the header.</p>
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
         * <p>Specifies whether to allow WAF to overwrite the X-Client-IP header. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: allows WAF to overwrite the header. This is the default value.</p>
         * </li>
         * <li><p><strong>false</strong>: does not allow WAF to overwrite the header.</p>
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
         * <p>Specifies whether to allow WAF to overwrite the X-True-IP header. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: allows WAF to overwrite the header. This is the default value.</p>
         * </li>
         * <li><p><strong>false</strong>: does not allow WAF to overwrite the header.</p>
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
         * <p>Specifies whether to pass the protocol used by WAF in the X-Forwarded-Proto header. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: passes the protocol used by WAF. This is the default value.</p>
         * </li>
         * <li><p><strong>false</strong>: does not pass the protocol used by WAF.</p>
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

        public ModifyDomainRequestRedirect setBackendConfig(java.util.List<ModifyDomainRequestRedirectBackendConfig> backendConfig) {
            this.backendConfig = backendConfig;
            return this;
        }
        public java.util.List<ModifyDomainRequestRedirectBackendConfig> getBackendConfig() {
            return this.backendConfig;
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
