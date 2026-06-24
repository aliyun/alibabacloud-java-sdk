// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class DescribeRiskLevelsRequest extends TeaModel {
    /**
     * <p>This parameter is deprecated.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("FeatureType")
    public Integer featureType;

    /**
     * <p>The language of the request and response. Valid values:</p>
     * <ul>
     * <li><p>zh_cn: Chinese. This is the default value.</p>
     * </li>
     * <li><p>en_us: English.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh_cn</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The ID of the industry-specific template.</p>
     * <blockquote>
     * <p>Call <a href="https://help.aliyun.com/document_detail/2399296.html">DescribeCategoryTemplateList</a> to get the ID of the industry-specific template.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TemplateId")
    public Long templateId;

    public static DescribeRiskLevelsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeRiskLevelsRequest self = new DescribeRiskLevelsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeRiskLevelsRequest setFeatureType(Integer featureType) {
        this.featureType = featureType;
        return this;
    }
    public Integer getFeatureType() {
        return this.featureType;
    }

    public DescribeRiskLevelsRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeRiskLevelsRequest setTemplateId(Long templateId) {
        this.templateId = templateId;
        return this;
    }
    public Long getTemplateId() {
        return this.templateId;
    }

}
