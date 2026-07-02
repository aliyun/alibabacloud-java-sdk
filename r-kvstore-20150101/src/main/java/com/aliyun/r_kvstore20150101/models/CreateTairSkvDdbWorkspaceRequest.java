// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class CreateTairSkvDdbWorkspaceRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must make sure that the token is unique among different requests. The token is case-sensitive and can contain up to 64 ASCII characters.</p>
     * 
     * <strong>example:</strong>
     * <p>ETnLKlblzczshOTUbOCz**</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The instance name. The name must be 2 to 128 characters in length and must start with a letter or a Chinese character. The name cannot contain the following characters: @/:=&quot;&lt;&gt;{} and spaces.</p>
     * 
     * <strong>example:</strong>
     * <p>apitest</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <p>The instance type. Set the value to tair_skv_ddb_ws.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>tair_skv_ddb_ws</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The password of the instance. The password must meet the following requirements:</p>
     * <ul>
     * <li>The password is 8 to 32 characters in length.</li>
     * <li>The password contains at least three of the following character types: uppercase letters, lowercase letters, special characters, and digits. Supported special characters are <code>!@#$%^&amp;*()_+-=</code>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Pass!123456</p>
     */
    @NameInMap("Password")
    public String password;

    /**
     * <p>The service port of the instance. Valid values: 1 to 65535. Default value: 443.</p>
     * 
     * <strong>example:</strong>
     * <p>443</p>
     */
    @NameInMap("Port")
    public Integer port;

    /**
     * <p>The region ID. You can call <a href="https://help.aliyun.com/document_detail/61012.htm">DescribeRegions</a> to query available regions. Use this parameter to specify the region in which to create the instance.</p>
     * <p>This parameter is required.</p>
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
     * <p>rg-resourcegroupid1</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("SecurityToken")
    public String securityToken;

    /**
     * <p>The ID of the vSwitch.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-bp1e7clcw529l773d**</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <p>The ID of the virtual private cloud (VPC).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-bp1nme44gek34slfc**</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    /**
     * <p>The zone ID. You can call <a href="https://help.aliyun.com/document_detail/473764.html">DescribeZones</a> to query available zones.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou-e</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

    public static CreateTairSkvDdbWorkspaceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTairSkvDdbWorkspaceRequest self = new CreateTairSkvDdbWorkspaceRequest();
        return TeaModel.build(map, self);
    }

    public CreateTairSkvDdbWorkspaceRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateTairSkvDdbWorkspaceRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public CreateTairSkvDdbWorkspaceRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public CreateTairSkvDdbWorkspaceRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateTairSkvDdbWorkspaceRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateTairSkvDdbWorkspaceRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public CreateTairSkvDdbWorkspaceRequest setPort(Integer port) {
        this.port = port;
        return this;
    }
    public Integer getPort() {
        return this.port;
    }

    public CreateTairSkvDdbWorkspaceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateTairSkvDdbWorkspaceRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateTairSkvDdbWorkspaceRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateTairSkvDdbWorkspaceRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateTairSkvDdbWorkspaceRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public CreateTairSkvDdbWorkspaceRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public CreateTairSkvDdbWorkspaceRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public CreateTairSkvDdbWorkspaceRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

}
