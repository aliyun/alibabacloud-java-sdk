// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.partnerintl20181227.models;

import com.aliyun.tea.*;

public class QueryCommodityInfoRequest extends TeaModel {
    @NameInMap("CommodityCode")
    public String commodityCode;

    public static QueryCommodityInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryCommodityInfoRequest self = new QueryCommodityInfoRequest();
        return TeaModel.build(map, self);
    }

    public QueryCommodityInfoRequest setCommodityCode(String commodityCode) {
        this.commodityCode = commodityCode;
        return this;
    }
    public String getCommodityCode() {
        return this.commodityCode;
    }

}
