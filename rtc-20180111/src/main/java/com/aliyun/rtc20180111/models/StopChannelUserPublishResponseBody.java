// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class StopChannelUserPublishResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static StopChannelUserPublishResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StopChannelUserPublishResponseBody self = new StopChannelUserPublishResponseBody();
        return TeaModel.build(map, self);
    }

    public StopChannelUserPublishResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
