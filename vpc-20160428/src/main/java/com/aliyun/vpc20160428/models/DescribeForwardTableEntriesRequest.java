// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeForwardTableEntriesRequest extends TeaModel {
    /**
     * <ul>
     * <li><p>If you query DNAT entries of an Internet NAT gateway, this parameter specifies the elastic IP address (EIP) that provides public network access in the DNAT entry.</p>
     * </li>
     * <li><p>If you query DNAT entries of a VPC NAT gateway, this parameter specifies the NAT IP address that is accessed by external networks.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>116.28.XX.XX</p>
     */
    @NameInMap("ExternalIp")
    public String externalIp;

    /**
     * <ul>
     * <li><p>If you query DNAT entries of an Internet NAT gateway, this parameter specifies the external port or port range used for port forwarding.</p>
     * <ul>
     * <li>The port range must be within <strong>1</strong> to <strong>65535</strong>.</li>
     * <li>To query a port range, separate the start and end ports with a forward slash (/), such as <code>10/20</code>.</li>
     * <li>If <strong>ExternalPort</strong> is set to a port range, <strong>InternalPort</strong> must also be set to a port range with the same number of ports. For example, if <strong>ExternalPort</strong> is set to <code>10/20</code>, <strong>InternalPort</strong> must be set to <code>80/90</code>.</li>
     * </ul>
     * </li>
     * <li><p>If you query DNAT entries of a VPC NAT gateway, this parameter specifies the port on the NAT IP address that is accessed by external networks. Valid values: <strong>1</strong> to <strong>65535</strong>.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>8080</p>
     */
    @NameInMap("ExternalPort")
    public String externalPort;

    /**
     * <p>The ID of the DNAT entry.</p>
     * 
     * <strong>example:</strong>
     * <p>fwd-8vbn3bc8roygjp0gy****</p>
     */
    @NameInMap("ForwardEntryId")
    public String forwardEntryId;

    /**
     * <p>The name of the DNAT entry.</p>
     * <p>The name must be 2 to 128 characters in length and must start with a letter or Chinese character. It can contain digits, underscores (_), and hyphens (-).</p>
     * 
     * <strong>example:</strong>
     * <p>ForwardEntry-1</p>
     */
    @NameInMap("ForwardEntryName")
    public String forwardEntryName;

    /**
     * <p>The ID of the DNAT table. </p>
     * <blockquote>
     * <p>You must specify at least one of <strong>ForwardTableId</strong> and <strong>NatGatewayId</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>ftb-bp1mbjubq34hlcqpa****</p>
     */
    @NameInMap("ForwardTableId")
    public String forwardTableId;

    /**
     * <p>The private IP address.</p>
     * <ul>
     * <li><p>If you query DNAT entries of an Internet NAT gateway, this parameter specifies the private IP address of the ECS instance that communicates with the Internet through the DNAT entry.</p>
     * </li>
     * <li><p>If you query DNAT entries of a VPC NAT gateway, this parameter specifies the private IP address that needs to communicate through the DNAT rule.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>192.168.XX.XX</p>
     */
    @NameInMap("InternalIp")
    public String internalIp;

    /**
     * <ul>
     * <li><p>If you query DNAT entries of an Internet NAT gateway, this parameter specifies the internal port or port range used for port forwarding. Valid values: <strong>1</strong> to <strong>65535</strong>.</p>
     * </li>
     * <li><p>If you query DNAT entries of a VPC NAT gateway, this parameter specifies the port of the destination ECS instance to be mapped. Valid values: <strong>1</strong> to <strong>65535</strong>.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>80</p>
     */
    @NameInMap("InternalPort")
    public String internalPort;

    /**
     * <p>The protocol type. Valid values:</p>
     * <ul>
     * <li><p><strong>tcp</strong>: forwards TCP packets.</p>
     * </li>
     * <li><p><strong>udp</strong>: forwards UDP packets.</p>
     * </li>
     * <li><p><strong>any</strong>: forwards packets of all protocols.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>tcp</p>
     */
    @NameInMap("IpProtocol")
    public String ipProtocol;

    /**
     * <p>The ID of the NAT gateway to query.</p>
     * <blockquote>
     * <p>You must specify at least one of <strong>ForwardTableId</strong> and <strong>NatGatewayId</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>ngw-bp1uewa15k4iy5770****</p>
     */
    @NameInMap("NatGatewayId")
    public String natGatewayId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The page number of the list. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page for a paged query. Maximum value: <strong>50</strong>. Default value: <strong>10</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

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

    public static DescribeForwardTableEntriesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeForwardTableEntriesRequest self = new DescribeForwardTableEntriesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeForwardTableEntriesRequest setExternalIp(String externalIp) {
        this.externalIp = externalIp;
        return this;
    }
    public String getExternalIp() {
        return this.externalIp;
    }

    public DescribeForwardTableEntriesRequest setExternalPort(String externalPort) {
        this.externalPort = externalPort;
        return this;
    }
    public String getExternalPort() {
        return this.externalPort;
    }

    public DescribeForwardTableEntriesRequest setForwardEntryId(String forwardEntryId) {
        this.forwardEntryId = forwardEntryId;
        return this;
    }
    public String getForwardEntryId() {
        return this.forwardEntryId;
    }

    public DescribeForwardTableEntriesRequest setForwardEntryName(String forwardEntryName) {
        this.forwardEntryName = forwardEntryName;
        return this;
    }
    public String getForwardEntryName() {
        return this.forwardEntryName;
    }

    public DescribeForwardTableEntriesRequest setForwardTableId(String forwardTableId) {
        this.forwardTableId = forwardTableId;
        return this;
    }
    public String getForwardTableId() {
        return this.forwardTableId;
    }

    public DescribeForwardTableEntriesRequest setInternalIp(String internalIp) {
        this.internalIp = internalIp;
        return this;
    }
    public String getInternalIp() {
        return this.internalIp;
    }

    public DescribeForwardTableEntriesRequest setInternalPort(String internalPort) {
        this.internalPort = internalPort;
        return this;
    }
    public String getInternalPort() {
        return this.internalPort;
    }

    public DescribeForwardTableEntriesRequest setIpProtocol(String ipProtocol) {
        this.ipProtocol = ipProtocol;
        return this;
    }
    public String getIpProtocol() {
        return this.ipProtocol;
    }

    public DescribeForwardTableEntriesRequest setNatGatewayId(String natGatewayId) {
        this.natGatewayId = natGatewayId;
        return this;
    }
    public String getNatGatewayId() {
        return this.natGatewayId;
    }

    public DescribeForwardTableEntriesRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeForwardTableEntriesRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeForwardTableEntriesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeForwardTableEntriesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeForwardTableEntriesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeForwardTableEntriesRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeForwardTableEntriesRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
