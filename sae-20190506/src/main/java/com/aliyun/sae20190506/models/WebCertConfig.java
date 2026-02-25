// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class WebCertConfig extends TeaModel {
    /**
     * <p>The certificate name.</p>
     * 
     * <strong>example:</strong>
     * <p>sae-certname</p>
     */
    @NameInMap("CertName")
    public String certName;

    /**
     * <p>The public key of the certificate.</p>
     * 
     * <strong>example:</strong>
     * <p>-----BEGIN CERTIFICATE-----
     *  …… 
     * -----END CERTIFICATE-----</p>
     */
    @NameInMap("Certificate")
    public String certificate;

    /**
     * <p>The private key of the certificate.</p>
     * 
     * <strong>example:</strong>
     * <p>-----BEGIN RSA PRIVATE KEY----- MIIEowIBAAKCAQEA5SIfpNCBoiDrZhX1H39CHwQMVD0kBNeBTWfP9xkeesvfzbOz ******* POVNFfDf9h7pJtQ5fRZNTYTDs/d+cH62Z3+nS74mNnEfff0nkvne 
     * -----END RSA PRIVATE KEY-----</p>
     */
    @NameInMap("PrivateKey")
    public String privateKey;

    public static WebCertConfig build(java.util.Map<String, ?> map) throws Exception {
        WebCertConfig self = new WebCertConfig();
        return TeaModel.build(map, self);
    }

    public WebCertConfig setCertName(String certName) {
        this.certName = certName;
        return this;
    }
    public String getCertName() {
        return this.certName;
    }

    public WebCertConfig setCertificate(String certificate) {
        this.certificate = certificate;
        return this;
    }
    public String getCertificate() {
        return this.certificate;
    }

    public WebCertConfig setPrivateKey(String privateKey) {
        this.privateKey = privateKey;
        return this;
    }
    public String getPrivateKey() {
        return this.privateKey;
    }

}
