// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyActiveOperationTasksRequest extends TeaModel {
    /**
     * <p>The ID of the O\&M task. Separate multiple IDs with commas (,).</p>
     * <br>
     * <p>> You can call the DescribeActiveOperationTask operation to query the IDs of O\&M tasks.</p>
     */
    @NameInMap("Ids")
    public String ids;

    /**
     * <p>Specifies whether to immediately start scheduling. The value 0 indicates that scheduling is not immediately started. This is the default value. The value 1 indicates that scheduling is immediately started. If you set this parameter to 0, SwitchTime takes effect. If you set this parameter to 1, SwitchTimer does not take effect. In this case, the start time of the task is set to the current time, and the system determines the switching time based on the start time.</p>
     * <br>
     * <p>> Immediate scheduling indicates that the task enters the preparation state instead of the immediate switchover. After the preparation is complete, the switchover is performed. You can call the DescribeActiveOperationTasks operation to obtain the period of time for preparation. The period of time for preparation is returned in PrepareInterva.</p>
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
     * <p>The scheduled switching time that you want to specify. Specify the time in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
     * <br>
     * <p>> The time that you specify cannot be later than the deadline for performing the O\&M task. You can call DescribeActiveOperationTasks to query the deadlines of O\&M tasks. The deadline of a task is returned in Deadline.</p>
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
