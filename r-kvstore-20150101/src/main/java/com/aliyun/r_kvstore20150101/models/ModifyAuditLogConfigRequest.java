// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class ModifyAuditLogConfigRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable the audit log feature. Default value: true. Valid values:</p>
     * <br>
     * <p>*   **true**: enables the audit log feature.</p>
     * <p>*   **false**: disables the audit log feature.</p>
     * <br>
     * <p>> If the instance uses the [cluster architecture](~~52228~~) or [read/write splitting architecture](~~62870~~), the audit log feature is enabled or disabled for both the data nodes and proxy nodes. You cannot separately enable the audit log feature for the data nodes or proxy nodes.</p>
     */
    @NameInMap("DbAudit")
    public Boolean dbAudit;

    /**
     * <p>The ID of the instance. You can call the [DescribeInstances](~~60933~~) operation to query the ID of the instance.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The retention period of audit logs. Valid values: **1** to **365**. Unit: days.</p>
     * <br>
     * <p>> *   This parameter is required only if the **DbAudit** parameter is set to **true**.</p>
     * <p>> *   The value of this parameter takes effect for all ApsaraDB for Redis instances in the current region.</p>
     */
    @NameInMap("Retention")
    public Integer retention;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static ModifyAuditLogConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyAuditLogConfigRequest self = new ModifyAuditLogConfigRequest();
        return TeaModel.build(map, self);
    }

    public ModifyAuditLogConfigRequest setDbAudit(Boolean dbAudit) {
        this.dbAudit = dbAudit;
        return this;
    }
    public Boolean getDbAudit() {
        return this.dbAudit;
    }

    public ModifyAuditLogConfigRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyAuditLogConfigRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyAuditLogConfigRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyAuditLogConfigRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyAuditLogConfigRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifyAuditLogConfigRequest setRetention(Integer retention) {
        this.retention = retention;
        return this;
    }
    public Integer getRetention() {
        return this.retention;
    }

    public ModifyAuditLogConfigRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
