// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class ModifyDefenseTemplateStatusRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("TemplateId")
    public Long templateId;

    @NameInMap("TemplateStatus")
    public Integer templateStatus;

    public static ModifyDefenseTemplateStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDefenseTemplateStatusRequest self = new ModifyDefenseTemplateStatusRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDefenseTemplateStatusRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyDefenseTemplateStatusRequest setTemplateId(Long templateId) {
        this.templateId = templateId;
        return this;
    }
    public Long getTemplateId() {
        return this.templateId;
    }

    public ModifyDefenseTemplateStatusRequest setTemplateStatus(Integer templateStatus) {
        this.templateStatus = templateStatus;
        return this;
    }
    public Integer getTemplateStatus() {
        return this.templateStatus;
    }

}
