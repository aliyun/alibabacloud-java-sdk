// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyDBClusterResourceGroupResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>70656639-1416-479F-AF13-D08197******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyDBClusterResourceGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBClusterResourceGroupResponseBody self = new ModifyDBClusterResourceGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyDBClusterResourceGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
