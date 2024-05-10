// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ListNatIpCidrsRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <br>
     * <p>You can use the client to generate the value, but you must make sure that it is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
     * <br>
     * <p>>  If you do not set this parameter, the system automatically uses **RequestId** as **ClientToken**. **RequestId** may be different for each API request.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to only precheck this request. Valid values:</p>
     * <br>
     * <p>*   **true**: checks the API request. The CIDR blocks of the NAT gateway are not queried if the API request passes the precheck. The system checks whether your AccessKey pair is valid, whether the Resource Access Management (RAM) user is authorized, and whether the required parameters are set. If the request fails to pass the precheck, the corresponding error message is returned. If the check succeeds, the DryRunOperation error code is returned.</p>
     * <p>*   **false**: sends the API request. If the request passes the precheck, 2xx HTTP status code is returned and the CIDR blocks of the NAT gateway are queried. This is the default value.</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The number of entries to return on each page. Valid values: **1** to **100**. Default value: **20**.</p>
     */
    @NameInMap("MaxResults")
    public String maxResults;

    /**
     * <p>The ID of the VPC NAT gateway that you want to query.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("NatGatewayId")
    public String natGatewayId;

    /**
     * <p>The CIDR block of the NAT gateway that you want to query.</p>
     */
    @NameInMap("NatIpCidr")
    public String natIpCidr;

    /**
     * <p>The name of the CIDR block that you want to query. Valid values of **N**: **1** to **20**.</p>
     */
    @NameInMap("NatIpCidrName")
    public java.util.List<String> natIpCidrName;

    /**
     * <p>The status of the CIDR block that you want to query. Set the value to **Available**.</p>
     */
    @NameInMap("NatIpCidrStatus")
    public String natIpCidrStatus;

    /**
     * <p>The CIDR block of the NAT gateway that you want to query. Valid values of **N**: **1** to **20**.</p>
     */
    @NameInMap("NatIpCidrs")
    public java.util.List<String> natIpCidrs;

    /**
     * <p>The token that is used for the next query. Set the value as needed.</p>
     * <br>
     * <p>*   If this is your first query or no next query is to be sent, ignore this parameter.</p>
     * <p>*   If a next query is to be sent, set the value to the value of NextToken that is returned from the last call.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID of the Virtual Private Cloud (VPC) NAT gateway that you want to query.</p>
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
