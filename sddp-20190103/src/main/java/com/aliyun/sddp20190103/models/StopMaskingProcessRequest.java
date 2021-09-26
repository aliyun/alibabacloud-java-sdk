// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class StopMaskingProcessRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("Id")
    public Long id;

    @NameInMap("FeatureType")
    public Integer featureType;

    public static StopMaskingProcessRequest build(java.util.Map<String, ?> map) throws Exception {
        StopMaskingProcessRequest self = new StopMaskingProcessRequest();
        return TeaModel.build(map, self);
    }

    public StopMaskingProcessRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public StopMaskingProcessRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public StopMaskingProcessRequest setFeatureType(Integer featureType) {
        this.featureType = featureType;
        return this;
    }
    public Integer getFeatureType() {
        return this.featureType;
    }

}
