// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateNatIpRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <br>
     * <p>You can use the client to generate the value, but you must make sure that it is unique among different requests. The client token can contain only ASCII characters.</p>
     * <br>
     * <p>>  If you do not set this parameter, **ClientToken** is set to the value of **RequestId**. The value of **RequestId** for each API request may be different.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether only to precheck this request. Valid values:</p>
     * <br>
     * <p>*   **true**: sends the precheck request but does not create the NAT IP address. The system checks your AccessKey pair, the Resource Access Management (RAM) user permissions, and the required parameters. If the request fails the precheck, an error message is returned. If the request passes the precheck, the `DryRunOperation` error code is returned.</p>
     * <p>*   **false** (default): sends the request. If the request passes the precheck, a 2xx HTTP status code is returned and the NAT IP address is created.</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The ID of the Virtual Private Cloud (VPC) NAT gateway for which you want to create the NAT IP address.</p>
     */
    @NameInMap("NatGatewayId")
    public String natGatewayId;

    /**
     * <p>The NAT IP address that you want to create.</p>
     * <br>
     * <p>If you do not specify an IP address, the system selects a random IP address from the specified CIDR block.</p>
     */
    @NameInMap("NatIp")
    public String natIp;

    /**
     * <p>The CIDR block to which the NAT IP address belongs.</p>
     */
    @NameInMap("NatIpCidr")
    public String natIpCidr;

    /**
     * <p>The ID of the CIDR block to which the NAT IP address belongs.</p>
     */
    @NameInMap("NatIpCidrId")
    public String natIpCidrId;

    /**
     * <p>The description of the NAT IP address.</p>
     * <br>
     * <p>The description must be 2 to 256 characters in length. It must start with a letter but cannot start with `http://` or `https://`.</p>
     */
    @NameInMap("NatIpDescription")
    public String natIpDescription;

    /**
     * <p>The name of the NAT IP address.</p>
     * <br>
     * <p>The name must be 2 to 128 characters in length, and can contain letters, digits, periods (.), underscores (\_), and hyphens (-). It must start with a letter. It cannot start with `http://` or `https://`.</p>
     */
    @NameInMap("NatIpName")
    public String natIpName;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID of the NAT gateway to which the NAT IP address that you want to create belongs.</p>
     * <br>
     * <p>You can call the [DescribeRegions](~~36063~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static CreateNatIpRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateNatIpRequest self = new CreateNatIpRequest();
        return TeaModel.build(map, self);
    }

    public CreateNatIpRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateNatIpRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public CreateNatIpRequest setNatGatewayId(String natGatewayId) {
        this.natGatewayId = natGatewayId;
        return this;
    }
    public String getNatGatewayId() {
        return this.natGatewayId;
    }

    public CreateNatIpRequest setNatIp(String natIp) {
        this.natIp = natIp;
        return this;
    }
    public String getNatIp() {
        return this.natIp;
    }

    public CreateNatIpRequest setNatIpCidr(String natIpCidr) {
        this.natIpCidr = natIpCidr;
        return this;
    }
    public String getNatIpCidr() {
        return this.natIpCidr;
    }

    public CreateNatIpRequest setNatIpCidrId(String natIpCidrId) {
        this.natIpCidrId = natIpCidrId;
        return this;
    }
    public String getNatIpCidrId() {
        return this.natIpCidrId;
    }

    public CreateNatIpRequest setNatIpDescription(String natIpDescription) {
        this.natIpDescription = natIpDescription;
        return this;
    }
    public String getNatIpDescription() {
        return this.natIpDescription;
    }

    public CreateNatIpRequest setNatIpName(String natIpName) {
        this.natIpName = natIpName;
        return this;
    }
    public String getNatIpName() {
        return this.natIpName;
    }

    public CreateNatIpRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateNatIpRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateNatIpRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateNatIpRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateNatIpRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
