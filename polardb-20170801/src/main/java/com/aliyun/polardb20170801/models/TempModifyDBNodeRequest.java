// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class TempModifyDBNodeRequest extends TeaModel {
    @NameInMap("AutoUseCoupon")
    public Boolean autoUseCoupon;

    /**
     * <p>A client token to ensure the idempotence of the request. Generate a unique token for each request. The token is case-sensitive and can be up to 64 ASCII characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>6000170000591aed949d0f5********************</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The cluster ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pc-xxxxxxxxxx</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The information about the nodes to upgrade or add.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DBNode")
    public java.util.List<TempModifyDBNodeRequestDBNode> DBNode;

    /**
     * <p>The modification type. The value is fixed to <strong>TempUpgrade</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>TempUpgrade</p>
     */
    @NameInMap("ModifyType")
    public String modifyType;

    /**
     * <p>The operation type. Valid values:</p>
     * <ul>
     * <li><p><strong>Modify</strong>: temporary upgrade</p>
     * </li>
     * <li><p><strong>Add</strong>: temporarily add a node</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Modify</p>
     */
    @NameInMap("OperationType")
    public String operationType;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
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
     * <p>The time to revert the temporary upgrade. The format is YYYY-MM-DD hh:mm:ss.</p>
     * <blockquote>
     * <p>The revert time must be at least 1 hour later than the current time. It must also be at least 1 day before the cluster expires.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-09-23 18:16:00</p>
     */
    @NameInMap("RestoreTime")
    public String restoreTime;

    public static TempModifyDBNodeRequest build(java.util.Map<String, ?> map) throws Exception {
        TempModifyDBNodeRequest self = new TempModifyDBNodeRequest();
        return TeaModel.build(map, self);
    }

    public TempModifyDBNodeRequest setAutoUseCoupon(Boolean autoUseCoupon) {
        this.autoUseCoupon = autoUseCoupon;
        return this;
    }
    public Boolean getAutoUseCoupon() {
        return this.autoUseCoupon;
    }

    public TempModifyDBNodeRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public TempModifyDBNodeRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public TempModifyDBNodeRequest setDBNode(java.util.List<TempModifyDBNodeRequestDBNode> DBNode) {
        this.DBNode = DBNode;
        return this;
    }
    public java.util.List<TempModifyDBNodeRequestDBNode> getDBNode() {
        return this.DBNode;
    }

    public TempModifyDBNodeRequest setModifyType(String modifyType) {
        this.modifyType = modifyType;
        return this;
    }
    public String getModifyType() {
        return this.modifyType;
    }

    public TempModifyDBNodeRequest setOperationType(String operationType) {
        this.operationType = operationType;
        return this;
    }
    public String getOperationType() {
        return this.operationType;
    }

    public TempModifyDBNodeRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public TempModifyDBNodeRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public TempModifyDBNodeRequest setPromotionCode(String promotionCode) {
        this.promotionCode = promotionCode;
        return this;
    }
    public String getPromotionCode() {
        return this.promotionCode;
    }

    public TempModifyDBNodeRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public TempModifyDBNodeRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public TempModifyDBNodeRequest setRestoreTime(String restoreTime) {
        this.restoreTime = restoreTime;
        return this;
    }
    public String getRestoreTime() {
        return this.restoreTime;
    }

    public static class TempModifyDBNodeRequestDBNode extends TeaModel {
        /**
         * <p>The specifications of the node to upgrade or add.</p>
         * <blockquote>
         * <ul>
         * <li><p>When you add a node, the node specifications must be the same as the specifications of the existing nodes.</p>
         * </li>
         * <li><p>For more information about the specifications of existing cluster nodes, see <a href="https://help.aliyun.com/document_detail/98094.html">DescribeDBClusters</a>.</p>
         * </li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>polar.mysql.x4.medium</p>
         */
        @NameInMap("TargetClass")
        public String targetClass;

        /**
         * <p>The zone for the new node. The zone must be the same as the zone of the existing nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-i</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        public static TempModifyDBNodeRequestDBNode build(java.util.Map<String, ?> map) throws Exception {
            TempModifyDBNodeRequestDBNode self = new TempModifyDBNodeRequestDBNode();
            return TeaModel.build(map, self);
        }

        public TempModifyDBNodeRequestDBNode setTargetClass(String targetClass) {
            this.targetClass = targetClass;
            return this;
        }
        public String getTargetClass() {
            return this.targetClass;
        }

        public TempModifyDBNodeRequestDBNode setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

}
