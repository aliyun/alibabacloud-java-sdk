// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyDBInstanceTDEResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>777C4593-8053-427B-99E2-105593277CAB</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyDBInstanceTDEResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBInstanceTDEResponseBody self = new ModifyDBInstanceTDEResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyDBInstanceTDEResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
