// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyDBClusterMaintainTimeResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>70656639-1416-479F-AF13-D08197******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyDBClusterMaintainTimeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBClusterMaintainTimeResponseBody self = new ModifyDBClusterMaintainTimeResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyDBClusterMaintainTimeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
