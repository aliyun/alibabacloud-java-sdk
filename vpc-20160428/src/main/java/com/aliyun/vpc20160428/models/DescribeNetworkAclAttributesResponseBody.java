// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeNetworkAclAttributesResponseBody extends TeaModel {
    /**
     * <p>The protocol. Valid values:</p>
     * <br>
     * <p>*   **icmp**: ICMP</p>
     * <p>*   **gre**: GRE</p>
     * <p>*   **tcp**: TCP</p>
     * <p>*   **udp**: UDP</p>
     * <p>*   **all**: all protocols</p>
     */
    @NameInMap("NetworkAclAttribute")
    public DescribeNetworkAclAttributesResponseBodyNetworkAclAttribute networkAclAttribute;

    /**
     * <p>The source CIDR block.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeNetworkAclAttributesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeNetworkAclAttributesResponseBody self = new DescribeNetworkAclAttributesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeNetworkAclAttributesResponseBody setNetworkAclAttribute(DescribeNetworkAclAttributesResponseBodyNetworkAclAttribute networkAclAttribute) {
        this.networkAclAttribute = networkAclAttribute;
        return this;
    }
    public DescribeNetworkAclAttributesResponseBodyNetworkAclAttribute getNetworkAclAttribute() {
        return this.networkAclAttribute;
    }

    public DescribeNetworkAclAttributesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeNetworkAclAttributesResponseBodyNetworkAclAttributeEgressAclEntriesEgressAclEntry extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("DestinationCidrIp")
        public String destinationCidrIp;

        @NameInMap("NetworkAclEntryId")
        public String networkAclEntryId;

        @NameInMap("NetworkAclEntryName")
        public String networkAclEntryName;

        @NameInMap("Policy")
        public String policy;

        @NameInMap("Port")
        public String port;

        @NameInMap("Protocol")
        public String protocol;

        public static DescribeNetworkAclAttributesResponseBodyNetworkAclAttributeEgressAclEntriesEgressAclEntry build(java.util.Map<String, ?> map) throws Exception {
            DescribeNetworkAclAttributesResponseBodyNetworkAclAttributeEgressAclEntriesEgressAclEntry self = new DescribeNetworkAclAttributesResponseBodyNetworkAclAttributeEgressAclEntriesEgressAclEntry();
            return TeaModel.build(map, self);
        }

        public DescribeNetworkAclAttributesResponseBodyNetworkAclAttributeEgressAclEntriesEgressAclEntry setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeNetworkAclAttributesResponseBodyNetworkAclAttributeEgressAclEntriesEgressAclEntry setDestinationCidrIp(String destinationCidrIp) {
            this.destinationCidrIp = destinationCidrIp;
            return this;
        }
        public String getDestinationCidrIp() {
            return this.destinationCidrIp;
        }

        public DescribeNetworkAclAttributesResponseBodyNetworkAclAttributeEgressAclEntriesEgressAclEntry setNetworkAclEntryId(String networkAclEntryId) {
            this.networkAclEntryId = networkAclEntryId;
            return this;
        }
        public String getNetworkAclEntryId() {
            return this.networkAclEntryId;
        }

        public DescribeNetworkAclAttributesResponseBodyNetworkAclAttributeEgressAclEntriesEgressAclEntry setNetworkAclEntryName(String networkAclEntryName) {
            this.networkAclEntryName = networkAclEntryName;
            return this;
        }
        public String getNetworkAclEntryName() {
            return this.networkAclEntryName;
        }

        public DescribeNetworkAclAttributesResponseBodyNetworkAclAttributeEgressAclEntriesEgressAclEntry setPolicy(String policy) {
            this.policy = policy;
            return this;
        }
        public String getPolicy() {
            return this.policy;
        }

        public DescribeNetworkAclAttributesResponseBodyNetworkAclAttributeEgressAclEntriesEgressAclEntry setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public DescribeNetworkAclAttributesResponseBodyNetworkAclAttributeEgressAclEntriesEgressAclEntry setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

    }

    public static class DescribeNetworkAclAttributesResponseBodyNetworkAclAttributeEgressAclEntries extends TeaModel {
        @NameInMap("EgressAclEntry")
        public java.util.List<DescribeNetworkAclAttributesResponseBodyNetworkAclAttributeEgressAclEntriesEgressAclEntry> egressAclEntry;

        public static DescribeNetworkAclAttributesResponseBodyNetworkAclAttributeEgressAclEntries build(java.util.Map<String, ?> map) throws Exception {
            DescribeNetworkAclAttributesResponseBodyNetworkAclAttributeEgressAclEntries self = new DescribeNetworkAclAttributesResponseBodyNetworkAclAttributeEgressAclEntries();
            return TeaModel.build(map, self);
        }

        public DescribeNetworkAclAttributesResponseBodyNetworkAclAttributeEgressAclEntries setEgressAclEntry(java.util.List<DescribeNetworkAclAttributesResponseBodyNetworkAclAttributeEgressAclEntriesEgressAclEntry> egressAclEntry) {
            this.egressAclEntry = egressAclEntry;
            return this;
        }
        public java.util.List<DescribeNetworkAclAttributesResponseBodyNetworkAclAttributeEgressAclEntriesEgressAclEntry> getEgressAclEntry() {
            return this.egressAclEntry;
        }

    }

    public static class DescribeNetworkAclAttributesResponseBodyNetworkAclAttributeIngressAclEntriesIngressAclEntry extends TeaModel {
        /**
         * <p>The tag list.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The status of the associated resource. Valid values:</p>
         * <br>
         * <p>- **BINDED**: The resource is associated with the network ACL.</p>
         * <p>- **BINDING**: The resource is being associated with the network ACL.</p>
         * <p>- **UNBINDING**: The resource is disassociated from the network ACL.</p>
         */
        @NameInMap("NetworkAclEntryId")
        public String networkAclEntryId;

        /**
         * <p>The type of resource with which you want to associate the network ACL. The value is set to **VSwitch**.</p>
         */
        @NameInMap("NetworkAclEntryName")
        public String networkAclEntryName;

        /**
         * <p>The ID of the associated resource.</p>
         */
        @NameInMap("Policy")
        public String policy;

        @NameInMap("Port")
        public String port;

        /**
         * <p>The tag value.</p>
         */
        @NameInMap("Protocol")
        public String protocol;

        /**
         * <p>The tag key.</p>
         */
        @NameInMap("SourceCidrIp")
        public String sourceCidrIp;

        public static DescribeNetworkAclAttributesResponseBodyNetworkAclAttributeIngressAclEntriesIngressAclEntry build(java.util.Map<String, ?> map) throws Exception {
            DescribeNetworkAclAttributesResponseBodyNetworkAclAttributeIngressAclEntriesIngressAclEntry self = new DescribeNetworkAclAttributesResponseBodyNetworkAclAttributeIngressAclEntriesIngressAclEntry();
            return TeaModel.build(map, self);
        }

        public DescribeNetworkAclAttributesResponseBodyNetworkAclAttributeIngressAclEntriesIngressAclEntry setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeNetworkAclAttributesResponseBodyNetworkAclAttributeIngressAclEntriesIngressAclEntry setNetworkAclEntryId(String networkAclEntryId) {
            this.networkAclEntryId = networkAclEntryId;
            return this;
        }
        public String getNetworkAclEntryId() {
            return this.networkAclEntryId;
        }

        public DescribeNetworkAclAttributesResponseBodyNetworkAclAttributeIngressAclEntriesIngressAclEntry setNetworkAclEntryName(String networkAclEntryName) {
            this.networkAclEntryName = networkAclEntryName;
            return this;
        }
        public String getNetworkAclEntryName() {
            return this.networkAclEntryName;
        }

        public DescribeNetworkAclAttributesResponseBodyNetworkAclAttributeIngressAclEntriesIngressAclEntry setPolicy(String policy) {
            this.policy = policy;
            return this;
        }
        public String getPolicy() {
            return this.policy;
        }

        public DescribeNetworkAclAttributesResponseBodyNetworkAclAttributeIngressAclEntriesIngressAclEntry setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public DescribeNetworkAclAttributesResponseBodyNetworkAclAttributeIngressAclEntriesIngressAclEntry setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public DescribeNetworkAclAttributesResponseBodyNetworkAclAttributeIngressAclEntriesIngressAclEntry setSourceCidrIp(String sourceCidrIp) {
            this.sourceCidrIp = sourceCidrIp;
            return this;
        }
        public String getSourceCidrIp() {
            return this.sourceCidrIp;
        }

    }

    public static class DescribeNetworkAclAttributesResponseBodyNetworkAclAttributeIngressAclEntries extends TeaModel {
        @NameInMap("IngressAclEntry")
        public java.util.List<DescribeNetworkAclAttributesResponseBodyNetworkAclAttributeIngressAclEntriesIngressAclEntry> ingressAclEntry;

        public static DescribeNetworkAclAttributesResponseBodyNetworkAclAttributeIngressAclEntries build(java.util.Map<String, ?> map) throws Exception {
            DescribeNetworkAclAttributesResponseBodyNetworkAclAttributeIngressAclEntries self = new DescribeNetworkAclAttributesResponseBodyNetworkAclAttributeIngressAclEntries();
            return TeaModel.build(map, self);
        }

        public DescribeNetworkAclAttributesResponseBodyNetworkAclAttributeIngressAclEntries setIngressAclEntry(java.util.List<DescribeNetworkAclAttributesResponseBodyNetworkAclAttributeIngressAclEntriesIngressAclEntry> ingressAclEntry) {
            this.ingressAclEntry = ingressAclEntry;
            return this;
        }
        public java.util.List<DescribeNetworkAclAttributesResponseBodyNetworkAclAttributeIngressAclEntriesIngressAclEntry> getIngressAclEntry() {
            return this.ingressAclEntry;
        }

    }

    public static class DescribeNetworkAclAttributesResponseBodyNetworkAclAttributeResourcesResource extends TeaModel {
        @NameInMap("ResourceId")
        public String resourceId;

        @NameInMap("ResourceType")
        public String resourceType;

        @NameInMap("Status")
        public String status;

        public static DescribeNetworkAclAttributesResponseBodyNetworkAclAttributeResourcesResource build(java.util.Map<String, ?> map) throws Exception {
            DescribeNetworkAclAttributesResponseBodyNetworkAclAttributeResourcesResource self = new DescribeNetworkAclAttributesResponseBodyNetworkAclAttributeResourcesResource();
            return TeaModel.build(map, self);
        }

        public DescribeNetworkAclAttributesResponseBodyNetworkAclAttributeResourcesResource setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public DescribeNetworkAclAttributesResponseBodyNetworkAclAttributeResourcesResource setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public DescribeNetworkAclAttributesResponseBodyNetworkAclAttributeResourcesResource setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeNetworkAclAttributesResponseBodyNetworkAclAttributeResources extends TeaModel {
        @NameInMap("Resource")
        public java.util.List<DescribeNetworkAclAttributesResponseBodyNetworkAclAttributeResourcesResource> resource;

        public static DescribeNetworkAclAttributesResponseBodyNetworkAclAttributeResources build(java.util.Map<String, ?> map) throws Exception {
            DescribeNetworkAclAttributesResponseBodyNetworkAclAttributeResources self = new DescribeNetworkAclAttributesResponseBodyNetworkAclAttributeResources();
            return TeaModel.build(map, self);
        }

        public DescribeNetworkAclAttributesResponseBodyNetworkAclAttributeResources setResource(java.util.List<DescribeNetworkAclAttributesResponseBodyNetworkAclAttributeResourcesResource> resource) {
            this.resource = resource;
            return this;
        }
        public java.util.List<DescribeNetworkAclAttributesResponseBodyNetworkAclAttributeResourcesResource> getResource() {
            return this.resource;
        }

    }

    public static class DescribeNetworkAclAttributesResponseBodyNetworkAclAttributeTagsTag extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static DescribeNetworkAclAttributesResponseBodyNetworkAclAttributeTagsTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeNetworkAclAttributesResponseBodyNetworkAclAttributeTagsTag self = new DescribeNetworkAclAttributesResponseBodyNetworkAclAttributeTagsTag();
            return TeaModel.build(map, self);
        }

        public DescribeNetworkAclAttributesResponseBodyNetworkAclAttributeTagsTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeNetworkAclAttributesResponseBodyNetworkAclAttributeTagsTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeNetworkAclAttributesResponseBodyNetworkAclAttributeTags extends TeaModel {
        @NameInMap("Tag")
        public java.util.List<DescribeNetworkAclAttributesResponseBodyNetworkAclAttributeTagsTag> tag;

        public static DescribeNetworkAclAttributesResponseBodyNetworkAclAttributeTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeNetworkAclAttributesResponseBodyNetworkAclAttributeTags self = new DescribeNetworkAclAttributesResponseBodyNetworkAclAttributeTags();
            return TeaModel.build(map, self);
        }

        public DescribeNetworkAclAttributesResponseBodyNetworkAclAttributeTags setTag(java.util.List<DescribeNetworkAclAttributesResponseBodyNetworkAclAttributeTagsTag> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<DescribeNetworkAclAttributesResponseBodyNetworkAclAttributeTagsTag> getTag() {
            return this.tag;
        }

    }

    public static class DescribeNetworkAclAttributesResponseBodyNetworkAclAttribute extends TeaModel {
        /**
         * <p>The ID of the outbound rule.</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The name of the outbound rule.</p>
         */
        @NameInMap("Description")
        public String description;

        @NameInMap("EgressAclEntries")
        public DescribeNetworkAclAttributesResponseBodyNetworkAclAttributeEgressAclEntries egressAclEntries;

        /**
         * <p>The details about the resource that is associated with the network ACL.</p>
         */
        @NameInMap("IngressAclEntries")
        public DescribeNetworkAclAttributesResponseBodyNetworkAclAttributeIngressAclEntries ingressAclEntries;

        /**
         * <p>The description of the outbound rule.</p>
         */
        @NameInMap("NetworkAclId")
        public String networkAclId;

        /**
         * <p>The action to be performed on network traffic that matches the rule. Valid values:</p>
         * <br>
         * <p>- **accept**: allows network traffic.</p>
         * <p>- **drop**: blocks network traffic.</p>
         */
        @NameInMap("NetworkAclName")
        public String networkAclName;

        /**
         * <p>The protocol. Valid values:</p>
         * <br>
         * <p>- **icmp**: ICMP</p>
         * <p>- **gre**: GRE</p>
         * <p>- **tcp**: TCP</p>
         * <p>- **udp**: UDP</p>
         * <p>- **all**: all protocols</p>
         */
        @NameInMap("OwnerId")
        public Long ownerId;

        /**
         * <p>The destination CIDR block.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("Resources")
        public DescribeNetworkAclAttributesResponseBodyNetworkAclAttributeResources resources;

        /**
         * <p>The destination port range of the inbound traffic.</p>
         * <br>
         * <p>*   If **Protocol** of the inbound rule is set to **all**, **icmp**, or **gre**, the port range is **-1/-1**, which indicates all ports.</p>
         * <p>*   If **Protocol** of the inbound rule is set to **tcp** or **udp**, the port range is in the following format: **1/200** or **80/80**, which indicates port 1 to port 200, or port 80. Valid values for a port: **1** to **65535**.</p>
         */
        @NameInMap("Status")
        public String status;

        @NameInMap("Tags")
        public DescribeNetworkAclAttributesResponseBodyNetworkAclAttributeTags tags;

        /**
         * <p>The information about the outbound rules of the network ACL.</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        public static DescribeNetworkAclAttributesResponseBodyNetworkAclAttribute build(java.util.Map<String, ?> map) throws Exception {
            DescribeNetworkAclAttributesResponseBodyNetworkAclAttribute self = new DescribeNetworkAclAttributesResponseBodyNetworkAclAttribute();
            return TeaModel.build(map, self);
        }

        public DescribeNetworkAclAttributesResponseBodyNetworkAclAttribute setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeNetworkAclAttributesResponseBodyNetworkAclAttribute setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeNetworkAclAttributesResponseBodyNetworkAclAttribute setEgressAclEntries(DescribeNetworkAclAttributesResponseBodyNetworkAclAttributeEgressAclEntries egressAclEntries) {
            this.egressAclEntries = egressAclEntries;
            return this;
        }
        public DescribeNetworkAclAttributesResponseBodyNetworkAclAttributeEgressAclEntries getEgressAclEntries() {
            return this.egressAclEntries;
        }

        public DescribeNetworkAclAttributesResponseBodyNetworkAclAttribute setIngressAclEntries(DescribeNetworkAclAttributesResponseBodyNetworkAclAttributeIngressAclEntries ingressAclEntries) {
            this.ingressAclEntries = ingressAclEntries;
            return this;
        }
        public DescribeNetworkAclAttributesResponseBodyNetworkAclAttributeIngressAclEntries getIngressAclEntries() {
            return this.ingressAclEntries;
        }

        public DescribeNetworkAclAttributesResponseBodyNetworkAclAttribute setNetworkAclId(String networkAclId) {
            this.networkAclId = networkAclId;
            return this;
        }
        public String getNetworkAclId() {
            return this.networkAclId;
        }

        public DescribeNetworkAclAttributesResponseBodyNetworkAclAttribute setNetworkAclName(String networkAclName) {
            this.networkAclName = networkAclName;
            return this;
        }
        public String getNetworkAclName() {
            return this.networkAclName;
        }

        public DescribeNetworkAclAttributesResponseBodyNetworkAclAttribute setOwnerId(Long ownerId) {
            this.ownerId = ownerId;
            return this;
        }
        public Long getOwnerId() {
            return this.ownerId;
        }

        public DescribeNetworkAclAttributesResponseBodyNetworkAclAttribute setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeNetworkAclAttributesResponseBodyNetworkAclAttribute setResources(DescribeNetworkAclAttributesResponseBodyNetworkAclAttributeResources resources) {
            this.resources = resources;
            return this;
        }
        public DescribeNetworkAclAttributesResponseBodyNetworkAclAttributeResources getResources() {
            return this.resources;
        }

        public DescribeNetworkAclAttributesResponseBodyNetworkAclAttribute setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeNetworkAclAttributesResponseBodyNetworkAclAttribute setTags(DescribeNetworkAclAttributesResponseBodyNetworkAclAttributeTags tags) {
            this.tags = tags;
            return this;
        }
        public DescribeNetworkAclAttributesResponseBodyNetworkAclAttributeTags getTags() {
            return this.tags;
        }

        public DescribeNetworkAclAttributesResponseBodyNetworkAclAttribute setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

}
