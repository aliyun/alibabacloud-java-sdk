// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyDBInstanceReplicationSwitchResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>9F8C06AD-3F37-57A0-ABBF-ABD7824F55CE</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyDBInstanceReplicationSwitchResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBInstanceReplicationSwitchResponseBody self = new ModifyDBInstanceReplicationSwitchResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyDBInstanceReplicationSwitchResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
