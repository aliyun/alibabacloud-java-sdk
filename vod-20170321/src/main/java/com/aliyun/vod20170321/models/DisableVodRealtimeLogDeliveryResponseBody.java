// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DisableVodRealtimeLogDeliveryResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DisableVodRealtimeLogDeliveryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DisableVodRealtimeLogDeliveryResponseBody self = new DisableVodRealtimeLogDeliveryResponseBody();
        return TeaModel.build(map, self);
    }

    public DisableVodRealtimeLogDeliveryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
