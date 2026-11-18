// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class ModifyActiveOperationTasksRequest extends TeaModel {
    /**
     * <p>The IDs of the O&amp;M events. Separate multiple IDs with commas (,).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1111721,1111718</p>
     */
    @NameInMap("Ids")
    public String ids;

    /**
     * <p>Specifies whether to immediately enter execution scheduling.</p>
     * <ul>
     * <li>0: no (default)</li>
     * <li>1: yes</li>
     * </ul>
     * <blockquote>
     * <p>If the value is 0, SwitchTime takes effect. If the value is 1, SwitchTime does not take effect, the event start time is set to the current time, and the switchover time is automatically calculated based on the new start time.
     * The event immediately enters execution scheduling but is not immediately switched over. Preparations for the switchover are performed, and the switchover is executed after the preparations are completed. You can call the DescribeActiveOperationTasks operation to obtain the preparation time from the value of the PrepareInterval response parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("ImmediateStart")
    public Integer immediateStart;

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

    /**
     * <p>The scheduled switchover time to set. The time must be in the yyyy-MM-ddTHH:mm:ssZ format (UTC).</p>
     * <blockquote>
     * <p>The time cannot be later than the deadline.
     * You can call the DescribeActiveOperationTasks operation to obtain the deadline from the value of the Deadline response parameter.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2019-10-17T18:50:00Z</p>
     */
    @NameInMap("SwitchTime")
    public String switchTime;

    public static ModifyActiveOperationTasksRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyActiveOperationTasksRequest self = new ModifyActiveOperationTasksRequest();
        return TeaModel.build(map, self);
    }

    public ModifyActiveOperationTasksRequest setIds(String ids) {
        this.ids = ids;
        return this;
    }
    public String getIds() {
        return this.ids;
    }

    public ModifyActiveOperationTasksRequest setImmediateStart(Integer immediateStart) {
        this.immediateStart = immediateStart;
        return this;
    }
    public Integer getImmediateStart() {
        return this.immediateStart;
    }

    public ModifyActiveOperationTasksRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyActiveOperationTasksRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyActiveOperationTasksRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyActiveOperationTasksRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifyActiveOperationTasksRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public ModifyActiveOperationTasksRequest setSwitchTime(String switchTime) {
        this.switchTime = switchTime;
        return this;
    }
    public String getSwitchTime() {
        return this.switchTime;
    }

}
