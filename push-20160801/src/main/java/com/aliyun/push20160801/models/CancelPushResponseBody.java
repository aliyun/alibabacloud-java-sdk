// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.push20160801.models;

import com.aliyun.tea.*;

public class CancelPushResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static CancelPushResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CancelPushResponseBody self = new CancelPushResponseBody();
        return TeaModel.build(map, self);
    }

    public CancelPushResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
