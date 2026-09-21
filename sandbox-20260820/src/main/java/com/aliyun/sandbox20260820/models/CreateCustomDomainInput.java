// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sandbox20260820.models;

import com.aliyun.tea.*;

public class CreateCustomDomainInput extends TeaModel {
    @NameInMap("certConfig")
    public CertConfig certConfig;

    /**
     * <strong>example:</strong>
     * <p>沙箱预览环境入口域名</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <strong>example:</strong>
     * <p>sandbox.example.com</p>
     */
    @NameInMap("domainName")
    public String domainName;

    @NameInMap("tlsConfig")
    public TLSConfig tlsConfig;

    public static CreateCustomDomainInput build(java.util.Map<String, ?> map) throws Exception {
        CreateCustomDomainInput self = new CreateCustomDomainInput();
        return TeaModel.build(map, self);
    }

    public CreateCustomDomainInput setCertConfig(CertConfig certConfig) {
        this.certConfig = certConfig;
        return this;
    }
    public CertConfig getCertConfig() {
        return this.certConfig;
    }

    public CreateCustomDomainInput setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateCustomDomainInput setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public CreateCustomDomainInput setTlsConfig(TLSConfig tlsConfig) {
        this.tlsConfig = tlsConfig;
        return this;
    }
    public TLSConfig getTlsConfig() {
        return this.tlsConfig;
    }

}
