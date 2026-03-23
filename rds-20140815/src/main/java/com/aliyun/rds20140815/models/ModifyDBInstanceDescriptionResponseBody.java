// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyDBInstanceDescriptionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyDBInstanceDescriptionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBInstanceDescriptionResponseBody self = new ModifyDBInstanceDescriptionResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyDBInstanceDescriptionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
