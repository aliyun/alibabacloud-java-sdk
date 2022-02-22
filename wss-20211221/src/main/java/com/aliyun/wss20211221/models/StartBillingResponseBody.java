// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wss20211221.models;

import com.aliyun.tea.*;

public class StartBillingResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static StartBillingResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StartBillingResponseBody self = new StartBillingResponseBody();
        return TeaModel.build(map, self);
    }

    public StartBillingResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
