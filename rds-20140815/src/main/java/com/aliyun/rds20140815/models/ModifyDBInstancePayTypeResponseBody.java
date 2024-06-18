// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyDBInstancePayTypeResponseBody extends TeaModel {
    /**
     * <p>The order ID.</p>
     * 
     * <strong>example:</strong>
     * <p>100789370230206</p>
     */
    @NameInMap("OrderId")
    public Long orderId;

    public static ModifyDBInstancePayTypeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBInstancePayTypeResponseBody self = new ModifyDBInstancePayTypeResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyDBInstancePayTypeResponseBody setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }
    public Long getOrderId() {
        return this.orderId;
    }

}
