// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wss20211221.models;

import com.aliyun.tea.*;

public class StopBillingResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static StopBillingResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StopBillingResponseBody self = new StopBillingResponseBody();
        return TeaModel.build(map, self);
    }

    public StopBillingResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
