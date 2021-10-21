// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class QueryTrademarkPriceResponseBody extends TeaModel {
    @NameInMap("OriginalPrice")
    public Float originalPrice;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("DiscountPrice")
    public Float discountPrice;

    @NameInMap("Currency")
    public String currency;

    @NameInMap("TradePrice")
    public Float tradePrice;

    @NameInMap("Prices")
    public QueryTrademarkPriceResponseBodyPrices prices;

    public static QueryTrademarkPriceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryTrademarkPriceResponseBody self = new QueryTrademarkPriceResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryTrademarkPriceResponseBody setOriginalPrice(Float originalPrice) {
        this.originalPrice = originalPrice;
        return this;
    }
    public Float getOriginalPrice() {
        return this.originalPrice;
    }

    public QueryTrademarkPriceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryTrademarkPriceResponseBody setDiscountPrice(Float discountPrice) {
        this.discountPrice = discountPrice;
        return this;
    }
    public Float getDiscountPrice() {
        return this.discountPrice;
    }

    public QueryTrademarkPriceResponseBody setCurrency(String currency) {
        this.currency = currency;
        return this;
    }
    public String getCurrency() {
        return this.currency;
    }

    public QueryTrademarkPriceResponseBody setTradePrice(Float tradePrice) {
        this.tradePrice = tradePrice;
        return this;
    }
    public Float getTradePrice() {
        return this.tradePrice;
    }

    public QueryTrademarkPriceResponseBody setPrices(QueryTrademarkPriceResponseBodyPrices prices) {
        this.prices = prices;
        return this;
    }
    public QueryTrademarkPriceResponseBodyPrices getPrices() {
        return this.prices;
    }

    public static class QueryTrademarkPriceResponseBodyPricesPrices extends TeaModel {
        @NameInMap("OriginalPrice")
        public Float originalPrice;

        @NameInMap("DiscountPrice")
        public Float discountPrice;

        @NameInMap("Currency")
        public String currency;

        @NameInMap("TradePrice")
        public Float tradePrice;

        @NameInMap("ClassificationCode")
        public String classificationCode;

        public static QueryTrademarkPriceResponseBodyPricesPrices build(java.util.Map<String, ?> map) throws Exception {
            QueryTrademarkPriceResponseBodyPricesPrices self = new QueryTrademarkPriceResponseBodyPricesPrices();
            return TeaModel.build(map, self);
        }

        public QueryTrademarkPriceResponseBodyPricesPrices setOriginalPrice(Float originalPrice) {
            this.originalPrice = originalPrice;
            return this;
        }
        public Float getOriginalPrice() {
            return this.originalPrice;
        }

        public QueryTrademarkPriceResponseBodyPricesPrices setDiscountPrice(Float discountPrice) {
            this.discountPrice = discountPrice;
            return this;
        }
        public Float getDiscountPrice() {
            return this.discountPrice;
        }

        public QueryTrademarkPriceResponseBodyPricesPrices setCurrency(String currency) {
            this.currency = currency;
            return this;
        }
        public String getCurrency() {
            return this.currency;
        }

        public QueryTrademarkPriceResponseBodyPricesPrices setTradePrice(Float tradePrice) {
            this.tradePrice = tradePrice;
            return this;
        }
        public Float getTradePrice() {
            return this.tradePrice;
        }

        public QueryTrademarkPriceResponseBodyPricesPrices setClassificationCode(String classificationCode) {
            this.classificationCode = classificationCode;
            return this;
        }
        public String getClassificationCode() {
            return this.classificationCode;
        }

    }

    public static class QueryTrademarkPriceResponseBodyPrices extends TeaModel {
        @NameInMap("Prices")
        public java.util.List<QueryTrademarkPriceResponseBodyPricesPrices> prices;

        public static QueryTrademarkPriceResponseBodyPrices build(java.util.Map<String, ?> map) throws Exception {
            QueryTrademarkPriceResponseBodyPrices self = new QueryTrademarkPriceResponseBodyPrices();
            return TeaModel.build(map, self);
        }

        public QueryTrademarkPriceResponseBodyPrices setPrices(java.util.List<QueryTrademarkPriceResponseBodyPricesPrices> prices) {
            this.prices = prices;
            return this;
        }
        public java.util.List<QueryTrademarkPriceResponseBodyPricesPrices> getPrices() {
            return this.prices;
        }

    }

}
