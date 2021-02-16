// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyPendingMaintenanceActionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Ids")
    public String ids;

    public static ModifyPendingMaintenanceActionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyPendingMaintenanceActionResponseBody self = new ModifyPendingMaintenanceActionResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyPendingMaintenanceActionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyPendingMaintenanceActionResponseBody setIds(String ids) {
        this.ids = ids;
        return this;
    }
    public String getIds() {
        return this.ids;
    }

}
