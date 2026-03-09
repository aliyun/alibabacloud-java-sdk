// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeRCNetworkInterfacesResponseBody extends TeaModel {
    @NameInMap("NetworkInterfaceSets")
    public java.util.List<DescribeRCNetworkInterfacesResponseBodyNetworkInterfaceSets> networkInterfaceSets;

    /**
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeRCNetworkInterfacesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRCNetworkInterfacesResponseBody self = new DescribeRCNetworkInterfacesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRCNetworkInterfacesResponseBody setNetworkInterfaceSets(java.util.List<DescribeRCNetworkInterfacesResponseBodyNetworkInterfaceSets> networkInterfaceSets) {
        this.networkInterfaceSets = networkInterfaceSets;
        return this;
    }
    public java.util.List<DescribeRCNetworkInterfacesResponseBodyNetworkInterfaceSets> getNetworkInterfaceSets() {
        return this.networkInterfaceSets;
    }

    public DescribeRCNetworkInterfacesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeRCNetworkInterfacesResponseBodyNetworkInterfaceSetsAssociatedPublicIp extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p><code>116.62.**.**</code></p>
         */
        @NameInMap("PublicIpAddress")
        public String publicIpAddress;

        public static DescribeRCNetworkInterfacesResponseBodyNetworkInterfaceSetsAssociatedPublicIp build(java.util.Map<String, ?> map) throws Exception {
            DescribeRCNetworkInterfacesResponseBodyNetworkInterfaceSetsAssociatedPublicIp self = new DescribeRCNetworkInterfacesResponseBodyNetworkInterfaceSetsAssociatedPublicIp();
            return TeaModel.build(map, self);
        }

        public DescribeRCNetworkInterfacesResponseBodyNetworkInterfaceSetsAssociatedPublicIp setPublicIpAddress(String publicIpAddress) {
            this.publicIpAddress = publicIpAddress;
            return this;
        }
        public String getPublicIpAddress() {
            return this.publicIpAddress;
        }

    }

    public static class DescribeRCNetworkInterfacesResponseBodyNetworkInterfaceSetsIpv6Sets extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2408:4321:180:1701:94c7:bc38:3bfa:****</p>
         */
        @NameInMap("Ipv6Address")
        public String ipv6Address;

        public static DescribeRCNetworkInterfacesResponseBodyNetworkInterfaceSetsIpv6Sets build(java.util.Map<String, ?> map) throws Exception {
            DescribeRCNetworkInterfacesResponseBodyNetworkInterfaceSetsIpv6Sets self = new DescribeRCNetworkInterfacesResponseBodyNetworkInterfaceSetsIpv6Sets();
            return TeaModel.build(map, self);
        }

        public DescribeRCNetworkInterfacesResponseBodyNetworkInterfaceSetsIpv6Sets setIpv6Address(String ipv6Address) {
            this.ipv6Address = ipv6Address;
            return this;
        }
        public String getIpv6Address() {
            return this.ipv6Address;
        }

    }

    public static class DescribeRCNetworkInterfacesResponseBodyNetworkInterfaceSetsPrivateIpSets extends TeaModel {
        @NameInMap("Primary")
        public Boolean primary;

        /**
         * <strong>example:</strong>
         * <p><code>172.17.**.**</code></p>
         */
        @NameInMap("PrivateIpAddress")
        public String privateIpAddress;

        public static DescribeRCNetworkInterfacesResponseBodyNetworkInterfaceSetsPrivateIpSets build(java.util.Map<String, ?> map) throws Exception {
            DescribeRCNetworkInterfacesResponseBodyNetworkInterfaceSetsPrivateIpSets self = new DescribeRCNetworkInterfacesResponseBodyNetworkInterfaceSetsPrivateIpSets();
            return TeaModel.build(map, self);
        }

        public DescribeRCNetworkInterfacesResponseBodyNetworkInterfaceSetsPrivateIpSets setPrimary(Boolean primary) {
            this.primary = primary;
            return this;
        }
        public Boolean getPrimary() {
            return this.primary;
        }

        public DescribeRCNetworkInterfacesResponseBodyNetworkInterfaceSetsPrivateIpSets setPrivateIpAddress(String privateIpAddress) {
            this.privateIpAddress = privateIpAddress;
            return this;
        }
        public String getPrivateIpAddress() {
            return this.privateIpAddress;
        }

    }

    public static class DescribeRCNetworkInterfacesResponseBodyNetworkInterfaceSetsTags extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>TestValue</p>
         */
        @NameInMap("TagKey")
        public String tagKey;

        /**
         * <strong>example:</strong>
         * <p>TestKey</p>
         */
        @NameInMap("TagValue")
        public String tagValue;

        public static DescribeRCNetworkInterfacesResponseBodyNetworkInterfaceSetsTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeRCNetworkInterfacesResponseBodyNetworkInterfaceSetsTags self = new DescribeRCNetworkInterfacesResponseBodyNetworkInterfaceSetsTags();
            return TeaModel.build(map, self);
        }

        public DescribeRCNetworkInterfacesResponseBodyNetworkInterfaceSetsTags setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public DescribeRCNetworkInterfacesResponseBodyNetworkInterfaceSetsTags setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class DescribeRCNetworkInterfacesResponseBodyNetworkInterfaceSets extends TeaModel {
        @NameInMap("AssociatedPublicIp")
        public DescribeRCNetworkInterfacesResponseBodyNetworkInterfaceSetsAssociatedPublicIp associatedPublicIp;

        /**
         * <strong>example:</strong>
         * <p>2022-12-25T12:31:31Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <strong>example:</strong>
         * <p>DescriptionTest</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>rc-m5sc1271fv344a1r****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("Ipv6Sets")
        public java.util.List<DescribeRCNetworkInterfacesResponseBodyNetworkInterfaceSetsIpv6Sets> ipv6Sets;

        /**
         * <strong>example:</strong>
         * <p>00:16:3e:12:<strong>:</strong></p>
         */
        @NameInMap("MacAddress")
        public String macAddress;

        /**
         * <strong>example:</strong>
         * <p>eni-bp125p95hhdhn3ot****</p>
         */
        @NameInMap("NetworkInterfaceId")
        public String networkInterfaceId;

        @NameInMap("PrivateIpSets")
        public java.util.List<DescribeRCNetworkInterfacesResponseBodyNetworkInterfaceSetsPrivateIpSets> privateIpSets;

        /**
         * <strong>example:</strong>
         * <p>rg-2ze88m67qx5z****</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        @NameInMap("SecurityGroupIds")
        public java.util.List<String> securityGroupIds;

        /**
         * <strong>example:</strong>
         * <p>Available</p>
         */
        @NameInMap("Status")
        public String status;

        @NameInMap("Tags")
        public java.util.List<DescribeRCNetworkInterfacesResponseBodyNetworkInterfaceSetsTags> tags;

        /**
         * <strong>example:</strong>
         * <p>Secondary</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <strong>example:</strong>
         * <p>vsw-bp16usj2p27htro3****</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <strong>example:</strong>
         * <p>vpc-bp1j7w3gc1cexjqd****</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou-e</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        public static DescribeRCNetworkInterfacesResponseBodyNetworkInterfaceSets build(java.util.Map<String, ?> map) throws Exception {
            DescribeRCNetworkInterfacesResponseBodyNetworkInterfaceSets self = new DescribeRCNetworkInterfacesResponseBodyNetworkInterfaceSets();
            return TeaModel.build(map, self);
        }

        public DescribeRCNetworkInterfacesResponseBodyNetworkInterfaceSets setAssociatedPublicIp(DescribeRCNetworkInterfacesResponseBodyNetworkInterfaceSetsAssociatedPublicIp associatedPublicIp) {
            this.associatedPublicIp = associatedPublicIp;
            return this;
        }
        public DescribeRCNetworkInterfacesResponseBodyNetworkInterfaceSetsAssociatedPublicIp getAssociatedPublicIp() {
            return this.associatedPublicIp;
        }

        public DescribeRCNetworkInterfacesResponseBodyNetworkInterfaceSets setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeRCNetworkInterfacesResponseBodyNetworkInterfaceSets setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeRCNetworkInterfacesResponseBodyNetworkInterfaceSets setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeRCNetworkInterfacesResponseBodyNetworkInterfaceSets setIpv6Sets(java.util.List<DescribeRCNetworkInterfacesResponseBodyNetworkInterfaceSetsIpv6Sets> ipv6Sets) {
            this.ipv6Sets = ipv6Sets;
            return this;
        }
        public java.util.List<DescribeRCNetworkInterfacesResponseBodyNetworkInterfaceSetsIpv6Sets> getIpv6Sets() {
            return this.ipv6Sets;
        }

        public DescribeRCNetworkInterfacesResponseBodyNetworkInterfaceSets setMacAddress(String macAddress) {
            this.macAddress = macAddress;
            return this;
        }
        public String getMacAddress() {
            return this.macAddress;
        }

        public DescribeRCNetworkInterfacesResponseBodyNetworkInterfaceSets setNetworkInterfaceId(String networkInterfaceId) {
            this.networkInterfaceId = networkInterfaceId;
            return this;
        }
        public String getNetworkInterfaceId() {
            return this.networkInterfaceId;
        }

        public DescribeRCNetworkInterfacesResponseBodyNetworkInterfaceSets setPrivateIpSets(java.util.List<DescribeRCNetworkInterfacesResponseBodyNetworkInterfaceSetsPrivateIpSets> privateIpSets) {
            this.privateIpSets = privateIpSets;
            return this;
        }
        public java.util.List<DescribeRCNetworkInterfacesResponseBodyNetworkInterfaceSetsPrivateIpSets> getPrivateIpSets() {
            return this.privateIpSets;
        }

        public DescribeRCNetworkInterfacesResponseBodyNetworkInterfaceSets setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeRCNetworkInterfacesResponseBodyNetworkInterfaceSets setSecurityGroupIds(java.util.List<String> securityGroupIds) {
            this.securityGroupIds = securityGroupIds;
            return this;
        }
        public java.util.List<String> getSecurityGroupIds() {
            return this.securityGroupIds;
        }

        public DescribeRCNetworkInterfacesResponseBodyNetworkInterfaceSets setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeRCNetworkInterfacesResponseBodyNetworkInterfaceSets setTags(java.util.List<DescribeRCNetworkInterfacesResponseBodyNetworkInterfaceSetsTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<DescribeRCNetworkInterfacesResponseBodyNetworkInterfaceSetsTags> getTags() {
            return this.tags;
        }

        public DescribeRCNetworkInterfacesResponseBodyNetworkInterfaceSets setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeRCNetworkInterfacesResponseBodyNetworkInterfaceSets setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public DescribeRCNetworkInterfacesResponseBodyNetworkInterfaceSets setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public DescribeRCNetworkInterfacesResponseBodyNetworkInterfaceSets setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

}
