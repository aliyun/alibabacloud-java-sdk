// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class CreateCustomDomainInput extends TeaModel {
    @NameInMap("applicationName")
    public String applicationName;

    @NameInMap("certConfig")
    public CertConfig certConfig;

    @NameInMap("domainName")
    public String domainName;

    @NameInMap("keepFullPath")
    public Boolean keepFullPath;

    @NameInMap("namespaceID")
    public String namespaceID;

    @NameInMap("protocol")
    public String protocol;

    @NameInMap("tlsConfig")
    public TLSConfig tlsConfig;

    @NameInMap("wafConfig")
    public WAFConfig wafConfig;

    public static CreateCustomDomainInput build(java.util.Map<String, ?> map) throws Exception {
        CreateCustomDomainInput self = new CreateCustomDomainInput();
        return TeaModel.build(map, self);
    }

    public CreateCustomDomainInput setApplicationName(String applicationName) {
        this.applicationName = applicationName;
        return this;
    }
    public String getApplicationName() {
        return this.applicationName;
    }

    public CreateCustomDomainInput setCertConfig(CertConfig certConfig) {
        this.certConfig = certConfig;
        return this;
    }
    public CertConfig getCertConfig() {
        return this.certConfig;
    }

    public CreateCustomDomainInput setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public CreateCustomDomainInput setKeepFullPath(Boolean keepFullPath) {
        this.keepFullPath = keepFullPath;
        return this;
    }
    public Boolean getKeepFullPath() {
        return this.keepFullPath;
    }

    public CreateCustomDomainInput setNamespaceID(String namespaceID) {
        this.namespaceID = namespaceID;
        return this;
    }
    public String getNamespaceID() {
        return this.namespaceID;
    }

    public CreateCustomDomainInput setProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }
    public String getProtocol() {
        return this.protocol;
    }

    public CreateCustomDomainInput setTlsConfig(TLSConfig tlsConfig) {
        this.tlsConfig = tlsConfig;
        return this;
    }
    public TLSConfig getTlsConfig() {
        return this.tlsConfig;
    }

    public CreateCustomDomainInput setWafConfig(WAFConfig wafConfig) {
        this.wafConfig = wafConfig;
        return this;
    }
    public WAFConfig getWafConfig() {
        return this.wafConfig;
    }

}
