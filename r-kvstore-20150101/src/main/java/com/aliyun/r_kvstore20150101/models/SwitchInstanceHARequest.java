// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class SwitchInstanceHARequest extends TeaModel {
    /**
     * <p>The ID of the instance. You can call the [DescribeInstances](~~60933~~) operation to query the ID of the instance.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The ID of the data shard. You can call the [DescribeRoleZoneInfo](~~190794~~) operation to obtain the value of the CustinsId parameter. Separate multiple data shard IDs with commas (,). `all` indicates that all data shards are specified.</p>
     * <br>
     * <p>> This parameter is available and required only for read/write splitting and cluster instances.</p>
     */
    @NameInMap("NodeId")
    public String nodeId;

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
     * <p>The time when to perform the switchover. Default value: 0. Valid values:</p>
     * <br>
     * <p>*   **0**: immediately performs the switchover.</p>
     * <p>*   **1**: performs the switchover during the maintenance window.</p>
     * <br>
     * <p>> You can call the [ModifyInstanceMaintainTime](~~61000~~) operation to modify the maintenance window of an ApsaraDB for Redis instance.</p>
     */
    @NameInMap("SwitchMode")
    public Integer switchMode;

    /**
     * <p>The switching mode. Valid values:</p>
     * <br>
     * <p>*   **AvailablePriority**: prioritizes the availability and performs a switchover immediately without considering the latency of data synchronization between the master and replica nodes. This may cause data loss.</p>
     * <p>*   **ReliabilityPriority**: prioritizes the reliability and performs a switchover after no latency of data synchronization between the master and replica nodes exists. This ensures data integrity. This mode may cause a switchover failure in scenarios that involve a large volume of data writes and persistent latency of data synchronization.</p>
     * <br>
     * <p>> You must evaluate the requirements for data and services based on your business scenarios and then select a switching mode.</p>
     */
    @NameInMap("SwitchType")
    public String switchType;

    public static SwitchInstanceHARequest build(java.util.Map<String, ?> map) throws Exception {
        SwitchInstanceHARequest self = new SwitchInstanceHARequest();
        return TeaModel.build(map, self);
    }

    public SwitchInstanceHARequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public SwitchInstanceHARequest setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

    public SwitchInstanceHARequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public SwitchInstanceHARequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public SwitchInstanceHARequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public SwitchInstanceHARequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public SwitchInstanceHARequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public SwitchInstanceHARequest setSwitchMode(Integer switchMode) {
        this.switchMode = switchMode;
        return this;
    }
    public Integer getSwitchMode() {
        return this.switchMode;
    }

    public SwitchInstanceHARequest setSwitchType(String switchType) {
        this.switchType = switchType;
        return this;
    }
    public String getSwitchType() {
        return this.switchType;
    }

}
