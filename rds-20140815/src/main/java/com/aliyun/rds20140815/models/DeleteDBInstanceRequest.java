// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DeleteDBInstanceRequest extends TeaModel {
    /**
     * <p>The instance ID. You can call the DescribeDBInstances operation to query the instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-uf6wjk5****</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The policy that is used to retain archived backup files if the instance is released. Default value: None. Valid values:</p>
     * <ul>
     * <li><strong>None</strong>: No archived backup files are retained.</li>
     * <li><strong>Lastest</strong>: Only the last archived backup file is retained.</li>
     * <li><strong>All</strong>: All archived backup files are retained.</li>
     * </ul>
     * <blockquote>
     * <p>This parameter is supported only for ApsaraDB RDS for MySQL instance with local disks.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Lastest</p>
     */
    @NameInMap("ReleasedKeepPolicy")
    public String releasedKeepPolicy;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static DeleteDBInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDBInstanceRequest self = new DeleteDBInstanceRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDBInstanceRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public DeleteDBInstanceRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DeleteDBInstanceRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DeleteDBInstanceRequest setReleasedKeepPolicy(String releasedKeepPolicy) {
        this.releasedKeepPolicy = releasedKeepPolicy;
        return this;
    }
    public String getReleasedKeepPolicy() {
        return this.releasedKeepPolicy;
    }

    public DeleteDBInstanceRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DeleteDBInstanceRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
