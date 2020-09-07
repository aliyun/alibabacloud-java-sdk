// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyDBInstanceDescriptionResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static ModifyDBInstanceDescriptionResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBInstanceDescriptionResponse self = new ModifyDBInstanceDescriptionResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDBInstanceDescriptionResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
