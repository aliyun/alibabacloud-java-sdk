// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class DeregisterResourceTypeResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeregisterResourceTypeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeregisterResourceTypeResponseBody self = new DeregisterResourceTypeResponseBody();
        return TeaModel.build(map, self);
    }

    public DeregisterResourceTypeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
