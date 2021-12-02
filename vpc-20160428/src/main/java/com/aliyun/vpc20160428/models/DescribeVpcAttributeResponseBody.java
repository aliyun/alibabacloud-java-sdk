// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeVpcAttributeResponseBody extends TeaModel {
    @NameInMap("AssociatedCens")
    public DescribeVpcAttributeResponseBodyAssociatedCens associatedCens;

    @NameInMap("CidrBlock")
    public String cidrBlock;

    @NameInMap("ClassicLinkEnabled")
    public Boolean classicLinkEnabled;

    @NameInMap("CloudResources")
    public DescribeVpcAttributeResponseBodyCloudResources cloudResources;

    @NameInMap("CreationTime")
    public String creationTime;

    @NameInMap("Description")
    public String description;

    @NameInMap("DhcpOptionsSetId")
    public String dhcpOptionsSetId;

    @NameInMap("DhcpOptionsSetStatus")
    public String dhcpOptionsSetStatus;

    @NameInMap("Ipv6CidrBlock")
    public String ipv6CidrBlock;

    @NameInMap("Ipv6CidrBlocks")
    public DescribeVpcAttributeResponseBodyIpv6CidrBlocks ipv6CidrBlocks;

    @NameInMap("IsDefault")
    public Boolean isDefault;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("SecondaryCidrBlocks")
    public DescribeVpcAttributeResponseBodySecondaryCidrBlocks secondaryCidrBlocks;

    @NameInMap("Status")
    public String status;

    @NameInMap("UserCidrs")
    public DescribeVpcAttributeResponseBodyUserCidrs userCidrs;

    @NameInMap("VRouterId")
    public String VRouterId;

    @NameInMap("VSwitchIds")
    public DescribeVpcAttributeResponseBodyVSwitchIds vSwitchIds;

    @NameInMap("VpcId")
    public String vpcId;

    @NameInMap("VpcName")
    public String vpcName;

    public static DescribeVpcAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVpcAttributeResponseBody self = new DescribeVpcAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVpcAttributeResponseBody setAssociatedCens(DescribeVpcAttributeResponseBodyAssociatedCens associatedCens) {
        this.associatedCens = associatedCens;
        return this;
    }
    public DescribeVpcAttributeResponseBodyAssociatedCens getAssociatedCens() {
        return this.associatedCens;
    }

    public DescribeVpcAttributeResponseBody setCidrBlock(String cidrBlock) {
        this.cidrBlock = cidrBlock;
        return this;
    }
    public String getCidrBlock() {
        return this.cidrBlock;
    }

    public DescribeVpcAttributeResponseBody setClassicLinkEnabled(Boolean classicLinkEnabled) {
        this.classicLinkEnabled = classicLinkEnabled;
        return this;
    }
    public Boolean getClassicLinkEnabled() {
        return this.classicLinkEnabled;
    }

    public DescribeVpcAttributeResponseBody setCloudResources(DescribeVpcAttributeResponseBodyCloudResources cloudResources) {
        this.cloudResources = cloudResources;
        return this;
    }
    public DescribeVpcAttributeResponseBodyCloudResources getCloudResources() {
        return this.cloudResources;
    }

    public DescribeVpcAttributeResponseBody setCreationTime(String creationTime) {
        this.creationTime = creationTime;
        return this;
    }
    public String getCreationTime() {
        return this.creationTime;
    }

    public DescribeVpcAttributeResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DescribeVpcAttributeResponseBody setDhcpOptionsSetId(String dhcpOptionsSetId) {
        this.dhcpOptionsSetId = dhcpOptionsSetId;
        return this;
    }
    public String getDhcpOptionsSetId() {
        return this.dhcpOptionsSetId;
    }

    public DescribeVpcAttributeResponseBody setDhcpOptionsSetStatus(String dhcpOptionsSetStatus) {
        this.dhcpOptionsSetStatus = dhcpOptionsSetStatus;
        return this;
    }
    public String getDhcpOptionsSetStatus() {
        return this.dhcpOptionsSetStatus;
    }

    public DescribeVpcAttributeResponseBody setIpv6CidrBlock(String ipv6CidrBlock) {
        this.ipv6CidrBlock = ipv6CidrBlock;
        return this;
    }
    public String getIpv6CidrBlock() {
        return this.ipv6CidrBlock;
    }

    public DescribeVpcAttributeResponseBody setIpv6CidrBlocks(DescribeVpcAttributeResponseBodyIpv6CidrBlocks ipv6CidrBlocks) {
        this.ipv6CidrBlocks = ipv6CidrBlocks;
        return this;
    }
    public DescribeVpcAttributeResponseBodyIpv6CidrBlocks getIpv6CidrBlocks() {
        return this.ipv6CidrBlocks;
    }

    public DescribeVpcAttributeResponseBody setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
        return this;
    }
    public Boolean getIsDefault() {
        return this.isDefault;
    }

    public DescribeVpcAttributeResponseBody setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeVpcAttributeResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeVpcAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeVpcAttributeResponseBody setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeVpcAttributeResponseBody setSecondaryCidrBlocks(DescribeVpcAttributeResponseBodySecondaryCidrBlocks secondaryCidrBlocks) {
        this.secondaryCidrBlocks = secondaryCidrBlocks;
        return this;
    }
    public DescribeVpcAttributeResponseBodySecondaryCidrBlocks getSecondaryCidrBlocks() {
        return this.secondaryCidrBlocks;
    }

    public DescribeVpcAttributeResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeVpcAttributeResponseBody setUserCidrs(DescribeVpcAttributeResponseBodyUserCidrs userCidrs) {
        this.userCidrs = userCidrs;
        return this;
    }
    public DescribeVpcAttributeResponseBodyUserCidrs getUserCidrs() {
        return this.userCidrs;
    }

    public DescribeVpcAttributeResponseBody setVRouterId(String VRouterId) {
        this.VRouterId = VRouterId;
        return this;
    }
    public String getVRouterId() {
        return this.VRouterId;
    }

    public DescribeVpcAttributeResponseBody setVSwitchIds(DescribeVpcAttributeResponseBodyVSwitchIds vSwitchIds) {
        this.vSwitchIds = vSwitchIds;
        return this;
    }
    public DescribeVpcAttributeResponseBodyVSwitchIds getVSwitchIds() {
        return this.vSwitchIds;
    }

    public DescribeVpcAttributeResponseBody setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public DescribeVpcAttributeResponseBody setVpcName(String vpcName) {
        this.vpcName = vpcName;
        return this;
    }
    public String getVpcName() {
        return this.vpcName;
    }

    public static class DescribeVpcAttributeResponseBodyAssociatedCensAssociatedCen extends TeaModel {
        @NameInMap("CenId")
        public String cenId;

        @NameInMap("CenOwnerId")
        public Long cenOwnerId;

        @NameInMap("CenStatus")
        public String cenStatus;

        public static DescribeVpcAttributeResponseBodyAssociatedCensAssociatedCen build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpcAttributeResponseBodyAssociatedCensAssociatedCen self = new DescribeVpcAttributeResponseBodyAssociatedCensAssociatedCen();
            return TeaModel.build(map, self);
        }

        public DescribeVpcAttributeResponseBodyAssociatedCensAssociatedCen setCenId(String cenId) {
            this.cenId = cenId;
            return this;
        }
        public String getCenId() {
            return this.cenId;
        }

        public DescribeVpcAttributeResponseBodyAssociatedCensAssociatedCen setCenOwnerId(Long cenOwnerId) {
            this.cenOwnerId = cenOwnerId;
            return this;
        }
        public Long getCenOwnerId() {
            return this.cenOwnerId;
        }

        public DescribeVpcAttributeResponseBodyAssociatedCensAssociatedCen setCenStatus(String cenStatus) {
            this.cenStatus = cenStatus;
            return this;
        }
        public String getCenStatus() {
            return this.cenStatus;
        }

    }

    public static class DescribeVpcAttributeResponseBodyAssociatedCens extends TeaModel {
        @NameInMap("AssociatedCen")
        public java.util.List<DescribeVpcAttributeResponseBodyAssociatedCensAssociatedCen> associatedCen;

        public static DescribeVpcAttributeResponseBodyAssociatedCens build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpcAttributeResponseBodyAssociatedCens self = new DescribeVpcAttributeResponseBodyAssociatedCens();
            return TeaModel.build(map, self);
        }

        public DescribeVpcAttributeResponseBodyAssociatedCens setAssociatedCen(java.util.List<DescribeVpcAttributeResponseBodyAssociatedCensAssociatedCen> associatedCen) {
            this.associatedCen = associatedCen;
            return this;
        }
        public java.util.List<DescribeVpcAttributeResponseBodyAssociatedCensAssociatedCen> getAssociatedCen() {
            return this.associatedCen;
        }

    }

    public static class DescribeVpcAttributeResponseBodyCloudResourcesCloudResourceSetType extends TeaModel {
        @NameInMap("ResourceCount")
        public Integer resourceCount;

        @NameInMap("ResourceType")
        public String resourceType;

        public static DescribeVpcAttributeResponseBodyCloudResourcesCloudResourceSetType build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpcAttributeResponseBodyCloudResourcesCloudResourceSetType self = new DescribeVpcAttributeResponseBodyCloudResourcesCloudResourceSetType();
            return TeaModel.build(map, self);
        }

        public DescribeVpcAttributeResponseBodyCloudResourcesCloudResourceSetType setResourceCount(Integer resourceCount) {
            this.resourceCount = resourceCount;
            return this;
        }
        public Integer getResourceCount() {
            return this.resourceCount;
        }

        public DescribeVpcAttributeResponseBodyCloudResourcesCloudResourceSetType setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

    }

    public static class DescribeVpcAttributeResponseBodyCloudResources extends TeaModel {
        @NameInMap("CloudResourceSetType")
        public java.util.List<DescribeVpcAttributeResponseBodyCloudResourcesCloudResourceSetType> cloudResourceSetType;

        public static DescribeVpcAttributeResponseBodyCloudResources build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpcAttributeResponseBodyCloudResources self = new DescribeVpcAttributeResponseBodyCloudResources();
            return TeaModel.build(map, self);
        }

        public DescribeVpcAttributeResponseBodyCloudResources setCloudResourceSetType(java.util.List<DescribeVpcAttributeResponseBodyCloudResourcesCloudResourceSetType> cloudResourceSetType) {
            this.cloudResourceSetType = cloudResourceSetType;
            return this;
        }
        public java.util.List<DescribeVpcAttributeResponseBodyCloudResourcesCloudResourceSetType> getCloudResourceSetType() {
            return this.cloudResourceSetType;
        }

    }

    public static class DescribeVpcAttributeResponseBodyIpv6CidrBlocksIpv6CidrBlock extends TeaModel {
        @NameInMap("Ipv6CidrBlock")
        public String ipv6CidrBlock;

        @NameInMap("Ipv6Isp")
        public String ipv6Isp;

        public static DescribeVpcAttributeResponseBodyIpv6CidrBlocksIpv6CidrBlock build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpcAttributeResponseBodyIpv6CidrBlocksIpv6CidrBlock self = new DescribeVpcAttributeResponseBodyIpv6CidrBlocksIpv6CidrBlock();
            return TeaModel.build(map, self);
        }

        public DescribeVpcAttributeResponseBodyIpv6CidrBlocksIpv6CidrBlock setIpv6CidrBlock(String ipv6CidrBlock) {
            this.ipv6CidrBlock = ipv6CidrBlock;
            return this;
        }
        public String getIpv6CidrBlock() {
            return this.ipv6CidrBlock;
        }

        public DescribeVpcAttributeResponseBodyIpv6CidrBlocksIpv6CidrBlock setIpv6Isp(String ipv6Isp) {
            this.ipv6Isp = ipv6Isp;
            return this;
        }
        public String getIpv6Isp() {
            return this.ipv6Isp;
        }

    }

    public static class DescribeVpcAttributeResponseBodyIpv6CidrBlocks extends TeaModel {
        @NameInMap("Ipv6CidrBlock")
        public java.util.List<DescribeVpcAttributeResponseBodyIpv6CidrBlocksIpv6CidrBlock> ipv6CidrBlock;

        public static DescribeVpcAttributeResponseBodyIpv6CidrBlocks build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpcAttributeResponseBodyIpv6CidrBlocks self = new DescribeVpcAttributeResponseBodyIpv6CidrBlocks();
            return TeaModel.build(map, self);
        }

        public DescribeVpcAttributeResponseBodyIpv6CidrBlocks setIpv6CidrBlock(java.util.List<DescribeVpcAttributeResponseBodyIpv6CidrBlocksIpv6CidrBlock> ipv6CidrBlock) {
            this.ipv6CidrBlock = ipv6CidrBlock;
            return this;
        }
        public java.util.List<DescribeVpcAttributeResponseBodyIpv6CidrBlocksIpv6CidrBlock> getIpv6CidrBlock() {
            return this.ipv6CidrBlock;
        }

    }

    public static class DescribeVpcAttributeResponseBodySecondaryCidrBlocks extends TeaModel {
        @NameInMap("SecondaryCidrBlock")
        public java.util.List<String> secondaryCidrBlock;

        public static DescribeVpcAttributeResponseBodySecondaryCidrBlocks build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpcAttributeResponseBodySecondaryCidrBlocks self = new DescribeVpcAttributeResponseBodySecondaryCidrBlocks();
            return TeaModel.build(map, self);
        }

        public DescribeVpcAttributeResponseBodySecondaryCidrBlocks setSecondaryCidrBlock(java.util.List<String> secondaryCidrBlock) {
            this.secondaryCidrBlock = secondaryCidrBlock;
            return this;
        }
        public java.util.List<String> getSecondaryCidrBlock() {
            return this.secondaryCidrBlock;
        }

    }

    public static class DescribeVpcAttributeResponseBodyUserCidrs extends TeaModel {
        @NameInMap("UserCidr")
        public java.util.List<String> userCidr;

        public static DescribeVpcAttributeResponseBodyUserCidrs build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpcAttributeResponseBodyUserCidrs self = new DescribeVpcAttributeResponseBodyUserCidrs();
            return TeaModel.build(map, self);
        }

        public DescribeVpcAttributeResponseBodyUserCidrs setUserCidr(java.util.List<String> userCidr) {
            this.userCidr = userCidr;
            return this;
        }
        public java.util.List<String> getUserCidr() {
            return this.userCidr;
        }

    }

    public static class DescribeVpcAttributeResponseBodyVSwitchIds extends TeaModel {
        @NameInMap("VSwitchId")
        public java.util.List<String> vSwitchId;

        public static DescribeVpcAttributeResponseBodyVSwitchIds build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpcAttributeResponseBodyVSwitchIds self = new DescribeVpcAttributeResponseBodyVSwitchIds();
            return TeaModel.build(map, self);
        }

        public DescribeVpcAttributeResponseBodyVSwitchIds setVSwitchId(java.util.List<String> vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public java.util.List<String> getVSwitchId() {
            return this.vSwitchId;
        }

    }

}
