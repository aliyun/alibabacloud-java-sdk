// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class CertInfo extends TeaModel {
    @NameInMap("cert_body")
    public String certBody;

    @NameInMap("cert_name")
    public String certName;

    @NameInMap("cert_privatekey")
    public String certPrivatekey;

    public static CertInfo build(java.util.Map<String, ?> map) throws Exception {
        CertInfo self = new CertInfo();
        return TeaModel.build(map, self);
    }

    public CertInfo setCertBody(String certBody) {
        this.certBody = certBody;
        return this;
    }
    public String getCertBody() {
        return this.certBody;
    }

    public CertInfo setCertName(String certName) {
        this.certName = certName;
        return this;
    }
    public String getCertName() {
        return this.certName;
    }

    public CertInfo setCertPrivatekey(String certPrivatekey) {
        this.certPrivatekey = certPrivatekey;
        return this;
    }
    public String getCertPrivatekey() {
        return this.certPrivatekey;
    }

}
