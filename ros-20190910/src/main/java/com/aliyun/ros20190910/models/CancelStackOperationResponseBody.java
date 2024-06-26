// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class CancelStackOperationResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>B288A0BE-D927-4888-B0F7-B35EF84B6E6F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CancelStackOperationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CancelStackOperationResponseBody self = new CancelStackOperationResponseBody();
        return TeaModel.build(map, self);
    }

    public CancelStackOperationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
