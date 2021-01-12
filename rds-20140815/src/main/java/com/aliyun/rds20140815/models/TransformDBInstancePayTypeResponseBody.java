// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class TransformDBInstancePayTypeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("OrderId")
    public Long orderId;

    @NameInMap("ChargeType")
    public String chargeType;

    @NameInMap("ExpiredTime")
    public String expiredTime;

    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    public static TransformDBInstancePayTypeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TransformDBInstancePayTypeResponseBody self = new TransformDBInstancePayTypeResponseBody();
        return TeaModel.build(map, self);
    }

    public TransformDBInstancePayTypeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public TransformDBInstancePayTypeResponseBody setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }
    public Long getOrderId() {
        return this.orderId;
    }

    public TransformDBInstancePayTypeResponseBody setChargeType(String chargeType) {
        this.chargeType = chargeType;
        return this;
    }
    public String getChargeType() {
        return this.chargeType;
    }

    public TransformDBInstancePayTypeResponseBody setExpiredTime(String expiredTime) {
        this.expiredTime = expiredTime;
        return this;
    }
    public String getExpiredTime() {
        return this.expiredTime;
    }

    public TransformDBInstancePayTypeResponseBody setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

}
