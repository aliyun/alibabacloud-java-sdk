// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyDBInstanceHAConfigResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static ModifyDBInstanceHAConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBInstanceHAConfigResponse self = new ModifyDBInstanceHAConfigResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDBInstanceHAConfigResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
