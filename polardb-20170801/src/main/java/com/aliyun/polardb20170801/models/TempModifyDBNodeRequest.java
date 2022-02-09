// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class TempModifyDBNodeRequest extends TeaModel {
    // 幂等参数
    @NameInMap("ClientToken")
    public String clientToken;

    // 实例Id
    @NameInMap("DBClusterId")
    public String DBClusterId;

    @NameInMap("DBNode")
    public java.util.List<TempModifyDBNodeRequestDBNode> DBNode;

    // 变更类型
    @NameInMap("ModifyType")
    public String modifyType;

    // 操作类型（Add:增加节点; Modify:变配）
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

    // 变更还原时间(说明：还原时间不能早于当前时间推后1小时，不能晚于集群到期时间的前1天)
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
        @NameInMap("TargetClass")
        public String targetClass;

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
