// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyPGHbaConfigRequest extends TeaModel {
    /**
     * <p>A reserved parameter. You do not need to specify this parameter.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The instance ID. You can call the DescribeDBInstances operation to query the instance ID.</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>An array that consists of the details of the AD domain services.</p>
     */
    @NameInMap("HbaItem")
    public java.util.List<ModifyPGHbaConfigRequestHbaItem> hbaItem;

    /**
     * <p>The method that you use to modify the pg_hba.conf file. Valid values:</p>
     * <br>
     * <p>*   **add**: adds one or more records. If you use this method, make sure that the value of the PriorityId parameter for each new record is different from the value of the PriorityId parameter for any existing record.</p>
     * <p>*   **delete**: deletes one or more records. If you use this method, the record that corresponds to the specified value of the **PriorityId** parameter is deleted from the pg_hba.conf file.</p>
     * <p>*   **modify**: modifies one or more records. If you use this method, the record that corresponds to the specified value of the **PriorityId** parameter is modified.</p>
     * <p>*   **update**: overwrites the existing configuration in the pg_hba.conf file by using the new configuration.</p>
     */
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
        /**
         * <p>The IP addresses from which the specified users can access the specified databases. If you set this parameter to 0.0.0.0/0, the specified users are allowed to access the specified databases from all IP addresses.</p>
         */
        @NameInMap("Address")
        public String address;

        /**
         * <p>The name of the database. If you set this parameter to all, the specified users are allowed to access all databases on the instance.</p>
         * <br>
         * <p>If you specify multiple entries, separate the entries with commas (,).</p>
         */
        @NameInMap("Database")
        public String database;

        /**
         * <p>The mask of the IP address. If the value of the **Address** parameter is an IP address, you can use this parameter to specify the mask of the IP address.</p>
         */
        @NameInMap("Mask")
        public String mask;

        /**
         * <p>The authentication method. Valid values:</p>
         * <br>
         * <p>*   **trust**</p>
         * <p>*   **reject**</p>
         * <p>*   **scram-sha-256**</p>
         * <p>*   **md5**</p>
         * <p>*   **password**</p>
         * <p>*   **gss**</p>
         * <p>*   **sspi**</p>
         * <p>*   **ldap**</p>
         * <p>*   **radius**</p>
         * <p>*   **cert**</p>
         * <p>*   **pam**</p>
         */
        @NameInMap("Method")
        public String method;

        /**
         * <p>The options of the authentication method. In this topic, LDAP is used as an example. You must configure this parameter. For more information, see [Authentication Methods](https://www.postgresql.org/docs/11/auth-methods.html).</p>
         */
        @NameInMap("Option")
        public String option;

        /**
         * <p>The priority of the record. If you set this parameter to 0, the record has the highest priority. Valid values: 0 to 10000.</p>
         * <br>
         * <p>This parameter is used to identify each record. When you add a record, the value of the PriorityId parameter for the new record must be different from the value of the PriorityId parameter of any existing record. When you modify or delete a record, you must also modify or delete the value of the PriorityId parameter for this record.</p>
         */
        @NameInMap("PriorityId")
        public Integer priorityId;

        /**
         * <p>The connection type.</p>
         * <br>
         * <p>Valid values:</p>
         * <br>
         * <p>*   **host**: The record matches TCP/IP connections, including SSL connections and non-SSL connections.</p>
         * <p>*   **hostssl**: The record matches only TCP/IP connections that are established over SSL.</p>
         * <p>*   **hostnossl**: The record matches only TCP/IP connections that are not established over SSL connections.</p>
         * <br>
         * <p>>  You can set this parameter to hostssl only when SSL encryption is enabled for the instance. For more information, see Configure SSL encryption for an ApsaraDB RDS for PostgreSQL instance.[](~~229518~~)</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The user who is allowed to access the specified databases. You must specify the user that is used to log on to the RDS instance. If you specify multiple entries, separate the entries with commas (,).</p>
         */
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
