// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeHybridCloudResourceDetailResponseBody extends TeaModel {
    @NameInMap("Domain")
    public DescribeHybridCloudResourceDetailResponseBodyDomain domain;

    /**
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
         * <strong>example:</strong>
         * <p>19312542-cn-hangzhou</p>
         */
        @NameInMap("CertId")
        public String certId;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("CipherSuite")
        public Integer cipherSuite;

        @NameInMap("CustomCiphers")
        public java.util.List<String> customCiphers;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EnableTLSv3")
        public Boolean enableTLSv3;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("ExclusiveIp")
        public Boolean exclusiveIp;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("FocusHttps")
        public Boolean focusHttps;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Http2Enabled")
        public Boolean http2Enabled;

        @NameInMap("HttpPorts")
        public java.util.List<Long> httpPorts;

        @NameInMap("HttpsPorts")
        public java.util.List<Long> httpsPorts;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IPv6Enabled")
        public Boolean IPv6Enabled;

        /**
         * <strong>example:</strong>
         * <p>share</p>
         */
        @NameInMap("ProtectionResource")
        public String protectionResource;

        /**
         * <strong>example:</strong>
         * <p>tlsv1</p>
         */
        @NameInMap("TLSVersion")
        public String TLSVersion;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("XffHeaderMode")
        public Integer xffHeaderMode;

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

    public static class DescribeHybridCloudResourceDetailResponseBodyDomainRedirectRequestHeaders extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>L2x1ZmZ5L2NvcmUvYXBwcy9tLnl1bmR1bi53YWYuMS9wbHVnaW5z</p>
         */
        @NameInMap("Key")
        public String key;

        /**
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
        @NameInMap("Backends")
        public java.util.List<String> backends;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("CnameEnabled")
        public Boolean cnameEnabled;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ConnectTimeout")
        public Long connectTimeout;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("FocusHttpBackend")
        public Boolean focusHttpBackend;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Keepalive")
        public Boolean keepalive;

        /**
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("KeepaliveRequests")
        public Long keepaliveRequests;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("KeepaliveTimeout")
        public Long keepaliveTimeout;

        /**
         * <strong>example:</strong>
         * <p>iphash</p>
         */
        @NameInMap("Loadbalance")
        public String loadbalance;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ReadTimeout")
        public Long readTimeout;

        @NameInMap("RequestHeaders")
        public java.util.List<DescribeHybridCloudResourceDetailResponseBodyDomainRedirectRequestHeaders> requestHeaders;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Retry")
        public Boolean retry;

        /**
         * <strong>example:</strong>
         * <p>[{\&quot;backupRs\&quot;:[],\&quot;location\&quot;:\&quot;v3-test\&quot;,\&quot;locationId\&quot;:1148,\&quot;rs\&quot;:[\&quot;39.98.217.197\&quot;,\&quot;2.2.2.2\&quot;]}]</p>
         */
        @NameInMap("RoutingRules")
        public String routingRules;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("SniEnabled")
        public Boolean sniEnabled;

        /**
         * <strong>example:</strong>
         * <p>eew111</p>
         */
        @NameInMap("SniHost")
        public String sniHost;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("WriteTimeout")
        public Long writeTimeout;

        public static DescribeHybridCloudResourceDetailResponseBodyDomainRedirect build(java.util.Map<String, ?> map) throws Exception {
            DescribeHybridCloudResourceDetailResponseBodyDomainRedirect self = new DescribeHybridCloudResourceDetailResponseBodyDomainRedirect();
            return TeaModel.build(map, self);
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

        @NameInMap("Listen")
        public DescribeHybridCloudResourceDetailResponseBodyDomainListen listen;

        @NameInMap("Redirect")
        public DescribeHybridCloudResourceDetailResponseBodyDomainRedirect redirect;

        /**
         * <strong>example:</strong>
         * <p>rg-***aby</p>
         */
        @NameInMap("ResourceManagerResourceGroupId")
        public String resourceManagerResourceGroupId;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
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
