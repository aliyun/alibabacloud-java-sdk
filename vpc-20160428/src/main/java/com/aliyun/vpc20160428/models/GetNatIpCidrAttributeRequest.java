// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class GetNatIpCidrAttributeRequest extends TeaModel {
    /**
     * <p>Client Token, used to ensure the idempotence of requests. Generate a unique value for this parameter from your client, ensuring it is unique across different requests. ClientToken only supports ASCII characters.</p>
     * <blockquote>
     * <p>If not specified, the system automatically uses the RequestId of the API request as the ClientToken identifier. The RequestId is different for each API request.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>5A2CFF0E-5718-45B5-9D4D-70B3FF3898</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Whether to perform a dry run of this request. Values:</p>
     * <ul>
     * <li>true: Sends a check request. The checks include whether the AccessKey is valid, the RAM user\&quot;s authorization status, and if all required parameters are filled out. If any check fails, the corresponding error is returned. If all checks pass, an error code DryRunOperation is returned.</li>
     * <li>false (default): Sends a normal request. After passing the checks, a 2xx HTTP status code is returned.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The ID of the VPC NAT gateway instance to which the queried NAT IP address range belongs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ngw-gw8v16wgvtq26vh59****</p>
     */
    @NameInMap("NatGatewayId")
    public String natGatewayId;

    /**
     * <p>The NAT IP address range to be queried.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>192.168.0.0/24</p>
     */
    @NameInMap("NatIpCidr")
    public String natIpCidr;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID of the NAT gateway instance to which the NAT IP address range to be queried belongs. You can obtain the region ID by calling the DescribeRegions interface.</p>
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

    public static GetNatIpCidrAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        GetNatIpCidrAttributeRequest self = new GetNatIpCidrAttributeRequest();
        return TeaModel.build(map, self);
    }

    public GetNatIpCidrAttributeRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public GetNatIpCidrAttributeRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public GetNatIpCidrAttributeRequest setNatGatewayId(String natGatewayId) {
        this.natGatewayId = natGatewayId;
        return this;
    }
    public String getNatGatewayId() {
        return this.natGatewayId;
    }

    public GetNatIpCidrAttributeRequest setNatIpCidr(String natIpCidr) {
        this.natIpCidr = natIpCidr;
        return this;
    }
    public String getNatIpCidr() {
        return this.natIpCidr;
    }

    public GetNatIpCidrAttributeRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public GetNatIpCidrAttributeRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public GetNatIpCidrAttributeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetNatIpCidrAttributeRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public GetNatIpCidrAttributeRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
