// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyDBInstanceMonitorResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>52B9805C-432C-4ED1-83FD-2F916B6D2733</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyDBInstanceMonitorResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBInstanceMonitorResponseBody self = new ModifyDBInstanceMonitorResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyDBInstanceMonitorResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
