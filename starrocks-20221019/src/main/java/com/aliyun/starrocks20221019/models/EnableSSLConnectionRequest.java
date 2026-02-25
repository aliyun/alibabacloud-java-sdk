// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starrocks20221019.models;

import com.aliyun.tea.*;

public class EnableSSLConnectionRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>MIIP0wIBAzCCD4wGCSqGSIb3DQEHAaCCD30Egg95MIIPdTCCBbwGCSqGSIb3DQEHAaCCBa0EggWpMIIFpTCCBaEGCyqGSIb3DQEMCgECoIIFQDCCBTwwZgYJKoZIhvcNAQUNMFkwOAYJKoZIhvcNAQUMMCsEFHkQJTDaeFabOsRTB4Q7hgW6if7hAgInEAIBIDAMBggqhkiG9w0CCQU</p>
     */
    @NameInMap("CustomSSLCertificate")
    public String customSSLCertificate;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableCustom")
    public Boolean enableCustom;

    /**
     * <strong>example:</strong>
     * <p>c-0104730e9de40215</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Renewal")
    public Boolean renewal;

    /**
     * <strong>example:</strong>
     * <p>KoZ13vcNAQ</p>
     */
    @NameInMap("SslKeyPassword")
    public String sslKeyPassword;

    /**
     * <strong>example:</strong>
     * <p>21esSd9Ao</p>
     */
    @NameInMap("SslKeystorePassword")
    public String sslKeystorePassword;

    public static EnableSSLConnectionRequest build(java.util.Map<String, ?> map) throws Exception {
        EnableSSLConnectionRequest self = new EnableSSLConnectionRequest();
        return TeaModel.build(map, self);
    }

    public EnableSSLConnectionRequest setCustomSSLCertificate(String customSSLCertificate) {
        this.customSSLCertificate = customSSLCertificate;
        return this;
    }
    public String getCustomSSLCertificate() {
        return this.customSSLCertificate;
    }

    public EnableSSLConnectionRequest setEnableCustom(Boolean enableCustom) {
        this.enableCustom = enableCustom;
        return this;
    }
    public Boolean getEnableCustom() {
        return this.enableCustom;
    }

    public EnableSSLConnectionRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public EnableSSLConnectionRequest setRenewal(Boolean renewal) {
        this.renewal = renewal;
        return this;
    }
    public Boolean getRenewal() {
        return this.renewal;
    }

    public EnableSSLConnectionRequest setSslKeyPassword(String sslKeyPassword) {
        this.sslKeyPassword = sslKeyPassword;
        return this;
    }
    public String getSslKeyPassword() {
        return this.sslKeyPassword;
    }

    public EnableSSLConnectionRequest setSslKeystorePassword(String sslKeystorePassword) {
        this.sslKeystorePassword = sslKeystorePassword;
        return this;
    }
    public String getSslKeystorePassword() {
        return this.sslKeystorePassword;
    }

}
