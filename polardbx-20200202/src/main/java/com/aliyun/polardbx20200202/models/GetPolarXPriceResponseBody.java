// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class GetPolarXPriceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("OrderPriceList")
    public java.util.List<GetPolarXPriceResponseBodyOrderPriceList> orderPriceList;

    public static GetPolarXPriceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetPolarXPriceResponseBody self = new GetPolarXPriceResponseBody();
        return TeaModel.build(map, self);
    }

    public GetPolarXPriceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetPolarXPriceResponseBody setOrderPriceList(java.util.List<GetPolarXPriceResponseBodyOrderPriceList> orderPriceList) {
        this.orderPriceList = orderPriceList;
        return this;
    }
    public java.util.List<GetPolarXPriceResponseBodyOrderPriceList> getOrderPriceList() {
        return this.orderPriceList;
    }

    public static class GetPolarXPriceResponseBodyOrderPriceListRules extends TeaModel {
        @NameInMap("RuleDescId")
        public Long ruleDescId;

        @NameInMap("Title")
        public String title;

        @NameInMap("Name")
        public String name;

        public static GetPolarXPriceResponseBodyOrderPriceListRules build(java.util.Map<String, ?> map) throws Exception {
            GetPolarXPriceResponseBodyOrderPriceListRules self = new GetPolarXPriceResponseBodyOrderPriceListRules();
            return TeaModel.build(map, self);
        }

        public GetPolarXPriceResponseBodyOrderPriceListRules setRuleDescId(Long ruleDescId) {
            this.ruleDescId = ruleDescId;
            return this;
        }
        public Long getRuleDescId() {
            return this.ruleDescId;
        }

        public GetPolarXPriceResponseBodyOrderPriceListRules setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public GetPolarXPriceResponseBodyOrderPriceListRules setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class GetPolarXPriceResponseBodyOrderPriceList extends TeaModel {
        @NameInMap("DBInstanceName")
        public String DBInstanceName;

        @NameInMap("OriginalAmount")
        public String originalAmount;

        @NameInMap("DiscountAmount")
        public String discountAmount;

        @NameInMap("TradeAmount")
        public String tradeAmount;

        @NameInMap("PayType")
        public String payType;

        @NameInMap("TotalCostAmount")
        public String totalCostAmount;

        @NameInMap("Rules")
        public java.util.List<GetPolarXPriceResponseBodyOrderPriceListRules> rules;

        public static GetPolarXPriceResponseBodyOrderPriceList build(java.util.Map<String, ?> map) throws Exception {
            GetPolarXPriceResponseBodyOrderPriceList self = new GetPolarXPriceResponseBodyOrderPriceList();
            return TeaModel.build(map, self);
        }

        public GetPolarXPriceResponseBodyOrderPriceList setDBInstanceName(String DBInstanceName) {
            this.DBInstanceName = DBInstanceName;
            return this;
        }
        public String getDBInstanceName() {
            return this.DBInstanceName;
        }

        public GetPolarXPriceResponseBodyOrderPriceList setOriginalAmount(String originalAmount) {
            this.originalAmount = originalAmount;
            return this;
        }
        public String getOriginalAmount() {
            return this.originalAmount;
        }

        public GetPolarXPriceResponseBodyOrderPriceList setDiscountAmount(String discountAmount) {
            this.discountAmount = discountAmount;
            return this;
        }
        public String getDiscountAmount() {
            return this.discountAmount;
        }

        public GetPolarXPriceResponseBodyOrderPriceList setTradeAmount(String tradeAmount) {
            this.tradeAmount = tradeAmount;
            return this;
        }
        public String getTradeAmount() {
            return this.tradeAmount;
        }

        public GetPolarXPriceResponseBodyOrderPriceList setPayType(String payType) {
            this.payType = payType;
            return this;
        }
        public String getPayType() {
            return this.payType;
        }

        public GetPolarXPriceResponseBodyOrderPriceList setTotalCostAmount(String totalCostAmount) {
            this.totalCostAmount = totalCostAmount;
            return this;
        }
        public String getTotalCostAmount() {
            return this.totalCostAmount;
        }

        public GetPolarXPriceResponseBodyOrderPriceList setRules(java.util.List<GetPolarXPriceResponseBodyOrderPriceListRules> rules) {
            this.rules = rules;
            return this;
        }
        public java.util.List<GetPolarXPriceResponseBodyOrderPriceListRules> getRules() {
            return this.rules;
        }

    }

}
