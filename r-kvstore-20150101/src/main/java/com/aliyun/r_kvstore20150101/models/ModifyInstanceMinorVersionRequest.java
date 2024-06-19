// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class ModifyInstanceMinorVersionRequest extends TeaModel {
    /**
     * <p>The time when the minor version is updated. Valid values:</p>
     * <ul>
     * <li><strong>Immediately</strong>: The minor version is immediately updated.</li>
     * <li><strong>MaintainTime</strong>: The minor version is updated within the maintenance window.</li>
     * </ul>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/61000.html">ModifyInstanceMaintainTime</a> operation to modify the maintenance window of an ApsaraDB for Redis instance.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Immediately</p>
     */
    @NameInMap("EffectiveTime")
    public String effectiveTime;

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
     * <p>The minor version to which you want to update. Default value: <strong>latest_version</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>latest_version</p>
     */
    @NameInMap("Minorversion")
    public String minorversion;

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

    public static ModifyInstanceMinorVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceMinorVersionRequest self = new ModifyInstanceMinorVersionRequest();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceMinorVersionRequest setEffectiveTime(String effectiveTime) {
        this.effectiveTime = effectiveTime;
        return this;
    }
    public String getEffectiveTime() {
        return this.effectiveTime;
    }

    public ModifyInstanceMinorVersionRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyInstanceMinorVersionRequest setMinorversion(String minorversion) {
        this.minorversion = minorversion;
        return this;
    }
    public String getMinorversion() {
        return this.minorversion;
    }

    public ModifyInstanceMinorVersionRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyInstanceMinorVersionRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyInstanceMinorVersionRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyInstanceMinorVersionRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifyInstanceMinorVersionRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
