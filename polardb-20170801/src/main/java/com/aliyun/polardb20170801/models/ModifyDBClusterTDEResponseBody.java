// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyDBClusterTDEResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>5F859238-2A36-4A8D-BD0F-732112******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyDBClusterTDEResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBClusterTDEResponseBody self = new ModifyDBClusterTDEResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyDBClusterTDEResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
