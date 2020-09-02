// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateExpressCloudConnectionRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("Name")
    public String name;

    @NameInMap("Description")
    public String description;

    @NameInMap("PeerCity")
    public String peerCity;

    @NameInMap("PeerLocation")
    @Validation(required = true)
    public String peerLocation;

    @NameInMap("IdcSP")
    @Validation(required = true)
    public String idcSP;

    @NameInMap("PortType")
    public String portType;

    @NameInMap("Bandwidth")
    @Validation(required = true)
    public Integer bandwidth;

    @NameInMap("ContactTel")
    public String contactTel;

    @NameInMap("ContactMail")
    public String contactMail;

    @NameInMap("IDCardNo")
    public String IDCardNo;

    @NameInMap("RedundantEccId")
    public String redundantEccId;

    public static CreateExpressCloudConnectionRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateExpressCloudConnectionRequest self = new CreateExpressCloudConnectionRequest();
        return TeaModel.build(map, self);
    }

    public CreateExpressCloudConnectionRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateExpressCloudConnectionRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateExpressCloudConnectionRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
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

    public CreateExpressCloudConnectionRequest setIdcSP(String idcSP) {
        this.idcSP = idcSP;
        return this;
    }
    public String getIdcSP() {
        return this.idcSP;
    }

    public CreateExpressCloudConnectionRequest setPortType(String portType) {
        this.portType = portType;
        return this;
    }
    public String getPortType() {
        return this.portType;
    }

    public CreateExpressCloudConnectionRequest setBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }
    public Integer getBandwidth() {
        return this.bandwidth;
    }

    public CreateExpressCloudConnectionRequest setContactTel(String contactTel) {
        this.contactTel = contactTel;
        return this;
    }
    public String getContactTel() {
        return this.contactTel;
    }

    public CreateExpressCloudConnectionRequest setContactMail(String contactMail) {
        this.contactMail = contactMail;
        return this;
    }
    public String getContactMail() {
        return this.contactMail;
    }

    public CreateExpressCloudConnectionRequest setIDCardNo(String IDCardNo) {
        this.IDCardNo = IDCardNo;
        return this;
    }
    public String getIDCardNo() {
        return this.IDCardNo;
    }

    public CreateExpressCloudConnectionRequest setRedundantEccId(String redundantEccId) {
        this.redundantEccId = redundantEccId;
        return this;
    }
    public String getRedundantEccId() {
        return this.redundantEccId;
    }

}
