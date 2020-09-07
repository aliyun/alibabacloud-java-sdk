// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyDBInstanceConnectionStringResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static ModifyDBInstanceConnectionStringResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBInstanceConnectionStringResponse self = new ModifyDBInstanceConnectionStringResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDBInstanceConnectionStringResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
