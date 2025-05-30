// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yunjian20211217.models;

import com.aliyun.tea.*;

public class QueryDeliveredSupplyItemsRequest extends TeaModel {
    @NameInMap("accountId")
    public String accountId;

    @NameInMap("commodityTypeCode")
    public String commodityTypeCode;

    public static QueryDeliveredSupplyItemsRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDeliveredSupplyItemsRequest self = new QueryDeliveredSupplyItemsRequest();
        return TeaModel.build(map, self);
    }

    public QueryDeliveredSupplyItemsRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public QueryDeliveredSupplyItemsRequest setCommodityTypeCode(String commodityTypeCode) {
        this.commodityTypeCode = commodityTypeCode;
        return this;
    }
    public String getCommodityTypeCode() {
        return this.commodityTypeCode;
    }

}
