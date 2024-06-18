// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class TransformDBInstancePayTypeResponseBody extends TeaModel {
    /**
     * <p>The payment type.</p>
     * <ul>
     * <li>Valid value if the new billing method is pay-as-you-go: POSTPAY</li>
     * <li>Valid value if the new billing method is subscription: PREPAY</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Prepaid</p>
     */
    @NameInMap("ChargeType")
    public String chargeType;

    /**
     * <p>The instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-uf6wjk5xxxxxx</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The expiration time.</p>
     * <blockquote>
     * <p>If you call this operation to change the billing method of an instance from subscription to pay-as-you-go, this parameter is not returned.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2020-04-20T10:00:00Z</p>
     */
    @NameInMap("ExpiredTime")
    public String expiredTime;

    /**
     * <p>The order ID.</p>
     * 
     * <strong>example:</strong>
     * <p>205157600280623</p>
     */
    @NameInMap("OrderId")
    public Long orderId;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>5E6E09DE-5B12-4BFF-A55E-1C86EDE06D9A</p>
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
