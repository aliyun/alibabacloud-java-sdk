// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyFullNatEntryAttributeRequest extends TeaModel {
    /**
     * <p>The backend IP address to be modified in FULLNAT address translation.</p>
     */
    @NameInMap("AccessIp")
    public String accessIp;

    /**
     * <p>The backend port to be modified in FULLNAT port mapping. Valid values: **1** to **65535**.</p>
     */
    @NameInMap("AccessPort")
    public String accessPort;

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
     * <p>*   **true**: prechecks the request but does not modify the FULLNAT entry. The system checks your AccessKey pair, the RAM user permissions, and the required parameters. If the request fails the precheck, an error code is returned. If the request passes the check, the `DryRunOperation` error code is returned.</p>
     * <p>*   **false**: sends the API request. After the request passes the check, a 2XX HTTP status code is returned and the FULLNAT entry is modified. This is the default value.</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The new description of the FULLNAT entry.</p>
     * <br>
     * <p>This parameter is optional. If you enter a description, the description must be 2 to 256 characters in length, and cannot start with `http://` or `https://`.</p>
     */
    @NameInMap("FullNatEntryDescription")
    public String fullNatEntryDescription;

    /**
     * <p>The ID of the FULLNAT entry to be modified.</p>
     */
    @NameInMap("FullNatEntryId")
    public String fullNatEntryId;

    /**
     * <p>The new name of the FULLNAT entry.</p>
     * <br>
     * <p>The name must be 2 to 128 characters in length. It must start with a letter but cannot start with `http://` or `https://`.</p>
     */
    @NameInMap("FullNatEntryName")
    public String fullNatEntryName;

    /**
     * <p>The ID of the FULLNAT table to be modified.</p>
     */
    @NameInMap("FullNatTableId")
    public String fullNatTableId;

    /**
     * <p>The protocol of the packets that are forwarded by the port. Valid values:</p>
     * <br>
     * <p>*   **TCP**: TCP</p>
     * <p>*   **UDP**: UDP</p>
     */
    @NameInMap("IpProtocol")
    public String ipProtocol;

    /**
     * <p>The NAT IP address to be modified.</p>
     */
    @NameInMap("NatIp")
    public String natIp;

    /**
     * <p>The frontend port to be modified in FULLNAT port mapping. Valid values: **1** to **65535**.</p>
     */
    @NameInMap("NatIpPort")
    public String natIpPort;

    /**
     * <p>The ID of the elastic network interface (ENI) to be modified.</p>
     */
    @NameInMap("NetworkInterfaceId")
    public String networkInterfaceId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID of the Virtual Private Cloud (VPC) NAT gateway to which the FULLNAT entry to be modified belongs.</p>
     * <br>
     * <p>You can call the [DescribeRegions](~~36063~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static ModifyFullNatEntryAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyFullNatEntryAttributeRequest self = new ModifyFullNatEntryAttributeRequest();
        return TeaModel.build(map, self);
    }

    public ModifyFullNatEntryAttributeRequest setAccessIp(String accessIp) {
        this.accessIp = accessIp;
        return this;
    }
    public String getAccessIp() {
        return this.accessIp;
    }

    public ModifyFullNatEntryAttributeRequest setAccessPort(String accessPort) {
        this.accessPort = accessPort;
        return this;
    }
    public String getAccessPort() {
        return this.accessPort;
    }

    public ModifyFullNatEntryAttributeRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ModifyFullNatEntryAttributeRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public ModifyFullNatEntryAttributeRequest setFullNatEntryDescription(String fullNatEntryDescription) {
        this.fullNatEntryDescription = fullNatEntryDescription;
        return this;
    }
    public String getFullNatEntryDescription() {
        return this.fullNatEntryDescription;
    }

    public ModifyFullNatEntryAttributeRequest setFullNatEntryId(String fullNatEntryId) {
        this.fullNatEntryId = fullNatEntryId;
        return this;
    }
    public String getFullNatEntryId() {
        return this.fullNatEntryId;
    }

    public ModifyFullNatEntryAttributeRequest setFullNatEntryName(String fullNatEntryName) {
        this.fullNatEntryName = fullNatEntryName;
        return this;
    }
    public String getFullNatEntryName() {
        return this.fullNatEntryName;
    }

    public ModifyFullNatEntryAttributeRequest setFullNatTableId(String fullNatTableId) {
        this.fullNatTableId = fullNatTableId;
        return this;
    }
    public String getFullNatTableId() {
        return this.fullNatTableId;
    }

    public ModifyFullNatEntryAttributeRequest setIpProtocol(String ipProtocol) {
        this.ipProtocol = ipProtocol;
        return this;
    }
    public String getIpProtocol() {
        return this.ipProtocol;
    }

    public ModifyFullNatEntryAttributeRequest setNatIp(String natIp) {
        this.natIp = natIp;
        return this;
    }
    public String getNatIp() {
        return this.natIp;
    }

    public ModifyFullNatEntryAttributeRequest setNatIpPort(String natIpPort) {
        this.natIpPort = natIpPort;
        return this;
    }
    public String getNatIpPort() {
        return this.natIpPort;
    }

    public ModifyFullNatEntryAttributeRequest setNetworkInterfaceId(String networkInterfaceId) {
        this.networkInterfaceId = networkInterfaceId;
        return this;
    }
    public String getNetworkInterfaceId() {
        return this.networkInterfaceId;
    }

    public ModifyFullNatEntryAttributeRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyFullNatEntryAttributeRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyFullNatEntryAttributeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyFullNatEntryAttributeRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyFullNatEntryAttributeRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
