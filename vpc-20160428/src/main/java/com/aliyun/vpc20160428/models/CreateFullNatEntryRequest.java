// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateFullNatEntryRequest extends TeaModel {
    /**
     * <p>The protocol of the packets that are forwarded by the port. Valid values:</p>
     * <br>
     * <p>*   **TCP**: forwards TCP packets.</p>
     * <p>*   **UDP**: forwards UDP packets.</p>
     */
    @NameInMap("AccessIp")
    public String accessIp;

    /**
     * <p>The name of the FULLNAT entry. The name must be 2 to 128 characters in length. It must start with a letter but cannot start with http:// or https://.</p>
     */
    @NameInMap("AccessPort")
    public String accessPort;

    /**
     * <p>The ID of the FULLNAT table to which the FULLNAT entry belongs.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The region ID of the Virtual Private Cloud (VPC) NAT gateway to which the FULLNAT entry to be added belongs.</p>
     * <br>
     * <p>You can call the [DescribeRegions](~~36063~~) operation to query the most recent region list.</p>
     */
    @NameInMap("FullNatEntryDescription")
    public String fullNatEntryDescription;

    /**
     * <p>Specifies whether only to precheck this request. Valid values:</p>
     * <br>
     * <p>*   **true**: prechecks the request but does not add the FULLNAT entry. The system checks your AccessKey pair, the RAM user permissions, and the required parameters. If the request fails the precheck, an error code is returned. If the request passes the check, the `DryRunOperation` error code is returned.</p>
     * <p>*   **false**: sends the API request. After the request passes the precheck, a 2XX HTTP status code is returned and the FULLNAT entry is added. This is the default value.</p>
     */
    @NameInMap("FullNatEntryName")
    public String fullNatEntryName;

    /**
     * <p>The NAT IP address that provides address translation.</p>
     */
    @NameInMap("FullNatTableId")
    public String fullNatTableId;

    /**
     * <p>The description of the FULLNAT entry.</p>
     * <br>
     * <p>This parameter is optional. If you enter a description, the description must be 2 to 256 characters in length, and cannot start with `http://` or `https://`.</p>
     */
    @NameInMap("IpProtocol")
    public String ipProtocol;

    /**
     * <p>The backend IP address to be modified in FULLNAT address translation.</p>
     */
    @NameInMap("NatIp")
    public String natIp;

    /**
     * <p>The backend port to be modified in FULLNAT port mapping. Valid values: **1** to **65535**.</p>
     */
    @NameInMap("NatIpPort")
    public String natIpPort;

    /**
     * <p>The frontend port to be modified in FULLNAT port mapping. Valid values: **1** to **65535**.</p>
     */
    @NameInMap("NetworkInterfaceId")
    public String networkInterfaceId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The ID of the FULLNAT entry.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static CreateFullNatEntryRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateFullNatEntryRequest self = new CreateFullNatEntryRequest();
        return TeaModel.build(map, self);
    }

    public CreateFullNatEntryRequest setAccessIp(String accessIp) {
        this.accessIp = accessIp;
        return this;
    }
    public String getAccessIp() {
        return this.accessIp;
    }

    public CreateFullNatEntryRequest setAccessPort(String accessPort) {
        this.accessPort = accessPort;
        return this;
    }
    public String getAccessPort() {
        return this.accessPort;
    }

    public CreateFullNatEntryRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateFullNatEntryRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public CreateFullNatEntryRequest setFullNatEntryDescription(String fullNatEntryDescription) {
        this.fullNatEntryDescription = fullNatEntryDescription;
        return this;
    }
    public String getFullNatEntryDescription() {
        return this.fullNatEntryDescription;
    }

    public CreateFullNatEntryRequest setFullNatEntryName(String fullNatEntryName) {
        this.fullNatEntryName = fullNatEntryName;
        return this;
    }
    public String getFullNatEntryName() {
        return this.fullNatEntryName;
    }

    public CreateFullNatEntryRequest setFullNatTableId(String fullNatTableId) {
        this.fullNatTableId = fullNatTableId;
        return this;
    }
    public String getFullNatTableId() {
        return this.fullNatTableId;
    }

    public CreateFullNatEntryRequest setIpProtocol(String ipProtocol) {
        this.ipProtocol = ipProtocol;
        return this;
    }
    public String getIpProtocol() {
        return this.ipProtocol;
    }

    public CreateFullNatEntryRequest setNatIp(String natIp) {
        this.natIp = natIp;
        return this;
    }
    public String getNatIp() {
        return this.natIp;
    }

    public CreateFullNatEntryRequest setNatIpPort(String natIpPort) {
        this.natIpPort = natIpPort;
        return this;
    }
    public String getNatIpPort() {
        return this.natIpPort;
    }

    public CreateFullNatEntryRequest setNetworkInterfaceId(String networkInterfaceId) {
        this.networkInterfaceId = networkInterfaceId;
        return this;
    }
    public String getNetworkInterfaceId() {
        return this.networkInterfaceId;
    }

    public CreateFullNatEntryRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateFullNatEntryRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateFullNatEntryRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateFullNatEntryRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateFullNatEntryRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
