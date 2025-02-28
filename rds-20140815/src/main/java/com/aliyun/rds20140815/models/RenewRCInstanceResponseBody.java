// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class RenewRCInstanceResponseBody extends TeaModel {
    /**
     * <p>The ID of the RDS Custom instance.</p>
     * 
     * <strong>example:</strong>
     * <p>rc-dh2jf9n6j4s14926****</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    @NameInMap("OrderId")
    public String orderId;

    /**
     * <p>The order ID.</p>
     * 
     * <strong>example:</strong>
     * <p>23202700556****</p>
     */
    @NameInMap("OrderIds")
    public String orderIds;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>EFFC7565-B3CF-5CFA-9E1F-164DD1E1F498</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RenewRCInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RenewRCInstanceResponseBody self = new RenewRCInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public RenewRCInstanceResponseBody setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public RenewRCInstanceResponseBody setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public RenewRCInstanceResponseBody setOrderIds(String orderIds) {
        this.orderIds = orderIds;
        return this;
    }
    public String getOrderIds() {
        return this.orderIds;
    }

    public RenewRCInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
