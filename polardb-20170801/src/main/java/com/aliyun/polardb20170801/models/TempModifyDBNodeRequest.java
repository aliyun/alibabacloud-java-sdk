// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class TempModifyDBNodeRequest extends TeaModel {
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
     * <p>The client token that is used to ensure the idempotency of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token is case-sensitive and can contain only ASCII characters. The token can be up to 64 characters in length.</p>
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
     * <p>The information about the node to be upgraded or added.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DBNode")
    public java.util.List<TempModifyDBNodeRequestDBNode> DBNode;

    /**
     * <p>The change type. The value is fixed as <strong>TempUpgrade</strong>.</p>
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
     * <li><strong>Modify</strong>: temporarily upgrades specifications.</li>
     * <li><strong>Add</strong>: temporarily adds nodes.</li>
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
     * <p>The restore time for the temporary upgrade. Specify the time in the YYYY-MM-DD hh:mm:ss format.</p>
     * <blockquote>
     * <p>The restore time cannot be earlier than 1 hour after the current time or later than 1 day before the cluster expiration time.</p>
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
         * <p>The specifications of the node to be upgraded or added.</p>
         * <blockquote>
         * <ul>
         * <li>When you add a node, the node specifications must be the same as those of the existing nodes.</li>
         * <li>For the specifications of existing cluster nodes, see <a href="https://help.aliyun.com/document_detail/98094.html">DescribeDBClusters</a>.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>polar.mysql.x4.medium</p>
         */
        @NameInMap("TargetClass")
        public String targetClass;

        /**
         * <p>The zone of the node to be added. The zone must be the same as that of the existing nodes.</p>
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
