// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.onsmqtt20200420.models;

import com.aliyun.tea.*;

public class DeleteCaCertificateResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

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
