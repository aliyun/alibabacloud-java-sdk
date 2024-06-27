// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class CreateSampleDataRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("description")
    public String description;

    @NameInMap("encryptType")
    public String encryptType;

    @NameInMap("name")
    public String name;

    @NameInMap("regId")
    public String regId;

    @NameInMap("riskValue")
    public String riskValue;

    @NameInMap("scene")
    public String scene;

    @NameInMap("storePath")
    public String storePath;

    @NameInMap("storeType")
    public String storeType;

    public static CreateSampleDataRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSampleDataRequest self = new CreateSampleDataRequest();
        return TeaModel.build(map, self);
    }

    public CreateSampleDataRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public CreateSampleDataRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateSampleDataRequest setEncryptType(String encryptType) {
        this.encryptType = encryptType;
        return this;
    }
    public String getEncryptType() {
        return this.encryptType;
    }

    public CreateSampleDataRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateSampleDataRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

    public CreateSampleDataRequest setRiskValue(String riskValue) {
        this.riskValue = riskValue;
        return this;
    }
    public String getRiskValue() {
        return this.riskValue;
    }

    public CreateSampleDataRequest setScene(String scene) {
        this.scene = scene;
        return this;
    }
    public String getScene() {
        return this.scene;
    }

    public CreateSampleDataRequest setStorePath(String storePath) {
        this.storePath = storePath;
        return this;
    }
    public String getStorePath() {
        return this.storePath;
    }

    public CreateSampleDataRequest setStoreType(String storeType) {
        this.storeType = storeType;
        return this;
    }
    public String getStoreType() {
        return this.storeType;
    }

}
