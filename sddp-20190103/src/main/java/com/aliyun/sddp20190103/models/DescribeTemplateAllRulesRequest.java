// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class DescribeTemplateAllRulesRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("TemplateId")
    public Long templateId;

    public static DescribeTemplateAllRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeTemplateAllRulesRequest self = new DescribeTemplateAllRulesRequest();
        return TeaModel.build(map, self);
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
