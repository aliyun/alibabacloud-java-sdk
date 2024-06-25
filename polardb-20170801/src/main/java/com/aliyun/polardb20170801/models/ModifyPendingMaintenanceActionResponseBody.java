// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyPendingMaintenanceActionResponseBody extends TeaModel {
    /**
     * <p>The ID of the task.</p>
     * 
     * <strong>example:</strong>
     * <p>111111</p>
     */
    @NameInMap("Ids")
    public String ids;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>93061E17-B56A-4324-BC95-D0FFD2******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyPendingMaintenanceActionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyPendingMaintenanceActionResponseBody self = new ModifyPendingMaintenanceActionResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyPendingMaintenanceActionResponseBody setIds(String ids) {
        this.ids = ids;
        return this;
    }
    public String getIds() {
        return this.ids;
    }

    public ModifyPendingMaintenanceActionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
