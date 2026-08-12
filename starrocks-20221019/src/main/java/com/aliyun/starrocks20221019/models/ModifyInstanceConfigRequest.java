// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starrocks20221019.models;

import com.aliyun.tea.*;

public class ModifyInstanceConfigRequest extends TeaModel {
    /**
     * <p>[Deprecated] List of configurations to add</p>
     * 
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("AddConfigList")
    public String addConfigList;

    /**
     * <p>Additional information</p>
     * 
     * <strong>example:</strong>
     * <p>[{\&quot;type\&quot;:\&quot;sas_analysis_online-sas-operation-log-sh-sas-event-rasp\&quot;,\&quot;configItemList\&quot;:[{\&quot;key\&quot;:\&quot;item_level\&quot;,\&quot;valueList\&quot;:[\&quot;all\&quot;]},{\&quot;key\&quot;:\&quot;alert_type\&quot;,\&quot;valueList\&quot;:[\&quot;all\&quot;]}]}]</p>
     */
    @NameInMap("ConfigList")
    public String configList;

    /**
     * <p>[Deprecated] List of configurations to delete</p>
     * 
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("DeleteConfigList")
    public String deleteConfigList;

    /**
     * <p>Sample ID</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>c-991ca6180620****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>Reason for modification</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Reason")
    public String reason;

    /**
     * <p>Configurations to add</p>
     */
    @NameInMap("configsToAdd")
    public java.util.List<InstanceConfigDto> configsToAdd;

    /**
     * <p>Configurations to delete</p>
     */
    @NameInMap("configsToDelete")
    public java.util.List<InstanceConfigDto> configsToDelete;

    /**
     * <p>Configurations to update</p>
     */
    @NameInMap("configsToUpdate")
    public java.util.List<InstanceConfigDto> configsToUpdate;

    /**
     * <p>Whether to restart quickly</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("fastMode")
    public Boolean fastMode;

    /**
     * <p>Whether to restart.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("restart")
    public Boolean restart;

    public static ModifyInstanceConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceConfigRequest self = new ModifyInstanceConfigRequest();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceConfigRequest setAddConfigList(String addConfigList) {
        this.addConfigList = addConfigList;
        return this;
    }
    public String getAddConfigList() {
        return this.addConfigList;
    }

    public ModifyInstanceConfigRequest setConfigList(String configList) {
        this.configList = configList;
        return this;
    }
    public String getConfigList() {
        return this.configList;
    }

    public ModifyInstanceConfigRequest setDeleteConfigList(String deleteConfigList) {
        this.deleteConfigList = deleteConfigList;
        return this;
    }
    public String getDeleteConfigList() {
        return this.deleteConfigList;
    }

    public ModifyInstanceConfigRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyInstanceConfigRequest setReason(String reason) {
        this.reason = reason;
        return this;
    }
    public String getReason() {
        return this.reason;
    }

    public ModifyInstanceConfigRequest setConfigsToAdd(java.util.List<InstanceConfigDto> configsToAdd) {
        this.configsToAdd = configsToAdd;
        return this;
    }
    public java.util.List<InstanceConfigDto> getConfigsToAdd() {
        return this.configsToAdd;
    }

    public ModifyInstanceConfigRequest setConfigsToDelete(java.util.List<InstanceConfigDto> configsToDelete) {
        this.configsToDelete = configsToDelete;
        return this;
    }
    public java.util.List<InstanceConfigDto> getConfigsToDelete() {
        return this.configsToDelete;
    }

    public ModifyInstanceConfigRequest setConfigsToUpdate(java.util.List<InstanceConfigDto> configsToUpdate) {
        this.configsToUpdate = configsToUpdate;
        return this;
    }
    public java.util.List<InstanceConfigDto> getConfigsToUpdate() {
        return this.configsToUpdate;
    }

    public ModifyInstanceConfigRequest setFastMode(Boolean fastMode) {
        this.fastMode = fastMode;
        return this;
    }
    public Boolean getFastMode() {
        return this.fastMode;
    }

    public ModifyInstanceConfigRequest setRestart(Boolean restart) {
        this.restart = restart;
        return this;
    }
    public Boolean getRestart() {
        return this.restart;
    }

}
