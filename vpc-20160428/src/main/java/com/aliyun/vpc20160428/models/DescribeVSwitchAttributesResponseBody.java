// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeVSwitchAttributesResponseBody extends TeaModel {
    /**
     * <p>The active IP address count.</p>
     * 
     * <strong>example:</strong>
     * <p>12</p>
     */
    @NameInMap("AvailableIpAddressCount")
    public Long availableIpAddressCount;

    /**
     * <p>The private endpoint range of the vSwitch.</p>
     * 
     * <strong>example:</strong>
     * <p>192.168.0.1/24</p>
     */
    @NameInMap("CidrBlock")
    public String cidrBlock;

    /**
     * <p>The time when the vSwitch was created.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-08-22T10:40:25Z</p>
     */
    @NameInMap("CreationTime")
    public String creationTime;

    /**
     * <p>The description of the vSwitch.</p>
     * 
     * <strong>example:</strong>
     * <p>abc</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Specifies whether DNS64 is enabled for the vSwitch. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: DNS64 is enabled.</li>
     * <li><strong>false</strong>: DNS64 is disabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("EnableDns64")
    public Boolean enableDns64;

    /**
     * <p>Specifies whether the IPv6 CIDR block feature is enabled and configured for the vSwitch. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: Enabled.</li>
     * <li><strong>false</strong>: Disabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnabledIpv6")
    public Boolean enabledIpv6;

    /**
     * <p>The IPv6 CIDR block of the vSwitch.</p>
     * 
     * <strong>example:</strong>
     * <p>2408:XXXX:3c5:44e::/64</p>
     */
    @NameInMap("Ipv6CidrBlock")
    public String ipv6CidrBlock;

    /**
     * <p>Specifies whether the vSwitch is an IPv6 single-stack vSwitch. Valid values:</p>
     * <ul>
     * <li>true: The vSwitch is an IPv6 single-stack vSwitch.</li>
     * <li>false: The vSwitch is not an IPv6 single-stack vSwitch.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Ipv6Only")
    public Boolean ipv6Only;

    /**
     * <p>Specifies whether the vSwitch is the default vSwitch. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The vSwitch is the default vSwitch.</li>
     * <li><strong>false</strong>: The vSwitch is not the default vSwitch.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("IsDefault")
    public Boolean isDefault;

    /**
     * <p>The network ACL rules.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("NetworkAclId")
    public String networkAclId;

    /**
     * <p>The Alibaba Cloud account ID of the resource ownership.</p>
     * <blockquote>
     * <p>Notice: This value is of the Long type. Precision loss may occur in some programming languages. Use it with caution.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>28768383240243****</p>
     */
    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>7B48B4B9-1EAD-469F-B488-594DAB4B6A1A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmxazb4ph****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The route table information of the vSwitch.</p>
     */
    @NameInMap("RouteTable")
    public DescribeVSwitchAttributesResponseBodyRouteTable routeTable;

    /**
     * <p>The sharing type of the vSwitch.</p>
     * <ul>
     * <li>If the value is empty, the vSwitch is a regular vSwitch.</li>
     * <li><strong>Shared</strong>: The vSwitch is a shared vSwitch.</li>
     * <li><strong>Sharing</strong>: The vSwitch is being shared with other users.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Shared</p>
     */
    @NameInMap("ShareType")
    public String shareType;

    /**
     * <p>The status of the vSwitch. Valid values:</p>
     * <ul>
     * <li><p><strong>Pending</strong>: The vSwitch is being configured. </p>
     * </li>
     * <li><p><strong>Available</strong>: The vSwitch is available.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Pending</p>
     */
    @NameInMap("Status")
    public String status;

    @NameInMap("Tags")
    public DescribeVSwitchAttributesResponseBodyTags tags;

    /**
     * <p>The ID of the vSwitch.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-25b7pv15t****</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <p>The name of the vSwitch.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("VSwitchName")
    public String vSwitchName;

    /**
     * <p>The ID of the VPC to which the vSwitch belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-257gq642n****</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    /**
     * <p>The zone to which the vSwitch belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing-a</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

    public static DescribeVSwitchAttributesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVSwitchAttributesResponseBody self = new DescribeVSwitchAttributesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVSwitchAttributesResponseBody setAvailableIpAddressCount(Long availableIpAddressCount) {
        this.availableIpAddressCount = availableIpAddressCount;
        return this;
    }
    public Long getAvailableIpAddressCount() {
        return this.availableIpAddressCount;
    }

    public DescribeVSwitchAttributesResponseBody setCidrBlock(String cidrBlock) {
        this.cidrBlock = cidrBlock;
        return this;
    }
    public String getCidrBlock() {
        return this.cidrBlock;
    }

    public DescribeVSwitchAttributesResponseBody setCreationTime(String creationTime) {
        this.creationTime = creationTime;
        return this;
    }
    public String getCreationTime() {
        return this.creationTime;
    }

    public DescribeVSwitchAttributesResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DescribeVSwitchAttributesResponseBody setEnableDns64(Boolean enableDns64) {
        this.enableDns64 = enableDns64;
        return this;
    }
    public Boolean getEnableDns64() {
        return this.enableDns64;
    }

    public DescribeVSwitchAttributesResponseBody setEnabledIpv6(Boolean enabledIpv6) {
        this.enabledIpv6 = enabledIpv6;
        return this;
    }
    public Boolean getEnabledIpv6() {
        return this.enabledIpv6;
    }

    public DescribeVSwitchAttributesResponseBody setIpv6CidrBlock(String ipv6CidrBlock) {
        this.ipv6CidrBlock = ipv6CidrBlock;
        return this;
    }
    public String getIpv6CidrBlock() {
        return this.ipv6CidrBlock;
    }

    public DescribeVSwitchAttributesResponseBody setIpv6Only(Boolean ipv6Only) {
        this.ipv6Only = ipv6Only;
        return this;
    }
    public Boolean getIpv6Only() {
        return this.ipv6Only;
    }

    public DescribeVSwitchAttributesResponseBody setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
        return this;
    }
    public Boolean getIsDefault() {
        return this.isDefault;
    }

    public DescribeVSwitchAttributesResponseBody setNetworkAclId(String networkAclId) {
        this.networkAclId = networkAclId;
        return this;
    }
    public String getNetworkAclId() {
        return this.networkAclId;
    }

    public DescribeVSwitchAttributesResponseBody setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeVSwitchAttributesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeVSwitchAttributesResponseBody setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeVSwitchAttributesResponseBody setRouteTable(DescribeVSwitchAttributesResponseBodyRouteTable routeTable) {
        this.routeTable = routeTable;
        return this;
    }
    public DescribeVSwitchAttributesResponseBodyRouteTable getRouteTable() {
        return this.routeTable;
    }

    public DescribeVSwitchAttributesResponseBody setShareType(String shareType) {
        this.shareType = shareType;
        return this;
    }
    public String getShareType() {
        return this.shareType;
    }

    public DescribeVSwitchAttributesResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeVSwitchAttributesResponseBody setTags(DescribeVSwitchAttributesResponseBodyTags tags) {
        this.tags = tags;
        return this;
    }
    public DescribeVSwitchAttributesResponseBodyTags getTags() {
        return this.tags;
    }

    public DescribeVSwitchAttributesResponseBody setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public DescribeVSwitchAttributesResponseBody setVSwitchName(String vSwitchName) {
        this.vSwitchName = vSwitchName;
        return this;
    }
    public String getVSwitchName() {
        return this.vSwitchName;
    }

    public DescribeVSwitchAttributesResponseBody setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public DescribeVSwitchAttributesResponseBody setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public static class DescribeVSwitchAttributesResponseBodyRouteTable extends TeaModel {
        /**
         * <p>The ID of the route table associated with the vSwitch.</p>
         * 
         * <strong>example:</strong>
         * <p>vtb-bp145q7glnuzdv****</p>
         */
        @NameInMap("RouteTableId")
        public String routeTableId;

        /**
         * <p>The type of the route table. Valid values:</p>
         * <ul>
         * <li><p><strong>System</strong>: system route table.</p>
         * </li>
         * <li><p><strong>Custom</strong>: custom route table.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>System</p>
         */
        @NameInMap("RouteTableType")
        public String routeTableType;

        public static DescribeVSwitchAttributesResponseBodyRouteTable build(java.util.Map<String, ?> map) throws Exception {
            DescribeVSwitchAttributesResponseBodyRouteTable self = new DescribeVSwitchAttributesResponseBodyRouteTable();
            return TeaModel.build(map, self);
        }

        public DescribeVSwitchAttributesResponseBodyRouteTable setRouteTableId(String routeTableId) {
            this.routeTableId = routeTableId;
            return this;
        }
        public String getRouteTableId() {
            return this.routeTableId;
        }

        public DescribeVSwitchAttributesResponseBodyRouteTable setRouteTableType(String routeTableType) {
            this.routeTableType = routeTableType;
            return this;
        }
        public String getRouteTableType() {
            return this.routeTableType;
        }

    }

    public static class DescribeVSwitchAttributesResponseBodyTagsTag extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static DescribeVSwitchAttributesResponseBodyTagsTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeVSwitchAttributesResponseBodyTagsTag self = new DescribeVSwitchAttributesResponseBodyTagsTag();
            return TeaModel.build(map, self);
        }

        public DescribeVSwitchAttributesResponseBodyTagsTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeVSwitchAttributesResponseBodyTagsTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeVSwitchAttributesResponseBodyTags extends TeaModel {
        @NameInMap("Tag")
        public java.util.List<DescribeVSwitchAttributesResponseBodyTagsTag> tag;

        public static DescribeVSwitchAttributesResponseBodyTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeVSwitchAttributesResponseBodyTags self = new DescribeVSwitchAttributesResponseBodyTags();
            return TeaModel.build(map, self);
        }

        public DescribeVSwitchAttributesResponseBodyTags setTag(java.util.List<DescribeVSwitchAttributesResponseBodyTagsTag> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<DescribeVSwitchAttributesResponseBodyTagsTag> getTag() {
            return this.tag;
        }

    }

}
