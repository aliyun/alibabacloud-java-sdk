// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class CreateTairSkvDdbTableRequest extends TeaModel {
    /**
     * <p>The cluster backup set ID. Some new cluster architectures support cluster backup set IDs. You can call <a href="https://www.alibabacloud.com/help/en/redis/developer-reference/api-r-kvstore-2015-01-01-describeclusterbackuplist-redis">DescribeClusterBackupList</a> to obtain the ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cb-hyxdof5x9kqb**</p>
     */
    @NameInMap("BackupId")
    public String backupId;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the value. Make sure that the value is unique among different requests. The token is case-sensitive and can contain up to 64 ASCII characters.</p>
     * 
     * <strong>example:</strong>
     * <p>ETnLKlblzczshOTUbOCz**</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The instance type. Set the value to tair_skv_ddb_table.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>tair_skv_ddb_table</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID. You can call <a href="https://help.aliyun.com/document_detail/61012.htm">DescribeRegions</a> to query available regions. Use this parameter to specify the region in which to create the instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The table schema configuration in JSON format.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;AttributeDefinitions&quot;:[{&quot;AttributeType&quot;:&quot;S&quot;,&quot;AttributeName&quot;:&quot;pk&quot;},{&quot;AttributeType&quot;:&quot;S&quot;,&quot;AttributeName&quot;:&quot;sk&quot;}],&quot;KeySchema&quot;:[{&quot;KeyType&quot;:&quot;HASH&quot;,&quot;AttributeName&quot;:&quot;pk&quot;},{&quot;KeyType&quot;:&quot;RANGE&quot;,&quot;AttributeName&quot;:&quot;sk&quot;}]}</p>
     */
    @NameInMap("Schema")
    public String schema;

    @NameInMap("SecurityToken")
    public String securityToken;

    /**
     * <p>To create an instance from a backup set of an existing instance, specify the ID of the source instance in this parameter.</p>
     * <blockquote>
     * <p>This parameter must be used together with BackupId.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>r-bp1zxszhcgatnx**</p>
     */
    @NameInMap("SrcDBInstanceId")
    public String srcDBInstanceId;

    /**
     * <p>The table name. The name must be 2 to 128 characters in length and must start with an uppercase letter, a lowercase letter, or a Chinese character. The name cannot contain the following characters: @/:=&quot;&lt;&gt;{}[] or spaces.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>apitest</p>
     */
    @NameInMap("TableName")
    public String tableName;

    /**
     * <p>The parameter settings switch in JSON format.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;attributeName&quot;:&quot;Expiretime&quot;,&quot;enabled&quot;:true}</p>
     */
    @NameInMap("TtlSpec")
    public String ttlSpec;

    /**
     * <p>The ID of the workspace instance. You can call <a href="https://www.alibabacloud.com/help/en/redis/developer-reference/api-r-kvstore-2015-01-01-describeinstances-redis">DescribeInstances</a> to obtain the ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>tt-bp1zxszhcgatnx**</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static CreateTairSkvDdbTableRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTairSkvDdbTableRequest self = new CreateTairSkvDdbTableRequest();
        return TeaModel.build(map, self);
    }

    public CreateTairSkvDdbTableRequest setBackupId(String backupId) {
        this.backupId = backupId;
        return this;
    }
    public String getBackupId() {
        return this.backupId;
    }

    public CreateTairSkvDdbTableRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateTairSkvDdbTableRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public CreateTairSkvDdbTableRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateTairSkvDdbTableRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateTairSkvDdbTableRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateTairSkvDdbTableRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateTairSkvDdbTableRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateTairSkvDdbTableRequest setSchema(String schema) {
        this.schema = schema;
        return this;
    }
    public String getSchema() {
        return this.schema;
    }

    public CreateTairSkvDdbTableRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public CreateTairSkvDdbTableRequest setSrcDBInstanceId(String srcDBInstanceId) {
        this.srcDBInstanceId = srcDBInstanceId;
        return this;
    }
    public String getSrcDBInstanceId() {
        return this.srcDBInstanceId;
    }

    public CreateTairSkvDdbTableRequest setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }
    public String getTableName() {
        return this.tableName;
    }

    public CreateTairSkvDdbTableRequest setTtlSpec(String ttlSpec) {
        this.ttlSpec = ttlSpec;
        return this;
    }
    public String getTtlSpec() {
        return this.ttlSpec;
    }

    public CreateTairSkvDdbTableRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
