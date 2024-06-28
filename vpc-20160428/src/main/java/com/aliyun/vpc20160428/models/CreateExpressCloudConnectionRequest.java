// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateExpressCloudConnectionRequest extends TeaModel {
    /**
     * <p>The bandwidth for ECC, which corresponds to the bandwidth for the underlying circuit.</p>
     * <p>Unit: Mbit/s.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("Bandwidth")
    public Integer bandwidth;

    /**
     * <p>The email address of the contact who applies for ECC.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="mailto:XX@example.com">XX@example.com</a></p>
     */
    @NameInMap("ContactMail")
    public String contactMail;

    /**
     * <p>The phone number of the contact who applies for ECC.</p>
     * 
     * <strong>example:</strong>
     * <p>132*********</p>
     */
    @NameInMap("ContactTel")
    public String contactTel;

    /**
     * <p>The description of ECC.</p>
     * <p>The description must be 2 to 256 characters in length. It must start with a letter but cannot start with <code>http://</code> or <code>https://</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>ECC</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The ID card number of the contact who applies for ECC.</p>
     * 
     * <strong>example:</strong>
     * <p>32*****************</p>
     */
    @NameInMap("IDCardNo")
    public String IDCardNo;

    /**
     * <p>The Internet service provider (ISP) for the data center.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>CU</p>
     */
    @NameInMap("IdcSP")
    public String idcSP;

    /**
     * <p>The name of the ECC instance.</p>
     * <p>The name must be 2 to 128 characters in length and can contain letters, digits, periods (.), underscores (_), and hyphens (-). It must start with a letter but cannot start with <code>http://</code> or <code>https://</code>.</p>
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
     * <p>The city where the data center is located.</p>
     * 
     * <strong>example:</strong>
     * <p>Hangzhou</p>
     */
    @NameInMap("PeerCity")
    public String peerCity;

    /**
     * <p>The geographical location of the data center.</p>
     * <blockquote>
     * <p>It must be accurate to house number-floor-room number-server rack number.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>\*\<em>city\</em>\<em>district/county\</em>\<em>road\</em>\<em>number\</em>\<em>property or building name\</em>\<em>building\</em>\<em>floor\</em>\<em>room number\</em>\<em>server rack number\</em>\<em>server rack name\</em>\<em>device\</em>\*port</p>
     */
    @NameInMap("PeerLocation")
    public String peerLocation;

    /**
     * <p>The port of the Express Connect circuit. Valid values:</p>
     * <ul>
     * <li>100Base-T</li>
     * <li>1000Base-T</li>
     * <li>1000Base-LX</li>
     * <li>10GBase-T</li>
     * <li>10GBase-LR</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>100Base-T</p>
     */
    @NameInMap("PortType")
    public String portType;

    /**
     * <p>The ID of the standby Express Connect circuit.</p>
     * 
     * <strong>example:</strong>
     * <p>ecc-d****</p>
     */
    @NameInMap("RedundantEccId")
    public String redundantEccId;

    /**
     * <p>The region ID of the ECC instance.</p>
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
