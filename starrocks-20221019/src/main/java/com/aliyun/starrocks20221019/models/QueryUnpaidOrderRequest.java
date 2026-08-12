// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starrocks20221019.models;

import com.aliyun.tea.*;

public class QueryUnpaidOrderRequest extends TeaModel {
    /**
     * <p>The ID of the instance that is associated with the bill. For the default compute group, which includes the FE compute group and the default BE compute group, this parameter is the instance ID. For other compute groups, this parameter is the compute group ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ng-12zxs328sha2</p>
     */
    @NameInMap("BillingInstanceId")
    public String billingInstanceId;

    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>c-b25e21e24388****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>Order type</p>
     * 
     * <strong>example:</strong>
     * <p>BUY</p>
     */
    @NameInMap("OrderType")
    public String orderType;

    public static QueryUnpaidOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryUnpaidOrderRequest self = new QueryUnpaidOrderRequest();
        return TeaModel.build(map, self);
    }

    public QueryUnpaidOrderRequest setBillingInstanceId(String billingInstanceId) {
        this.billingInstanceId = billingInstanceId;
        return this;
    }
    public String getBillingInstanceId() {
        return this.billingInstanceId;
    }

    public QueryUnpaidOrderRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public QueryUnpaidOrderRequest setOrderType(String orderType) {
        this.orderType = orderType;
        return this;
    }
    public String getOrderType() {
        return this.orderType;
    }

}
