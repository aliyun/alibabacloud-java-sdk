// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyDBNodeClassRequest extends TeaModel {
    /**
     * <p>Specifies whether to automatically use a coupon. Valid values:</p>
     * <ul>
     * <li><p><code>true</code> (default): A coupon is automatically applied.</p>
     * </li>
     * <li><p><code>false</code>: A coupon is not applied.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AutoUseCoupon")
    public Boolean autoUseCoupon;

    /**
     * <p>A client-generated token that ensures the idempotence of the request. The token must be unique across requests. It is case-sensitive and can be up to 64 ASCII characters long.</p>
     * 
     * <strong>example:</strong>
     * <p>6000170000591aed949d0f54a343f1a4233c1e7d1c5c******</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The cloud provider of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>ENS</p>
     */
    @NameInMap("CloudProvider")
    public String cloudProvider;

    /**
     * <p>The cluster ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pc-*************</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The target node specifications for all nodes in the cluster. For more information, see <a href="https://help.aliyun.com/document_detail/102542.html">compute node specifications</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>polar.mysql.x4.large</p>
     */
    @NameInMap("DBNodeTargetClass")
    public String DBNodeTargetClass;

    /**
     * <p>To modify the specifications of an AI node, you must set this parameter to <code>DLNode</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>DLNode</p>
     */
    @NameInMap("DBNodeType")
    public String DBNodeType;

    /**
     * <p>The modification type. Valid values:</p>
     * <ul>
     * <li><p><strong>Upgrade</strong>: Upgrades the node specifications.</p>
     * </li>
     * <li><p><strong>Downgrade</strong>: Downgrades the node specifications.</p>
     * </li>
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
     * <p>The latest time to start the scheduled task. Specify the time in the <code>YYYY-MM-DDThh:mm:ssZ</code> format. The time must be in UTC.</p>
     * <blockquote>
     * <ul>
     * <li><p>The latest start time must be at least 30 minutes later than the earliest start time.</p>
     * </li>
     * <li><p>If you specify <code>PlannedStartTime</code> but omit this parameter, the latest start time defaults to <code>PlannedStartTime + 30 minutes</code>. For example, if you set <code>PlannedStartTime</code> to <code>2021-01-14T09:00:00Z</code> and leave this parameter empty, the task starts no later than <code>2021-01-14T09:30:00Z</code>.</p>
     * </li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2021-01-14T09:30:00Z</p>
     */
    @NameInMap("PlannedEndTime")
    public String plannedEndTime;

    /**
     * <p>The planned time for a transient disconnection. Specify the time in the <code>YYYY-MM-DDThh:mm:ssZ</code> format. The time must be in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-01-14T09:30:00Z</p>
     */
    @NameInMap("PlannedFlashingOffTime")
    public String plannedFlashingOffTime;

    /**
     * <p>The earliest time to start the scheduled upgrade or downgrade task. Specify the time in the <code>YYYY-MM-DDThh:mm:ssZ</code> format. The time must be in UTC.</p>
     * <blockquote>
     * <ul>
     * <li><p>This parameter is valid only when <code>ModifyType</code> is set to <code>Upgrade</code> or <code>Downgrade</code>.</p>
     * </li>
     * <li><p>The start time must be within the next 24 hours. For example, if the current time is <code>2021-01-14T09:00:00Z</code>, you can set the start time to a value in the range from <code>2021-01-14T09:00:00Z</code> to <code>2021-01-15T09:00:00Z</code>.</p>
     * </li>
     * <li><p>If you leave this parameter empty, the task is immediately executed.</p>
     * </li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2021-01-14T09:00:00Z</p>
     */
    @NameInMap("PlannedStartTime")
    public String plannedStartTime;

    /**
     * <p>The coupon code. If you omit this parameter, the system applies the default coupon.</p>
     * 
     * <strong>example:</strong>
     * <p>727xxxxxx934</p>
     */
    @NameInMap("PromotionCode")
    public String promotionCode;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The subcategory of the cluster. Valid values:</p>
     * <ul>
     * <li><p><strong>normal_exclusive</strong>: dedicated specifications</p>
     * </li>
     * <li><p><strong>normal_general</strong>: general-purpose specifications</p>
     * </li>
     * </ul>
     * <p>This parameter is required when switching between dedicated and general-purpose specifications.</p>
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

    public ModifyDBNodeClassRequest setAutoUseCoupon(Boolean autoUseCoupon) {
        this.autoUseCoupon = autoUseCoupon;
        return this;
    }
    public Boolean getAutoUseCoupon() {
        return this.autoUseCoupon;
    }

    public ModifyDBNodeClassRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ModifyDBNodeClassRequest setCloudProvider(String cloudProvider) {
        this.cloudProvider = cloudProvider;
        return this;
    }
    public String getCloudProvider() {
        return this.cloudProvider;
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

    public ModifyDBNodeClassRequest setPlannedFlashingOffTime(String plannedFlashingOffTime) {
        this.plannedFlashingOffTime = plannedFlashingOffTime;
        return this;
    }
    public String getPlannedFlashingOffTime() {
        return this.plannedFlashingOffTime;
    }

    public ModifyDBNodeClassRequest setPlannedStartTime(String plannedStartTime) {
        this.plannedStartTime = plannedStartTime;
        return this;
    }
    public String getPlannedStartTime() {
        return this.plannedStartTime;
    }

    public ModifyDBNodeClassRequest setPromotionCode(String promotionCode) {
        this.promotionCode = promotionCode;
        return this;
    }
    public String getPromotionCode() {
        return this.promotionCode;
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
