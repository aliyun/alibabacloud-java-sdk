// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class SetVsDomainCertificateRequest extends TeaModel {
    /**
     * <p>The certificate name.</p>
     * 
     * <strong>example:</strong>
     * <p>Cert-77****7</p>
     */
    @NameInMap("CertName")
    public String certName;

    /**
     * <p>The certificate type.</p>
     * <ul>
     * <li><p>upload: Upload certificate</p>
     * </li>
     * <li><p>cas: Alibaba Cloud Security certificate</p>
     * </li>
     * <li><p>free: Personal test certificate (Free Edition)</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>free</p>
     */
    @NameInMap("CertType")
    public String certType;

    /**
     * <p>The accelerated domain name to which the certificate belongs.</p>
     * <blockquote>
     * <p>The domain must use HTTPS acceleration.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example.aliyundoc.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>Set to 1 to skip the certificate name duplication check and overwrite an existing certificate with the same name.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ForceSet")
    public String forceSet;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-qingdao</p>
     */
    @NameInMap("Region")
    public String region;

    /**
     * <p>The private key content. Omit this parameter if you disable the certificate. Provide the private key content if you configure a certificate.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxxxxx</p>
     */
    @NameInMap("SSLPri")
    public String SSLPri;

    /**
     * <p>Whether to enable the HTTPS certificate. Valid values:</p>
     * <ul>
     * <li><p><strong>on</strong>: Enable.</p>
     * </li>
     * <li><p><strong>off</strong> (default): Disable.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("SSLProtocol")
    public String SSLProtocol;

    /**
     * <p>The public certificate content. Omit this parameter if you disable the certificate. Provide the certificate content if you configure a certificate.</p>
     * 
     * <strong>example:</strong>
     * <p>328uiuii28****82dsada81</p>
     */
    @NameInMap("SSLPub")
    public String SSLPub;

    public static SetVsDomainCertificateRequest build(java.util.Map<String, ?> map) throws Exception {
        SetVsDomainCertificateRequest self = new SetVsDomainCertificateRequest();
        return TeaModel.build(map, self);
    }

    public SetVsDomainCertificateRequest setCertName(String certName) {
        this.certName = certName;
        return this;
    }
    public String getCertName() {
        return this.certName;
    }

    public SetVsDomainCertificateRequest setCertType(String certType) {
        this.certType = certType;
        return this;
    }
    public String getCertType() {
        return this.certType;
    }

    public SetVsDomainCertificateRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public SetVsDomainCertificateRequest setForceSet(String forceSet) {
        this.forceSet = forceSet;
        return this;
    }
    public String getForceSet() {
        return this.forceSet;
    }

    public SetVsDomainCertificateRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public SetVsDomainCertificateRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public SetVsDomainCertificateRequest setSSLPri(String SSLPri) {
        this.SSLPri = SSLPri;
        return this;
    }
    public String getSSLPri() {
        return this.SSLPri;
    }

    public SetVsDomainCertificateRequest setSSLProtocol(String SSLProtocol) {
        this.SSLProtocol = SSLProtocol;
        return this;
    }
    public String getSSLProtocol() {
        return this.SSLProtocol;
    }

    public SetVsDomainCertificateRequest setSSLPub(String SSLPub) {
        this.SSLPub = SSLPub;
        return this;
    }
    public String getSSLPub() {
        return this.SSLPub;
    }

}
