// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyDBClusterResponseBody extends TeaModel {
    @NameInMap("DBClusterId")
    public String DBClusterId;

    @NameInMap("OrderId")
    public String orderId;

    @NameInMap("RequestId")
    public String requestId;

    public static ModifyDBClusterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBClusterResponseBody self = new ModifyDBClusterResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyDBClusterResponseBody setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public ModifyDBClusterResponseBody setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public ModifyDBClusterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
