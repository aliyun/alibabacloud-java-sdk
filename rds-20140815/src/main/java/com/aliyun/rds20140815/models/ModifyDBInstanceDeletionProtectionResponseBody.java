// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyDBInstanceDeletionProtectionResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyDBInstanceDeletionProtectionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBInstanceDeletionProtectionResponseBody self = new ModifyDBInstanceDeletionProtectionResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyDBInstanceDeletionProtectionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
