// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeForwardTableEntriesRequest extends TeaModel {
    /**
     * <ul>
     * <li>The elastic IP addresses (EIPs) that can be accessed over the Internet when you query DNAT entries of Internet NAT gateways.</li>
     * <li>The NAT IP addresses that can be accessed by external networks when you query DNAT entries of Virtual Private Cloud (VPC) NAT gateways.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>116.28.XX.XX</p>
     */
    @NameInMap("ExternalIp")
    public String externalIp;

    /**
     * <ul>
     * <li><p>The external port or port range that is used for port forwarding when you query DNAT entries of Internet NAT gateways.</p>
     * <ul>
     * <li>Valid values: <strong>1</strong> to <strong>65535</strong>.</li>
     * <li>If you want to query a port range, separate the first port and last port with a forward slash (/), such as <code>10/20</code>.</li>
     * <li>If you set <strong>ExternalPort</strong> to a port range, you must also set <strong>InternalPort</strong> to a port range, and the number of ports specified by these parameters must be the same. For example, if you set <strong>ExternalPort</strong> to <code>10/20</code>, you can set <strong>InternalPort</strong> to <code>80/90</code>.</li>
     * </ul>
     * </li>
     * <li><p>The port that is used when the NAT IP address can be accessed by external networks when you query DNAT entries of VPC NAT gateways. Valid values: <strong>1</strong> to <strong>65535</strong>.</p>
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
     * <p>The name must be 2 to 128 characters in length, and can contain digits, periods (.), underscores (_), and hyphens (-). It must start with a letter.</p>
     * 
     * <strong>example:</strong>
     * <p>ForwardEntry-1</p>
     */
    @NameInMap("ForwardEntryName")
    public String forwardEntryName;

    /**
     * <p>The ID of the DNAT table.</p>
     * <p>**</p>
     * <p><strong>Description</strong> You must specify at least one of <strong>ForwardTableId</strong> and <strong>NatGatewayId</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>ftb-bp1mbjubq34hlcqpa****</p>
     */
    @NameInMap("ForwardTableId")
    public String forwardTableId;

    /**
     * <p>The private IP address.</p>
     * <ul>
     * <li>The private IP address of the ECS instance that uses DNAT entries to communicate with the Internet when you query DNAT entries of Internet NAT gateways.</li>
     * <li>The private IP address that uses DNAT entries for communication when you query DNAT entries of VPC NAT gateways.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>192.168.XX.XX</p>
     */
    @NameInMap("InternalIp")
    public String internalIp;

    /**
     * <ul>
     * <li>The internal port or port range that is used for port forwarding when you query DNAT entries of Internet NAT gateways. Valid values: <strong>1</strong> to <strong>65535</strong>.</li>
     * <li>The port of the destination ECS instance to be mapped when you query DNAT entries of VPC NAT gateways. Valid values: <strong>1</strong> to <strong>65535</strong>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>80</p>
     */
    @NameInMap("InternalPort")
    public String internalPort;

    /**
     * <p>The protocol. Valid values:</p>
     * <ul>
     * <li><strong>TCP</strong></li>
     * <li><strong>UDP</strong></li>
     * <li><strong>Any</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>TCP</p>
     */
    @NameInMap("IpProtocol")
    public String ipProtocol;

    /**
     * <p>The ID of the NAT gateway.</p>
     * <p>**</p>
     * <p><strong>Description</strong> You must specify at least one of <strong>ForwardTableId</strong> and <strong>NatGatewayId</strong>.</p>
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
     * <p>The page number. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Maximum value: <strong>50</strong>. Default value: <strong>10</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the region where you want to create the NAT gateway.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to query the most recent region list.</p>
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
