// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CheckAccountNameAvailableRequest extends TeaModel {
    /**
     * <p>The username of the account.</p>
     * <br>
     * <p>*   The value must be unique.</p>
     * <br>
     * <p>*   The value must start with a lowercase letter, and end with a lowercase letter or a digit.</p>
     * <br>
     * <p>*   The value can contain lowercase letters, digits, and underscores (\_).</p>
     * <br>
     * <p>*   The length of the value must meet the following requirements:</p>
     * <br>
     * <p>    *   If the instance runs MySQL 5.7 or MySQL 8.0, the value must be 2 to 32 characters in length.</p>
     * <p>    *   If the instance runs MySQL 5.6, the value must be 2 to 16 characters in length.</p>
     * <p>    *   If the instance runs SQL Server, the value must be 2 to 64 characters in length.</p>
     * <p>    *   If the instance runs PostgreSQL with cloud disks, the value must be 2 to 63 characters in length.</p>
     * <p>    *   If the instance runs PostgreSQL with local disks, the value must be 2 to 16 characters in length.</p>
     * <p>    *   If the instance runs MariaDB, the value must be 2 to 16 characters in length.</p>
     * <br>
     * <p>*   For more information about invalid characters, see [Forbidden keywords table](~~26317~~).</p>
     */
    @NameInMap("AccountName")
    public String accountName;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The instance ID. You can call the DescribeDBInstances operation to query the instance ID.</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    public static CheckAccountNameAvailableRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckAccountNameAvailableRequest self = new CheckAccountNameAvailableRequest();
        return TeaModel.build(map, self);
    }

    public CheckAccountNameAvailableRequest setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }
    public String getAccountName() {
        return this.accountName;
    }

    public CheckAccountNameAvailableRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CheckAccountNameAvailableRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public CheckAccountNameAvailableRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CheckAccountNameAvailableRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CheckAccountNameAvailableRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

}
