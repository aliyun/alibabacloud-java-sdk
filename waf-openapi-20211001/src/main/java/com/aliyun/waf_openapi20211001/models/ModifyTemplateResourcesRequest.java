// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class ModifyTemplateResourcesRequest extends TeaModel {
    @NameInMap("BindResourceGroups")
    public java.util.List<String> bindResourceGroups;

    @NameInMap("BindResources")
    public java.util.List<String> bindResources;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("TemplateId")
    public Long templateId;

    @NameInMap("UnbindResourceGroups")
    public java.util.List<String> unbindResourceGroups;

    @NameInMap("UnbindResources")
    public java.util.List<String> unbindResources;

    public static ModifyTemplateResourcesRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyTemplateResourcesRequest self = new ModifyTemplateResourcesRequest();
        return TeaModel.build(map, self);
    }

    public ModifyTemplateResourcesRequest setBindResourceGroups(java.util.List<String> bindResourceGroups) {
        this.bindResourceGroups = bindResourceGroups;
        return this;
    }
    public java.util.List<String> getBindResourceGroups() {
        return this.bindResourceGroups;
    }

    public ModifyTemplateResourcesRequest setBindResources(java.util.List<String> bindResources) {
        this.bindResources = bindResources;
        return this;
    }
    public java.util.List<String> getBindResources() {
        return this.bindResources;
    }

    public ModifyTemplateResourcesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyTemplateResourcesRequest setTemplateId(Long templateId) {
        this.templateId = templateId;
        return this;
    }
    public Long getTemplateId() {
        return this.templateId;
    }

    public ModifyTemplateResourcesRequest setUnbindResourceGroups(java.util.List<String> unbindResourceGroups) {
        this.unbindResourceGroups = unbindResourceGroups;
        return this;
    }
    public java.util.List<String> getUnbindResourceGroups() {
        return this.unbindResourceGroups;
    }

    public ModifyTemplateResourcesRequest setUnbindResources(java.util.List<String> unbindResources) {
        this.unbindResources = unbindResources;
        return this;
    }
    public java.util.List<String> getUnbindResources() {
        return this.unbindResources;
    }

}
