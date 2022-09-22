// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resellertrade20191227.models;

import com.aliyun.tea.*;

public class CreateCouponTemplateRequest extends TeaModel {
    @NameInMap("ActivitySite")
    public Integer activitySite;

    @NameInMap("Bid")
    public Long bid;

    @NameInMap("CertainMoney")
    public Double certainMoney;

    @NameInMap("ClientType")
    public String clientType;

    @NameInMap("CommodityType")
    public String commodityType;

    @NameInMap("ControlType")
    public String controlType;

    @NameInMap("CouponAmount")
    public Double couponAmount;

    @NameInMap("CouponEndTime")
    public String couponEndTime;

    @NameInMap("CouponFixedType")
    public String couponFixedType;

    @NameInMap("CouponStartTime")
    public String couponStartTime;

    @NameInMap("CouponType")
    public String couponType;

    @NameInMap("Currency")
    public CreateCouponTemplateRequestCurrency currency;

    @NameInMap("Description")
    public String description;

    @NameInMap("DiscountRate")
    public Double discountRate;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("ExtendsMap")
    public java.util.Map<String, String> extendsMap;

    @NameInMap("FromApp")
    public String fromApp;

    @NameInMap("ItemCodeSet")
    public java.util.List<String> itemCodeSet;

    @NameInMap("Market")
    public String market;

    @NameInMap("MarketType")
    public Long marketType;

    @NameInMap("MaxRelease")
    public Double maxRelease;

    @NameInMap("MessageId")
    public String messageId;

    @NameInMap("Name")
    public String name;

    @NameInMap("Operator")
    public String operator;

    @NameInMap("OrderTypeSet")
    public java.util.List<String> orderTypeSet;

    @NameInMap("PerLimitNum")
    public Integer perLimitNum;

    @NameInMap("PromotionId")
    public Long promotionId;

    @NameInMap("Reason")
    public String reason;

    @NameInMap("RelativeSecond")
    public Integer relativeSecond;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SelectionIdSet")
    public java.util.List<String> selectionIdSet;

    @NameInMap("SellerId")
    public Long sellerId;

    @NameInMap("Site")
    public String site;

    @NameInMap("SpId")
    public Long spId;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("Type")
    public String type;

    @NameInMap("UniversalType")
    public String universalType;

    @NameInMap("UpperLimit")
    public Double upperLimit;

    @NameInMap("UsageCount")
    public Integer usageCount;

    @NameInMap("UseScene")
    public String useScene;

    @NameInMap("UserPkAmount")
    public String userPkAmount;

    @NameInMap("ValidityType")
    public String validityType;

    public static CreateCouponTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCouponTemplateRequest self = new CreateCouponTemplateRequest();
        return TeaModel.build(map, self);
    }

    public CreateCouponTemplateRequest setActivitySite(Integer activitySite) {
        this.activitySite = activitySite;
        return this;
    }
    public Integer getActivitySite() {
        return this.activitySite;
    }

    public CreateCouponTemplateRequest setBid(Long bid) {
        this.bid = bid;
        return this;
    }
    public Long getBid() {
        return this.bid;
    }

    public CreateCouponTemplateRequest setCertainMoney(Double certainMoney) {
        this.certainMoney = certainMoney;
        return this;
    }
    public Double getCertainMoney() {
        return this.certainMoney;
    }

    public CreateCouponTemplateRequest setClientType(String clientType) {
        this.clientType = clientType;
        return this;
    }
    public String getClientType() {
        return this.clientType;
    }

    public CreateCouponTemplateRequest setCommodityType(String commodityType) {
        this.commodityType = commodityType;
        return this;
    }
    public String getCommodityType() {
        return this.commodityType;
    }

    public CreateCouponTemplateRequest setControlType(String controlType) {
        this.controlType = controlType;
        return this;
    }
    public String getControlType() {
        return this.controlType;
    }

    public CreateCouponTemplateRequest setCouponAmount(Double couponAmount) {
        this.couponAmount = couponAmount;
        return this;
    }
    public Double getCouponAmount() {
        return this.couponAmount;
    }

    public CreateCouponTemplateRequest setCouponEndTime(String couponEndTime) {
        this.couponEndTime = couponEndTime;
        return this;
    }
    public String getCouponEndTime() {
        return this.couponEndTime;
    }

    public CreateCouponTemplateRequest setCouponFixedType(String couponFixedType) {
        this.couponFixedType = couponFixedType;
        return this;
    }
    public String getCouponFixedType() {
        return this.couponFixedType;
    }

    public CreateCouponTemplateRequest setCouponStartTime(String couponStartTime) {
        this.couponStartTime = couponStartTime;
        return this;
    }
    public String getCouponStartTime() {
        return this.couponStartTime;
    }

    public CreateCouponTemplateRequest setCouponType(String couponType) {
        this.couponType = couponType;
        return this;
    }
    public String getCouponType() {
        return this.couponType;
    }

    public CreateCouponTemplateRequest setCurrency(CreateCouponTemplateRequestCurrency currency) {
        this.currency = currency;
        return this;
    }
    public CreateCouponTemplateRequestCurrency getCurrency() {
        return this.currency;
    }

    public CreateCouponTemplateRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateCouponTemplateRequest setDiscountRate(Double discountRate) {
        this.discountRate = discountRate;
        return this;
    }
    public Double getDiscountRate() {
        return this.discountRate;
    }

    public CreateCouponTemplateRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public CreateCouponTemplateRequest setExtendsMap(java.util.Map<String, String> extendsMap) {
        this.extendsMap = extendsMap;
        return this;
    }
    public java.util.Map<String, String> getExtendsMap() {
        return this.extendsMap;
    }

    public CreateCouponTemplateRequest setFromApp(String fromApp) {
        this.fromApp = fromApp;
        return this;
    }
    public String getFromApp() {
        return this.fromApp;
    }

    public CreateCouponTemplateRequest setItemCodeSet(java.util.List<String> itemCodeSet) {
        this.itemCodeSet = itemCodeSet;
        return this;
    }
    public java.util.List<String> getItemCodeSet() {
        return this.itemCodeSet;
    }

    public CreateCouponTemplateRequest setMarket(String market) {
        this.market = market;
        return this;
    }
    public String getMarket() {
        return this.market;
    }

    public CreateCouponTemplateRequest setMarketType(Long marketType) {
        this.marketType = marketType;
        return this;
    }
    public Long getMarketType() {
        return this.marketType;
    }

    public CreateCouponTemplateRequest setMaxRelease(Double maxRelease) {
        this.maxRelease = maxRelease;
        return this;
    }
    public Double getMaxRelease() {
        return this.maxRelease;
    }

    public CreateCouponTemplateRequest setMessageId(String messageId) {
        this.messageId = messageId;
        return this;
    }
    public String getMessageId() {
        return this.messageId;
    }

    public CreateCouponTemplateRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateCouponTemplateRequest setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public CreateCouponTemplateRequest setOrderTypeSet(java.util.List<String> orderTypeSet) {
        this.orderTypeSet = orderTypeSet;
        return this;
    }
    public java.util.List<String> getOrderTypeSet() {
        return this.orderTypeSet;
    }

    public CreateCouponTemplateRequest setPerLimitNum(Integer perLimitNum) {
        this.perLimitNum = perLimitNum;
        return this;
    }
    public Integer getPerLimitNum() {
        return this.perLimitNum;
    }

    public CreateCouponTemplateRequest setPromotionId(Long promotionId) {
        this.promotionId = promotionId;
        return this;
    }
    public Long getPromotionId() {
        return this.promotionId;
    }

    public CreateCouponTemplateRequest setReason(String reason) {
        this.reason = reason;
        return this;
    }
    public String getReason() {
        return this.reason;
    }

    public CreateCouponTemplateRequest setRelativeSecond(Integer relativeSecond) {
        this.relativeSecond = relativeSecond;
        return this;
    }
    public Integer getRelativeSecond() {
        return this.relativeSecond;
    }

    public CreateCouponTemplateRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateCouponTemplateRequest setSelectionIdSet(java.util.List<String> selectionIdSet) {
        this.selectionIdSet = selectionIdSet;
        return this;
    }
    public java.util.List<String> getSelectionIdSet() {
        return this.selectionIdSet;
    }

    public CreateCouponTemplateRequest setSellerId(Long sellerId) {
        this.sellerId = sellerId;
        return this;
    }
    public Long getSellerId() {
        return this.sellerId;
    }

    public CreateCouponTemplateRequest setSite(String site) {
        this.site = site;
        return this;
    }
    public String getSite() {
        return this.site;
    }

    public CreateCouponTemplateRequest setSpId(Long spId) {
        this.spId = spId;
        return this;
    }
    public Long getSpId() {
        return this.spId;
    }

    public CreateCouponTemplateRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public CreateCouponTemplateRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public CreateCouponTemplateRequest setUniversalType(String universalType) {
        this.universalType = universalType;
        return this;
    }
    public String getUniversalType() {
        return this.universalType;
    }

    public CreateCouponTemplateRequest setUpperLimit(Double upperLimit) {
        this.upperLimit = upperLimit;
        return this;
    }
    public Double getUpperLimit() {
        return this.upperLimit;
    }

    public CreateCouponTemplateRequest setUsageCount(Integer usageCount) {
        this.usageCount = usageCount;
        return this;
    }
    public Integer getUsageCount() {
        return this.usageCount;
    }

    public CreateCouponTemplateRequest setUseScene(String useScene) {
        this.useScene = useScene;
        return this;
    }
    public String getUseScene() {
        return this.useScene;
    }

    public CreateCouponTemplateRequest setUserPkAmount(String userPkAmount) {
        this.userPkAmount = userPkAmount;
        return this;
    }
    public String getUserPkAmount() {
        return this.userPkAmount;
    }

    public CreateCouponTemplateRequest setValidityType(String validityType) {
        this.validityType = validityType;
        return this;
    }
    public String getValidityType() {
        return this.validityType;
    }

    public static class CreateCouponTemplateRequestCurrency extends TeaModel {
        @NameInMap("CurrencyCode")
        public String currencyCode;

        @NameInMap("DefaultFractionDigits")
        public Integer defaultFractionDigits;

        @NameInMap("NumericCode")
        public Integer numericCode;

        public static CreateCouponTemplateRequestCurrency build(java.util.Map<String, ?> map) throws Exception {
            CreateCouponTemplateRequestCurrency self = new CreateCouponTemplateRequestCurrency();
            return TeaModel.build(map, self);
        }

        public CreateCouponTemplateRequestCurrency setCurrencyCode(String currencyCode) {
            this.currencyCode = currencyCode;
            return this;
        }
        public String getCurrencyCode() {
            return this.currencyCode;
        }

        public CreateCouponTemplateRequestCurrency setDefaultFractionDigits(Integer defaultFractionDigits) {
            this.defaultFractionDigits = defaultFractionDigits;
            return this;
        }
        public Integer getDefaultFractionDigits() {
            return this.defaultFractionDigits;
        }

        public CreateCouponTemplateRequestCurrency setNumericCode(Integer numericCode) {
            this.numericCode = numericCode;
            return this;
        }
        public Integer getNumericCode() {
            return this.numericCode;
        }

    }

}
