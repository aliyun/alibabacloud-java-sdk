// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.onsmqtt20200420.models;

import com.aliyun.tea.*;

public class InactivateCaCertificateResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Sn")
    public String sn;

    public static InactivateCaCertificateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        InactivateCaCertificateResponseBody self = new InactivateCaCertificateResponseBody();
        return TeaModel.build(map, self);
    }

    public InactivateCaCertificateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public InactivateCaCertificateResponseBody setSn(String sn) {
        this.sn = sn;
        return this;
    }
    public String getSn() {
        return this.sn;
    }

}
