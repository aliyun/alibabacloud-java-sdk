// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class ModifyTemplateStatusRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("fromTemplateSatus")
    public String fromTemplateSatus;

    @NameInMap("regId")
    public String regId;

    @NameInMap("templateId")
    public Long templateId;

    @NameInMap("toTemplateSatus")
    public String toTemplateSatus;

    public static ModifyTemplateStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyTemplateStatusRequest self = new ModifyTemplateStatusRequest();
        return TeaModel.build(map, self);
    }

    public ModifyTemplateStatusRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ModifyTemplateStatusRequest setFromTemplateSatus(String fromTemplateSatus) {
        this.fromTemplateSatus = fromTemplateSatus;
        return this;
    }
    public String getFromTemplateSatus() {
        return this.fromTemplateSatus;
    }

    public ModifyTemplateStatusRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

    public ModifyTemplateStatusRequest setTemplateId(Long templateId) {
        this.templateId = templateId;
        return this;
    }
    public Long getTemplateId() {
        return this.templateId;
    }

    public ModifyTemplateStatusRequest setToTemplateSatus(String toTemplateSatus) {
        this.toTemplateSatus = toTemplateSatus;
        return this;
    }
    public String getToTemplateSatus() {
        return this.toTemplateSatus;
    }

}
