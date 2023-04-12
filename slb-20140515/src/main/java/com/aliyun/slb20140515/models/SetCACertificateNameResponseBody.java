// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class SetCACertificateNameResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static SetCACertificateNameResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetCACertificateNameResponseBody self = new SetCACertificateNameResponseBody();
        return TeaModel.build(map, self);
    }

    public SetCACertificateNameResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
