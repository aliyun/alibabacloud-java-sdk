// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyDBInstancePayTypeResponse extends TeaModel {
    @NameInMap("OrderId")
    @Validation(required = true)
    public Long orderId;

    public static ModifyDBInstancePayTypeResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBInstancePayTypeResponse self = new ModifyDBInstancePayTypeResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDBInstancePayTypeResponse setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }
    public Long getOrderId() {
        return this.orderId;
    }

}
