// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateExpressCloudConnectionRequest extends TeaModel {
    /**
     * <p>The bandwidth of the Express Cloud Connection instance, which corresponds to the bandwidth of the underlying physical connection.</p>
     * <p>Unit: Mbit/s.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("Bandwidth")
    public Integer bandwidth;

    /**
     * <p>The email address of the contact person for the Express Cloud Connection application.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="mailto:XX@example.com">XX@example.com</a></p>
     */
    @NameInMap("ContactMail")
    public String contactMail;

    /**
     * <p>The phone number of the contact person for the Express Cloud Connection application.</p>
     * 
     * <strong>example:</strong>
     * <p>132*********</p>
     */
    @NameInMap("ContactTel")
    public String contactTel;

    /**
     * <p>The description of the Express Cloud Connection instance.</p>
     * <p>The description must be 2 to 256 characters in length and must start with a letter or a Chinese character, but cannot start with <code>http://</code> or <code>https://</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>高速上云服务</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The ID card number of the contact person for the Express Cloud Connection application.</p>
     * 
     * <strong>example:</strong>
     * <p>32*****************</p>
     */
    @NameInMap("IDCardNo")
    public String IDCardNo;

    /**
     * <p>The network service provider of the IDC.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>CU</p>
     */
    @NameInMap("IdcSP")
    public String idcSP;

    /**
     * <p>The name of the Express Cloud Connection instance.</p>
     * <p>The name must be 2 to 128 characters in length and must start with a letter or a Chinese character. It can contain digits, periods (.), underscores (_), and hyphens (-), but cannot start with <code>http://</code> or <code>https://</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>doctest</p>
     */
    @NameInMap("Name")
    public String name;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The city where the on-premises IDC is located.</p>
     * 
     * <strong>example:</strong>
     * <p>杭州</p>
     */
    @NameInMap("PeerCity")
    public String peerCity;

    /**
     * <p>The geographic location of the on-premises data center.</p>
     * <blockquote>
     * <p>The location must be accurate to the street number, floor, room number, and rack number.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><strong>市</strong>区/县<strong>路</strong>号<strong>物业或楼宇名称</strong>座<strong>楼层</strong>房间号<strong>机柜号</strong>机柜名称<strong>设备</strong>端口</p>
     */
    @NameInMap("PeerLocation")
    public String peerLocation;

    /**
     * <p>The port type of the Express Connect circuit. Valid values:</p>
     * <ul>
     * <li><p>100Base-T: 100M Ethernet port</p>
     * </li>
     * <li><p>1000Base-T (default): GE electrical port</p>
     * </li>
     * <li><p>1000Base-LX: GE single-mode optical port (10 km)</p>
     * </li>
     * <li><p>10GBase-T: 10 GE electrical port</p>
     * </li>
     * <li><p>10GBase-LR: 10 GE single-mode optical port (10 km)</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>100Base-T</p>
     */
    @NameInMap("PortType")
    public String portType;

    /**
     * <p>The instance ID of the redundant Express Cloud Connection circuit.</p>
     * 
     * <strong>example:</strong>
     * <p>ecc-d****</p>
     */
    @NameInMap("RedundantEccId")
    public String redundantEccId;

    /**
     * <p>The region ID of the Express Cloud Connection instance.</p>
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

    public static CreateExpressCloudConnectionRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateExpressCloudConnectionRequest self = new CreateExpressCloudConnectionRequest();
        return TeaModel.build(map, self);
    }

    public CreateExpressCloudConnectionRequest setBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }
    public Integer getBandwidth() {
        return this.bandwidth;
    }

    public CreateExpressCloudConnectionRequest setContactMail(String contactMail) {
        this.contactMail = contactMail;
        return this;
    }
    public String getContactMail() {
        return this.contactMail;
    }

    public CreateExpressCloudConnectionRequest setContactTel(String contactTel) {
        this.contactTel = contactTel;
        return this;
    }
    public String getContactTel() {
        return this.contactTel;
    }

    public CreateExpressCloudConnectionRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateExpressCloudConnectionRequest setIDCardNo(String IDCardNo) {
        this.IDCardNo = IDCardNo;
        return this;
    }
    public String getIDCardNo() {
        return this.IDCardNo;
    }

    public CreateExpressCloudConnectionRequest setIdcSP(String idcSP) {
        this.idcSP = idcSP;
        return this;
    }
    public String getIdcSP() {
        return this.idcSP;
    }

    public CreateExpressCloudConnectionRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateExpressCloudConnectionRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateExpressCloudConnectionRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateExpressCloudConnectionRequest setPeerCity(String peerCity) {
        this.peerCity = peerCity;
        return this;
    }
    public String getPeerCity() {
        return this.peerCity;
    }

    public CreateExpressCloudConnectionRequest setPeerLocation(String peerLocation) {
        this.peerLocation = peerLocation;
        return this;
    }
    public String getPeerLocation() {
        return this.peerLocation;
    }

    public CreateExpressCloudConnectionRequest setPortType(String portType) {
        this.portType = portType;
        return this;
    }
    public String getPortType() {
        return this.portType;
    }

    public CreateExpressCloudConnectionRequest setRedundantEccId(String redundantEccId) {
        this.redundantEccId = redundantEccId;
        return this;
    }
    public String getRedundantEccId() {
        return this.redundantEccId;
    }

    public CreateExpressCloudConnectionRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateExpressCloudConnectionRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateExpressCloudConnectionRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
