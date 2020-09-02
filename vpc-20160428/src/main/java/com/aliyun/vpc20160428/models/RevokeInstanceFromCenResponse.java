// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class RevokeInstanceFromCenResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static RevokeInstanceFromCenResponse build(java.util.Map<String, ?> map) throws Exception {
        RevokeInstanceFromCenResponse self = new RevokeInstanceFromCenResponse();
        return TeaModel.build(map, self);
    }

    public RevokeInstanceFromCenResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
