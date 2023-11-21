// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CancelPhysicalConnectionResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CancelPhysicalConnectionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CancelPhysicalConnectionResponseBody self = new CancelPhysicalConnectionResponseBody();
        return TeaModel.build(map, self);
    }

    public CancelPhysicalConnectionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
