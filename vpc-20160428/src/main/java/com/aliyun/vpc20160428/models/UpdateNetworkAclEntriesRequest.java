// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class UpdateNetworkAclEntriesRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("EgressAclEntries")
    public java.util.List<UpdateNetworkAclEntriesRequestEgressAclEntries> egressAclEntries;

    @NameInMap("IngressAclEntries")
    public java.util.List<UpdateNetworkAclEntriesRequestIngressAclEntries> ingressAclEntries;

    @NameInMap("NetworkAclId")
    public String networkAclId;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("UpdateEgressAclEntries")
    public Boolean updateEgressAclEntries;

    @NameInMap("UpdateIngressAclEntries")
    public Boolean updateIngressAclEntries;

    public static UpdateNetworkAclEntriesRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateNetworkAclEntriesRequest self = new UpdateNetworkAclEntriesRequest();
        return TeaModel.build(map, self);
    }

    public UpdateNetworkAclEntriesRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateNetworkAclEntriesRequest setEgressAclEntries(java.util.List<UpdateNetworkAclEntriesRequestEgressAclEntries> egressAclEntries) {
        this.egressAclEntries = egressAclEntries;
        return this;
    }
    public java.util.List<UpdateNetworkAclEntriesRequestEgressAclEntries> getEgressAclEntries() {
        return this.egressAclEntries;
    }

    public UpdateNetworkAclEntriesRequest setIngressAclEntries(java.util.List<UpdateNetworkAclEntriesRequestIngressAclEntries> ingressAclEntries) {
        this.ingressAclEntries = ingressAclEntries;
        return this;
    }
    public java.util.List<UpdateNetworkAclEntriesRequestIngressAclEntries> getIngressAclEntries() {
        return this.ingressAclEntries;
    }

    public UpdateNetworkAclEntriesRequest setNetworkAclId(String networkAclId) {
        this.networkAclId = networkAclId;
        return this;
    }
    public String getNetworkAclId() {
        return this.networkAclId;
    }

    public UpdateNetworkAclEntriesRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public UpdateNetworkAclEntriesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
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

    public UpdateNetworkAclEntriesRequest setUpdateEgressAclEntries(Boolean updateEgressAclEntries) {
        this.updateEgressAclEntries = updateEgressAclEntries;
        return this;
    }
    public Boolean getUpdateEgressAclEntries() {
        return this.updateEgressAclEntries;
    }

    public UpdateNetworkAclEntriesRequest setUpdateIngressAclEntries(Boolean updateIngressAclEntries) {
        this.updateIngressAclEntries = updateIngressAclEntries;
        return this;
    }
    public Boolean getUpdateIngressAclEntries() {
        return this.updateIngressAclEntries;
    }

    public static class UpdateNetworkAclEntriesRequestEgressAclEntries extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("DestinationCidrIp")
        public String destinationCidrIp;

        @NameInMap("EntryType")
        public String entryType;

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

        public static UpdateNetworkAclEntriesRequestEgressAclEntries build(java.util.Map<String, ?> map) throws Exception {
            UpdateNetworkAclEntriesRequestEgressAclEntries self = new UpdateNetworkAclEntriesRequestEgressAclEntries();
            return TeaModel.build(map, self);
        }

        public UpdateNetworkAclEntriesRequestEgressAclEntries setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public UpdateNetworkAclEntriesRequestEgressAclEntries setDestinationCidrIp(String destinationCidrIp) {
            this.destinationCidrIp = destinationCidrIp;
            return this;
        }
        public String getDestinationCidrIp() {
            return this.destinationCidrIp;
        }

        public UpdateNetworkAclEntriesRequestEgressAclEntries setEntryType(String entryType) {
            this.entryType = entryType;
            return this;
        }
        public String getEntryType() {
            return this.entryType;
        }

        public UpdateNetworkAclEntriesRequestEgressAclEntries setNetworkAclEntryId(String networkAclEntryId) {
            this.networkAclEntryId = networkAclEntryId;
            return this;
        }
        public String getNetworkAclEntryId() {
            return this.networkAclEntryId;
        }

        public UpdateNetworkAclEntriesRequestEgressAclEntries setNetworkAclEntryName(String networkAclEntryName) {
            this.networkAclEntryName = networkAclEntryName;
            return this;
        }
        public String getNetworkAclEntryName() {
            return this.networkAclEntryName;
        }

        public UpdateNetworkAclEntriesRequestEgressAclEntries setPolicy(String policy) {
            this.policy = policy;
            return this;
        }
        public String getPolicy() {
            return this.policy;
        }

        public UpdateNetworkAclEntriesRequestEgressAclEntries setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public UpdateNetworkAclEntriesRequestEgressAclEntries setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

    }

    public static class UpdateNetworkAclEntriesRequestIngressAclEntries extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("EntryType")
        public String entryType;

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

        public static UpdateNetworkAclEntriesRequestIngressAclEntries build(java.util.Map<String, ?> map) throws Exception {
            UpdateNetworkAclEntriesRequestIngressAclEntries self = new UpdateNetworkAclEntriesRequestIngressAclEntries();
            return TeaModel.build(map, self);
        }

        public UpdateNetworkAclEntriesRequestIngressAclEntries setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public UpdateNetworkAclEntriesRequestIngressAclEntries setEntryType(String entryType) {
            this.entryType = entryType;
            return this;
        }
        public String getEntryType() {
            return this.entryType;
        }

        public UpdateNetworkAclEntriesRequestIngressAclEntries setNetworkAclEntryId(String networkAclEntryId) {
            this.networkAclEntryId = networkAclEntryId;
            return this;
        }
        public String getNetworkAclEntryId() {
            return this.networkAclEntryId;
        }

        public UpdateNetworkAclEntriesRequestIngressAclEntries setNetworkAclEntryName(String networkAclEntryName) {
            this.networkAclEntryName = networkAclEntryName;
            return this;
        }
        public String getNetworkAclEntryName() {
            return this.networkAclEntryName;
        }

        public UpdateNetworkAclEntriesRequestIngressAclEntries setPolicy(String policy) {
            this.policy = policy;
            return this;
        }
        public String getPolicy() {
            return this.policy;
        }

        public UpdateNetworkAclEntriesRequestIngressAclEntries setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public UpdateNetworkAclEntriesRequestIngressAclEntries setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public UpdateNetworkAclEntriesRequestIngressAclEntries setSourceCidrIp(String sourceCidrIp) {
            this.sourceCidrIp = sourceCidrIp;
            return this;
        }
        public String getSourceCidrIp() {
            return this.sourceCidrIp;
        }

    }

}
