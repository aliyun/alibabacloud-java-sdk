// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeNetworkAclAttributesResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("NetworkAclAttribute")
    @Validation(required = true)
    public DescribeNetworkAclAttributesResponseNetworkAclAttribute networkAclAttribute;

    public static DescribeNetworkAclAttributesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeNetworkAclAttributesResponse self = new DescribeNetworkAclAttributesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeNetworkAclAttributesResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeNetworkAclAttributesResponse setNetworkAclAttribute(DescribeNetworkAclAttributesResponseNetworkAclAttribute networkAclAttribute) {
        this.networkAclAttribute = networkAclAttribute;
        return this;
    }
    public DescribeNetworkAclAttributesResponseNetworkAclAttribute getNetworkAclAttribute() {
        return this.networkAclAttribute;
    }

    public static class DescribeNetworkAclAttributesResponseNetworkAclAttributeIngressAclEntriesIngressAclEntry extends TeaModel {
        @NameInMap("NetworkAclEntryId")
        @Validation(required = true)
        public String networkAclEntryId;

        @NameInMap("Policy")
        @Validation(required = true)
        public String policy;

        @NameInMap("Protocol")
        @Validation(required = true)
        public String protocol;

        @NameInMap("SourceCidrIp")
        @Validation(required = true)
        public String sourceCidrIp;

        @NameInMap("Port")
        @Validation(required = true)
        public String port;

        @NameInMap("EntryType")
        @Validation(required = true)
        public String entryType;

        @NameInMap("NetworkAclEntryName")
        @Validation(required = true)
        public String networkAclEntryName;

        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        public static DescribeNetworkAclAttributesResponseNetworkAclAttributeIngressAclEntriesIngressAclEntry build(java.util.Map<String, ?> map) throws Exception {
            DescribeNetworkAclAttributesResponseNetworkAclAttributeIngressAclEntriesIngressAclEntry self = new DescribeNetworkAclAttributesResponseNetworkAclAttributeIngressAclEntriesIngressAclEntry();
            return TeaModel.build(map, self);
        }

        public DescribeNetworkAclAttributesResponseNetworkAclAttributeIngressAclEntriesIngressAclEntry setNetworkAclEntryId(String networkAclEntryId) {
            this.networkAclEntryId = networkAclEntryId;
            return this;
        }
        public String getNetworkAclEntryId() {
            return this.networkAclEntryId;
        }

        public DescribeNetworkAclAttributesResponseNetworkAclAttributeIngressAclEntriesIngressAclEntry setPolicy(String policy) {
            this.policy = policy;
            return this;
        }
        public String getPolicy() {
            return this.policy;
        }

        public DescribeNetworkAclAttributesResponseNetworkAclAttributeIngressAclEntriesIngressAclEntry setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public DescribeNetworkAclAttributesResponseNetworkAclAttributeIngressAclEntriesIngressAclEntry setSourceCidrIp(String sourceCidrIp) {
            this.sourceCidrIp = sourceCidrIp;
            return this;
        }
        public String getSourceCidrIp() {
            return this.sourceCidrIp;
        }

        public DescribeNetworkAclAttributesResponseNetworkAclAttributeIngressAclEntriesIngressAclEntry setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public DescribeNetworkAclAttributesResponseNetworkAclAttributeIngressAclEntriesIngressAclEntry setEntryType(String entryType) {
            this.entryType = entryType;
            return this;
        }
        public String getEntryType() {
            return this.entryType;
        }

        public DescribeNetworkAclAttributesResponseNetworkAclAttributeIngressAclEntriesIngressAclEntry setNetworkAclEntryName(String networkAclEntryName) {
            this.networkAclEntryName = networkAclEntryName;
            return this;
        }
        public String getNetworkAclEntryName() {
            return this.networkAclEntryName;
        }

        public DescribeNetworkAclAttributesResponseNetworkAclAttributeIngressAclEntriesIngressAclEntry setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

    }

    public static class DescribeNetworkAclAttributesResponseNetworkAclAttributeIngressAclEntries extends TeaModel {
        @NameInMap("IngressAclEntry")
        @Validation(required = true)
        public java.util.List<DescribeNetworkAclAttributesResponseNetworkAclAttributeIngressAclEntriesIngressAclEntry> ingressAclEntry;

        public static DescribeNetworkAclAttributesResponseNetworkAclAttributeIngressAclEntries build(java.util.Map<String, ?> map) throws Exception {
            DescribeNetworkAclAttributesResponseNetworkAclAttributeIngressAclEntries self = new DescribeNetworkAclAttributesResponseNetworkAclAttributeIngressAclEntries();
            return TeaModel.build(map, self);
        }

        public DescribeNetworkAclAttributesResponseNetworkAclAttributeIngressAclEntries setIngressAclEntry(java.util.List<DescribeNetworkAclAttributesResponseNetworkAclAttributeIngressAclEntriesIngressAclEntry> ingressAclEntry) {
            this.ingressAclEntry = ingressAclEntry;
            return this;
        }
        public java.util.List<DescribeNetworkAclAttributesResponseNetworkAclAttributeIngressAclEntriesIngressAclEntry> getIngressAclEntry() {
            return this.ingressAclEntry;
        }

    }

    public static class DescribeNetworkAclAttributesResponseNetworkAclAttributeEgressAclEntriesEgressAclEntry extends TeaModel {
        @NameInMap("NetworkAclEntryId")
        @Validation(required = true)
        public String networkAclEntryId;

        @NameInMap("Policy")
        @Validation(required = true)
        public String policy;

        @NameInMap("Protocol")
        @Validation(required = true)
        public String protocol;

        @NameInMap("DestinationCidrIp")
        @Validation(required = true)
        public String destinationCidrIp;

        @NameInMap("Port")
        @Validation(required = true)
        public String port;

        @NameInMap("EntryType")
        @Validation(required = true)
        public String entryType;

        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        @NameInMap("NetworkAclEntryName")
        @Validation(required = true)
        public String networkAclEntryName;

        public static DescribeNetworkAclAttributesResponseNetworkAclAttributeEgressAclEntriesEgressAclEntry build(java.util.Map<String, ?> map) throws Exception {
            DescribeNetworkAclAttributesResponseNetworkAclAttributeEgressAclEntriesEgressAclEntry self = new DescribeNetworkAclAttributesResponseNetworkAclAttributeEgressAclEntriesEgressAclEntry();
            return TeaModel.build(map, self);
        }

        public DescribeNetworkAclAttributesResponseNetworkAclAttributeEgressAclEntriesEgressAclEntry setNetworkAclEntryId(String networkAclEntryId) {
            this.networkAclEntryId = networkAclEntryId;
            return this;
        }
        public String getNetworkAclEntryId() {
            return this.networkAclEntryId;
        }

        public DescribeNetworkAclAttributesResponseNetworkAclAttributeEgressAclEntriesEgressAclEntry setPolicy(String policy) {
            this.policy = policy;
            return this;
        }
        public String getPolicy() {
            return this.policy;
        }

        public DescribeNetworkAclAttributesResponseNetworkAclAttributeEgressAclEntriesEgressAclEntry setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public DescribeNetworkAclAttributesResponseNetworkAclAttributeEgressAclEntriesEgressAclEntry setDestinationCidrIp(String destinationCidrIp) {
            this.destinationCidrIp = destinationCidrIp;
            return this;
        }
        public String getDestinationCidrIp() {
            return this.destinationCidrIp;
        }

        public DescribeNetworkAclAttributesResponseNetworkAclAttributeEgressAclEntriesEgressAclEntry setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public DescribeNetworkAclAttributesResponseNetworkAclAttributeEgressAclEntriesEgressAclEntry setEntryType(String entryType) {
            this.entryType = entryType;
            return this;
        }
        public String getEntryType() {
            return this.entryType;
        }

        public DescribeNetworkAclAttributesResponseNetworkAclAttributeEgressAclEntriesEgressAclEntry setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeNetworkAclAttributesResponseNetworkAclAttributeEgressAclEntriesEgressAclEntry setNetworkAclEntryName(String networkAclEntryName) {
            this.networkAclEntryName = networkAclEntryName;
            return this;
        }
        public String getNetworkAclEntryName() {
            return this.networkAclEntryName;
        }

    }

    public static class DescribeNetworkAclAttributesResponseNetworkAclAttributeEgressAclEntries extends TeaModel {
        @NameInMap("EgressAclEntry")
        @Validation(required = true)
        public java.util.List<DescribeNetworkAclAttributesResponseNetworkAclAttributeEgressAclEntriesEgressAclEntry> egressAclEntry;

        public static DescribeNetworkAclAttributesResponseNetworkAclAttributeEgressAclEntries build(java.util.Map<String, ?> map) throws Exception {
            DescribeNetworkAclAttributesResponseNetworkAclAttributeEgressAclEntries self = new DescribeNetworkAclAttributesResponseNetworkAclAttributeEgressAclEntries();
            return TeaModel.build(map, self);
        }

        public DescribeNetworkAclAttributesResponseNetworkAclAttributeEgressAclEntries setEgressAclEntry(java.util.List<DescribeNetworkAclAttributesResponseNetworkAclAttributeEgressAclEntriesEgressAclEntry> egressAclEntry) {
            this.egressAclEntry = egressAclEntry;
            return this;
        }
        public java.util.List<DescribeNetworkAclAttributesResponseNetworkAclAttributeEgressAclEntriesEgressAclEntry> getEgressAclEntry() {
            return this.egressAclEntry;
        }

    }

    public static class DescribeNetworkAclAttributesResponseNetworkAclAttributeResourcesResource extends TeaModel {
        @NameInMap("ResourceId")
        @Validation(required = true)
        public String resourceId;

        @NameInMap("ResourceType")
        @Validation(required = true)
        public String resourceType;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        public static DescribeNetworkAclAttributesResponseNetworkAclAttributeResourcesResource build(java.util.Map<String, ?> map) throws Exception {
            DescribeNetworkAclAttributesResponseNetworkAclAttributeResourcesResource self = new DescribeNetworkAclAttributesResponseNetworkAclAttributeResourcesResource();
            return TeaModel.build(map, self);
        }

        public DescribeNetworkAclAttributesResponseNetworkAclAttributeResourcesResource setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public DescribeNetworkAclAttributesResponseNetworkAclAttributeResourcesResource setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public DescribeNetworkAclAttributesResponseNetworkAclAttributeResourcesResource setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeNetworkAclAttributesResponseNetworkAclAttributeResources extends TeaModel {
        @NameInMap("Resource")
        @Validation(required = true)
        public java.util.List<DescribeNetworkAclAttributesResponseNetworkAclAttributeResourcesResource> resource;

        public static DescribeNetworkAclAttributesResponseNetworkAclAttributeResources build(java.util.Map<String, ?> map) throws Exception {
            DescribeNetworkAclAttributesResponseNetworkAclAttributeResources self = new DescribeNetworkAclAttributesResponseNetworkAclAttributeResources();
            return TeaModel.build(map, self);
        }

        public DescribeNetworkAclAttributesResponseNetworkAclAttributeResources setResource(java.util.List<DescribeNetworkAclAttributesResponseNetworkAclAttributeResourcesResource> resource) {
            this.resource = resource;
            return this;
        }
        public java.util.List<DescribeNetworkAclAttributesResponseNetworkAclAttributeResourcesResource> getResource() {
            return this.resource;
        }

    }

    public static class DescribeNetworkAclAttributesResponseNetworkAclAttribute extends TeaModel {
        @NameInMap("NetworkAclId")
        @Validation(required = true)
        public String networkAclId;

        @NameInMap("RegionId")
        @Validation(required = true)
        public String regionId;

        @NameInMap("NetworkAclName")
        @Validation(required = true)
        public String networkAclName;

        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        @NameInMap("VpcId")
        @Validation(required = true)
        public String vpcId;

        @NameInMap("CreationTime")
        @Validation(required = true)
        public String creationTime;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("OwnerId")
        @Validation(required = true)
        public Long ownerId;

        @NameInMap("IngressAclEntries")
        @Validation(required = true)
        public DescribeNetworkAclAttributesResponseNetworkAclAttributeIngressAclEntries ingressAclEntries;

        @NameInMap("EgressAclEntries")
        @Validation(required = true)
        public DescribeNetworkAclAttributesResponseNetworkAclAttributeEgressAclEntries egressAclEntries;

        @NameInMap("Resources")
        @Validation(required = true)
        public DescribeNetworkAclAttributesResponseNetworkAclAttributeResources resources;

        public static DescribeNetworkAclAttributesResponseNetworkAclAttribute build(java.util.Map<String, ?> map) throws Exception {
            DescribeNetworkAclAttributesResponseNetworkAclAttribute self = new DescribeNetworkAclAttributesResponseNetworkAclAttribute();
            return TeaModel.build(map, self);
        }

        public DescribeNetworkAclAttributesResponseNetworkAclAttribute setNetworkAclId(String networkAclId) {
            this.networkAclId = networkAclId;
            return this;
        }
        public String getNetworkAclId() {
            return this.networkAclId;
        }

        public DescribeNetworkAclAttributesResponseNetworkAclAttribute setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeNetworkAclAttributesResponseNetworkAclAttribute setNetworkAclName(String networkAclName) {
            this.networkAclName = networkAclName;
            return this;
        }
        public String getNetworkAclName() {
            return this.networkAclName;
        }

        public DescribeNetworkAclAttributesResponseNetworkAclAttribute setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeNetworkAclAttributesResponseNetworkAclAttribute setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public DescribeNetworkAclAttributesResponseNetworkAclAttribute setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeNetworkAclAttributesResponseNetworkAclAttribute setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeNetworkAclAttributesResponseNetworkAclAttribute setOwnerId(Long ownerId) {
            this.ownerId = ownerId;
            return this;
        }
        public Long getOwnerId() {
            return this.ownerId;
        }

        public DescribeNetworkAclAttributesResponseNetworkAclAttribute setIngressAclEntries(DescribeNetworkAclAttributesResponseNetworkAclAttributeIngressAclEntries ingressAclEntries) {
            this.ingressAclEntries = ingressAclEntries;
            return this;
        }
        public DescribeNetworkAclAttributesResponseNetworkAclAttributeIngressAclEntries getIngressAclEntries() {
            return this.ingressAclEntries;
        }

        public DescribeNetworkAclAttributesResponseNetworkAclAttribute setEgressAclEntries(DescribeNetworkAclAttributesResponseNetworkAclAttributeEgressAclEntries egressAclEntries) {
            this.egressAclEntries = egressAclEntries;
            return this;
        }
        public DescribeNetworkAclAttributesResponseNetworkAclAttributeEgressAclEntries getEgressAclEntries() {
            return this.egressAclEntries;
        }

        public DescribeNetworkAclAttributesResponseNetworkAclAttribute setResources(DescribeNetworkAclAttributesResponseNetworkAclAttributeResources resources) {
            this.resources = resources;
            return this;
        }
        public DescribeNetworkAclAttributesResponseNetworkAclAttributeResources getResources() {
            return this.resources;
        }

    }

}
