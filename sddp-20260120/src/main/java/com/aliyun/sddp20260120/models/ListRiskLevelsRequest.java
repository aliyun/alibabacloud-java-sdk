// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20260120.models;

import com.aliyun.tea.*;

public class ListRiskLevelsRequest extends TeaModel {
    @NameInMap("FeatureType")
    public Integer featureType;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("TemplateId")
    public Long templateId;

    public static ListRiskLevelsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListRiskLevelsRequest self = new ListRiskLevelsRequest();
        return TeaModel.build(map, self);
    }

    public ListRiskLevelsRequest setFeatureType(Integer featureType) {
        this.featureType = featureType;
        return this;
    }
    public Integer getFeatureType() {
        return this.featureType;
    }

    public ListRiskLevelsRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ListRiskLevelsRequest setTemplateId(Long templateId) {
        this.templateId = templateId;
        return this;
    }
    public Long getTemplateId() {
        return this.templateId;
    }

}
