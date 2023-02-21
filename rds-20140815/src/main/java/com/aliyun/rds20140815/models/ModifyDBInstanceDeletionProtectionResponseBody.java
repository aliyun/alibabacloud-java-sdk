// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyDBInstanceDeletionProtectionResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
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
