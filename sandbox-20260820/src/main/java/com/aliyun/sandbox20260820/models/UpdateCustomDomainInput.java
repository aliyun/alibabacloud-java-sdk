// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sandbox20260820.models;

import com.aliyun.tea.*;

public class UpdateCustomDomainInput extends TeaModel {
    @NameInMap("certConfig")
    public CertConfig certConfig;

    /**
     * <strong>example:</strong>
     * <p>沙箱生产环境入口域名</p>
     */
    @NameInMap("description")
    public String description;

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
