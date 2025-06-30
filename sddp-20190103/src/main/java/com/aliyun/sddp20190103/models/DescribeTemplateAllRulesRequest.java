// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class DescribeTemplateAllRulesRequest extends TeaModel {
    /**
     * <p>This parameter is deprecated.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("FeatureType")
    public Integer featureType;

    /**
     * <p>The language type for the request and response, default is <strong>zh_cn</strong>. Values:</p>
     * <ul>
     * <li><strong>zh_cn</strong>: Chinese.</li>
     * <li><strong>en_us</strong>: English.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh_cn</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>Industry template ID.</p>
     * <blockquote>
     * <p>You can obtain the industry template ID by calling <a href="https://help.aliyun.com/document_detail/2399296.html">DescribeCategoryTemplateList</a>. If this parameter is not provided, the model list of the primary template will be returned by default.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TemplateId")
    public Long templateId;

    public static DescribeTemplateAllRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeTemplateAllRulesRequest self = new DescribeTemplateAllRulesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeTemplateAllRulesRequest setFeatureType(Integer featureType) {
        this.featureType = featureType;
        return this;
    }
    public Integer getFeatureType() {
        return this.featureType;
    }

    public DescribeTemplateAllRulesRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeTemplateAllRulesRequest setTemplateId(Long templateId) {
        this.templateId = templateId;
        return this;
    }
    public Long getTemplateId() {
        return this.templateId;
    }

}
