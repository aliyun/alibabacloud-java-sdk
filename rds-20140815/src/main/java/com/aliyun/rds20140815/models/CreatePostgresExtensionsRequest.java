// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CreatePostgresExtensionsRequest extends TeaModel {
    /**
     * <p>The user to which the extension belongs. Only privileged accounts are supported.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test_user</p>
     */
    @NameInMap("AccountName")
    public String accountName;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>ETnLKlblzczshOTUbOCz****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The instance ID. You can call DescribeDBInstances to query the instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pgm-gc7f1****</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The database name of the instance. You can call DescribeDatabases to query the database name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test_db</p>
     */
    @NameInMap("DBNames")
    public String DBNames;

    /**
     * <p>The plugins to install. Separate multiple plugins with commas (,).
     * If you do not specify the request parameter <strong>SourceDatabase</strong>, this parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>citext,pg_profile</p>
     */
    @NameInMap("Extensions")
    public String extensions;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The resource group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmy****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>Specifies whether to confirm the security risk of installing specific extensions on instances that run minor engine versions that are too early. After you confirm the risk, the extensions can be installed.
     * Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false<blockquote>
     * <p>For information about related risks, see <a href="https://help.aliyun.com/document_detail/2587815.html">Restrictions on creating extensions in ApsaraDB RDS for PostgreSQL</a>.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("RiskConfirmed")
    public Boolean riskConfirmed;

    /**
     * <p>The source database from which plugins are synchronized to the target database. If you do not specify the request parameter <strong>Extensions</strong>, this parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>source_db</p>
     */
    @NameInMap("SourceDatabase")
    public String sourceDatabase;

    public static CreatePostgresExtensionsRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePostgresExtensionsRequest self = new CreatePostgresExtensionsRequest();
        return TeaModel.build(map, self);
    }

    public CreatePostgresExtensionsRequest setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }
    public String getAccountName() {
        return this.accountName;
    }

    public CreatePostgresExtensionsRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreatePostgresExtensionsRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public CreatePostgresExtensionsRequest setDBNames(String DBNames) {
        this.DBNames = DBNames;
        return this;
    }
    public String getDBNames() {
        return this.DBNames;
    }

    public CreatePostgresExtensionsRequest setExtensions(String extensions) {
        this.extensions = extensions;
        return this;
    }
    public String getExtensions() {
        return this.extensions;
    }

    public CreatePostgresExtensionsRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreatePostgresExtensionsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreatePostgresExtensionsRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreatePostgresExtensionsRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreatePostgresExtensionsRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreatePostgresExtensionsRequest setRiskConfirmed(Boolean riskConfirmed) {
        this.riskConfirmed = riskConfirmed;
        return this;
    }
    public Boolean getRiskConfirmed() {
        return this.riskConfirmed;
    }

    public CreatePostgresExtensionsRequest setSourceDatabase(String sourceDatabase) {
        this.sourceDatabase = sourceDatabase;
        return this;
    }
    public String getSourceDatabase() {
        return this.sourceDatabase;
    }

}
