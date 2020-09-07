// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyDBInstanceConnectionModeResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static ModifyDBInstanceConnectionModeResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBInstanceConnectionModeResponse self = new ModifyDBInstanceConnectionModeResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDBInstanceConnectionModeResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
