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

    }

    public static class DescribeNetworkAclsResponseNetworkAclsNetworkAclIngressAclEntries extends TeaModel {
        @NameInMap("IngressAclEntry")
        @Validation(required = true)
        public java.util.List<DescribeNetworkAclsResponseNetworkAclsNetworkAclIngressAclEntriesIngressAclEntry> ingressAclEntry;

        public static DescribeNetworkAclsResponseNetworkAclsNetworkAclIngressAclEntries build(java.util.Map<String, ?> map) throws Exception {
            DescribeNetworkAclsResponseNetworkAclsNetworkAclIngressAclEntries self = new DescribeNetworkAclsResponseNetworkAclsNetworkAclIngressAclEntries();
            return TeaModel.build(map, self);
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

    }

    public static class DescribeNetworkAclsResponseNetworkAclsNetworkAclEgressAclEntries extends TeaModel {
        @NameInMap("EgressAclEntry")
        @Validation(required = true)
        public java.util.List<DescribeNetworkAclsResponseNetworkAclsNetworkAclEgressAclEntriesEgressAclEntry> egressAclEntry;

        public static DescribeNetworkAclsResponseNetworkAclsNetworkAclEgressAclEntries build(java.util.Map<String, ?> map) throws Exception {
            DescribeNetworkAclsResponseNetworkAclsNetworkAclEgressAclEntries self = new DescribeNetworkAclsResponseNetworkAclsNetworkAclEgressAclEntries();
            return TeaModel.build(map, self);
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

    }

    public static class DescribeNetworkAclsResponseNetworkAclsNetworkAclResources extends TeaModel {
        @NameInMap("Resource")
        @Validation(required = true)
        public java.util.List<DescribeNetworkAclsResponseNetworkAclsNetworkAclResourcesResource> resource;

        public static DescribeNetworkAclsResponseNetworkAclsNetworkAclResources build(java.util.Map<String, ?> map) throws Exception {
            DescribeNetworkAclsResponseNetworkAclsNetworkAclResources self = new DescribeNetworkAclsResponseNetworkAclsNetworkAclResources();
            return TeaModel.build(map, self);
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

    }

    public static class DescribeNetworkAclsResponseNetworkAcls extends TeaModel {
        @NameInMap("NetworkAcl")
        @Validation(required = true)
        public java.util.List<DescribeNetworkAclsResponseNetworkAclsNetworkAcl> networkAcl;

        public static DescribeNetworkAclsResponseNetworkAcls build(java.util.Map<String, ?> map) throws Exception {
            DescribeNetworkAclsResponseNetworkAcls self = new DescribeNetworkAclsResponseNetworkAcls();
            return TeaModel.build(map, self);
        }

    }

}
