// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class QueryTrademarkPriceShrinkRequest extends TeaModel {
    @NameInMap("OrderData")
    public String orderDataShrink;

    @NameInMap("TmIcon")
    public String tmIcon;

    @NameInMap("TmName")
    public String tmName;

    @NameInMap("Type")
    public Integer type;

    @NameInMap("UserId")
    public Long userId;

    public static QueryTrademarkPriceShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryTrademarkPriceShrinkRequest self = new QueryTrademarkPriceShrinkRequest();
        return TeaModel.build(map, self);
    }

    public QueryTrademarkPriceShrinkRequest setOrderDataShrink(String orderDataShrink) {
        this.orderDataShrink = orderDataShrink;
        return this;
    }
    public String getOrderDataShrink() {
        return this.orderDataShrink;
    }

    public QueryTrademarkPriceShrinkRequest setTmIcon(String tmIcon) {
        this.tmIcon = tmIcon;
        return this;
    }
    public String getTmIcon() {
        return this.tmIcon;
    }

    public QueryTrademarkPriceShrinkRequest setTmName(String tmName) {
        this.tmName = tmName;
        return this;
    }
    public String getTmName() {
        return this.tmName;
    }

    public QueryTrademarkPriceShrinkRequest setType(Integer type) {
        this.type = type;
        return this;
    }
    public Integer getType() {
        return this.type;
    }

    public QueryTrademarkPriceShrinkRequest setUserId(Long userId) {
        this.userId = userId;
        return this;
    }
    public Long getUserId() {
        return this.userId;
    }

}
