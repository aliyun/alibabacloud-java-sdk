// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons20190214.models;

import com.aliyun.tea.*;

public class OnsConsumerResetOffsetResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static OnsConsumerResetOffsetResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OnsConsumerResetOffsetResponseBody self = new OnsConsumerResetOffsetResponseBody();
        return TeaModel.build(map, self);
    }

    public OnsConsumerResetOffsetResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
