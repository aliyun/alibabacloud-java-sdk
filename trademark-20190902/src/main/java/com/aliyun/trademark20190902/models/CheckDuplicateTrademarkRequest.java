// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20190902.models;

import com.aliyun.tea.*;

public class CheckDuplicateTrademarkRequest extends TeaModel {
    @NameInMap("Classification")
    public String classification;

    @NameInMap("EventSceneType")
    public Integer eventSceneType;

    @NameInMap("MaterialName")
    public String materialName;

    @NameInMap("TrademarkName")
    public String trademarkName;

    public static CheckDuplicateTrademarkRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckDuplicateTrademarkRequest self = new CheckDuplicateTrademarkRequest();
        return TeaModel.build(map, self);
    }

    public CheckDuplicateTrademarkRequest setClassification(String classification) {
        this.classification = classification;
        return this;
    }
    public String getClassification() {
        return this.classification;
    }

    public CheckDuplicateTrademarkRequest setEventSceneType(Integer eventSceneType) {
        this.eventSceneType = eventSceneType;
        return this;
    }
    public Integer getEventSceneType() {
        return this.eventSceneType;
    }

    public CheckDuplicateTrademarkRequest setMaterialName(String materialName) {
        this.materialName = materialName;
        return this;
    }
    public String getMaterialName() {
        return this.materialName;
    }

    public CheckDuplicateTrademarkRequest setTrademarkName(String trademarkName) {
        this.trademarkName = trademarkName;
        return this;
    }
    public String getTrademarkName() {
        return this.trademarkName;
    }

}
