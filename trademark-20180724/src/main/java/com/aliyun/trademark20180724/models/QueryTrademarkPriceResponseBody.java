// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class QueryTrademarkPriceResponseBody extends TeaModel {
    @NameInMap("Currency")
    public String currency;

    @NameInMap("DiscountPrice")
    public Float discountPrice;

    @NameInMap("OriginalPrice")
    public Float originalPrice;

    @NameInMap("Prices")
    public QueryTrademarkPriceResponseBodyPrices prices;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TradePrice")
    public Float tradePrice;

    public static QueryTrademarkPriceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryTrademarkPriceResponseBody self = new QueryTrademarkPriceResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryTrademarkPriceResponseBody setCurrency(String currency) {
        this.currency = currency;
        return this;
    }
    public String getCurrency() {
        return this.currency;
    }

    public QueryTrademarkPriceResponseBody setDiscountPrice(Float discountPrice) {
        this.discountPrice = discountPrice;
        return this;
    }
    public Float getDiscountPrice() {
        return this.discountPrice;
    }

    public QueryTrademarkPriceResponseBody setOriginalPrice(Float originalPrice) {
        this.originalPrice = originalPrice;
        return this;
    }
    public Float getOriginalPrice() {
        return this.originalPrice;
    }

    public QueryTrademarkPriceResponseBody setPrices(QueryTrademarkPriceResponseBodyPrices prices) {
        this.prices = prices;
        return this;
    }
    public QueryTrademarkPriceResponseBodyPrices getPrices() {
        return this.prices;
    }

    public QueryTrademarkPriceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryTrademarkPriceResponseBody setTradePrice(Float tradePrice) {
        this.tradePrice = tradePrice;
        return this;
    }
    public Float getTradePrice() {
        return this.tradePrice;
    }

    public static class QueryTrademarkPriceResponseBodyPricesPrices extends TeaModel {
        @NameInMap("ClassificationCode")
        public String classificationCode;

        @NameInMap("Currency")
        public String currency;

        @NameInMap("DiscountPrice")
        public Float discountPrice;

        @NameInMap("OriginalPrice")
        public Float originalPrice;

        @NameInMap("TradePrice")
        public Float tradePrice;

        public static QueryTrademarkPriceResponseBodyPricesPrices build(java.util.Map<String, ?> map) throws Exception {
            QueryTrademarkPriceResponseBodyPricesPrices self = new QueryTrademarkPriceResponseBodyPricesPrices();
            return TeaModel.build(map, self);
        }

        public QueryTrademarkPriceResponseBodyPricesPrices setClassificationCode(String classificationCode) {
            this.classificationCode = classificationCode;
            return this;
        }
        public String getClassificationCode() {
            return this.classificationCode;
        }

        public QueryTrademarkPriceResponseBodyPricesPrices setCurrency(String currency) {
            this.currency = currency;
            return this;
        }
        public String getCurrency() {
            return this.currency;
        }

        public QueryTrademarkPriceResponseBodyPricesPrices setDiscountPrice(Float discountPrice) {
            this.discountPrice = discountPrice;
            return this;
        }
        public Float getDiscountPrice() {
            return this.discountPrice;
        }

        public QueryTrademarkPriceResponseBodyPricesPrices setOriginalPrice(Float originalPrice) {
            this.originalPrice = originalPrice;
            return this;
        }
        public Float getOriginalPrice() {
            return this.originalPrice;
        }

        public QueryTrademarkPriceResponseBodyPricesPrices setTradePrice(Float tradePrice) {
            this.tradePrice = tradePrice;
            return this;
        }
        public Float getTradePrice() {
            return this.tradePrice;
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
