// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class ModifyActiveOperationMaintainConfigRequest extends TeaModel {
    /**
     * <p>The interval between two O\&amp;M tasks.</p>
     * <ul>
     * <li>If the CycleType parameter is set to Month, the CycleTime parameter returns a string of numbers ranging from 1 to 28, which indicates the specific days of the month. The numbers are separated with commas (,). The CycleTime parameter returns 0 when the configurations do not take effect.</li>
     * <li>If the CycleType parameter is set to Week, the CycleTime parameter returns a string of numbers ranging from 1 to 7, which indicates the specific days of the week. The numbers are separated with commas (,). The CycleTime parameter returns 0 when the configurations do not take effect.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1,2,3,4,5</p>
     */
    @NameInMap("CycleTime")
    public String cycleTime;

    /**
     * <p>The unit of the billing cycle. Valid values:</p>
     * <ul>
     * <li>Month</li>
     * <li>Week</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Week</p>
     */
    @NameInMap("CycleType")
    public String cycleType;

    /**
     * <p>The end time of the O\&amp;M window. The time follows the ISO 8601 standard in the HH:mm:ssZ format. The time is displayed in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>20:00:00Z</p>
     */
    @NameInMap("MaintainEndTime")
    public String maintainEndTime;

    /**
     * <p>The start time of the O\&amp;M window. The time follows the ISO 8601 standard in the <em>HH:mm:ss</em> Z format. The time is displayed in UTC.</p>
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
     * <p>Specifies whether the configurations take effect. Valid values:</p>
     * <ul>
     * <li>1: The configurations take effect.</li>
     * <li>2: The configurations do not take effect.</li>
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
