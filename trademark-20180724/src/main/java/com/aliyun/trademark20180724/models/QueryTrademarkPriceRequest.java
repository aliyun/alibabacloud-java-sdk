// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class QueryTrademarkPriceRequest extends TeaModel {
    @NameInMap("UserId")
    public Long userId;

    @NameInMap("TmName")
    public String tmName;

    @NameInMap("TmIcon")
    public String tmIcon;

    @NameInMap("Type")
    public Integer type;

    @NameInMap("OrderData")
    public java.util.Map<String, ?> orderData;

    public static QueryTrademarkPriceRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryTrademarkPriceRequest self = new QueryTrademarkPriceRequest();
        return TeaModel.build(map, self);
    }

    public QueryTrademarkPriceRequest setUserId(Long userId) {
        this.userId = userId;
        return this;
    }
    public Long getUserId() {
        return this.userId;
    }

    public QueryTrademarkPriceRequest setTmName(String tmName) {
        this.tmName = tmName;
        return this;
    }
    public String getTmName() {
        return this.tmName;
    }

    public QueryTrademarkPriceRequest setTmIcon(String tmIcon) {
        this.tmIcon = tmIcon;
        return this;
    }
    public String getTmIcon() {
        return this.tmIcon;
    }

    public QueryTrademarkPriceRequest setType(Integer type) {
        this.type = type;
        return this;
    }
    public Integer getType() {
        return this.type;
    }

    public QueryTrademarkPriceRequest setOrderData(java.util.Map<String, ?> orderData) {
        this.orderData = orderData;
        return this;
    }
    public java.util.Map<String, ?> getOrderData() {
        return this.orderData;
    }

}
