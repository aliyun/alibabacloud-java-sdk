// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyDBClusterArchResponseBody extends TeaModel {
    /**
     * <p>The cluster ID.</p>
     * 
     * <strong>example:</strong>
     * <p>pc-**************</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The order ID.</p>
     * 
     * <strong>example:</strong>
     * <p>2148126708*****</p>
     */
    @NameInMap("OrderId")
    public String orderId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>6A2EE5B4-CC9F-46E1-A747-E43BC9******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyDBClusterArchResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBClusterArchResponseBody self = new ModifyDBClusterArchResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyDBClusterArchResponseBody setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public ModifyDBClusterArchResponseBody setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public ModifyDBClusterArchResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
