// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20190910.models;

import com.aliyun.tea.*;

public class CreateCertificateResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("CertificateId")
    public Long certificateId;

    public static CreateCertificateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateCertificateResponseBody self = new CreateCertificateResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateCertificateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateCertificateResponseBody setCertificateId(Long certificateId) {
        this.certificateId = certificateId;
        return this;
    }
    public Long getCertificateId() {
        return this.certificateId;
    }

}
