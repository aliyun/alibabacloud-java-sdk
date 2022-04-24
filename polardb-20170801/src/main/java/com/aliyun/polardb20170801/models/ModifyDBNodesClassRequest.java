// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyDBNodesClassRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("DBClusterId")
    public String DBClusterId;

    @NameInMap("DBNode")
    public java.util.List<ModifyDBNodesClassRequestDBNode> DBNode;

    @NameInMap("ModifyType")
    public String modifyType;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("PlannedEndTime")
    public String plannedEndTime;

    @NameInMap("PlannedStartTime")
    public String plannedStartTime;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("SubCategory")
    public String subCategory;

    public static ModifyDBNodesClassRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBNodesClassRequest self = new ModifyDBNodesClassRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDBNodesClassRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
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

    public ModifyDBNodesClassRequest setPlannedStartTime(String plannedStartTime) {
        this.plannedStartTime = plannedStartTime;
        return this;
    }
    public String getPlannedStartTime() {
        return this.plannedStartTime;
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
        @NameInMap("DBNodeId")
        public String DBNodeId;

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
