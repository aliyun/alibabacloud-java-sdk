// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeDomainDetailResponseBody extends TeaModel {
    @NameInMap("Cname")
    public String cname;

    @NameInMap("Domain")
    public String domain;

    @NameInMap("Listen")
    public DescribeDomainDetailResponseBodyListen listen;

    @NameInMap("Redirect")
    public DescribeDomainDetailResponseBodyRedirect redirect;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Status")
    public Long status;

    public static DescribeDomainDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainDetailResponseBody self = new DescribeDomainDetailResponseBody();
        return TeaModel.build(map, self);
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

    public DescribeDomainDetailResponseBody setStatus(Long status) {
        this.status = status;
        return this;
    }
    public Long getStatus() {
        return this.status;
    }

    public static class DescribeDomainDetailResponseBodyListen extends TeaModel {
        @NameInMap("CertId")
        public Long certId;

        @NameInMap("CipherSuite")
        public Long cipherSuite;

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

        @NameInMap("IPv6Enabled")
        public Boolean IPv6Enabled;

        @NameInMap("ProtectionResource")
        public String protectionResource;

        @NameInMap("TLSVersion")
        public String TLSVersion;

        @NameInMap("XffHeaderMode")
        public Long xffHeaderMode;

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

    public static class DescribeDomainDetailResponseBodyRedirectRequestHeaders extends TeaModel {
        @NameInMap("Key")
        public String key;

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
        @NameInMap("Backends")
        public java.util.List<DescribeDomainDetailResponseBodyRedirectBackends> backends;

        @NameInMap("ConnectTimeout")
        public Integer connectTimeout;

        @NameInMap("FocusHttpBackend")
        public Boolean focusHttpBackend;

        @NameInMap("Loadbalance")
        public String loadbalance;

        @NameInMap("ReadTimeout")
        public Integer readTimeout;

        @NameInMap("RequestHeaders")
        public java.util.List<DescribeDomainDetailResponseBodyRedirectRequestHeaders> requestHeaders;

        @NameInMap("SniEnabled")
        public Boolean sniEnabled;

        @NameInMap("SniHost")
        public String sniHost;

        @NameInMap("WriteTimeout")
        public Integer writeTimeout;

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

    }

}
