// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class CreateEventSubscribeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SubscribeId")
    public String subscribeId;

    public static CreateEventSubscribeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateEventSubscribeResponseBody self = new CreateEventSubscribeResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateEventSubscribeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateEventSubscribeResponseBody setSubscribeId(String subscribeId) {
        this.subscribeId = subscribeId;
        return this;
    }
    public String getSubscribeId() {
        return this.subscribeId;
    }

}
