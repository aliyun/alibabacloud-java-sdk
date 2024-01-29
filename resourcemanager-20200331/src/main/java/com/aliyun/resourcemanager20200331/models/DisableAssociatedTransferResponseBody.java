// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class DisableAssociatedTransferResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DisableAssociatedTransferResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DisableAssociatedTransferResponseBody self = new DisableAssociatedTransferResponseBody();
        return TeaModel.build(map, self);
    }

    public DisableAssociatedTransferResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
