// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class UpdateNetworkAclEntriesRequest extends TeaModel {
    @NameInMap("UpdateIngressAclEntries")
    public Boolean updateIngressAclEntries;

    @NameInMap("UpdateEgressAclEntries")
    public Boolean updateEgressAclEntries;

    @NameInMap("NetworkAclId")
    public String networkAclId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("IngressAclEntries")
    public java.util.List<UpdateNetworkAclEntriesRequestIngressAclEntries> ingressAclEntries;

    @NameInMap("EgressAclEntries")
    public java.util.List<UpdateNetworkAclEntriesRequestEgressAclEntries> egressAclEntries;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ClientToken")
    public String clientToken;

    public static UpdateNetworkAclEntriesRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateNetworkAclEntriesRequest self = new UpdateNetworkAclEntriesRequest();
        return TeaModel.build(map, self);
    }

    public UpdateNetworkAclEntriesRequest setUpdateIngressAclEntries(Boolean updateIngressAclEntries) {
        this.updateIngressAclEntries = updateIngressAclEntries;
        return this;
    }
    public Boolean getUpdateIngressAclEntries() {
        return this.updateIngressAclEntries;
    }

    public UpdateNetworkAclEntriesRequest setUpdateEgressAclEntries(Boolean updateEgressAclEntries) {
        this.updateEgressAclEntries = updateEgressAclEntries;
        return this;
    }
    public Boolean getUpdateEgressAclEntries() {
        return this.updateEgressAclEntries;
    }

    public UpdateNetworkAclEntriesRequest setNetworkAclId(String networkAclId) {
        this.networkAclId = networkAclId;
        return this;
    }
    public String getNetworkAclId() {
        return this.networkAclId;
    }

    public UpdateNetworkAclEntriesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateNetworkAclEntriesRequest setIngressAclEntries(java.util.List<UpdateNetworkAclEntriesRequestIngressAclEntries> ingressAclEntries) {
        this.ingressAclEntries = ingressAclEntries;
        return this;
    }
    public java.util.List<UpdateNetworkAclEntriesRequestIngressAclEntries> getIngressAclEntries() {
        return this.ingressAclEntries;
    }

    public UpdateNetworkAclEntriesRequest setEgressAclEntries(java.util.List<UpdateNetworkAclEntriesRequestEgressAclEntries> egressAclEntries) {
        this.egressAclEntries = egressAclEntries;
        return this;
    }
    public java.util.List<UpdateNetworkAclEntriesRequestEgressAclEntries> getEgressAclEntries() {
        return this.egressAclEntries;
    }

    public UpdateNetworkAclEntriesRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public UpdateNetworkAclEntriesRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public UpdateNetworkAclEntriesRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public UpdateNetworkAclEntriesRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public static class UpdateNetworkAclEntriesRequestIngressAclEntries extends TeaModel {
        @NameInMap("NetworkAclEntryId")
        public String networkAclEntryId;

        @NameInMap("EntryType")
        public String entryType;

        @NameInMap("Policy")
        public String policy;

        @NameInMap("NetworkAclEntryName")
        public String networkAclEntryName;

        @NameInMap("Description")
        public String description;

        @NameInMap("SourceCidrIp")
        public String sourceCidrIp;

        @NameInMap("Protocol")
        public String protocol;

        @NameInMap("Port")
        public String port;

        public static UpdateNetworkAclEntriesRequestIngressAclEntries build(java.util.Map<String, ?> map) throws Exception {
            UpdateNetworkAclEntriesRequestIngressAclEntries self = new UpdateNetworkAclEntriesRequestIngressAclEntries();
            return TeaModel.build(map, self);
        }

        public UpdateNetworkAclEntriesRequestIngressAclEntries setNetworkAclEntryId(String networkAclEntryId) {
            this.networkAclEntryId = networkAclEntryId;
            return this;
        }
        public String getNetworkAclEntryId() {
            return this.networkAclEntryId;
        }

        public UpdateNetworkAclEntriesRequestIngressAclEntries setEntryType(String entryType) {
            this.entryType = entryType;
            return this;
        }
        public String getEntryType() {
            return this.entryType;
        }

        public UpdateNetworkAclEntriesRequestIngressAclEntries setPolicy(String policy) {
            this.policy = policy;
            return this;
        }
        public String getPolicy() {
            return this.policy;
        }

        public UpdateNetworkAclEntriesRequestIngressAclEntries setNetworkAclEntryName(String networkAclEntryName) {
            this.networkAclEntryName = networkAclEntryName;
            return this;
        }
        public String getNetworkAclEntryName() {
            return this.networkAclEntryName;
        }

        public UpdateNetworkAclEntriesRequestIngressAclEntries setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public UpdateNetworkAclEntriesRequestIngressAclEntries setSourceCidrIp(String sourceCidrIp) {
            this.sourceCidrIp = sourceCidrIp;
            return this;
        }
        public String getSourceCidrIp() {
            return this.sourceCidrIp;
        }

        public UpdateNetworkAclEntriesRequestIngressAclEntries setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public UpdateNetworkAclEntriesRequestIngressAclEntries setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

    }

    public static class UpdateNetworkAclEntriesRequestEgressAclEntries extends TeaModel {
        @NameInMap("NetworkAclEntryId")
        public String networkAclEntryId;

        @NameInMap("EntryType")
        public String entryType;

        @NameInMap("Policy")
        public String policy;

        @NameInMap("NetworkAclEntryName")
        public String networkAclEntryName;

        @NameInMap("Description")
        public String description;

        @NameInMap("Protocol")
        public String protocol;

        @NameInMap("DestinationCidrIp")
        public String destinationCidrIp;

        @NameInMap("Port")
        public String port;

        public static UpdateNetworkAclEntriesRequestEgressAclEntries build(java.util.Map<String, ?> map) throws Exception {
            UpdateNetworkAclEntriesRequestEgressAclEntries self = new UpdateNetworkAclEntriesRequestEgressAclEntries();
            return TeaModel.build(map, self);
        }

        public UpdateNetworkAclEntriesRequestEgressAclEntries setNetworkAclEntryId(String networkAclEntryId) {
            this.networkAclEntryId = networkAclEntryId;
            return this;
        }
        public String getNetworkAclEntryId() {
            return this.networkAclEntryId;
        }

        public UpdateNetworkAclEntriesRequestEgressAclEntries setEntryType(String entryType) {
            this.entryType = entryType;
            return this;
        }
        public String getEntryType() {
            return this.entryType;
        }

        public UpdateNetworkAclEntriesRequestEgressAclEntries setPolicy(String policy) {
            this.policy = policy;
            return this;
        }
        public String getPolicy() {
            return this.policy;
        }

        public UpdateNetworkAclEntriesRequestEgressAclEntries setNetworkAclEntryName(String networkAclEntryName) {
            this.networkAclEntryName = networkAclEntryName;
            return this;
        }
        public String getNetworkAclEntryName() {
            return this.networkAclEntryName;
        }

        public UpdateNetworkAclEntriesRequestEgressAclEntries setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public UpdateNetworkAclEntriesRequestEgressAclEntries setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public UpdateNetworkAclEntriesRequestEgressAclEntries setDestinationCidrIp(String destinationCidrIp) {
            this.destinationCidrIp = destinationCidrIp;
            return this;
        }
        public String getDestinationCidrIp() {
            return this.destinationCidrIp;
        }

        public UpdateNetworkAclEntriesRequestEgressAclEntries setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

    }

}
