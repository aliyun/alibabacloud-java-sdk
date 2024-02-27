// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeVpcAttributeResponseBody extends TeaModel {
    /**
     * <p>The list of Cloud Enterprise Network (CEN) instances to which the VPC is attached.</p>
     * <br>
     * <p>If the VPC is not attached to a CEN instance, the parameter is not returned.</p>
     */
    @NameInMap("AssociatedCens")
    public DescribeVpcAttributeResponseBodyAssociatedCens associatedCens;

    /**
     * <p>The propagation source associated with the VPC.</p>
     */
    @NameInMap("AssociatedPropagationSources")
    public DescribeVpcAttributeResponseBodyAssociatedPropagationSources associatedPropagationSources;

    /**
     * <p>The IPv4 CIDR block of the VPC.</p>
     */
    @NameInMap("CidrBlock")
    public String cidrBlock;

    /**
     * <p>Indicates whether the ClassicLink feature is enabled. Valid values:</p>
     * <br>
     * <p>*   **true**</p>
     * <p>*   **false** (default)</p>
     */
    @NameInMap("ClassicLinkEnabled")
    public Boolean classicLinkEnabled;

    /**
     * <p>The list of resources deployed in the VPC.</p>
     */
    @NameInMap("CloudResources")
    public DescribeVpcAttributeResponseBodyCloudResources cloudResources;

    /**
     * <p>The time when the VPC was created.</p>
     */
    @NameInMap("CreationTime")
    public String creationTime;

    /**
     * <p>The description of the VPC.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The ID of the DHCP options set.</p>
     */
    @NameInMap("DhcpOptionsSetId")
    public String dhcpOptionsSetId;

    /**
     * <p>The status of the DHCP options set. Valid values:</p>
     * <br>
     * <p>*   **Available**</p>
     * <p>*   **InUse**</p>
     * <p>*   **Deleted**</p>
     * <p>*   **Pending**</p>
     */
    @NameInMap("DhcpOptionsSetStatus")
    public String dhcpOptionsSetStatus;

    /**
     * <p>The ID of the IPv4 gateway.</p>
     */
    @NameInMap("Ipv4GatewayId")
    public String ipv4GatewayId;

    /**
     * <p>The IPv6 CIDR block of the VPC.</p>
     */
    @NameInMap("Ipv6CidrBlock")
    public String ipv6CidrBlock;

    /**
     * <p>The IPv6 CIDR block of the VPC.</p>
     */
    @NameInMap("Ipv6CidrBlocks")
    public DescribeVpcAttributeResponseBodyIpv6CidrBlocks ipv6CidrBlocks;

    /**
     * <p>Indicates whether the VPC is the default VPC. Valid values:</p>
     * <br>
     * <p>*   **true**</p>
     * <p>*   **false** (default)</p>
     */
    @NameInMap("IsDefault")
    public Boolean isDefault;

    /**
     * <p>The ID of the Alibaba Cloud account to which the VPC belongs.</p>
     */
    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The ID of the region to which the VPC belongs.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the resource group.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The secondary IPv4 CIDR block of the VPC.</p>
     */
    @NameInMap("SecondaryCidrBlocks")
    public DescribeVpcAttributeResponseBodySecondaryCidrBlocks secondaryCidrBlocks;

    /**
     * <p>The status of the VPC. Valid values:</p>
     * <br>
     * <p>*   **Available**</p>
     * <p>*   **Pending**</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>Indicates whether the VPC supports IPv4 gateways.</p>
     * <br>
     * <p>*   **true**</p>
     * <p>*   **false**</p>
     */
    @NameInMap("SupportIpv4Gateway")
    public Boolean supportIpv4Gateway;

    /**
     * <p>The information about the tags.</p>
     */
    @NameInMap("Tags")
    public DescribeVpcAttributeResponseBodyTags tags;

    /**
     * <p>The user CIDR block. Multiple CIDR blocks are separated by commas (,). At most three CIDR blocks are returned.</p>
     */
    @NameInMap("UserCidrs")
    public DescribeVpcAttributeResponseBodyUserCidrs userCidrs;

    /**
     * <p>The ID of the vRouter that belongs to the VPC.</p>
     */
    @NameInMap("VRouterId")
    public String VRouterId;

    /**
     * <p>The list of vSwitches deployed in the VPC.</p>
     */
    @NameInMap("VSwitchIds")
    public DescribeVpcAttributeResponseBodyVSwitchIds vSwitchIds;

    /**
     * <p>The ID of the VPC.</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    /**
     * <p>The name of the VPC.</p>
     */
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

    public DescribeVpcAttributeResponseBody setAssociatedPropagationSources(DescribeVpcAttributeResponseBodyAssociatedPropagationSources associatedPropagationSources) {
        this.associatedPropagationSources = associatedPropagationSources;
        return this;
    }
    public DescribeVpcAttributeResponseBodyAssociatedPropagationSources getAssociatedPropagationSources() {
        return this.associatedPropagationSources;
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

    public DescribeVpcAttributeResponseBody setIpv4GatewayId(String ipv4GatewayId) {
        this.ipv4GatewayId = ipv4GatewayId;
        return this;
    }
    public String getIpv4GatewayId() {
        return this.ipv4GatewayId;
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

    public DescribeVpcAttributeResponseBody setSupportIpv4Gateway(Boolean supportIpv4Gateway) {
        this.supportIpv4Gateway = supportIpv4Gateway;
        return this;
    }
    public Boolean getSupportIpv4Gateway() {
        return this.supportIpv4Gateway;
    }

    public DescribeVpcAttributeResponseBody setTags(DescribeVpcAttributeResponseBodyTags tags) {
        this.tags = tags;
        return this;
    }
    public DescribeVpcAttributeResponseBodyTags getTags() {
        return this.tags;
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
        /**
         * <p>The ID of the CEN instance to which the VPC is attached.</p>
         */
        @NameInMap("CenId")
        public String cenId;

        /**
         * <p>The ID of the account to which the CEN instance belongs.</p>
         */
        @NameInMap("CenOwnerId")
        public Long cenOwnerId;

        /**
         * <p>The status of the CEN instance.</p>
         * <br>
         * <p>**Attached** is returned only when the VPC is attached to a CEN instance.</p>
         */
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

    public static class DescribeVpcAttributeResponseBodyAssociatedPropagationSourcesAssociatedPropagationSources extends TeaModel {
        /**
         * <p>Indicates whether to propagate the routes of the VPC.</p>
         */
        @NameInMap("RoutePropagated")
        public Boolean routePropagated;

        /**
         * <p>The instance ID of the propagation source.</p>
         */
        @NameInMap("SourceInstanceId")
        public String sourceInstanceId;

        /**
         * <p>The ID of the account to which the propagation source belongs.</p>
         */
        @NameInMap("SourceOwnerId")
        public Long sourceOwnerId;

        /**
         * <p>The type of the propagation source. Valid values:</p>
         * <br>
         * <p>- **CEN**</p>
         * <p>- **VPN**</p>
         * <p>- **TR**</p>
         * <p>- **ECR**</p>
         */
        @NameInMap("SourceType")
        public String sourceType;

        /**
         * <p>The status indicating whether the propagation source is attached to the VPC. Valid values:</p>
         * <br>
         * <p>- **Attaching**</p>
         * <p>- **Attached**</p>
         * <p>- **Detaching**</p>
         */
        @NameInMap("Status")
        public String status;

        public static DescribeVpcAttributeResponseBodyAssociatedPropagationSourcesAssociatedPropagationSources build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpcAttributeResponseBodyAssociatedPropagationSourcesAssociatedPropagationSources self = new DescribeVpcAttributeResponseBodyAssociatedPropagationSourcesAssociatedPropagationSources();
            return TeaModel.build(map, self);
        }

        public DescribeVpcAttributeResponseBodyAssociatedPropagationSourcesAssociatedPropagationSources setRoutePropagated(Boolean routePropagated) {
            this.routePropagated = routePropagated;
            return this;
        }
        public Boolean getRoutePropagated() {
            return this.routePropagated;
        }

        public DescribeVpcAttributeResponseBodyAssociatedPropagationSourcesAssociatedPropagationSources setSourceInstanceId(String sourceInstanceId) {
            this.sourceInstanceId = sourceInstanceId;
            return this;
        }
        public String getSourceInstanceId() {
            return this.sourceInstanceId;
        }

        public DescribeVpcAttributeResponseBodyAssociatedPropagationSourcesAssociatedPropagationSources setSourceOwnerId(Long sourceOwnerId) {
            this.sourceOwnerId = sourceOwnerId;
            return this;
        }
        public Long getSourceOwnerId() {
            return this.sourceOwnerId;
        }

        public DescribeVpcAttributeResponseBodyAssociatedPropagationSourcesAssociatedPropagationSources setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

        public DescribeVpcAttributeResponseBodyAssociatedPropagationSourcesAssociatedPropagationSources setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeVpcAttributeResponseBodyAssociatedPropagationSources extends TeaModel {
        @NameInMap("AssociatedPropagationSources")
        public java.util.List<DescribeVpcAttributeResponseBodyAssociatedPropagationSourcesAssociatedPropagationSources> associatedPropagationSources;

        public static DescribeVpcAttributeResponseBodyAssociatedPropagationSources build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpcAttributeResponseBodyAssociatedPropagationSources self = new DescribeVpcAttributeResponseBodyAssociatedPropagationSources();
            return TeaModel.build(map, self);
        }

        public DescribeVpcAttributeResponseBodyAssociatedPropagationSources setAssociatedPropagationSources(java.util.List<DescribeVpcAttributeResponseBodyAssociatedPropagationSourcesAssociatedPropagationSources> associatedPropagationSources) {
            this.associatedPropagationSources = associatedPropagationSources;
            return this;
        }
        public java.util.List<DescribeVpcAttributeResponseBodyAssociatedPropagationSourcesAssociatedPropagationSources> getAssociatedPropagationSources() {
            return this.associatedPropagationSources;
        }

    }

    public static class DescribeVpcAttributeResponseBodyCloudResourcesCloudResourceSetType extends TeaModel {
        /**
         * <p>The number of resources in the VPC.</p>
         */
        @NameInMap("ResourceCount")
        public Integer resourceCount;

        /**
         * <p>The type of resource deployed in the VPC. Valid values: Valid values:</p>
         * <br>
         * <p>*   **VSwitch**</p>
         * <p>*   **VRouter**</p>
         * <p>*   **RouteTable**</p>
         */
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
        /**
         * <p>The IPv6 CIDR block of the VPC.</p>
         */
        @NameInMap("Ipv6CidrBlock")
        public String ipv6CidrBlock;

        /**
         * <p>The IPv6 CIDR block type of the VPC. Valid values:</p>
         * <br>
         * <p>*   **BGP** (default)</p>
         * <p>*   **ChinaMobile**</p>
         * <p>*   **ChinaUnicom**</p>
         * <p>*   **ChinaTelecom**</p>
         * <br>
         * <p>>  If you are allowed to use single-ISP bandwidth, valid values are **ChinaTelecom**, **ChinaUnicom**, and **ChinaMobile**</p>
         */
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

    public static class DescribeVpcAttributeResponseBodyTagsTag extends TeaModel {
        /**
         * <p>The key of tag N.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of tag N.</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeVpcAttributeResponseBodyTagsTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpcAttributeResponseBodyTagsTag self = new DescribeVpcAttributeResponseBodyTagsTag();
            return TeaModel.build(map, self);
        }

        public DescribeVpcAttributeResponseBodyTagsTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeVpcAttributeResponseBodyTagsTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeVpcAttributeResponseBodyTags extends TeaModel {
        @NameInMap("Tag")
        public java.util.List<DescribeVpcAttributeResponseBodyTagsTag> tag;

        public static DescribeVpcAttributeResponseBodyTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpcAttributeResponseBodyTags self = new DescribeVpcAttributeResponseBodyTags();
            return TeaModel.build(map, self);
        }

        public DescribeVpcAttributeResponseBodyTags setTag(java.util.List<DescribeVpcAttributeResponseBodyTagsTag> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<DescribeVpcAttributeResponseBodyTagsTag> getTag() {
            return this.tag;
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
