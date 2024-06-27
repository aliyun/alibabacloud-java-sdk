// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class CreateRecommendTaskRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("name")
    public String name;

    @NameInMap("regId")
    public String regId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("sampleId")
    public Long sampleId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("variablesStr")
    public String variablesStr;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("velocitiesStr")
    public String velocitiesStr;

    public static CreateRecommendTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateRecommendTaskRequest self = new CreateRecommendTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateRecommendTaskRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public CreateRecommendTaskRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateRecommendTaskRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

    public CreateRecommendTaskRequest setSampleId(Long sampleId) {
        this.sampleId = sampleId;
        return this;
    }
    public Long getSampleId() {
        return this.sampleId;
    }

    public CreateRecommendTaskRequest setVariablesStr(String variablesStr) {
        this.variablesStr = variablesStr;
        return this;
    }
    public String getVariablesStr() {
        return this.variablesStr;
    }

    public CreateRecommendTaskRequest setVelocitiesStr(String velocitiesStr) {
        this.velocitiesStr = velocitiesStr;
        return this;
    }
    public String getVelocitiesStr() {
        return this.velocitiesStr;
    }

}
