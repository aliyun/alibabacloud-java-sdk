// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyDBClusterPrimaryZoneResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>ED12C6FF-3261-4571-AB57-3570F6******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyDBClusterPrimaryZoneResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBClusterPrimaryZoneResponseBody self = new ModifyDBClusterPrimaryZoneResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyDBClusterPrimaryZoneResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
