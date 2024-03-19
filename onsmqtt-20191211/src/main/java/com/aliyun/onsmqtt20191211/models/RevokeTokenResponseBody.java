// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.onsmqtt20191211.models;

import com.aliyun.tea.*;

public class RevokeTokenResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static RevokeTokenResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RevokeTokenResponseBody self = new RevokeTokenResponseBody();
        return TeaModel.build(map, self);
    }

    public RevokeTokenResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
