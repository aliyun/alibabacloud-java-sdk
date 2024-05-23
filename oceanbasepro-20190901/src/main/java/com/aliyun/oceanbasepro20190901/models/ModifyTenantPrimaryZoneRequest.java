// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class ModifyTenantPrimaryZoneRequest extends TeaModel {
    /**
     * <p>The primary zone of the tenant.    </p>
     * <p>It is one of the zones in which the cluster is deployed.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>```</p>
     * <p>http(s)://[Endpoint]/?Action=ModifyTenantPrimaryZone</p>
     * <p>&TenantId=ob2mr3oae0****</p>
     * <p>&InstanceId=ob317v4uif****</p>
     * <p>&PrimaryZone=cn-hangzhou-h</p>
     * <p>&Common request parameters</p>
     * <p>```</p>
     */
    @NameInMap("MasterIntranetAddressZone")
    public String masterIntranetAddressZone;

    /**
     * <p>The ID of the vSwitch.</p>
     */
    @NameInMap("PrimaryZone")
    public String primaryZone;

    @NameInMap("TenantEndpointDirectId")
    public String tenantEndpointDirectId;

    @NameInMap("TenantEndpointId")
    public String tenantEndpointId;

    /**
     * <p>The return result of the request.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("TenantId")
    public String tenantId;

    @NameInMap("UserDirectVSwitchId")
    public String userDirectVSwitchId;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("UserVSwitchId")
    public String userVSwitchId;

    @NameInMap("UserVpcOwnerId")
    public String userVpcOwnerId;

    @NameInMap("VpcId")
    public String vpcId;

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

    public ModifyTenantPrimaryZoneRequest setPrimaryZone(String primaryZone) {
        this.primaryZone = primaryZone;
        return this;
    }
    public String getPrimaryZone() {
        return this.primaryZone;
    }

    public ModifyTenantPrimaryZoneRequest setTenantEndpointDirectId(String tenantEndpointDirectId) {
        this.tenantEndpointDirectId = tenantEndpointDirectId;
        return this;
    }
    public String getTenantEndpointDirectId() {
        return this.tenantEndpointDirectId;
    }

    public ModifyTenantPrimaryZoneRequest setTenantEndpointId(String tenantEndpointId) {
        this.tenantEndpointId = tenantEndpointId;
        return this;
    }
    public String getTenantEndpointId() {
        return this.tenantEndpointId;
    }

    public ModifyTenantPrimaryZoneRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public ModifyTenantPrimaryZoneRequest setUserDirectVSwitchId(String userDirectVSwitchId) {
        this.userDirectVSwitchId = userDirectVSwitchId;
        return this;
    }
    public String getUserDirectVSwitchId() {
        return this.userDirectVSwitchId;
    }

    public ModifyTenantPrimaryZoneRequest setUserVSwitchId(String userVSwitchId) {
        this.userVSwitchId = userVSwitchId;
        return this;
    }
    public String getUserVSwitchId() {
        return this.userVSwitchId;
    }

    public ModifyTenantPrimaryZoneRequest setUserVpcOwnerId(String userVpcOwnerId) {
        this.userVpcOwnerId = userVpcOwnerId;
        return this;
    }
    public String getUserVpcOwnerId() {
        return this.userVpcOwnerId;
    }

    public ModifyTenantPrimaryZoneRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

}
