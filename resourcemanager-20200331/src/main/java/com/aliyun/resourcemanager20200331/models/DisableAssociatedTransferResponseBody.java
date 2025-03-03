// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class DisableAssociatedTransferResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>7CE0AE54-6F27-5522-A429-4C5EE8FD40C8</p>
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
