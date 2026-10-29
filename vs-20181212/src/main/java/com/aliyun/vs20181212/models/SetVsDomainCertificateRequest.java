// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class SetVsDomainCertificateRequest extends TeaModel {
    /**
     * <p>The certificate name.</p>
     * 
     * <strong>example:</strong>
     * <p>Cert-77****6</p>
     */
    @NameInMap("CertName")
    public String certName;

    /**
     * <p>The certificate type. Valid values:</p>
     * <ul>
     * <li>upload: uploaded certificate</li>
     * <li>cas: SSL Certificates Service certificate</li>
     * <li>free: free certificate</li>
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
     * <p>The domain name must use HTTPS acceleration.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example.aliyundoc.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>If you set this parameter to 1, the system ignores the validation for duplicate certificate names and overwrites the existing certificate with the same name.</p>
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
     * <p>The content of the private key. This parameter is not required if the certificate is disabled. If you configure a certificate, enter the private key content.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxxxxx</p>
     */
    @NameInMap("SSLPri")
    public String SSLPri;

    /**
     * <p>Specifies whether the HTTPS certificate is enabled. Valid values:</p>
     * <ul>
     * <li><strong>on</strong>: Enabled.</li>
     * <li><strong>off</strong>: Disabled. This is the default value.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("SSLProtocol")
    public String SSLProtocol;

    /**
     * <p>The content of the security certificate. This parameter is not required if the certificate is disabled. If you configure a certificate, enter the certificate content.</p>
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
