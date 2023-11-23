// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DeleteSecretRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The ID of the instance. You can call the **DescribeDBInstances** operation to query the ID of the instance.</p>
     * <br>
     * <p>> If you specify this parameter, you must also specify **SecretName**.</p>
     */
    @NameInMap("DbInstanceId")
    public String dbInstanceId;

    /**
     * <p>The engine of the database.</p>
     * <br>
     * <p>> Only MySQL is supported.</p>
     */
    @NameInMap("Engine")
    public String engine;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID of the instance. You can call the **DescribeRegions** operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group. You can call the **DescribeDBInstanceAttribute** operation to obtain the ID of the resource group.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The Alibaba Cloud Resource Name (ARN) of the credential for the created Data API account. You can call the **CreateSecret** operation to obtain the value of this parameter.</p>
     * <br>
     * <p>> You must specify one of **SecretName** and SecretArn.</p>
     */
    @NameInMap("SecretArn")
    public String secretArn;

    /**
     * <p>The name of the credential.</p>
     * <br>
     * <p>> *   You must specify one of **SecretArn** and SecretName.</p>
     * <p>> *   If you specify this parameter, you must also specify **DbInstanceId**.</p>
     */
    @NameInMap("SecretName")
    public String secretName;

    public static DeleteSecretRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteSecretRequest self = new DeleteSecretRequest();
        return TeaModel.build(map, self);
    }

    public DeleteSecretRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DeleteSecretRequest setDbInstanceId(String dbInstanceId) {
        this.dbInstanceId = dbInstanceId;
        return this;
    }
    public String getDbInstanceId() {
        return this.dbInstanceId;
    }

    public DeleteSecretRequest setEngine(String engine) {
        this.engine = engine;
        return this;
    }
    public String getEngine() {
        return this.engine;
    }

    public DeleteSecretRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DeleteSecretRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DeleteSecretRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DeleteSecretRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DeleteSecretRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DeleteSecretRequest setSecretArn(String secretArn) {
        this.secretArn = secretArn;
        return this;
    }
    public String getSecretArn() {
        return this.secretArn;
    }

    public DeleteSecretRequest setSecretName(String secretName) {
        this.secretName = secretName;
        return this;
    }
    public String getSecretName() {
        return this.secretName;
    }

}
