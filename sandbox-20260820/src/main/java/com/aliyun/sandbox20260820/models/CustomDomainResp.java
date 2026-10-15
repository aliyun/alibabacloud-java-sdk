// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sandbox20260820.models;

import com.aliyun.tea.*;

public class CustomDomainResp extends TeaModel {
    /**
     * <p>The HTTPS certificate configuration used by the domain name.</p>
     */
    @NameInMap("certConfig")
    public CertConfig certConfig;

    /**
     * <p>The time when the domain name was created. The value is a UNIX timestamp in milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1755676800000</p>
     */
    @NameInMap("createdAt")
    public Long createdAt;

    /**
     * <p>The description of the custom domain name.</p>
     * 
     * <strong>example:</strong>
     * <p>Domain name for the sandbox preview environment</p>
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

    /**
     * <p>The time when the domain name was last updated. The value is a UNIX timestamp in milliseconds.</p>
     * 
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
