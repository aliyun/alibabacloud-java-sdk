// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ListFullNatEntriesRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can generate the value from your client and make sure that the value is unique across different requests. The ClientToken parameter supports only ASCII characters.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the system automatically uses the <strong>RequestId</strong> of the API request as the <strong>ClientToken</strong>. The <strong>RequestId</strong> of each API request may be different.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>5A2CFF0E-5718-45B5-9D4D-70B3FF3898</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The ID of the FULLNAT entry to be queried.</p>
     * 
     * <strong>example:</strong>
     * <p>fullnat-gw8fz23jezpbblf1j****</p>
     */
    @NameInMap("FullNatEntryId")
    public String fullNatEntryId;

    /**
     * <p>The names of the FULLNAT entries to be queried. You can query the names of up to 20 FULLNAT entries.</p>
     * <p>The name must be 2 to 128 characters in length, and must start with a letter or a Chinese character. It can contain digits, hyphens (-), and underscores (_).</p>
     */
    @NameInMap("FullNatEntryNames")
    public java.util.List<String> fullNatEntryNames;

    /**
     * <p>The ID of the FULLNAT table to which the FULLNAT entries to be queried belong.</p>
     * <blockquote>
     * <p>You must specify at least one of the <strong>FullNatTableId</strong> and <strong>NatGatewayId</strong> parameters.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>fulltb-gw88z7hhlv43rmb26****</p>
     */
    @NameInMap("FullNatTableId")
    public String fullNatTableId;

    /**
     * <p>The protocol type of the Redirection Port. Valid values:</p>
     * <ul>
     * <li><strong>TCP</strong>: forwards TCP packets.</li>
     * <li><strong>UDP</strong>: forwards UDP packets.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>TCP</p>
     */
    @NameInMap("IpProtocol")
    public String ipProtocol;

    /**
     * <p>The number of entries to return on each page. Valid values: <strong>1</strong> to <strong>100</strong>. Default value: <strong>20</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Long maxResults;

    /**
     * <p>The ID of the NAT gateway to be queried.</p>
     * <blockquote>
     * <p>You must specify at least one of the <strong>FullNatTableId</strong> and <strong>NatGatewayId</strong> parameters.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>ngw-bp1uewa15k4iy5770****</p>
     */
    @NameInMap("NatGatewayId")
    public String natGatewayId;

    /**
     * <p>The NAT IP address of the FULLNAT entry to be queried.</p>
     * 
     * <strong>example:</strong>
     * <p>10.0.XX.XX</p>
     */
    @NameInMap("NatIp")
    public String natIp;

    /**
     * <p>The frontend port of the FULLNAT entry to be queried. Valid values: 1 to 65535.</p>
     * 
     * <strong>example:</strong>
     * <p>443</p>
     */
    @NameInMap("NatIpPort")
    public String natIpPort;

    /**
     * <p>The IDs of the elastic network interfaces (ENIs) to be queried.</p>
     */
    @NameInMap("NetworkInterfaceIds")
    public java.util.List<String> networkInterfaceIds;

    /**
     * <p>The token that is used for the next query. Valid values:</p>
     * <ul>
     * <li>If this is the first query or no next query is to be sent, you do not need to specify this parameter.</li>
     * <li>If a next query is to be sent, set the value to the <strong>NextToken</strong> value returned from the last API call.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>caeba0bbb2be03f84eb48b699f0a4883</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID of the VPC NAT gateway to which the FULLNAT entries to be queried belong.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to query region IDs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>eu-central-1</p>
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

    public ListFullNatEntriesRequest setNatIp(String natIp) {
        this.natIp = natIp;
        return this;
    }
    public String getNatIp() {
        return this.natIp;
    }

    public ListFullNatEntriesRequest setNatIpPort(String natIpPort) {
        this.natIpPort = natIpPort;
        return this;
    }
    public String getNatIpPort() {
        return this.natIpPort;
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
