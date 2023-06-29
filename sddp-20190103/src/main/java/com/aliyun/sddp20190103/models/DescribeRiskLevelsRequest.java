// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class DescribeRiskLevelsRequest extends TeaModel {
    /**
     * <p>The language of the content within the request and response. Valid values:</p>
     * <br>
     * <p>*   zh_cn: Chinese (default)</p>
     * <p>*   en_us: English</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The ID of the industry-specific rule template.</p>
     */
    @NameInMap("TemplateId")
    public Long templateId;

    public static DescribeRiskLevelsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeRiskLevelsRequest self = new DescribeRiskLevelsRequest();
        return TeaModel.build(map, self);
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
