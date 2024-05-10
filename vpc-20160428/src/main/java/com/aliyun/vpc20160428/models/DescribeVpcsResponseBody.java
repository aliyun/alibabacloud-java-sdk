// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeVpcsResponseBody extends TeaModel {
    /**
     * <p>The page number.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The number of entries returned.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    /**
     * <p>The details about the VPC.</p>
     */
    @NameInMap("Vpcs")
    public DescribeVpcsResponseBodyVpcs vpcs;

    public static DescribeVpcsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVpcsResponseBody self = new DescribeVpcsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVpcsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeVpcsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeVpcsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeVpcsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeVpcsResponseBody setVpcs(DescribeVpcsResponseBodyVpcs vpcs) {
        this.vpcs = vpcs;
        return this;
    }
    public DescribeVpcsResponseBodyVpcs getVpcs() {
        return this.vpcs;
    }

    public static class DescribeVpcsResponseBodyVpcsVpcIpv6CidrBlocksIpv6CidrBlock extends TeaModel {
        /**
         * <p>The IPv6 CIDR block of the VPC.</p>
         */
        @NameInMap("Ipv6CidrBlock")
        public String ipv6CidrBlock;

        /**
         * <p>The type of IPv6 CIDR block. Valid values:</p>
         * <br>
         * <p>*   **BGP**</p>
         * <p>*   **ChinaMobile**</p>
         * <p>*   **ChinaUnicom**</p>
         * <p>*   **ChinaTelecom**</p>
         * <br>
         * <p>>  If your Alibaba Cloud account is allowed to activate single-ISP bandwidth, you can set this parameter to **ChinaTelecom**, **ChinaUnicom**, or **ChinaMobile**.</p>
         */
        @NameInMap("Ipv6Isp")
        public String ipv6Isp;

        public static DescribeVpcsResponseBodyVpcsVpcIpv6CidrBlocksIpv6CidrBlock build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpcsResponseBodyVpcsVpcIpv6CidrBlocksIpv6CidrBlock self = new DescribeVpcsResponseBodyVpcsVpcIpv6CidrBlocksIpv6CidrBlock();
            return TeaModel.build(map, self);
        }

        public DescribeVpcsResponseBodyVpcsVpcIpv6CidrBlocksIpv6CidrBlock setIpv6CidrBlock(String ipv6CidrBlock) {
            this.ipv6CidrBlock = ipv6CidrBlock;
            return this;
        }
        public String getIpv6CidrBlock() {
            return this.ipv6CidrBlock;
        }

        public DescribeVpcsResponseBodyVpcsVpcIpv6CidrBlocksIpv6CidrBlock setIpv6Isp(String ipv6Isp) {
            this.ipv6Isp = ipv6Isp;
            return this;
        }
        public String getIpv6Isp() {
            return this.ipv6Isp;
        }

    }

    public static class DescribeVpcsResponseBodyVpcsVpcIpv6CidrBlocks extends TeaModel {
        @NameInMap("Ipv6CidrBlock")
        public java.util.List<DescribeVpcsResponseBodyVpcsVpcIpv6CidrBlocksIpv6CidrBlock> ipv6CidrBlock;

        public static DescribeVpcsResponseBodyVpcsVpcIpv6CidrBlocks build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpcsResponseBodyVpcsVpcIpv6CidrBlocks self = new DescribeVpcsResponseBodyVpcsVpcIpv6CidrBlocks();
            return TeaModel.build(map, self);
        }

        public DescribeVpcsResponseBodyVpcsVpcIpv6CidrBlocks setIpv6CidrBlock(java.util.List<DescribeVpcsResponseBodyVpcsVpcIpv6CidrBlocksIpv6CidrBlock> ipv6CidrBlock) {
            this.ipv6CidrBlock = ipv6CidrBlock;
            return this;
        }
        public java.util.List<DescribeVpcsResponseBodyVpcsVpcIpv6CidrBlocksIpv6CidrBlock> getIpv6CidrBlock() {
            return this.ipv6CidrBlock;
        }

    }

    public static class DescribeVpcsResponseBodyVpcsVpcNatGatewayIds extends TeaModel {
        @NameInMap("NatGatewayIds")
        public java.util.List<String> natGatewayIds;

        public static DescribeVpcsResponseBodyVpcsVpcNatGatewayIds build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpcsResponseBodyVpcsVpcNatGatewayIds self = new DescribeVpcsResponseBodyVpcsVpcNatGatewayIds();
            return TeaModel.build(map, self);
        }

        public DescribeVpcsResponseBodyVpcsVpcNatGatewayIds setNatGatewayIds(java.util.List<String> natGatewayIds) {
            this.natGatewayIds = natGatewayIds;
            return this;
        }
        public java.util.List<String> getNatGatewayIds() {
            return this.natGatewayIds;
        }

    }

    public static class DescribeVpcsResponseBodyVpcsVpcRouterTableIds extends TeaModel {
        @NameInMap("RouterTableIds")
        public java.util.List<String> routerTableIds;

        public static DescribeVpcsResponseBodyVpcsVpcRouterTableIds build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpcsResponseBodyVpcsVpcRouterTableIds self = new DescribeVpcsResponseBodyVpcsVpcRouterTableIds();
            return TeaModel.build(map, self);
        }

        public DescribeVpcsResponseBodyVpcsVpcRouterTableIds setRouterTableIds(java.util.List<String> routerTableIds) {
            this.routerTableIds = routerTableIds;
            return this;
        }
        public java.util.List<String> getRouterTableIds() {
            return this.routerTableIds;
        }

    }

    public static class DescribeVpcsResponseBodyVpcsVpcSecondaryCidrBlocks extends TeaModel {
        @NameInMap("SecondaryCidrBlock")
        public java.util.List<String> secondaryCidrBlock;

        public static DescribeVpcsResponseBodyVpcsVpcSecondaryCidrBlocks build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpcsResponseBodyVpcsVpcSecondaryCidrBlocks self = new DescribeVpcsResponseBodyVpcsVpcSecondaryCidrBlocks();
            return TeaModel.build(map, self);
        }

        public DescribeVpcsResponseBodyVpcsVpcSecondaryCidrBlocks setSecondaryCidrBlock(java.util.List<String> secondaryCidrBlock) {
            this.secondaryCidrBlock = secondaryCidrBlock;
            return this;
        }
        public java.util.List<String> getSecondaryCidrBlock() {
            return this.secondaryCidrBlock;
        }

    }

    public static class DescribeVpcsResponseBodyVpcsVpcTagsTag extends TeaModel {
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

        public static DescribeVpcsResponseBodyVpcsVpcTagsTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpcsResponseBodyVpcsVpcTagsTag self = new DescribeVpcsResponseBodyVpcsVpcTagsTag();
            return TeaModel.build(map, self);
        }

        public DescribeVpcsResponseBodyVpcsVpcTagsTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeVpcsResponseBodyVpcsVpcTagsTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeVpcsResponseBodyVpcsVpcTags extends TeaModel {
        @NameInMap("Tag")
        public java.util.List<DescribeVpcsResponseBodyVpcsVpcTagsTag> tag;

        public static DescribeVpcsResponseBodyVpcsVpcTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpcsResponseBodyVpcsVpcTags self = new DescribeVpcsResponseBodyVpcsVpcTags();
            return TeaModel.build(map, self);
        }

        public DescribeVpcsResponseBodyVpcsVpcTags setTag(java.util.List<DescribeVpcsResponseBodyVpcsVpcTagsTag> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<DescribeVpcsResponseBodyVpcsVpcTagsTag> getTag() {
            return this.tag;
        }

    }

    public static class DescribeVpcsResponseBodyVpcsVpcUserCidrs extends TeaModel {
        @NameInMap("UserCidr")
        public java.util.List<String> userCidr;

        public static DescribeVpcsResponseBodyVpcsVpcUserCidrs build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpcsResponseBodyVpcsVpcUserCidrs self = new DescribeVpcsResponseBodyVpcsVpcUserCidrs();
            return TeaModel.build(map, self);
        }

        public DescribeVpcsResponseBodyVpcsVpcUserCidrs setUserCidr(java.util.List<String> userCidr) {
            this.userCidr = userCidr;
            return this;
        }
        public java.util.List<String> getUserCidr() {
            return this.userCidr;
        }

    }

    public static class DescribeVpcsResponseBodyVpcsVpcVSwitchIds extends TeaModel {
        @NameInMap("VSwitchId")
        public java.util.List<String> vSwitchId;

        public static DescribeVpcsResponseBodyVpcsVpcVSwitchIds build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpcsResponseBodyVpcsVpcVSwitchIds self = new DescribeVpcsResponseBodyVpcsVpcVSwitchIds();
            return TeaModel.build(map, self);
        }

        public DescribeVpcsResponseBodyVpcsVpcVSwitchIds setVSwitchId(java.util.List<String> vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public java.util.List<String> getVSwitchId() {
            return this.vSwitchId;
        }

    }

    public static class DescribeVpcsResponseBodyVpcsVpc extends TeaModel {
        /**
         * <p>The status of the Cloud Enterprise Network (CEN) instance to which the VPC is attached. **Attached** is returned only if the VPC is attached to a CEN instance.</p>
         */
        @NameInMap("CenStatus")
        public String cenStatus;

        /**
         * <p>The IPv4 CIDR block of the VPC.</p>
         */
        @NameInMap("CidrBlock")
        public String cidrBlock;

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

        @NameInMap("EnabledIpv6")
        public Boolean enabledIpv6;

        /**
         * <p>The IPv6 CIDR block of the VPC.</p>
         */
        @NameInMap("Ipv6CidrBlock")
        public String ipv6CidrBlock;

        /**
         * <p>The IPv6 CIDR block of the VPC.</p>
         */
        @NameInMap("Ipv6CidrBlocks")
        public DescribeVpcsResponseBodyVpcsVpcIpv6CidrBlocks ipv6CidrBlocks;

        /**
         * <p>Indicates whether the VPC is the default VPC in the region. Valid values:</p>
         * <br>
         * <p>*   **true**</p>
         * <p>*   **false**</p>
         */
        @NameInMap("IsDefault")
        public Boolean isDefault;

        /**
         * <p>The ID of the Internet NAT gateway.</p>
         */
        @NameInMap("NatGatewayIds")
        public DescribeVpcsResponseBodyVpcsVpcNatGatewayIds natGatewayIds;

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
         * <p>The ID of the resource group to which the VPC belongs.</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The information about the route table.</p>
         */
        @NameInMap("RouterTableIds")
        public DescribeVpcsResponseBodyVpcsVpcRouterTableIds routerTableIds;

        /**
         * <p>The information about the secondary CIDR block.</p>
         */
        @NameInMap("SecondaryCidrBlocks")
        public DescribeVpcsResponseBodyVpcsVpcSecondaryCidrBlocks secondaryCidrBlocks;

        /**
         * <p>The status of the VPC. Valid values:</p>
         * <br>
         * <p>*   **Pending**</p>
         * <p>*   **Available**</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The tag information about the VPC.</p>
         */
        @NameInMap("Tags")
        public DescribeVpcsResponseBodyVpcsVpcTags tags;

        /**
         * <p>The list of user CIDR blocks.</p>
         */
        @NameInMap("UserCidrs")
        public DescribeVpcsResponseBodyVpcsVpcUserCidrs userCidrs;

        /**
         * <p>The ID of the vRouter.</p>
         */
        @NameInMap("VRouterId")
        public String VRouterId;

        /**
         * <p>The vSwitches in the VPC.</p>
         * <br>
         * <p>You can query up to 300 vSwitches in the VPC. The information about the latest vSwitches is returned. If you want to query the information about all vSwitches in a VPC, call the [DescribeVSwitches](https://help.aliyun.com/document_detail/35748.html) operation.</p>
         */
        @NameInMap("VSwitchIds")
        public DescribeVpcsResponseBodyVpcsVpcVSwitchIds vSwitchIds;

        /**
         * <p>The VPC ID.</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        /**
         * <p>The name of the VPC.</p>
         */
        @NameInMap("VpcName")
        public String vpcName;

        public static DescribeVpcsResponseBodyVpcsVpc build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpcsResponseBodyVpcsVpc self = new DescribeVpcsResponseBodyVpcsVpc();
            return TeaModel.build(map, self);
        }

        public DescribeVpcsResponseBodyVpcsVpc setCenStatus(String cenStatus) {
            this.cenStatus = cenStatus;
            return this;
        }
        public String getCenStatus() {
            return this.cenStatus;
        }

        public DescribeVpcsResponseBodyVpcsVpc setCidrBlock(String cidrBlock) {
            this.cidrBlock = cidrBlock;
            return this;
        }
        public String getCidrBlock() {
            return this.cidrBlock;
        }

        public DescribeVpcsResponseBodyVpcsVpc setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeVpcsResponseBodyVpcsVpc setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeVpcsResponseBodyVpcsVpc setDhcpOptionsSetId(String dhcpOptionsSetId) {
            this.dhcpOptionsSetId = dhcpOptionsSetId;
            return this;
        }
        public String getDhcpOptionsSetId() {
            return this.dhcpOptionsSetId;
        }

        public DescribeVpcsResponseBodyVpcsVpc setDhcpOptionsSetStatus(String dhcpOptionsSetStatus) {
            this.dhcpOptionsSetStatus = dhcpOptionsSetStatus;
            return this;
        }
        public String getDhcpOptionsSetStatus() {
            return this.dhcpOptionsSetStatus;
        }

        public DescribeVpcsResponseBodyVpcsVpc setEnabledIpv6(Boolean enabledIpv6) {
            this.enabledIpv6 = enabledIpv6;
            return this;
        }
        public Boolean getEnabledIpv6() {
            return this.enabledIpv6;
        }

        public DescribeVpcsResponseBodyVpcsVpc setIpv6CidrBlock(String ipv6CidrBlock) {
            this.ipv6CidrBlock = ipv6CidrBlock;
            return this;
        }
        public String getIpv6CidrBlock() {
            return this.ipv6CidrBlock;
        }

        public DescribeVpcsResponseBodyVpcsVpc setIpv6CidrBlocks(DescribeVpcsResponseBodyVpcsVpcIpv6CidrBlocks ipv6CidrBlocks) {
            this.ipv6CidrBlocks = ipv6CidrBlocks;
            return this;
        }
        public DescribeVpcsResponseBodyVpcsVpcIpv6CidrBlocks getIpv6CidrBlocks() {
            return this.ipv6CidrBlocks;
        }

        public DescribeVpcsResponseBodyVpcsVpc setIsDefault(Boolean isDefault) {
            this.isDefault = isDefault;
            return this;
        }
        public Boolean getIsDefault() {
            return this.isDefault;
        }

        public DescribeVpcsResponseBodyVpcsVpc setNatGatewayIds(DescribeVpcsResponseBodyVpcsVpcNatGatewayIds natGatewayIds) {
            this.natGatewayIds = natGatewayIds;
            return this;
        }
        public DescribeVpcsResponseBodyVpcsVpcNatGatewayIds getNatGatewayIds() {
            return this.natGatewayIds;
        }

        public DescribeVpcsResponseBodyVpcsVpc setOwnerId(Long ownerId) {
            this.ownerId = ownerId;
            return this;
        }
        public Long getOwnerId() {
            return this.ownerId;
        }

        public DescribeVpcsResponseBodyVpcsVpc setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeVpcsResponseBodyVpcsVpc setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeVpcsResponseBodyVpcsVpc setRouterTableIds(DescribeVpcsResponseBodyVpcsVpcRouterTableIds routerTableIds) {
            this.routerTableIds = routerTableIds;
            return this;
        }
        public DescribeVpcsResponseBodyVpcsVpcRouterTableIds getRouterTableIds() {
            return this.routerTableIds;
        }

        public DescribeVpcsResponseBodyVpcsVpc setSecondaryCidrBlocks(DescribeVpcsResponseBodyVpcsVpcSecondaryCidrBlocks secondaryCidrBlocks) {
            this.secondaryCidrBlocks = secondaryCidrBlocks;
            return this;
        }
        public DescribeVpcsResponseBodyVpcsVpcSecondaryCidrBlocks getSecondaryCidrBlocks() {
            return this.secondaryCidrBlocks;
        }

        public DescribeVpcsResponseBodyVpcsVpc setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeVpcsResponseBodyVpcsVpc setTags(DescribeVpcsResponseBodyVpcsVpcTags tags) {
            this.tags = tags;
            return this;
        }
        public DescribeVpcsResponseBodyVpcsVpcTags getTags() {
            return this.tags;
        }

        public DescribeVpcsResponseBodyVpcsVpc setUserCidrs(DescribeVpcsResponseBodyVpcsVpcUserCidrs userCidrs) {
            this.userCidrs = userCidrs;
            return this;
        }
        public DescribeVpcsResponseBodyVpcsVpcUserCidrs getUserCidrs() {
            return this.userCidrs;
        }

        public DescribeVpcsResponseBodyVpcsVpc setVRouterId(String VRouterId) {
            this.VRouterId = VRouterId;
            return this;
        }
        public String getVRouterId() {
            return this.VRouterId;
        }

        public DescribeVpcsResponseBodyVpcsVpc setVSwitchIds(DescribeVpcsResponseBodyVpcsVpcVSwitchIds vSwitchIds) {
            this.vSwitchIds = vSwitchIds;
            return this;
        }
        public DescribeVpcsResponseBodyVpcsVpcVSwitchIds getVSwitchIds() {
            return this.vSwitchIds;
        }

        public DescribeVpcsResponseBodyVpcsVpc setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public DescribeVpcsResponseBodyVpcsVpc setVpcName(String vpcName) {
            this.vpcName = vpcName;
            return this;
        }
        public String getVpcName() {
            return this.vpcName;
        }

    }

    public static class DescribeVpcsResponseBodyVpcs extends TeaModel {
        @NameInMap("Vpc")
        public java.util.List<DescribeVpcsResponseBodyVpcsVpc> vpc;

        public static DescribeVpcsResponseBodyVpcs build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpcsResponseBodyVpcs self = new DescribeVpcsResponseBodyVpcs();
            return TeaModel.build(map, self);
        }

        public DescribeVpcsResponseBodyVpcs setVpc(java.util.List<DescribeVpcsResponseBodyVpcsVpc> vpc) {
            this.vpc = vpc;
            return this;
        }
        public java.util.List<DescribeVpcsResponseBodyVpcsVpc> getVpc() {
            return this.vpc;
        }

    }

}
