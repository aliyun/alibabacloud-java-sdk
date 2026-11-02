// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ListNatIpCidrsRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
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
     * <p>Specifies whether to perform a dry run on the request. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: performs a dry run without querying the NAT CIDR blocks. The system checks whether your AccessKey pair is valid, the authorization of the Resource Access Management (RAM) user, and whether the required parameters are specified. If the request fails the check, the corresponding error is returned. If the request passes the check, the DryRunOperation error code is returned.</p>
     * </li>
     * <li><p><strong>false</strong>: sends a normal request. This is the default value. If the request passes the check, an HTTP 2xx status code is returned and the NAT CIDR blocks are queried.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The number of entries to return on each page. Valid values: <strong>1</strong> to <strong>100</strong>. Default value: <strong>20</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public String maxResults;

    /**
     * <p>The instance ID of the VPC NAT gateway for which you want to query NAT CIDR blocks.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ngw-gw8v16wgvtq26vh59****</p>
     */
    @NameInMap("NatGatewayId")
    public String natGatewayId;

    /**
     * <p>The NAT CIDR block that you want to query.</p>
     * 
     * <strong>example:</strong>
     * <p>172.16.0.0/24</p>
     */
    @NameInMap("NatIpCidr")
    public String natIpCidr;

    /**
     * <p>The name of the NAT CIDR block that you want to query. <strong>N</strong> ranges from <strong>1</strong> to <strong>20</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("NatIpCidrName")
    public java.util.List<String> natIpCidrName;

    /**
     * <p>The status of the NAT CIDR block that you want to query. Valid values: <strong>Available</strong>, which indicates that the NAT CIDR block is active.</p>
     * 
     * <strong>example:</strong>
     * <p>Available</p>
     */
    @NameInMap("NatIpCidrStatus")
    public String natIpCidrStatus;

    /**
     * <p>The NAT CIDR block that you want to query. <strong>N</strong> ranges from <strong>1</strong> to <strong>20</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>172.16.0.0/24</p>
     */
    @NameInMap("NatIpCidrs")
    public java.util.List<String> natIpCidrs;

    /**
     * <p>The token for the next query. Valid values:</p>
     * <ul>
     * <li>If this is your first query or no next query is to be sent, ignore this parameter.</li>
     * <li>If a next query is to be sent, set the value to the NextToken value that is returned from the last API call.</li>
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
     * <p>The region ID of the VPC NAT gateway to which the NAT CIDR blocks belong. You can invoke the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to obtain the region ID.</p>
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

    public static ListNatIpCidrsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListNatIpCidrsRequest self = new ListNatIpCidrsRequest();
        return TeaModel.build(map, self);
    }

    public ListNatIpCidrsRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ListNatIpCidrsRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public ListNatIpCidrsRequest setMaxResults(String maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public String getMaxResults() {
        return this.maxResults;
    }

    public ListNatIpCidrsRequest setNatGatewayId(String natGatewayId) {
        this.natGatewayId = natGatewayId;
        return this;
    }
    public String getNatGatewayId() {
        return this.natGatewayId;
    }

    public ListNatIpCidrsRequest setNatIpCidr(String natIpCidr) {
        this.natIpCidr = natIpCidr;
        return this;
    }
    public String getNatIpCidr() {
        return this.natIpCidr;
    }

    public ListNatIpCidrsRequest setNatIpCidrName(java.util.List<String> natIpCidrName) {
        this.natIpCidrName = natIpCidrName;
        return this;
    }
    public java.util.List<String> getNatIpCidrName() {
        return this.natIpCidrName;
    }

    public ListNatIpCidrsRequest setNatIpCidrStatus(String natIpCidrStatus) {
        this.natIpCidrStatus = natIpCidrStatus;
        return this;
    }
    public String getNatIpCidrStatus() {
        return this.natIpCidrStatus;
    }

    public ListNatIpCidrsRequest setNatIpCidrs(java.util.List<String> natIpCidrs) {
        this.natIpCidrs = natIpCidrs;
        return this;
    }
    public java.util.List<String> getNatIpCidrs() {
        return this.natIpCidrs;
    }

    public ListNatIpCidrsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListNatIpCidrsRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ListNatIpCidrsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ListNatIpCidrsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListNatIpCidrsRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ListNatIpCidrsRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
