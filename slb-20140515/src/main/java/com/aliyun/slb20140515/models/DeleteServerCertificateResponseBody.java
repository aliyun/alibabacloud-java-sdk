// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class DeleteServerCertificateResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteServerCertificateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteServerCertificateResponseBody self = new DeleteServerCertificateResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteServerCertificateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
