// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class SecondApplyPhysicalConnectionLOARequest extends TeaModel {
    @NameInMap("Bandwidth")
    public Integer bandwidth;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("CompanyName")
    public String companyName;

    @NameInMap("ConstructionTime")
    public String constructionTime;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("LineType")
    public String lineType;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("PMInfo")
    public java.util.List<SecondApplyPhysicalConnectionLOARequestPMInfo> PMInfo;

    @NameInMap("PeerLocation")
    public String peerLocation;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("Si")
    public String si;

    public static SecondApplyPhysicalConnectionLOARequest build(java.util.Map<String, ?> map) throws Exception {
        SecondApplyPhysicalConnectionLOARequest self = new SecondApplyPhysicalConnectionLOARequest();
        return TeaModel.build(map, self);
    }

    public SecondApplyPhysicalConnectionLOARequest setBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }
    public Integer getBandwidth() {
        return this.bandwidth;
    }

    public SecondApplyPhysicalConnectionLOARequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public SecondApplyPhysicalConnectionLOARequest setCompanyName(String companyName) {
        this.companyName = companyName;
        return this;
    }
    public String getCompanyName() {
        return this.companyName;
    }

    public SecondApplyPhysicalConnectionLOARequest setConstructionTime(String constructionTime) {
        this.constructionTime = constructionTime;
        return this;
    }
    public String getConstructionTime() {
        return this.constructionTime;
    }

    public SecondApplyPhysicalConnectionLOARequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public SecondApplyPhysicalConnectionLOARequest setLineType(String lineType) {
        this.lineType = lineType;
        return this;
    }
    public String getLineType() {
        return this.lineType;
    }

    public SecondApplyPhysicalConnectionLOARequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public SecondApplyPhysicalConnectionLOARequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public SecondApplyPhysicalConnectionLOARequest setPMInfo(java.util.List<SecondApplyPhysicalConnectionLOARequestPMInfo> PMInfo) {
        this.PMInfo = PMInfo;
        return this;
    }
    public java.util.List<SecondApplyPhysicalConnectionLOARequestPMInfo> getPMInfo() {
        return this.PMInfo;
    }

    public SecondApplyPhysicalConnectionLOARequest setPeerLocation(String peerLocation) {
        this.peerLocation = peerLocation;
        return this;
    }
    public String getPeerLocation() {
        return this.peerLocation;
    }

    public SecondApplyPhysicalConnectionLOARequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public SecondApplyPhysicalConnectionLOARequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public SecondApplyPhysicalConnectionLOARequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public SecondApplyPhysicalConnectionLOARequest setSi(String si) {
        this.si = si;
        return this;
    }
    public String getSi() {
        return this.si;
    }

    public static class SecondApplyPhysicalConnectionLOARequestPMInfo extends TeaModel {
        @NameInMap("PMCertificateNo")
        public String PMCertificateNo;

        @NameInMap("PMCertificateType")
        public String PMCertificateType;

        @NameInMap("PMContactInfo")
        public String PMContactInfo;

        @NameInMap("PMGender")
        public String PMGender;

        @NameInMap("PMName")
        public String PMName;

        public static SecondApplyPhysicalConnectionLOARequestPMInfo build(java.util.Map<String, ?> map) throws Exception {
            SecondApplyPhysicalConnectionLOARequestPMInfo self = new SecondApplyPhysicalConnectionLOARequestPMInfo();
            return TeaModel.build(map, self);
        }

        public SecondApplyPhysicalConnectionLOARequestPMInfo setPMCertificateNo(String PMCertificateNo) {
            this.PMCertificateNo = PMCertificateNo;
            return this;
        }
        public String getPMCertificateNo() {
            return this.PMCertificateNo;
        }

        public SecondApplyPhysicalConnectionLOARequestPMInfo setPMCertificateType(String PMCertificateType) {
            this.PMCertificateType = PMCertificateType;
            return this;
        }
        public String getPMCertificateType() {
            return this.PMCertificateType;
        }

        public SecondApplyPhysicalConnectionLOARequestPMInfo setPMContactInfo(String PMContactInfo) {
            this.PMContactInfo = PMContactInfo;
            return this;
        }
        public String getPMContactInfo() {
            return this.PMContactInfo;
        }

        public SecondApplyPhysicalConnectionLOARequestPMInfo setPMGender(String PMGender) {
            this.PMGender = PMGender;
            return this;
        }
        public String getPMGender() {
            return this.PMGender;
        }

        public SecondApplyPhysicalConnectionLOARequestPMInfo setPMName(String PMName) {
            this.PMName = PMName;
            return this;
        }
        public String getPMName() {
            return this.PMName;
        }

    }

}
