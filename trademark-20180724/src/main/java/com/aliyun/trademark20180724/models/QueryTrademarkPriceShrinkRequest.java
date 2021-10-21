// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class QueryTrademarkPriceShrinkRequest extends TeaModel {
    @NameInMap("UserId")
    public Long userId;

    @NameInMap("TmName")
    public String tmName;

    @NameInMap("TmIcon")
    public String tmIcon;

    @NameInMap("Type")
    public Integer type;

    @NameInMap("OrderData")
    public String orderDataShrink;

    public static QueryTrademarkPriceShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryTrademarkPriceShrinkRequest self = new QueryTrademarkPriceShrinkRequest();
        return TeaModel.build(map, self);
    }

    public QueryTrademarkPriceShrinkRequest setUserId(Long userId) {
        this.userId = userId;
        return this;
    }
    public Long getUserId() {
        return this.userId;
    }

    public QueryTrademarkPriceShrinkRequest setTmName(String tmName) {
        this.tmName = tmName;
        return this;
    }
    public String getTmName() {
        return this.tmName;
    }

    public QueryTrademarkPriceShrinkRequest setTmIcon(String tmIcon) {
        this.tmIcon = tmIcon;
        return this;
    }
    public String getTmIcon() {
        return this.tmIcon;
    }

    public QueryTrademarkPriceShrinkRequest setType(Integer type) {
        this.type = type;
        return this;
    }
    public Integer getType() {
        return this.type;
    }

    public QueryTrademarkPriceShrinkRequest setOrderDataShrink(String orderDataShrink) {
        this.orderDataShrink = orderDataShrink;
        return this;
    }
    public String getOrderDataShrink() {
        return this.orderDataShrink;
    }

}
