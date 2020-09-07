// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyDBInstanceSpecResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static ModifyDBInstanceSpecResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBInstanceSpecResponse self = new ModifyDBInstanceSpecResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDBInstanceSpecResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
