// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeNetworkAclsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public String totalCount;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public String pageNumber;

    @NameInMap("PageSize")
    @Validation(required = true)
    public String pageSize;

    @NameInMap("NetworkAcls")
    @Validation(required = true)
    public DescribeNetworkAclsResponseNetworkAcls networkAcls;

    public static DescribeNetworkAclsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeNetworkAclsResponse self = new DescribeNetworkAclsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeNetworkAclsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeNetworkAclsResponse setTotalCount(String totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public String getTotalCount() {
        return this.totalCount;
    }

    public DescribeNetworkAclsResponse setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public String getPageNumber() {
        return this.pageNumber;
    }

    public DescribeNetworkAclsResponse setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public DescribeNetworkAclsResponse setNetworkAcls(DescribeNetworkAclsResponseNetworkAcls networkAcls) {
        this.networkAcls = networkAcls;
        return this;
    }
    public DescribeNetworkAclsResponseNetworkAcls getNetworkAcls() {
        return this.networkAcls;
    }

    public static class DescribeNetworkAclsResponseNetworkAclsNetworkAclIngressAclEntriesIngressAclEntry extends TeaModel {
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

        public static DescribeNetworkAclsResponseNetworkAclsNetworkAclIngressAclEntriesIngressAclEntry build(java.util.Map<String, ?> map) throws Exception {
            DescribeNetworkAclsResponseNetworkAclsNetworkAclIngressAclEntriesIngressAclEntry self = new DescribeNetworkAclsResponseNetworkAclsNetworkAclIngressAclEntriesIngressAclEntry();
            return TeaModel.build(map, self);
        }

        public DescribeNetworkAclsResponseNetworkAclsNetworkAclIngressAclEntriesIngressAclEntry setNetworkAclEntryId(String networkAclEntryId) {
            this.networkAclEntryId = networkAclEntryId;
            return this;
        }
        public String getNetworkAclEntryId() {
            return this.networkAclEntryId;
        }

        public DescribeNetworkAclsResponseNetworkAclsNetworkAclIngressAclEntriesIngressAclEntry setPolicy(String policy) {
            this.policy = policy;
            return this;
        }
        public String getPolicy() {
            return this.policy;
        }

        public DescribeNetworkAclsResponseNetworkAclsNetworkAclIngressAclEntriesIngressAclEntry setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public DescribeNetworkAclsResponseNetworkAclsNetworkAclIngressAclEntriesIngressAclEntry setSourceCidrIp(String sourceCidrIp) {
            this.sourceCidrIp = sourceCidrIp;
            return this;
        }
        public String getSourceCidrIp() {
            return this.sourceCidrIp;
        }

        public DescribeNetworkAclsResponseNetworkAclsNetworkAclIngressAclEntriesIngressAclEntry setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public DescribeNetworkAclsResponseNetworkAclsNetworkAclIngressAclEntriesIngressAclEntry setEntryType(String entryType) {
            this.entryType = entryType;
            return this;
        }
        public String getEntryType() {
            return this.entryType;
        }

        public DescribeNetworkAclsResponseNetworkAclsNetworkAclIngressAclEntriesIngressAclEntry setNetworkAclEntryName(String networkAclEntryName) {
            this.networkAclEntryName = networkAclEntryName;
            return this;
        }
        public String getNetworkAclEntryName() {
            return this.networkAclEntryName;
        }

        public DescribeNetworkAclsResponseNetworkAclsNetworkAclIngressAclEntriesIngressAclEntry setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

    }

    public static class DescribeNetworkAclsResponseNetworkAclsNetworkAclIngressAclEntries extends TeaModel {
        @NameInMap("IngressAclEntry")
        @Validation(required = true)
        public java.util.List<DescribeNetworkAclsResponseNetworkAclsNetworkAclIngressAclEntriesIngressAclEntry> ingressAclEntry;

        public static DescribeNetworkAclsResponseNetworkAclsNetworkAclIngressAclEntries build(java.util.Map<String, ?> map) throws Exception {
            DescribeNetworkAclsResponseNetworkAclsNetworkAclIngressAclEntries self = new DescribeNetworkAclsResponseNetworkAclsNetworkAclIngressAclEntries();
            return TeaModel.build(map, self);
        }

        public DescribeNetworkAclsResponseNetworkAclsNetworkAclIngressAclEntries setIngressAclEntry(java.util.List<DescribeNetworkAclsResponseNetworkAclsNetworkAclIngressAclEntriesIngressAclEntry> ingressAclEntry) {
            this.ingressAclEntry = ingressAclEntry;
            return this;
        }
        public java.util.List<DescribeNetworkAclsResponseNetworkAclsNetworkAclIngressAclEntriesIngressAclEntry> getIngressAclEntry() {
            return this.ingressAclEntry;
        }

    }

    public static class DescribeNetworkAclsResponseNetworkAclsNetworkAclEgressAclEntriesEgressAclEntry extends TeaModel {
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

        public static DescribeNetworkAclsResponseNetworkAclsNetworkAclEgressAclEntriesEgressAclEntry build(java.util.Map<String, ?> map) throws Exception {
            DescribeNetworkAclsResponseNetworkAclsNetworkAclEgressAclEntriesEgressAclEntry self = new DescribeNetworkAclsResponseNetworkAclsNetworkAclEgressAclEntriesEgressAclEntry();
            return TeaModel.build(map, self);
        }

        public DescribeNetworkAclsResponseNetworkAclsNetworkAclEgressAclEntriesEgressAclEntry setNetworkAclEntryId(String networkAclEntryId) {
            this.networkAclEntryId = networkAclEntryId;
            return this;
        }
        public String getNetworkAclEntryId() {
            return this.networkAclEntryId;
        }

        public DescribeNetworkAclsResponseNetworkAclsNetworkAclEgressAclEntriesEgressAclEntry setPolicy(String policy) {
            this.policy = policy;
            return this;
        }
        public String getPolicy() {
            return this.policy;
        }

        public DescribeNetworkAclsResponseNetworkAclsNetworkAclEgressAclEntriesEgressAclEntry setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public DescribeNetworkAclsResponseNetworkAclsNetworkAclEgressAclEntriesEgressAclEntry setDestinationCidrIp(String destinationCidrIp) {
            this.destinationCidrIp = destinationCidrIp;
            return this;
        }
        public String getDestinationCidrIp() {
            return this.destinationCidrIp;
        }

        public DescribeNetworkAclsResponseNetworkAclsNetworkAclEgressAclEntriesEgressAclEntry setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public DescribeNetworkAclsResponseNetworkAclsNetworkAclEgressAclEntriesEgressAclEntry setEntryType(String entryType) {
            this.entryType = entryType;
            return this;
        }
        public String getEntryType() {
            return this.entryType;
        }

        public DescribeNetworkAclsResponseNetworkAclsNetworkAclEgressAclEntriesEgressAclEntry setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeNetworkAclsResponseNetworkAclsNetworkAclEgressAclEntriesEgressAclEntry setNetworkAclEntryName(String networkAclEntryName) {
            this.networkAclEntryName = networkAclEntryName;
            return this;
        }
        public String getNetworkAclEntryName() {
            return this.networkAclEntryName;
        }

    }

    public static class DescribeNetworkAclsResponseNetworkAclsNetworkAclEgressAclEntries extends TeaModel {
        @NameInMap("EgressAclEntry")
        @Validation(required = true)
        public java.util.List<DescribeNetworkAclsResponseNetworkAclsNetworkAclEgressAclEntriesEgressAclEntry> egressAclEntry;

        public static DescribeNetworkAclsResponseNetworkAclsNetworkAclEgressAclEntries build(java.util.Map<String, ?> map) throws Exception {
            DescribeNetworkAclsResponseNetworkAclsNetworkAclEgressAclEntries self = new DescribeNetworkAclsResponseNetworkAclsNetworkAclEgressAclEntries();
            return TeaModel.build(map, self);
        }

        public DescribeNetworkAclsResponseNetworkAclsNetworkAclEgressAclEntries setEgressAclEntry(java.util.List<DescribeNetworkAclsResponseNetworkAclsNetworkAclEgressAclEntriesEgressAclEntry> egressAclEntry) {
            this.egressAclEntry = egressAclEntry;
            return this;
        }
        public java.util.List<DescribeNetworkAclsResponseNetworkAclsNetworkAclEgressAclEntriesEgressAclEntry> getEgressAclEntry() {
            return this.egressAclEntry;
        }

    }

    public static class DescribeNetworkAclsResponseNetworkAclsNetworkAclResourcesResource extends TeaModel {
        @NameInMap("ResourceId")
        @Validation(required = true)
        public String resourceId;

        @NameInMap("ResourceType")
        @Validation(required = true)
        public String resourceType;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        public static DescribeNetworkAclsResponseNetworkAclsNetworkAclResourcesResource build(java.util.Map<String, ?> map) throws Exception {
            DescribeNetworkAclsResponseNetworkAclsNetworkAclResourcesResource self = new DescribeNetworkAclsResponseNetworkAclsNetworkAclResourcesResource();
            return TeaModel.build(map, self);
        }

        public DescribeNetworkAclsResponseNetworkAclsNetworkAclResourcesResource setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public DescribeNetworkAclsResponseNetworkAclsNetworkAclResourcesResource setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public DescribeNetworkAclsResponseNetworkAclsNetworkAclResourcesResource setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeNetworkAclsResponseNetworkAclsNetworkAclResources extends TeaModel {
        @NameInMap("Resource")
        @Validation(required = true)
        public java.util.List<DescribeNetworkAclsResponseNetworkAclsNetworkAclResourcesResource> resource;

        public static DescribeNetworkAclsResponseNetworkAclsNetworkAclResources build(java.util.Map<String, ?> map) throws Exception {
            DescribeNetworkAclsResponseNetworkAclsNetworkAclResources self = new DescribeNetworkAclsResponseNetworkAclsNetworkAclResources();
            return TeaModel.build(map, self);
        }

        public DescribeNetworkAclsResponseNetworkAclsNetworkAclResources setResource(java.util.List<DescribeNetworkAclsResponseNetworkAclsNetworkAclResourcesResource> resource) {
            this.resource = resource;
            return this;
        }
        public java.util.List<DescribeNetworkAclsResponseNetworkAclsNetworkAclResourcesResource> getResource() {
            return this.resource;
        }

    }

    public static class DescribeNetworkAclsResponseNetworkAclsNetworkAcl extends TeaModel {
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
        public DescribeNetworkAclsResponseNetworkAclsNetworkAclIngressAclEntries ingressAclEntries;

        @NameInMap("EgressAclEntries")
        @Validation(required = true)
        public DescribeNetworkAclsResponseNetworkAclsNetworkAclEgressAclEntries egressAclEntries;

        @NameInMap("Resources")
        @Validation(required = true)
        public DescribeNetworkAclsResponseNetworkAclsNetworkAclResources resources;

        public static DescribeNetworkAclsResponseNetworkAclsNetworkAcl build(java.util.Map<String, ?> map) throws Exception {
            DescribeNetworkAclsResponseNetworkAclsNetworkAcl self = new DescribeNetworkAclsResponseNetworkAclsNetworkAcl();
            return TeaModel.build(map, self);
        }

        public DescribeNetworkAclsResponseNetworkAclsNetworkAcl setNetworkAclId(String networkAclId) {
            this.networkAclId = networkAclId;
            return this;
        }
        public String getNetworkAclId() {
            return this.networkAclId;
        }

        public DescribeNetworkAclsResponseNetworkAclsNetworkAcl setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeNetworkAclsResponseNetworkAclsNetworkAcl setNetworkAclName(String networkAclName) {
            this.networkAclName = networkAclName;
            return this;
        }
        public String getNetworkAclName() {
            return this.networkAclName;
        }

        public DescribeNetworkAclsResponseNetworkAclsNetworkAcl setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeNetworkAclsResponseNetworkAclsNetworkAcl setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public DescribeNetworkAclsResponseNetworkAclsNetworkAcl setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeNetworkAclsResponseNetworkAclsNetworkAcl setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeNetworkAclsResponseNetworkAclsNetworkAcl setOwnerId(Long ownerId) {
            this.ownerId = ownerId;
            return this;
        }
        public Long getOwnerId() {
            return this.ownerId;
        }

        public DescribeNetworkAclsResponseNetworkAclsNetworkAcl setIngressAclEntries(DescribeNetworkAclsResponseNetworkAclsNetworkAclIngressAclEntries ingressAclEntries) {
            this.ingressAclEntries = ingressAclEntries;
            return this;
        }
        public DescribeNetworkAclsResponseNetworkAclsNetworkAclIngressAclEntries getIngressAclEntries() {
            return this.ingressAclEntries;
        }

        public DescribeNetworkAclsResponseNetworkAclsNetworkAcl setEgressAclEntries(DescribeNetworkAclsResponseNetworkAclsNetworkAclEgressAclEntries egressAclEntries) {
            this.egressAclEntries = egressAclEntries;
            return this;
        }
        public DescribeNetworkAclsResponseNetworkAclsNetworkAclEgressAclEntries getEgressAclEntries() {
            return this.egressAclEntries;
        }

        public DescribeNetworkAclsResponseNetworkAclsNetworkAcl setResources(DescribeNetworkAclsResponseNetworkAclsNetworkAclResources resources) {
            this.resources = resources;
            return this;
        }
        public DescribeNetworkAclsResponseNetworkAclsNetworkAclResources getResources() {
            return this.resources;
        }

    }

    public static class DescribeNetworkAclsResponseNetworkAcls extends TeaModel {
        @NameInMap("NetworkAcl")
        @Validation(required = true)
        public java.util.List<DescribeNetworkAclsResponseNetworkAclsNetworkAcl> networkAcl;

        public static DescribeNetworkAclsResponseNetworkAcls build(java.util.Map<String, ?> map) throws Exception {
            DescribeNetworkAclsResponseNetworkAcls self = new DescribeNetworkAclsResponseNetworkAcls();
            return TeaModel.build(map, self);
        }

        public DescribeNetworkAclsResponseNetworkAcls setNetworkAcl(java.util.List<DescribeNetworkAclsResponseNetworkAclsNetworkAcl> networkAcl) {
            this.networkAcl = networkAcl;
            return this;
        }
        public java.util.List<DescribeNetworkAclsResponseNetworkAclsNetworkAcl> getNetworkAcl() {
            return this.networkAcl;
        }

    }

}
