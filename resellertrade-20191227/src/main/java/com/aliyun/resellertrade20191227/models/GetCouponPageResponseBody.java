// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resellertrade20191227.models;

import com.aliyun.tea.*;

public class GetCouponPageResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("ContextMap")
    public java.util.Map<String, ?> contextMap;

    @NameInMap("Count")
    public Integer count;

    @NameInMap("Data")
    public java.util.List<GetCouponPageResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static GetCouponPageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCouponPageResponseBody self = new GetCouponPageResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCouponPageResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetCouponPageResponseBody setContextMap(java.util.Map<String, ?> contextMap) {
        this.contextMap = contextMap;
        return this;
    }
    public java.util.Map<String, ?> getContextMap() {
        return this.contextMap;
    }

    public GetCouponPageResponseBody setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public GetCouponPageResponseBody setData(java.util.List<GetCouponPageResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetCouponPageResponseBodyData> getData() {
        return this.data;
    }

    public GetCouponPageResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetCouponPageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetCouponPageResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetCouponPageResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class GetCouponPageResponseBodyDataCurrency extends TeaModel {
        @NameInMap("CurrencyCode")
        public String currencyCode;

        @NameInMap("DefaultFractionDigits")
        public Integer defaultFractionDigits;

        @NameInMap("NumericCode")
        public Integer numericCode;

        public static GetCouponPageResponseBodyDataCurrency build(java.util.Map<String, ?> map) throws Exception {
            GetCouponPageResponseBodyDataCurrency self = new GetCouponPageResponseBodyDataCurrency();
            return TeaModel.build(map, self);
        }

        public GetCouponPageResponseBodyDataCurrency setCurrencyCode(String currencyCode) {
            this.currencyCode = currencyCode;
            return this;
        }
        public String getCurrencyCode() {
            return this.currencyCode;
        }

        public GetCouponPageResponseBodyDataCurrency setDefaultFractionDigits(Integer defaultFractionDigits) {
            this.defaultFractionDigits = defaultFractionDigits;
            return this;
        }
        public Integer getDefaultFractionDigits() {
            return this.defaultFractionDigits;
        }

        public GetCouponPageResponseBodyDataCurrency setNumericCode(Integer numericCode) {
            this.numericCode = numericCode;
            return this;
        }
        public Integer getNumericCode() {
            return this.numericCode;
        }

    }

    public static class GetCouponPageResponseBodyData extends TeaModel {
        @NameInMap("ActivationId")
        public Long activationId;

        @NameInMap("ActivityId")
        public Long activityId;

        @NameInMap("Amount")
        public Double amount;

        @NameInMap("Bid")
        public Long bid;

        @NameInMap("CertainMoney")
        public Double certainMoney;

        @NameInMap("ClientType")
        public String clientType;

        @NameInMap("CommodityType")
        public String commodityType;

        @NameInMap("CouponId")
        public Long couponId;

        @NameInMap("CouponTileHint")
        public String couponTileHint;

        @NameInMap("CouponTitle")
        public String couponTitle;

        @NameInMap("CouponType")
        public String couponType;

        @NameInMap("Creator")
        public String creator;

        @NameInMap("Currency")
        public GetCouponPageResponseBodyDataCurrency currency;

        @NameInMap("Description")
        public String description;

        @NameInMap("DiscountRate")
        public Double discountRate;

        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("ExtendsMap")
        public java.util.Map<String, String> extendsMap;

        @NameInMap("FrozenAmount")
        public Double frozenAmount;

        @NameInMap("FrozenCount")
        public Integer frozenCount;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("ItemCodeSet")
        public java.util.List<String> itemCodeSet;

        @NameInMap("Market")
        public String market;

        @NameInMap("MarketType")
        public Long marketType;

        @NameInMap("Modifier")
        public String modifier;

        @NameInMap("OrderTypeSet")
        public java.util.List<String> orderTypeSet;

        @NameInMap("PromotionId")
        public Long promotionId;

        @NameInMap("SelectionIds")
        public String selectionIds;

        @NameInMap("SellerId")
        public Long sellerId;

        @NameInMap("Site")
        public String site;

        @NameInMap("SnapId")
        public Long snapId;

        @NameInMap("SpId")
        public Long spId;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("Status")
        public String status;

        @NameInMap("TemplateId")
        public Long templateId;

        @NameInMap("UniversalType")
        public String universalType;

        @NameInMap("UpperLimit")
        public Double upperLimit;

        @NameInMap("UsageCount")
        public Integer usageCount;

        @NameInMap("UsedAmount")
        public Double usedAmount;

        @NameInMap("UsedCount")
        public Integer usedCount;

        @NameInMap("UserId")
        public Long userId;

        public static GetCouponPageResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetCouponPageResponseBodyData self = new GetCouponPageResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetCouponPageResponseBodyData setActivationId(Long activationId) {
            this.activationId = activationId;
            return this;
        }
        public Long getActivationId() {
            return this.activationId;
        }

        public GetCouponPageResponseBodyData setActivityId(Long activityId) {
            this.activityId = activityId;
            return this;
        }
        public Long getActivityId() {
            return this.activityId;
        }

        public GetCouponPageResponseBodyData setAmount(Double amount) {
            this.amount = amount;
            return this;
        }
        public Double getAmount() {
            return this.amount;
        }

        public GetCouponPageResponseBodyData setBid(Long bid) {
            this.bid = bid;
            return this;
        }
        public Long getBid() {
            return this.bid;
        }

        public GetCouponPageResponseBodyData setCertainMoney(Double certainMoney) {
            this.certainMoney = certainMoney;
            return this;
        }
        public Double getCertainMoney() {
            return this.certainMoney;
        }

        public GetCouponPageResponseBodyData setClientType(String clientType) {
            this.clientType = clientType;
            return this;
        }
        public String getClientType() {
            return this.clientType;
        }

        public GetCouponPageResponseBodyData setCommodityType(String commodityType) {
            this.commodityType = commodityType;
            return this;
        }
        public String getCommodityType() {
            return this.commodityType;
        }

        public GetCouponPageResponseBodyData setCouponId(Long couponId) {
            this.couponId = couponId;
            return this;
        }
        public Long getCouponId() {
            return this.couponId;
        }

        public GetCouponPageResponseBodyData setCouponTileHint(String couponTileHint) {
            this.couponTileHint = couponTileHint;
            return this;
        }
        public String getCouponTileHint() {
            return this.couponTileHint;
        }

        public GetCouponPageResponseBodyData setCouponTitle(String couponTitle) {
            this.couponTitle = couponTitle;
            return this;
        }
        public String getCouponTitle() {
            return this.couponTitle;
        }

        public GetCouponPageResponseBodyData setCouponType(String couponType) {
            this.couponType = couponType;
            return this;
        }
        public String getCouponType() {
            return this.couponType;
        }

        public GetCouponPageResponseBodyData setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public GetCouponPageResponseBodyData setCurrency(GetCouponPageResponseBodyDataCurrency currency) {
            this.currency = currency;
            return this;
        }
        public GetCouponPageResponseBodyDataCurrency getCurrency() {
            return this.currency;
        }

        public GetCouponPageResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetCouponPageResponseBodyData setDiscountRate(Double discountRate) {
            this.discountRate = discountRate;
            return this;
        }
        public Double getDiscountRate() {
            return this.discountRate;
        }

        public GetCouponPageResponseBodyData setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public GetCouponPageResponseBodyData setExtendsMap(java.util.Map<String, String> extendsMap) {
            this.extendsMap = extendsMap;
            return this;
        }
        public java.util.Map<String, String> getExtendsMap() {
            return this.extendsMap;
        }

        public GetCouponPageResponseBodyData setFrozenAmount(Double frozenAmount) {
            this.frozenAmount = frozenAmount;
            return this;
        }
        public Double getFrozenAmount() {
            return this.frozenAmount;
        }

        public GetCouponPageResponseBodyData setFrozenCount(Integer frozenCount) {
            this.frozenCount = frozenCount;
            return this;
        }
        public Integer getFrozenCount() {
            return this.frozenCount;
        }

        public GetCouponPageResponseBodyData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public GetCouponPageResponseBodyData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public GetCouponPageResponseBodyData setItemCodeSet(java.util.List<String> itemCodeSet) {
            this.itemCodeSet = itemCodeSet;
            return this;
        }
        public java.util.List<String> getItemCodeSet() {
            return this.itemCodeSet;
        }

        public GetCouponPageResponseBodyData setMarket(String market) {
            this.market = market;
            return this;
        }
        public String getMarket() {
            return this.market;
        }

        public GetCouponPageResponseBodyData setMarketType(Long marketType) {
            this.marketType = marketType;
            return this;
        }
        public Long getMarketType() {
            return this.marketType;
        }

        public GetCouponPageResponseBodyData setModifier(String modifier) {
            this.modifier = modifier;
            return this;
        }
        public String getModifier() {
            return this.modifier;
        }

        public GetCouponPageResponseBodyData setOrderTypeSet(java.util.List<String> orderTypeSet) {
            this.orderTypeSet = orderTypeSet;
            return this;
        }
        public java.util.List<String> getOrderTypeSet() {
            return this.orderTypeSet;
        }

        public GetCouponPageResponseBodyData setPromotionId(Long promotionId) {
            this.promotionId = promotionId;
            return this;
        }
        public Long getPromotionId() {
            return this.promotionId;
        }

        public GetCouponPageResponseBodyData setSelectionIds(String selectionIds) {
            this.selectionIds = selectionIds;
            return this;
        }
        public String getSelectionIds() {
            return this.selectionIds;
        }

        public GetCouponPageResponseBodyData setSellerId(Long sellerId) {
            this.sellerId = sellerId;
            return this;
        }
        public Long getSellerId() {
            return this.sellerId;
        }

        public GetCouponPageResponseBodyData setSite(String site) {
            this.site = site;
            return this;
        }
        public String getSite() {
            return this.site;
        }

        public GetCouponPageResponseBodyData setSnapId(Long snapId) {
            this.snapId = snapId;
            return this;
        }
        public Long getSnapId() {
            return this.snapId;
        }

        public GetCouponPageResponseBodyData setSpId(Long spId) {
            this.spId = spId;
            return this;
        }
        public Long getSpId() {
            return this.spId;
        }

        public GetCouponPageResponseBodyData setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public GetCouponPageResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetCouponPageResponseBodyData setTemplateId(Long templateId) {
            this.templateId = templateId;
            return this;
        }
        public Long getTemplateId() {
            return this.templateId;
        }

        public GetCouponPageResponseBodyData setUniversalType(String universalType) {
            this.universalType = universalType;
            return this;
        }
        public String getUniversalType() {
            return this.universalType;
        }

        public GetCouponPageResponseBodyData setUpperLimit(Double upperLimit) {
            this.upperLimit = upperLimit;
            return this;
        }
        public Double getUpperLimit() {
            return this.upperLimit;
        }

        public GetCouponPageResponseBodyData setUsageCount(Integer usageCount) {
            this.usageCount = usageCount;
            return this;
        }
        public Integer getUsageCount() {
            return this.usageCount;
        }

        public GetCouponPageResponseBodyData setUsedAmount(Double usedAmount) {
            this.usedAmount = usedAmount;
            return this;
        }
        public Double getUsedAmount() {
            return this.usedAmount;
        }

        public GetCouponPageResponseBodyData setUsedCount(Integer usedCount) {
            this.usedCount = usedCount;
            return this;
        }
        public Integer getUsedCount() {
            return this.usedCount;
        }

        public GetCouponPageResponseBodyData setUserId(Long userId) {
            this.userId = userId;
            return this;
        }
        public Long getUserId() {
            return this.userId;
        }

    }

}
