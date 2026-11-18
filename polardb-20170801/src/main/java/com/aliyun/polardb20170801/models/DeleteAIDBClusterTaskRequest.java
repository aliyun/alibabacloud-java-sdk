// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DeleteAIDBClusterTaskRequest extends TeaModel {
    /**
     * <p>The task ID. Note: This parameter specifies the ID of the model operator task instance created by calling CreateAIDBClusterTask, which is prefixed with pm-<em>. It does not refer to the PolarDB cluster ID, which is prefixed with pc-</em>. You can obtain the task ID by calling DescribeAIDBClusterTasks.</p>
     * 
     * <strong>example:</strong>
     * <p>pm-2ze9***</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The PolarDB database instance ID for AI model services. Note: When you invoke this operation, this parameter is practically required. If it is not provided, a valid DBClusterId will result in an InvalidDBClusterId.Malformed (400) error. This parameter specifies the parent PolarDB AI cluster (prefixed with pc-*) to which the task belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>pc-2zejpr***</p>
     */
    @NameInMap("RelativeDBClusterId")
    public String relativeDBClusterId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static DeleteAIDBClusterTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAIDBClusterTaskRequest self = new DeleteAIDBClusterTaskRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAIDBClusterTaskRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DeleteAIDBClusterTaskRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DeleteAIDBClusterTaskRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DeleteAIDBClusterTaskRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DeleteAIDBClusterTaskRequest setRelativeDBClusterId(String relativeDBClusterId) {
        this.relativeDBClusterId = relativeDBClusterId;
        return this;
    }
    public String getRelativeDBClusterId() {
        return this.relativeDBClusterId;
    }

    public DeleteAIDBClusterTaskRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DeleteAIDBClusterTaskRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
