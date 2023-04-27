// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeHybridCloudResourcesResponseBody extends TeaModel {
    @NameInMap("Domains")
    public java.util.List<DescribeHybridCloudResourcesResponseBodyDomains> domains;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("CertId")
        public String certId;

        @NameInMap("CipherSuite")
        public Integer cipherSuite;

        @NameInMap("CustomCiphers")
        public java.util.List<String> customCiphers;

        @NameInMap("EnableTLSv3")
        public Boolean enableTLSv3;

        @NameInMap("ExclusiveIp")
        public Boolean exclusiveIp;

        @NameInMap("FocusHttps")
        public Boolean focusHttps;

        @NameInMap("Http2Enabled")
        public Boolean http2Enabled;

        @NameInMap("HttpPorts")
        public java.util.List<Long> httpPorts;

        @NameInMap("HttpsPorts")
        public java.util.List<Long> httpsPorts;

        @NameInMap("Ipv6Enabled")
        public Boolean ipv6Enabled;

        @NameInMap("ProtectionResource")
        public String protectionResource;

        @NameInMap("TLSVersion")
        public String TLSVersion;

        @NameInMap("XffHeaderMode")
        public Integer xffHeaderMode;

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

        public DescribeHybridCloudResourcesResponseBodyDomainsListen setIpv6Enabled(Boolean ipv6Enabled) {
            this.ipv6Enabled = ipv6Enabled;
            return this;
        }
        public Boolean getIpv6Enabled() {
            return this.ipv6Enabled;
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
        @NameInMap("Key")
        public String key;

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
        @NameInMap("Backends")
        public java.util.List<String> backends;

        @NameInMap("CnameEnabled")
        public Boolean cnameEnabled;

        @NameInMap("ConnectTimeout")
        public Long connectTimeout;

        @NameInMap("FocusHttpBackend")
        public Boolean focusHttpBackend;

        @NameInMap("Keepalive")
        public Boolean keepalive;

        @NameInMap("KeepaliveRequests")
        public Long keepaliveRequests;

        @NameInMap("KeepaliveTimeout")
        public Long keepaliveTimeout;

        @NameInMap("Loadbalance")
        public String loadbalance;

        @NameInMap("ReadTimeout")
        public Long readTimeout;

        @NameInMap("RequestHeaders")
        public java.util.List<DescribeHybridCloudResourcesResponseBodyDomainsRedirectRequestHeaders> requestHeaders;

        @NameInMap("Retry")
        public Boolean retry;

        @NameInMap("RoutingRules")
        public String routingRules;

        @NameInMap("SniEnabled")
        public Boolean sniEnabled;

        @NameInMap("SniHost")
        public String sniHost;

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
        @NameInMap("Cname")
        public String cname;

        @NameInMap("Domain")
        public String domain;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Listen")
        public DescribeHybridCloudResourcesResponseBodyDomainsListen listen;

        @NameInMap("Redirect")
        public DescribeHybridCloudResourcesResponseBodyDomainsRedirect redirect;

        @NameInMap("ResourceManagerResourceGroupId")
        public String resourceManagerResourceGroupId;

        @NameInMap("Status")
        public Integer status;

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
