// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeNatGatewaysRequest extends TeaModel {
    @NameInMap("AvailabilityMode")
    public String availabilityMode;

    /**
     * <p>Specifies whether to perform a dry run. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: performs a dry run. The system checks the request for potential issues, including invalid AccessKey pairs, unauthorized RAM user authorization, and missing parameter values. If the request fails the dry run, the corresponding error message is returned. If the request passes the dry run, the <code>DryRunOperation</code> error code is returned.</p>
     * </li>
     * <li><p><strong>false</strong> (default): performs a dry run and sends the request. After the request passes the dry run, a 2xx HTTP status code is returned and the resource status is queried. This is the Normal request behavior.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>&lt;props=&quot;china&quot;&gt;The billing method of the NAT gateway instance that you want to query. Valid values:</p>
     * <p>&lt;props=&quot;china&quot;&gt;</p>
     * <ul>
     * <li><strong>PostPaid</strong>: pay-as-you-go.</li>
     * <li><strong>PrePaid</strong>: the legacy subscription billing method. New purchases under the subscription billing method are no longer supported.</li>
     * </ul>
     * <p>&lt;props=&quot;intl&quot;&gt;The billing method of the NAT gateway instance that you want to query. Valid value: <strong>PostPaid</strong> (pay-as-you-go).</p>
     * 
     * <strong>example:</strong>
     * <p>PostPaid</p>
     */
    @NameInMap("InstanceChargeType")
    public String instanceChargeType;

    /**
     * <p>The name of the NAT gateway that you want to query.</p>
     * <p>The name must be 1 to 128 characters in length and cannot start with <code>http://</code> or <code>https://</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The ID of the NAT gateway that you want to query.</p>
     * 
     * <strong>example:</strong>
     * <p>ngw-bp1uewa15k4iy5770****</p>
     */
    @NameInMap("NatGatewayId")
    public String natGatewayId;

    /**
     * <p>The type of the NAT gateway. Valid value: <strong>Enhanced</strong> (enhanced NAT gateway).</p>
     * 
     * <strong>example:</strong>
     * <p>Enhanced</p>
     */
    @NameInMap("NatType")
    public String natType;

    /**
     * <p>The type of the NAT gateway that you want to query. Valid values:</p>
     * <ul>
     * <li><strong>internet</strong>: Internet NAT gateway.</li>
     * <li><strong>intranet</strong>: VPC NAT gateway.</li>
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
     * <p>The page number. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page in a paged query. Maximum value: <strong>50</strong>. Default value: <strong>10</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The region ID of the NAT gateway that you want to query.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to obtain the region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group to which the NAT gateway that you want to query belongs.</p>
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
     * <p>&lt;props=&quot;china&quot;&gt;The specification of the Internet NAT gateway. This parameter is supported only when <strong>InstanceChargeType</strong> is set to <strong>PrePaid</strong> (legacy subscription Internet NAT gateway) to create a NAT gateway with defined specifications. Valid values:</p>
     * <p>&lt;props=&quot;china&quot;&gt;</p>
     * <ul>
     * <li><strong>Small</strong> (default): small.</li>
     * <li><strong>Middle</strong>: medium.</li>
     * <li><strong>Large</strong>: large.</li>
     * </ul>
     * <p>&lt;props=&quot;intl&quot;&gt;The specification of the NAT gateway. Leave this parameter empty.</p>
     * 
     * <strong>example:</strong>
     * <p>中国站示例值：Small，国际站示例值：无需填写</p>
     */
    @NameInMap("Spec")
    public String spec;

    /**
     * <p>The status of the NAT gateway that you want to query. Valid values:</p>
     * <ul>
     * <li><p><strong>Creating</strong>: The NAT gateway is being created. Creating a NAT gateway is an asynchronous operation. The NAT gateway remains in the <strong>Creating</strong> state until the operation is complete.</p>
     * </li>
     * <li><p><strong>Available</strong>: The NAT gateway is available. This is a stable state after the NAT gateway is created.</p>
     * </li>
     * <li><p><strong>Modifying</strong>: The NAT gateway is being modified. Modifying a NAT gateway is an asynchronous operation. The NAT gateway remains in the <strong>Modifying</strong> state until the operation is complete.</p>
     * </li>
     * <li><p><strong>Deleting</strong>: The NAT gateway is being deleted. Deleting a NAT gateway is an asynchronous operation. The NAT gateway remains in the <strong>Deleting</strong> state until the operation is complete.</p>
     * </li>
     * <li><p><strong>Converting</strong>: The NAT gateway is being upgraded from a standard NAT gateway to an enhanced NAT gateway. This is an asynchronous operation. The NAT gateway remains in the <strong>Converting</strong> state until the operation is complete.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Available</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The list of tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<DescribeNatGatewaysRequestTag> tag;

    /**
     * <p>The ID of the VPC to which the NAT gateway that you want to query belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-bp15zckdt37pq72z****</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    /**
     * <p>The zone ID of the NAT gateway.</p>
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

    public DescribeNatGatewaysRequest setAvailabilityMode(String availabilityMode) {
        this.availabilityMode = availabilityMode;
        return this;
    }
    public String getAvailabilityMode() {
        return this.availabilityMode;
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
         * <p>The tag key of the NAT gateway instance. You can specify up to 20 tag keys.</p>
         * <p>The tag key can be up to 128 characters in length and cannot start with <code>aliyun</code> or <code>acs:</code>. It cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>KeyTest</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value of the NAT gateway instance. You can specify up to 20 tag values.</p>
         * <p>The tag value can be up to 128 characters in length and cannot start with <code>aliyun</code> or <code>acs:</code>. It cannot contain <code>http://</code> or <code>https://</code>.</p>
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
