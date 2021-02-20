// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DeleteChannelResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteChannelResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteChannelResponseBody self = new DeleteChannelResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteChannelResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
