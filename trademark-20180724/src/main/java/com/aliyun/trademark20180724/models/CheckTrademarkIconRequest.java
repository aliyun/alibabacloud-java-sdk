// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class CheckTrademarkIconRequest extends TeaModel {
    @NameInMap("TrademarkIconOssKey")
    public String trademarkIconOssKey;

    @NameInMap("EventSceneType")
    public Integer eventSceneType;

    public static CheckTrademarkIconRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckTrademarkIconRequest self = new CheckTrademarkIconRequest();
        return TeaModel.build(map, self);
    }

    public CheckTrademarkIconRequest setTrademarkIconOssKey(String trademarkIconOssKey) {
        this.trademarkIconOssKey = trademarkIconOssKey;
        return this;
    }
    public String getTrademarkIconOssKey() {
        return this.trademarkIconOssKey;
    }

    public CheckTrademarkIconRequest setEventSceneType(Integer eventSceneType) {
        this.eventSceneType = eventSceneType;
        return this;
    }
    public Integer getEventSceneType() {
        return this.eventSceneType;
    }

}
