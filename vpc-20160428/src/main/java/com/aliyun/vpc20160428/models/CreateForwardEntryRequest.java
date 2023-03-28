// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateForwardEntryRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <br>
     * <p>You can use the client to generate the value, but you must make sure that it is unique among different requests. The client token can contain only ASCII characters.</p>
     * <br>
     * <p>>  If you do not set this parameter, the system automatically uses **RequestId** as **ClientToken**. The value of **RequestId** in each API request may be different.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>*   The EIP that can be accessed over the Internet when you configure a DNAT entry for an Internet NAT gateway.</p>
     * <p>*   The NAT IP address that can be accessed by external networks when you configure a DNAT entry for a VPC NAT gateway.</p>
     */
    @NameInMap("ExternalIp")
    public String externalIp;

    /**
     * <p>*   The external port range that is used for port forwarding when you configure a DNAT entry for an Internet NAT gateway.</p>
     * <br>
     * <p>    *   Valid values: **1** to **65535**.</p>
     * <p>    *   To specify a port range, separate the first port and the last port with a forward slash (/), for example, `10/20`.</p>
     * <p>    *   If you set **ExternalPort** to a port range, you must also set **InternalPort** to a port range, and the number of ports specified by these parameters must be the same. For example, if you set **ExternalPort** to `10/20`, you can set **InternalPort** to `80/90`.</p>
     * <br>
     * <p>*   The port that can be accessed by external networks when you configure a DNAT entry for a VPC NAT gateway. Valid values: **1** to **65535**.</p>
     */
    @NameInMap("ExternalPort")
    public String externalPort;

    /**
     * <p>The name of the DNAT entry.</p>
     * <br>
     * <p>The name must be 2 to 128 characters in length. It must start with a letter but cannot start with `http://` or `https://`.</p>
     */
    @NameInMap("ForwardEntryName")
    public String forwardEntryName;

    /**
     * <p>The ID of the DNAT table.</p>
     */
    @NameInMap("ForwardTableId")
    public String forwardTableId;

    /**
     * <p>*   The private IP address of the ECS instance that needs to communicate with the Internet when you configure a DNAT entry for an Internet NAT gateway. The private IP address must meet the following requirements:</p>
     * <br>
     * <p>    *   It must belong to the CIDR block of the VPC where the NAT gateway is deployed.</p>
     * <p>    *   The DNAT entry takes effect only if the private IP address is assigned to an ECS instance and the ECS instance is not associated with an EIP.</p>
     * <br>
     * <p>*   The private IP address that uses DNAT when you add a DNAT entry to a VPC NAT gateway.</p>
     */
    @NameInMap("InternalIp")
    public String internalIp;

    /**
     * <p>*   The internal port or port range that is used for port forwarding when you configure a DNAT entry for an Internet NAT gateway. Valid values: **1** to **65535**.</p>
     * <p>*   The port of the destination ECS instance to be mapped when you configure a DNAT entry for a VPC NAT gateway. Valid values: **1** to **65535**.</p>
     */
    @NameInMap("InternalPort")
    public String internalPort;

    /**
     * <p>The protocol. Valid values:</p>
     * <br>
     * <p>*   **TCP**: The NAT gateway forwards TCP packets.</p>
     * <p>*   **UDP**: The NAT gateway forwards UDP packets.</p>
     * <p>*   **Any**: The NAT gateway forwards packets of all protocols. If you set **IpProtocol** to **Any**, you must also set **ExternalPort** and **InternalPort** to **Any** to implement DNAT IP mapping.</p>
     */
    @NameInMap("IpProtocol")
    public String ipProtocol;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>Specifies whether to remove limits on the port range. Valid values:</p>
     * <br>
     * <p>*   **true**: yes</p>
     * <p>*   **false** (default): no</p>
     * <br>
     * <p>>  If an SNAT entry and a DNAT entry use the same public IP address, and you want to specify a port number greater than 1024, set **Portbreak** to **true**.</p>
     */
    @NameInMap("PortBreak")
    public Boolean portBreak;

    /**
     * <p>The region ID of the NAT gateway.</p>
     * <br>
     * <p>You can call the [DescribeRegions](~~36063~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static CreateForwardEntryRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateForwardEntryRequest self = new CreateForwardEntryRequest();
        return TeaModel.build(map, self);
    }

    public CreateForwardEntryRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateForwardEntryRequest setExternalIp(String externalIp) {
        this.externalIp = externalIp;
        return this;
    }
    public String getExternalIp() {
        return this.externalIp;
    }

    public CreateForwardEntryRequest setExternalPort(String externalPort) {
        this.externalPort = externalPort;
        return this;
    }
    public String getExternalPort() {
        return this.externalPort;
    }

    public CreateForwardEntryRequest setForwardEntryName(String forwardEntryName) {
        this.forwardEntryName = forwardEntryName;
        return this;
    }
    public String getForwardEntryName() {
        return this.forwardEntryName;
    }

    public CreateForwardEntryRequest setForwardTableId(String forwardTableId) {
        this.forwardTableId = forwardTableId;
        return this;
    }
    public String getForwardTableId() {
        return this.forwardTableId;
    }

    public CreateForwardEntryRequest setInternalIp(String internalIp) {
        this.internalIp = internalIp;
        return this;
    }
    public String getInternalIp() {
        return this.internalIp;
    }

    public CreateForwardEntryRequest setInternalPort(String internalPort) {
        this.internalPort = internalPort;
        return this;
    }
    public String getInternalPort() {
        return this.internalPort;
    }

    public CreateForwardEntryRequest setIpProtocol(String ipProtocol) {
        this.ipProtocol = ipProtocol;
        return this;
    }
    public String getIpProtocol() {
        return this.ipProtocol;
    }

    public CreateForwardEntryRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateForwardEntryRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateForwardEntryRequest setPortBreak(Boolean portBreak) {
        this.portBreak = portBreak;
        return this;
    }
    public Boolean getPortBreak() {
        return this.portBreak;
    }

    public CreateForwardEntryRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateForwardEntryRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateForwardEntryRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
