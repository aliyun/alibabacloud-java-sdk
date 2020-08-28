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

    }

}
