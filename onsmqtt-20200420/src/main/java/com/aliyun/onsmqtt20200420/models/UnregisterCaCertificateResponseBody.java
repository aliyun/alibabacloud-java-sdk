// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.onsmqtt20200420.models;

import com.aliyun.tea.*;

public class UnregisterCaCertificateResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Sn")
    public String sn;

    public static UnregisterCaCertificateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UnregisterCaCertificateResponseBody self = new UnregisterCaCertificateResponseBody();
        return TeaModel.build(map, self);
    }

    public UnregisterCaCertificateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UnregisterCaCertificateResponseBody setSn(String sn) {
        this.sn = sn;
        return this;
    }
    public String getSn() {
        return this.sn;
    }

}
