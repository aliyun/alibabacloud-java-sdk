// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starrocks20221019.models;

import com.aliyun.tea.*;

public class QueryRefundPriceRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>ng-1syeu23,ng-81293sa</p>
     */
    @NameInMap("billingInstanceIds")
    public String billingInstanceIds;

    /**
     * <strong>example:</strong>
     * <p>c-82su12s0kl12</p>
     */
    @NameInMap("instanceId")
    public String instanceId;

    public static QueryRefundPriceRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryRefundPriceRequest self = new QueryRefundPriceRequest();
        return TeaModel.build(map, self);
    }

    public QueryRefundPriceRequest setBillingInstanceIds(String billingInstanceIds) {
        this.billingInstanceIds = billingInstanceIds;
        return this;
    }
    public String getBillingInstanceIds() {
        return this.billingInstanceIds;
    }

    public QueryRefundPriceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
