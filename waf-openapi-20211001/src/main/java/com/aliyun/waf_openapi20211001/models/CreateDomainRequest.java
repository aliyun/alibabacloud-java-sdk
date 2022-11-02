// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class CreateDomainRequest extends TeaModel {
    @NameInMap("AccessType")
    public String accessType;

    @NameInMap("Domain")
    public String domain;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Listen")
    public CreateDomainRequestListen listen;

    @NameInMap("Redirect")
    public CreateDomainRequestRedirect redirect;

    @NameInMap("RegionId")
    public String regionId;

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

    public static class CreateDomainRequestListen extends TeaModel {
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
        public java.util.List<Integer> httpPorts;

        @NameInMap("HttpsPorts")
        public java.util.List<Integer> httpsPorts;

        @NameInMap("IPv6Enabled")
        public Boolean IPv6Enabled;

        @NameInMap("ProtectionResource")
        public String protectionResource;

        @NameInMap("TLSVersion")
        public String TLSVersion;

        @NameInMap("XffHeaderMode")
        public Integer xffHeaderMode;

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

    public static class CreateDomainRequestRedirectRequestHeaders extends TeaModel {
        @NameInMap("Key")
        public String key;

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
        @NameInMap("Backends")
        public java.util.List<String> backends;

        @NameInMap("ConnectTimeout")
        public Integer connectTimeout;

        @NameInMap("FocusHttpBackend")
        public Boolean focusHttpBackend;

        @NameInMap("Loadbalance")
        public String loadbalance;

        @NameInMap("ReadTimeout")
        public Integer readTimeout;

        @NameInMap("RequestHeaders")
        public java.util.List<CreateDomainRequestRedirectRequestHeaders> requestHeaders;

        @NameInMap("SniEnabled")
        public Boolean sniEnabled;

        @NameInMap("SniHost")
        public String sniHost;

        @NameInMap("WriteTimeout")
        public Integer writeTimeout;

        public static CreateDomainRequestRedirect build(java.util.Map<String, ?> map) throws Exception {
            CreateDomainRequestRedirect self = new CreateDomainRequestRedirect();
            return TeaModel.build(map, self);
        }

        public CreateDomainRequestRedirect setBackends(java.util.List<String> backends) {
            this.backends = backends;
            return this;
        }
        public java.util.List<String> getBackends() {
            return this.backends;
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

        public CreateDomainRequestRedirect setLoadbalance(String loadbalance) {
            this.loadbalance = loadbalance;
            return this;
        }
        public String getLoadbalance() {
            return this.loadbalance;
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

        public CreateDomainRequestRedirect setWriteTimeout(Integer writeTimeout) {
            this.writeTimeout = writeTimeout;
            return this;
        }
        public Integer getWriteTimeout() {
            return this.writeTimeout;
        }

    }

}
