// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20260120.models;

import com.aliyun.tea.*;

public class ListIdentifyModelsRequest extends TeaModel {
    /**
     * <p>A reserved feature type parameter. This parameter is not used to filter results in the current query. You do not need to specify this parameter for column encryption calls.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("FeatureType")
    public Integer featureType;

    /**
     * <p>Specifies whether to return only detection models supported in audit scenarios. If this parameter is set to true, only audit-supported models such as phone number, ID card, and bank card models are returned. You do not need to specify this parameter for column encryption scenarios.</p>
     */
    @NameInMap("FilterAuditModel")
    public Boolean filterAuditModel;

    /**
     * <p>The language of the response description. Valid values:</p>
     * <ul>
     * <li>zh: Chinese.</li>
     * <li>en: English.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The ID of the data classification template. You can obtain this value from Items[].Id in the response of the ListTemplates operation. The template must be consistent with the selected sensitivity level and detection models.</p>
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
