// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class CustomDomain extends TeaModel {
    @NameInMap("accountId")
    public String accountId;

    @NameInMap("apiVersion")
    public String apiVersion;

    @NameInMap("certConfig")
    public CertConfig certConfig;

    @NameInMap("createdTime")
    public String createdTime;

    @NameInMap("domainName")
    public String domainName;

    @NameInMap("keepFullPath")
    public Boolean keepFullPath;

    @NameInMap("lastModifiedTime")
    public String lastModifiedTime;

    @NameInMap("namespaceID")
    public String namespaceID;

    @NameInMap("protocol")
    public String protocol;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("subdomainCount")
    public String subdomainCount;

    @NameInMap("tlsConfig")
    public TLSConfig tlsConfig;

    @NameInMap("wafConfig")
    public WAFConfig wafConfig;

    public static CustomDomain build(java.util.Map<String, ?> map) throws Exception {
        CustomDomain self = new CustomDomain();
        return TeaModel.build(map, self);
    }

    public CustomDomain setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public CustomDomain setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }
    public String getApiVersion() {
        return this.apiVersion;
    }

    public CustomDomain setCertConfig(CertConfig certConfig) {
        this.certConfig = certConfig;
        return this;
    }
    public CertConfig getCertConfig() {
        return this.certConfig;
    }

    public CustomDomain setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }
    public String getCreatedTime() {
        return this.createdTime;
    }

    public CustomDomain setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public CustomDomain setKeepFullPath(Boolean keepFullPath) {
        this.keepFullPath = keepFullPath;
        return this;
    }
    public Boolean getKeepFullPath() {
        return this.keepFullPath;
    }

    public CustomDomain setLastModifiedTime(String lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }
    public String getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    public CustomDomain setNamespaceID(String namespaceID) {
        this.namespaceID = namespaceID;
        return this;
    }
    public String getNamespaceID() {
        return this.namespaceID;
    }

    public CustomDomain setProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }
    public String getProtocol() {
        return this.protocol;
    }

    public CustomDomain setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CustomDomain setSubdomainCount(String subdomainCount) {
        this.subdomainCount = subdomainCount;
        return this;
    }
    public String getSubdomainCount() {
        return this.subdomainCount;
    }

    public CustomDomain setTlsConfig(TLSConfig tlsConfig) {
        this.tlsConfig = tlsConfig;
        return this;
    }
    public TLSConfig getTlsConfig() {
        return this.tlsConfig;
    }

    public CustomDomain setWafConfig(WAFConfig wafConfig) {
        this.wafConfig = wafConfig;
        return this;
    }
    public WAFConfig getWafConfig() {
        return this.wafConfig;
    }

}
