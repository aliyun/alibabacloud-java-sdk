// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class SetServerCertificateNameResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static SetServerCertificateNameResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetServerCertificateNameResponseBody self = new SetServerCertificateNameResponseBody();
        return TeaModel.build(map, self);
    }

    public SetServerCertificateNameResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
