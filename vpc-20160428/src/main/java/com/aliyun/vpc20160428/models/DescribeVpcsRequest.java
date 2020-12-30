// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeVpcsRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("VpcId")
    public String vpcId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("VpcName")
    public String vpcName;

    @NameInMap("IsDefault")
    public Boolean isDefault;

    @NameInMap("DryRun")
    public Boolean dryRun;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("VpcOwnerId")
    public Long vpcOwnerId;

    @NameInMap("AdvancedFeature")
    public Boolean advancedFeature;

    @NameInMap("DhcpOptionsSetId")
    public String dhcpOptionsSetId;

    @NameInMap("Tag")
    public java.util.List<DescribeVpcsRequestTag> tag;

    public static DescribeVpcsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeVpcsRequest self = new DescribeVpcsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeVpcsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
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

    public DescribeVpcsRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public DescribeVpcsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeVpcsRequest setVpcName(String vpcName) {
        this.vpcName = vpcName;
        return this;
    }
    public String getVpcName() {
        return this.vpcName;
    }

    public DescribeVpcsRequest setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
        return this;
    }
    public Boolean getIsDefault() {
        return this.isDefault;
    }

    public DescribeVpcsRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public DescribeVpcsRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
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

    public DescribeVpcsRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeVpcsRequest setVpcOwnerId(Long vpcOwnerId) {
        this.vpcOwnerId = vpcOwnerId;
        return this;
    }
    public Long getVpcOwnerId() {
        return this.vpcOwnerId;
    }

    public DescribeVpcsRequest setAdvancedFeature(Boolean advancedFeature) {
        this.advancedFeature = advancedFeature;
        return this;
    }
    public Boolean getAdvancedFeature() {
        return this.advancedFeature;
    }

    public DescribeVpcsRequest setDhcpOptionsSetId(String dhcpOptionsSetId) {
        this.dhcpOptionsSetId = dhcpOptionsSetId;
        return this;
    }
    public String getDhcpOptionsSetId() {
        return this.dhcpOptionsSetId;
    }

    public DescribeVpcsRequest setTag(java.util.List<DescribeVpcsRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<DescribeVpcsRequestTag> getTag() {
        return this.tag;
    }

    public static class DescribeVpcsRequestTag extends TeaModel {
        public static DescribeVpcsRequestTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpcsRequestTag self = new DescribeVpcsRequestTag();
            return TeaModel.build(map, self);
        }

    }

}
