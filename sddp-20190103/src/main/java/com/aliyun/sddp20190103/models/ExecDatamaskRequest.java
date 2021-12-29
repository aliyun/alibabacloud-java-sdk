// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class ExecDatamaskRequest extends TeaModel {
    @NameInMap("Data")
    public String data;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("TemplateId")
    public Long templateId;

    public static ExecDatamaskRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecDatamaskRequest self = new ExecDatamaskRequest();
        return TeaModel.build(map, self);
    }

    public ExecDatamaskRequest setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public ExecDatamaskRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ExecDatamaskRequest setTemplateId(Long templateId) {
        this.templateId = templateId;
        return this;
    }
    public Long getTemplateId() {
        return this.templateId;
    }

}
