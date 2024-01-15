// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20230313.models;

import com.aliyun.tea.*;

public class PopSubmitAITryOnJobRequest extends TeaModel {
    @NameInMap("BottomsId")
    public String bottomsId;

    @NameInMap("ClothingType")
    public String clothingType;

    @NameInMap("GeneratePictureNum")
    public Integer generatePictureNum;

    @NameInMap("JwtToken")
    public String jwtToken;

    @NameInMap("ModelId")
    public String modelId;

    @NameInMap("ShoeType")
    public String shoeType;

    @NameInMap("SuitId")
    public String suitId;

    @NameInMap("TopsId")
    public String topsId;

    public static PopSubmitAITryOnJobRequest build(java.util.Map<String, ?> map) throws Exception {
        PopSubmitAITryOnJobRequest self = new PopSubmitAITryOnJobRequest();
        return TeaModel.build(map, self);
    }

    public PopSubmitAITryOnJobRequest setBottomsId(String bottomsId) {
        this.bottomsId = bottomsId;
        return this;
    }
    public String getBottomsId() {
        return this.bottomsId;
    }

    public PopSubmitAITryOnJobRequest setClothingType(String clothingType) {
        this.clothingType = clothingType;
        return this;
    }
    public String getClothingType() {
        return this.clothingType;
    }

    public PopSubmitAITryOnJobRequest setGeneratePictureNum(Integer generatePictureNum) {
        this.generatePictureNum = generatePictureNum;
        return this;
    }
    public Integer getGeneratePictureNum() {
        return this.generatePictureNum;
    }

    public PopSubmitAITryOnJobRequest setJwtToken(String jwtToken) {
        this.jwtToken = jwtToken;
        return this;
    }
    public String getJwtToken() {
        return this.jwtToken;
    }

    public PopSubmitAITryOnJobRequest setModelId(String modelId) {
        this.modelId = modelId;
        return this;
    }
    public String getModelId() {
        return this.modelId;
    }

    public PopSubmitAITryOnJobRequest setShoeType(String shoeType) {
        this.shoeType = shoeType;
        return this;
    }
    public String getShoeType() {
        return this.shoeType;
    }

    public PopSubmitAITryOnJobRequest setSuitId(String suitId) {
        this.suitId = suitId;
        return this;
    }
    public String getSuitId() {
        return this.suitId;
    }

    public PopSubmitAITryOnJobRequest setTopsId(String topsId) {
        this.topsId = topsId;
        return this;
    }
    public String getTopsId() {
        return this.topsId;
    }

}
