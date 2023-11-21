// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyForwardEntryRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <br>
     * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The client token can contain only ASCII characters.</p>
     * <br>
     * <p>>  If you do not specify this parameter, the system automatically uses the **request ID** as the **client token**. The **request ID** may be different for each request.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>*   When you modify DNAT entries of Internet NAT gateways, this parameter specifies the elastic IP addresses (EIPs) that are used to access the Internet.</p>
     * <p>*   When you modify DNAT entries of Virtual Private Cloud (VPC) NAT gateways, this parameter specifies the NAT IP addresses that are accessed by external networks.</p>
     */
    @NameInMap("ExternalIp")
    public String externalIp;

    /**
     * <p>*   The external port that is used to forward traffic when you modify DNAT entries of Internet NAT gateways.</p>
     * <br>
     * <p>    *   Valid values: **1** to **65535**.</p>
     * <p>    *   If you want to modify the port range, separate port numbers with a forward slash (/), such as `10/20`.</p>
     * <p>    *   If you need to modify **ExternalPort** and **InternalPort** at the same time, and **ExternalPort** specifies a port range, make sure that **InternalPort** also specifies a port range, and both ranges specify the same number of ports. For example, you can set **ExternalPort** to `10/20` and **InternalPort** to `80/90`.</p>
     * <br>
     * <p>*   The port that is accessed by external networks when you modify DNAT entries of VPC NAT gateways. Valid values: **1** to **65535**.</p>
     */
    @NameInMap("ExternalPort")
    public String externalPort;

    /**
     * <p>The ID of the DNAT entry.</p>
     */
    @NameInMap("ForwardEntryId")
    public String forwardEntryId;

    /**
     * <p>The new name of the DNAT entry.</p>
     * <br>
     * <p>The name must be 2 to 128 characters in length. It must start with a letter but cannot start with `http://` or `https://`.</p>
     */
    @NameInMap("ForwardEntryName")
    public String forwardEntryName;

    /**
     * <p>The ID of the DNAT table to which the DNAT entry belongs.</p>
     */
    @NameInMap("ForwardTableId")
    public String forwardTableId;

    /**
     * <p>*   The private IP address of the ECS instance that uses DNAT entries to communicate with the Internet when you modify DNAT entries of Internet NAT gateways.</p>
     * <p>*   The private IP address that uses DNAT entries to communicate when you modify DNAT entries of VPC NAT gateways.</p>
     */
    @NameInMap("InternalIp")
    public String internalIp;

    /**
     * <p>*   The internal port or port range that is used to forward traffic when you modify DNAT entries of Internet NAT gateways. Valid values: **1** to **65535**.</p>
     * <p>*   The port of the destination ECS instance to be mapped when you modify DNAT entries of VPC NAT gateways. Valid values: **1** to **65535**.</p>
     */
    @NameInMap("InternalPort")
    public String internalPort;

    /**
     * <p>The protocol. Valid values:</p>
     * <br>
     * <p>*   **TCP**</p>
     * <p>*   **UDP**</p>
     * <p>*   **Any**</p>
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
     * <p>*   **true**</p>
     * <p>*   **false** If an SNAT entry and a DNAT entry use the same public IP address, and you want to specify a port number greater than `1024`, set `PortBreak` to `true`.</p>
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

    public static ModifyForwardEntryRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyForwardEntryRequest self = new ModifyForwardEntryRequest();
        return TeaModel.build(map, self);
    }

    public ModifyForwardEntryRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ModifyForwardEntryRequest setExternalIp(String externalIp) {
        this.externalIp = externalIp;
        return this;
    }
    public String getExternalIp() {
        return this.externalIp;
    }

    public ModifyForwardEntryRequest setExternalPort(String externalPort) {
        this.externalPort = externalPort;
        return this;
    }
    public String getExternalPort() {
        return this.externalPort;
    }

    public ModifyForwardEntryRequest setForwardEntryId(String forwardEntryId) {
        this.forwardEntryId = forwardEntryId;
        return this;
    }
    public String getForwardEntryId() {
        return this.forwardEntryId;
    }

    public ModifyForwardEntryRequest setForwardEntryName(String forwardEntryName) {
        this.forwardEntryName = forwardEntryName;
        return this;
    }
    public String getForwardEntryName() {
        return this.forwardEntryName;
    }

    public ModifyForwardEntryRequest setForwardTableId(String forwardTableId) {
        this.forwardTableId = forwardTableId;
        return this;
    }
    public String getForwardTableId() {
        return this.forwardTableId;
    }

    public ModifyForwardEntryRequest setInternalIp(String internalIp) {
        this.internalIp = internalIp;
        return this;
    }
    public String getInternalIp() {
        return this.internalIp;
    }

    public ModifyForwardEntryRequest setInternalPort(String internalPort) {
        this.internalPort = internalPort;
        return this;
    }
    public String getInternalPort() {
        return this.internalPort;
    }

    public ModifyForwardEntryRequest setIpProtocol(String ipProtocol) {
        this.ipProtocol = ipProtocol;
        return this;
    }
    public String getIpProtocol() {
        return this.ipProtocol;
    }

    public ModifyForwardEntryRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyForwardEntryRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyForwardEntryRequest setPortBreak(Boolean portBreak) {
        this.portBreak = portBreak;
        return this;
    }
    public Boolean getPortBreak() {
        return this.portBreak;
    }

    public ModifyForwardEntryRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyForwardEntryRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyForwardEntryRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
