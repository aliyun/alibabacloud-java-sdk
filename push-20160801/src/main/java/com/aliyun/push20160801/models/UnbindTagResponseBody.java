// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.push20160801.models;

import com.aliyun.tea.*;

public class UnbindTagResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UnbindTagResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UnbindTagResponseBody self = new UnbindTagResponseBody();
        return TeaModel.build(map, self);
    }

    public UnbindTagResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
