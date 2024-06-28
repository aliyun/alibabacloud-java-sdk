// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeNetworkAclsResponseBody extends TeaModel {
    /**
     * <p>The details of the network ACLs.</p>
     */
    @NameInMap("NetworkAcls")
    public DescribeNetworkAclsResponseBodyNetworkAcls networkAcls;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public String pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>F7DDDC17-FA06-4AC2-8F35-59D2470FCFC1</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("TotalCount")
    public String totalCount;

    public static DescribeNetworkAclsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeNetworkAclsResponseBody self = new DescribeNetworkAclsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeNetworkAclsResponseBody setNetworkAcls(DescribeNetworkAclsResponseBodyNetworkAcls networkAcls) {
        this.networkAcls = networkAcls;
        return this;
    }
    public DescribeNetworkAclsResponseBodyNetworkAcls getNetworkAcls() {
        return this.networkAcls;
    }

    public DescribeNetworkAclsResponseBody setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public String getPageNumber() {
        return this.pageNumber;
    }

    public DescribeNetworkAclsResponseBody setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public DescribeNetworkAclsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeNetworkAclsResponseBody setTotalCount(String totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public String getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeNetworkAclsResponseBodyNetworkAclsNetworkAclEgressAclEntriesEgressAclEntry extends TeaModel {
        /**
         * <p>The description of the outbound rule.</p>
         * 
         * <strong>example:</strong>
         * <p>This is EgressAclEntries.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The destination CIDR block.</p>
         * 
         * <strong>example:</strong>
         * <p>10.0.0.0/24</p>
         */
        @NameInMap("DestinationCidrIp")
        public String destinationCidrIp;

        /**
         * <p>The type of the inbound rule.</p>
         * <ul>
         * <li><p><strong>custom</strong></p>
         * </li>
         * <li><p><strong>system</strong></p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>custom</p>
         */
        @NameInMap("EntryType")
        public String entryType;

        /**
         * <p>The IP version. </p>
         * <ul>
         * <li><strong>IPv4</strong></li>
         * <li><strong>IPv6</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>IPV4</p>
         */
        @NameInMap("IpVersion")
        public String ipVersion;

        /**
         * <p>The ID of the outbound rule.</p>
         * 
         * <strong>example:</strong>
         * <p>nae-a2d447uw4tillfvgb****</p>
         */
        @NameInMap("NetworkAclEntryId")
        public String networkAclEntryId;

        /**
         * <p>The name of the outbound rule.</p>
         * 
         * <strong>example:</strong>
         * <p>acl-2</p>
         */
        @NameInMap("NetworkAclEntryName")
        public String networkAclEntryName;

        /**
         * <p>The action to be performed on network traffic that matches the rule. Valid values:</p>
         * <ul>
         * <li><strong>accept</strong></li>
         * <li><strong>drop</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>accept</p>
         */
        @NameInMap("Policy")
        public String policy;

        /**
         * <p>The destination port range of the outbound traffic.</p>
         * <ul>
         * <li>If the <strong>protocol</strong> of the outbound rule is set to <strong>all</strong>, <strong>icmp</strong>, or <strong>gre</strong>, the port range is -1/-1, which specified all ports.</li>
         * <li>If the <strong>protocol</strong> of the outbound rule is set to <strong>tcp</strong> or <strong>udp</strong>, set the port range in the following format: <strong>1/200</strong> or <strong>80/80</strong>, which specifies port 1 to port 200 or port 80. Valid values for a port: <strong>1</strong> to <strong>65535</strong>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>-1/-1</p>
         */
        @NameInMap("Port")
        public String port;

        /**
         * <p>The protocol. Valid values:</p>
         * <ul>
         * <li><strong>icmp</strong></li>
         * <li><strong>gre</strong></li>
         * <li><strong>tcp</strong></li>
         * <li><strong>udp</strong></li>
         * <li><strong>all</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>all</p>
         */
        @NameInMap("Protocol")
        public String protocol;

        public static DescribeNetworkAclsResponseBodyNetworkAclsNetworkAclEgressAclEntriesEgressAclEntry build(java.util.Map<String, ?> map) throws Exception {
            DescribeNetworkAclsResponseBodyNetworkAclsNetworkAclEgressAclEntriesEgressAclEntry self = new DescribeNetworkAclsResponseBodyNetworkAclsNetworkAclEgressAclEntriesEgressAclEntry();
            return TeaModel.build(map, self);
        }

        public DescribeNetworkAclsResponseBodyNetworkAclsNetworkAclEgressAclEntriesEgressAclEntry setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeNetworkAclsResponseBodyNetworkAclsNetworkAclEgressAclEntriesEgressAclEntry setDestinationCidrIp(String destinationCidrIp) {
            this.destinationCidrIp = destinationCidrIp;
            return this;
        }
        public String getDestinationCidrIp() {
            return this.destinationCidrIp;
        }

        public DescribeNetworkAclsResponseBodyNetworkAclsNetworkAclEgressAclEntriesEgressAclEntry setEntryType(String entryType) {
            this.entryType = entryType;
            return this;
        }
        public String getEntryType() {
            return this.entryType;
        }

        public DescribeNetworkAclsResponseBodyNetworkAclsNetworkAclEgressAclEntriesEgressAclEntry setIpVersion(String ipVersion) {
            this.ipVersion = ipVersion;
            return this;
        }
        public String getIpVersion() {
            return this.ipVersion;
        }

        public DescribeNetworkAclsResponseBodyNetworkAclsNetworkAclEgressAclEntriesEgressAclEntry setNetworkAclEntryId(String networkAclEntryId) {
            this.networkAclEntryId = networkAclEntryId;
            return this;
        }
        public String getNetworkAclEntryId() {
            return this.networkAclEntryId;
        }

        public DescribeNetworkAclsResponseBodyNetworkAclsNetworkAclEgressAclEntriesEgressAclEntry setNetworkAclEntryName(String networkAclEntryName) {
            this.networkAclEntryName = networkAclEntryName;
            return this;
        }
        public String getNetworkAclEntryName() {
            return this.networkAclEntryName;
        }

        public DescribeNetworkAclsResponseBodyNetworkAclsNetworkAclEgressAclEntriesEgressAclEntry setPolicy(String policy) {
            this.policy = policy;
            return this;
        }
        public String getPolicy() {
            return this.policy;
        }

        public DescribeNetworkAclsResponseBodyNetworkAclsNetworkAclEgressAclEntriesEgressAclEntry setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public DescribeNetworkAclsResponseBodyNetworkAclsNetworkAclEgressAclEntriesEgressAclEntry setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

    }

    public static class DescribeNetworkAclsResponseBodyNetworkAclsNetworkAclEgressAclEntries extends TeaModel {
        @NameInMap("EgressAclEntry")
        public java.util.List<DescribeNetworkAclsResponseBodyNetworkAclsNetworkAclEgressAclEntriesEgressAclEntry> egressAclEntry;

        public static DescribeNetworkAclsResponseBodyNetworkAclsNetworkAclEgressAclEntries build(java.util.Map<String, ?> map) throws Exception {
            DescribeNetworkAclsResponseBodyNetworkAclsNetworkAclEgressAclEntries self = new DescribeNetworkAclsResponseBodyNetworkAclsNetworkAclEgressAclEntries();
            return TeaModel.build(map, self);
        }

        public DescribeNetworkAclsResponseBodyNetworkAclsNetworkAclEgressAclEntries setEgressAclEntry(java.util.List<DescribeNetworkAclsResponseBodyNetworkAclsNetworkAclEgressAclEntriesEgressAclEntry> egressAclEntry) {
            this.egressAclEntry = egressAclEntry;
            return this;
        }
        public java.util.List<DescribeNetworkAclsResponseBodyNetworkAclsNetworkAclEgressAclEntriesEgressAclEntry> getEgressAclEntry() {
            return this.egressAclEntry;
        }

    }

    public static class DescribeNetworkAclsResponseBodyNetworkAclsNetworkAclIngressAclEntriesIngressAclEntry extends TeaModel {
        /**
         * <p>The description of the inbound rule.</p>
         * 
         * <strong>example:</strong>
         * <p>This is IngressAclEntries.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The type of the inbound rule.</p>
         * <ul>
         * <li><p><strong>custom</strong></p>
         * </li>
         * <li><p><strong>system</strong></p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>custom</p>
         */
        @NameInMap("EntryType")
        public String entryType;

        /**
         * <p>The IP version. </p>
         * <ul>
         * <li><strong>IPv4</strong></li>
         * <li><strong>IPv6</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>IPv4</p>
         */
        @NameInMap("IpVersion")
        public String ipVersion;

        /**
         * <p>The ID of the inbound rule.</p>
         * 
         * <strong>example:</strong>
         * <p>nae-a2dk86arlydmezasw****</p>
         */
        @NameInMap("NetworkAclEntryId")
        public String networkAclEntryId;

        /**
         * <p>The name of the inbound rule.</p>
         * 
         * <strong>example:</strong>
         * <p>acl-3</p>
         */
        @NameInMap("NetworkAclEntryName")
        public String networkAclEntryName;

        /**
         * <p>The action to be performed on network traffic that matches the rule. Valid values:</p>
         * <ul>
         * <li><strong>accept</strong></li>
         * <li><strong>drop</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>accept</p>
         */
        @NameInMap("Policy")
        public String policy;

        /**
         * <p>The destination port range of the inbound traffic.</p>
         * <ul>
         * <li>If the <strong>protocol</strong> of the inbound rule is set to <strong>all</strong>, <strong>icmp</strong>, or <strong>gre</strong>, the port range is -1/-1, which specifies all ports.</li>
         * <li>If the <strong>protocol</strong> of the inbound rule is set to <strong>tcp</strong> or <strong>udp</strong>, set the port range in the following format: <strong>1/200</strong> or <strong>80/80</strong>, which specifies port 1 to port 200 or port 80. Valid ports: <strong>1</strong> to <strong>65535</strong>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>-1/-1</p>
         */
        @NameInMap("Port")
        public String port;

        /**
         * <p>The protocol. Valid values:</p>
         * <ul>
         * <li><strong>icmp</strong></li>
         * <li><strong>gre</strong></li>
         * <li><strong>tcp</strong></li>
         * <li><strong>udp</strong></li>
         * <li><strong>all</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>all</p>
         */
        @NameInMap("Protocol")
        public String protocol;

        /**
         * <p>The source CIDR block.</p>
         * 
         * <strong>example:</strong>
         * <p>10.0.0.0/24</p>
         */
        @NameInMap("SourceCidrIp")
        public String sourceCidrIp;

        public static DescribeNetworkAclsResponseBodyNetworkAclsNetworkAclIngressAclEntriesIngressAclEntry build(java.util.Map<String, ?> map) throws Exception {
            DescribeNetworkAclsResponseBodyNetworkAclsNetworkAclIngressAclEntriesIngressAclEntry self = new DescribeNetworkAclsResponseBodyNetworkAclsNetworkAclIngressAclEntriesIngressAclEntry();
            return TeaModel.build(map, self);
        }

        public DescribeNetworkAclsResponseBodyNetworkAclsNetworkAclIngressAclEntriesIngressAclEntry setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeNetworkAclsResponseBodyNetworkAclsNetworkAclIngressAclEntriesIngressAclEntry setEntryType(String entryType) {
            this.entryType = entryType;
            return this;
        }
        public String getEntryType() {
            return this.entryType;
        }

        public DescribeNetworkAclsResponseBodyNetworkAclsNetworkAclIngressAclEntriesIngressAclEntry setIpVersion(String ipVersion) {
            this.ipVersion = ipVersion;
            return this;
        }
        public String getIpVersion() {
            return this.ipVersion;
        }

        public DescribeNetworkAclsResponseBodyNetworkAclsNetworkAclIngressAclEntriesIngressAclEntry setNetworkAclEntryId(String networkAclEntryId) {
            this.networkAclEntryId = networkAclEntryId;
            return this;
        }
        public String getNetworkAclEntryId() {
            return this.networkAclEntryId;
        }

        public DescribeNetworkAclsResponseBodyNetworkAclsNetworkAclIngressAclEntriesIngressAclEntry setNetworkAclEntryName(String networkAclEntryName) {
            this.networkAclEntryName = networkAclEntryName;
            return this;
        }
        public String getNetworkAclEntryName() {
            return this.networkAclEntryName;
        }

        public DescribeNetworkAclsResponseBodyNetworkAclsNetworkAclIngressAclEntriesIngressAclEntry setPolicy(String policy) {
            this.policy = policy;
            return this;
        }
        public String getPolicy() {
            return this.policy;
        }

        public DescribeNetworkAclsResponseBodyNetworkAclsNetworkAclIngressAclEntriesIngressAclEntry setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public DescribeNetworkAclsResponseBodyNetworkAclsNetworkAclIngressAclEntriesIngressAclEntry setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public DescribeNetworkAclsResponseBodyNetworkAclsNetworkAclIngressAclEntriesIngressAclEntry setSourceCidrIp(String sourceCidrIp) {
            this.sourceCidrIp = sourceCidrIp;
            return this;
        }
        public String getSourceCidrIp() {
            return this.sourceCidrIp;
        }

    }

    public static class DescribeNetworkAclsResponseBodyNetworkAclsNetworkAclIngressAclEntries extends TeaModel {
        @NameInMap("IngressAclEntry")
        public java.util.List<DescribeNetworkAclsResponseBodyNetworkAclsNetworkAclIngressAclEntriesIngressAclEntry> ingressAclEntry;

        public static DescribeNetworkAclsResponseBodyNetworkAclsNetworkAclIngressAclEntries build(java.util.Map<String, ?> map) throws Exception {
            DescribeNetworkAclsResponseBodyNetworkAclsNetworkAclIngressAclEntries self = new DescribeNetworkAclsResponseBodyNetworkAclsNetworkAclIngressAclEntries();
            return TeaModel.build(map, self);
        }

        public DescribeNetworkAclsResponseBodyNetworkAclsNetworkAclIngressAclEntries setIngressAclEntry(java.util.List<DescribeNetworkAclsResponseBodyNetworkAclsNetworkAclIngressAclEntriesIngressAclEntry> ingressAclEntry) {
            this.ingressAclEntry = ingressAclEntry;
            return this;
        }
        public java.util.List<DescribeNetworkAclsResponseBodyNetworkAclsNetworkAclIngressAclEntriesIngressAclEntry> getIngressAclEntry() {
            return this.ingressAclEntry;
        }

    }

    public static class DescribeNetworkAclsResponseBodyNetworkAclsNetworkAclResourcesResource extends TeaModel {
        /**
         * <p>The ID of the associated resource.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-bp1de348lntdwcdf****</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        /**
         * <p>The type of resource with which you want to associate the network ACL.</p>
         * 
         * <strong>example:</strong>
         * <p>VSwitch</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        /**
         * <p>The association status of the resource. Valid values:</p>
         * <ul>
         * <li><strong>BINDED</strong></li>
         * <li><strong>BINDING</strong></li>
         * <li><strong>UNBINDING</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>BINDED</p>
         */
        @NameInMap("Status")
        public String status;

        public static DescribeNetworkAclsResponseBodyNetworkAclsNetworkAclResourcesResource build(java.util.Map<String, ?> map) throws Exception {
            DescribeNetworkAclsResponseBodyNetworkAclsNetworkAclResourcesResource self = new DescribeNetworkAclsResponseBodyNetworkAclsNetworkAclResourcesResource();
            return TeaModel.build(map, self);
        }

        public DescribeNetworkAclsResponseBodyNetworkAclsNetworkAclResourcesResource setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public DescribeNetworkAclsResponseBodyNetworkAclsNetworkAclResourcesResource setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public DescribeNetworkAclsResponseBodyNetworkAclsNetworkAclResourcesResource setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeNetworkAclsResponseBodyNetworkAclsNetworkAclResources extends TeaModel {
        @NameInMap("Resource")
        public java.util.List<DescribeNetworkAclsResponseBodyNetworkAclsNetworkAclResourcesResource> resource;

        public static DescribeNetworkAclsResponseBodyNetworkAclsNetworkAclResources build(java.util.Map<String, ?> map) throws Exception {
            DescribeNetworkAclsResponseBodyNetworkAclsNetworkAclResources self = new DescribeNetworkAclsResponseBodyNetworkAclsNetworkAclResources();
            return TeaModel.build(map, self);
        }

        public DescribeNetworkAclsResponseBodyNetworkAclsNetworkAclResources setResource(java.util.List<DescribeNetworkAclsResponseBodyNetworkAclsNetworkAclResourcesResource> resource) {
            this.resource = resource;
            return this;
        }
        public java.util.List<DescribeNetworkAclsResponseBodyNetworkAclsNetworkAclResourcesResource> getResource() {
            return this.resource;
        }

    }

    public static class DescribeNetworkAclsResponseBodyNetworkAclsNetworkAclTagsTag extends TeaModel {
        /**
         * <p>The key of tag N added to the resource.</p>
         * 
         * <strong>example:</strong>
         * <p>FinanceDept</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of tag N added to the resource.</p>
         * 
         * <strong>example:</strong>
         * <p>FinanceJoshua</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeNetworkAclsResponseBodyNetworkAclsNetworkAclTagsTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeNetworkAclsResponseBodyNetworkAclsNetworkAclTagsTag self = new DescribeNetworkAclsResponseBodyNetworkAclsNetworkAclTagsTag();
            return TeaModel.build(map, self);
        }

        public DescribeNetworkAclsResponseBodyNetworkAclsNetworkAclTagsTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeNetworkAclsResponseBodyNetworkAclsNetworkAclTagsTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeNetworkAclsResponseBodyNetworkAclsNetworkAclTags extends TeaModel {
        @NameInMap("Tag")
        public java.util.List<DescribeNetworkAclsResponseBodyNetworkAclsNetworkAclTagsTag> tag;

        public static DescribeNetworkAclsResponseBodyNetworkAclsNetworkAclTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeNetworkAclsResponseBodyNetworkAclsNetworkAclTags self = new DescribeNetworkAclsResponseBodyNetworkAclsNetworkAclTags();
            return TeaModel.build(map, self);
        }

        public DescribeNetworkAclsResponseBodyNetworkAclsNetworkAclTags setTag(java.util.List<DescribeNetworkAclsResponseBodyNetworkAclsNetworkAclTagsTag> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<DescribeNetworkAclsResponseBodyNetworkAclsNetworkAclTagsTag> getTag() {
            return this.tag;
        }

    }

    public static class DescribeNetworkAclsResponseBodyNetworkAclsNetworkAcl extends TeaModel {
        /**
         * <p>The time when the network ACL was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-12-25 11:44:17</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The description of the network ACL.</p>
         * 
         * <strong>example:</strong>
         * <p>This is my NetworkAcl.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The outbound rules.</p>
         */
        @NameInMap("EgressAclEntries")
        public DescribeNetworkAclsResponseBodyNetworkAclsNetworkAclEgressAclEntries egressAclEntries;

        /**
         * <p>The configurations of the inbound rules.</p>
         */
        @NameInMap("IngressAclEntries")
        public DescribeNetworkAclsResponseBodyNetworkAclsNetworkAclIngressAclEntries ingressAclEntries;

        /**
         * <p>The ID of the network ACL.</p>
         * 
         * <strong>example:</strong>
         * <p>nacl-a2do9e413e0spxscd****</p>
         */
        @NameInMap("NetworkAclId")
        public String networkAclId;

        /**
         * <p>The name of the network ACL.</p>
         * 
         * <strong>example:</strong>
         * <p>acl-1</p>
         */
        @NameInMap("NetworkAclName")
        public String networkAclName;

        /**
         * <p>The ID of the Alibaba Cloud account to which the network ACL belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>253460731706911258</p>
         */
        @NameInMap("OwnerId")
        public Long ownerId;

        /**
         * <p>The region ID of the network ACL.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The resources that are associated with the network ACL.</p>
         */
        @NameInMap("Resources")
        public DescribeNetworkAclsResponseBodyNetworkAclsNetworkAclResources resources;

        /**
         * <p>The status of the network ACL. Valid values:</p>
         * <ul>
         * <li><strong>Available</strong></li>
         * <li><strong>Modifying</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Available</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The information about the tags.</p>
         */
        @NameInMap("Tags")
        public DescribeNetworkAclsResponseBodyNetworkAclsNetworkAclTags tags;

        /**
         * <p>The ID of the associated VPC.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-m5ebpc2xh64mqm27e****</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        public static DescribeNetworkAclsResponseBodyNetworkAclsNetworkAcl build(java.util.Map<String, ?> map) throws Exception {
            DescribeNetworkAclsResponseBodyNetworkAclsNetworkAcl self = new DescribeNetworkAclsResponseBodyNetworkAclsNetworkAcl();
            return TeaModel.build(map, self);
        }

        public DescribeNetworkAclsResponseBodyNetworkAclsNetworkAcl setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeNetworkAclsResponseBodyNetworkAclsNetworkAcl setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeNetworkAclsResponseBodyNetworkAclsNetworkAcl setEgressAclEntries(DescribeNetworkAclsResponseBodyNetworkAclsNetworkAclEgressAclEntries egressAclEntries) {
            this.egressAclEntries = egressAclEntries;
            return this;
        }
        public DescribeNetworkAclsResponseBodyNetworkAclsNetworkAclEgressAclEntries getEgressAclEntries() {
            return this.egressAclEntries;
        }

        public DescribeNetworkAclsResponseBodyNetworkAclsNetworkAcl setIngressAclEntries(DescribeNetworkAclsResponseBodyNetworkAclsNetworkAclIngressAclEntries ingressAclEntries) {
            this.ingressAclEntries = ingressAclEntries;
            return this;
        }
        public DescribeNetworkAclsResponseBodyNetworkAclsNetworkAclIngressAclEntries getIngressAclEntries() {
            return this.ingressAclEntries;
        }

        public DescribeNetworkAclsResponseBodyNetworkAclsNetworkAcl setNetworkAclId(String networkAclId) {
            this.networkAclId = networkAclId;
            return this;
        }
        public String getNetworkAclId() {
            return this.networkAclId;
        }

        public DescribeNetworkAclsResponseBodyNetworkAclsNetworkAcl setNetworkAclName(String networkAclName) {
            this.networkAclName = networkAclName;
            return this;
        }
        public String getNetworkAclName() {
            return this.networkAclName;
        }

        public DescribeNetworkAclsResponseBodyNetworkAclsNetworkAcl setOwnerId(Long ownerId) {
            this.ownerId = ownerId;
            return this;
        }
        public Long getOwnerId() {
            return this.ownerId;
        }

        public DescribeNetworkAclsResponseBodyNetworkAclsNetworkAcl setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeNetworkAclsResponseBodyNetworkAclsNetworkAcl setResources(DescribeNetworkAclsResponseBodyNetworkAclsNetworkAclResources resources) {
            this.resources = resources;
            return this;
        }
        public DescribeNetworkAclsResponseBodyNetworkAclsNetworkAclResources getResources() {
            return this.resources;
        }

        public DescribeNetworkAclsResponseBodyNetworkAclsNetworkAcl setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeNetworkAclsResponseBodyNetworkAclsNetworkAcl setTags(DescribeNetworkAclsResponseBodyNetworkAclsNetworkAclTags tags) {
            this.tags = tags;
            return this;
        }
        public DescribeNetworkAclsResponseBodyNetworkAclsNetworkAclTags getTags() {
            return this.tags;
        }

        public DescribeNetworkAclsResponseBodyNetworkAclsNetworkAcl setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

    public static class DescribeNetworkAclsResponseBodyNetworkAcls extends TeaModel {
        @NameInMap("NetworkAcl")
        public java.util.List<DescribeNetworkAclsResponseBodyNetworkAclsNetworkAcl> networkAcl;

        public static DescribeNetworkAclsResponseBodyNetworkAcls build(java.util.Map<String, ?> map) throws Exception {
            DescribeNetworkAclsResponseBodyNetworkAcls self = new DescribeNetworkAclsResponseBodyNetworkAcls();
            return TeaModel.build(map, self);
        }

        public DescribeNetworkAclsResponseBodyNetworkAcls setNetworkAcl(java.util.List<DescribeNetworkAclsResponseBodyNetworkAclsNetworkAcl> networkAcl) {
            this.networkAcl = networkAcl;
            return this;
        }
        public java.util.List<DescribeNetworkAclsResponseBodyNetworkAclsNetworkAcl> getNetworkAcl() {
            return this.networkAcl;
        }

    }

}
