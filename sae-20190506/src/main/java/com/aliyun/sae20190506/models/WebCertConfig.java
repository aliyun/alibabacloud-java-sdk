// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class WebCertConfig extends TeaModel {
    @NameInMap("CertName")
    public String certName;

    @NameInMap("Certificate")
    public String certificate;

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
