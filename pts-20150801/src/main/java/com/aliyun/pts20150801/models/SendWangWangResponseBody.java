// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20150801.models;

import com.aliyun.tea.*;

public class SendWangWangResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static SendWangWangResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SendWangWangResponseBody self = new SendWangWangResponseBody();
        return TeaModel.build(map, self);
    }

    public SendWangWangResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
