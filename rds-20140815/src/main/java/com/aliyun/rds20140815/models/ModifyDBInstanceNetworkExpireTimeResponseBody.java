// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyDBInstanceNetworkExpireTimeResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyDBInstanceNetworkExpireTimeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBInstanceNetworkExpireTimeResponseBody self = new ModifyDBInstanceNetworkExpireTimeResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyDBInstanceNetworkExpireTimeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
