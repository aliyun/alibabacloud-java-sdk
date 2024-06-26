// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeHybridCloudResourcesResponseBody extends TeaModel {
    /**
     * <p>The domain names.</p>
     */
    @NameInMap("Domains")
    public java.util.List<DescribeHybridCloudResourcesResponseBodyDomains> domains;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>98D2AA9A-5959-5CCD-83E3-B6606232A2BE</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries that are returned.</p>
     * 
     * <strong>example:</strong>
     * <p>24</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static DescribeHybridCloudResourcesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeHybridCloudResourcesResponseBody self = new DescribeHybridCloudResourcesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeHybridCloudResourcesResponseBody setDomains(java.util.List<DescribeHybridCloudResourcesResponseBodyDomains> domains) {
        this.domains = domains;
        return this;
    }
    public java.util.List<DescribeHybridCloudResourcesResponseBodyDomains> getDomains() {
        return this.domains;
    }

    public DescribeHybridCloudResourcesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeHybridCloudResourcesResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeHybridCloudResourcesResponseBodyDomainsListen extends TeaModel {
        /**
         * <p>The ID of the certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>72***76-cn-hangzhou</p>
         */
        @NameInMap("CertId")
        public String certId;

        /**
         * <p>The types of cipher suites that are added. Valid values:</p>
         * <ul>
         * <li><strong>1:</strong> all cipher suites.</li>
         * <li><strong>2:</strong> strong cipher suites.</li>
         * <li><strong>99:</strong> custom cipher suites.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CipherSuite")
        public Integer cipherSuite;

        /**
         * <p>The custom cipher suites.</p>
         * <blockquote>
         * <p> This parameter is returned only if the value of <strong>CipherSuite</strong> is <strong>99</strong>.</p>
         * </blockquote>
         */
        @NameInMap("CustomCiphers")
        public java.util.List<String> customCiphers;

        /**
         * <p>Indicates whether TLS 1.3 is supported. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EnableTLSv3")
        public Boolean enableTLSv3;

        /**
         * <p>Indicates whether exclusive IP addresses are supported. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("ExclusiveIp")
        public Boolean exclusiveIp;

        /**
         * <p>Indicates whether the HTTP to HTTPS redirection feature is enabled for the domain name. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("FocusHttps")
        public Boolean focusHttps;

        /**
         * <p>Indicates whether HTTP/2 is enabled. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Http2Enabled")
        public Boolean http2Enabled;

        /**
         * <p>The HTTP listener ports.</p>
         */
        @NameInMap("HttpPorts")
        public java.util.List<Long> httpPorts;

        /**
         * <p>The HTTPS listener ports.</p>
         */
        @NameInMap("HttpsPorts")
        public java.util.List<Long> httpsPorts;

        /**
         * <p>Specifies whether to enable IPv6. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("IPv6Enabled")
        public Boolean IPv6Enabled;

        /**
         * <p>The type of the protection resource. Valid values:</p>
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
         * <p>The method that is used to obtain the actual IP address of a client. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: No Layer 7 proxies are deployed in front of WAF.</li>
         * <li><strong>1</strong>: WAF reads the first value of the X-Forwarded-For (XFF) header field as the actual IP address of the client.</li>
         * <li><strong>2</strong>: WAF reads the value of a custom header field as the actual IP address of the client.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("XffHeaderMode")
        public Integer xffHeaderMode;

        /**
         * <p>The custom header fields that are used to obtain the actual IP addresses of clients. The value is in the [&quot;header1&quot;,&quot;header2&quot;,...] format.</p>
         * <blockquote>
         * <p> This parameter is returned only if the value of <strong>XffHeaderMode</strong> is 2.</p>
         * </blockquote>
         */
        @NameInMap("XffHeaders")
        public java.util.List<String> xffHeaders;

        public static DescribeHybridCloudResourcesResponseBodyDomainsListen build(java.util.Map<String, ?> map) throws Exception {
            DescribeHybridCloudResourcesResponseBodyDomainsListen self = new DescribeHybridCloudResourcesResponseBodyDomainsListen();
            return TeaModel.build(map, self);
        }

        public DescribeHybridCloudResourcesResponseBodyDomainsListen setCertId(String certId) {
            this.certId = certId;
            return this;
        }
        public String getCertId() {
            return this.certId;
        }

        public DescribeHybridCloudResourcesResponseBodyDomainsListen setCipherSuite(Integer cipherSuite) {
            this.cipherSuite = cipherSuite;
            return this;
        }
        public Integer getCipherSuite() {
            return this.cipherSuite;
        }

        public DescribeHybridCloudResourcesResponseBodyDomainsListen setCustomCiphers(java.util.List<String> customCiphers) {
            this.customCiphers = customCiphers;
            return this;
        }
        public java.util.List<String> getCustomCiphers() {
            return this.customCiphers;
        }

        public DescribeHybridCloudResourcesResponseBodyDomainsListen setEnableTLSv3(Boolean enableTLSv3) {
            this.enableTLSv3 = enableTLSv3;
            return this;
        }
        public Boolean getEnableTLSv3() {
            return this.enableTLSv3;
        }

        public DescribeHybridCloudResourcesResponseBodyDomainsListen setExclusiveIp(Boolean exclusiveIp) {
            this.exclusiveIp = exclusiveIp;
            return this;
        }
        public Boolean getExclusiveIp() {
            return this.exclusiveIp;
        }

        public DescribeHybridCloudResourcesResponseBodyDomainsListen setFocusHttps(Boolean focusHttps) {
            this.focusHttps = focusHttps;
            return this;
        }
        public Boolean getFocusHttps() {
            return this.focusHttps;
        }

        public DescribeHybridCloudResourcesResponseBodyDomainsListen setHttp2Enabled(Boolean http2Enabled) {
            this.http2Enabled = http2Enabled;
            return this;
        }
        public Boolean getHttp2Enabled() {
            return this.http2Enabled;
        }

        public DescribeHybridCloudResourcesResponseBodyDomainsListen setHttpPorts(java.util.List<Long> httpPorts) {
            this.httpPorts = httpPorts;
            return this;
        }
        public java.util.List<Long> getHttpPorts() {
            return this.httpPorts;
        }

        public DescribeHybridCloudResourcesResponseBodyDomainsListen setHttpsPorts(java.util.List<Long> httpsPorts) {
            this.httpsPorts = httpsPorts;
            return this;
        }
        public java.util.List<Long> getHttpsPorts() {
            return this.httpsPorts;
        }

        public DescribeHybridCloudResourcesResponseBodyDomainsListen setIPv6Enabled(Boolean IPv6Enabled) {
            this.IPv6Enabled = IPv6Enabled;
            return this;
        }
        public Boolean getIPv6Enabled() {
            return this.IPv6Enabled;
        }

        public DescribeHybridCloudResourcesResponseBodyDomainsListen setProtectionResource(String protectionResource) {
            this.protectionResource = protectionResource;
            return this;
        }
        public String getProtectionResource() {
            return this.protectionResource;
        }

        public DescribeHybridCloudResourcesResponseBodyDomainsListen setTLSVersion(String TLSVersion) {
            this.TLSVersion = TLSVersion;
            return this;
        }
        public String getTLSVersion() {
            return this.TLSVersion;
        }

        public DescribeHybridCloudResourcesResponseBodyDomainsListen setXffHeaderMode(Integer xffHeaderMode) {
            this.xffHeaderMode = xffHeaderMode;
            return this;
        }
        public Integer getXffHeaderMode() {
            return this.xffHeaderMode;
        }

        public DescribeHybridCloudResourcesResponseBodyDomainsListen setXffHeaders(java.util.List<String> xffHeaders) {
            this.xffHeaders = xffHeaders;
            return this;
        }
        public java.util.List<String> getXffHeaders() {
            return this.xffHeaders;
        }

    }

    public static class DescribeHybridCloudResourcesResponseBodyDomainsRedirectRequestHeaders extends TeaModel {
        /**
         * <p>The key of the custom header field.</p>
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

        public static DescribeHybridCloudResourcesResponseBodyDomainsRedirectRequestHeaders build(java.util.Map<String, ?> map) throws Exception {
            DescribeHybridCloudResourcesResponseBodyDomainsRedirectRequestHeaders self = new DescribeHybridCloudResourcesResponseBodyDomainsRedirectRequestHeaders();
            return TeaModel.build(map, self);
        }

        public DescribeHybridCloudResourcesResponseBodyDomainsRedirectRequestHeaders setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeHybridCloudResourcesResponseBodyDomainsRedirectRequestHeaders setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeHybridCloudResourcesResponseBodyDomainsRedirect extends TeaModel {
        /**
         * <p>The IP addresses or domain names of the origin server.</p>
         */
        @NameInMap("Backends")
        public java.util.List<String> backends;

        /**
         * <p>Indicates whether the public cloud disaster recovery feature is enabled. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("CnameEnabled")
        public Boolean cnameEnabled;

        /**
         * <p>The timeout period for connections. Unit: seconds. Valid values: 5 to 120.</p>
         * 
         * <strong>example:</strong>
         * <p>120</p>
         */
        @NameInMap("ConnectTimeout")
        public Long connectTimeout;

        /**
         * <p>Indicates whether the HTTPS to HTTP redirection feature is enabled for back-to-origin requests. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
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
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
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
         * <p> This parameter indicates the number of reused persistent connections after the persistent connection feature is enabled.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("KeepaliveRequests")
        public Long keepaliveRequests;

        /**
         * <p>The timeout period for persistent connections that are in the Idle state. Unit: seconds. Valid values: 1 to 60. Default value: 15.</p>
         * <blockquote>
         * <p> This parameter indicates the period of time during which a reused persistent connection can remain in the Idle state before the persistent connection is released.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>15</p>
         */
        @NameInMap("KeepaliveTimeout")
        public Long keepaliveTimeout;

        /**
         * <p>The load balancing algorithm that is used to forward requests to the origin server. Valid values:</p>
         * <ul>
         * <li><strong>iphash</strong></li>
         * <li><strong>roundRobin</strong></li>
         * <li><strong>leastTime</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>iphash</p>
         */
        @NameInMap("Loadbalance")
        public String loadbalance;

        /**
         * <p>The timeout period for read connections. Unit: seconds. Valid values: 5 to 1800.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("ReadTimeout")
        public Long readTimeout;

        /**
         * <p>The key-value pair that is used to label requests that pass through WAF.</p>
         */
        @NameInMap("RequestHeaders")
        public java.util.List<DescribeHybridCloudResourcesResponseBodyDomainsRedirectRequestHeaders> requestHeaders;

        /**
         * <p>Indicates whether WAF retries forwarding requests if requests fail to be forwarded to the origin server. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Retry")
        public Boolean retry;

        /**
         * <p>The forwarding rules that are configured for the domain name. This parameter is a string that consists of JSON arrays. Each element in a JSON array is a JSON struct that contains the following fields:</p>
         * <ul>
         * <li><strong>rs</strong>: the back-to-origin IP addresses or CNAMEs. The value is of the ARRAY type.</li>
         * <li><strong>location</strong>: the name of the protection node. The value is of the STRING type.</li>
         * <li><strong>locationId</strong>: the ID of the protection node. The value is of the LONG type.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>[
         *       {
         *             &quot;rs&quot;: [
         *                   &quot;1.1.XX.XX&quot;
         *             ],
         *             &quot;locationId&quot;: 535,
         *             &quot;location&quot;: &quot;test1111&quot;
         *       }
         * ]</p>
         */
        @NameInMap("RoutingRules")
        public String routingRules;

        /**
         * <p>Indicates whether the origin Server Name Indication (SNI) feature is enabled. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("SniEnabled")
        public Boolean sniEnabled;

        /**
         * <p>The value of the custom SNI field. If the parameter is left empty, the value of the <strong>Host</strong> field in the request header is automatically used as the value of the SNI field.</p>
         * <blockquote>
         * <p> This parameter is returned only if the value of <strong>SniEnabled</strong> is <strong>true</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.aliyundoc.com">www.aliyundoc.com</a></p>
         */
        @NameInMap("SniHost")
        public String sniHost;

        /**
         * <p>The timeout period for write connections. Unit: seconds. Valid values: 5 to 1800.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("WriteTimeout")
        public Long writeTimeout;

        public static DescribeHybridCloudResourcesResponseBodyDomainsRedirect build(java.util.Map<String, ?> map) throws Exception {
            DescribeHybridCloudResourcesResponseBodyDomainsRedirect self = new DescribeHybridCloudResourcesResponseBodyDomainsRedirect();
            return TeaModel.build(map, self);
        }

        public DescribeHybridCloudResourcesResponseBodyDomainsRedirect setBackends(java.util.List<String> backends) {
            this.backends = backends;
            return this;
        }
        public java.util.List<String> getBackends() {
            return this.backends;
        }

        public DescribeHybridCloudResourcesResponseBodyDomainsRedirect setCnameEnabled(Boolean cnameEnabled) {
            this.cnameEnabled = cnameEnabled;
            return this;
        }
        public Boolean getCnameEnabled() {
            return this.cnameEnabled;
        }

        public DescribeHybridCloudResourcesResponseBodyDomainsRedirect setConnectTimeout(Long connectTimeout) {
            this.connectTimeout = connectTimeout;
            return this;
        }
        public Long getConnectTimeout() {
            return this.connectTimeout;
        }

        public DescribeHybridCloudResourcesResponseBodyDomainsRedirect setFocusHttpBackend(Boolean focusHttpBackend) {
            this.focusHttpBackend = focusHttpBackend;
            return this;
        }
        public Boolean getFocusHttpBackend() {
            return this.focusHttpBackend;
        }

        public DescribeHybridCloudResourcesResponseBodyDomainsRedirect setKeepalive(Boolean keepalive) {
            this.keepalive = keepalive;
            return this;
        }
        public Boolean getKeepalive() {
            return this.keepalive;
        }

        public DescribeHybridCloudResourcesResponseBodyDomainsRedirect setKeepaliveRequests(Long keepaliveRequests) {
            this.keepaliveRequests = keepaliveRequests;
            return this;
        }
        public Long getKeepaliveRequests() {
            return this.keepaliveRequests;
        }

        public DescribeHybridCloudResourcesResponseBodyDomainsRedirect setKeepaliveTimeout(Long keepaliveTimeout) {
            this.keepaliveTimeout = keepaliveTimeout;
            return this;
        }
        public Long getKeepaliveTimeout() {
            return this.keepaliveTimeout;
        }

        public DescribeHybridCloudResourcesResponseBodyDomainsRedirect setLoadbalance(String loadbalance) {
            this.loadbalance = loadbalance;
            return this;
        }
        public String getLoadbalance() {
            return this.loadbalance;
        }

        public DescribeHybridCloudResourcesResponseBodyDomainsRedirect setReadTimeout(Long readTimeout) {
            this.readTimeout = readTimeout;
            return this;
        }
        public Long getReadTimeout() {
            return this.readTimeout;
        }

        public DescribeHybridCloudResourcesResponseBodyDomainsRedirect setRequestHeaders(java.util.List<DescribeHybridCloudResourcesResponseBodyDomainsRedirectRequestHeaders> requestHeaders) {
            this.requestHeaders = requestHeaders;
            return this;
        }
        public java.util.List<DescribeHybridCloudResourcesResponseBodyDomainsRedirectRequestHeaders> getRequestHeaders() {
            return this.requestHeaders;
        }

        public DescribeHybridCloudResourcesResponseBodyDomainsRedirect setRetry(Boolean retry) {
            this.retry = retry;
            return this;
        }
        public Boolean getRetry() {
            return this.retry;
        }

        public DescribeHybridCloudResourcesResponseBodyDomainsRedirect setRoutingRules(String routingRules) {
            this.routingRules = routingRules;
            return this;
        }
        public String getRoutingRules() {
            return this.routingRules;
        }

        public DescribeHybridCloudResourcesResponseBodyDomainsRedirect setSniEnabled(Boolean sniEnabled) {
            this.sniEnabled = sniEnabled;
            return this;
        }
        public Boolean getSniEnabled() {
            return this.sniEnabled;
        }

        public DescribeHybridCloudResourcesResponseBodyDomainsRedirect setSniHost(String sniHost) {
            this.sniHost = sniHost;
            return this;
        }
        public String getSniHost() {
            return this.sniHost;
        }

        public DescribeHybridCloudResourcesResponseBodyDomainsRedirect setWriteTimeout(Long writeTimeout) {
            this.writeTimeout = writeTimeout;
            return this;
        }
        public Long getWriteTimeout() {
            return this.writeTimeout;
        }

    }

    public static class DescribeHybridCloudResourcesResponseBodyDomains extends TeaModel {
        /**
         * <p>The CNAME assigned by WAF.</p>
         * <blockquote>
         * <p> This parameter is returned only if the value of <strong>CnameEnabled</strong> is true.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>50fqmu1ci7g0xtiyxnrhgx6qdhmn****.yundunwaf5.com</p>
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
         * <p>The access ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The listeners.</p>
         */
        @NameInMap("Listen")
        public DescribeHybridCloudResourcesResponseBodyDomainsListen listen;

        /**
         * <p>The configurations of the forwarding rule.</p>
         */
        @NameInMap("Redirect")
        public DescribeHybridCloudResourcesResponseBodyDomainsRedirect redirect;

        /**
         * <p>The ID of the Alibaba Cloud resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmvtc5z52****</p>
         */
        @NameInMap("ResourceManagerResourceGroupId")
        public String resourceManagerResourceGroupId;

        /**
         * <p>The status of the domain name. Valid values:</p>
         * <ul>
         * <li><strong>1:</strong> The domain name is in a normal state.</li>
         * <li><strong>2:</strong> The domain name is being created.</li>
         * <li><strong>3:</strong> The domain name is being modified.</li>
         * <li><strong>4:</strong> The domain name is being released.</li>
         * <li><strong>5:</strong> WAF no longer forwards the traffic of the domain name.</li>
         * </ul>
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
         * <p>130715431409****</p>
         */
        @NameInMap("Uid")
        public String uid;

        public static DescribeHybridCloudResourcesResponseBodyDomains build(java.util.Map<String, ?> map) throws Exception {
            DescribeHybridCloudResourcesResponseBodyDomains self = new DescribeHybridCloudResourcesResponseBodyDomains();
            return TeaModel.build(map, self);
        }

        public DescribeHybridCloudResourcesResponseBodyDomains setCname(String cname) {
            this.cname = cname;
            return this;
        }
        public String getCname() {
            return this.cname;
        }

        public DescribeHybridCloudResourcesResponseBodyDomains setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public DescribeHybridCloudResourcesResponseBodyDomains setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeHybridCloudResourcesResponseBodyDomains setListen(DescribeHybridCloudResourcesResponseBodyDomainsListen listen) {
            this.listen = listen;
            return this;
        }
        public DescribeHybridCloudResourcesResponseBodyDomainsListen getListen() {
            return this.listen;
        }

        public DescribeHybridCloudResourcesResponseBodyDomains setRedirect(DescribeHybridCloudResourcesResponseBodyDomainsRedirect redirect) {
            this.redirect = redirect;
            return this;
        }
        public DescribeHybridCloudResourcesResponseBodyDomainsRedirect getRedirect() {
            return this.redirect;
        }

        public DescribeHybridCloudResourcesResponseBodyDomains setResourceManagerResourceGroupId(String resourceManagerResourceGroupId) {
            this.resourceManagerResourceGroupId = resourceManagerResourceGroupId;
            return this;
        }
        public String getResourceManagerResourceGroupId() {
            return this.resourceManagerResourceGroupId;
        }

        public DescribeHybridCloudResourcesResponseBodyDomains setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public DescribeHybridCloudResourcesResponseBodyDomains setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

    }

}
