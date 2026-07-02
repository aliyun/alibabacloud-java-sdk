// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class ModifyActiveOperationMaintainConfigRequest extends TeaModel {
    /**
     * <p>The days of the cycle.</p>
     * <ul>
     * <li><p>If <code>CycleType</code> is <code>Month</code>, specify the days of the month (1 to 28). Separate multiple days with a comma (,).</p>
     * </li>
     * <li><p>If <code>CycleType</code> is <code>Week</code>, specify the days of the week (1 to 7). Separate multiple days with a comma (,).</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1,2,3,4,5</p>
     */
    @NameInMap("CycleTime")
    public String cycleTime;

    /**
     * <p>The cycle type of the maintenance window. Valid values:</p>
     * <ul>
     * <li><p><code>Month</code></p>
     * </li>
     * <li><p><code>Week</code></p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Week</p>
     */
    @NameInMap("CycleType")
    public String cycleType;

    /**
     * <p>The end time of the maintenance window, specified in <em>HH:mm:ss</em>Z format (UTC time).</p>
     * 
     * <strong>example:</strong>
     * <p>20:00:00Z</p>
     */
    @NameInMap("MaintainEndTime")
    public String maintainEndTime;

    /**
     * <p>The start time of the maintenance window, specified in <em>HH:mm:ss</em>Z format (UTC time).</p>
     * 
     * <strong>example:</strong>
     * <p>16:00:00Z</p>
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

    /**
     * <p>Specifies whether the configuration is enabled. Valid values:</p>
     * <ul>
     * <li><p>1: enabled</p>
     * </li>
     * <li><p>2: disabled</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("Status")
    public Integer status;

    public static ModifyActiveOperationMaintainConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyActiveOperationMaintainConfigRequest self = new ModifyActiveOperationMaintainConfigRequest();
        return TeaModel.build(map, self);
    }

    public ModifyActiveOperationMaintainConfigRequest setCycleTime(String cycleTime) {
        this.cycleTime = cycleTime;
        return this;
    }
    public String getCycleTime() {
        return this.cycleTime;
    }

    public ModifyActiveOperationMaintainConfigRequest setCycleType(String cycleType) {
        this.cycleType = cycleType;
        return this;
    }
    public String getCycleType() {
        return this.cycleType;
    }

    public ModifyActiveOperationMaintainConfigRequest setMaintainEndTime(String maintainEndTime) {
        this.maintainEndTime = maintainEndTime;
        return this;
    }
    public String getMaintainEndTime() {
        return this.maintainEndTime;
    }

    public ModifyActiveOperationMaintainConfigRequest setMaintainStartTime(String maintainStartTime) {
        this.maintainStartTime = maintainStartTime;
        return this;
    }
    public String getMaintainStartTime() {
        return this.maintainStartTime;
    }

    public ModifyActiveOperationMaintainConfigRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyActiveOperationMaintainConfigRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyActiveOperationMaintainConfigRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyActiveOperationMaintainConfigRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifyActiveOperationMaintainConfigRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public ModifyActiveOperationMaintainConfigRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

}
