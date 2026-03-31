// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class CreateCertsResponseBody extends TeaModel {
    /**
     * <p>The ID of the certificate.</p>
     * 
     * <strong>example:</strong>
     * <p>123456-cn-hangzhou</p>
     */
    @NameInMap("CertIdentifier")
    public String certIdentifier;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>5BBA38B1-07AE-559F-8766-AB50****C300</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateCertsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateCertsResponseBody self = new CreateCertsResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateCertsResponseBody setCertIdentifier(String certIdentifier) {
        this.certIdentifier = certIdentifier;
        return this;
    }
    public String getCertIdentifier() {
        return this.certIdentifier;
    }

    public CreateCertsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
