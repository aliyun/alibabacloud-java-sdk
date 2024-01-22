// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class UpdateCustomDomainInput extends TeaModel {
    @NameInMap("applicationID")
    public String applicationID;

    @NameInMap("applicationName")
    public String applicationName;

    @NameInMap("certConfig")
    public CertConfig certConfig;

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

    public static UpdateCustomDomainInput build(java.util.Map<String, ?> map) throws Exception {
        UpdateCustomDomainInput self = new UpdateCustomDomainInput();
        return TeaModel.build(map, self);
    }

    public UpdateCustomDomainInput setApplicationID(String applicationID) {
        this.applicationID = applicationID;
        return this;
    }
    public String getApplicationID() {
        return this.applicationID;
    }

    public UpdateCustomDomainInput setApplicationName(String applicationName) {
        this.applicationName = applicationName;
        return this;
    }
    public String getApplicationName() {
        return this.applicationName;
    }

    public UpdateCustomDomainInput setCertConfig(CertConfig certConfig) {
        this.certConfig = certConfig;
        return this;
    }
    public CertConfig getCertConfig() {
        return this.certConfig;
    }

    public UpdateCustomDomainInput setKeepFullPath(Boolean keepFullPath) {
        this.keepFullPath = keepFullPath;
        return this;
    }
    public Boolean getKeepFullPath() {
        return this.keepFullPath;
    }

    public UpdateCustomDomainInput setNamespaceID(String namespaceID) {
        this.namespaceID = namespaceID;
        return this;
    }
    public String getNamespaceID() {
        return this.namespaceID;
    }

    public UpdateCustomDomainInput setProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }
    public String getProtocol() {
        return this.protocol;
    }

    public UpdateCustomDomainInput setTlsConfig(TLSConfig tlsConfig) {
        this.tlsConfig = tlsConfig;
        return this;
    }
    public TLSConfig getTlsConfig() {
        return this.tlsConfig;
    }

    public UpdateCustomDomainInput setWafConfig(WAFConfig wafConfig) {
        this.wafConfig = wafConfig;
        return this;
    }
    public WAFConfig getWafConfig() {
        return this.wafConfig;
    }

}
