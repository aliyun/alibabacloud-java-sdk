// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class UpdateNetworkAclEntriesRequest extends TeaModel {
    @NameInMap("IngressAclEntries")
    public java.util.List<UpdateNetworkAclEntriesRequestIngressAclEntries> ingressAclEntries;

    @NameInMap("EgressAclEntries")
    public java.util.List<UpdateNetworkAclEntriesRequestEgressAclEntries> egressAclEntries;

    @NameInMap("UpdateIngressAclEntries")
    public Boolean updateIngressAclEntries;

    @NameInMap("UpdateEgressAclEntries")
    public Boolean updateEgressAclEntries;

    @NameInMap("NetworkAclId")
    @Validation(required = true)
    public String networkAclId;

    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("ClientToken")
    public String clientToken;

    public static UpdateNetworkAclEntriesRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateNetworkAclEntriesRequest self = new UpdateNetworkAclEntriesRequest();
        return TeaModel.build(map, self);
    }

    public static class UpdateNetworkAclEntriesRequestIngressAclEntries extends TeaModel {
        @NameInMap("NetworkAclEntryName")
        @Validation(required = true)
        public String networkAclEntryName;

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

        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        public static UpdateNetworkAclEntriesRequestIngressAclEntries build(java.util.Map<String, ?> map) throws Exception {
            UpdateNetworkAclEntriesRequestIngressAclEntries self = new UpdateNetworkAclEntriesRequestIngressAclEntries();
            return TeaModel.build(map, self);
        }

    }

    public static class UpdateNetworkAclEntriesRequestEgressAclEntries extends TeaModel {
        @NameInMap("NetworkAclEntryName")
        @Validation(required = true)
        public String networkAclEntryName;

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

        public static UpdateNetworkAclEntriesRequestEgressAclEntries build(java.util.Map<String, ?> map) throws Exception {
            UpdateNetworkAclEntriesRequestEgressAclEntries self = new UpdateNetworkAclEntriesRequestEgressAclEntries();
            return TeaModel.build(map, self);
        }

    }

}
