// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class CssProduce extends TeaModel {
    @NameInMap("bid")
    public String bid;

    @NameInMap("buyerId")
    public Long buyerId;

    @NameInMap("childId")
    public Long childId;

    @NameInMap("fromApp")
    public String fromApp;

    @NameInMap("orderId")
    public Long orderId;

    @NameInMap("payerId")
    public Long payerId;

    @NameInMap("purchases")
    public java.util.List<CssPurchase> purchases;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("skipChannel")
    public Boolean skipChannel;

    @NameInMap("token")
    public String token;

    @NameInMap("userId")
    public Long userId;

    public static CssProduce build(java.util.Map<String, ?> map) throws Exception {
        CssProduce self = new CssProduce();
        return TeaModel.build(map, self);
    }

    public CssProduce setBid(String bid) {
        this.bid = bid;
        return this;
    }
    public String getBid() {
        return this.bid;
    }

    public CssProduce setBuyerId(Long buyerId) {
        this.buyerId = buyerId;
        return this;
    }
    public Long getBuyerId() {
        return this.buyerId;
    }

    public CssProduce setChildId(Long childId) {
        this.childId = childId;
        return this;
    }
    public Long getChildId() {
        return this.childId;
    }

    public CssProduce setFromApp(String fromApp) {
        this.fromApp = fromApp;
        return this;
    }
    public String getFromApp() {
        return this.fromApp;
    }

    public CssProduce setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }
    public Long getOrderId() {
        return this.orderId;
    }

    public CssProduce setPayerId(Long payerId) {
        this.payerId = payerId;
        return this;
    }
    public Long getPayerId() {
        return this.payerId;
    }

    public CssProduce setPurchases(java.util.List<CssPurchase> purchases) {
        this.purchases = purchases;
        return this;
    }
    public java.util.List<CssPurchase> getPurchases() {
        return this.purchases;
    }

    public CssProduce setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CssProduce setSkipChannel(Boolean skipChannel) {
        this.skipChannel = skipChannel;
        return this;
    }
    public Boolean getSkipChannel() {
        return this.skipChannel;
    }

    public CssProduce setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

    public CssProduce setUserId(Long userId) {
        this.userId = userId;
        return this;
    }
    public Long getUserId() {
        return this.userId;
    }

}
