// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260319.models;

import com.aliyun.tea.*;

public class SetYikeCallbackConfigResponseBody extends TeaModel {
    /**
     * <p>RequestId</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong>63E8B7C7-4812-46AD-0FA56029AC86</strong></strong></p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static SetYikeCallbackConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetYikeCallbackConfigResponseBody self = new SetYikeCallbackConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public SetYikeCallbackConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
