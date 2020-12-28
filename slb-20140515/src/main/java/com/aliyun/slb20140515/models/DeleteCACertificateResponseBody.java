// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class DeleteCACertificateResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteCACertificateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteCACertificateResponseBody self = new DeleteCACertificateResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteCACertificateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
