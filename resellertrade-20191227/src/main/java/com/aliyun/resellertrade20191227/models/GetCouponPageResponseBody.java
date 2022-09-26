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

    }

    public static class GetCouponPageResponseBodyData extends TeaModel {
        @NameInMap("Amount")
        public Double amount;

        @NameInMap("CertainMoney")
        public Double certainMoney;

        @NameInMap("CouponId")
        public Long couponId;

        @NameInMap("CouponType")
        public String couponType;

        @NameInMap("Currency")
        public GetCouponPageResponseBodyDataCurrency currency;

        @NameInMap("Description")
        public String description;

        @NameInMap("DiscountRate")
        public Double discountRate;

        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("FrozenAmount")
        public Double frozenAmount;

        @NameInMap("FrozenCount")
        public Integer frozenCount;

        @NameInMap("PromotionId")
        public Long promotionId;

        @NameInMap("SellerId")
        public Long sellerId;

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

        public GetCouponPageResponseBodyData setAmount(Double amount) {
            this.amount = amount;
            return this;
        }
        public Double getAmount() {
            return this.amount;
        }

        public GetCouponPageResponseBodyData setCertainMoney(Double certainMoney) {
            this.certainMoney = certainMoney;
            return this;
        }
        public Double getCertainMoney() {
            return this.certainMoney;
        }

        public GetCouponPageResponseBodyData setCouponId(Long couponId) {
            this.couponId = couponId;
            return this;
        }
        public Long getCouponId() {
            return this.couponId;
        }

        public GetCouponPageResponseBodyData setCouponType(String couponType) {
            this.couponType = couponType;
            return this;
        }
        public String getCouponType() {
            return this.couponType;
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

        public GetCouponPageResponseBodyData setPromotionId(Long promotionId) {
            this.promotionId = promotionId;
            return this;
        }
        public Long getPromotionId() {
            return this.promotionId;
        }

        public GetCouponPageResponseBodyData setSellerId(Long sellerId) {
            this.sellerId = sellerId;
            return this;
        }
        public Long getSellerId() {
            return this.sellerId;
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
