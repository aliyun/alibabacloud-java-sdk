// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateForwardEntryRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can use the client to generate the value, but you must ensure that it is unique among different requests. The client token can contain only ASCII characters.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the system automatically uses the <strong>RequestId</strong> of the API request as the <strong>ClientToken</strong>. The <strong>RequestId</strong> of each API request may be different.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>0c593ea1-3bea-11e9-b96b-88e9fe6****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to perform a dry run for this request. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: performs a dry run without creating the DNAT entry. The system checks whether your AccessKey pair is valid, the authorization of the Resource Access Management (RAM) user, and whether the required parameters are specified. If the request fails the dry run, an error message is returned. If the request passes the dry run, the <code>DryRunOperation</code> error code is returned.</p>
     * </li>
     * <li><p><strong>false</strong> (default): sends a Normal request. If the request passes the dry run, a 2xx HTTP status code is returned and the DNAT entry is created.</p>
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
     * <li>If you configure a DNAT entry for an Internet NAT gateway, specify an elastic IP address (EIP) for public network access.</li>
     * <li>If you configure a DNAT entry for a VPC NAT gateway, specify a NAT IP address for external network access.</li>
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
     * <li><p>If you configure a DNAT entry for an Internet NAT gateway, specify the external port or port range for port forwarding.</p>
     * <ul>
     * <li>The port range must be from <strong>1</strong> to <strong>65535</strong>.</li>
     * <li>To forward traffic within a port range, separate the start port and the end port with a forward slash (/). Example: <code>10/20</code>.</li>
     * <li>If <strong>ExternalPort</strong> is set to a port range, <strong>InternalPort</strong> must also be set to a port range with the same number of ports. For example, if <strong>ExternalPort</strong> is set to <code>10/20</code>, <strong>InternalPort</strong> must be set to <code>80/90</code>.</li>
     * </ul>
     * </li>
     * <li><p>If you configure a DNAT entry for a VPC NAT gateway, specify the port on the NAT IP address that is accessed by the external network. Valid values: <strong>1</strong> to <strong>65535</strong>.</p>
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
     * <p>The name must be 2 to 128 characters in length, and must start with a letter or a Chinese character. It cannot start with <code>http://</code> or <code>https://</code>.</p>
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
     * <li><p>If you configure a DNAT entry for an Internet NAT gateway, specify the private IP address of the ECS instance that requires Internet communication. The private IP address must meet the following requirements: </p>
     * <ul>
     * <li><p>The private IP address must belong to the CIDR block of the VPC where the NAT gateway is deployed. </p>
     * </li>
     * <li><p>The private IP address must be used by an ECS instance, and the ECS instance must not be associated with an EIP. Otherwise, the DNAT entry does not take effect.</p>
     * </li>
     * </ul>
     * </li>
     * <li><p>If you configure a DNAT entry for a VPC NAT gateway, specify the private IP address that requires communication through the DNAT rule.</p>
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
     * <li><p>If you configure a DNAT entry for an Internet NAT gateway, specify the internal port or port range for port forwarding. Valid values: <strong>1</strong> to <strong>65535</strong>.</p>
     * </li>
     * <li><p>If you configure a DNAT entry for a VPC NAT gateway, specify the destination port of the ECS instance to be mapped. Valid values: <strong>1</strong> to <strong>65535</strong>.</p>
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
     * <p>If a DNAT entry and an SNAT entry use the same public IP address and you need to configure a port number greater than 1024, you must set <strong>PortBreak</strong> to <strong>true</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("PortBreak")
    public Boolean portBreak;

    /**
     * <p>The region ID of the NAT gateway.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to query region IDs.</p>
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
