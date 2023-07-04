// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeNatGatewaysRequest extends TeaModel {
    /**
     * <p>Specifies whether to perform a dry run. Valid values:</p>
     * <br>
     * <p>- **true**: performs a dry run. The system prechecks whether your AccessKey pair is valid, whether the RAM user is authorized, and whether the required parameters are specified. If the request fails the dry run, an error message is returned. If the request passes the dry run, the `DryRunOperation` error code is returned.</p>
     * <p>- **false** (default): performs a dry run and sends the request. If the request passes the dry run, a 2xx HTTP status code is returned and the operation is performed.</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The billing method of the NAT gateway. Set the value to **PostPaid**, which specifies the pay-as-you-go billing method.</p>
     */
    @NameInMap("InstanceChargeType")
    public String instanceChargeType;

    /**
     * <p>The name of the NAT gateway. </p>
     * <br>
     * <p>The name must be 1 to 128 characters in length, and cannot start with `http://` or `https://`. </p>
     * <br>
     * <p>If this parameter is not set, the system automatically assigns a name to the NAT gateway.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The ID of the NAT gateway.</p>
     */
    @NameInMap("NatGatewayId")
    public String natGatewayId;

    /**
     * <p>The type of NAT gateway. Set the value to **Enhanced** (enhanced NAT gateway).</p>
     */
    @NameInMap("NatType")
    public String natType;

    /**
     * <p>The type of the NAT gateway. Valid values:</p>
     * <br>
     * <p>*   **internet**: an Internet NAT gateway</p>
     * <p>*   **intranet**: a VPC NAT gateway</p>
     */
    @NameInMap("NetworkType")
    public String networkType;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The number of the page to return. Default value: **1**.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page. Maximum value: **50**. Default value: **10**.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The region ID of the NAT gateways that you want to query.</p>
     * <br>
     * <p>You can call the [DescribeRegions](~~36063~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group to which the NAT gateway belongs.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The size of the NAT gateway. Ignore this parameter.</p>
     */
    @NameInMap("Spec")
    public String spec;

    /**
     * <p>The status of the NAT gateway. Valid values:</p>
     * <br>
     * <p>*   **Creating**: After you send a request to create a NAT gateway, the system creates the NAT gateway in the background. The NAT gateway remains in the **Creating** state until the operation is completed.</p>
     * <p>*   **Available**: The NAT gateway remains in a stable state after the NAT gateway is created.</p>
     * <p>*   **Modifying**: After you send a request to modify a NAT gateway, the system modifies the NAT gateway in the background. The NAT gateway remains in the **Modifying** state until the operation is completed.</p>
     * <p>*   **Deleting**: After you send a request to delete a NAT gateway, the system deletes the NAT gateway in the background. The NAT gateway remains in the **Deleting** state until the operation is completed.</p>
     * <p>*   **Converting**: After you send a request to upgrade a standard NAT gateway to an enhanced NAT gateway, the system upgrades the NAT gateway in the background. The NAT gateway remains in the **Converting** state until the operation is completed.</p>
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
     */
    @NameInMap("VpcId")
    public String vpcId;

    /**
     * <p>The ID of the zone to which the NAT gateway belongs.</p>
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
         * <br>
         * <p>Each tag key cannot exceed 64 characters in length, and cannot start with `aliyun` or `acs:`. It cannot contain `http://` or `https://`.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag values of the NAT gateway. You can specify up to 20 tag values.</p>
         * <br>
         * <p>The tag value cannot exceed 128 characters in length, and cannot start with `aliyun` or `acs:`. The value cannot contain `http://` or `https://`.</p>
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
