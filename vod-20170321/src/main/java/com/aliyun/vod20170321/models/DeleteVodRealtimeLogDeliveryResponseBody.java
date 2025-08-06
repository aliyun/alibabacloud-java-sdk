// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DeleteVodRealtimeLogDeliveryResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteVodRealtimeLogDeliveryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteVodRealtimeLogDeliveryResponseBody self = new DeleteVodRealtimeLogDeliveryResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteVodRealtimeLogDeliveryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
