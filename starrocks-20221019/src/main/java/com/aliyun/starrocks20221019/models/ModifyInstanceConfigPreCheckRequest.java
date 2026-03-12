// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starrocks20221019.models;

import com.aliyun.tea.*;

public class ModifyInstanceConfigPreCheckRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>c-b25e21e24388****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("configsToAdd")
    public java.util.List<InstanceConfigDto> configsToAdd;

    @NameInMap("configsToDelete")
    public java.util.List<InstanceConfigDto> configsToDelete;

    @NameInMap("configsToUpdate")
    public java.util.List<InstanceConfigDto> configsToUpdate;

    public static ModifyInstanceConfigPreCheckRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceConfigPreCheckRequest self = new ModifyInstanceConfigPreCheckRequest();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceConfigPreCheckRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyInstanceConfigPreCheckRequest setConfigsToAdd(java.util.List<InstanceConfigDto> configsToAdd) {
        this.configsToAdd = configsToAdd;
        return this;
    }
    public java.util.List<InstanceConfigDto> getConfigsToAdd() {
        return this.configsToAdd;
    }

    public ModifyInstanceConfigPreCheckRequest setConfigsToDelete(java.util.List<InstanceConfigDto> configsToDelete) {
        this.configsToDelete = configsToDelete;
        return this;
    }
    public java.util.List<InstanceConfigDto> getConfigsToDelete() {
        return this.configsToDelete;
    }

    public ModifyInstanceConfigPreCheckRequest setConfigsToUpdate(java.util.List<InstanceConfigDto> configsToUpdate) {
        this.configsToUpdate = configsToUpdate;
        return this;
    }
    public java.util.List<InstanceConfigDto> getConfigsToUpdate() {
        return this.configsToUpdate;
    }

}
