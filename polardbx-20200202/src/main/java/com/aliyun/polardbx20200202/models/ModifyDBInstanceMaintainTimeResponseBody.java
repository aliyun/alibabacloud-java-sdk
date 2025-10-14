// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class ModifyDBInstanceMaintainTimeResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>73559800-3c8c-11ec-bd40-99cfcff3fe1e</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyDBInstanceMaintainTimeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBInstanceMaintainTimeResponseBody self = new ModifyDBInstanceMaintainTimeResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyDBInstanceMaintainTimeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
