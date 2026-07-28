// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateForwardEntryRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The ClientToken value can contain only ASCII characters.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the system uses the <strong>RequestId</strong> of the API request as the <strong>ClientToken</strong>. The <strong>RequestId</strong> may differ for each API request.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>0c593ea1-3bea-11e9-b96b-88e9fe6****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to perform a dry run. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: performs a dry run without creating a DNAT entry. The system checks the AccessKey pair, the authorization of the Resource Access Management (RAM) user, and the required parameters. If the check fails, the corresponding error is returned. If the check succeeds, the <code>DryRunOperation</code> error code is returned.</p>
     * </li>
     * <li><p><strong>false</strong> (default): sends a Normal request. If the check succeeds, a 2xx HTTP status code is returned and the DNAT entry is created.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <ul>
     * <li>If you add a DNAT entry for an Internet NAT gateway, this parameter specifies the elastic IP address (EIP) that provides public network access.</li>
     * <li>If you add a DNAT entry for a VPC NAT gateway, this parameter specifies the NAT IP address that provides external network access.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>116.28.XX.XX</p>
     */
    @NameInMap("ExternalIp")
    public String externalIp;

    /**
     * <ul>
     * <li><p>If you add a DNAT entry for an Internet NAT gateway, this parameter specifies the external port or port range for port forwarding.</p>
     * <ul>
     * <li>Valid port values: <strong>1</strong> to <strong>65535</strong>.</li>
     * <li>To specify a port range, separate the start and end ports with a forward slash (/), such as <code>10/20</code>.</li>
     * <li>If <strong>ExternalPort</strong> is set to a port range, <strong>InternalPort</strong> must also be set to a port range with the same number of ports. For example, if <strong>ExternalPort</strong> is set to <code>10/20</code>, <strong>InternalPort</strong> can be set to <code>80/90</code>.</li>
     * </ul>
     * </li>
     * <li><p>If you add a DNAT entry for a VPC NAT gateway, this parameter specifies the port on the NAT IP address that is accessed by the external network. Valid values: <strong>1</strong> to <strong>65535</strong>.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>8080</p>
     */
    @NameInMap("ExternalPort")
    public String externalPort;

    /**
     * <p>The name of the DNAT rule.</p>
     * <p>The name must be 2 to 128 characters in length and must start with a letter or Chinese character. It cannot start with <code>http://</code> or <code>https://</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>ForwardEntry-1</p>
     */
    @NameInMap("ForwardEntryName")
    public String forwardEntryName;

    /**
     * <p>The ID of the DNAT table.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ftb-bp1mbjubq34hlcqpa****</p>
     */
    @NameInMap("ForwardTableId")
    public String forwardTableId;

    /**
     * <ul>
     * <li><p>If you add a DNAT entry for an Internet NAT gateway, this parameter specifies the private IP address of the ECS instance that needs to communicate over the Internet. The private IP address must meet the following conditions: </p>
     * <ul>
     * <li><p>It must belong to the CIDR block of the VPC in which the NAT gateway resides. </p>
     * </li>
     * <li><p>The DNAT entry takes effect only when the IP address is used by an ECS instance that is not associated with an EIP.</p>
     * </li>
     * </ul>
     * </li>
     * <li><p>If you add a DNAT entry for a VPC NAT gateway, this parameter specifies the private IP address that communicates through the DNAT rule.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>192.168.XX.XX</p>
     */
    @NameInMap("InternalIp")
    public String internalIp;

    /**
     * <ul>
     * <li><p>If you add a DNAT entry for an Internet NAT gateway, this parameter specifies the internal port or port range for port forwarding. Valid values: <strong>1</strong> to <strong>65535</strong>.</p>
     * </li>
     * <li><p>If you add a DNAT entry for a VPC NAT gateway, this parameter specifies the destination port of the ECS instance to which traffic is mapped. Valid values: <strong>1</strong> to <strong>65535</strong>.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>80</p>
     */
    @NameInMap("InternalPort")
    public String internalPort;

    /**
     * <p>The protocol type. Valid values: </p>
     * <ul>
     * <li><p><strong>TCP</strong>: forwards TCP packets.   </p>
     * </li>
     * <li><p><strong>UDP</strong>: forwards UDP packets.   </p>
     * </li>
     * <li><p><strong>Any</strong>: forwards packets of all protocols. If <strong>IpProtocol</strong> is set to <strong>Any</strong>, <strong>ExternalPort</strong> and <strong>InternalPort</strong> must also be set to <strong>Any</strong> to implement DNAT IP mapping.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>TCP</p>
     */
    @NameInMap("IpProtocol")
    public String ipProtocol;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>Specifies whether to enable port breaking. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: enables port breaking.</p>
     * </li>
     * <li><p><strong>false</strong> (default): disables port breaking.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>If a DNAT entry and an SNAT entry use the same public IP address, and you want to configure a port number greater than 1024, set <strong>PortBreak</strong> to <strong>true</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("PortBreak")
    public Boolean portBreak;

    /**
     * <p>The region ID of the NAT gateway.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to query the region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
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

    public CreateForwardEntryRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
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
