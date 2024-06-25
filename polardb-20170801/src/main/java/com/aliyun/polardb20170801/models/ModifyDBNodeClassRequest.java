// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyDBNodeClassRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must ensure that it is unique among different requests. The token can only contain ASCII characters and cannot exceed 64 characters in length. The token is case-sensitive.</p>
     * 
     * <strong>example:</strong>
     * <p>6000170000591aed949d0f54a343f1a4233c1e7d1c5c******</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The ID of the cluster.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pc-*************</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The specifications of all nodes. For more information, see <a href="https://help.aliyun.com/document_detail/102542.html">Specifications of computing nodes</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>polar.mysql.x4.large</p>
     */
    @NameInMap("DBNodeTargetClass")
    public String DBNodeTargetClass;

    /**
     * <p>The type of the node. Valid values:</p>
     * <ul>
     * <li>RO</li>
     * <li>STANDBY</li>
     * <li>DLNode</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>DLNode</p>
     */
    @NameInMap("DBNodeType")
    public String DBNodeType;

    /**
     * <p>The type of the configuration change. Valid values:</p>
     * <ul>
     * <li><strong>Upgrade</strong></li>
     * <li><strong>Downgrade</strong></li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Upgrade</p>
     */
    @NameInMap("ModifyType")
    public String modifyType;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The latest start time to upgrade the specifications within the scheduled time period. Specify the time in the ISO 8601 standard in the <code>YYYY-MM-DDThh:mm:ssZ</code> format. The time must be in UTC.</p>
     * <blockquote>
     * <ul>
     * <li>The value of this parameter must be at least 30 minutes later than the value of PlannedStartTime.</li>
     * <li>By default, if you specify <code>PlannedStartTime</code> but do not specify PlannedEndTime, the latest start time of the task is set to <code>Value of PlannedEndTime + 30 minutes</code>. For example, if you set <code>PlannedStartTime</code> to <code>2021-01-14T09:00:00Z</code> and you do not specify PlannedEndTime, the latest start time of the task is <code>2021-01-14T09:30:00Z</code>.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2021-01-14T09:30:00Z</p>
     */
    @NameInMap("PlannedEndTime")
    public String plannedEndTime;

    /**
     * <p>The earliest start time to upgrade the specifications within the scheduled time period. Specify the time in the ISO 8601 standard in the <code>YYYY-MM-DDThh:mm:ssZ</code> format. The time must be in UTC.</p>
     * <blockquote>
     * <ul>
     * <li>This parameter takes effect only when <code>ModifyType</code> is set to <code>Upgrade</code>.</li>
     * <li>The earliest start time of the task can be a point in time within the next 24 hours. For example, if the current time is <code>2021-01-14T09:00:00Z</code>, you can specify a point in the time that ranges from <code>2021-01-14T09:00:00Z</code> to <code>2021-01-15T09:00:00Z</code>.</li>
     * <li>If this parameter is left empty, the upgrade task is immediately performed.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2021-01-14T09:00:00Z</p>
     */
    @NameInMap("PlannedStartTime")
    public String plannedStartTime;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The category of the cluster. Valid values:</p>
     * <ul>
     * <li><strong>normal_exclusive</strong>: dedicated.</li>
     * <li><strong>normal_general</strong>: genera-purpose.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>normal_general</p>
     */
    @NameInMap("SubCategory")
    public String subCategory;

    public static ModifyDBNodeClassRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBNodeClassRequest self = new ModifyDBNodeClassRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDBNodeClassRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ModifyDBNodeClassRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public ModifyDBNodeClassRequest setDBNodeTargetClass(String DBNodeTargetClass) {
        this.DBNodeTargetClass = DBNodeTargetClass;
        return this;
    }
    public String getDBNodeTargetClass() {
        return this.DBNodeTargetClass;
    }

    public ModifyDBNodeClassRequest setDBNodeType(String DBNodeType) {
        this.DBNodeType = DBNodeType;
        return this;
    }
    public String getDBNodeType() {
        return this.DBNodeType;
    }

    public ModifyDBNodeClassRequest setModifyType(String modifyType) {
        this.modifyType = modifyType;
        return this;
    }
    public String getModifyType() {
        return this.modifyType;
    }

    public ModifyDBNodeClassRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyDBNodeClassRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyDBNodeClassRequest setPlannedEndTime(String plannedEndTime) {
        this.plannedEndTime = plannedEndTime;
        return this;
    }
    public String getPlannedEndTime() {
        return this.plannedEndTime;
    }

    public ModifyDBNodeClassRequest setPlannedStartTime(String plannedStartTime) {
        this.plannedStartTime = plannedStartTime;
        return this;
    }
    public String getPlannedStartTime() {
        return this.plannedStartTime;
    }

    public ModifyDBNodeClassRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyDBNodeClassRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifyDBNodeClassRequest setSubCategory(String subCategory) {
        this.subCategory = subCategory;
        return this;
    }
    public String getSubCategory() {
        return this.subCategory;
    }

}
