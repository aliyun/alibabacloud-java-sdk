// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.uisplus20200707.models;

import com.aliyun.tea.*;

public class UnAssociateEipResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static UnAssociateEipResponse build(java.util.Map<String, ?> map) throws Exception {
        UnAssociateEipResponse self = new UnAssociateEipResponse();
        return TeaModel.build(map, self);
    }

    public UnAssociateEipResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
