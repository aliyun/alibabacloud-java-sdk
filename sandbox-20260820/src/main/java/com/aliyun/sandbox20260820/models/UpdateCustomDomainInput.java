// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sandbox20260820.models;

import com.aliyun.tea.*;

public class UpdateCustomDomainInput extends TeaModel {
    /**
     * <p>The new HTTPS certificate configuration for the domain name. When specified, this overwrites the existing configuration.</p>
     */
    @NameInMap("certConfig")
    public CertConfig certConfig;

    /**
     * <p>The new description of the custom domain name.</p>
     * 
     * <strong>example:</strong>
     * <p>Entry domain name for the sandbox production environment</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The new TLS protocol configuration for the domain name. When specified, this overwrites the existing configuration.</p>
     */
    @NameInMap("tlsConfig")
    public TLSConfig tlsConfig;

    public static UpdateCustomDomainInput build(java.util.Map<String, ?> map) throws Exception {
        UpdateCustomDomainInput self = new UpdateCustomDomainInput();
        return TeaModel.build(map, self);
    }

    public UpdateCustomDomainInput setCertConfig(CertConfig certConfig) {
        this.certConfig = certConfig;
        return this;
    }
    public CertConfig getCertConfig() {
        return this.certConfig;
    }

    public UpdateCustomDomainInput setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateCustomDomainInput setTlsConfig(TLSConfig tlsConfig) {
        this.tlsConfig = tlsConfig;
        return this;
    }
    public TLSConfig getTlsConfig() {
        return this.tlsConfig;
    }

}
