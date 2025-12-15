// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class ModifyDBInstanceMonitorResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>2BE6E619-A657-42E3-AD2D-18F8428A****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyDBInstanceMonitorResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBInstanceMonitorResponseBody self = new ModifyDBInstanceMonitorResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyDBInstanceMonitorResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
