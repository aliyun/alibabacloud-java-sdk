// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class EnableVodRealtimeLogDeliveryResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static EnableVodRealtimeLogDeliveryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EnableVodRealtimeLogDeliveryResponseBody self = new EnableVodRealtimeLogDeliveryResponseBody();
        return TeaModel.build(map, self);
    }

    public EnableVodRealtimeLogDeliveryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
