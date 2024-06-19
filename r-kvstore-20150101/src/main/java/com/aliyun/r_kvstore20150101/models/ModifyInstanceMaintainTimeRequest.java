// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class ModifyInstanceMaintainTimeRequest extends TeaModel {
    /**
     * <p>The ID of the instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>r-bp1zxszhcgatnx****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The end time of the maintenance window. The time is in the <em>HH:mm</em>Z format. The time is displayed in UTC. For example, if you want the maintenance window to end at 2:00 (UTC+8), set this parameter to <code>18:00Z</code>.</p>
     * <blockquote>
     * <p> The interval between the start time and the end time cannot be less than 1 hour.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>04:00Z</p>
     */
    @NameInMap("MaintainEndTime")
    public String maintainEndTime;

    /**
     * <p>The start time of the maintenance window. The time is in the <em>HH:mm</em>Z format. The time is displayed in UTC. For example, if you want the maintenance to start at 1:00 (UTC+8), set this parameter to <code>17:00Z</code>. After you call the API operation, you can view the actual time in the ApsaraDB for Redis console. For more information, see <a href="https://help.aliyun.com/document_detail/55252.html">Set a maintenance window</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>03:00Z</p>
     */
    @NameInMap("MaintainStartTime")
    public String maintainStartTime;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static ModifyInstanceMaintainTimeRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceMaintainTimeRequest self = new ModifyInstanceMaintainTimeRequest();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceMaintainTimeRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyInstanceMaintainTimeRequest setMaintainEndTime(String maintainEndTime) {
        this.maintainEndTime = maintainEndTime;
        return this;
    }
    public String getMaintainEndTime() {
        return this.maintainEndTime;
    }

    public ModifyInstanceMaintainTimeRequest setMaintainStartTime(String maintainStartTime) {
        this.maintainStartTime = maintainStartTime;
        return this;
    }
    public String getMaintainStartTime() {
        return this.maintainStartTime;
    }

    public ModifyInstanceMaintainTimeRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyInstanceMaintainTimeRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyInstanceMaintainTimeRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyInstanceMaintainTimeRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifyInstanceMaintainTimeRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
