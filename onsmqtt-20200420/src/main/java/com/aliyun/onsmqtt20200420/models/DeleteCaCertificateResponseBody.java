// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.onsmqtt20200420.models;

import com.aliyun.tea.*;

public class DeleteCaCertificateResponseBody extends TeaModel {
    /**
     * <p>The common parameter. The ID of each request is unique and can be used for troubleshooting.</p>
     * 
     * <strong>example:</strong>
     * <p>020F6A43-19E6-4B6E-B846-44EB31DF****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The SN of the deleted CA certificate. The SN uniquely identifies a CA certificate.</p>
     * 
     * <strong>example:</strong>
     * <p>007269004887******</p>
     */
    @NameInMap("Sn")
    public String sn;

    public static DeleteCaCertificateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteCaCertificateResponseBody self = new DeleteCaCertificateResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteCaCertificateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteCaCertificateResponseBody setSn(String sn) {
        this.sn = sn;
        return this;
    }
    public String getSn() {
        return this.sn;
    }

}
