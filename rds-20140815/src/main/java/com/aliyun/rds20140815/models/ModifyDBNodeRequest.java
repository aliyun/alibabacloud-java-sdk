// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyDBNodeRequest extends TeaModel {
    @NameInMap("AutoPay")
    public Boolean autoPay;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    @NameInMap("DBInstanceStorage")
    public String DBInstanceStorage;

    @NameInMap("DBInstanceStorageType")
    public String DBInstanceStorageType;

    @NameInMap("DBNode")
    public java.util.List<ModifyDBNodeRequestDBNode> DBNode;

    @NameInMap("DryRun")
    public Boolean dryRun;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ProduceAsync")
    public Boolean produceAsync;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static ModifyDBNodeRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBNodeRequest self = new ModifyDBNodeRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDBNodeRequest setAutoPay(Boolean autoPay) {
        this.autoPay = autoPay;
        return this;
    }
    public Boolean getAutoPay() {
        return this.autoPay;
    }

    public ModifyDBNodeRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ModifyDBNodeRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public ModifyDBNodeRequest setDBInstanceStorage(String DBInstanceStorage) {
        this.DBInstanceStorage = DBInstanceStorage;
        return this;
    }
    public String getDBInstanceStorage() {
        return this.DBInstanceStorage;
    }

    public ModifyDBNodeRequest setDBInstanceStorageType(String DBInstanceStorageType) {
        this.DBInstanceStorageType = DBInstanceStorageType;
        return this;
    }
    public String getDBInstanceStorageType() {
        return this.DBInstanceStorageType;
    }

    public ModifyDBNodeRequest setDBNode(java.util.List<ModifyDBNodeRequestDBNode> DBNode) {
        this.DBNode = DBNode;
        return this;
    }
    public java.util.List<ModifyDBNodeRequestDBNode> getDBNode() {
        return this.DBNode;
    }

    public ModifyDBNodeRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public ModifyDBNodeRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyDBNodeRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyDBNodeRequest setProduceAsync(Boolean produceAsync) {
        this.produceAsync = produceAsync;
        return this;
    }
    public Boolean getProduceAsync() {
        return this.produceAsync;
    }

    public ModifyDBNodeRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyDBNodeRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public static class ModifyDBNodeRequestDBNode extends TeaModel {
        @NameInMap("classCode")
        public String classCode;

        @NameInMap("nodeId")
        public String nodeId;

        public static ModifyDBNodeRequestDBNode build(java.util.Map<String, ?> map) throws Exception {
            ModifyDBNodeRequestDBNode self = new ModifyDBNodeRequestDBNode();
            return TeaModel.build(map, self);
        }

        public ModifyDBNodeRequestDBNode setClassCode(String classCode) {
            this.classCode = classCode;
            return this;
        }
        public String getClassCode() {
            return this.classCode;
        }

        public ModifyDBNodeRequestDBNode setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

    }

}
