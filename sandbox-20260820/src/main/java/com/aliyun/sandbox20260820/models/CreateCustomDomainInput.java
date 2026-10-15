// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sandbox20260820.models;

import com.aliyun.tea.*;

public class CreateCustomDomainInput extends TeaModel {
    /**
     * <p>The HTTPS certificate configuration used by the domain name.</p>
     */
    @NameInMap("certConfig")
    public CertConfig certConfig;

    /**
     * <p>The description of the custom domain name.</p>
     * 
     * <strong>example:</strong>
     * <p>Entry domain name for the sandbox preview environment</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The custom domain name.</p>
     * 
     * <strong>example:</strong>
     * <p>sandbox.example.com</p>
     */
    @NameInMap("domainName")
    public String domainName;

    /**
     * <p>The TLS protocol configuration used by the domain name.</p>
     */
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
