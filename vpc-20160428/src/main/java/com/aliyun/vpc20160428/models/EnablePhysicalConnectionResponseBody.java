// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class EnablePhysicalConnectionResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>20365164-5b0d-460a-83c2-2189972b3349</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static EnablePhysicalConnectionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EnablePhysicalConnectionResponseBody self = new EnablePhysicalConnectionResponseBody();
        return TeaModel.build(map, self);
    }

    public EnablePhysicalConnectionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
