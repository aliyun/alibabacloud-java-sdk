// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribePhysicalConnectionLOAResponse extends TeaModel {
    // description: The ID of the request. ; 
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    // description: The LOA information of the physical connection. 
    @NameInMap("PhysicalConnectionLOAType")
    @Validation(required = true)
    public DescribePhysicalConnectionLOAResponsePhysicalConnectionLOAType physicalConnectionLOAType;

    public static DescribePhysicalConnectionLOAResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePhysicalConnectionLOAResponse self = new DescribePhysicalConnectionLOAResponse();
        return TeaModel.build(map, self);
    }

    public DescribePhysicalConnectionLOAResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribePhysicalConnectionLOAResponse setPhysicalConnectionLOAType(DescribePhysicalConnectionLOAResponsePhysicalConnectionLOAType physicalConnectionLOAType) {
        this.physicalConnectionLOAType = physicalConnectionLOAType;
        return this;
    }
    public DescribePhysicalConnectionLOAResponsePhysicalConnectionLOAType getPhysicalConnectionLOAType() {
        return this.physicalConnectionLOAType;
    }

    public static class DescribePhysicalConnectionLOAResponsePhysicalConnectionLOATypePMInfoPMInfo extends TeaModel {
        // description: The name of the data center cable installation technician or representative. ; 
        @NameInMap("PMName")
        @Validation(required = true)
        public String PMName;

        // description: The contact information of the data center cable installation technician or representative. ; 
        @NameInMap("PMContactInfo")
        @Validation(required = true)
        public String PMContactInfo;

        // description: The type of certificate or licence held by the data center cable installation technician or representative. ; 
        @NameInMap("PMCertificateType")
        @Validation(required = true)
        public String PMCertificateType;

        // description: The certificate or licence number of the data center cable installation technician or representative.; 
        @NameInMap("PMCertificateNo")
        @Validation(required = true)
        public String PMCertificateNo;

        // description: The gender of the data center cable installation technician or representative.; 
        @NameInMap("PMGender")
        @Validation(required = true)
        public String PMGender;

        public static DescribePhysicalConnectionLOAResponsePhysicalConnectionLOATypePMInfoPMInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribePhysicalConnectionLOAResponsePhysicalConnectionLOATypePMInfoPMInfo self = new DescribePhysicalConnectionLOAResponsePhysicalConnectionLOATypePMInfoPMInfo();
            return TeaModel.build(map, self);
        }

        public DescribePhysicalConnectionLOAResponsePhysicalConnectionLOATypePMInfoPMInfo setPMName(String PMName) {
            this.PMName = PMName;
            return this;
        }
        public String getPMName() {
            return this.PMName;
        }

        public DescribePhysicalConnectionLOAResponsePhysicalConnectionLOATypePMInfoPMInfo setPMContactInfo(String PMContactInfo) {
            this.PMContactInfo = PMContactInfo;
            return this;
        }
        public String getPMContactInfo() {
            return this.PMContactInfo;
        }

        public DescribePhysicalConnectionLOAResponsePhysicalConnectionLOATypePMInfoPMInfo setPMCertificateType(String PMCertificateType) {
            this.PMCertificateType = PMCertificateType;
            return this;
        }
        public String getPMCertificateType() {
            return this.PMCertificateType;
        }

        public DescribePhysicalConnectionLOAResponsePhysicalConnectionLOATypePMInfoPMInfo setPMCertificateNo(String PMCertificateNo) {
            this.PMCertificateNo = PMCertificateNo;
            return this;
        }
        public String getPMCertificateNo() {
            return this.PMCertificateNo;
        }

        public DescribePhysicalConnectionLOAResponsePhysicalConnectionLOATypePMInfoPMInfo setPMGender(String PMGender) {
            this.PMGender = PMGender;
            return this;
        }
        public String getPMGender() {
            return this.PMGender;
        }

    }

    public static class DescribePhysicalConnectionLOAResponsePhysicalConnectionLOATypePMInfo extends TeaModel {
        @NameInMap("PMInfo")
        @Validation(required = true)
        public java.util.List<DescribePhysicalConnectionLOAResponsePhysicalConnectionLOATypePMInfoPMInfo> PMInfo;

        public static DescribePhysicalConnectionLOAResponsePhysicalConnectionLOATypePMInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribePhysicalConnectionLOAResponsePhysicalConnectionLOATypePMInfo self = new DescribePhysicalConnectionLOAResponsePhysicalConnectionLOATypePMInfo();
            return TeaModel.build(map, self);
        }

        public DescribePhysicalConnectionLOAResponsePhysicalConnectionLOATypePMInfo setPMInfo(java.util.List<DescribePhysicalConnectionLOAResponsePhysicalConnectionLOATypePMInfoPMInfo> PMInfo) {
            this.PMInfo = PMInfo;
            return this;
        }
        public java.util.List<DescribePhysicalConnectionLOAResponsePhysicalConnectionLOATypePMInfoPMInfo> getPMInfo() {
            return this.PMInfo;
        }

    }

    public static class DescribePhysicalConnectionLOAResponsePhysicalConnectionLOAType extends TeaModel {
        // description: The instance ID of the physical connection interface. ; 
        @NameInMap("InstanceId")
        @Validation(required = true)
        public String instanceId;

        // description: The name of the company that requires the leased line. ; 
        @NameInMap("CompanyName")
        @Validation(required = true)
        public String companyName;

        // description: The company name that you set when you registered your account.; 
        @NameInMap("CompanyLocalizedName")
        @Validation(required = true)
        public String companyLocalizedName;

        // description: The type of the physical connection.Valid values:* MSTP* Other * SDH* MPLSVPN * FIBRE; 
        @NameInMap("LineType")
        @Validation(required = true)
        public String lineType;

        // description: The number of leased line.; 
        @NameInMap("LineCode")
        @Validation(required = true)
        public String lineCode;

        // description: The label numbers of the cables at the installation site.; 
        @NameInMap("LineLabel")
        @Validation(required = true)
        public String lineLabel;

        // description: The time when the the data center cable installation technician or representative will go to the installation site.; 
        @NameInMap("ConstructionTime")
        @Validation(required = true)
        public String constructionTime;

        // description: The status of the physical connection interface. ; 
        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        // description: The URL to use to download the LOA file.; 
        @NameInMap("LoaUrl")
        @Validation(required = true)
        public String loaUrl;

        // description: The name of the data center cable installation company. ; 
        @NameInMap("SI")
        @Validation(required = true)
        public String SI;

        // description: The information about the data center cable installation technician or representative.
        @NameInMap("PMInfo")
        @Validation(required = true)
        public DescribePhysicalConnectionLOAResponsePhysicalConnectionLOATypePMInfo PMInfo;

        public static DescribePhysicalConnectionLOAResponsePhysicalConnectionLOAType build(java.util.Map<String, ?> map) throws Exception {
            DescribePhysicalConnectionLOAResponsePhysicalConnectionLOAType self = new DescribePhysicalConnectionLOAResponsePhysicalConnectionLOAType();
            return TeaModel.build(map, self);
        }

        public DescribePhysicalConnectionLOAResponsePhysicalConnectionLOAType setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribePhysicalConnectionLOAResponsePhysicalConnectionLOAType setCompanyName(String companyName) {
            this.companyName = companyName;
            return this;
        }
        public String getCompanyName() {
            return this.companyName;
        }

        public DescribePhysicalConnectionLOAResponsePhysicalConnectionLOAType setCompanyLocalizedName(String companyLocalizedName) {
            this.companyLocalizedName = companyLocalizedName;
            return this;
        }
        public String getCompanyLocalizedName() {
            return this.companyLocalizedName;
        }

        public DescribePhysicalConnectionLOAResponsePhysicalConnectionLOAType setLineType(String lineType) {
            this.lineType = lineType;
            return this;
        }
        public String getLineType() {
            return this.lineType;
        }

        public DescribePhysicalConnectionLOAResponsePhysicalConnectionLOAType setLineCode(String lineCode) {
            this.lineCode = lineCode;
            return this;
        }
        public String getLineCode() {
            return this.lineCode;
        }

        public DescribePhysicalConnectionLOAResponsePhysicalConnectionLOAType setLineLabel(String lineLabel) {
            this.lineLabel = lineLabel;
            return this;
        }
        public String getLineLabel() {
            return this.lineLabel;
        }

        public DescribePhysicalConnectionLOAResponsePhysicalConnectionLOAType setConstructionTime(String constructionTime) {
            this.constructionTime = constructionTime;
            return this;
        }
        public String getConstructionTime() {
            return this.constructionTime;
        }

        public DescribePhysicalConnectionLOAResponsePhysicalConnectionLOAType setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribePhysicalConnectionLOAResponsePhysicalConnectionLOAType setLoaUrl(String loaUrl) {
            this.loaUrl = loaUrl;
            return this;
        }
        public String getLoaUrl() {
            return this.loaUrl;
        }

        public DescribePhysicalConnectionLOAResponsePhysicalConnectionLOAType setSI(String SI) {
            this.SI = SI;
            return this;
        }
        public String getSI() {
            return this.SI;
        }

        public DescribePhysicalConnectionLOAResponsePhysicalConnectionLOAType setPMInfo(DescribePhysicalConnectionLOAResponsePhysicalConnectionLOATypePMInfo PMInfo) {
            this.PMInfo = PMInfo;
            return this;
        }
        public DescribePhysicalConnectionLOAResponsePhysicalConnectionLOATypePMInfo getPMInfo() {
            return this.PMInfo;
        }

    }

}
