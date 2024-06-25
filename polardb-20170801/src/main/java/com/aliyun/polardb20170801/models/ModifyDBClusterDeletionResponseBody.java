// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyDBClusterDeletionResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>24C80BD8-C710-4138-893A-D2AFED4FC13D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyDBClusterDeletionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBClusterDeletionResponseBody self = new ModifyDBClusterDeletionResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyDBClusterDeletionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
