// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeNatGatewaysRequest extends TeaModel {
    /**
     * <p>Specifies whether to perform a dry run. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: performs a dry run. The system prechecks whether your AccessKey pair is valid, whether the RAM user is authorized, and whether the required parameters are specified. If the request fails the dry run, an error message is returned. If the request passes the dry run, the <code>DryRunOperation</code> error code is returned.</li>
     * <li><strong>false</strong> (default): performs a dry run and sends the request. If the request passes the dry run, a 2xx HTTP status code is returned and the operation is performed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The billing method of the NAT gateway. Set the value to <strong>PostPaid</strong>, which specifies the pay-as-you-go billing method.</p>
     * 
     * <strong>example:</strong>
     * <p>PostPaid</p>
     */
    @NameInMap("InstanceChargeType")
    public String instanceChargeType;

    /**
     * <p>The name of the NAT gateway. </p>
     * <p>The name must be 1 to 128 characters in length, and cannot start with <code>http://</code> or <code>https://</code>. </p>
     * <p>If this parameter is not set, the system automatically assigns a name to the NAT gateway.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The ID of the NAT gateway.</p>
     * 
     * <strong>example:</strong>
     * <p>ngw-bp1uewa15k4iy5770****</p>
     */
    @NameInMap("NatGatewayId")
    public String natGatewayId;

    /**
     * <p>The type of NAT gateway. Set the value to <strong>Enhanced</strong> (enhanced NAT gateway).</p>
     * 
     * <strong>example:</strong>
     * <p>Enhanced</p>
     */
    @NameInMap("NatType")
    public String natType;

    /**
     * <p>The type of the NAT gateway. Valid values:</p>
     * <ul>
     * <li><strong>internet</strong>: an Internet NAT gateway</li>
     * <li><strong>intranet</strong>: a VPC NAT gateway</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>internet</p>
     */
    @NameInMap("NetworkType")
    public String networkType;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The number of the page to return. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page. Maximum value: <strong>50</strong>. Default value: <strong>10</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The region ID of the NAT gateways that you want to query.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group to which the NAT gateway belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-bp67acfmxazb4ph****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The size of the NAT gateway. Ignore this parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>Invalid parameter.</p>
     */
    @NameInMap("Spec")
    public String spec;

    /**
     * <p>The status of the NAT gateway. Valid values:</p>
     * <ul>
     * <li><strong>Creating</strong>: After you send a request to create a NAT gateway, the system creates the NAT gateway in the background. The NAT gateway remains in the <strong>Creating</strong> state until the operation is completed.</li>
     * <li><strong>Available</strong>: The NAT gateway remains in a stable state after the NAT gateway is created.</li>
     * <li><strong>Modifying</strong>: After you send a request to modify a NAT gateway, the system modifies the NAT gateway in the background. The NAT gateway remains in the <strong>Modifying</strong> state until the operation is completed.</li>
     * <li><strong>Deleting</strong>: After you send a request to delete a NAT gateway, the system deletes the NAT gateway in the background. The NAT gateway remains in the <strong>Deleting</strong> state until the operation is completed.</li>
     * <li><strong>Converting</strong>: After you send a request to upgrade a standard NAT gateway to an enhanced NAT gateway, the system upgrades the NAT gateway in the background. The NAT gateway remains in the <strong>Converting</strong> state until the operation is completed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Available</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<DescribeNatGatewaysRequestTag> tag;

    /**
     * <p>The ID of the VPC to which the NAT gateway belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-bp15zckdt37pq72z****</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    /**
     * <p>The ID of the zone to which the NAT gateway belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou-b</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

    public static DescribeNatGatewaysRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeNatGatewaysRequest self = new DescribeNatGatewaysRequest();
        return TeaModel.build(map, self);
    }

    public DescribeNatGatewaysRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public DescribeNatGatewaysRequest setInstanceChargeType(String instanceChargeType) {
        this.instanceChargeType = instanceChargeType;
        return this;
    }
    public String getInstanceChargeType() {
        return this.instanceChargeType;
    }

    public DescribeNatGatewaysRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribeNatGatewaysRequest setNatGatewayId(String natGatewayId) {
        this.natGatewayId = natGatewayId;
        return this;
    }
    public String getNatGatewayId() {
        return this.natGatewayId;
    }

    public DescribeNatGatewaysRequest setNatType(String natType) {
        this.natType = natType;
        return this;
    }
    public String getNatType() {
        return this.natType;
    }

    public DescribeNatGatewaysRequest setNetworkType(String networkType) {
        this.networkType = networkType;
        return this;
    }
    public String getNetworkType() {
        return this.networkType;
    }

    public DescribeNatGatewaysRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeNatGatewaysRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeNatGatewaysRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeNatGatewaysRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeNatGatewaysRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeNatGatewaysRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeNatGatewaysRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeNatGatewaysRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeNatGatewaysRequest setSpec(String spec) {
        this.spec = spec;
        return this;
    }
    public String getSpec() {
        return this.spec;
    }

    public DescribeNatGatewaysRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeNatGatewaysRequest setTag(java.util.List<DescribeNatGatewaysRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<DescribeNatGatewaysRequestTag> getTag() {
        return this.tag;
    }

    public DescribeNatGatewaysRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public DescribeNatGatewaysRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public static class DescribeNatGatewaysRequestTag extends TeaModel {
        /**
         * <p>The tag keys of the NAT gateway. You can specify up to 20 tag keys.</p>
         * <p>Each tag key cannot exceed 64 characters in length, and cannot start with <code>aliyun</code> or <code>acs:</code>. It cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>KeyTest</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag values of the NAT gateway. You can specify up to 20 tag values.</p>
         * <p>The tag value cannot exceed 128 characters in length, and cannot start with <code>aliyun</code> or <code>acs:</code>. The value cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>valueTest</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeNatGatewaysRequestTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeNatGatewaysRequestTag self = new DescribeNatGatewaysRequestTag();
            return TeaModel.build(map, self);
        }

        public DescribeNatGatewaysRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeNatGatewaysRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
