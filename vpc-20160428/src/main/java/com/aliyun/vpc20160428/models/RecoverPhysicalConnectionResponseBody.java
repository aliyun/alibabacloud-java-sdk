// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class RecoverPhysicalConnectionResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>CD14EA74-E9C3-59A9-942A-DFEC7E12818D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RecoverPhysicalConnectionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RecoverPhysicalConnectionResponseBody self = new RecoverPhysicalConnectionResponseBody();
        return TeaModel.build(map, self);
    }

    public RecoverPhysicalConnectionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
