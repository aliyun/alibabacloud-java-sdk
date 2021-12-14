// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20190910.models;

import com.aliyun.tea.*;

public class CreateCertificateByCertificateIdResponseBody extends TeaModel {
    @NameInMap("CertificateId")
    public Long certificateId;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateCertificateByCertificateIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateCertificateByCertificateIdResponseBody self = new CreateCertificateByCertificateIdResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateCertificateByCertificateIdResponseBody setCertificateId(Long certificateId) {
        this.certificateId = certificateId;
        return this;
    }
    public Long getCertificateId() {
        return this.certificateId;
    }

    public CreateCertificateByCertificateIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
