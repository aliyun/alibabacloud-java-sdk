// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CreateDBInstanceForRebuildRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests.</p>
     * <p>The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>ETnLKlblzczshOTUbOC****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The name of the destination instance. The name must be 2 to 256 characters in length. It must start with a Chinese or English letter and can contain digits, Chinese characters, English letters, underscores (_), and hyphens (-).</p>
     * <blockquote>
     * <p>The name cannot start with http:// or https://.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>testdb</p>
     */
    @NameInMap("DBInstanceDescription")
    public String DBInstanceDescription;

    /**
     * <p>The instance ID. You can call the DescribeDBInstances operation to query the instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-uf6wjk5****</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The network connectivity type of the instance. Valid values:</p>
     * <ul>
     * <li><strong>Internet</strong>: public network connection.</li>
     * <li><strong>Intranet</strong>: internal network connection.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Internet</p>
     */
    @NameInMap("DBInstanceNetType")
    public String DBInstanceNetType;

    /**
     * <p>The network type of the destination instance. Valid values:</p>
     * <ul>
     * <li><strong>VPC</strong>: VPC.</li>
     * <li><strong>Classic</strong>: classic network.</li>
     * </ul>
     * <p>By default, an instance in the classic network is created.</p>
     * <blockquote>
     * <p>If the instance is a cloud disk instance, you must set this parameter to <strong>VPC</strong>. If you set this parameter to <strong>VPC</strong>, you must also specify the <strong>VpcId</strong> and <strong>VSwitchId</strong> parameters.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>VPC</p>
     */
    @NameInMap("InstanceNetworkType")
    public String instanceNetworkType;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The billing method of the destination instance. Valid values:</p>
     * <ul>
     * <li><strong>Postpaid</strong>: pay-as-you-go.</li>
     * <li><strong>Prepaid</strong>: subscription.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Postpaid</p>
     */
    @NameInMap("PayType")
    public String payType;

    /**
     * <p>The subscription period of the subscription instance. Valid values:</p>
     * <ul>
     * <li><strong>Year</strong>: yearly subscription.</li>
     * <li><strong>Month</strong>: monthly subscription.</li>
     * </ul>
     * <blockquote>
     * <p>You must specify this parameter when <strong>PayType</strong> is set to <strong>Prepaid</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Month</p>
     */
    @NameInMap("Period")
    public String period;

    /**
     * <p>The region ID. You can call the DescribeRegions operation to query the region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The resource group ID. This parameter can be left empty.</p>
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
     * <p>The <a href="https://help.aliyun.com/document_detail/43185.html">IP address whitelist</a> of the instance. Separate multiple entries with commas (,). Duplicate entries are not allowed. A maximum of 1,000 entries are supported. The following formats are supported:</p>
     * <ul>
     * <li>IP address format, such as 10.10.XX.XX.</li>
     * <li>CIDR format, such as 10.10.XX.XX/24. In this format, 24 indicates the length of the prefix in the CIDR block, and the length ranges from 1 to 32.</li>
     * </ul>
     * <p>If you do not specify this parameter, the default whitelist of the original instance is used.</p>
     * 
     * <strong>example:</strong>
     * <p>127.0.0.1</p>
     */
    @NameInMap("SecurityIPList")
    public String securityIPList;

    @NameInMap("SecurityToken")
    public String securityToken;

    /**
     * <p>The subscription duration. Valid values:</p>
     * <ul>
     * <li>If the <strong>Period</strong> parameter is set to <strong>Year</strong>, the value of the <strong>UsedTime</strong> parameter ranges from <strong>1</strong> to <strong>5</strong>.</li>
     * <li>If the <strong>Period</strong> parameter is set to <strong>Month</strong>, the value of the <strong>UsedTime</strong> parameter ranges from <strong>1</strong> to <strong>11</strong>.</li>
     * </ul>
     * <blockquote>
     * <p>You must specify this parameter when <strong>PayType</strong> is set to <strong>Prepaid</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("UsedTime")
    public String usedTime;

    /**
     * <p>The VPC ID of the destination instance. You must specify this parameter when <strong>InstanceNetworkType</strong> is set to <strong>VPC</strong>.</p>
     * <blockquote>
     * <p>If you specify this parameter, you must also specify the <strong>ZoneId</strong> parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>vpc-uf6f7l4fg90****</p>
     */
    @NameInMap("VPCId")
    public String VPCId;

    /**
     * <p>The vSwitch ID. The zone where the vSwitch is located must match the zone ID specified by the <strong>ZoneId</strong> parameter.</p>
     * <blockquote>
     * <ul>
     * <li>The <strong>InstanceNetworkType</strong> parameter must be set to <strong>VPC</strong>.</li>
     * <li>If you specify the ZoneSlaveId1 (secondary zone ID) parameter, you must specify two vSwitch IDs and separate them with a comma (,).</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>vsw-uf6adz52c2p****</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <p>The zone ID of the primary node. You can call the DescribeRegions operation to query the zone ID.</p>
     * <blockquote>
     * <p>If you specify a VPC and a vSwitch, you must specify this parameter to match the zone of the vSwitch.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou-e</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

    /**
     * <p>The secondary zone 1.</p>
     * <blockquote>
     * <p>You must specify this parameter for instances that are not of the Basic Edition.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou-c</p>
     */
    @NameInMap("ZoneIdSlave1")
    public String zoneIdSlave1;

    /**
     * <p>The secondary zone 2.</p>
     * <blockquote>
     * <p>You can specify this parameter only for instances of the Enterprise Edition.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou-d</p>
     */
    @NameInMap("ZoneIdSlave2")
    public String zoneIdSlave2;

    public static CreateDBInstanceForRebuildRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDBInstanceForRebuildRequest self = new CreateDBInstanceForRebuildRequest();
        return TeaModel.build(map, self);
    }

    public CreateDBInstanceForRebuildRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateDBInstanceForRebuildRequest setDBInstanceDescription(String DBInstanceDescription) {
        this.DBInstanceDescription = DBInstanceDescription;
        return this;
    }
    public String getDBInstanceDescription() {
        return this.DBInstanceDescription;
    }

    public CreateDBInstanceForRebuildRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public CreateDBInstanceForRebuildRequest setDBInstanceNetType(String DBInstanceNetType) {
        this.DBInstanceNetType = DBInstanceNetType;
        return this;
    }
    public String getDBInstanceNetType() {
        return this.DBInstanceNetType;
    }

    public CreateDBInstanceForRebuildRequest setInstanceNetworkType(String instanceNetworkType) {
        this.instanceNetworkType = instanceNetworkType;
        return this;
    }
    public String getInstanceNetworkType() {
        return this.instanceNetworkType;
    }

    public CreateDBInstanceForRebuildRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateDBInstanceForRebuildRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateDBInstanceForRebuildRequest setPayType(String payType) {
        this.payType = payType;
        return this;
    }
    public String getPayType() {
        return this.payType;
    }

    public CreateDBInstanceForRebuildRequest setPeriod(String period) {
        this.period = period;
        return this;
    }
    public String getPeriod() {
        return this.period;
    }

    public CreateDBInstanceForRebuildRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateDBInstanceForRebuildRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateDBInstanceForRebuildRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateDBInstanceForRebuildRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateDBInstanceForRebuildRequest setSecurityIPList(String securityIPList) {
        this.securityIPList = securityIPList;
        return this;
    }
    public String getSecurityIPList() {
        return this.securityIPList;
    }

    public CreateDBInstanceForRebuildRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public CreateDBInstanceForRebuildRequest setUsedTime(String usedTime) {
        this.usedTime = usedTime;
        return this;
    }
    public String getUsedTime() {
        return this.usedTime;
    }

    public CreateDBInstanceForRebuildRequest setVPCId(String VPCId) {
        this.VPCId = VPCId;
        return this;
    }
    public String getVPCId() {
        return this.VPCId;
    }

    public CreateDBInstanceForRebuildRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public CreateDBInstanceForRebuildRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public CreateDBInstanceForRebuildRequest setZoneIdSlave1(String zoneIdSlave1) {
        this.zoneIdSlave1 = zoneIdSlave1;
        return this;
    }
    public String getZoneIdSlave1() {
        return this.zoneIdSlave1;
    }

    public CreateDBInstanceForRebuildRequest setZoneIdSlave2(String zoneIdSlave2) {
        this.zoneIdSlave2 = zoneIdSlave2;
        return this;
    }
    public String getZoneIdSlave2() {
        return this.zoneIdSlave2;
    }

}
