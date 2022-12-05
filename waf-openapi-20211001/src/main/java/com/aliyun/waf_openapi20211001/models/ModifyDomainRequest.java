// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class ModifyDomainRequest extends TeaModel {
    @NameInMap("AccessType")
    public String accessType;

    @NameInMap("Domain")
    public String domain;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Listen")
    public ModifyDomainRequestListen listen;

    @NameInMap("Redirect")
    public ModifyDomainRequestRedirect redirect;

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

    public static class ModifyDomainRequestRedirectRequestHeaders extends TeaModel {
        @NameInMap("Key")
        public String key;

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
        @NameInMap("Backends")
        public java.util.List<String> backends;

        @NameInMap("ConnectTimeout")
        public Integer connectTimeout;

        @NameInMap("FocusHttpBackend")
        public Boolean focusHttpBackend;

        @NameInMap("Keepalive")
        public Boolean keepalive;

        @NameInMap("KeepaliveRequests")
        public Integer keepaliveRequests;

        @NameInMap("KeepaliveTimeout")
        public Integer keepaliveTimeout;

        @NameInMap("Loadbalance")
        public String loadbalance;

        @NameInMap("ReadTimeout")
        public Integer readTimeout;

        @NameInMap("RequestHeaders")
        public java.util.List<ModifyDomainRequestRedirectRequestHeaders> requestHeaders;

        @NameInMap("Retry")
        public Boolean retry;

        @NameInMap("SniEnabled")
        public Boolean sniEnabled;

        @NameInMap("SniHost")
        public String sniHost;

        @NameInMap("WriteTimeout")
        public Integer writeTimeout;

        public static ModifyDomainRequestRedirect build(java.util.Map<String, ?> map) throws Exception {
            ModifyDomainRequestRedirect self = new ModifyDomainRequestRedirect();
            return TeaModel.build(map, self);
        }

        public ModifyDomainRequestRedirect setBackends(java.util.List<String> backends) {
            this.backends = backends;
            return this;
        }
        public java.util.List<String> getBackends() {
            return this.backends;
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

        public ModifyDomainRequestRedirect setWriteTimeout(Integer writeTimeout) {
            this.writeTimeout = writeTimeout;
            return this;
        }
        public Integer getWriteTimeout() {
            return this.writeTimeout;
        }

    }

}
