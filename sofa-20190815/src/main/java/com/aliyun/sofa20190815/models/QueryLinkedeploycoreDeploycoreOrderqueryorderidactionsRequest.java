// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkedeploycoreDeploycoreOrderqueryorderidactionsRequest extends TeaModel {
    @NameInMap("OrderId")
    public String orderId;

    public static QueryLinkedeploycoreDeploycoreOrderqueryorderidactionsRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkedeploycoreDeploycoreOrderqueryorderidactionsRequest self = new QueryLinkedeploycoreDeploycoreOrderqueryorderidactionsRequest();
        return TeaModel.build(map, self);
    }

    public QueryLinkedeploycoreDeploycoreOrderqueryorderidactionsRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

}
