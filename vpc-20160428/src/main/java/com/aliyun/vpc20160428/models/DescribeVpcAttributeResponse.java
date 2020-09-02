// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeVpcAttributeResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

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

    @NameInMap("ClassicLinkEnabled")
    @Validation(required = true)
    public Boolean classicLinkEnabled;

    @NameInMap("ResourceGroupId")
    @Validation(required = true)
    public String resourceGroupId;

    @NameInMap("NetworkAclNum")
    @Validation(required = true)
    public String networkAclNum;

    @NameInMap("OwnerId")
    @Validation(required = true)
    public Long ownerId;

    @NameInMap("DhcpOptionsSetId")
    @Validation(required = true)
    public String dhcpOptionsSetId;

    @NameInMap("DhcpOptionsSetStatus")
    @Validation(required = true)
    public String dhcpOptionsSetStatus;

    @NameInMap("AssociatedCens")
    @Validation(required = true)
    public DescribeVpcAttributeResponseAssociatedCens associatedCens;

    @NameInMap("CloudResources")
    @Validation(required = true)
    public DescribeVpcAttributeResponseCloudResources cloudResources;

    @NameInMap("VSwitchIds")
    @Validation(required = true)
    public DescribeVpcAttributeResponseVSwitchIds vSwitchIds;

    @NameInMap("UserCidrs")
    @Validation(required = true)
    public DescribeVpcAttributeResponseUserCidrs userCidrs;

    @NameInMap("SecondaryCidrBlocks")
    @Validation(required = true)
    public DescribeVpcAttributeResponseSecondaryCidrBlocks secondaryCidrBlocks;

    public static DescribeVpcAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVpcAttributeResponse self = new DescribeVpcAttributeResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVpcAttributeResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeVpcAttributeResponse setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public DescribeVpcAttributeResponse setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeVpcAttributeResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeVpcAttributeResponse setVpcName(String vpcName) {
        this.vpcName = vpcName;
        return this;
    }
    public String getVpcName() {
        return this.vpcName;
    }

    public DescribeVpcAttributeResponse setCreationTime(String creationTime) {
        this.creationTime = creationTime;
        return this;
    }
    public String getCreationTime() {
        return this.creationTime;
    }

    public DescribeVpcAttributeResponse setCidrBlock(String cidrBlock) {
        this.cidrBlock = cidrBlock;
        return this;
    }
    public String getCidrBlock() {
        return this.cidrBlock;
    }

    public DescribeVpcAttributeResponse setIpv6CidrBlock(String ipv6CidrBlock) {
        this.ipv6CidrBlock = ipv6CidrBlock;
        return this;
    }
    public String getIpv6CidrBlock() {
        return this.ipv6CidrBlock;
    }

    public DescribeVpcAttributeResponse setVRouterId(String VRouterId) {
        this.VRouterId = VRouterId;
        return this;
    }
    public String getVRouterId() {
        return this.VRouterId;
    }

    public DescribeVpcAttributeResponse setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DescribeVpcAttributeResponse setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
        return this;
    }
    public Boolean getIsDefault() {
        return this.isDefault;
    }

    public DescribeVpcAttributeResponse setClassicLinkEnabled(Boolean classicLinkEnabled) {
        this.classicLinkEnabled = classicLinkEnabled;
        return this;
    }
    public Boolean getClassicLinkEnabled() {
        return this.classicLinkEnabled;
    }

    public DescribeVpcAttributeResponse setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeVpcAttributeResponse setNetworkAclNum(String networkAclNum) {
        this.networkAclNum = networkAclNum;
        return this;
    }
    public String getNetworkAclNum() {
        return this.networkAclNum;
    }

    public DescribeVpcAttributeResponse setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeVpcAttributeResponse setDhcpOptionsSetId(String dhcpOptionsSetId) {
        this.dhcpOptionsSetId = dhcpOptionsSetId;
        return this;
    }
    public String getDhcpOptionsSetId() {
        return this.dhcpOptionsSetId;
    }

    public DescribeVpcAttributeResponse setDhcpOptionsSetStatus(String dhcpOptionsSetStatus) {
        this.dhcpOptionsSetStatus = dhcpOptionsSetStatus;
        return this;
    }
    public String getDhcpOptionsSetStatus() {
        return this.dhcpOptionsSetStatus;
    }

    public DescribeVpcAttributeResponse setAssociatedCens(DescribeVpcAttributeResponseAssociatedCens associatedCens) {
        this.associatedCens = associatedCens;
        return this;
    }
    public DescribeVpcAttributeResponseAssociatedCens getAssociatedCens() {
        return this.associatedCens;
    }

    public DescribeVpcAttributeResponse setCloudResources(DescribeVpcAttributeResponseCloudResources cloudResources) {
        this.cloudResources = cloudResources;
        return this;
    }
    public DescribeVpcAttributeResponseCloudResources getCloudResources() {
        return this.cloudResources;
    }

    public DescribeVpcAttributeResponse setVSwitchIds(DescribeVpcAttributeResponseVSwitchIds vSwitchIds) {
        this.vSwitchIds = vSwitchIds;
        return this;
    }
    public DescribeVpcAttributeResponseVSwitchIds getVSwitchIds() {
        return this.vSwitchIds;
    }

    public DescribeVpcAttributeResponse setUserCidrs(DescribeVpcAttributeResponseUserCidrs userCidrs) {
        this.userCidrs = userCidrs;
        return this;
    }
    public DescribeVpcAttributeResponseUserCidrs getUserCidrs() {
        return this.userCidrs;
    }

    public DescribeVpcAttributeResponse setSecondaryCidrBlocks(DescribeVpcAttributeResponseSecondaryCidrBlocks secondaryCidrBlocks) {
        this.secondaryCidrBlocks = secondaryCidrBlocks;
        return this;
    }
    public DescribeVpcAttributeResponseSecondaryCidrBlocks getSecondaryCidrBlocks() {
        return this.secondaryCidrBlocks;
    }

    public static class DescribeVpcAttributeResponseAssociatedCensAssociatedCen extends TeaModel {
        @NameInMap("CenId")
        @Validation(required = true)
        public String cenId;

        @NameInMap("CenOwnerId")
        @Validation(required = true)
        public Long cenOwnerId;

        @NameInMap("CenStatus")
        @Validation(required = true)
        public String cenStatus;

        public static DescribeVpcAttributeResponseAssociatedCensAssociatedCen build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpcAttributeResponseAssociatedCensAssociatedCen self = new DescribeVpcAttributeResponseAssociatedCensAssociatedCen();
            return TeaModel.build(map, self);
        }

        public DescribeVpcAttributeResponseAssociatedCensAssociatedCen setCenId(String cenId) {
            this.cenId = cenId;
            return this;
        }
        public String getCenId() {
            return this.cenId;
        }

        public DescribeVpcAttributeResponseAssociatedCensAssociatedCen setCenOwnerId(Long cenOwnerId) {
            this.cenOwnerId = cenOwnerId;
            return this;
        }
        public Long getCenOwnerId() {
            return this.cenOwnerId;
        }

        public DescribeVpcAttributeResponseAssociatedCensAssociatedCen setCenStatus(String cenStatus) {
            this.cenStatus = cenStatus;
            return this;
        }
        public String getCenStatus() {
            return this.cenStatus;
        }

    }

    public static class DescribeVpcAttributeResponseAssociatedCens extends TeaModel {
        @NameInMap("AssociatedCen")
        @Validation(required = true)
        public java.util.List<DescribeVpcAttributeResponseAssociatedCensAssociatedCen> associatedCen;

        public static DescribeVpcAttributeResponseAssociatedCens build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpcAttributeResponseAssociatedCens self = new DescribeVpcAttributeResponseAssociatedCens();
            return TeaModel.build(map, self);
        }

        public DescribeVpcAttributeResponseAssociatedCens setAssociatedCen(java.util.List<DescribeVpcAttributeResponseAssociatedCensAssociatedCen> associatedCen) {
            this.associatedCen = associatedCen;
            return this;
        }
        public java.util.List<DescribeVpcAttributeResponseAssociatedCensAssociatedCen> getAssociatedCen() {
            return this.associatedCen;
        }

    }

    public static class DescribeVpcAttributeResponseCloudResourcesCloudResourceSetType extends TeaModel {
        @NameInMap("ResourceType")
        @Validation(required = true)
        public String resourceType;

        @NameInMap("ResourceCount")
        @Validation(required = true)
        public Integer resourceCount;

        public static DescribeVpcAttributeResponseCloudResourcesCloudResourceSetType build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpcAttributeResponseCloudResourcesCloudResourceSetType self = new DescribeVpcAttributeResponseCloudResourcesCloudResourceSetType();
            return TeaModel.build(map, self);
        }

        public DescribeVpcAttributeResponseCloudResourcesCloudResourceSetType setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public DescribeVpcAttributeResponseCloudResourcesCloudResourceSetType setResourceCount(Integer resourceCount) {
            this.resourceCount = resourceCount;
            return this;
        }
        public Integer getResourceCount() {
            return this.resourceCount;
        }

    }

    public static class DescribeVpcAttributeResponseCloudResources extends TeaModel {
        @NameInMap("CloudResourceSetType")
        @Validation(required = true)
        public java.util.List<DescribeVpcAttributeResponseCloudResourcesCloudResourceSetType> cloudResourceSetType;

        public static DescribeVpcAttributeResponseCloudResources build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpcAttributeResponseCloudResources self = new DescribeVpcAttributeResponseCloudResources();
            return TeaModel.build(map, self);
        }

        public DescribeVpcAttributeResponseCloudResources setCloudResourceSetType(java.util.List<DescribeVpcAttributeResponseCloudResourcesCloudResourceSetType> cloudResourceSetType) {
            this.cloudResourceSetType = cloudResourceSetType;
            return this;
        }
        public java.util.List<DescribeVpcAttributeResponseCloudResourcesCloudResourceSetType> getCloudResourceSetType() {
            return this.cloudResourceSetType;
        }

    }

    public static class DescribeVpcAttributeResponseVSwitchIds extends TeaModel {
        @NameInMap("VSwitchId")
        @Validation(required = true)
        public java.util.List<String> vSwitchId;

        public static DescribeVpcAttributeResponseVSwitchIds build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpcAttributeResponseVSwitchIds self = new DescribeVpcAttributeResponseVSwitchIds();
            return TeaModel.build(map, self);
        }

        public DescribeVpcAttributeResponseVSwitchIds setVSwitchId(java.util.List<String> vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public java.util.List<String> getVSwitchId() {
            return this.vSwitchId;
        }

    }

    public static class DescribeVpcAttributeResponseUserCidrs extends TeaModel {
        @NameInMap("UserCidr")
        @Validation(required = true)
        public java.util.List<String> userCidr;

        public static DescribeVpcAttributeResponseUserCidrs build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpcAttributeResponseUserCidrs self = new DescribeVpcAttributeResponseUserCidrs();
            return TeaModel.build(map, self);
        }

        public DescribeVpcAttributeResponseUserCidrs setUserCidr(java.util.List<String> userCidr) {
            this.userCidr = userCidr;
            return this;
        }
        public java.util.List<String> getUserCidr() {
            return this.userCidr;
        }

    }

    public static class DescribeVpcAttributeResponseSecondaryCidrBlocks extends TeaModel {
        @NameInMap("SecondaryCidrBlock")
        @Validation(required = true)
        public java.util.List<String> secondaryCidrBlock;

        public static DescribeVpcAttributeResponseSecondaryCidrBlocks build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpcAttributeResponseSecondaryCidrBlocks self = new DescribeVpcAttributeResponseSecondaryCidrBlocks();
            return TeaModel.build(map, self);
        }

        public DescribeVpcAttributeResponseSecondaryCidrBlocks setSecondaryCidrBlock(java.util.List<String> secondaryCidrBlock) {
            this.secondaryCidrBlock = secondaryCidrBlock;
            return this;
        }
        public java.util.List<String> getSecondaryCidrBlock() {
            return this.secondaryCidrBlock;
        }

    }

}
