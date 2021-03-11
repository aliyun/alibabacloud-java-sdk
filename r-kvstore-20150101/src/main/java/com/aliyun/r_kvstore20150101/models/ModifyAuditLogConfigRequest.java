// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class ModifyAuditLogConfigRequest extends TeaModel {
    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("AuditLogSwitchSource")
    public String auditLogSwitchSource;

    @NameInMap("ServiceType")
    public String serviceType;

    @NameInMap("Retention")
    public Integer retention;

    @NameInMap("ProxyAudit")
    public String proxyAudit;

    @NameInMap("DbAudit")
    public Boolean dbAudit;

    @NameInMap("AuditCommand")
    public String auditCommand;

    public static ModifyAuditLogConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyAuditLogConfigRequest self = new ModifyAuditLogConfigRequest();
        return TeaModel.build(map, self);
    }

    public ModifyAuditLogConfigRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
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

    public ModifyAuditLogConfigRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyAuditLogConfigRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyAuditLogConfigRequest setAuditLogSwitchSource(String auditLogSwitchSource) {
        this.auditLogSwitchSource = auditLogSwitchSource;
        return this;
    }
    public String getAuditLogSwitchSource() {
        return this.auditLogSwitchSource;
    }

    public ModifyAuditLogConfigRequest setServiceType(String serviceType) {
        this.serviceType = serviceType;
        return this;
    }
    public String getServiceType() {
        return this.serviceType;
    }

    public ModifyAuditLogConfigRequest setRetention(Integer retention) {
        this.retention = retention;
        return this;
    }
    public Integer getRetention() {
        return this.retention;
    }

    public ModifyAuditLogConfigRequest setProxyAudit(String proxyAudit) {
        this.proxyAudit = proxyAudit;
        return this;
    }
    public String getProxyAudit() {
        return this.proxyAudit;
    }

    public ModifyAuditLogConfigRequest setDbAudit(Boolean dbAudit) {
        this.dbAudit = dbAudit;
        return this;
    }
    public Boolean getDbAudit() {
        return this.dbAudit;
    }

    public ModifyAuditLogConfigRequest setAuditCommand(String auditCommand) {
        this.auditCommand = auditCommand;
        return this;
    }
    public String getAuditCommand() {
        return this.auditCommand;
    }

}
