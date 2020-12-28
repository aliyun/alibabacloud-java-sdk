// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons20190214.models;

import com.aliyun.tea.*;

public class OnsGroupConsumerUpdateResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static OnsGroupConsumerUpdateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OnsGroupConsumerUpdateResponseBody self = new OnsGroupConsumerUpdateResponseBody();
        return TeaModel.build(map, self);
    }

    public OnsGroupConsumerUpdateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
