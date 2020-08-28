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

    }

    public static class DescribePhysicalConnectionLOAResponsePhysicalConnectionLOATypePMInfo extends TeaModel {
        @NameInMap("PMInfo")
        @Validation(required = true)
        public java.util.List<DescribePhysicalConnectionLOAResponsePhysicalConnectionLOATypePMInfoPMInfo> PMInfo;

        public static DescribePhysicalConnectionLOAResponsePhysicalConnectionLOATypePMInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribePhysicalConnectionLOAResponsePhysicalConnectionLOATypePMInfo self = new DescribePhysicalConnectionLOAResponsePhysicalConnectionLOATypePMInfo();
            return TeaModel.build(map, self);
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

    }

}
