// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class QueryOrderPriceResponseBody extends TeaModel {
    @NameInMap("discount_price")
    public Double discountPrice;

    @NameInMap("original_price")
    public Double originalPrice;

    @NameInMap("trade_price")
    public Double tradePrice;

    public static QueryOrderPriceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryOrderPriceResponseBody self = new QueryOrderPriceResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryOrderPriceResponseBody setDiscountPrice(Double discountPrice) {
        this.discountPrice = discountPrice;
        return this;
    }
    public Double getDiscountPrice() {
        return this.discountPrice;
    }

    public QueryOrderPriceResponseBody setOriginalPrice(Double originalPrice) {
        this.originalPrice = originalPrice;
        return this;
    }
    public Double getOriginalPrice() {
        return this.originalPrice;
    }

    public QueryOrderPriceResponseBody setTradePrice(Double tradePrice) {
        this.tradePrice = tradePrice;
        return this;
    }
    public Double getTradePrice() {
        return this.tradePrice;
    }

}
