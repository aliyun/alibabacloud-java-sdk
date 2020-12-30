// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeNetworkAclAttributesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("NetworkAclAttribute")
    public DescribeNetworkAclAttributesResponseBodyNetworkAclAttribute networkAclAttribute;

    public static DescribeNetworkAclAttributesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeNetworkAclAttributesResponseBody self = new DescribeNetworkAclAttributesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeNetworkAclAttributesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeNetworkAclAttributesResponseBody setNetworkAclAttribute(DescribeNetworkAclAttributesResponseBodyNetworkAclAttribute networkAclAttribute) {
        this.networkAclAttribute = networkAclAttribute;
        return this;
    }
    public DescribeNetworkAclAttributesResponseBodyNetworkAclAttribute getNetworkAclAttribute() {
        return this.networkAclAttribute;
    }

    public static class DescribeNetworkAclAttributesResponseBodyNetworkAclAttributeEgressAclEntriesEgressAclEntry extends TeaModel {
        @NameInMap("NetworkAclEntryId")
        public String networkAclEntryId;

        @NameInMap("EntryType")
        public String entryType;

        @NameInMap("NetworkAclEntryName")
        public String networkAclEntryName;

        @NameInMap("Policy")
        public String policy;

        @NameInMap("Description")
        public String description;

        @NameInMap("Protocol")
        public String protocol;

        @NameInMap("DestinationCidrIp")
        public String destinationCidrIp;

        @NameInMap("Port")
        public String port;

        public static DescribeNetworkAclAttributesResponseBodyNetworkAclAttributeEgressAclEntriesEgressAclEntry build(java.util.Map<String, ?> map) throws Exception {
            DescribeNetworkAclAttributesResponseBodyNetworkAclAttributeEgressAclEntriesEgressAclEntry self = new DescribeNetworkAclAttributesResponseBodyNetworkAclAttributeEgressAclEntriesEgressAclEntry();
            return TeaModel.build(map, self);
        }

        public DescribeNetworkAclAttributesResponseBodyNetworkAclAttributeEgressAclEntriesEgressAclEntry setNetworkAclEntryId(String networkAclEntryId) {
            this.networkAclEntryId = networkAclEntryId;
            return this;
        }
        public String getNetworkAclEntryId() {
            return this.networkAclEntryId;
        }

        public DescribeNetworkAclAttributesResponseBodyNetworkAclAttributeEgressAclEntriesEgressAclEntry setEntryType(String entryType) {
            this.entryType = entryType;
            return this;
        }
        public String getEntryType() {
            return this.entryType;
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

        public DescribeNetworkAclAttributesResponseBodyNetworkAclAttributeEgressAclEntriesEgressAclEntry setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeNetworkAclAttributesResponseBodyNetworkAclAttributeEgressAclEntriesEgressAclEntry setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public DescribeNetworkAclAttributesResponseBodyNetworkAclAttributeEgressAclEntriesEgressAclEntry setDestinationCidrIp(String destinationCidrIp) {
            this.destinationCidrIp = destinationCidrIp;
            return this;
        }
        public String getDestinationCidrIp() {
            return this.destinationCidrIp;
        }

        public DescribeNetworkAclAttributesResponseBodyNetworkAclAttributeEgressAclEntriesEgressAclEntry setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
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
        @NameInMap("NetworkAclEntryId")
        public String networkAclEntryId;

        @NameInMap("EntryType")
        public String entryType;

        @NameInMap("NetworkAclEntryName")
        public String networkAclEntryName;

        @NameInMap("Policy")
        public String policy;

        @NameInMap("Description")
        public String description;

        @NameInMap("SourceCidrIp")
        public String sourceCidrIp;

        @NameInMap("Protocol")
        public String protocol;

        @NameInMap("Port")
        public String port;

        public static DescribeNetworkAclAttributesResponseBodyNetworkAclAttributeIngressAclEntriesIngressAclEntry build(java.util.Map<String, ?> map) throws Exception {
            DescribeNetworkAclAttributesResponseBodyNetworkAclAttributeIngressAclEntriesIngressAclEntry self = new DescribeNetworkAclAttributesResponseBodyNetworkAclAttributeIngressAclEntriesIngressAclEntry();
            return TeaModel.build(map, self);
        }

        public DescribeNetworkAclAttributesResponseBodyNetworkAclAttributeIngressAclEntriesIngressAclEntry setNetworkAclEntryId(String networkAclEntryId) {
            this.networkAclEntryId = networkAclEntryId;
            return this;
        }
        public String getNetworkAclEntryId() {
            return this.networkAclEntryId;
        }

        public DescribeNetworkAclAttributesResponseBodyNetworkAclAttributeIngressAclEntriesIngressAclEntry setEntryType(String entryType) {
            this.entryType = entryType;
            return this;
        }
        public String getEntryType() {
            return this.entryType;
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

        public DescribeNetworkAclAttributesResponseBodyNetworkAclAttributeIngressAclEntriesIngressAclEntry setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeNetworkAclAttributesResponseBodyNetworkAclAttributeIngressAclEntriesIngressAclEntry setSourceCidrIp(String sourceCidrIp) {
            this.sourceCidrIp = sourceCidrIp;
            return this;
        }
        public String getSourceCidrIp() {
            return this.sourceCidrIp;
        }

        public DescribeNetworkAclAttributesResponseBodyNetworkAclAttributeIngressAclEntriesIngressAclEntry setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public DescribeNetworkAclAttributesResponseBodyNetworkAclAttributeIngressAclEntriesIngressAclEntry setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
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
        @NameInMap("Status")
        public String status;

        @NameInMap("ResourceType")
        public String resourceType;

        @NameInMap("ResourceId")
        public String resourceId;

        public static DescribeNetworkAclAttributesResponseBodyNetworkAclAttributeResourcesResource build(java.util.Map<String, ?> map) throws Exception {
            DescribeNetworkAclAttributesResponseBodyNetworkAclAttributeResourcesResource self = new DescribeNetworkAclAttributesResponseBodyNetworkAclAttributeResourcesResource();
            return TeaModel.build(map, self);
        }

        public DescribeNetworkAclAttributesResponseBodyNetworkAclAttributeResourcesResource setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeNetworkAclAttributesResponseBodyNetworkAclAttributeResourcesResource setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public DescribeNetworkAclAttributesResponseBodyNetworkAclAttributeResourcesResource setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
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

    public static class DescribeNetworkAclAttributesResponseBodyNetworkAclAttribute extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("VpcId")
        public String vpcId;

        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("Description")
        public String description;

        @NameInMap("EgressAclEntries")
        public DescribeNetworkAclAttributesResponseBodyNetworkAclAttributeEgressAclEntries egressAclEntries;

        @NameInMap("NetworkAclName")
        public String networkAclName;

        @NameInMap("IngressAclEntries")
        public DescribeNetworkAclAttributesResponseBodyNetworkAclAttributeIngressAclEntries ingressAclEntries;

        @NameInMap("NetworkAclId")
        public String networkAclId;

        @NameInMap("OwnerId")
        public Long ownerId;

        @NameInMap("Resources")
        public DescribeNetworkAclAttributesResponseBodyNetworkAclAttributeResources resources;

        @NameInMap("RegionId")
        public String regionId;

        public static DescribeNetworkAclAttributesResponseBodyNetworkAclAttribute build(java.util.Map<String, ?> map) throws Exception {
            DescribeNetworkAclAttributesResponseBodyNetworkAclAttribute self = new DescribeNetworkAclAttributesResponseBodyNetworkAclAttribute();
            return TeaModel.build(map, self);
        }

        public DescribeNetworkAclAttributesResponseBodyNetworkAclAttribute setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeNetworkAclAttributesResponseBodyNetworkAclAttribute setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
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

        public DescribeNetworkAclAttributesResponseBodyNetworkAclAttribute setNetworkAclName(String networkAclName) {
            this.networkAclName = networkAclName;
            return this;
        }
        public String getNetworkAclName() {
            return this.networkAclName;
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

        public DescribeNetworkAclAttributesResponseBodyNetworkAclAttribute setOwnerId(Long ownerId) {
            this.ownerId = ownerId;
            return this;
        }
        public Long getOwnerId() {
            return this.ownerId;
        }

        public DescribeNetworkAclAttributesResponseBodyNetworkAclAttribute setResources(DescribeNetworkAclAttributesResponseBodyNetworkAclAttributeResources resources) {
            this.resources = resources;
            return this;
        }
        public DescribeNetworkAclAttributesResponseBodyNetworkAclAttributeResources getResources() {
            return this.resources;
        }

        public DescribeNetworkAclAttributesResponseBodyNetworkAclAttribute setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

}
