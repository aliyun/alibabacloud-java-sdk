// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DeleteSubscribeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteSubscribeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteSubscribeResponseBody self = new DeleteSubscribeResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteSubscribeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
