// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class SetVodDomainSSLCertificateRequest extends TeaModel {
    /**
     * <p>The certificate ID.</p>
     * 
     * <strong>example:</strong>
     * <p>12342707</p>
     */
    @NameInMap("CertId")
    public Long certId;

    /**
     * <p>The certificate name.</p>
     * 
     * <strong>example:</strong>
     * <p>cert_name</p>
     */
    @NameInMap("CertName")
    public String certName;

    /**
     * <p>The certificate region. Valid values:</p>
     * <ul>
     * <li><strong>ap-southeast-1</strong> (Singapore)</li>
     * <li><strong>cn-hangzhou</strong> (Hangzhou)</li>
     * </ul>
     * <p>Default value: <strong>cn-hangzhou</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("CertRegion")
    public String certRegion;

    /**
     * <p>The certificate type. Valid values:</p>
     * <ul>
     * <li><strong>upload</strong>: an uploaded certificate.</li>
     * <li><strong>cas</strong>: a certificate from SSL Certificates Service.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cas</p>
     */
    @NameInMap("CertType")
    public String certType;

    /**
     * <p>The accelerated domain name for ApsaraVideo VOD.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>Specifies whether to distribute the certificate in a canary release environment. Valid values:</p>
     * <ul>
     * <li><strong>staging</strong>: distributes the certificate in a canary release environment.</li>
     * </ul>
     * <p>If this parameter is not specified or set to any other value, the certificate is formally distributed.</p>
     * 
     * <strong>example:</strong>
     * <p>staging</p>
     */
    @NameInMap("Env")
    public String env;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The content of the private key. If you do not enable the certificate, you do not need to specify this parameter. If you configure a certificate, enter the private key content.</p>
     * 
     * <strong>example:</strong>
     * <hr>
     */
    @NameInMap("SSLPri")
    public String SSLPri;

    /**
     * <p>Specifies whether to enable the HTTPS certificate. Valid values:</p>
     * <ul>
     * <li><strong>on</strong>: Enabled.</li>
     * <li><strong>off</strong>: Disabled.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>off</p>
     */
    @NameInMap("SSLProtocol")
    public String SSLProtocol;

    /**
     * <p>The content of the security certificate. If you do not enable the certificate, you do not need to specify this parameter. If you configure a certificate, enter the certificate content.</p>
     * 
     * <strong>example:</strong>
     * <hr>
     */
    @NameInMap("SSLPub")
    public String SSLPub;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static SetVodDomainSSLCertificateRequest build(java.util.Map<String, ?> map) throws Exception {
        SetVodDomainSSLCertificateRequest self = new SetVodDomainSSLCertificateRequest();
        return TeaModel.build(map, self);
    }

    public SetVodDomainSSLCertificateRequest setCertId(Long certId) {
        this.certId = certId;
        return this;
    }
    public Long getCertId() {
        return this.certId;
    }

    public SetVodDomainSSLCertificateRequest setCertName(String certName) {
        this.certName = certName;
        return this;
    }
    public String getCertName() {
        return this.certName;
    }

    public SetVodDomainSSLCertificateRequest setCertRegion(String certRegion) {
        this.certRegion = certRegion;
        return this;
    }
    public String getCertRegion() {
        return this.certRegion;
    }

    public SetVodDomainSSLCertificateRequest setCertType(String certType) {
        this.certType = certType;
        return this;
    }
    public String getCertType() {
        return this.certType;
    }

    public SetVodDomainSSLCertificateRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public SetVodDomainSSLCertificateRequest setEnv(String env) {
        this.env = env;
        return this;
    }
    public String getEnv() {
        return this.env;
    }

    public SetVodDomainSSLCertificateRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public SetVodDomainSSLCertificateRequest setSSLPri(String SSLPri) {
        this.SSLPri = SSLPri;
        return this;
    }
    public String getSSLPri() {
        return this.SSLPri;
    }

    public SetVodDomainSSLCertificateRequest setSSLProtocol(String SSLProtocol) {
        this.SSLProtocol = SSLProtocol;
        return this;
    }
    public String getSSLProtocol() {
        return this.SSLProtocol;
    }

    public SetVodDomainSSLCertificateRequest setSSLPub(String SSLPub) {
        this.SSLPub = SSLPub;
        return this;
    }
    public String getSSLPub() {
        return this.SSLPub;
    }

    public SetVodDomainSSLCertificateRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
