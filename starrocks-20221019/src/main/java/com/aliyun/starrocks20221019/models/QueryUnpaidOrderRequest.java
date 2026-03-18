// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starrocks20221019.models;

import com.aliyun.tea.*;

public class QueryUnpaidOrderRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ng-12zxs328sha2</p>
     */
    @NameInMap("BillingInstanceId")
    public String billingInstanceId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>c-b25e21e24388****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
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
