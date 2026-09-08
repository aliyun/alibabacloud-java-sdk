// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20260120.models;

import com.aliyun.tea.*;

public class ListIdentifyModelsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("FeatureType")
    public Integer featureType;

    @NameInMap("FilterAuditModel")
    public Boolean filterAuditModel;

    /**
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TemplateId")
    public Long templateId;

    public static ListIdentifyModelsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListIdentifyModelsRequest self = new ListIdentifyModelsRequest();
        return TeaModel.build(map, self);
    }

    public ListIdentifyModelsRequest setFeatureType(Integer featureType) {
        this.featureType = featureType;
        return this;
    }
    public Integer getFeatureType() {
        return this.featureType;
    }

    public ListIdentifyModelsRequest setFilterAuditModel(Boolean filterAuditModel) {
        this.filterAuditModel = filterAuditModel;
        return this;
    }
    public Boolean getFilterAuditModel() {
        return this.filterAuditModel;
    }

    public ListIdentifyModelsRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ListIdentifyModelsRequest setTemplateId(Long templateId) {
        this.templateId = templateId;
        return this;
    }
    public Long getTemplateId() {
        return this.templateId;
    }

}
