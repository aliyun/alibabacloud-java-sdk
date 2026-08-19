// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class SetVodDomainCertificateRequest extends TeaModel {
    /**
     * <p>The certificate name.</p>
     * 
     * <strong>example:</strong>
     * <p>cert_name</p>
     */
    @NameInMap("CertName")
    public String certName;

    /**
     * <p>The accelerated domain name to which the certificate belongs. The domain name must be of the HTTPS acceleration type.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The content of the private key. If you do not enable the certificate, you do not need to enter this parameter. If you configure a certificate, enter the private key content.</p>
     * 
     * <strong>example:</strong>
     * <hr>
     */
    @NameInMap("SSLPri")
    public String SSLPri;

    /**
     * <p>Specifies whether to enable the HTTPS certificate. Valid values:</p>
     * <ul>
     * <li><strong>on</strong>: enabled.</li>
     * <li><strong>off</strong> (default): disabled.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>off</p>
     */
    @NameInMap("SSLProtocol")
    public String SSLProtocol;

    /**
     * <p>The content of the security certificate. If you do not enable the certificate, you do not need to enter this parameter. If you configure a certificate, enter the certificate content.</p>
     * 
     * <strong>example:</strong>
     * <hr>
     */
    @NameInMap("SSLPub")
    public String SSLPub;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static SetVodDomainCertificateRequest build(java.util.Map<String, ?> map) throws Exception {
        SetVodDomainCertificateRequest self = new SetVodDomainCertificateRequest();
        return TeaModel.build(map, self);
    }

    public SetVodDomainCertificateRequest setCertName(String certName) {
        this.certName = certName;
        return this;
    }
    public String getCertName() {
        return this.certName;
    }

    public SetVodDomainCertificateRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public SetVodDomainCertificateRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public SetVodDomainCertificateRequest setSSLPri(String SSLPri) {
        this.SSLPri = SSLPri;
        return this;
    }
    public String getSSLPri() {
        return this.SSLPri;
    }

    public SetVodDomainCertificateRequest setSSLProtocol(String SSLProtocol) {
        this.SSLProtocol = SSLProtocol;
        return this;
    }
    public String getSSLProtocol() {
        return this.SSLProtocol;
    }

    public SetVodDomainCertificateRequest setSSLPub(String SSLPub) {
        this.SSLPub = SSLPub;
        return this;
    }
    public String getSSLPub() {
        return this.SSLPub;
    }

    public SetVodDomainCertificateRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
