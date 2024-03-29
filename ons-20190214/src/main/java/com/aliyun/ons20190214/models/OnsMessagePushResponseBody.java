// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons20190214.models;

import com.aliyun.tea.*;

public class OnsMessagePushResponseBody extends TeaModel {
    /**
     * <p>The ID of the request. The system generates a unique ID for each request. You can troubleshoot issues based on the request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static OnsMessagePushResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OnsMessagePushResponseBody self = new OnsMessagePushResponseBody();
        return TeaModel.build(map, self);
    }

    public OnsMessagePushResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
