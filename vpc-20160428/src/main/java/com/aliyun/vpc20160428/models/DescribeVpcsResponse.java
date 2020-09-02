// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeVpcsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public Integer totalCount;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Integer pageNumber;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("Vpcs")
    @Validation(required = true)
    public DescribeVpcsResponseVpcs vpcs;

    public static DescribeVpcsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVpcsResponse self = new DescribeVpcsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVpcsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeVpcsResponse setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeVpcsResponse setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeVpcsResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeVpcsResponse setVpcs(DescribeVpcsResponseVpcs vpcs) {
        this.vpcs = vpcs;
        return this;
    }
    public DescribeVpcsResponseVpcs getVpcs() {
        return this.vpcs;
    }

    public static class DescribeVpcsResponseVpcsVpcTagsTag extends TeaModel {
        @NameInMap("Key")
        @Validation(required = true)
        public String key;

        @NameInMap("Value")
        @Validation(required = true)
        public String value;

        public static DescribeVpcsResponseVpcsVpcTagsTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpcsResponseVpcsVpcTagsTag self = new DescribeVpcsResponseVpcsVpcTagsTag();
            return TeaModel.build(map, self);
        }

        public DescribeVpcsResponseVpcsVpcTagsTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeVpcsResponseVpcsVpcTagsTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeVpcsResponseVpcsVpcTags extends TeaModel {
        @NameInMap("Tag")
        @Validation(required = true)
        public java.util.List<DescribeVpcsResponseVpcsVpcTagsTag> tag;

        public static DescribeVpcsResponseVpcsVpcTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpcsResponseVpcsVpcTags self = new DescribeVpcsResponseVpcsVpcTags();
            return TeaModel.build(map, self);
        }

        public DescribeVpcsResponseVpcsVpcTags setTag(java.util.List<DescribeVpcsResponseVpcsVpcTagsTag> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<DescribeVpcsResponseVpcsVpcTagsTag> getTag() {
            return this.tag;
        }

    }

    public static class DescribeVpcsResponseVpcsVpcVSwitchIds extends TeaModel {
        // VSwitchId
        @NameInMap("VSwitchId")
        @Validation(required = true)
        public java.util.List<String> vSwitchId;

        public static DescribeVpcsResponseVpcsVpcVSwitchIds build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpcsResponseVpcsVpcVSwitchIds self = new DescribeVpcsResponseVpcsVpcVSwitchIds();
            return TeaModel.build(map, self);
        }

        public DescribeVpcsResponseVpcsVpcVSwitchIds setVSwitchId(java.util.List<String> vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public java.util.List<String> getVSwitchId() {
            return this.vSwitchId;
        }

    }

    public static class DescribeVpcsResponseVpcsVpcUserCidrs extends TeaModel {
        // UserCidr
        @NameInMap("UserCidr")
        @Validation(required = true)
        public java.util.List<String> userCidr;

        public static DescribeVpcsResponseVpcsVpcUserCidrs build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpcsResponseVpcsVpcUserCidrs self = new DescribeVpcsResponseVpcsVpcUserCidrs();
            return TeaModel.build(map, self);
        }

        public DescribeVpcsResponseVpcsVpcUserCidrs setUserCidr(java.util.List<String> userCidr) {
            this.userCidr = userCidr;
            return this;
        }
        public java.util.List<String> getUserCidr() {
            return this.userCidr;
        }

    }

    public static class DescribeVpcsResponseVpcsVpcNatGatewayIds extends TeaModel {
        // NatGatewayIds
        @NameInMap("NatGatewayIds")
        @Validation(required = true)
        public java.util.List<String> natGatewayIds;

        public static DescribeVpcsResponseVpcsVpcNatGatewayIds build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpcsResponseVpcsVpcNatGatewayIds self = new DescribeVpcsResponseVpcsVpcNatGatewayIds();
            return TeaModel.build(map, self);
        }

        public DescribeVpcsResponseVpcsVpcNatGatewayIds setNatGatewayIds(java.util.List<String> natGatewayIds) {
            this.natGatewayIds = natGatewayIds;
            return this;
        }
        public java.util.List<String> getNatGatewayIds() {
            return this.natGatewayIds;
        }

    }

    public static class DescribeVpcsResponseVpcsVpcRouterTableIds extends TeaModel {
        // RouterTableIds
        @NameInMap("RouterTableIds")
        @Validation(required = true)
        public java.util.List<String> routerTableIds;

        public static DescribeVpcsResponseVpcsVpcRouterTableIds build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpcsResponseVpcsVpcRouterTableIds self = new DescribeVpcsResponseVpcsVpcRouterTableIds();
            return TeaModel.build(map, self);
        }

        public DescribeVpcsResponseVpcsVpcRouterTableIds setRouterTableIds(java.util.List<String> routerTableIds) {
            this.routerTableIds = routerTableIds;
            return this;
        }
        public java.util.List<String> getRouterTableIds() {
            return this.routerTableIds;
        }

    }

    public static class DescribeVpcsResponseVpcsVpcSecondaryCidrBlocks extends TeaModel {
        // SecondaryCidrBlock
        @NameInMap("SecondaryCidrBlock")
        @Validation(required = true)
        public java.util.List<String> secondaryCidrBlock;

        public static DescribeVpcsResponseVpcsVpcSecondaryCidrBlocks build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpcsResponseVpcsVpcSecondaryCidrBlocks self = new DescribeVpcsResponseVpcsVpcSecondaryCidrBlocks();
            return TeaModel.build(map, self);
        }

        public DescribeVpcsResponseVpcsVpcSecondaryCidrBlocks setSecondaryCidrBlock(java.util.List<String> secondaryCidrBlock) {
            this.secondaryCidrBlock = secondaryCidrBlock;
            return this;
        }
        public java.util.List<String> getSecondaryCidrBlock() {
            return this.secondaryCidrBlock;
        }

    }

    public static class DescribeVpcsResponseVpcsVpc extends TeaModel {
        @NameInMap("VpcId")
        @Validation(required = true)
        public String vpcId;

        @NameInMap("RegionId")
        @Validation(required = true)
        public String regionId;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("VpcName")
        @Validation(required = true)
        public String vpcName;

        @NameInMap("CreationTime")
        @Validation(required = true)
        public String creationTime;

        @NameInMap("CidrBlock")
        @Validation(required = true)
        public String cidrBlock;

        @NameInMap("Ipv6CidrBlock")
        @Validation(required = true)
        public String ipv6CidrBlock;

        @NameInMap("VRouterId")
        @Validation(required = true)
        public String VRouterId;

        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        @NameInMap("IsDefault")
        @Validation(required = true)
        public Boolean isDefault;

        @NameInMap("NetworkAclNum")
        @Validation(required = true)
        public String networkAclNum;

        @NameInMap("ResourceGroupId")
        @Validation(required = true)
        public String resourceGroupId;

        @NameInMap("CenStatus")
        @Validation(required = true)
        public String cenStatus;

        @NameInMap("OwnerId")
        @Validation(required = true)
        public Long ownerId;

        @NameInMap("SupportAdvancedFeature")
        @Validation(required = true)
        public Boolean supportAdvancedFeature;

        @NameInMap("AdvancedResource")
        @Validation(required = true)
        public Boolean advancedResource;

        @NameInMap("DhcpOptionsSetId")
        @Validation(required = true)
        public String dhcpOptionsSetId;

        @NameInMap("DhcpOptionsSetStatus")
        @Validation(required = true)
        public String dhcpOptionsSetStatus;

        @NameInMap("Tags")
        @Validation(required = true)
        public DescribeVpcsResponseVpcsVpcTags tags;

        @NameInMap("VSwitchIds")
        @Validation(required = true)
        public DescribeVpcsResponseVpcsVpcVSwitchIds vSwitchIds;

        @NameInMap("UserCidrs")
        @Validation(required = true)
        public DescribeVpcsResponseVpcsVpcUserCidrs userCidrs;

        @NameInMap("NatGatewayIds")
        @Validation(required = true)
        public DescribeVpcsResponseVpcsVpcNatGatewayIds natGatewayIds;

        @NameInMap("RouterTableIds")
        @Validation(required = true)
        public DescribeVpcsResponseVpcsVpcRouterTableIds routerTableIds;

        @NameInMap("SecondaryCidrBlocks")
        @Validation(required = true)
        public DescribeVpcsResponseVpcsVpcSecondaryCidrBlocks secondaryCidrBlocks;

        public static DescribeVpcsResponseVpcsVpc build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpcsResponseVpcsVpc self = new DescribeVpcsResponseVpcsVpc();
            return TeaModel.build(map, self);
        }

        public DescribeVpcsResponseVpcsVpc setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public DescribeVpcsResponseVpcsVpc setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeVpcsResponseVpcsVpc setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeVpcsResponseVpcsVpc setVpcName(String vpcName) {
            this.vpcName = vpcName;
            return this;
        }
        public String getVpcName() {
            return this.vpcName;
        }

        public DescribeVpcsResponseVpcsVpc setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeVpcsResponseVpcsVpc setCidrBlock(String cidrBlock) {
            this.cidrBlock = cidrBlock;
            return this;
        }
        public String getCidrBlock() {
            return this.cidrBlock;
        }

        public DescribeVpcsResponseVpcsVpc setIpv6CidrBlock(String ipv6CidrBlock) {
            this.ipv6CidrBlock = ipv6CidrBlock;
            return this;
        }
        public String getIpv6CidrBlock() {
            return this.ipv6CidrBlock;
        }

        public DescribeVpcsResponseVpcsVpc setVRouterId(String VRouterId) {
            this.VRouterId = VRouterId;
            return this;
        }
        public String getVRouterId() {
            return this.VRouterId;
        }

        public DescribeVpcsResponseVpcsVpc setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeVpcsResponseVpcsVpc setIsDefault(Boolean isDefault) {
            this.isDefault = isDefault;
            return this;
        }
        public Boolean getIsDefault() {
            return this.isDefault;
        }

        public DescribeVpcsResponseVpcsVpc setNetworkAclNum(String networkAclNum) {
            this.networkAclNum = networkAclNum;
            return this;
        }
        public String getNetworkAclNum() {
            return this.networkAclNum;
        }

        public DescribeVpcsResponseVpcsVpc setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeVpcsResponseVpcsVpc setCenStatus(String cenStatus) {
            this.cenStatus = cenStatus;
            return this;
        }
        public String getCenStatus() {
            return this.cenStatus;
        }

        public DescribeVpcsResponseVpcsVpc setOwnerId(Long ownerId) {
            this.ownerId = ownerId;
            return this;
        }
        public Long getOwnerId() {
            return this.ownerId;
        }

        public DescribeVpcsResponseVpcsVpc setSupportAdvancedFeature(Boolean supportAdvancedFeature) {
            this.supportAdvancedFeature = supportAdvancedFeature;
            return this;
        }
        public Boolean getSupportAdvancedFeature() {
            return this.supportAdvancedFeature;
        }

        public DescribeVpcsResponseVpcsVpc setAdvancedResource(Boolean advancedResource) {
            this.advancedResource = advancedResource;
            return this;
        }
        public Boolean getAdvancedResource() {
            return this.advancedResource;
        }

        public DescribeVpcsResponseVpcsVpc setDhcpOptionsSetId(String dhcpOptionsSetId) {
            this.dhcpOptionsSetId = dhcpOptionsSetId;
            return this;
        }
        public String getDhcpOptionsSetId() {
            return this.dhcpOptionsSetId;
        }

        public DescribeVpcsResponseVpcsVpc setDhcpOptionsSetStatus(String dhcpOptionsSetStatus) {
            this.dhcpOptionsSetStatus = dhcpOptionsSetStatus;
            return this;
        }
        public String getDhcpOptionsSetStatus() {
            return this.dhcpOptionsSetStatus;
        }

        public DescribeVpcsResponseVpcsVpc setTags(DescribeVpcsResponseVpcsVpcTags tags) {
            this.tags = tags;
            return this;
        }
        public DescribeVpcsResponseVpcsVpcTags getTags() {
            return this.tags;
        }

        public DescribeVpcsResponseVpcsVpc setVSwitchIds(DescribeVpcsResponseVpcsVpcVSwitchIds vSwitchIds) {
            this.vSwitchIds = vSwitchIds;
            return this;
        }
        public DescribeVpcsResponseVpcsVpcVSwitchIds getVSwitchIds() {
            return this.vSwitchIds;
        }

        public DescribeVpcsResponseVpcsVpc setUserCidrs(DescribeVpcsResponseVpcsVpcUserCidrs userCidrs) {
            this.userCidrs = userCidrs;
            return this;
        }
        public DescribeVpcsResponseVpcsVpcUserCidrs getUserCidrs() {
            return this.userCidrs;
        }

        public DescribeVpcsResponseVpcsVpc setNatGatewayIds(DescribeVpcsResponseVpcsVpcNatGatewayIds natGatewayIds) {
            this.natGatewayIds = natGatewayIds;
            return this;
        }
        public DescribeVpcsResponseVpcsVpcNatGatewayIds getNatGatewayIds() {
            return this.natGatewayIds;
        }

        public DescribeVpcsResponseVpcsVpc setRouterTableIds(DescribeVpcsResponseVpcsVpcRouterTableIds routerTableIds) {
            this.routerTableIds = routerTableIds;
            return this;
        }
        public DescribeVpcsResponseVpcsVpcRouterTableIds getRouterTableIds() {
            return this.routerTableIds;
        }

        public DescribeVpcsResponseVpcsVpc setSecondaryCidrBlocks(DescribeVpcsResponseVpcsVpcSecondaryCidrBlocks secondaryCidrBlocks) {
            this.secondaryCidrBlocks = secondaryCidrBlocks;
            return this;
        }
        public DescribeVpcsResponseVpcsVpcSecondaryCidrBlocks getSecondaryCidrBlocks() {
            return this.secondaryCidrBlocks;
        }

    }

    public static class DescribeVpcsResponseVpcs extends TeaModel {
        @NameInMap("Vpc")
        @Validation(required = true)
        public java.util.List<DescribeVpcsResponseVpcsVpc> vpc;

        public static DescribeVpcsResponseVpcs build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpcsResponseVpcs self = new DescribeVpcsResponseVpcs();
            return TeaModel.build(map, self);
        }

        public DescribeVpcsResponseVpcs setVpc(java.util.List<DescribeVpcsResponseVpcsVpc> vpc) {
            this.vpc = vpc;
            return this;
        }
        public java.util.List<DescribeVpcsResponseVpcsVpc> getVpc() {
            return this.vpc;
        }

    }

}
