// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class ModifyTenantPrimaryZoneRequest extends TeaModel {
    /**
     * <p>The ID of the OceanBase cluster.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The availability zone where the primary node is located.</p>
     */
    @NameInMap("MasterIntranetAddressZone")
    public String masterIntranetAddressZone;

    /**
     * <p>The switching mode.</p>
     */
    @NameInMap("ModifyType")
    public String modifyType;

    /**
     * <p>The primary zone of the tenant.    </p>
     * <p>It is one of the zones in which the cluster is deployed.</p>
     */
    @NameInMap("PrimaryZone")
    public String primaryZone;

    /**
     * <p>The deployment type of the primary zone.</p>
     */
    @NameInMap("PrimaryZoneDeployType")
    public String primaryZoneDeployType;

    /**
     * <p>The ID of the tenant.</p>
     */
    @NameInMap("TenantId")
    public String tenantId;

    /**
     * <p>The ID of the vSwitch.</p>
     */
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
