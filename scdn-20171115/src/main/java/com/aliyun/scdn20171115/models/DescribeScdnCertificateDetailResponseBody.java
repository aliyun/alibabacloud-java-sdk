// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scdn20171115.models;

import com.aliyun.tea.*;

public class DescribeScdnCertificateDetailResponseBody extends TeaModel {
    @NameInMap("Cert")
    public String cert;

    @NameInMap("CertId")
    public Long certId;

    @NameInMap("CertName")
    public String certName;

    @NameInMap("Key")
    public String key;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeScdnCertificateDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeScdnCertificateDetailResponseBody self = new DescribeScdnCertificateDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeScdnCertificateDetailResponseBody setCert(String cert) {
        this.cert = cert;
        return this;
    }
    public String getCert() {
        return this.cert;
    }

    public DescribeScdnCertificateDetailResponseBody setCertId(Long certId) {
        this.certId = certId;
        return this;
    }
    public Long getCertId() {
        return this.certId;
    }

    public DescribeScdnCertificateDetailResponseBody setCertName(String certName) {
        this.certName = certName;
        return this;
    }
    public String getCertName() {
        return this.certName;
    }

    public DescribeScdnCertificateDetailResponseBody setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public DescribeScdnCertificateDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
