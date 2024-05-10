// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class UpdateNetworkAclEntriesRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <br>
     * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters.</p>
     * <br>
     * <p>>  If you do not specify this parameter, the system automatically uses the **request ID** as the **client token**. The **request ID** may be different for each request.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to perform only a dry run, without performing the actual request. Valid values:</p>
     * <br>
     * <p>*   **true**: performs a dry run. The system checks the request for potential issues, including the AccessKey pair, the permissions of the RAM user, and the required parameters. If the request fails the dry run, an error message is returned. If the request passes the dry run, the `DryRunOperation` error code is returned.</p>
     * <p>*   **false** (default): performs a dry run and performs the actual request. If the request passes the dry run, a 2xx HTTP status code is returned and the operation is performed.</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The information about the outbound rules.</p>
     */
    @NameInMap("EgressAclEntries")
    public java.util.List<UpdateNetworkAclEntriesRequestEgressAclEntries> egressAclEntries;

    /**
     * <p>The information about the inbound rule.</p>
     */
    @NameInMap("IngressAclEntries")
    public java.util.List<UpdateNetworkAclEntriesRequestIngressAclEntries> ingressAclEntries;

    /**
     * <p>The ID of the network ACL.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("NetworkAclId")
    public String networkAclId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID of the network ACL.</p>
     * <br>
     * <p>You can call the [DescribeRegions](https://help.aliyun.com/document_detail/36063.html) operation to query the most recent region list.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>Specifies whether to update outbound rules. Valid values:</p>
     * <br>
     * <p>*   **true**</p>
     * <p>*   **false** (default)</p>
     * <br>
     * <p>>  This parameter cannot be used to add outbound rules to ACLs. If you want to add more outbound rules to ACLs, specify both the existing rule and the rule that you want to add when you call this API operation. If you specify only the rule that you want to add, it overwrites the existing rule.</p>
     */
    @NameInMap("UpdateEgressAclEntries")
    public Boolean updateEgressAclEntries;

    /**
     * <p>Specifies whether to update inbound rules. Valid values:</p>
     * <br>
     * <p>*   **true**</p>
     * <p>*   **false** (default)</p>
     * <br>
     * <p>>  This parameter cannot be used to add inbound rules to ACLs. If you want to add more inbound rules to ACLs, you must specify both the existing rule and the rule that you want to add when you call this API operation. If you specify only the rule that you want to add, it overwrites the existing rule.</p>
     */
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

    public UpdateNetworkAclEntriesRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
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

    public UpdateNetworkAclEntriesRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
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
        /**
         * <p>The description of the outbound rule.</p>
         * <br>
         * <p>The description must be 1 to 256 characters in length, and cannot start with `http://` or `https://`.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The destination CIDR block.</p>
         */
        @NameInMap("DestinationCidrIp")
        public String destinationCidrIp;

        /**
         * <p>The type of the rule. Set the value to **custom**, which specifies custom rules.</p>
         */
        @NameInMap("EntryType")
        public String entryType;

        /**
         * <p>The IP version. Valid values:</p>
         * <br>
         * <p>*   **IPv4** (default)</p>
         * <p>*   **IPv6**</p>
         */
        @NameInMap("IpVersion")
        public String ipVersion;

        /**
         * <p>The ID of the outbound rule.</p>
         * <br>
         * <p>Valid values of **N**: **0** to **99**. You can specify at most 100 outbound rules.</p>
         */
        @NameInMap("NetworkAclEntryId")
        public String networkAclEntryId;

        /**
         * <p>The name of the outbound rule.</p>
         * <br>
         * <p>The name must be 1 to 128 characters in length and cannot start with `http://` or `https://`.</p>
         */
        @NameInMap("NetworkAclEntryName")
        public String networkAclEntryName;

        /**
         * <p>The action to be performed on network traffic that matches the rule. Valid values:</p>
         * <br>
         * <p>*   **accept**</p>
         * <p>*   **drop**</p>
         */
        @NameInMap("Policy")
        public String policy;

        /**
         * <p>The destination port range of the outbound traffic.</p>
         * <br>
         * <p>*   If the **protocol** of the outbound rule is set to **all**, **icmp**, or **gre**, the port range is -1/-1, which specified all ports.</p>
         * <p>*   If the **protocol** of the outbound rule is set to **tcp** or **udp**, set the port range in the following format: **1/200** or **80/80**, which specifies port 1 to port 200 or port 80. Valid values for a port: **1** to **65535**.</p>
         */
        @NameInMap("Port")
        public String port;

        /**
         * <p>The protocol. Valid values:</p>
         * <br>
         * <p>*   **icmp**</p>
         * <p>*   **gre**</p>
         * <p>*   **tcp**</p>
         * <p>*   **udp**</p>
         * <p>*   **all**</p>
         */
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

        public UpdateNetworkAclEntriesRequestEgressAclEntries setIpVersion(String ipVersion) {
            this.ipVersion = ipVersion;
            return this;
        }
        public String getIpVersion() {
            return this.ipVersion;
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
        /**
         * <p>The description of the inbound rule.</p>
         * <br>
         * <p>The description must be 1 to 256 characters in length, and cannot start with `http://` or `https://`.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The type of the rule. Set the value to **custom**, which specifies custom rules.</p>
         */
        @NameInMap("EntryType")
        public String entryType;

        /**
         * <p>The IP version. Valid values:</p>
         * <br>
         * <p>*   **IPv4** (default)</p>
         * <p>*   **IPv6**</p>
         */
        @NameInMap("IpVersion")
        public String ipVersion;

        /**
         * <p>The ID of the inbound rule.</p>
         * <br>
         * <p>Valid values of **N**: **0** to **99**. You can specify at most 100 inbound rules.</p>
         */
        @NameInMap("NetworkAclEntryId")
        public String networkAclEntryId;

        /**
         * <p>The name of the inbound rule.</p>
         * <br>
         * <p>The name must be 1 to 128 characters in length and cannot start with `http://` or `https://`.</p>
         */
        @NameInMap("NetworkAclEntryName")
        public String networkAclEntryName;

        /**
         * <p>The action to be performed on network traffic that matches the rule. Valid values:</p>
         * <br>
         * <p>*   **accept**</p>
         * <p>*   **drop**</p>
         */
        @NameInMap("Policy")
        public String policy;

        /**
         * <p>The source port range of the inbound rule.</p>
         * <br>
         * <p>*   If the **protocol** of the inbound rule is set to **all**, **icmp**, or **gre**, the port range is -1/-1, which specifies all ports.</p>
         * <p>*   If the **protocol** of the inbound rule is set to **tcp** or **udp**, set the port range in the following format: **1/200** or **80/80**, which specifies port 1 to port 200 or port 80. Valid ports: **1** to **65535**.</p>
         */
        @NameInMap("Port")
        public String port;

        /**
         * <p>The protocol. Valid values:</p>
         * <br>
         * <p>*   **icmp**</p>
         * <p>*   **gre**</p>
         * <p>*   **tcp**</p>
         * <p>*   **udp**</p>
         * <p>*   **all**</p>
         */
        @NameInMap("Protocol")
        public String protocol;

        /**
         * <p>The source CIDR block.</p>
         */
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

        public UpdateNetworkAclEntriesRequestIngressAclEntries setIpVersion(String ipVersion) {
            this.ipVersion = ipVersion;
            return this;
        }
        public String getIpVersion() {
            return this.ipVersion;
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
