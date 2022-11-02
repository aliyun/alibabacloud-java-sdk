// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DeleteDefenseTemplateRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("TemplateId")
    public Long templateId;

    public static DeleteDefenseTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDefenseTemplateRequest self = new DeleteDefenseTemplateRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDefenseTemplateRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DeleteDefenseTemplateRequest setTemplateId(Long templateId) {
        this.templateId = templateId;
        return this;
    }
    public Long getTemplateId() {
        return this.templateId;
    }

}
