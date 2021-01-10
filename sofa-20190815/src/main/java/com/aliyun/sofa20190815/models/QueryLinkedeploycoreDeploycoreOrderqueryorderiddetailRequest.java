// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkedeploycoreDeploycoreOrderqueryorderiddetailRequest extends TeaModel {
    @NameInMap("OrderId")
    public String orderId;

    public static QueryLinkedeploycoreDeploycoreOrderqueryorderiddetailRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkedeploycoreDeploycoreOrderqueryorderiddetailRequest self = new QueryLinkedeploycoreDeploycoreOrderqueryorderiddetailRequest();
        return TeaModel.build(map, self);
    }

    public QueryLinkedeploycoreDeploycoreOrderqueryorderiddetailRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

}
