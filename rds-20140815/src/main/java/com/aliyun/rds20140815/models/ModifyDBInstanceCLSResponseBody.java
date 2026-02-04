// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyDBInstanceCLSResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>2144F5CC-10C5-3B72-8C74-E5***********</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyDBInstanceCLSResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBInstanceCLSResponseBody self = new ModifyDBInstanceCLSResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyDBInstanceCLSResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
