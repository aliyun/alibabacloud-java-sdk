// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons20190214.models;

import com.aliyun.tea.*;

public class OnsGroupConsumerUpdateResponseBody extends TeaModel {
    /**
     * <p>The ID of the request. This parameter is a common parameter. Each request has a unique ID. You can use this ID to troubleshoot issues.</p>
     */
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
