// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyDBNodesClassRequest extends TeaModel {
    /**
     * <p>Specifies whether to automatically use coupons. Valid values:</p>
     * <ul>
     * <li>true (default): Uses coupons.</li>
     * <li>false: Does not use coupons.</li>
     * </ul>
     */
    @NameInMap("AutoUseCoupon")
    public Boolean autoUseCoupon;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the value. Make sure that the value is unique among different requests. The token is case-sensitive and cannot exceed 64 ASCII characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>6000170000591aed949d0f54a343f1a4233c1e7d1c5c******</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The cloud service provider to which the instance belongs.</p>
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
     * <p>The list of cluster nodes.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DBNode")
    public java.util.List<ModifyDBNodesClassRequestDBNode> DBNode;

    /**
     * <p>The type of the specification change. Valid values:</p>
     * <ul>
     * <li><p><strong>Upgrade</strong>: Upgrades the specifications.</p>
     * </li>
     * <li><p><strong>Downgrade</strong>: Downgrades the specifications.</p>
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
     * <p>The latest time to start the scheduled task. Specify the time in the <code>YYYY-MM-DDThh:mm:ssZ</code> format (UTC).</p>
     * <blockquote>
     * <ul>
     * <li>The latest time must be at least 30 minutes later than the start time.</li>
     * <li>If <code>PlannedStartTime</code> is set but this parameter is not specified, the latest time to execute the task defaults to <code>start time + 30 minutes</code>. For example, if <code>PlannedStartTime</code> is set to <code>2021-01-14T09:00:00Z</code> and this parameter is left empty, the task starts no later than <code>2021-01-14T09:30:00Z</code>.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2021-01-14T09:30:00Z</p>
     */
    @NameInMap("PlannedEndTime")
    public String plannedEndTime;

    /**
     * <p>The planned transient disconnection time.</p>
     * <p>The time is in the ISO 8601 format in UTC (format: YYYY-MM-DDTHH:mm:ssZ).</p>
     * 
     * <strong>example:</strong>
     * <p>2021-01-14T09:30:00Z</p>
     */
    @NameInMap("PlannedFlashingOffTime")
    public String plannedFlashingOffTime;

    /**
     * <p>The earliest time to start the scheduled (executed within the target time period) specification upgrade task. Specify the time in the <code>YYYY-MM-DDThh:mm:ssZ</code> format (UTC).</p>
     * <blockquote>
     * <ul>
     * <li>This parameter takes effect only when <code>ModifyType</code> is set to <code>Upgrade</code>.</li>
     * <li>The start time can be any time point within the next 24 hours. For example, if the current time is <code>2021-01-14T09:00:00Z</code>, the start time can range from <code>2021-01-14T09:00:00Z</code> to <code>2021-01-15T09:00:00Z</code>.</li>
     * <li>If this parameter is left empty, the specification upgrade task is immediately executed by default.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2021-01-14T09:00:00Z</p>
     */
    @NameInMap("PlannedStartTime")
    public String plannedStartTime;

    /**
     * <p>The coupon code. If this parameter is not specified, the default coupon is used.</p>
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
     * <p>The cluster sub-series. Valid values:</p>
     * <ul>
     * <li><p><strong>normal_exclusive</strong>: Dedicated</p>
     * </li>
     * <li><p><strong>normal_general</strong>: General-purpose</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>normal_general</p>
     */
    @NameInMap("SubCategory")
    public String subCategory;

    public static ModifyDBNodesClassRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBNodesClassRequest self = new ModifyDBNodesClassRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDBNodesClassRequest setAutoUseCoupon(Boolean autoUseCoupon) {
        this.autoUseCoupon = autoUseCoupon;
        return this;
    }
    public Boolean getAutoUseCoupon() {
        return this.autoUseCoupon;
    }

    public ModifyDBNodesClassRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ModifyDBNodesClassRequest setCloudProvider(String cloudProvider) {
        this.cloudProvider = cloudProvider;
        return this;
    }
    public String getCloudProvider() {
        return this.cloudProvider;
    }

    public ModifyDBNodesClassRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public ModifyDBNodesClassRequest setDBNode(java.util.List<ModifyDBNodesClassRequestDBNode> DBNode) {
        this.DBNode = DBNode;
        return this;
    }
    public java.util.List<ModifyDBNodesClassRequestDBNode> getDBNode() {
        return this.DBNode;
    }

    public ModifyDBNodesClassRequest setModifyType(String modifyType) {
        this.modifyType = modifyType;
        return this;
    }
    public String getModifyType() {
        return this.modifyType;
    }

    public ModifyDBNodesClassRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyDBNodesClassRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyDBNodesClassRequest setPlannedEndTime(String plannedEndTime) {
        this.plannedEndTime = plannedEndTime;
        return this;
    }
    public String getPlannedEndTime() {
        return this.plannedEndTime;
    }

    public ModifyDBNodesClassRequest setPlannedFlashingOffTime(String plannedFlashingOffTime) {
        this.plannedFlashingOffTime = plannedFlashingOffTime;
        return this;
    }
    public String getPlannedFlashingOffTime() {
        return this.plannedFlashingOffTime;
    }

    public ModifyDBNodesClassRequest setPlannedStartTime(String plannedStartTime) {
        this.plannedStartTime = plannedStartTime;
        return this;
    }
    public String getPlannedStartTime() {
        return this.plannedStartTime;
    }

    public ModifyDBNodesClassRequest setPromotionCode(String promotionCode) {
        this.promotionCode = promotionCode;
        return this;
    }
    public String getPromotionCode() {
        return this.promotionCode;
    }

    public ModifyDBNodesClassRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyDBNodesClassRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifyDBNodesClassRequest setSubCategory(String subCategory) {
        this.subCategory = subCategory;
        return this;
    }
    public String getSubCategory() {
        return this.subCategory;
    }

    public static class ModifyDBNodesClassRequestDBNode extends TeaModel {
        /**
         * <p>The cluster node ID.</p>
         * <blockquote>
         * <p>If this parameter is specified, DBNode.N.TargetClass is required. N is an integer that starts from 1. Maximum value: 16 minus the current number of nodes.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>pi-*************</p>
         */
        @NameInMap("DBNodeId")
        public String DBNodeId;

        /**
         * <p>The specifications of the node to be changed. For more information about node specifications, see <a href="https://help.aliyun.com/document_detail/102542.html">Compute node specifications</a>. </p>
         * <blockquote>
         * <p>If this parameter is specified, DBNode.N.DBNodeId is required. N is an integer that starts from 1. Maximum value: 16 minus the current number of nodes.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>polar.mysql.x4.medium</p>
         */
        @NameInMap("TargetClass")
        public String targetClass;

        public static ModifyDBNodesClassRequestDBNode build(java.util.Map<String, ?> map) throws Exception {
            ModifyDBNodesClassRequestDBNode self = new ModifyDBNodesClassRequestDBNode();
            return TeaModel.build(map, self);
        }

        public ModifyDBNodesClassRequestDBNode setDBNodeId(String DBNodeId) {
            this.DBNodeId = DBNodeId;
            return this;
        }
        public String getDBNodeId() {
            return this.DBNodeId;
        }

        public ModifyDBNodesClassRequestDBNode setTargetClass(String targetClass) {
            this.targetClass = targetClass;
            return this;
        }
        public String getTargetClass() {
            return this.targetClass;
        }

    }

}
