// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tag20180828.models;

import com.aliyun.tea.*;

public class DisablePolicyTypeResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DisablePolicyTypeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DisablePolicyTypeResponseBody self = new DisablePolicyTypeResponseBody();
        return TeaModel.build(map, self);
    }

    public DisablePolicyTypeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
