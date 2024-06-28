// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class UntagResourcesForExpressConnectResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>DE65F6B7-7566-4802-9007-96F2494AC512</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UntagResourcesForExpressConnectResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UntagResourcesForExpressConnectResponseBody self = new UntagResourcesForExpressConnectResponseBody();
        return TeaModel.build(map, self);
    }

    public UntagResourcesForExpressConnectResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
