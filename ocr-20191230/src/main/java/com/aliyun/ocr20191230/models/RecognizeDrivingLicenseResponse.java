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

    public RecognizeDrivingLicenseResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RecognizeDrivingLicenseResponse setData(RecognizeDrivingLicenseResponseData data) {
        this.data = data;
        return this;
    }
    public RecognizeDrivingLicenseResponseData getData() {
        return this.data;
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

        public RecognizeDrivingLicenseResponseDataFaceResult setPlateNumber(String plateNumber) {
            this.plateNumber = plateNumber;
            return this;
        }
        public String getPlateNumber() {
            return this.plateNumber;
        }

        public RecognizeDrivingLicenseResponseDataFaceResult setVehicleType(String vehicleType) {
            this.vehicleType = vehicleType;
            return this;
        }
        public String getVehicleType() {
            return this.vehicleType;
        }

        public RecognizeDrivingLicenseResponseDataFaceResult setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public RecognizeDrivingLicenseResponseDataFaceResult setUseCharacter(String useCharacter) {
            this.useCharacter = useCharacter;
            return this;
        }
        public String getUseCharacter() {
            return this.useCharacter;
        }

        public RecognizeDrivingLicenseResponseDataFaceResult setAddress(String address) {
            this.address = address;
            return this;
        }
        public String getAddress() {
            return this.address;
        }

        public RecognizeDrivingLicenseResponseDataFaceResult setModel(String model) {
            this.model = model;
            return this;
        }
        public String getModel() {
            return this.model;
        }

        public RecognizeDrivingLicenseResponseDataFaceResult setVin(String vin) {
            this.vin = vin;
            return this;
        }
        public String getVin() {
            return this.vin;
        }

        public RecognizeDrivingLicenseResponseDataFaceResult setEngineNumber(String engineNumber) {
            this.engineNumber = engineNumber;
            return this;
        }
        public String getEngineNumber() {
            return this.engineNumber;
        }

        public RecognizeDrivingLicenseResponseDataFaceResult setRegisterDate(String registerDate) {
            this.registerDate = registerDate;
            return this;
        }
        public String getRegisterDate() {
            return this.registerDate;
        }

        public RecognizeDrivingLicenseResponseDataFaceResult setIssueDate(String issueDate) {
            this.issueDate = issueDate;
            return this;
        }
        public String getIssueDate() {
            return this.issueDate;
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

        public RecognizeDrivingLicenseResponseDataBackResult setApprovedPassengerCapacity(String approvedPassengerCapacity) {
            this.approvedPassengerCapacity = approvedPassengerCapacity;
            return this;
        }
        public String getApprovedPassengerCapacity() {
            return this.approvedPassengerCapacity;
        }

        public RecognizeDrivingLicenseResponseDataBackResult setApprovedLoad(String approvedLoad) {
            this.approvedLoad = approvedLoad;
            return this;
        }
        public String getApprovedLoad() {
            return this.approvedLoad;
        }

        public RecognizeDrivingLicenseResponseDataBackResult setFileNumber(String fileNumber) {
            this.fileNumber = fileNumber;
            return this;
        }
        public String getFileNumber() {
            return this.fileNumber;
        }

        public RecognizeDrivingLicenseResponseDataBackResult setGrossMass(String grossMass) {
            this.grossMass = grossMass;
            return this;
        }
        public String getGrossMass() {
            return this.grossMass;
        }

        public RecognizeDrivingLicenseResponseDataBackResult setEnergyType(String energyType) {
            this.energyType = energyType;
            return this;
        }
        public String getEnergyType() {
            return this.energyType;
        }

        public RecognizeDrivingLicenseResponseDataBackResult setInspectionRecord(String inspectionRecord) {
            this.inspectionRecord = inspectionRecord;
            return this;
        }
        public String getInspectionRecord() {
            return this.inspectionRecord;
        }

        public RecognizeDrivingLicenseResponseDataBackResult setOverallDimension(String overallDimension) {
            this.overallDimension = overallDimension;
            return this;
        }
        public String getOverallDimension() {
            return this.overallDimension;
        }

        public RecognizeDrivingLicenseResponseDataBackResult setTractionMass(String tractionMass) {
            this.tractionMass = tractionMass;
            return this;
        }
        public String getTractionMass() {
            return this.tractionMass;
        }

        public RecognizeDrivingLicenseResponseDataBackResult setUnladenMass(String unladenMass) {
            this.unladenMass = unladenMass;
            return this;
        }
        public String getUnladenMass() {
            return this.unladenMass;
        }

        public RecognizeDrivingLicenseResponseDataBackResult setPlateNumber(String plateNumber) {
            this.plateNumber = plateNumber;
            return this;
        }
        public String getPlateNumber() {
            return this.plateNumber;
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

        public RecognizeDrivingLicenseResponseData setFaceResult(RecognizeDrivingLicenseResponseDataFaceResult faceResult) {
            this.faceResult = faceResult;
            return this;
        }
        public RecognizeDrivingLicenseResponseDataFaceResult getFaceResult() {
            return this.faceResult;
        }

        public RecognizeDrivingLicenseResponseData setBackResult(RecognizeDrivingLicenseResponseDataBackResult backResult) {
            this.backResult = backResult;
            return this;
        }
        public RecognizeDrivingLicenseResponseDataBackResult getBackResult() {
            return this.backResult;
        }

    }

}
