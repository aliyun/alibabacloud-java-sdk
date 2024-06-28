// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ConfirmPhysicalConnectionResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>API-20365164-5b0d-460a-83c2-2189972b****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ConfirmPhysicalConnectionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ConfirmPhysicalConnectionResponseBody self = new ConfirmPhysicalConnectionResponseBody();
        return TeaModel.build(map, self);
    }

    public ConfirmPhysicalConnectionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
