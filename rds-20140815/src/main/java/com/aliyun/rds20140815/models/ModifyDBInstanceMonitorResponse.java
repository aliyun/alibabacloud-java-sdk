// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyDBInstanceMonitorResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static ModifyDBInstanceMonitorResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBInstanceMonitorResponse self = new ModifyDBInstanceMonitorResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDBInstanceMonitorResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
