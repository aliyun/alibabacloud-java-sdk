// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeNetworkAclsResponseBody extends TeaModel {
    @NameInMap("NetworkAcls")
    public DescribeNetworkAclsResponseBodyNetworkAcls networkAcls;

    @NameInMap("PageNumber")
    public String pageNumber;

    @NameInMap("PageSize")
    public String pageSize;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("Description")
        public String description;

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
        @NameInMap("ResourceId")
        public String resourceId;

        @NameInMap("ResourceType")
        public String resourceType;

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

    public static class DescribeNetworkAclsResponseBodyNetworkAclsNetworkAcl extends TeaModel {
        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("Description")
        public String description;

        @NameInMap("EgressAclEntries")
        public DescribeNetworkAclsResponseBodyNetworkAclsNetworkAclEgressAclEntries egressAclEntries;

        @NameInMap("IngressAclEntries")
        public DescribeNetworkAclsResponseBodyNetworkAclsNetworkAclIngressAclEntries ingressAclEntries;

        @NameInMap("NetworkAclId")
        public String networkAclId;

        @NameInMap("NetworkAclName")
        public String networkAclName;

        @NameInMap("OwnerId")
        public Long ownerId;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("Resources")
        public DescribeNetworkAclsResponseBodyNetworkAclsNetworkAclResources resources;

        @NameInMap("Status")
        public String status;

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
