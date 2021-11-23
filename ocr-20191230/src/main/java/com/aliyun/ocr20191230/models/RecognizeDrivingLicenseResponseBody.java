// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr20191230.models;

import com.aliyun.tea.*;

public class RecognizeDrivingLicenseResponseBody extends TeaModel {
    @NameInMap("Data")
    public RecognizeDrivingLicenseResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static RecognizeDrivingLicenseResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RecognizeDrivingLicenseResponseBody self = new RecognizeDrivingLicenseResponseBody();
        return TeaModel.build(map, self);
    }

    public RecognizeDrivingLicenseResponseBody setData(RecognizeDrivingLicenseResponseBodyData data) {
        this.data = data;
        return this;
    }
    public RecognizeDrivingLicenseResponseBodyData getData() {
        return this.data;
    }

    public RecognizeDrivingLicenseResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class RecognizeDrivingLicenseResponseBodyDataBackResult extends TeaModel {
        @NameInMap("ApprovedLoad")
        public String approvedLoad;

        @NameInMap("ApprovedPassengerCapacity")
        public String approvedPassengerCapacity;

        @NameInMap("EnergyType")
        public String energyType;

        @NameInMap("FileNumber")
        public String fileNumber;

        @NameInMap("GrossMass")
        public String grossMass;

        @NameInMap("InspectionRecord")
        public String inspectionRecord;

        @NameInMap("OverallDimension")
        public String overallDimension;

        @NameInMap("PlateNumber")
        public String plateNumber;

        @NameInMap("TractionMass")
        public String tractionMass;

        @NameInMap("UnladenMass")
        public String unladenMass;

        public static RecognizeDrivingLicenseResponseBodyDataBackResult build(java.util.Map<String, ?> map) throws Exception {
            RecognizeDrivingLicenseResponseBodyDataBackResult self = new RecognizeDrivingLicenseResponseBodyDataBackResult();
            return TeaModel.build(map, self);
        }

        public RecognizeDrivingLicenseResponseBodyDataBackResult setApprovedLoad(String approvedLoad) {
            this.approvedLoad = approvedLoad;
            return this;
        }
        public String getApprovedLoad() {
            return this.approvedLoad;
        }

        public RecognizeDrivingLicenseResponseBodyDataBackResult setApprovedPassengerCapacity(String approvedPassengerCapacity) {
            this.approvedPassengerCapacity = approvedPassengerCapacity;
            return this;
        }
        public String getApprovedPassengerCapacity() {
            return this.approvedPassengerCapacity;
        }

        public RecognizeDrivingLicenseResponseBodyDataBackResult setEnergyType(String energyType) {
            this.energyType = energyType;
            return this;
        }
        public String getEnergyType() {
            return this.energyType;
        }

        public RecognizeDrivingLicenseResponseBodyDataBackResult setFileNumber(String fileNumber) {
            this.fileNumber = fileNumber;
            return this;
        }
        public String getFileNumber() {
            return this.fileNumber;
        }

        public RecognizeDrivingLicenseResponseBodyDataBackResult setGrossMass(String grossMass) {
            this.grossMass = grossMass;
            return this;
        }
        public String getGrossMass() {
            return this.grossMass;
        }

        public RecognizeDrivingLicenseResponseBodyDataBackResult setInspectionRecord(String inspectionRecord) {
            this.inspectionRecord = inspectionRecord;
            return this;
        }
        public String getInspectionRecord() {
            return this.inspectionRecord;
        }

        public RecognizeDrivingLicenseResponseBodyDataBackResult setOverallDimension(String overallDimension) {
            this.overallDimension = overallDimension;
            return this;
        }
        public String getOverallDimension() {
            return this.overallDimension;
        }

        public RecognizeDrivingLicenseResponseBodyDataBackResult setPlateNumber(String plateNumber) {
            this.plateNumber = plateNumber;
            return this;
        }
        public String getPlateNumber() {
            return this.plateNumber;
        }

        public RecognizeDrivingLicenseResponseBodyDataBackResult setTractionMass(String tractionMass) {
            this.tractionMass = tractionMass;
            return this;
        }
        public String getTractionMass() {
            return this.tractionMass;
        }

        public RecognizeDrivingLicenseResponseBodyDataBackResult setUnladenMass(String unladenMass) {
            this.unladenMass = unladenMass;
            return this;
        }
        public String getUnladenMass() {
            return this.unladenMass;
        }

    }

    public static class RecognizeDrivingLicenseResponseBodyDataFaceResult extends TeaModel {
        @NameInMap("Address")
        public String address;

        @NameInMap("EngineNumber")
        public String engineNumber;

        @NameInMap("IssueDate")
        public String issueDate;

        @NameInMap("Model")
        public String model;

        @NameInMap("Owner")
        public String owner;

        @NameInMap("PlateNumber")
        public String plateNumber;

        @NameInMap("RegisterDate")
        public String registerDate;

        @NameInMap("UseCharacter")
        public String useCharacter;

        @NameInMap("VehicleType")
        public String vehicleType;

        @NameInMap("Vin")
        public String vin;

        public static RecognizeDrivingLicenseResponseBodyDataFaceResult build(java.util.Map<String, ?> map) throws Exception {
            RecognizeDrivingLicenseResponseBodyDataFaceResult self = new RecognizeDrivingLicenseResponseBodyDataFaceResult();
            return TeaModel.build(map, self);
        }

        public RecognizeDrivingLicenseResponseBodyDataFaceResult setAddress(String address) {
            this.address = address;
            return this;
        }
        public String getAddress() {
            return this.address;
        }

        public RecognizeDrivingLicenseResponseBodyDataFaceResult setEngineNumber(String engineNumber) {
            this.engineNumber = engineNumber;
            return this;
        }
        public String getEngineNumber() {
            return this.engineNumber;
        }

        public RecognizeDrivingLicenseResponseBodyDataFaceResult setIssueDate(String issueDate) {
            this.issueDate = issueDate;
            return this;
        }
        public String getIssueDate() {
            return this.issueDate;
        }

        public RecognizeDrivingLicenseResponseBodyDataFaceResult setModel(String model) {
            this.model = model;
            return this;
        }
        public String getModel() {
            return this.model;
        }

        public RecognizeDrivingLicenseResponseBodyDataFaceResult setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public RecognizeDrivingLicenseResponseBodyDataFaceResult setPlateNumber(String plateNumber) {
            this.plateNumber = plateNumber;
            return this;
        }
        public String getPlateNumber() {
            return this.plateNumber;
        }

        public RecognizeDrivingLicenseResponseBodyDataFaceResult setRegisterDate(String registerDate) {
            this.registerDate = registerDate;
            return this;
        }
        public String getRegisterDate() {
            return this.registerDate;
        }

        public RecognizeDrivingLicenseResponseBodyDataFaceResult setUseCharacter(String useCharacter) {
            this.useCharacter = useCharacter;
            return this;
        }
        public String getUseCharacter() {
            return this.useCharacter;
        }

        public RecognizeDrivingLicenseResponseBodyDataFaceResult setVehicleType(String vehicleType) {
            this.vehicleType = vehicleType;
            return this;
        }
        public String getVehicleType() {
            return this.vehicleType;
        }

        public RecognizeDrivingLicenseResponseBodyDataFaceResult setVin(String vin) {
            this.vin = vin;
            return this;
        }
        public String getVin() {
            return this.vin;
        }

    }

    public static class RecognizeDrivingLicenseResponseBodyData extends TeaModel {
        @NameInMap("BackResult")
        public RecognizeDrivingLicenseResponseBodyDataBackResult backResult;

        @NameInMap("FaceResult")
        public RecognizeDrivingLicenseResponseBodyDataFaceResult faceResult;

        public static RecognizeDrivingLicenseResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            RecognizeDrivingLicenseResponseBodyData self = new RecognizeDrivingLicenseResponseBodyData();
            return TeaModel.build(map, self);
        }

        public RecognizeDrivingLicenseResponseBodyData setBackResult(RecognizeDrivingLicenseResponseBodyDataBackResult backResult) {
            this.backResult = backResult;
            return this;
        }
        public RecognizeDrivingLicenseResponseBodyDataBackResult getBackResult() {
            return this.backResult;
        }

        public RecognizeDrivingLicenseResponseBodyData setFaceResult(RecognizeDrivingLicenseResponseBodyDataFaceResult faceResult) {
            this.faceResult = faceResult;
            return this;
        }
        public RecognizeDrivingLicenseResponseBodyDataFaceResult getFaceResult() {
            return this.faceResult;
        }

    }

}
