// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ConfirmPhysicalConnectionResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
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
