// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20190902.models;

import com.aliyun.tea.*;

public class CheckTrademarkNameRequest extends TeaModel {
    @NameInMap("EventSceneType")
    public Integer eventSceneType;

    @NameInMap("TrademarkName")
    public String trademarkName;

    public static CheckTrademarkNameRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckTrademarkNameRequest self = new CheckTrademarkNameRequest();
        return TeaModel.build(map, self);
    }

    public CheckTrademarkNameRequest setEventSceneType(Integer eventSceneType) {
        this.eventSceneType = eventSceneType;
        return this;
    }
    public Integer getEventSceneType() {
        return this.eventSceneType;
    }

    public CheckTrademarkNameRequest setTrademarkName(String trademarkName) {
        this.trademarkName = trademarkName;
        return this;
    }
    public String getTrademarkName() {
        return this.trademarkName;
    }

}
