// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ApplyPhysicalConnectionLOARequest extends TeaModel {
    // description: Optional. The token used for client authentication.; 
    @NameInMap("ClientToken")
    public String clientToken;

    // description: The ID of the region to which the physical connection interface belongs.; 
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    // description: Optional. The bandwidth value of the physical connection.; 
    @NameInMap("Bandwidth")
    public Integer bandwidth;

    // description: The location where the leased line is deployed.; 
    @NameInMap("PeerLocation")
    public String peerLocation;

    // description: The instance ID of the physical connection interface.; 
    @NameInMap("InstanceId")
    @Validation(required = true)
    public String instanceId;

    // description: The name of the company that requires the physical connection.; 
    @NameInMap("CompanyName")
    @Validation(required = true)
    public String companyName;

    // description: The type of leased line. ; 
    @NameInMap("LineType")
    @Validation(required = true)
    public String lineType;

    // description: The name of the installation company.; 
    @NameInMap("Si")
    @Validation(required = true)
    public String si;

    // description: The date and time when the data cable installation technician or representative will go to the installation site.; 
    @NameInMap("ConstructionTime")
    @Validation(required = true)
    public String constructionTime;

    @NameInMap("PMInfo")
    public java.util.List<ApplyPhysicalConnectionLOARequestPMInfo> PMInfo;

    public static ApplyPhysicalConnectionLOARequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyPhysicalConnectionLOARequest self = new ApplyPhysicalConnectionLOARequest();
        return TeaModel.build(map, self);
    }

    public ApplyPhysicalConnectionLOARequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ApplyPhysicalConnectionLOARequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ApplyPhysicalConnectionLOARequest setBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }
    public Integer getBandwidth() {
        return this.bandwidth;
    }

    public ApplyPhysicalConnectionLOARequest setPeerLocation(String peerLocation) {
        this.peerLocation = peerLocation;
        return this;
    }
    public String getPeerLocation() {
        return this.peerLocation;
    }

    public ApplyPhysicalConnectionLOARequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ApplyPhysicalConnectionLOARequest setCompanyName(String companyName) {
        this.companyName = companyName;
        return this;
    }
    public String getCompanyName() {
        return this.companyName;
    }

    public ApplyPhysicalConnectionLOARequest setLineType(String lineType) {
        this.lineType = lineType;
        return this;
    }
    public String getLineType() {
        return this.lineType;
    }

    public ApplyPhysicalConnectionLOARequest setSi(String si) {
        this.si = si;
        return this;
    }
    public String getSi() {
        return this.si;
    }

    public ApplyPhysicalConnectionLOARequest setConstructionTime(String constructionTime) {
        this.constructionTime = constructionTime;
        return this;
    }
    public String getConstructionTime() {
        return this.constructionTime;
    }

    public ApplyPhysicalConnectionLOARequest setPMInfo(java.util.List<ApplyPhysicalConnectionLOARequestPMInfo> PMInfo) {
        this.PMInfo = PMInfo;
        return this;
    }
    public java.util.List<ApplyPhysicalConnectionLOARequestPMInfo> getPMInfo() {
        return this.PMInfo;
    }

    public static class ApplyPhysicalConnectionLOARequestPMInfo extends TeaModel {
        @NameInMap("PMName")
        @Validation(required = true)
        public String PMName;

        @NameInMap("PMContactInfo")
        @Validation(required = true)
        public String PMContactInfo;

        @NameInMap("PMCertificateType")
        @Validation(required = true)
        public String PMCertificateType;

        @NameInMap("PMCertificateNo")
        @Validation(required = true)
        public String PMCertificateNo;

        @NameInMap("PMGender")
        @Validation(required = true)
        public String PMGender;

        public static ApplyPhysicalConnectionLOARequestPMInfo build(java.util.Map<String, ?> map) throws Exception {
            ApplyPhysicalConnectionLOARequestPMInfo self = new ApplyPhysicalConnectionLOARequestPMInfo();
            return TeaModel.build(map, self);
        }

        public ApplyPhysicalConnectionLOARequestPMInfo setPMName(String PMName) {
            this.PMName = PMName;
            return this;
        }
        public String getPMName() {
            return this.PMName;
        }

        public ApplyPhysicalConnectionLOARequestPMInfo setPMContactInfo(String PMContactInfo) {
            this.PMContactInfo = PMContactInfo;
            return this;
        }
        public String getPMContactInfo() {
            return this.PMContactInfo;
        }

        public ApplyPhysicalConnectionLOARequestPMInfo setPMCertificateType(String PMCertificateType) {
            this.PMCertificateType = PMCertificateType;
            return this;
        }
        public String getPMCertificateType() {
            return this.PMCertificateType;
        }

        public ApplyPhysicalConnectionLOARequestPMInfo setPMCertificateNo(String PMCertificateNo) {
            this.PMCertificateNo = PMCertificateNo;
            return this;
        }
        public String getPMCertificateNo() {
            return this.PMCertificateNo;
        }

        public ApplyPhysicalConnectionLOARequestPMInfo setPMGender(String PMGender) {
            this.PMGender = PMGender;
            return this;
        }
        public String getPMGender() {
            return this.PMGender;
        }

    }

}
