// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sandbox20260820.models;

import com.aliyun.tea.*;

public class CertConfig extends TeaModel {
    /**
     * <p>The certificate name, which is used to identify the certificate in the console.</p>
     * 
     * <strong>example:</strong>
     * <p>sandbox-example-com</p>
     */
    @NameInMap("certName")
    public String certName;

    /**
     * <p>The certificate public key content in PEM format, including the complete certificate chain.</p>
     * 
     * <strong>example:</strong>
     * <p>-----BEGIN CERTIFICATE-----
     * MIIDdzCCAl+gAwIBAgIEbGVzc29u
     * -----END CERTIFICATE-----</p>
     */
    @NameInMap("certificate")
    public String certificate;

    /**
     * <p>The certificate private key content in PEM format. The private key is encrypted and stored on the server side, and is not returned in plaintext when queried.</p>
     * 
     * <strong>example:</strong>
     * <p>-----BEGIN RSA PRIVATE KEY-----</p>
     * <hr>
     * <p>-----END RSA PRIVATE KEY-----</p>
     */
    @NameInMap("privateKey")
    public String privateKey;

    public static CertConfig build(java.util.Map<String, ?> map) throws Exception {
        CertConfig self = new CertConfig();
        return TeaModel.build(map, self);
    }

    public CertConfig setCertName(String certName) {
        this.certName = certName;
        return this;
    }
    public String getCertName() {
        return this.certName;
    }

    public CertConfig setCertificate(String certificate) {
        this.certificate = certificate;
        return this;
    }
    public String getCertificate() {
        return this.certificate;
    }

    public CertConfig setPrivateKey(String privateKey) {
        this.privateKey = privateKey;
        return this;
    }
    public String getPrivateKey() {
        return this.privateKey;
    }

}
