// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class StopChannelResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static StopChannelResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StopChannelResponseBody self = new StopChannelResponseBody();
        return TeaModel.build(map, self);
    }

    public StopChannelResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
