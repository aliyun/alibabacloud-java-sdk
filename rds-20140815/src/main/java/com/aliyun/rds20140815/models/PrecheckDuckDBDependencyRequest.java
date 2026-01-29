// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class PrecheckDuckDBDependencyRequest extends TeaModel {
    /**
     * <p>The primary instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pgm-2zegy5pdkg58****</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <strong>example:</strong>
     * <p>readOnly</p>
     */
    @NameInMap("TargetMode")
    public String targetMode;

    public static PrecheckDuckDBDependencyRequest build(java.util.Map<String, ?> map) throws Exception {
        PrecheckDuckDBDependencyRequest self = new PrecheckDuckDBDependencyRequest();
        return TeaModel.build(map, self);
    }

    public PrecheckDuckDBDependencyRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public PrecheckDuckDBDependencyRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public PrecheckDuckDBDependencyRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public PrecheckDuckDBDependencyRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public PrecheckDuckDBDependencyRequest setTargetMode(String targetMode) {
        this.targetMode = targetMode;
        return this;
    }
    public String getTargetMode() {
        return this.targetMode;
    }

}
