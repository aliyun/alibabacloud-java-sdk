// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class ExecDatamaskRequest extends TeaModel {
    @NameInMap("Data")
    public String data;

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

    public ExecDatamaskRequest setTemplateId(Long templateId) {
        this.templateId = templateId;
        return this;
    }
    public Long getTemplateId() {
        return this.templateId;
    }

}
