// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class RevokeInstanceFromCbnResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static RevokeInstanceFromCbnResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RevokeInstanceFromCbnResponseBody self = new RevokeInstanceFromCbnResponseBody();
        return TeaModel.build(map, self);
    }

    public RevokeInstanceFromCbnResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
