// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DeleteEventSubscribeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteEventSubscribeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteEventSubscribeResponseBody self = new DeleteEventSubscribeResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteEventSubscribeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
