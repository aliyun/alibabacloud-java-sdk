// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.push20160801.models;

import com.aliyun.tea.*;

public class RemoveTagResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static RemoveTagResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RemoveTagResponseBody self = new RemoveTagResponseBody();
        return TeaModel.build(map, self);
    }

    public RemoveTagResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
