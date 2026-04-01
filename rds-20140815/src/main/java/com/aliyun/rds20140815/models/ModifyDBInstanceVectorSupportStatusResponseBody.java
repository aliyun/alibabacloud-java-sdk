// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyDBInstanceVectorSupportStatusResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>16C62438-491B-5C02-9B49-BA924A1372A2</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyDBInstanceVectorSupportStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBInstanceVectorSupportStatusResponseBody self = new ModifyDBInstanceVectorSupportStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyDBInstanceVectorSupportStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
