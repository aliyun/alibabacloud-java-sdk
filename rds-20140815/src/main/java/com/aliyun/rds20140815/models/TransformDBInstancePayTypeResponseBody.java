// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class TransformDBInstancePayTypeResponseBody extends TeaModel {
    /**
     * <p>The billing method.</p>
     */
    @NameInMap("ChargeType")
    public String chargeType;

    /**
     * <p>The ID of the instance.</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The expiration time.</p>
     * <br>
     * <p>> If you call this operation to change the billing method of an instance from subscription to pay-as-you-go, this parameter is not returned.</p>
     */
    @NameInMap("ExpiredTime")
    public String expiredTime;

    /**
     * <p>The ID of the order.</p>
     */
    @NameInMap("OrderId")
    public Long orderId;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static TransformDBInstancePayTypeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TransformDBInstancePayTypeResponseBody self = new TransformDBInstancePayTypeResponseBody();
        return TeaModel.build(map, self);
    }

    public TransformDBInstancePayTypeResponseBody setChargeType(String chargeType) {
        this.chargeType = chargeType;
        return this;
    }
    public String getChargeType() {
        return this.chargeType;
    }

    public TransformDBInstancePayTypeResponseBody setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public TransformDBInstancePayTypeResponseBody setExpiredTime(String expiredTime) {
        this.expiredTime = expiredTime;
        return this;
    }
    public String getExpiredTime() {
        return this.expiredTime;
    }

    public TransformDBInstancePayTypeResponseBody setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }
    public Long getOrderId() {
        return this.orderId;
    }

    public TransformDBInstancePayTypeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
