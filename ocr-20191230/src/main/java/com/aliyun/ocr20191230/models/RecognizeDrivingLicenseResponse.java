// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr20191230.models;

import com.aliyun.tea.*;

public class RecognizeDrivingLicenseResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public RecognizeDrivingLicenseResponseData data;

    public static RecognizeDrivingLicenseResponse build(java.util.Map<String, ?> map) throws Exception {
        RecognizeDrivingLicenseResponse self = new RecognizeDrivingLicenseResponse();
        return TeaModel.build(map, self);
    }

    public static class RecognizeDrivingLicenseResponseDataFaceResult extends TeaModel {
        @NameInMap("PlateNumber")
        @Validation(required = true)
        public String plateNumber;

        @NameInMap("VehicleType")
        @Validation(required = true)
        public String vehicleType;

        @NameInMap("Owner")
        @Validation(required = true)
        public String owner;

        @NameInMap("UseCharacter")
        @Validation(required = true)
        public String useCharacter;

        @NameInMap("Address")
        @Validation(required = true)
        public String address;

        @NameInMap("Model")
        @Validation(required = true)
        public String model;

        @NameInMap("Vin")
        @Validation(required = true)
        public String vin;

        @NameInMap("EngineNumber")
        @Validation(required = true)
        public String engineNumber;

        @NameInMap("RegisterDate")
        @Validation(required = true)
        public String registerDate;

        @NameInMap("IssueDate")
        @Validation(required = true)
        public String issueDate;

        public static RecognizeDrivingLicenseResponseDataFaceResult build(java.util.Map<String, ?> map) throws Exception {
            RecognizeDrivingLicenseResponseDataFaceResult self = new RecognizeDrivingLicenseResponseDataFaceResult();
            return TeaModel.build(map, self);
        }

    }

    public static class RecognizeDrivingLicenseResponseDataBackResult extends TeaModel {
        @NameInMap("ApprovedPassengerCapacity")
        @Validation(required = true)
        public String approvedPassengerCapacity;

        @NameInMap("ApprovedLoad")
        @Validation(required = true)
        public String approvedLoad;

        @NameInMap("FileNumber")
        @Validation(required = true)
        public String fileNumber;

        @NameInMap("GrossMass")
        @Validation(required = true)
        public String grossMass;

        @NameInMap("EnergyType")
        @Validation(required = true)
        public String energyType;

        @NameInMap("InspectionRecord")
        @Validation(required = true)
        public String inspectionRecord;

        @NameInMap("OverallDimension")
        @Validation(required = true)
        public String overallDimension;

        @NameInMap("TractionMass")
        @Validation(required = true)
        public String tractionMass;

        @NameInMap("UnladenMass")
        @Validation(required = true)
        public String unladenMass;

        @NameInMap("PlateNumber")
        @Validation(required = true)
        public String plateNumber;

        public static RecognizeDrivingLicenseResponseDataBackResult build(java.util.Map<String, ?> map) throws Exception {
            RecognizeDrivingLicenseResponseDataBackResult self = new RecognizeDrivingLicenseResponseDataBackResult();
            return TeaModel.build(map, self);
        }

    }

    public static class RecognizeDrivingLicenseResponseData extends TeaModel {
        @NameInMap("FaceResult")
        @Validation(required = true)
        public RecognizeDrivingLicenseResponseDataFaceResult faceResult;

        @NameInMap("BackResult")
        @Validation(required = true)
        public RecognizeDrivingLicenseResponseDataBackResult backResult;

        public static RecognizeDrivingLicenseResponseData build(java.util.Map<String, ?> map) throws Exception {
            RecognizeDrivingLicenseResponseData self = new RecognizeDrivingLicenseResponseData();
            return TeaModel.build(map, self);
        }

    }

}
