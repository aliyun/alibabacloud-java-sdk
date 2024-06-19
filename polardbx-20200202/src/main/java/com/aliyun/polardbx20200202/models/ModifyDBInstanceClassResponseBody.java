// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class ModifyDBInstanceClassResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>20211103105558</p>
     */
    @NameInMap("OrderId")
    public String orderId;

    /**
     * <strong>example:</strong>
     * <p>FEA5DC20-6D8A-5979-97AA-FC57546ADC20</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyDBInstanceClassResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBInstanceClassResponseBody self = new ModifyDBInstanceClassResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyDBInstanceClassResponseBody setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public ModifyDBInstanceClassResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
