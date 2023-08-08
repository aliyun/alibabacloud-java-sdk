// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeVpcsRequest extends TeaModel {
    /**
     * <p>The ID of the DHCP options set.</p>
     */
    @NameInMap("DhcpOptionsSetId")
    public String dhcpOptionsSetId;

    /**
     * <p>Specifies whether to check the request without performing the operation. Valid values:</p>
     * <br>
     * <p>*   **true**: checks the request but does not query VPCs. The system checks whether your AccessKey pair is valid, whether the Resource Access Management (RAM) user is authorized, and whether the required parameters are set. If the request fails to pass the check, an error message is returned. If the request passes the check, the `DryRunOperation` error code is returned.</p>
     * <p>*   **false** (default): sends the request. If the request passes the check, a 2xx HTTP status code is returned and VPCs are queried.</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>Specifies whether to query the default VPC in the specified region. Valid values:</p>
     * <br>
     * <p>*   **true** (default): yes</p>
     * <p>*   **false**: no</p>
     */
    @NameInMap("IsDefault")
    public Boolean isDefault;

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
     * <p>The number of entries to return per page. Maximum value: **50**. Default value: **10**.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The region ID of the VPC.</p>
     * <br>
     * <p>You can call the [DescribeRegions](~~36063~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group to which the VPC to be queried belongs.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("Tag")
    public java.util.List<DescribeVpcsRequestTag> tag;

    /**
     * <p>The ID of the VPC.</p>
     * <br>
     * <p>You can specify up to 20 VPC IDs. Separate multiple IDs with commas (,).</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    /**
     * <p>The name of the VPC.</p>
     */
    @NameInMap("VpcName")
    public String vpcName;

    /**
     * <p>The ID of the Alibaba Cloud account to which the VPC belongs.</p>
     */
    @NameInMap("VpcOwnerId")
    public Long vpcOwnerId;

    public static DescribeVpcsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeVpcsRequest self = new DescribeVpcsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeVpcsRequest setDhcpOptionsSetId(String dhcpOptionsSetId) {
        this.dhcpOptionsSetId = dhcpOptionsSetId;
        return this;
    }
    public String getDhcpOptionsSetId() {
        return this.dhcpOptionsSetId;
    }

    public DescribeVpcsRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public DescribeVpcsRequest setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
        return this;
    }
    public Boolean getIsDefault() {
        return this.isDefault;
    }

    public DescribeVpcsRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeVpcsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeVpcsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeVpcsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeVpcsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeVpcsRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeVpcsRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeVpcsRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeVpcsRequest setTag(java.util.List<DescribeVpcsRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<DescribeVpcsRequestTag> getTag() {
        return this.tag;
    }

    public DescribeVpcsRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public DescribeVpcsRequest setVpcName(String vpcName) {
        this.vpcName = vpcName;
        return this;
    }
    public String getVpcName() {
        return this.vpcName;
    }

    public DescribeVpcsRequest setVpcOwnerId(Long vpcOwnerId) {
        this.vpcOwnerId = vpcOwnerId;
        return this;
    }
    public Long getVpcOwnerId() {
        return this.vpcOwnerId;
    }

    public static class DescribeVpcsRequestTag extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static DescribeVpcsRequestTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpcsRequestTag self = new DescribeVpcsRequestTag();
            return TeaModel.build(map, self);
        }

        public DescribeVpcsRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeVpcsRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
