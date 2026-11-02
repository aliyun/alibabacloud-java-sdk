// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ListNatIpsRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can use the client to generate the token, but you must make sure that the token is unique among multiple requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
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
     * <p>Specifies whether to only precheck the request. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The system prechecks the request without querying the NAT IP addresses. The system checks whether required parameters are specified, the request format is valid, and the service limits are met. If the request fails the precheck, the corresponding error is returned. If the request passes the precheck, the <code>DryRunOperation</code> error code is returned.</li>
     * <li><strong>false</strong> (default): The system sends a normal request. If the request passes the precheck, the system returns an HTTP 2xx status code and performs the operation.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The origin of the NAT IP addresses to query. Valid values:</p>
     * <ul>
     * <li><p>prefix: NAT IP addresses that belong to an IP prefix.</p>
     * </li>
     * <li><p>cidr: Standalone NAT IP addresses that do not belong to any IP prefix.</p>
     * </li>
     * <li><p>Empty: All NAT IP addresses.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cidr</p>
     */
    @NameInMap("IpOrigin")
    public String ipOrigin;

    /**
     * <p>The CIDR block of the IP prefix to query.</p>
     * 
     * <strong>example:</strong>
     * <p>192.168.0.0/28</p>
     */
    @NameInMap("Ipv4Prefix")
    public String ipv4Prefix;

    /**
     * <p>The number of entries to return on each page. Valid values: <strong>1</strong> to <strong>100</strong>. Default value: <strong>20</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public String maxResults;

    /**
     * <p>The instance ID of the NAT gateway to which the NAT IP addresses belong.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ngw-gw8v16wgvtq26vh59****</p>
     */
    @NameInMap("NatGatewayId")
    public String natGatewayId;

    /**
     * <p>The CIDR block to which the NAT IP addresses belong.</p>
     * 
     * <strong>example:</strong>
     * <p>192.168.0.0/24</p>
     */
    @NameInMap("NatIpCidr")
    public String natIpCidr;

    /**
     * <p>The instance IDs of the NAT IP addresses to query. Valid values of <strong>N</strong>: <strong>1</strong> to <strong>20</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>vpcnatip-gw8a863sut1zijxh0****</p>
     */
    @NameInMap("NatIpIds")
    public java.util.List<String> natIpIds;

    /**
     * <p>The name of the NAT IP address to query. Valid values of <strong>N</strong>: <strong>1</strong> to <strong>20</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("NatIpName")
    public java.util.List<String> natIpName;

    /**
     * <p>The status of the NAT IP addresses to query. Valid values:</p>
     * <ul>
     * <li><strong>Available</strong>: Available.</li>
     * <li><strong>Deleting</strong>: Deleting.</li>
     * <li><strong>Creating</strong>: Creating.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Available</p>
     */
    @NameInMap("NatIpStatus")
    public String natIpStatus;

    /**
     * <p>The token that is used to start the next query. Valid values:</p>
     * <ul>
     * <li>If this is the first query or no next query is to be sent, ignore this parameter.</li>
     * <li>If a next query is to be sent, set the value to the NextToken value returned in the last API call.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>FFmyTO70tTpLG6I3FmYAXGKPd****f84eb48b699f0a4883</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID of the NAT gateway instance to which the NAT IP addresses belong.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to obtain the region ID.</p>
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

    public static ListNatIpsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListNatIpsRequest self = new ListNatIpsRequest();
        return TeaModel.build(map, self);
    }

    public ListNatIpsRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ListNatIpsRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public ListNatIpsRequest setIpOrigin(String ipOrigin) {
        this.ipOrigin = ipOrigin;
        return this;
    }
    public String getIpOrigin() {
        return this.ipOrigin;
    }

    public ListNatIpsRequest setIpv4Prefix(String ipv4Prefix) {
        this.ipv4Prefix = ipv4Prefix;
        return this;
    }
    public String getIpv4Prefix() {
        return this.ipv4Prefix;
    }

    public ListNatIpsRequest setMaxResults(String maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public String getMaxResults() {
        return this.maxResults;
    }

    public ListNatIpsRequest setNatGatewayId(String natGatewayId) {
        this.natGatewayId = natGatewayId;
        return this;
    }
    public String getNatGatewayId() {
        return this.natGatewayId;
    }

    public ListNatIpsRequest setNatIpCidr(String natIpCidr) {
        this.natIpCidr = natIpCidr;
        return this;
    }
    public String getNatIpCidr() {
        return this.natIpCidr;
    }

    public ListNatIpsRequest setNatIpIds(java.util.List<String> natIpIds) {
        this.natIpIds = natIpIds;
        return this;
    }
    public java.util.List<String> getNatIpIds() {
        return this.natIpIds;
    }

    public ListNatIpsRequest setNatIpName(java.util.List<String> natIpName) {
        this.natIpName = natIpName;
        return this;
    }
    public java.util.List<String> getNatIpName() {
        return this.natIpName;
    }

    public ListNatIpsRequest setNatIpStatus(String natIpStatus) {
        this.natIpStatus = natIpStatus;
        return this;
    }
    public String getNatIpStatus() {
        return this.natIpStatus;
    }

    public ListNatIpsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListNatIpsRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ListNatIpsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ListNatIpsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListNatIpsRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ListNatIpsRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
