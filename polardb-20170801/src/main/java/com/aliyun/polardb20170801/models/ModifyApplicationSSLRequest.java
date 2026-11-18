// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyApplicationSSLRequest extends TeaModel {
    /**
     * <p>The ID of the application.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pa-xxx</p>
     */
    @NameInMap("ApplicationId")
    public String applicationId;

    /**
     * <p>The server certificate chain in PEM format. This parameter is optional.</p>
     * 
     * <strong>example:</strong>
     * <p>-----BEGIN CERTIFICATE-----
     * MIICa
     * -----END CERTIFICATE-----</p>
     */
    @NameInMap("CaPem")
    public String caPem;

    /**
     * <p>The server certificate in PEM format. Provide this parameter when you bring your own (BYO) certificate. The certificate must match the KeyPem parameter and override the instance connection domain name. This parameter is allowed only when CA SSL is enabled for the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>-----BEGIN CERTIFICATE-----
     * MIICert
     * -----END CERTIFICATE-----</p>
     */
    @NameInMap("CertPem")
    public String certPem;

    /**
     * <p>The server private key in PEM format. PKCS#1, PKCS#8, and EC SEC1 formats are supported.</p>
     * 
     * <strong>example:</strong>
     * <p>-----BEGIN PRIVATE KEY-----
     * MIIKey
     * -----END PRIVATE KEY-----</p>
     */
    @NameInMap("KeyPem")
    public String keyPem;

    /**
     * <p>Specifies whether SSL is enabled.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("SslEnabled")
    public Boolean sslEnabled;

    public static ModifyApplicationSSLRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyApplicationSSLRequest self = new ModifyApplicationSSLRequest();
        return TeaModel.build(map, self);
    }

    public ModifyApplicationSSLRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public ModifyApplicationSSLRequest setCaPem(String caPem) {
        this.caPem = caPem;
        return this;
    }
    public String getCaPem() {
        return this.caPem;
    }

    public ModifyApplicationSSLRequest setCertPem(String certPem) {
        this.certPem = certPem;
        return this;
    }
    public String getCertPem() {
        return this.certPem;
    }

    public ModifyApplicationSSLRequest setKeyPem(String keyPem) {
        this.keyPem = keyPem;
        return this;
    }
    public String getKeyPem() {
        return this.keyPem;
    }

    public ModifyApplicationSSLRequest setSslEnabled(Boolean sslEnabled) {
        this.sslEnabled = sslEnabled;
        return this;
    }
    public Boolean getSslEnabled() {
        return this.sslEnabled;
    }

}
