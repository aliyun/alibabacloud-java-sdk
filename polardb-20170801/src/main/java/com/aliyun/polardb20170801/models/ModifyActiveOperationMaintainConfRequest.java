// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyActiveOperationMaintainConfRequest extends TeaModel {
    /**
     * <p>The remark for the operation.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Comment")
    public String comment;

    /**
     * <p>The cycle time.</p>
     * <ul>
     * <li>If CycleType is set to Month, the value is a number from 1 to 28, which indicates the day of the month. Multiple values are separated by commas (,).</li>
     * <li>If CycleType is set to Week, the value is a number from 1 to 7, which indicates the day of the week. Multiple values are separated by commas (,).</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CycleTime")
    public String cycleTime;

    /**
     * <p>The cycle type. Valid values:</p>
     * <ul>
     * <li>Month: Monthly.</li>
     * <li>Week: Weekly.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Week</p>
     */
    @NameInMap("CycleType")
    public String cycleType;

    /**
     * <p>The end time of the maintenance window. Specify the time in the HH:mmZ-HH:mmZ format. The time must be in UTC. Note: The format is explicitly declared as HH:mm:ssZ, and example values are updated to actual available formats such as 02:00:00Z and 06:00:00Z.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>12:00Z</p>
     */
    @NameInMap("MaintainEndTime")
    public String maintainEndTime;

    /**
     * <p>The start time of the task. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC. Note: The format is explicitly declared as HH:mm:ssZ, and example values are updated to actual available formats such as 02:00:00Z and 06:00:00Z.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>8:00Z</p>
     */
    @NameInMap("MaintainStartTime")
    public String maintainStartTime;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-chengdu</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-************</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("SecurityToken")
    public String securityToken;

    /**
     * <p>Specifies whether the configuration takes effect. Valid values:</p>
     * <ul>
     * <li>1: Yes.</li>
     * <li>2: No.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Status")
    public Long status;

    public static ModifyActiveOperationMaintainConfRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyActiveOperationMaintainConfRequest self = new ModifyActiveOperationMaintainConfRequest();
        return TeaModel.build(map, self);
    }

    public ModifyActiveOperationMaintainConfRequest setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public ModifyActiveOperationMaintainConfRequest setCycleTime(String cycleTime) {
        this.cycleTime = cycleTime;
        return this;
    }
    public String getCycleTime() {
        return this.cycleTime;
    }

    public ModifyActiveOperationMaintainConfRequest setCycleType(String cycleType) {
        this.cycleType = cycleType;
        return this;
    }
    public String getCycleType() {
        return this.cycleType;
    }

    public ModifyActiveOperationMaintainConfRequest setMaintainEndTime(String maintainEndTime) {
        this.maintainEndTime = maintainEndTime;
        return this;
    }
    public String getMaintainEndTime() {
        return this.maintainEndTime;
    }

    public ModifyActiveOperationMaintainConfRequest setMaintainStartTime(String maintainStartTime) {
        this.maintainStartTime = maintainStartTime;
        return this;
    }
    public String getMaintainStartTime() {
        return this.maintainStartTime;
    }

    public ModifyActiveOperationMaintainConfRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyActiveOperationMaintainConfRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyActiveOperationMaintainConfRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyActiveOperationMaintainConfRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ModifyActiveOperationMaintainConfRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyActiveOperationMaintainConfRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifyActiveOperationMaintainConfRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public ModifyActiveOperationMaintainConfRequest setStatus(Long status) {
        this.status = status;
        return this;
    }
    public Long getStatus() {
        return this.status;
    }

}
