// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20190902.models;

import com.aliyun.tea.*;

public class CheckDuplicateClassificationRequest extends TeaModel {
    @NameInMap("Classification")
    public String classification;

    @NameInMap("EventSceneType")
    public Integer eventSceneType;

    @NameInMap("TrademarkName")
    public String trademarkName;

    public static CheckDuplicateClassificationRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckDuplicateClassificationRequest self = new CheckDuplicateClassificationRequest();
        return TeaModel.build(map, self);
    }

    public CheckDuplicateClassificationRequest setClassification(String classification) {
        this.classification = classification;
        return this;
    }
    public String getClassification() {
        return this.classification;
    }

    public CheckDuplicateClassificationRequest setEventSceneType(Integer eventSceneType) {
        this.eventSceneType = eventSceneType;
        return this;
    }
    public Integer getEventSceneType() {
        return this.eventSceneType;
    }

    public CheckDuplicateClassificationRequest setTrademarkName(String trademarkName) {
        this.trademarkName = trademarkName;
        return this;
    }
    public String getTrademarkName() {
        return this.trademarkName;
    }

}
