// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class SetMessageCallbackResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static SetMessageCallbackResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetMessageCallbackResponseBody self = new SetMessageCallbackResponseBody();
        return TeaModel.build(map, self);
    }

    public SetMessageCallbackResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
