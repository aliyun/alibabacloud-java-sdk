// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class CssCreateOrderParam extends TeaModel {
    @NameInMap("agentId")
    public String agentId;

    @NameInMap("autoPay")
    public Boolean autoPay;

    @NameInMap("autoUseCoupon")
    public Boolean autoUseCoupon;

    @NameInMap("bid")
    public String bid;

    @NameInMap("buyerId")
    public Long buyerId;

    @NameInMap("certificate")
    public String certificate;

    @NameInMap("childId")
    public Long childId;

    @NameInMap("cilentIp")
    public String cilentIp;

    @NameInMap("commodities")
    public java.util.List<CssInstanceCommodity> commodities;

    @NameInMap("createrNick")
    public String createrNick;

    @NameInMap("cssAuthRequestParam")
    public Object cssAuthRequestParam;

    @NameInMap("fromApp")
    public String fromApp;

    @NameInMap("language")
    public String language;

    @NameInMap("marketType")
    public Long marketType;

    @NameInMap("memo")
    public String memo;

    @NameInMap("orderOrigin")
    public String orderOrigin;

    @NameInMap("orderParams")
    public java.util.Map<String, String> orderParams;

    @NameInMap("payerId")
    public Long payerId;

    @NameInMap("planGroupId")
    public Long planGroupId;

    @NameInMap("planId")
    public Long planId;

    @NameInMap("planInstanceId")
    public String planInstanceId;

    @NameInMap("promotionCode")
    public String promotionCode;

    @NameInMap("promotionInputParam")
    public Object promotionInputParam;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("skipChannel")
    public Boolean skipChannel;

    @NameInMap("token")
    public String token;

    @NameInMap("transientAccess")
    public Object transientAccess;

    @NameInMap("umidToken")
    public String umidToken;

    @NameInMap("userId")
    public Long userId;

    public static CssCreateOrderParam build(java.util.Map<String, ?> map) throws Exception {
        CssCreateOrderParam self = new CssCreateOrderParam();
        return TeaModel.build(map, self);
    }

    public CssCreateOrderParam setAgentId(String agentId) {
        this.agentId = agentId;
        return this;
    }
    public String getAgentId() {
        return this.agentId;
    }

    public CssCreateOrderParam setAutoPay(Boolean autoPay) {
        this.autoPay = autoPay;
        return this;
    }
    public Boolean getAutoPay() {
        return this.autoPay;
    }

    public CssCreateOrderParam setAutoUseCoupon(Boolean autoUseCoupon) {
        this.autoUseCoupon = autoUseCoupon;
        return this;
    }
    public Boolean getAutoUseCoupon() {
        return this.autoUseCoupon;
    }

    public CssCreateOrderParam setBid(String bid) {
        this.bid = bid;
        return this;
    }
    public String getBid() {
        return this.bid;
    }

    public CssCreateOrderParam setBuyerId(Long buyerId) {
        this.buyerId = buyerId;
        return this;
    }
    public Long getBuyerId() {
        return this.buyerId;
    }

    public CssCreateOrderParam setCertificate(String certificate) {
        this.certificate = certificate;
        return this;
    }
    public String getCertificate() {
        return this.certificate;
    }

    public CssCreateOrderParam setChildId(Long childId) {
        this.childId = childId;
        return this;
    }
    public Long getChildId() {
        return this.childId;
    }

    public CssCreateOrderParam setCilentIp(String cilentIp) {
        this.cilentIp = cilentIp;
        return this;
    }
    public String getCilentIp() {
        return this.cilentIp;
    }

    public CssCreateOrderParam setCommodities(java.util.List<CssInstanceCommodity> commodities) {
        this.commodities = commodities;
        return this;
    }
    public java.util.List<CssInstanceCommodity> getCommodities() {
        return this.commodities;
    }

    public CssCreateOrderParam setCreaterNick(String createrNick) {
        this.createrNick = createrNick;
        return this;
    }
    public String getCreaterNick() {
        return this.createrNick;
    }

    public CssCreateOrderParam setCssAuthRequestParam(Object cssAuthRequestParam) {
        this.cssAuthRequestParam = cssAuthRequestParam;
        return this;
    }
    public Object getCssAuthRequestParam() {
        return this.cssAuthRequestParam;
    }

    public CssCreateOrderParam setFromApp(String fromApp) {
        this.fromApp = fromApp;
        return this;
    }
    public String getFromApp() {
        return this.fromApp;
    }

    public CssCreateOrderParam setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public CssCreateOrderParam setMarketType(Long marketType) {
        this.marketType = marketType;
        return this;
    }
    public Long getMarketType() {
        return this.marketType;
    }

    public CssCreateOrderParam setMemo(String memo) {
        this.memo = memo;
        return this;
    }
    public String getMemo() {
        return this.memo;
    }

    public CssCreateOrderParam setOrderOrigin(String orderOrigin) {
        this.orderOrigin = orderOrigin;
        return this;
    }
    public String getOrderOrigin() {
        return this.orderOrigin;
    }

    public CssCreateOrderParam setOrderParams(java.util.Map<String, String> orderParams) {
        this.orderParams = orderParams;
        return this;
    }
    public java.util.Map<String, String> getOrderParams() {
        return this.orderParams;
    }

    public CssCreateOrderParam setPayerId(Long payerId) {
        this.payerId = payerId;
        return this;
    }
    public Long getPayerId() {
        return this.payerId;
    }

    public CssCreateOrderParam setPlanGroupId(Long planGroupId) {
        this.planGroupId = planGroupId;
        return this;
    }
    public Long getPlanGroupId() {
        return this.planGroupId;
    }

    public CssCreateOrderParam setPlanId(Long planId) {
        this.planId = planId;
        return this;
    }
    public Long getPlanId() {
        return this.planId;
    }

    public CssCreateOrderParam setPlanInstanceId(String planInstanceId) {
        this.planInstanceId = planInstanceId;
        return this;
    }
    public String getPlanInstanceId() {
        return this.planInstanceId;
    }

    public CssCreateOrderParam setPromotionCode(String promotionCode) {
        this.promotionCode = promotionCode;
        return this;
    }
    public String getPromotionCode() {
        return this.promotionCode;
    }

    public CssCreateOrderParam setPromotionInputParam(Object promotionInputParam) {
        this.promotionInputParam = promotionInputParam;
        return this;
    }
    public Object getPromotionInputParam() {
        return this.promotionInputParam;
    }

    public CssCreateOrderParam setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CssCreateOrderParam setSkipChannel(Boolean skipChannel) {
        this.skipChannel = skipChannel;
        return this;
    }
    public Boolean getSkipChannel() {
        return this.skipChannel;
    }

    public CssCreateOrderParam setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

    public CssCreateOrderParam setTransientAccess(Object transientAccess) {
        this.transientAccess = transientAccess;
        return this;
    }
    public Object getTransientAccess() {
        return this.transientAccess;
    }

    public CssCreateOrderParam setUmidToken(String umidToken) {
        this.umidToken = umidToken;
        return this;
    }
    public String getUmidToken() {
        return this.umidToken;
    }

    public CssCreateOrderParam setUserId(Long userId) {
        this.userId = userId;
        return this;
    }
    public Long getUserId() {
        return this.userId;
    }

}
