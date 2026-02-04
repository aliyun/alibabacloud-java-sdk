// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class SetAppDomainCertificateRequest extends TeaModel {
    /**
     * <p>Business ID of the application instance</p>
     * 
     * <strong>example:</strong>
     * <p>WD20250821161210000001</p>
     */
    @NameInMap("BizId")
    public String bizId;

    /**
     * <p>SSL certificate name</p>
     * 
     * <strong>example:</strong>
     * <p>2024</p>
     */
    @NameInMap("CertificateName")
    public String certificateName;

    /**
     * <p>Certificate type: Default free certificate or customer\&quot;s own certificate</p>
     * 
     * <strong>example:</strong>
     * <p>Server</p>
     */
    @NameInMap("CertificateType")
    public String certificateType;

    /**
     * <p>Domain name</p>
     * 
     * <strong>example:</strong>
     * <p>kaibaidu.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>Private key</p>
     * 
     * <strong>example:</strong>
     * <hr>
     */
    @NameInMap("PrivateKey")
    public String privateKey;

    /**
     * <p>Public key</p>
     * 
     * <strong>example:</strong>
     * <p>c3NoLWVkMjU1MTkgQUFBQUMzTnphQzFsWkRJMU5URTVBQUFBSUxGQnQxUUpyT3IxK2hTTGRkbERMZUx4WGRIZ3hBalBxWHJIbWNFNWxqSk8gbm93Y29kZXJAbm93Y29kZXJkZU1hY0Jvb2stUHJvLmxvY2Fs</p>
     */
    @NameInMap("PublicKey")
    public String publicKey;

    public static SetAppDomainCertificateRequest build(java.util.Map<String, ?> map) throws Exception {
        SetAppDomainCertificateRequest self = new SetAppDomainCertificateRequest();
        return TeaModel.build(map, self);
    }

    public SetAppDomainCertificateRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public SetAppDomainCertificateRequest setCertificateName(String certificateName) {
        this.certificateName = certificateName;
        return this;
    }
    public String getCertificateName() {
        return this.certificateName;
    }

    public SetAppDomainCertificateRequest setCertificateType(String certificateType) {
        this.certificateType = certificateType;
        return this;
    }
    public String getCertificateType() {
        return this.certificateType;
    }

    public SetAppDomainCertificateRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public SetAppDomainCertificateRequest setPrivateKey(String privateKey) {
        this.privateKey = privateKey;
        return this;
    }
    public String getPrivateKey() {
        return this.privateKey;
    }

    public SetAppDomainCertificateRequest setPublicKey(String publicKey) {
        this.publicKey = publicKey;
        return this;
    }
    public String getPublicKey() {
        return this.publicKey;
    }

}
