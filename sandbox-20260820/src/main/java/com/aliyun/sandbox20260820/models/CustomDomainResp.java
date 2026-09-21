// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sandbox20260820.models;

import com.aliyun.tea.*;

public class CustomDomainResp extends TeaModel {
    @NameInMap("certConfig")
    public CertConfig certConfig;

    /**
     * <strong>example:</strong>
     * <p>1755676800000</p>
     */
    @NameInMap("createdAt")
    public Long createdAt;

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

    /**
     * <strong>example:</strong>
     * <p>1755763200000</p>
     */
    @NameInMap("updatedAt")
    public Long updatedAt;

    public static CustomDomainResp build(java.util.Map<String, ?> map) throws Exception {
        CustomDomainResp self = new CustomDomainResp();
        return TeaModel.build(map, self);
    }

    public CustomDomainResp setCertConfig(CertConfig certConfig) {
        this.certConfig = certConfig;
        return this;
    }
    public CertConfig getCertConfig() {
        return this.certConfig;
    }

    public CustomDomainResp setCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public Long getCreatedAt() {
        return this.createdAt;
    }

    public CustomDomainResp setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CustomDomainResp setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public CustomDomainResp setTlsConfig(TLSConfig tlsConfig) {
        this.tlsConfig = tlsConfig;
        return this;
    }
    public TLSConfig getTlsConfig() {
        return this.tlsConfig;
    }

    public CustomDomainResp setUpdatedAt(Long updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    public Long getUpdatedAt() {
        return this.updatedAt;
    }

}
