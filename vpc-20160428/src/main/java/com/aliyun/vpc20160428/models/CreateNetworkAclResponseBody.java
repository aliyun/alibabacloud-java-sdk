// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateNetworkAclResponseBody extends TeaModel {
    @NameInMap("NetworkAclId")
    public String networkAclId;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("NetworkAclAttribute")
    public CreateNetworkAclResponseBodyNetworkAclAttribute networkAclAttribute;

    public static CreateNetworkAclResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateNetworkAclResponseBody self = new CreateNetworkAclResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateNetworkAclResponseBody setNetworkAclId(String networkAclId) {
        this.networkAclId = networkAclId;
        return this;
    }
    public String getNetworkAclId() {
        return this.networkAclId;
    }

    public CreateNetworkAclResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateNetworkAclResponseBody setNetworkAclAttribute(CreateNetworkAclResponseBodyNetworkAclAttribute networkAclAttribute) {
        this.networkAclAttribute = networkAclAttribute;
        return this;
    }
    public CreateNetworkAclResponseBodyNetworkAclAttribute getNetworkAclAttribute() {
        return this.networkAclAttribute;
    }

    public static class CreateNetworkAclResponseBodyNetworkAclAttributeEgressAclEntriesEgressAclEntry extends TeaModel {
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

        public static CreateNetworkAclResponseBodyNetworkAclAttributeEgressAclEntriesEgressAclEntry build(java.util.Map<String, ?> map) throws Exception {
            CreateNetworkAclResponseBodyNetworkAclAttributeEgressAclEntriesEgressAclEntry self = new CreateNetworkAclResponseBodyNetworkAclAttributeEgressAclEntriesEgressAclEntry();
            return TeaModel.build(map, self);
        }

        public CreateNetworkAclResponseBodyNetworkAclAttributeEgressAclEntriesEgressAclEntry setNetworkAclEntryId(String networkAclEntryId) {
            this.networkAclEntryId = networkAclEntryId;
            return this;
        }
        public String getNetworkAclEntryId() {
            return this.networkAclEntryId;
        }

        public CreateNetworkAclResponseBodyNetworkAclAttributeEgressAclEntriesEgressAclEntry setEntryType(String entryType) {
            this.entryType = entryType;
            return this;
        }
        public String getEntryType() {
            return this.entryType;
        }

        public CreateNetworkAclResponseBodyNetworkAclAttributeEgressAclEntriesEgressAclEntry setNetworkAclEntryName(String networkAclEntryName) {
            this.networkAclEntryName = networkAclEntryName;
            return this;
        }
        public String getNetworkAclEntryName() {
            return this.networkAclEntryName;
        }

        public CreateNetworkAclResponseBodyNetworkAclAttributeEgressAclEntriesEgressAclEntry setPolicy(String policy) {
            this.policy = policy;
            return this;
        }
        public String getPolicy() {
            return this.policy;
        }

        public CreateNetworkAclResponseBodyNetworkAclAttributeEgressAclEntriesEgressAclEntry setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateNetworkAclResponseBodyNetworkAclAttributeEgressAclEntriesEgressAclEntry setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public CreateNetworkAclResponseBodyNetworkAclAttributeEgressAclEntriesEgressAclEntry setDestinationCidrIp(String destinationCidrIp) {
            this.destinationCidrIp = destinationCidrIp;
            return this;
        }
        public String getDestinationCidrIp() {
            return this.destinationCidrIp;
        }

        public CreateNetworkAclResponseBodyNetworkAclAttributeEgressAclEntriesEgressAclEntry setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

    }

    public static class CreateNetworkAclResponseBodyNetworkAclAttributeEgressAclEntries extends TeaModel {
        @NameInMap("EgressAclEntry")
        public java.util.List<CreateNetworkAclResponseBodyNetworkAclAttributeEgressAclEntriesEgressAclEntry> egressAclEntry;

        public static CreateNetworkAclResponseBodyNetworkAclAttributeEgressAclEntries build(java.util.Map<String, ?> map) throws Exception {
            CreateNetworkAclResponseBodyNetworkAclAttributeEgressAclEntries self = new CreateNetworkAclResponseBodyNetworkAclAttributeEgressAclEntries();
            return TeaModel.build(map, self);
        }

        public CreateNetworkAclResponseBodyNetworkAclAttributeEgressAclEntries setEgressAclEntry(java.util.List<CreateNetworkAclResponseBodyNetworkAclAttributeEgressAclEntriesEgressAclEntry> egressAclEntry) {
            this.egressAclEntry = egressAclEntry;
            return this;
        }
        public java.util.List<CreateNetworkAclResponseBodyNetworkAclAttributeEgressAclEntriesEgressAclEntry> getEgressAclEntry() {
            return this.egressAclEntry;
        }

    }

    public static class CreateNetworkAclResponseBodyNetworkAclAttributeIngressAclEntriesIngressAclEntry extends TeaModel {
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

        public static CreateNetworkAclResponseBodyNetworkAclAttributeIngressAclEntriesIngressAclEntry build(java.util.Map<String, ?> map) throws Exception {
            CreateNetworkAclResponseBodyNetworkAclAttributeIngressAclEntriesIngressAclEntry self = new CreateNetworkAclResponseBodyNetworkAclAttributeIngressAclEntriesIngressAclEntry();
            return TeaModel.build(map, self);
        }

        public CreateNetworkAclResponseBodyNetworkAclAttributeIngressAclEntriesIngressAclEntry setNetworkAclEntryId(String networkAclEntryId) {
            this.networkAclEntryId = networkAclEntryId;
            return this;
        }
        public String getNetworkAclEntryId() {
            return this.networkAclEntryId;
        }

        public CreateNetworkAclResponseBodyNetworkAclAttributeIngressAclEntriesIngressAclEntry setEntryType(String entryType) {
            this.entryType = entryType;
            return this;
        }
        public String getEntryType() {
            return this.entryType;
        }

        public CreateNetworkAclResponseBodyNetworkAclAttributeIngressAclEntriesIngressAclEntry setNetworkAclEntryName(String networkAclEntryName) {
            this.networkAclEntryName = networkAclEntryName;
            return this;
        }
        public String getNetworkAclEntryName() {
            return this.networkAclEntryName;
        }

        public CreateNetworkAclResponseBodyNetworkAclAttributeIngressAclEntriesIngressAclEntry setPolicy(String policy) {
            this.policy = policy;
            return this;
        }
        public String getPolicy() {
            return this.policy;
        }

        public CreateNetworkAclResponseBodyNetworkAclAttributeIngressAclEntriesIngressAclEntry setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateNetworkAclResponseBodyNetworkAclAttributeIngressAclEntriesIngressAclEntry setSourceCidrIp(String sourceCidrIp) {
            this.sourceCidrIp = sourceCidrIp;
            return this;
        }
        public String getSourceCidrIp() {
            return this.sourceCidrIp;
        }

        public CreateNetworkAclResponseBodyNetworkAclAttributeIngressAclEntriesIngressAclEntry setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public CreateNetworkAclResponseBodyNetworkAclAttributeIngressAclEntriesIngressAclEntry setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

    }

    public static class CreateNetworkAclResponseBodyNetworkAclAttributeIngressAclEntries extends TeaModel {
        @NameInMap("IngressAclEntry")
        public java.util.List<CreateNetworkAclResponseBodyNetworkAclAttributeIngressAclEntriesIngressAclEntry> ingressAclEntry;

        public static CreateNetworkAclResponseBodyNetworkAclAttributeIngressAclEntries build(java.util.Map<String, ?> map) throws Exception {
            CreateNetworkAclResponseBodyNetworkAclAttributeIngressAclEntries self = new CreateNetworkAclResponseBodyNetworkAclAttributeIngressAclEntries();
            return TeaModel.build(map, self);
        }

        public CreateNetworkAclResponseBodyNetworkAclAttributeIngressAclEntries setIngressAclEntry(java.util.List<CreateNetworkAclResponseBodyNetworkAclAttributeIngressAclEntriesIngressAclEntry> ingressAclEntry) {
            this.ingressAclEntry = ingressAclEntry;
            return this;
        }
        public java.util.List<CreateNetworkAclResponseBodyNetworkAclAttributeIngressAclEntriesIngressAclEntry> getIngressAclEntry() {
            return this.ingressAclEntry;
        }

    }

    public static class CreateNetworkAclResponseBodyNetworkAclAttributeResourcesResource extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("ResourceType")
        public String resourceType;

        @NameInMap("ResourceId")
        public String resourceId;

        public static CreateNetworkAclResponseBodyNetworkAclAttributeResourcesResource build(java.util.Map<String, ?> map) throws Exception {
            CreateNetworkAclResponseBodyNetworkAclAttributeResourcesResource self = new CreateNetworkAclResponseBodyNetworkAclAttributeResourcesResource();
            return TeaModel.build(map, self);
        }

        public CreateNetworkAclResponseBodyNetworkAclAttributeResourcesResource setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public CreateNetworkAclResponseBodyNetworkAclAttributeResourcesResource setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public CreateNetworkAclResponseBodyNetworkAclAttributeResourcesResource setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

    }

    public static class CreateNetworkAclResponseBodyNetworkAclAttributeResources extends TeaModel {
        @NameInMap("Resource")
        public java.util.List<CreateNetworkAclResponseBodyNetworkAclAttributeResourcesResource> resource;

        public static CreateNetworkAclResponseBodyNetworkAclAttributeResources build(java.util.Map<String, ?> map) throws Exception {
            CreateNetworkAclResponseBodyNetworkAclAttributeResources self = new CreateNetworkAclResponseBodyNetworkAclAttributeResources();
            return TeaModel.build(map, self);
        }

        public CreateNetworkAclResponseBodyNetworkAclAttributeResources setResource(java.util.List<CreateNetworkAclResponseBodyNetworkAclAttributeResourcesResource> resource) {
            this.resource = resource;
            return this;
        }
        public java.util.List<CreateNetworkAclResponseBodyNetworkAclAttributeResourcesResource> getResource() {
            return this.resource;
        }

    }

    public static class CreateNetworkAclResponseBodyNetworkAclAttribute extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("VpcId")
        public String vpcId;

        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("Description")
        public String description;

        @NameInMap("EgressAclEntries")
        public CreateNetworkAclResponseBodyNetworkAclAttributeEgressAclEntries egressAclEntries;

        @NameInMap("NetworkAclName")
        public String networkAclName;

        @NameInMap("IngressAclEntries")
        public CreateNetworkAclResponseBodyNetworkAclAttributeIngressAclEntries ingressAclEntries;

        @NameInMap("NetworkAclId")
        public String networkAclId;

        @NameInMap("Resources")
        public CreateNetworkAclResponseBodyNetworkAclAttributeResources resources;

        @NameInMap("RegionId")
        public String regionId;

        public static CreateNetworkAclResponseBodyNetworkAclAttribute build(java.util.Map<String, ?> map) throws Exception {
            CreateNetworkAclResponseBodyNetworkAclAttribute self = new CreateNetworkAclResponseBodyNetworkAclAttribute();
            return TeaModel.build(map, self);
        }

        public CreateNetworkAclResponseBodyNetworkAclAttribute setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public CreateNetworkAclResponseBodyNetworkAclAttribute setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public CreateNetworkAclResponseBodyNetworkAclAttribute setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public CreateNetworkAclResponseBodyNetworkAclAttribute setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateNetworkAclResponseBodyNetworkAclAttribute setEgressAclEntries(CreateNetworkAclResponseBodyNetworkAclAttributeEgressAclEntries egressAclEntries) {
            this.egressAclEntries = egressAclEntries;
            return this;
        }
        public CreateNetworkAclResponseBodyNetworkAclAttributeEgressAclEntries getEgressAclEntries() {
            return this.egressAclEntries;
        }

        public CreateNetworkAclResponseBodyNetworkAclAttribute setNetworkAclName(String networkAclName) {
            this.networkAclName = networkAclName;
            return this;
        }
        public String getNetworkAclName() {
            return this.networkAclName;
        }

        public CreateNetworkAclResponseBodyNetworkAclAttribute setIngressAclEntries(CreateNetworkAclResponseBodyNetworkAclAttributeIngressAclEntries ingressAclEntries) {
            this.ingressAclEntries = ingressAclEntries;
            return this;
        }
        public CreateNetworkAclResponseBodyNetworkAclAttributeIngressAclEntries getIngressAclEntries() {
            return this.ingressAclEntries;
        }

        public CreateNetworkAclResponseBodyNetworkAclAttribute setNetworkAclId(String networkAclId) {
            this.networkAclId = networkAclId;
            return this;
        }
        public String getNetworkAclId() {
            return this.networkAclId;
        }

        public CreateNetworkAclResponseBodyNetworkAclAttribute setResources(CreateNetworkAclResponseBodyNetworkAclAttributeResources resources) {
            this.resources = resources;
            return this;
        }
        public CreateNetworkAclResponseBodyNetworkAclAttributeResources getResources() {
            return this.resources;
        }

        public CreateNetworkAclResponseBodyNetworkAclAttribute setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

}
