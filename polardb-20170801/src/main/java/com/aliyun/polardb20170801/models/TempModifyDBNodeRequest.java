// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class TempModifyDBNodeRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the value. Make sure that the value is unique among different requests. The token can only contain ASCII characters and cannot exceed 64 characters in length.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The cluster ID.</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The information of the added node.</p>
     */
    @NameInMap("DBNode")
    public java.util.List<TempModifyDBNodeRequestDBNode> DBNode;

    /**
     * <p>The type of configuration change. Set the value to **TempUpgrade**.</p>
     */
    @NameInMap("ModifyType")
    public String modifyType;

    /**
     * <p>The type of operation performed on the cluster. Valid values:</p>
     * <br>
     * <p>*   **Add**: add one or more nodes to the cluster.</p>
     * <p>*   **Modify**: temporarily upgrade the configuration of the cluster.</p>
     */
    @NameInMap("OperationType")
    public String operationType;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The rollback time of the configuration for the temporary upgrade. Specify the time in the ISO 8601 standard in the YYYY-MM-DD hh:mm:ss format.</p>
     * <br>
     * <p>>  The rollback time cannot be 1 hour earlier than the current time and cannot be later than one day before the time when the cluster expires.</p>
     */
    @NameInMap("RestoreTime")
    public String restoreTime;

    public static TempModifyDBNodeRequest build(java.util.Map<String, ?> map) throws Exception {
        TempModifyDBNodeRequest self = new TempModifyDBNodeRequest();
        return TeaModel.build(map, self);
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
         * <p>The instance type of the added node. The instance type of the added node must be the same as the instance type of the original node.</p>
         * <br>
         * <p>>  You can call the [DescribeDBClusters](~~98094~~) operation to view the instance types of original nodes.</p>
         */
        @NameInMap("TargetClass")
        public String targetClass;

        /**
         * <p>The ID of the zone in which the added node is deployed. The instance type of the added node must be the same as the instance type of the original node.</p>
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
