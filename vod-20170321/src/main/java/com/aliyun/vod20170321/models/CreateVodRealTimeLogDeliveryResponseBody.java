// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class CreateVodRealTimeLogDeliveryResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static CreateVodRealTimeLogDeliveryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateVodRealTimeLogDeliveryResponseBody self = new CreateVodRealTimeLogDeliveryResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateVodRealTimeLogDeliveryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
