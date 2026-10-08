// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class TransformDBInstancePayTypeResponseBody extends TeaModel {
    /**
     * <p>The billing method. Valid values:</p>
     * <ul>
     * <li>POSTPAY: pay-as-you-go</li>
     * <li>PREPAY: subscription</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>POSTPAY</p>
     */
    @NameInMap("ChargeType")
    public String chargeType;

    /**
     * <p>The instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-uf6wjk5****</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The expiration time.</p>
     * <blockquote>
     * <p>This parameter is not returned if the billing method is changed to pay-as-you-go.</p>
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
     * <p>20515760028****</p>
     */
    @NameInMap("OrderId")
    public Long orderId;

    /**
     * <p>The request ID.</p>
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
