// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyPGHbaConfigRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    @NameInMap("HbaItem")
    public java.util.List<ModifyPGHbaConfigRequestHbaItem> hbaItem;

    @NameInMap("OpsType")
    public String opsType;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static ModifyPGHbaConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyPGHbaConfigRequest self = new ModifyPGHbaConfigRequest();
        return TeaModel.build(map, self);
    }

    public ModifyPGHbaConfigRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ModifyPGHbaConfigRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public ModifyPGHbaConfigRequest setHbaItem(java.util.List<ModifyPGHbaConfigRequestHbaItem> hbaItem) {
        this.hbaItem = hbaItem;
        return this;
    }
    public java.util.List<ModifyPGHbaConfigRequestHbaItem> getHbaItem() {
        return this.hbaItem;
    }

    public ModifyPGHbaConfigRequest setOpsType(String opsType) {
        this.opsType = opsType;
        return this;
    }
    public String getOpsType() {
        return this.opsType;
    }

    public ModifyPGHbaConfigRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyPGHbaConfigRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyPGHbaConfigRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyPGHbaConfigRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public static class ModifyPGHbaConfigRequestHbaItem extends TeaModel {
        @NameInMap("Address")
        public String address;

        @NameInMap("Database")
        public String database;

        @NameInMap("Mask")
        public String mask;

        @NameInMap("Method")
        public String method;

        @NameInMap("Option")
        public String option;

        @NameInMap("PriorityId")
        public Integer priorityId;

        @NameInMap("Type")
        public String type;

        @NameInMap("User")
        public String user;

        public static ModifyPGHbaConfigRequestHbaItem build(java.util.Map<String, ?> map) throws Exception {
            ModifyPGHbaConfigRequestHbaItem self = new ModifyPGHbaConfigRequestHbaItem();
            return TeaModel.build(map, self);
        }

        public ModifyPGHbaConfigRequestHbaItem setAddress(String address) {
            this.address = address;
            return this;
        }
        public String getAddress() {
            return this.address;
        }

        public ModifyPGHbaConfigRequestHbaItem setDatabase(String database) {
            this.database = database;
            return this;
        }
        public String getDatabase() {
            return this.database;
        }

        public ModifyPGHbaConfigRequestHbaItem setMask(String mask) {
            this.mask = mask;
            return this;
        }
        public String getMask() {
            return this.mask;
        }

        public ModifyPGHbaConfigRequestHbaItem setMethod(String method) {
            this.method = method;
            return this;
        }
        public String getMethod() {
            return this.method;
        }

        public ModifyPGHbaConfigRequestHbaItem setOption(String option) {
            this.option = option;
            return this;
        }
        public String getOption() {
            return this.option;
        }

        public ModifyPGHbaConfigRequestHbaItem setPriorityId(Integer priorityId) {
            this.priorityId = priorityId;
            return this;
        }
        public Integer getPriorityId() {
            return this.priorityId;
        }

        public ModifyPGHbaConfigRequestHbaItem setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ModifyPGHbaConfigRequestHbaItem setUser(String user) {
            this.user = user;
            return this;
        }
        public String getUser() {
            return this.user;
        }

    }

}
