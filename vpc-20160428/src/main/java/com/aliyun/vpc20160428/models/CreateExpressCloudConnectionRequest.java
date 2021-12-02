// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateExpressCloudConnectionRequest extends TeaModel {
    @NameInMap("Bandwidth")
    public Integer bandwidth;

    @NameInMap("ContactMail")
    public String contactMail;

    @NameInMap("ContactTel")
    public String contactTel;

    @NameInMap("Description")
    public String description;

    @NameInMap("IDCardNo")
    public String IDCardNo;

    @NameInMap("IdcSP")
    public String idcSP;

    @NameInMap("Name")
    public String name;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("PeerCity")
    public String peerCity;

    @NameInMap("PeerLocation")
    public String peerLocation;

    @NameInMap("PortType")
    public String portType;

    @NameInMap("RedundantEccId")
    public String redundantEccId;

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
