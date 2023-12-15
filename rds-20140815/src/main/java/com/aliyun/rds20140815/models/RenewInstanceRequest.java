// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class RenewInstanceRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable automatic payment during the renewal. Valid values:</p>
     * <br>
     * <p>*   **True**: enables automatic payment. Make sure that your Alibaba Cloud account has adequate balance.</p>
     * <p>*   **False** (default): disables automatic payment. You have to manually pay the order in the console.</p>
     * <p>>  For more information about manual renewal in the console, see the following topics:</p>
     * <p>> *   [Manually renew an ApsaraDB RDS for MySQL instance](~~96050~~)</p>
     * <p>> *   [Manually renew an ApsaraDB RDS for PostgreSQL instance](~~96741~~)</p>
     * <p>> *   [Manually renew an ApsaraDB RDS for SQL Server instance](~~95637~~)</p>
     * <p>> *   [Manually renew an ApsaraDB RDS for MariaDB instance](~~97122~~)</p>
     */
    @NameInMap("AutoPay")
    public String autoPay;

    /**
     * <p>Specifies whether to enable auto-renewal for the instance. Valid values:</p>
     * <br>
     * <p>*   **true**.</p>
     * <p>*   **false** (default)</p>
     */
    @NameInMap("AutoRenew")
    public String autoRenew;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the generated token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The instance ID You can call the DescribeDBInstances operation to query the instance ID.</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The duration of the subscription renewal. Unit: month. Valid values:</p>
     * <br>
     * <p>*   **1~9**</p>
     * <p>*   **12**</p>
     * <p>*   **24**</p>
     * <p>*   **36**</p>
     * <p>*   **48**</p>
     * <p>*   **60**</p>
     */
    @NameInMap("Period")
    public Integer period;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static RenewInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        RenewInstanceRequest self = new RenewInstanceRequest();
        return TeaModel.build(map, self);
    }

    public RenewInstanceRequest setAutoPay(String autoPay) {
        this.autoPay = autoPay;
        return this;
    }
    public String getAutoPay() {
        return this.autoPay;
    }

    public RenewInstanceRequest setAutoRenew(String autoRenew) {
        this.autoRenew = autoRenew;
        return this;
    }
    public String getAutoRenew() {
        return this.autoRenew;
    }

    public RenewInstanceRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public RenewInstanceRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public RenewInstanceRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public RenewInstanceRequest setPeriod(Integer period) {
        this.period = period;
        return this;
    }
    public Integer getPeriod() {
        return this.period;
    }

    public RenewInstanceRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public RenewInstanceRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
