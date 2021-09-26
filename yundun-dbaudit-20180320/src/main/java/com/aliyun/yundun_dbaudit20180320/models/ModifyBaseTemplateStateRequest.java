// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class ModifyBaseTemplateStateRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("TemplateState")
    public Integer templateState;

    @NameInMap("TemplateIds")
    public java.util.List<String> templateIds;

    public static ModifyBaseTemplateStateRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyBaseTemplateStateRequest self = new ModifyBaseTemplateStateRequest();
        return TeaModel.build(map, self);
    }

    public ModifyBaseTemplateStateRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyBaseTemplateStateRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyBaseTemplateStateRequest setTemplateState(Integer templateState) {
        this.templateState = templateState;
        return this;
    }
    public Integer getTemplateState() {
        return this.templateState;
    }

    public ModifyBaseTemplateStateRequest setTemplateIds(java.util.List<String> templateIds) {
        this.templateIds = templateIds;
        return this;
    }
    public java.util.List<String> getTemplateIds() {
        return this.templateIds;
    }

}
