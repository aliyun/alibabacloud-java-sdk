// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateNetworkAclResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("NetworkAclId")
    @Validation(required = true)
    public String networkAclId;

    @NameInMap("NetworkAclAttribute")
    @Validation(required = true)
    public CreateNetworkAclResponseNetworkAclAttribute networkAclAttribute;

    public static CreateNetworkAclResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateNetworkAclResponse self = new CreateNetworkAclResponse();
        return TeaModel.build(map, self);
    }

    public static class CreateNetworkAclResponseNetworkAclAttributeIngressAclEntriesIngressAclEntry extends TeaModel {
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

        public static CreateNetworkAclResponseNetworkAclAttributeIngressAclEntriesIngressAclEntry build(java.util.Map<String, ?> map) throws Exception {
            CreateNetworkAclResponseNetworkAclAttributeIngressAclEntriesIngressAclEntry self = new CreateNetworkAclResponseNetworkAclAttributeIngressAclEntriesIngressAclEntry();
            return TeaModel.build(map, self);
        }

    }

    public static class CreateNetworkAclResponseNetworkAclAttributeIngressAclEntries extends TeaModel {
        @NameInMap("IngressAclEntry")
        @Validation(required = true)
        public java.util.List<CreateNetworkAclResponseNetworkAclAttributeIngressAclEntriesIngressAclEntry> ingressAclEntry;

        public static CreateNetworkAclResponseNetworkAclAttributeIngressAclEntries build(java.util.Map<String, ?> map) throws Exception {
            CreateNetworkAclResponseNetworkAclAttributeIngressAclEntries self = new CreateNetworkAclResponseNetworkAclAttributeIngressAclEntries();
            return TeaModel.build(map, self);
        }

    }

    public static class CreateNetworkAclResponseNetworkAclAttributeEgressAclEntriesEgressAclEntry extends TeaModel {
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

        public static CreateNetworkAclResponseNetworkAclAttributeEgressAclEntriesEgressAclEntry build(java.util.Map<String, ?> map) throws Exception {
            CreateNetworkAclResponseNetworkAclAttributeEgressAclEntriesEgressAclEntry self = new CreateNetworkAclResponseNetworkAclAttributeEgressAclEntriesEgressAclEntry();
            return TeaModel.build(map, self);
        }

    }

    public static class CreateNetworkAclResponseNetworkAclAttributeEgressAclEntries extends TeaModel {
        @NameInMap("EgressAclEntry")
        @Validation(required = true)
        public java.util.List<CreateNetworkAclResponseNetworkAclAttributeEgressAclEntriesEgressAclEntry> egressAclEntry;

        public static CreateNetworkAclResponseNetworkAclAttributeEgressAclEntries build(java.util.Map<String, ?> map) throws Exception {
            CreateNetworkAclResponseNetworkAclAttributeEgressAclEntries self = new CreateNetworkAclResponseNetworkAclAttributeEgressAclEntries();
            return TeaModel.build(map, self);
        }

    }

    public static class CreateNetworkAclResponseNetworkAclAttributeResourcesResource extends TeaModel {
        @NameInMap("ResourceId")
        @Validation(required = true)
        public String resourceId;

        @NameInMap("ResourceType")
        @Validation(required = true)
        public String resourceType;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        public static CreateNetworkAclResponseNetworkAclAttributeResourcesResource build(java.util.Map<String, ?> map) throws Exception {
            CreateNetworkAclResponseNetworkAclAttributeResourcesResource self = new CreateNetworkAclResponseNetworkAclAttributeResourcesResource();
            return TeaModel.build(map, self);
        }

    }

    public static class CreateNetworkAclResponseNetworkAclAttributeResources extends TeaModel {
        @NameInMap("Resource")
        @Validation(required = true)
        public java.util.List<CreateNetworkAclResponseNetworkAclAttributeResourcesResource> resource;

        public static CreateNetworkAclResponseNetworkAclAttributeResources build(java.util.Map<String, ?> map) throws Exception {
            CreateNetworkAclResponseNetworkAclAttributeResources self = new CreateNetworkAclResponseNetworkAclAttributeResources();
            return TeaModel.build(map, self);
        }

    }

    public static class CreateNetworkAclResponseNetworkAclAttribute extends TeaModel {
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

        @NameInMap("IngressAclEntries")
        @Validation(required = true)
        public CreateNetworkAclResponseNetworkAclAttributeIngressAclEntries ingressAclEntries;

        @NameInMap("EgressAclEntries")
        @Validation(required = true)
        public CreateNetworkAclResponseNetworkAclAttributeEgressAclEntries egressAclEntries;

        @NameInMap("Resources")
        @Validation(required = true)
        public CreateNetworkAclResponseNetworkAclAttributeResources resources;

        public static CreateNetworkAclResponseNetworkAclAttribute build(java.util.Map<String, ?> map) throws Exception {
            CreateNetworkAclResponseNetworkAclAttribute self = new CreateNetworkAclResponseNetworkAclAttribute();
            return TeaModel.build(map, self);
        }

    }

}
