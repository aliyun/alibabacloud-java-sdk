// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeDomainDetailResponseBody extends TeaModel {
    /**
     * <p>The details of the SSL certificate.</p>
     */
    @NameInMap("CertDetail")
    public DescribeDomainDetailResponseBodyCertDetail certDetail;

    /**
     * <p>The CNAME that is assigned by WAF to the domain name.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxxxcvdaf.****.com</p>
     */
    @NameInMap("Cname")
    public String cname;

    /**
     * <p>The domain name.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://www.aliyundoc.com">www.aliyundoc.com</a></p>
     */
    @NameInMap("Domain")
    public String domain;

    /**
     * <p>The configurations of the listeners.</p>
     */
    @NameInMap("Listen")
    public DescribeDomainDetailResponseBodyListen listen;

    /**
     * <p>The configurations of the forwarding rule.</p>
     */
    @NameInMap("Redirect")
    public DescribeDomainDetailResponseBodyRedirect redirect;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>BAEF9CA9-66A0-533E-BD09-5D5D7AA8****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfm***q</p>
     */
    @NameInMap("ResourceManagerResourceGroupId")
    public String resourceManagerResourceGroupId;

    /**
     * <p>The information about the SM certificate.</p>
     */
    @NameInMap("SM2CertDetail")
    public DescribeDomainDetailResponseBodySM2CertDetail SM2CertDetail;

    /**
     * <p>The status of the domain name. Valid values:</p>
     * <ul>
     * <li><strong>1:</strong> The domain name is in a normal state.</li>
     * <li><strong>2:</strong> The domain name is being created.</li>
     * <li><strong>3:</strong> The domain name is being modified.</li>
     * <li><strong>4:</strong> The domain name is being released.</li>
     * <li><strong>5:</strong> WAF no longer forwards traffic of the domain name.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Status")
    public Long status;

    public static DescribeDomainDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainDetailResponseBody self = new DescribeDomainDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDomainDetailResponseBody setCertDetail(DescribeDomainDetailResponseBodyCertDetail certDetail) {
        this.certDetail = certDetail;
        return this;
    }
    public DescribeDomainDetailResponseBodyCertDetail getCertDetail() {
        return this.certDetail;
    }

    public DescribeDomainDetailResponseBody setCname(String cname) {
        this.cname = cname;
        return this;
    }
    public String getCname() {
        return this.cname;
    }

    public DescribeDomainDetailResponseBody setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public DescribeDomainDetailResponseBody setListen(DescribeDomainDetailResponseBodyListen listen) {
        this.listen = listen;
        return this;
    }
    public DescribeDomainDetailResponseBodyListen getListen() {
        return this.listen;
    }

    public DescribeDomainDetailResponseBody setRedirect(DescribeDomainDetailResponseBodyRedirect redirect) {
        this.redirect = redirect;
        return this;
    }
    public DescribeDomainDetailResponseBodyRedirect getRedirect() {
        return this.redirect;
    }

    public DescribeDomainDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDomainDetailResponseBody setResourceManagerResourceGroupId(String resourceManagerResourceGroupId) {
        this.resourceManagerResourceGroupId = resourceManagerResourceGroupId;
        return this;
    }
    public String getResourceManagerResourceGroupId() {
        return this.resourceManagerResourceGroupId;
    }

    public DescribeDomainDetailResponseBody setSM2CertDetail(DescribeDomainDetailResponseBodySM2CertDetail SM2CertDetail) {
        this.SM2CertDetail = SM2CertDetail;
        return this;
    }
    public DescribeDomainDetailResponseBodySM2CertDetail getSM2CertDetail() {
        return this.SM2CertDetail;
    }

    public DescribeDomainDetailResponseBody setStatus(Long status) {
        this.status = status;
        return this;
    }
    public Long getStatus() {
        return this.status;
    }

    public static class DescribeDomainDetailResponseBodyCertDetail extends TeaModel {
        /**
         * <p>The domain name of your website.</p>
         * 
         * <strong>example:</strong>
         * <p>test.aliyundoc.com</p>
         */
        @NameInMap("CommonName")
        public String commonName;

        /**
         * <p>The end of the validity period of the SSL certificate. The value is in the UNIX timestamp format. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1685590400000</p>
         */
        @NameInMap("EndTime")
        public Long endTime;

        /**
         * <p>The ID of the SSL certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>123-cn-hangzhou</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The name of the SSL certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>test-cert-name</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>All domain names that are bound to the certificate.</p>
         */
        @NameInMap("Sans")
        public java.util.List<String> sans;

        /**
         * <p>The beginning of the validity period of the SSL certificate. The value is in the UNIX timestamp format. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1677772800000</p>
         */
        @NameInMap("StartTime")
        public Long startTime;

        public static DescribeDomainDetailResponseBodyCertDetail build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainDetailResponseBodyCertDetail self = new DescribeDomainDetailResponseBodyCertDetail();
            return TeaModel.build(map, self);
        }

        public DescribeDomainDetailResponseBodyCertDetail setCommonName(String commonName) {
            this.commonName = commonName;
            return this;
        }
        public String getCommonName() {
            return this.commonName;
        }

        public DescribeDomainDetailResponseBodyCertDetail setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public DescribeDomainDetailResponseBodyCertDetail setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DescribeDomainDetailResponseBodyCertDetail setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeDomainDetailResponseBodyCertDetail setSans(java.util.List<String> sans) {
            this.sans = sans;
            return this;
        }
        public java.util.List<String> getSans() {
            return this.sans;
        }

        public DescribeDomainDetailResponseBodyCertDetail setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

    }

    public static class DescribeDomainDetailResponseBodyListen extends TeaModel {
        /**
         * <p>The ID of the certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("CertId")
        public Long certId;

        /**
         * <p>The type of the cipher suites. Valid values:</p>
         * <ul>
         * <li><strong>1:</strong> all cipher suites.</li>
         * <li><strong>2:</strong> strong cipher suites.</li>
         * <li><strong>99:</strong> custom cipher suites.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("CipherSuite")
        public Long cipherSuite;

        /**
         * <p>An array of custom cipher suites.</p>
         */
        @NameInMap("CustomCiphers")
        public java.util.List<String> customCiphers;

        /**
         * <p>Indicates whether TLS 1.3 is supported. Valid values:</p>
         * <ul>
         * <li><strong>true:</strong> TLS 1.3 is supported.</li>
         * <li><strong>false:</strong> TLS 1.3 is not supported.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EnableTLSv3")
        public Boolean enableTLSv3;

        /**
         * <p>Indicates whether an exclusive IP address is enabled. Valid values:</p>
         * <ul>
         * <li><strong>true:</strong> An exclusive IP address is enabled for the domain name.</li>
         * <li><strong>false:</strong> No exclusive IP addresses are enabled for the domain name.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("ExclusiveIp")
        public Boolean exclusiveIp;

        /**
         * <p>Indicates whether HTTP to HTTPS redirection is enabled for the domain name. Valid values:</p>
         * <ul>
         * <li><strong>true:</strong> HTTP to HTTPS redirection is enabled.</li>
         * <li><strong>false:</strong> HTTP to HTTPS redirection is disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("FocusHttps")
        public Boolean focusHttps;

        /**
         * <p>Indicates whether HTTP/2 is enabled. Valid values:</p>
         * <ul>
         * <li><strong>true:</strong> HTTP/2 is enabled.</li>
         * <li><strong>false:</strong> HTTP/2 is disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Http2Enabled")
        public Boolean http2Enabled;

        /**
         * <p>An array of HTTP listener ports.</p>
         */
        @NameInMap("HttpPorts")
        public java.util.List<Long> httpPorts;

        /**
         * <p>An array of HTTPS listener ports.</p>
         */
        @NameInMap("HttpsPorts")
        public java.util.List<Long> httpsPorts;

        /**
         * <p>Indicates whether IPv6 is enabled. Valid values:</p>
         * <ul>
         * <li><strong>true:</strong> IPv6 is enabled.</li>
         * <li><strong>false:</strong> IPv6 is disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IPv6Enabled")
        public Boolean IPv6Enabled;

        /**
         * <p>The type of protection resource that is used. Valid values:</p>
         * <ul>
         * <li><strong>share:</strong> shared cluster.</li>
         * <li><strong>gslb:</strong> shared cluster-based intelligent load balancing.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>share</p>
         */
        @NameInMap("ProtectionResource")
        public String protectionResource;

        /**
         * <p>Indicates whether only SM certificate-based clients can access the domain name. This parameter is returned only if the value of SM2Enabled is true. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("SM2AccessOnly")
        public Boolean SM2AccessOnly;

        /**
         * <p>The ID of the SM certificate that is added. This parameter is returned only if the value of SM2Enabled is true.</p>
         * 
         * <strong>example:</strong>
         * <p>123-cn-hangzhou</p>
         */
        @NameInMap("SM2CertId")
        public String SM2CertId;

        /**
         * <p>Indicates whether SM certificate-based verification is enabled. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("SM2Enabled")
        public Boolean SM2Enabled;

        /**
         * <p>The version of the Transport Layer Security (TLS) protocol. Valid values:</p>
         * <ul>
         * <li><strong>tlsv1</strong></li>
         * <li><strong>tlsv1.1</strong></li>
         * <li><strong>tlsv1.2</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>tlsv1.2</p>
         */
        @NameInMap("TLSVersion")
        public String TLSVersion;

        /**
         * <p>The method that WAF uses to obtain the actual IP address of a client. Valid values:</p>
         * <ul>
         * <li><strong>0:</strong> No Layer 7 proxies are deployed in front of WAF.</li>
         * <li><strong>1:</strong> WAF reads the first value of the X-Forwarded-For (XFF) header field as the actual IP address of the client.</li>
         * <li><strong>2:</strong> WAF reads the value of a custom header field as the actual IP address of the client.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("XffHeaderMode")
        public Long xffHeaderMode;

        /**
         * <p>An array of custom header fields that are used to obtain the actual IP address of a client.</p>
         */
        @NameInMap("XffHeaders")
        public java.util.List<String> xffHeaders;

        public static DescribeDomainDetailResponseBodyListen build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainDetailResponseBodyListen self = new DescribeDomainDetailResponseBodyListen();
            return TeaModel.build(map, self);
        }

        public DescribeDomainDetailResponseBodyListen setCertId(Long certId) {
            this.certId = certId;
            return this;
        }
        public Long getCertId() {
            return this.certId;
        }

        public DescribeDomainDetailResponseBodyListen setCipherSuite(Long cipherSuite) {
            this.cipherSuite = cipherSuite;
            return this;
        }
        public Long getCipherSuite() {
            return this.cipherSuite;
        }

        public DescribeDomainDetailResponseBodyListen setCustomCiphers(java.util.List<String> customCiphers) {
            this.customCiphers = customCiphers;
            return this;
        }
        public java.util.List<String> getCustomCiphers() {
            return this.customCiphers;
        }

        public DescribeDomainDetailResponseBodyListen setEnableTLSv3(Boolean enableTLSv3) {
            this.enableTLSv3 = enableTLSv3;
            return this;
        }
        public Boolean getEnableTLSv3() {
            return this.enableTLSv3;
        }

        public DescribeDomainDetailResponseBodyListen setExclusiveIp(Boolean exclusiveIp) {
            this.exclusiveIp = exclusiveIp;
            return this;
        }
        public Boolean getExclusiveIp() {
            return this.exclusiveIp;
        }

        public DescribeDomainDetailResponseBodyListen setFocusHttps(Boolean focusHttps) {
            this.focusHttps = focusHttps;
            return this;
        }
        public Boolean getFocusHttps() {
            return this.focusHttps;
        }

        public DescribeDomainDetailResponseBodyListen setHttp2Enabled(Boolean http2Enabled) {
            this.http2Enabled = http2Enabled;
            return this;
        }
        public Boolean getHttp2Enabled() {
            return this.http2Enabled;
        }

        public DescribeDomainDetailResponseBodyListen setHttpPorts(java.util.List<Long> httpPorts) {
            this.httpPorts = httpPorts;
            return this;
        }
        public java.util.List<Long> getHttpPorts() {
            return this.httpPorts;
        }

        public DescribeDomainDetailResponseBodyListen setHttpsPorts(java.util.List<Long> httpsPorts) {
            this.httpsPorts = httpsPorts;
            return this;
        }
        public java.util.List<Long> getHttpsPorts() {
            return this.httpsPorts;
        }

        public DescribeDomainDetailResponseBodyListen setIPv6Enabled(Boolean IPv6Enabled) {
            this.IPv6Enabled = IPv6Enabled;
            return this;
        }
        public Boolean getIPv6Enabled() {
            return this.IPv6Enabled;
        }

        public DescribeDomainDetailResponseBodyListen setProtectionResource(String protectionResource) {
            this.protectionResource = protectionResource;
            return this;
        }
        public String getProtectionResource() {
            return this.protectionResource;
        }

        public DescribeDomainDetailResponseBodyListen setSM2AccessOnly(Boolean SM2AccessOnly) {
            this.SM2AccessOnly = SM2AccessOnly;
            return this;
        }
        public Boolean getSM2AccessOnly() {
            return this.SM2AccessOnly;
        }

        public DescribeDomainDetailResponseBodyListen setSM2CertId(String SM2CertId) {
            this.SM2CertId = SM2CertId;
            return this;
        }
        public String getSM2CertId() {
            return this.SM2CertId;
        }

        public DescribeDomainDetailResponseBodyListen setSM2Enabled(Boolean SM2Enabled) {
            this.SM2Enabled = SM2Enabled;
            return this;
        }
        public Boolean getSM2Enabled() {
            return this.SM2Enabled;
        }

        public DescribeDomainDetailResponseBodyListen setTLSVersion(String TLSVersion) {
            this.TLSVersion = TLSVersion;
            return this;
        }
        public String getTLSVersion() {
            return this.TLSVersion;
        }

        public DescribeDomainDetailResponseBodyListen setXffHeaderMode(Long xffHeaderMode) {
            this.xffHeaderMode = xffHeaderMode;
            return this;
        }
        public Long getXffHeaderMode() {
            return this.xffHeaderMode;
        }

        public DescribeDomainDetailResponseBodyListen setXffHeaders(java.util.List<String> xffHeaders) {
            this.xffHeaders = xffHeaders;
            return this;
        }
        public java.util.List<String> getXffHeaders() {
            return this.xffHeaders;
        }

    }

    public static class DescribeDomainDetailResponseBodyRedirectBackends extends TeaModel {
        /**
         * <p>The IP address or domain name of the origin server.</p>
         * 
         * <strong>example:</strong>
         * <p>1.1.XX.XX</p>
         */
        @NameInMap("Backend")
        public String backend;

        public static DescribeDomainDetailResponseBodyRedirectBackends build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainDetailResponseBodyRedirectBackends self = new DescribeDomainDetailResponseBodyRedirectBackends();
            return TeaModel.build(map, self);
        }

        public DescribeDomainDetailResponseBodyRedirectBackends setBackend(String backend) {
            this.backend = backend;
            return this;
        }
        public String getBackend() {
            return this.backend;
        }

    }

    public static class DescribeDomainDetailResponseBodyRedirectBackupBackends extends TeaModel {
        @NameInMap("Backend")
        public String backend;

        public static DescribeDomainDetailResponseBodyRedirectBackupBackends build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainDetailResponseBodyRedirectBackupBackends self = new DescribeDomainDetailResponseBodyRedirectBackupBackends();
            return TeaModel.build(map, self);
        }

        public DescribeDomainDetailResponseBodyRedirectBackupBackends setBackend(String backend) {
            this.backend = backend;
            return this;
        }
        public String getBackend() {
            return this.backend;
        }

    }

    public static class DescribeDomainDetailResponseBodyRedirectRequestHeaders extends TeaModel {
        /**
         * <p>The custom header field.</p>
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

        public static DescribeDomainDetailResponseBodyRedirectRequestHeaders build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainDetailResponseBodyRedirectRequestHeaders self = new DescribeDomainDetailResponseBodyRedirectRequestHeaders();
            return TeaModel.build(map, self);
        }

        public DescribeDomainDetailResponseBodyRedirectRequestHeaders setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeDomainDetailResponseBodyRedirectRequestHeaders setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeDomainDetailResponseBodyRedirect extends TeaModel {
        /**
         * <p>An array of addresses of origin servers.</p>
         */
        @NameInMap("Backends")
        public java.util.List<DescribeDomainDetailResponseBodyRedirectBackends> backends;

        @NameInMap("BackupBackends")
        public java.util.List<DescribeDomainDetailResponseBodyRedirectBackupBackends> backupBackends;

        /**
         * <p>The timeout period of the connection. Unit: seconds. Valid values: 5 to 120.</p>
         * 
         * <strong>example:</strong>
         * <p>120</p>
         */
        @NameInMap("ConnectTimeout")
        public Integer connectTimeout;

        /**
         * <p>Indicates whether HTTPS to HTTP redirection is enabled for back-to-origin requests of the domain name. Valid values:</p>
         * <ul>
         * <li><strong>true:</strong> HTTPS to HTTP redirection for back-to-origin requests of the domain name is enabled.</li>
         * <li><strong>false:</strong> HTTPS to HTTP redirection for back-to-origin requests of the domain name is disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("FocusHttpBackend")
        public Boolean focusHttpBackend;

        /**
         * <p>Indicates whether the persistent connection feature is enabled. Valid values:</p>
         * <ul>
         * <li><strong>true:</strong> The persistent connection feature is enabled. This is the default value.</li>
         * <li><strong>false:</strong> The persistent connection feature is disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Keepalive")
        public Boolean keepalive;

        /**
         * <p>The number of reused persistent connections. Valid values: 60 to 1000.</p>
         * <blockquote>
         * <p> This parameter specifies the number of reused persistent connections when you enable the persistent connection feature.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("KeepaliveRequests")
        public Integer keepaliveRequests;

        /**
         * <p>The timeout period of persistent connections that are in the Idle state. Valid values: 1 to 60. Default value: 15. Unit: seconds.</p>
         * <blockquote>
         * <p> This parameter specifies the period of time during which a reused persistent connection is allowed to remain in the Idle state before the persistent connection is released.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>15</p>
         */
        @NameInMap("KeepaliveTimeout")
        public Integer keepaliveTimeout;

        /**
         * <p>The load balancing algorithm that is used when WAF forwards requests to the origin server. Valid values:</p>
         * <ul>
         * <li><strong>ip_hash:</strong> the IP hash algorithm.</li>
         * <li><strong>roundRobin:</strong> the round-robin algorithm.</li>
         * <li><strong>leastTime:</strong> the least response time algorithm.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>iphash</p>
         */
        @NameInMap("Loadbalance")
        public String loadbalance;

        /**
         * <p>The read timeout period. Unit: seconds. Valid values: 5 to 1800.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("ReadTimeout")
        public Integer readTimeout;

        /**
         * <p>An array of key-value pairs that are used to mark the requests that pass through the WAF instance.</p>
         */
        @NameInMap("RequestHeaders")
        public java.util.List<DescribeDomainDetailResponseBodyRedirectRequestHeaders> requestHeaders;

        /**
         * <p>Indicates whether WAF retries when requests fail to be forwarded to the origin server. Valid values:</p>
         * <ul>
         * <li><strong>true:</strong> WAF retries. This is the default value.</li>
         * <li><strong>false:</strong> WAF does not retry.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Retry")
        public Boolean retry;

        /**
         * <p>Indicates whether origin Server Name Indication (SNI) is enabled. Valid values:</p>
         * <ul>
         * <li><strong>true:</strong> Origin SNI is enabled.</li>
         * <li><strong>false:</strong> Origin SNI is disabled. This is the default value.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("SniEnabled")
        public Boolean sniEnabled;

        /**
         * <p>The value of the custom SNI field.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.aliyundoc.com">www.aliyundoc.com</a></p>
         */
        @NameInMap("SniHost")
        public String sniHost;

        /**
         * <p>The write timeout period. Unit: seconds. Valid values: 5 to 1800.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("WriteTimeout")
        public Integer writeTimeout;

        /**
         * <p>Indicates whether the X-Forward-For-Proto header is used to identify the protocol used by WAF to forward requests to the origin server. Valid values:</p>
         * <ul>
         * <li><strong>true</strong> (default)</li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("XffProto")
        public Boolean xffProto;

        public static DescribeDomainDetailResponseBodyRedirect build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainDetailResponseBodyRedirect self = new DescribeDomainDetailResponseBodyRedirect();
            return TeaModel.build(map, self);
        }

        public DescribeDomainDetailResponseBodyRedirect setBackends(java.util.List<DescribeDomainDetailResponseBodyRedirectBackends> backends) {
            this.backends = backends;
            return this;
        }
        public java.util.List<DescribeDomainDetailResponseBodyRedirectBackends> getBackends() {
            return this.backends;
        }

        public DescribeDomainDetailResponseBodyRedirect setBackupBackends(java.util.List<DescribeDomainDetailResponseBodyRedirectBackupBackends> backupBackends) {
            this.backupBackends = backupBackends;
            return this;
        }
        public java.util.List<DescribeDomainDetailResponseBodyRedirectBackupBackends> getBackupBackends() {
            return this.backupBackends;
        }

        public DescribeDomainDetailResponseBodyRedirect setConnectTimeout(Integer connectTimeout) {
            this.connectTimeout = connectTimeout;
            return this;
        }
        public Integer getConnectTimeout() {
            return this.connectTimeout;
        }

        public DescribeDomainDetailResponseBodyRedirect setFocusHttpBackend(Boolean focusHttpBackend) {
            this.focusHttpBackend = focusHttpBackend;
            return this;
        }
        public Boolean getFocusHttpBackend() {
            return this.focusHttpBackend;
        }

        public DescribeDomainDetailResponseBodyRedirect setKeepalive(Boolean keepalive) {
            this.keepalive = keepalive;
            return this;
        }
        public Boolean getKeepalive() {
            return this.keepalive;
        }

        public DescribeDomainDetailResponseBodyRedirect setKeepaliveRequests(Integer keepaliveRequests) {
            this.keepaliveRequests = keepaliveRequests;
            return this;
        }
        public Integer getKeepaliveRequests() {
            return this.keepaliveRequests;
        }

        public DescribeDomainDetailResponseBodyRedirect setKeepaliveTimeout(Integer keepaliveTimeout) {
            this.keepaliveTimeout = keepaliveTimeout;
            return this;
        }
        public Integer getKeepaliveTimeout() {
            return this.keepaliveTimeout;
        }

        public DescribeDomainDetailResponseBodyRedirect setLoadbalance(String loadbalance) {
            this.loadbalance = loadbalance;
            return this;
        }
        public String getLoadbalance() {
            return this.loadbalance;
        }

        public DescribeDomainDetailResponseBodyRedirect setReadTimeout(Integer readTimeout) {
            this.readTimeout = readTimeout;
            return this;
        }
        public Integer getReadTimeout() {
            return this.readTimeout;
        }

        public DescribeDomainDetailResponseBodyRedirect setRequestHeaders(java.util.List<DescribeDomainDetailResponseBodyRedirectRequestHeaders> requestHeaders) {
            this.requestHeaders = requestHeaders;
            return this;
        }
        public java.util.List<DescribeDomainDetailResponseBodyRedirectRequestHeaders> getRequestHeaders() {
            return this.requestHeaders;
        }

        public DescribeDomainDetailResponseBodyRedirect setRetry(Boolean retry) {
            this.retry = retry;
            return this;
        }
        public Boolean getRetry() {
            return this.retry;
        }

        public DescribeDomainDetailResponseBodyRedirect setSniEnabled(Boolean sniEnabled) {
            this.sniEnabled = sniEnabled;
            return this;
        }
        public Boolean getSniEnabled() {
            return this.sniEnabled;
        }

        public DescribeDomainDetailResponseBodyRedirect setSniHost(String sniHost) {
            this.sniHost = sniHost;
            return this;
        }
        public String getSniHost() {
            return this.sniHost;
        }

        public DescribeDomainDetailResponseBodyRedirect setWriteTimeout(Integer writeTimeout) {
            this.writeTimeout = writeTimeout;
            return this;
        }
        public Integer getWriteTimeout() {
            return this.writeTimeout;
        }

        public DescribeDomainDetailResponseBodyRedirect setXffProto(Boolean xffProto) {
            this.xffProto = xffProto;
            return this;
        }
        public Boolean getXffProto() {
            return this.xffProto;
        }

    }

    public static class DescribeDomainDetailResponseBodySM2CertDetail extends TeaModel {
        /**
         * <p>The domain name of your website.</p>
         * 
         * <strong>example:</strong>
         * <p>test.aliyundoc.com</p>
         */
        @NameInMap("CommonName")
        public String commonName;

        /**
         * <p>The end of the validity period of the SSL certificate. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>1665590400000</p>
         */
        @NameInMap("EndTime")
        public Long endTime;

        /**
         * <p>The ID of the SSL certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>123-cn-hangzhou</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The name of the SSL certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>test-sm2-cert-name</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>All domain names that are bound to the certificate.</p>
         */
        @NameInMap("Sans")
        public java.util.List<String> sans;

        /**
         * <p>The beginning of the validity period of the SSL certificate. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>1657551525000</p>
         */
        @NameInMap("StartTime")
        public Long startTime;

        public static DescribeDomainDetailResponseBodySM2CertDetail build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainDetailResponseBodySM2CertDetail self = new DescribeDomainDetailResponseBodySM2CertDetail();
            return TeaModel.build(map, self);
        }

        public DescribeDomainDetailResponseBodySM2CertDetail setCommonName(String commonName) {
            this.commonName = commonName;
            return this;
        }
        public String getCommonName() {
            return this.commonName;
        }

        public DescribeDomainDetailResponseBodySM2CertDetail setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public DescribeDomainDetailResponseBodySM2CertDetail setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DescribeDomainDetailResponseBodySM2CertDetail setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeDomainDetailResponseBodySM2CertDetail setSans(java.util.List<String> sans) {
            this.sans = sans;
            return this;
        }
        public java.util.List<String> getSans() {
            return this.sans;
        }

        public DescribeDomainDetailResponseBodySM2CertDetail setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

    }

}
