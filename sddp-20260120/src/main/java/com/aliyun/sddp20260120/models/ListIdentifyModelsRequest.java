// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20260120.models;

import com.aliyun.tea.*;

public class ListIdentifyModelsRequest extends TeaModel {
    /**
     * <p>The reserved feature type parameter. This parameter is not used to filter results in the current query and does not need to be specified for column encryption calls.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("FeatureType")
    public Integer featureType;

    /**
     * <p>Specifies whether to restrict the results to recognition models supported in audit scenarios. If you set this parameter to true, models supported for auditing, such as mobile phone numbers, ID cards, and bank cards, are filtered. This parameter is optional for column encryption scenarios.</p>
     */
    @NameInMap("FilterAuditModel")
    public Boolean filterAuditModel;

    /**
     * <p>The language of the response description. Valid values: zh: Chinese. en: English.</p>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The ID of the data classification template. You can obtain the ID from Items[].Id in the response of the ListTemplates operation. The ID must be consistent with the selected sensitivity level and recognition model.</p>
     * 
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
