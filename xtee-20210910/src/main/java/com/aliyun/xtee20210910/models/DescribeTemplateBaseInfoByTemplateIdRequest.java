// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeTemplateBaseInfoByTemplateIdRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("regId")
    public String regId;

    @NameInMap("templateId")
    public Long templateId;

    public static DescribeTemplateBaseInfoByTemplateIdRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeTemplateBaseInfoByTemplateIdRequest self = new DescribeTemplateBaseInfoByTemplateIdRequest();
        return TeaModel.build(map, self);
    }

    public DescribeTemplateBaseInfoByTemplateIdRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeTemplateBaseInfoByTemplateIdRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

    public DescribeTemplateBaseInfoByTemplateIdRequest setTemplateId(Long templateId) {
        this.templateId = templateId;
        return this;
    }
    public Long getTemplateId() {
        return this.templateId;
    }

}
