// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyDBInstanceHAConfigResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>D4D4BE8A-DD46-440A-BFCD-EE31DA81C9DD</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyDBInstanceHAConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBInstanceHAConfigResponseBody self = new ModifyDBInstanceHAConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyDBInstanceHAConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
