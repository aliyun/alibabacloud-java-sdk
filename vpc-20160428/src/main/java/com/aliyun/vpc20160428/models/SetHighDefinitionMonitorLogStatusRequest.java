// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class SetHighDefinitionMonitorLogStatusRequest extends TeaModel {
    /**
     * <p>The ID of the instance for which you want to configure fine-grained monitoring.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>eip-wz9fi6qboho9fwgx7****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The instance type. Set the value to <strong>EIP</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>EIP</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    /**
     * <p>The name of the Simple Log Service (SLS) project.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>hdmonitor-cn-shenzhen</p>
     */
    @NameInMap("LogProject")
    public String logProject;

    /**
     * <p>The name of the Logstore.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>hdmonitor</p>
     */
    @NameInMap("LogStore")
    public String logStore;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID of the instance.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The status of fine-grained monitoring. Valid values:</p>
     * <ul>
     * <li><strong>ON</strong></li>
     * <li><strong>OFF</strong></li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ON</p>
     */
    @NameInMap("Status")
    public String status;

    public static SetHighDefinitionMonitorLogStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        SetHighDefinitionMonitorLogStatusRequest self = new SetHighDefinitionMonitorLogStatusRequest();
        return TeaModel.build(map, self);
    }

    public SetHighDefinitionMonitorLogStatusRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public SetHighDefinitionMonitorLogStatusRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public SetHighDefinitionMonitorLogStatusRequest setLogProject(String logProject) {
        this.logProject = logProject;
        return this;
    }
    public String getLogProject() {
        return this.logProject;
    }

    public SetHighDefinitionMonitorLogStatusRequest setLogStore(String logStore) {
        this.logStore = logStore;
        return this;
    }
    public String getLogStore() {
        return this.logStore;
    }

    public SetHighDefinitionMonitorLogStatusRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public SetHighDefinitionMonitorLogStatusRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public SetHighDefinitionMonitorLogStatusRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public SetHighDefinitionMonitorLogStatusRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public SetHighDefinitionMonitorLogStatusRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public SetHighDefinitionMonitorLogStatusRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
