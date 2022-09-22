// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resellertrade20191227.models;

import com.aliyun.tea.*;

public class GetCouponPageRequest extends TeaModel {
    @NameInMap("ActivitySite")
    public String activitySite;

    @NameInMap("Bid")
    public Long bid;

    @NameInMap("BizTime")
    public String bizTime;

    @NameInMap("Creator")
    public String creator;

    @NameInMap("Currency")
    public GetCouponPageRequestCurrency currency;

    @NameInMap("EffectiveEndDate")
    public String effectiveEndDate;

    @NameInMap("EffectiveStartDate")
    public String effectiveStartDate;

    @NameInMap("End")
    public String end;

    @NameInMap("ExpireEndDate")
    public String expireEndDate;

    @NameInMap("ExpireStartDate")
    public String expireStartDate;

    @NameInMap("FromApp")
    public String fromApp;

    @NameInMap("Id")
    public Long id;

    @NameInMap("IsQueryExtend")
    public Boolean isQueryExtend;

    @NameInMap("ItemCodeSet")
    public java.util.List<String> itemCodeSet;

    @NameInMap("OrderType")
    public String orderType;

    @NameInMap("PageNo")
    public Integer pageNo;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("QueryType")
    public String queryType;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SellerId")
    public Long sellerId;

    @NameInMap("Site")
    public String site;

    @NameInMap("SpId")
    public Long spId;

    @NameInMap("Start")
    public String start;

    @NameInMap("Status")
    public String status;

    @NameInMap("TemplateId")
    public Long templateId;

    @NameInMap("Type")
    public String type;

    @NameInMap("Uids")
    public java.util.List<Long> uids;

    @NameInMap("UserId")
    public Long userId;

    @NameInMap("UserIds")
    public java.util.List<Long> userIds;

    @NameInMap("YhClientType")
    public String yhClientType;

    @NameInMap("YhMarket")
    public String yhMarket;

    @NameInMap("YhMarketType")
    public Long yhMarketType;

    public static GetCouponPageRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCouponPageRequest self = new GetCouponPageRequest();
        return TeaModel.build(map, self);
    }

    public GetCouponPageRequest setActivitySite(String activitySite) {
        this.activitySite = activitySite;
        return this;
    }
    public String getActivitySite() {
        return this.activitySite;
    }

    public GetCouponPageRequest setBid(Long bid) {
        this.bid = bid;
        return this;
    }
    public Long getBid() {
        return this.bid;
    }

    public GetCouponPageRequest setBizTime(String bizTime) {
        this.bizTime = bizTime;
        return this;
    }
    public String getBizTime() {
        return this.bizTime;
    }

    public GetCouponPageRequest setCreator(String creator) {
        this.creator = creator;
        return this;
    }
    public String getCreator() {
        return this.creator;
    }

    public GetCouponPageRequest setCurrency(GetCouponPageRequestCurrency currency) {
        this.currency = currency;
        return this;
    }
    public GetCouponPageRequestCurrency getCurrency() {
        return this.currency;
    }

    public GetCouponPageRequest setEffectiveEndDate(String effectiveEndDate) {
        this.effectiveEndDate = effectiveEndDate;
        return this;
    }
    public String getEffectiveEndDate() {
        return this.effectiveEndDate;
    }

    public GetCouponPageRequest setEffectiveStartDate(String effectiveStartDate) {
        this.effectiveStartDate = effectiveStartDate;
        return this;
    }
    public String getEffectiveStartDate() {
        return this.effectiveStartDate;
    }

    public GetCouponPageRequest setEnd(String end) {
        this.end = end;
        return this;
    }
    public String getEnd() {
        return this.end;
    }

    public GetCouponPageRequest setExpireEndDate(String expireEndDate) {
        this.expireEndDate = expireEndDate;
        return this;
    }
    public String getExpireEndDate() {
        return this.expireEndDate;
    }

    public GetCouponPageRequest setExpireStartDate(String expireStartDate) {
        this.expireStartDate = expireStartDate;
        return this;
    }
    public String getExpireStartDate() {
        return this.expireStartDate;
    }

    public GetCouponPageRequest setFromApp(String fromApp) {
        this.fromApp = fromApp;
        return this;
    }
    public String getFromApp() {
        return this.fromApp;
    }

    public GetCouponPageRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public GetCouponPageRequest setIsQueryExtend(Boolean isQueryExtend) {
        this.isQueryExtend = isQueryExtend;
        return this;
    }
    public Boolean getIsQueryExtend() {
        return this.isQueryExtend;
    }

    public GetCouponPageRequest setItemCodeSet(java.util.List<String> itemCodeSet) {
        this.itemCodeSet = itemCodeSet;
        return this;
    }
    public java.util.List<String> getItemCodeSet() {
        return this.itemCodeSet;
    }

    public GetCouponPageRequest setOrderType(String orderType) {
        this.orderType = orderType;
        return this;
    }
    public String getOrderType() {
        return this.orderType;
    }

    public GetCouponPageRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public GetCouponPageRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetCouponPageRequest setQueryType(String queryType) {
        this.queryType = queryType;
        return this;
    }
    public String getQueryType() {
        return this.queryType;
    }

    public GetCouponPageRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetCouponPageRequest setSellerId(Long sellerId) {
        this.sellerId = sellerId;
        return this;
    }
    public Long getSellerId() {
        return this.sellerId;
    }

    public GetCouponPageRequest setSite(String site) {
        this.site = site;
        return this;
    }
    public String getSite() {
        return this.site;
    }

    public GetCouponPageRequest setSpId(Long spId) {
        this.spId = spId;
        return this;
    }
    public Long getSpId() {
        return this.spId;
    }

    public GetCouponPageRequest setStart(String start) {
        this.start = start;
        return this;
    }
    public String getStart() {
        return this.start;
    }

    public GetCouponPageRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetCouponPageRequest setTemplateId(Long templateId) {
        this.templateId = templateId;
        return this;
    }
    public Long getTemplateId() {
        return this.templateId;
    }

    public GetCouponPageRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public GetCouponPageRequest setUids(java.util.List<Long> uids) {
        this.uids = uids;
        return this;
    }
    public java.util.List<Long> getUids() {
        return this.uids;
    }

    public GetCouponPageRequest setUserId(Long userId) {
        this.userId = userId;
        return this;
    }
    public Long getUserId() {
        return this.userId;
    }

    public GetCouponPageRequest setUserIds(java.util.List<Long> userIds) {
        this.userIds = userIds;
        return this;
    }
    public java.util.List<Long> getUserIds() {
        return this.userIds;
    }

    public GetCouponPageRequest setYhClientType(String yhClientType) {
        this.yhClientType = yhClientType;
        return this;
    }
    public String getYhClientType() {
        return this.yhClientType;
    }

    public GetCouponPageRequest setYhMarket(String yhMarket) {
        this.yhMarket = yhMarket;
        return this;
    }
    public String getYhMarket() {
        return this.yhMarket;
    }

    public GetCouponPageRequest setYhMarketType(Long yhMarketType) {
        this.yhMarketType = yhMarketType;
        return this;
    }
    public Long getYhMarketType() {
        return this.yhMarketType;
    }

    public static class GetCouponPageRequestCurrency extends TeaModel {
        @NameInMap("CurrencyCode")
        public String currencyCode;

        @NameInMap("DefaultFractionDigits")
        public Integer defaultFractionDigits;

        @NameInMap("NumericCode")
        public Integer numericCode;

        public static GetCouponPageRequestCurrency build(java.util.Map<String, ?> map) throws Exception {
            GetCouponPageRequestCurrency self = new GetCouponPageRequestCurrency();
            return TeaModel.build(map, self);
        }

        public GetCouponPageRequestCurrency setCurrencyCode(String currencyCode) {
            this.currencyCode = currencyCode;
            return this;
        }
        public String getCurrencyCode() {
            return this.currencyCode;
        }

        public GetCouponPageRequestCurrency setDefaultFractionDigits(Integer defaultFractionDigits) {
            this.defaultFractionDigits = defaultFractionDigits;
            return this;
        }
        public Integer getDefaultFractionDigits() {
            return this.defaultFractionDigits;
        }

        public GetCouponPageRequestCurrency setNumericCode(Integer numericCode) {
            this.numericCode = numericCode;
            return this;
        }
        public Integer getNumericCode() {
            return this.numericCode;
        }

    }

}
