// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeHybridCloudResourceDetailResponseBody extends TeaModel {
    /**
     * <p>The domain name information.</p>
     */
    @NameInMap("Domain")
    public DescribeHybridCloudResourceDetailResponseBodyDomain domain;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>66A98669-CC6E-4F3E-80A6-3014697B11AE</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeHybridCloudResourceDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeHybridCloudResourceDetailResponseBody self = new DescribeHybridCloudResourceDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeHybridCloudResourceDetailResponseBody setDomain(DescribeHybridCloudResourceDetailResponseBodyDomain domain) {
        this.domain = domain;
        return this;
    }
    public DescribeHybridCloudResourceDetailResponseBodyDomain getDomain() {
        return this.domain;
    }

    public DescribeHybridCloudResourceDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeHybridCloudResourceDetailResponseBodyDomainListen extends TeaModel {
        /**
         * <p>The certificate ID.</p>
         * 
         * <strong>example:</strong>
         * <p>19312542-cn-hangzhou</p>
         */
        @NameInMap("CertId")
        public String certId;

        /**
         * <p>The type of cipher suite. Valid values:</p>
         * <ul>
         * <li><p><strong>1</strong>: all cipher suites.</p>
         * </li>
         * <li><p><strong>2</strong>: strong cipher suites.</p>
         * </li>
         * <li><p><strong>99</strong>: custom cipher suites.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("CipherSuite")
        public Integer cipherSuite;

        /**
         * <p>The custom cipher suites.</p>
         */
        @NameInMap("CustomCiphers")
        public java.util.List<String> customCiphers;

        /**
         * <p>Indicates whether TLS 1.3 is supported. Valid values:</p>
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
         * <p>Indicates whether an exclusive IP address is supported. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: Supported.</p>
         * </li>
         * <li><p><strong>false</strong>: Not supported.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("ExclusiveIp")
        public Boolean exclusiveIp;

        /**
         * <p>Indicates whether HTTPS forced redirect is enabled. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: HTTPS forced redirect is enabled.</p>
         * </li>
         * <li><p><strong>false</strong>: HTTPS forced redirect is disabled.</p>
         * </li>
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
         * <li><p><strong>true</strong>: HTTP/2 is enabled.</p>
         * </li>
         * <li><p><strong>false</strong>: HTTP/2 is disabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Http2Enabled")
        public Boolean http2Enabled;

        /**
         * <p>The list of available ports for the HTTP protocol. The value is a string. When multiple ports are available, they are returned in the format of <strong>port1,port2,port3</strong>.</p>
         */
        @NameInMap("HttpPorts")
        public java.util.List<Long> httpPorts;

        /**
         * <p>The ports for the HTTPS protocol.</p>
         */
        @NameInMap("HttpsPorts")
        public java.util.List<Long> httpsPorts;

        /**
         * <p>Indicates whether IPv6 is enabled. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: IPv6 is enabled.</p>
         * </li>
         * <li><p><strong>false</strong>: IPv6 is disabled.</p>
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
         * <li><p><strong>share</strong>: shared cluster.</p>
         * </li>
         * <li><p><strong>gslb</strong>: shared cluster with intelligent load balancing.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>share</p>
         */
        @NameInMap("ProtectionResource")
        public String protectionResource;

        /**
         * <p>The TLS version. Valid values:</p>
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
         * <p>The method that WAF uses to obtain the actual client IP address. Valid values:</p>
         * <ul>
         * <li><p><strong>0</strong>: No Layer 7 proxy is deployed in front of WAF.</p>
         * </li>
         * <li><p><strong>1</strong>: WAF reads the first value of the X-Forwarded-For (XFF) header field as the client IP address.</p>
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
         * <p>The custom header fields used to obtain the client IP address, in the format of [<strong>&quot;header1&quot;,&quot;header2&quot;,……</strong>].</p>
         * <blockquote>
         * <p>This parameter is required only when <strong>XffHeaderMode</strong> is set to 2, which indicates that WAF reads the value of a custom header field that you specify in the request header as the client IP address.</p>
         * </blockquote>
         */
        @NameInMap("XffHeaders")
        public java.util.List<String> xffHeaders;

        public static DescribeHybridCloudResourceDetailResponseBodyDomainListen build(java.util.Map<String, ?> map) throws Exception {
            DescribeHybridCloudResourceDetailResponseBodyDomainListen self = new DescribeHybridCloudResourceDetailResponseBodyDomainListen();
            return TeaModel.build(map, self);
        }

        public DescribeHybridCloudResourceDetailResponseBodyDomainListen setCertId(String certId) {
            this.certId = certId;
            return this;
        }
        public String getCertId() {
            return this.certId;
        }

        public DescribeHybridCloudResourceDetailResponseBodyDomainListen setCipherSuite(Integer cipherSuite) {
            this.cipherSuite = cipherSuite;
            return this;
        }
        public Integer getCipherSuite() {
            return this.cipherSuite;
        }

        public DescribeHybridCloudResourceDetailResponseBodyDomainListen setCustomCiphers(java.util.List<String> customCiphers) {
            this.customCiphers = customCiphers;
            return this;
        }
        public java.util.List<String> getCustomCiphers() {
            return this.customCiphers;
        }

        public DescribeHybridCloudResourceDetailResponseBodyDomainListen setEnableTLSv3(Boolean enableTLSv3) {
            this.enableTLSv3 = enableTLSv3;
            return this;
        }
        public Boolean getEnableTLSv3() {
            return this.enableTLSv3;
        }

        public DescribeHybridCloudResourceDetailResponseBodyDomainListen setExclusiveIp(Boolean exclusiveIp) {
            this.exclusiveIp = exclusiveIp;
            return this;
        }
        public Boolean getExclusiveIp() {
            return this.exclusiveIp;
        }

        public DescribeHybridCloudResourceDetailResponseBodyDomainListen setFocusHttps(Boolean focusHttps) {
            this.focusHttps = focusHttps;
            return this;
        }
        public Boolean getFocusHttps() {
            return this.focusHttps;
        }

        public DescribeHybridCloudResourceDetailResponseBodyDomainListen setHttp2Enabled(Boolean http2Enabled) {
            this.http2Enabled = http2Enabled;
            return this;
        }
        public Boolean getHttp2Enabled() {
            return this.http2Enabled;
        }

        public DescribeHybridCloudResourceDetailResponseBodyDomainListen setHttpPorts(java.util.List<Long> httpPorts) {
            this.httpPorts = httpPorts;
            return this;
        }
        public java.util.List<Long> getHttpPorts() {
            return this.httpPorts;
        }

        public DescribeHybridCloudResourceDetailResponseBodyDomainListen setHttpsPorts(java.util.List<Long> httpsPorts) {
            this.httpsPorts = httpsPorts;
            return this;
        }
        public java.util.List<Long> getHttpsPorts() {
            return this.httpsPorts;
        }

        public DescribeHybridCloudResourceDetailResponseBodyDomainListen setIPv6Enabled(Boolean IPv6Enabled) {
            this.IPv6Enabled = IPv6Enabled;
            return this;
        }
        public Boolean getIPv6Enabled() {
            return this.IPv6Enabled;
        }

        public DescribeHybridCloudResourceDetailResponseBodyDomainListen setProtectionResource(String protectionResource) {
            this.protectionResource = protectionResource;
            return this;
        }
        public String getProtectionResource() {
            return this.protectionResource;
        }

        public DescribeHybridCloudResourceDetailResponseBodyDomainListen setTLSVersion(String TLSVersion) {
            this.TLSVersion = TLSVersion;
            return this;
        }
        public String getTLSVersion() {
            return this.TLSVersion;
        }

        public DescribeHybridCloudResourceDetailResponseBodyDomainListen setXffHeaderMode(Integer xffHeaderMode) {
            this.xffHeaderMode = xffHeaderMode;
            return this;
        }
        public Integer getXffHeaderMode() {
            return this.xffHeaderMode;
        }

        public DescribeHybridCloudResourceDetailResponseBodyDomainListen setXffHeaders(java.util.List<String> xffHeaders) {
            this.xffHeaders = xffHeaders;
            return this;
        }
        public java.util.List<String> getXffHeaders() {
            return this.xffHeaders;
        }

    }

    public static class DescribeHybridCloudResourceDetailResponseBodyDomainRedirectBackendPorts extends TeaModel {
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
         * <p>The protocol type of the listening port. Valid values:</p>
         * <ul>
         * <li>http: HTTP protocol.</li>
         * <li>https: HTTPS protocol.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>http</p>
         */
        @NameInMap("Protocol")
        public String protocol;

        public static DescribeHybridCloudResourceDetailResponseBodyDomainRedirectBackendPorts build(java.util.Map<String, ?> map) throws Exception {
            DescribeHybridCloudResourceDetailResponseBodyDomainRedirectBackendPorts self = new DescribeHybridCloudResourceDetailResponseBodyDomainRedirectBackendPorts();
            return TeaModel.build(map, self);
        }

        public DescribeHybridCloudResourceDetailResponseBodyDomainRedirectBackendPorts setBackendPort(Integer backendPort) {
            this.backendPort = backendPort;
            return this;
        }
        public Integer getBackendPort() {
            return this.backendPort;
        }

        public DescribeHybridCloudResourceDetailResponseBodyDomainRedirectBackendPorts setListenPort(Integer listenPort) {
            this.listenPort = listenPort;
            return this;
        }
        public Integer getListenPort() {
            return this.listenPort;
        }

        public DescribeHybridCloudResourceDetailResponseBodyDomainRedirectBackendPorts setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

    }

    public static class DescribeHybridCloudResourceDetailResponseBodyDomainRedirectRequestHeaders extends TeaModel {
        /**
         * <p>The key of the tag.</p>
         * 
         * <strong>example:</strong>
         * <p>L2x1ZmZ5L2NvcmUvYXBwcy9tLnl1bmR1bi53YWYuMS9wbHVnaW5z</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value.</p>
         * 
         * <strong>example:</strong>
         * <p>9506360478730</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeHybridCloudResourceDetailResponseBodyDomainRedirectRequestHeaders build(java.util.Map<String, ?> map) throws Exception {
            DescribeHybridCloudResourceDetailResponseBodyDomainRedirectRequestHeaders self = new DescribeHybridCloudResourceDetailResponseBodyDomainRedirectRequestHeaders();
            return TeaModel.build(map, self);
        }

        public DescribeHybridCloudResourceDetailResponseBodyDomainRedirectRequestHeaders setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeHybridCloudResourceDetailResponseBodyDomainRedirectRequestHeaders setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeHybridCloudResourceDetailResponseBodyDomainRedirect extends TeaModel {
        /**
         * <p>The custom port configuration. By default, this is the same as the listening port.</p>
         */
        @NameInMap("BackendPorts")
        public java.util.List<DescribeHybridCloudResourceDetailResponseBodyDomainRedirectBackendPorts> backendPorts;

        /**
         * <p>The IP address of the origin server or the domain name used for back-to-origin.</p>
         */
        @NameInMap("Backends")
        public java.util.List<String> backends;

        /**
         * <p>Specifies whether to enable public cloud disaster recovery. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: Public cloud disaster recovery is enabled.</p>
         * </li>
         * <li><p><strong>false</strong>: Public cloud disaster recovery is disabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("CnameEnabled")
        public Boolean cnameEnabled;

        /**
         * <p>The connection timeout period. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ConnectTimeout")
        public Long connectTimeout;

        /**
         * <p>Indicates whether forced HTTP back-to-origin is enabled. Valid values:</p>
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
         * <p>The number of requests that reuse persistent connections. Valid values: 60 to 1000.</p>
         * <blockquote>
         * <p>This specifies how many persistent connections are reused after persistent connections are enabled.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("KeepaliveRequests")
        public Long keepaliveRequests;

        /**
         * <p>The idle timeout period of persistent connections.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("KeepaliveTimeout")
        public Long keepaliveTimeout;

        /**
         * <p>The load balancing algorithm used for back-to-origin. Valid values:</p>
         * <ul>
         * <li><p><strong>iphash</strong>: IP hash algorithm.</p>
         * </li>
         * <li><p><strong>roundRobin</strong>: round-robin algorithm.</p>
         * </li>
         * <li><p><strong>leastTime</strong>: least-time back-to-origin algorithm.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>iphash</p>
         */
        @NameInMap("Loadbalance")
        public String loadbalance;

        /**
         * <p>Indicates whether the client source IP preservation feature is enabled.</p>
         * <ul>
         * <li>true: The client source IP preservation feature is enabled. After this feature is enabled, the backend service can view the originating IP address of the client.</li>
         * <li>false: The client source IP preservation feature is disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("ProxyProtocol")
        public Boolean proxyProtocol;

        /**
         * <p>The read timeout period of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ReadTimeout")
        public Long readTimeout;

        /**
         * <p>The HTTP request headers.</p>
         */
        @NameInMap("RequestHeaders")
        public java.util.List<DescribeHybridCloudResourceDetailResponseBodyDomainRedirectRequestHeaders> requestHeaders;

        /**
         * <p>Indicates whether WAF retries when back-to-origin fails. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: WAF retries.</p>
         * </li>
         * <li><p><strong>false</strong>: WAF does not retry.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Retry")
        public Boolean retry;

        /**
         * <p>The hybrid cloud forwarding rules, expressed as a string converted from a JSON array. Each element in the JSON array is a structure that contains the following field:</p>
         * <ul>
         * <li><strong>rs</strong>: Array type.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>[{\&quot;backupRs\&quot;:[],\&quot;location\&quot;:\&quot;v3-test\&quot;,\&quot;locationId\&quot;:1148,\&quot;rs\&quot;:[\&quot;39.98.217.197\&quot;,\&quot;2.2.2.2\&quot;]}]</p>
         */
        @NameInMap("RoutingRules")
        public String routingRules;

        /**
         * <p>Indicates whether back-to-origin Server Name Indication (SNI) is enabled. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: Back-to-origin SNI is enabled.</p>
         * </li>
         * <li><p><strong>false</strong>: Back-to-origin SNI is disabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("SniEnabled")
        public Boolean sniEnabled;

        /**
         * <p>The custom value of the SNI extension field. If the value is empty, the SNI value is not customized, and the value of the <strong>Host</strong> field in the request header is used as the value of the SNI extension field by default.</p>
         * <blockquote>
         * <p>This parameter is returned only when <strong>SniStatus</strong> is set to <strong>1</strong>, which indicates that back-to-origin SNI is enabled.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>eew111</p>
         */
        @NameInMap("SniHost")
        public String sniHost;

        /**
         * <p>The write timeout period. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("WriteTimeout")
        public Long writeTimeout;

        public static DescribeHybridCloudResourceDetailResponseBodyDomainRedirect build(java.util.Map<String, ?> map) throws Exception {
            DescribeHybridCloudResourceDetailResponseBodyDomainRedirect self = new DescribeHybridCloudResourceDetailResponseBodyDomainRedirect();
            return TeaModel.build(map, self);
        }

        public DescribeHybridCloudResourceDetailResponseBodyDomainRedirect setBackendPorts(java.util.List<DescribeHybridCloudResourceDetailResponseBodyDomainRedirectBackendPorts> backendPorts) {
            this.backendPorts = backendPorts;
            return this;
        }
        public java.util.List<DescribeHybridCloudResourceDetailResponseBodyDomainRedirectBackendPorts> getBackendPorts() {
            return this.backendPorts;
        }

        public DescribeHybridCloudResourceDetailResponseBodyDomainRedirect setBackends(java.util.List<String> backends) {
            this.backends = backends;
            return this;
        }
        public java.util.List<String> getBackends() {
            return this.backends;
        }

        public DescribeHybridCloudResourceDetailResponseBodyDomainRedirect setCnameEnabled(Boolean cnameEnabled) {
            this.cnameEnabled = cnameEnabled;
            return this;
        }
        public Boolean getCnameEnabled() {
            return this.cnameEnabled;
        }

        public DescribeHybridCloudResourceDetailResponseBodyDomainRedirect setConnectTimeout(Long connectTimeout) {
            this.connectTimeout = connectTimeout;
            return this;
        }
        public Long getConnectTimeout() {
            return this.connectTimeout;
        }

        public DescribeHybridCloudResourceDetailResponseBodyDomainRedirect setFocusHttpBackend(Boolean focusHttpBackend) {
            this.focusHttpBackend = focusHttpBackend;
            return this;
        }
        public Boolean getFocusHttpBackend() {
            return this.focusHttpBackend;
        }

        public DescribeHybridCloudResourceDetailResponseBodyDomainRedirect setKeepalive(Boolean keepalive) {
            this.keepalive = keepalive;
            return this;
        }
        public Boolean getKeepalive() {
            return this.keepalive;
        }

        public DescribeHybridCloudResourceDetailResponseBodyDomainRedirect setKeepaliveRequests(Long keepaliveRequests) {
            this.keepaliveRequests = keepaliveRequests;
            return this;
        }
        public Long getKeepaliveRequests() {
            return this.keepaliveRequests;
        }

        public DescribeHybridCloudResourceDetailResponseBodyDomainRedirect setKeepaliveTimeout(Long keepaliveTimeout) {
            this.keepaliveTimeout = keepaliveTimeout;
            return this;
        }
        public Long getKeepaliveTimeout() {
            return this.keepaliveTimeout;
        }

        public DescribeHybridCloudResourceDetailResponseBodyDomainRedirect setLoadbalance(String loadbalance) {
            this.loadbalance = loadbalance;
            return this;
        }
        public String getLoadbalance() {
            return this.loadbalance;
        }

        public DescribeHybridCloudResourceDetailResponseBodyDomainRedirect setProxyProtocol(Boolean proxyProtocol) {
            this.proxyProtocol = proxyProtocol;
            return this;
        }
        public Boolean getProxyProtocol() {
            return this.proxyProtocol;
        }

        public DescribeHybridCloudResourceDetailResponseBodyDomainRedirect setReadTimeout(Long readTimeout) {
            this.readTimeout = readTimeout;
            return this;
        }
        public Long getReadTimeout() {
            return this.readTimeout;
        }

        public DescribeHybridCloudResourceDetailResponseBodyDomainRedirect setRequestHeaders(java.util.List<DescribeHybridCloudResourceDetailResponseBodyDomainRedirectRequestHeaders> requestHeaders) {
            this.requestHeaders = requestHeaders;
            return this;
        }
        public java.util.List<DescribeHybridCloudResourceDetailResponseBodyDomainRedirectRequestHeaders> getRequestHeaders() {
            return this.requestHeaders;
        }

        public DescribeHybridCloudResourceDetailResponseBodyDomainRedirect setRetry(Boolean retry) {
            this.retry = retry;
            return this;
        }
        public Boolean getRetry() {
            return this.retry;
        }

        public DescribeHybridCloudResourceDetailResponseBodyDomainRedirect setRoutingRules(String routingRules) {
            this.routingRules = routingRules;
            return this;
        }
        public String getRoutingRules() {
            return this.routingRules;
        }

        public DescribeHybridCloudResourceDetailResponseBodyDomainRedirect setSniEnabled(Boolean sniEnabled) {
            this.sniEnabled = sniEnabled;
            return this;
        }
        public Boolean getSniEnabled() {
            return this.sniEnabled;
        }

        public DescribeHybridCloudResourceDetailResponseBodyDomainRedirect setSniHost(String sniHost) {
            this.sniHost = sniHost;
            return this;
        }
        public String getSniHost() {
            return this.sniHost;
        }

        public DescribeHybridCloudResourceDetailResponseBodyDomainRedirect setWriteTimeout(Long writeTimeout) {
            this.writeTimeout = writeTimeout;
            return this;
        }
        public Long getWriteTimeout() {
            return this.writeTimeout;
        }

    }

    public static class DescribeHybridCloudResourceDetailResponseBodyDomain extends TeaModel {
        /**
         * <p>CNAME</p>
         * 
         * <strong>example:</strong>
         * <p>kdmqyi3ck7xogegxpiyfpb0fj21mgkxn.****.com</p>
         */
        @NameInMap("Cname")
        public String cname;

        /**
         * <p>The domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>www.*****.com</p>
         */
        @NameInMap("Domain")
        public String domain;

        /**
         * <p>id</p>
         * 
         * <strong>example:</strong>
         * <p>31323</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The listening information.</p>
         */
        @NameInMap("Listen")
        public DescribeHybridCloudResourceDetailResponseBodyDomainListen listen;

        /**
         * <p>The rules for returning response header values.</p>
         */
        @NameInMap("Redirect")
        public DescribeHybridCloudResourceDetailResponseBodyDomainRedirect redirect;

        /**
         * <p>The resource group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-***aby</p>
         */
        @NameInMap("ResourceManagerResourceGroupId")
        public String resourceManagerResourceGroupId;

        /**
         * <p>The resource status.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <p>The user ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1046011128270720</p>
         */
        @NameInMap("Uid")
        public String uid;

        public static DescribeHybridCloudResourceDetailResponseBodyDomain build(java.util.Map<String, ?> map) throws Exception {
            DescribeHybridCloudResourceDetailResponseBodyDomain self = new DescribeHybridCloudResourceDetailResponseBodyDomain();
            return TeaModel.build(map, self);
        }

        public DescribeHybridCloudResourceDetailResponseBodyDomain setCname(String cname) {
            this.cname = cname;
            return this;
        }
        public String getCname() {
            return this.cname;
        }

        public DescribeHybridCloudResourceDetailResponseBodyDomain setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public DescribeHybridCloudResourceDetailResponseBodyDomain setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeHybridCloudResourceDetailResponseBodyDomain setListen(DescribeHybridCloudResourceDetailResponseBodyDomainListen listen) {
            this.listen = listen;
            return this;
        }
        public DescribeHybridCloudResourceDetailResponseBodyDomainListen getListen() {
            return this.listen;
        }

        public DescribeHybridCloudResourceDetailResponseBodyDomain setRedirect(DescribeHybridCloudResourceDetailResponseBodyDomainRedirect redirect) {
            this.redirect = redirect;
            return this;
        }
        public DescribeHybridCloudResourceDetailResponseBodyDomainRedirect getRedirect() {
            return this.redirect;
        }

        public DescribeHybridCloudResourceDetailResponseBodyDomain setResourceManagerResourceGroupId(String resourceManagerResourceGroupId) {
            this.resourceManagerResourceGroupId = resourceManagerResourceGroupId;
            return this;
        }
        public String getResourceManagerResourceGroupId() {
            return this.resourceManagerResourceGroupId;
        }

        public DescribeHybridCloudResourceDetailResponseBodyDomain setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public DescribeHybridCloudResourceDetailResponseBodyDomain setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

    }

}
