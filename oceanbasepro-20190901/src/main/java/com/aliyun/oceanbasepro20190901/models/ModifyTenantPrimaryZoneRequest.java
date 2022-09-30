// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class ModifyTenantPrimaryZoneRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("MasterIntranetAddressZone")
    public String masterIntranetAddressZone;

    @NameInMap("ModifyType")
    public String modifyType;

    @NameInMap("PrimaryZone")
    public String primaryZone;

    @NameInMap("PrimaryZoneDeployType")
    public String primaryZoneDeployType;

    @NameInMap("TenantId")
    public String tenantId;

    @NameInMap("UserVSwitchId")
    public String userVSwitchId;

    public static ModifyTenantPrimaryZoneRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyTenantPrimaryZoneRequest self = new ModifyTenantPrimaryZoneRequest();
        return TeaModel.build(map, self);
    }

    public ModifyTenantPrimaryZoneRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyTenantPrimaryZoneRequest setMasterIntranetAddressZone(String masterIntranetAddressZone) {
        this.masterIntranetAddressZone = masterIntranetAddressZone;
        return this;
    }
    public String getMasterIntranetAddressZone() {
        return this.masterIntranetAddressZone;
    }

    public ModifyTenantPrimaryZoneRequest setModifyType(String modifyType) {
        this.modifyType = modifyType;
        return this;
    }
    public String getModifyType() {
        return this.modifyType;
    }

    public ModifyTenantPrimaryZoneRequest setPrimaryZone(String primaryZone) {
        this.primaryZone = primaryZone;
        return this;
    }
    public String getPrimaryZone() {
        return this.primaryZone;
    }

    public ModifyTenantPrimaryZoneRequest setPrimaryZoneDeployType(String primaryZoneDeployType) {
        this.primaryZoneDeployType = primaryZoneDeployType;
        return this;
    }
    public String getPrimaryZoneDeployType() {
        return this.primaryZoneDeployType;
    }

    public ModifyTenantPrimaryZoneRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public ModifyTenantPrimaryZoneRequest setUserVSwitchId(String userVSwitchId) {
        this.userVSwitchId = userVSwitchId;
        return this;
    }
    public String getUserVSwitchId() {
        return this.userVSwitchId;
    }

}
