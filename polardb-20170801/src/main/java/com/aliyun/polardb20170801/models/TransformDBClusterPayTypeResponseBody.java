// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class TransformDBClusterPayTypeResponseBody extends TeaModel {
    @NameInMap("ChargeType")
    public String chargeType;

    @NameInMap("DBClusterId")
    public String DBClusterId;

    @NameInMap("ExpiredTime")
    public String expiredTime;

    @NameInMap("OrderId")
    public String orderId;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static TransformDBClusterPayTypeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TransformDBClusterPayTypeResponseBody self = new TransformDBClusterPayTypeResponseBody();
        return TeaModel.build(map, self);
    }

    public TransformDBClusterPayTypeResponseBody setChargeType(String chargeType) {
        this.chargeType = chargeType;
        return this;
    }
    public String getChargeType() {
        return this.chargeType;
    }

    public TransformDBClusterPayTypeResponseBody setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public TransformDBClusterPayTypeResponseBody setExpiredTime(String expiredTime) {
        this.expiredTime = expiredTime;
        return this;
    }
    public String getExpiredTime() {
        return this.expiredTime;
    }

    public TransformDBClusterPayTypeResponseBody setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public TransformDBClusterPayTypeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
