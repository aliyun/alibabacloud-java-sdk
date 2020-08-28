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

    }

    public static class DescribeNetworkAclAttributesResponseNetworkAclAttributeIngressAclEntries extends TeaModel {
        @NameInMap("IngressAclEntry")
        @Validation(required = true)
        public java.util.List<DescribeNetworkAclAttributesResponseNetworkAclAttributeIngressAclEntriesIngressAclEntry> ingressAclEntry;

        public static DescribeNetworkAclAttributesResponseNetworkAclAttributeIngressAclEntries build(java.util.Map<String, ?> map) throws Exception {
            DescribeNetworkAclAttributesResponseNetworkAclAttributeIngressAclEntries self = new DescribeNetworkAclAttributesResponseNetworkAclAttributeIngressAclEntries();
            return TeaModel.build(map, self);
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

    }

    public static class DescribeNetworkAclAttributesResponseNetworkAclAttributeEgressAclEntries extends TeaModel {
        @NameInMap("EgressAclEntry")
        @Validation(required = true)
        public java.util.List<DescribeNetworkAclAttributesResponseNetworkAclAttributeEgressAclEntriesEgressAclEntry> egressAclEntry;

        public static DescribeNetworkAclAttributesResponseNetworkAclAttributeEgressAclEntries build(java.util.Map<String, ?> map) throws Exception {
            DescribeNetworkAclAttributesResponseNetworkAclAttributeEgressAclEntries self = new DescribeNetworkAclAttributesResponseNetworkAclAttributeEgressAclEntries();
            return TeaModel.build(map, self);
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

    }

    public static class DescribeNetworkAclAttributesResponseNetworkAclAttributeResources extends TeaModel {
        @NameInMap("Resource")
        @Validation(required = true)
        public java.util.List<DescribeNetworkAclAttributesResponseNetworkAclAttributeResourcesResource> resource;

        public static DescribeNetworkAclAttributesResponseNetworkAclAttributeResources build(java.util.Map<String, ?> map) throws Exception {
            DescribeNetworkAclAttributesResponseNetworkAclAttributeResources self = new DescribeNetworkAclAttributesResponseNetworkAclAttributeResources();
            return TeaModel.build(map, self);
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

    }

}
