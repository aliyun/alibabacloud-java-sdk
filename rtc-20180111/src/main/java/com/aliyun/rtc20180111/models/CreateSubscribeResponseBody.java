// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class CreateSubscribeResponseBody extends TeaModel {
    @NameInMap("SubscribeId")
    public String subscribeId;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateSubscribeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateSubscribeResponseBody self = new CreateSubscribeResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateSubscribeResponseBody setSubscribeId(String subscribeId) {
        this.subscribeId = subscribeId;
        return this;
    }
    public String getSubscribeId() {
        return this.subscribeId;
    }

    public CreateSubscribeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
