// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyDBNodesClassRequest extends TeaModel {
    /**
     * <p>Specifies whether to automatically use a coupon. Valid values:</p>
     * <ul>
     * <li>true (default): Uses the coupon.</li>
     * <li>false: Does not use the coupon.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AutoUseCoupon")
    public Boolean autoUseCoupon;

    /**
     * <p>The client token that is used to ensure the idempotence of the request and prevent duplicate submissions. You can generate the value of this parameter on the client side. The value must be unique across different requests and is case-sensitive. It can be up to 64 ASCII characters in length.</p>
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
     * <p>The list of cluster nodes. If the cluster contains a node with HotReplicaMode set to ON, you must include all DBNodes (writer and reader nodes) in the same request, and the TargetClass of each node must be identical. Usage notes: HotReplicaMode scenario constraints: If the cluster contains a node with HotReplicaMode set to ON, you must include all DBNodes (writer and reader nodes) in the same request, and their TargetClass values must be identical.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("DBNode")
    public java.util.List<ModifyDBNodesClassRequestDBNode> DBNode;

    /**
     * <p>The modification type. Valid values:</p>
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
     * <p>The latest time to start the scheduled task. The format is <code>YYYY-MM-DDThh:mm:ssZ</code> (UTC).</p>
     * <blockquote>
     * <ul>
     * <li>The latest time must be at least 30 minutes later than the start time.</li>
     * <li>If <code>PlannedStartTime</code> is specified but this parameter is not, the latest time to start the task defaults to the start time plus 30 minutes. For example, if <code>PlannedStartTime</code> is set to <code>2021-01-14T09:00:00Z</code> and this parameter is left empty, the task will start at <code>2021-01-14T09:30:00Z</code> at the latest.</li>
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
     * <p>The time follows the ISO 8601 standard in the UTC time zone. The format is YYYY-MM-DDTHH:mm:ssZ.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-01-14T09:30:00Z</p>
     */
    @NameInMap("PlannedFlashingOffTime")
    public String plannedFlashingOffTime;

    /**
     * <p>The earliest time to start the scheduled configuration upgrade task. The format is <code>YYYY-MM-DDThh:mm:ssZ</code> (UTC).</p>
     * <blockquote>
     * <ul>
     * <li>This parameter takes effect only when <code>ModifyType</code> is set to <code>Upgrade</code>.</li>
     * <li>The start time can be any time within the next 24 hours. For example, if the current time is <code>2021-01-14T09:00:00Z</code>, the allowed start time ranges from <code>2021-01-14T09:00:00Z</code> to <code>2021-01-15T09:00:00Z</code>.</li>
     * <li>If this parameter is left empty, the configuration upgrade task is executed immediately by default.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2021-01-14T09:00:00Z</p>
     */
    @NameInMap("PlannedStartTime")
    public String plannedStartTime;

    /**
     * <p>The coupon code. If this parameter is left empty, the default coupon is used.</p>
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
     * <p>The sub-edition of the cluster. Valid values:</p>
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
         * <p>The ID of the cluster node.</p>
         * <blockquote>
         * <p>If this parameter is specified, DBNode.N.TargetClass is required. N is an integer starting from 1, and the maximum value is 16 minus the current number of nodes.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>pi-*************</p>
         */
        @NameInMap("DBNodeId")
        public String DBNodeId;

        /**
         * <p>The specifications of the node to be modified. For more information about node specifications, see <a href="https://help.aliyun.com/document_detail/102542.html">Compute node specifications</a>. </p>
         * <blockquote>
         * <p>If this parameter is specified, DBNode.N.DBNodeId is required. N is an integer starting from 1, and the maximum value is 16 minus the current number of nodes.</p>
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
