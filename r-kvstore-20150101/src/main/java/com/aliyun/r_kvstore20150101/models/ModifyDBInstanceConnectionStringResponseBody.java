// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class ModifyDBInstanceConnectionStringResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>1790D68A-465C-44E3-BC24-9732652961F9</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyDBInstanceConnectionStringResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBInstanceConnectionStringResponseBody self = new ModifyDBInstanceConnectionStringResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyDBInstanceConnectionStringResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
