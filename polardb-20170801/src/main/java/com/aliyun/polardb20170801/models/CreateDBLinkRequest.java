// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class CreateDBLinkRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must make sure that it is unique among different requests. The token can only contain ASCII characters and cannot exceed 64 characters in length. The token is case-sensitive.</p>
     * 
     * <strong>example:</strong>
     * <p>6000170000591aed949d0f54a343f1a4233c1e7d1c5c******</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The ID of the source cluster that the database link connects.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/173433.html">DescribeDBClusters</a> operation to query PolarDB clusters.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pc-a************</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The name of the database link.</p>
     * <ul>
     * <li>The name must contain lowercase letters and can also contain digits and underscores (_).</li>
     * <li>The name must start with a letter and end with a letter or digit.</li>
     * <li>The name must be 1 to 64 characters in length.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dblink_test</p>
     */
    @NameInMap("DBLinkName")
    public String DBLinkName;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The ID of the region.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/98041.html">DescribeRegions</a> operation to query information about regions.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-************</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The name of the source database.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/173558.html">DescribeDatabases</a> operation to query information about databases in a PolarDB cluster.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>testdb1</p>
     */
    @NameInMap("SourceDBName")
    public String sourceDBName;

    /**
     * <p>The account of the destination database.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/173549.html">DescribeAccounts</a> operation to query the account of a PolarDB cluster.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>testacc</p>
     */
    @NameInMap("TargetDBAccount")
    public String targetDBAccount;

    /**
     * <p>The ID of the destination cluster that the database link connects.</p>
     * <blockquote>
     * <ul>
     * <li>If the destination cluster is a user-created Oracle database on an ECS instance, set the value to <code>null</code>.</li>
     * <li>You can call the <a href="https://help.aliyun.com/document_detail/173433.html">DescribeDBClusters</a> operation to query PolarDB clusters.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>pc-b************</p>
     */
    @NameInMap("TargetDBInstanceName")
    public String targetDBInstanceName;

    /**
     * <p>The name of the destination database.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/173558.html">DescribeDatabases</a> operation to query information about databases in a PolarDB cluster.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>testdb2</p>
     */
    @NameInMap("TargetDBName")
    public String targetDBName;

    /**
     * <p>The account password of the destination database.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Test1111</p>
     */
    @NameInMap("TargetDBPasswd")
    public String targetDBPasswd;

    /**
     * <p>The IP address of the user-created Oracle database on an ECS instance.</p>
     * 
     * <strong>example:</strong>
     * <p>192.<strong>.</strong>.46</p>
     */
    @NameInMap("TargetIp")
    public String targetIp;

    /**
     * <p>The port number of the user-created Oracle database on an ECS instance.</p>
     * 
     * <strong>example:</strong>
     * <p>1521</p>
     */
    @NameInMap("TargetPort")
    public String targetPort;

    /**
     * <p>The ID of the virtual private cloud (VPC).</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/35739.html">DescribeVpcs</a> operation to query information about VPCs.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>vpc-bp1qpo0kug3a20qqe****</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    public static CreateDBLinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDBLinkRequest self = new CreateDBLinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateDBLinkRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateDBLinkRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public CreateDBLinkRequest setDBLinkName(String DBLinkName) {
        this.DBLinkName = DBLinkName;
        return this;
    }
    public String getDBLinkName() {
        return this.DBLinkName;
    }

    public CreateDBLinkRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateDBLinkRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateDBLinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateDBLinkRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateDBLinkRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateDBLinkRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateDBLinkRequest setSourceDBName(String sourceDBName) {
        this.sourceDBName = sourceDBName;
        return this;
    }
    public String getSourceDBName() {
        return this.sourceDBName;
    }

    public CreateDBLinkRequest setTargetDBAccount(String targetDBAccount) {
        this.targetDBAccount = targetDBAccount;
        return this;
    }
    public String getTargetDBAccount() {
        return this.targetDBAccount;
    }

    public CreateDBLinkRequest setTargetDBInstanceName(String targetDBInstanceName) {
        this.targetDBInstanceName = targetDBInstanceName;
        return this;
    }
    public String getTargetDBInstanceName() {
        return this.targetDBInstanceName;
    }

    public CreateDBLinkRequest setTargetDBName(String targetDBName) {
        this.targetDBName = targetDBName;
        return this;
    }
    public String getTargetDBName() {
        return this.targetDBName;
    }

    public CreateDBLinkRequest setTargetDBPasswd(String targetDBPasswd) {
        this.targetDBPasswd = targetDBPasswd;
        return this;
    }
    public String getTargetDBPasswd() {
        return this.targetDBPasswd;
    }

    public CreateDBLinkRequest setTargetIp(String targetIp) {
        this.targetIp = targetIp;
        return this;
    }
    public String getTargetIp() {
        return this.targetIp;
    }

    public CreateDBLinkRequest setTargetPort(String targetPort) {
        this.targetPort = targetPort;
        return this;
    }
    public String getTargetPort() {
        return this.targetPort;
    }

    public CreateDBLinkRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

}
