// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class RegistryCertificateConfig extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCmZha2VDZXJ0aWZpY2F0ZQotLS0tLUVORCBDRVJUSUZJQ0FURS0tLS0t</p>
     */
    @NameInMap("CertBase64")
    public String certBase64;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Insecure")
    public Boolean insecure;

    public static RegistryCertificateConfig build(java.util.Map<String, ?> map) throws Exception {
        RegistryCertificateConfig self = new RegistryCertificateConfig();
        return TeaModel.build(map, self);
    }

    public RegistryCertificateConfig setCertBase64(String certBase64) {
        this.certBase64 = certBase64;
        return this;
    }
    public String getCertBase64() {
        return this.certBase64;
    }

    public RegistryCertificateConfig setInsecure(Boolean insecure) {
        this.insecure = insecure;
        return this;
    }
    public Boolean getInsecure() {
        return this.insecure;
    }

}
