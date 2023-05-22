// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ListFullNatEntriesRequest extends TeaModel {
    /**
     * <p>The ID of the FULLNAT table to which the FULLNAT entries to be queried belong.</p>
     * <br>
     * <p>>  You must specify at least one of the **FullNatTableId** and **NatGatewayId** parameters.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The ID of the elastic network interface (ENI) that you want to query. You can specify up to 20 ENIs.</p>
     */
    @NameInMap("FullNatEntryId")
    public String fullNatEntryId;

    @NameInMap("FullNatEntryNames")
    public java.util.List<String> fullNatEntryNames;

    /**
     * <p>The name of the FULLNAT entry that you want to query. You can enter the names of up to 20 FULLNAT entries.</p>
     * <br>
     * <p>The name must be 2 to 128 characters in length and can contain letters, digits, underscores (\_), and hyphens (-). The name must start with a letter.</p>
     */
    @NameInMap("FullNatTableId")
    public String fullNatTableId;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("IpProtocol")
    public String ipProtocol;

    /**
     * <p>The protocol of the packets that are forwarded by the port. Valid values:</p>
     * <br>
     * <p>*   **TCP**</p>
     * <p>*   **UDP**</p>
     */
    @NameInMap("MaxResults")
    public Long maxResults;

    /**
     * <p>The ID of the VPC NAT gateway.</p>
     */
    @NameInMap("NatGatewayId")
    public String natGatewayId;

    @NameInMap("NetworkInterfaceIds")
    public java.util.List<String> networkInterfaceIds;

    /**
     * <p>The region ID of the virtual private cloud (VPC) NAT gateway to which the FULLNAT entries to be queried belong.</p>
     * <br>
     * <p>You can call the [DescribeRegions](~~36063~~) operation to query the most recent region list.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The ID of the NAT gateway.</p>
     * <br>
     * <p>>  You must specify at least one of the **FullNatTableId** and **NatGatewayId** parameters.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static ListFullNatEntriesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListFullNatEntriesRequest self = new ListFullNatEntriesRequest();
        return TeaModel.build(map, self);
    }

    public ListFullNatEntriesRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ListFullNatEntriesRequest setFullNatEntryId(String fullNatEntryId) {
        this.fullNatEntryId = fullNatEntryId;
        return this;
    }
    public String getFullNatEntryId() {
        return this.fullNatEntryId;
    }

    public ListFullNatEntriesRequest setFullNatEntryNames(java.util.List<String> fullNatEntryNames) {
        this.fullNatEntryNames = fullNatEntryNames;
        return this;
    }
    public java.util.List<String> getFullNatEntryNames() {
        return this.fullNatEntryNames;
    }

    public ListFullNatEntriesRequest setFullNatTableId(String fullNatTableId) {
        this.fullNatTableId = fullNatTableId;
        return this;
    }
    public String getFullNatTableId() {
        return this.fullNatTableId;
    }

    public ListFullNatEntriesRequest setIpProtocol(String ipProtocol) {
        this.ipProtocol = ipProtocol;
        return this;
    }
    public String getIpProtocol() {
        return this.ipProtocol;
    }

    public ListFullNatEntriesRequest setMaxResults(Long maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Long getMaxResults() {
        return this.maxResults;
    }

    public ListFullNatEntriesRequest setNatGatewayId(String natGatewayId) {
        this.natGatewayId = natGatewayId;
        return this;
    }
    public String getNatGatewayId() {
        return this.natGatewayId;
    }

    public ListFullNatEntriesRequest setNetworkInterfaceIds(java.util.List<String> networkInterfaceIds) {
        this.networkInterfaceIds = networkInterfaceIds;
        return this;
    }
    public java.util.List<String> getNetworkInterfaceIds() {
        return this.networkInterfaceIds;
    }

    public ListFullNatEntriesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListFullNatEntriesRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ListFullNatEntriesRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ListFullNatEntriesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListFullNatEntriesRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ListFullNatEntriesRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
