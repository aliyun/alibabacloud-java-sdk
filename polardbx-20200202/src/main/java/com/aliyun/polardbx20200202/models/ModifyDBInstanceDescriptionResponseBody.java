// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class ModifyDBInstanceDescriptionResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>FEA5DC20-6D8A-5979-97AA-FC57546ADC20</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyDBInstanceDescriptionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBInstanceDescriptionResponseBody self = new ModifyDBInstanceDescriptionResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyDBInstanceDescriptionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
