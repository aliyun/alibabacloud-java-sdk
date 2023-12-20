// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr20191230.models;

import com.aliyun.tea.*;

public class RecognizeDriverLicenseResponseBody extends TeaModel {
    @NameInMap("Data")
    public RecognizeDriverLicenseResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static RecognizeDriverLicenseResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RecognizeDriverLicenseResponseBody self = new RecognizeDriverLicenseResponseBody();
        return TeaModel.build(map, self);
    }

    public RecognizeDriverLicenseResponseBody setData(RecognizeDriverLicenseResponseBodyData data) {
        this.data = data;
        return this;
    }
    public RecognizeDriverLicenseResponseBodyData getData() {
        return this.data;
    }

    public RecognizeDriverLicenseResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class RecognizeDriverLicenseResponseBodyDataBackResult extends TeaModel {
        @NameInMap("ArchiveNumber")
        public String archiveNumber;

        @NameInMap("CardNumber")
        public String cardNumber;

        @NameInMap("Name")
        public String name;

        @NameInMap("Record")
        public String record;

        public static RecognizeDriverLicenseResponseBodyDataBackResult build(java.util.Map<String, ?> map) throws Exception {
            RecognizeDriverLicenseResponseBodyDataBackResult self = new RecognizeDriverLicenseResponseBodyDataBackResult();
            return TeaModel.build(map, self);
        }

        public RecognizeDriverLicenseResponseBodyDataBackResult setArchiveNumber(String archiveNumber) {
            this.archiveNumber = archiveNumber;
            return this;
        }
        public String getArchiveNumber() {
            return this.archiveNumber;
        }

        public RecognizeDriverLicenseResponseBodyDataBackResult setCardNumber(String cardNumber) {
            this.cardNumber = cardNumber;
            return this;
        }
        public String getCardNumber() {
            return this.cardNumber;
        }

        public RecognizeDriverLicenseResponseBodyDataBackResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public RecognizeDriverLicenseResponseBodyDataBackResult setRecord(String record) {
            this.record = record;
            return this;
        }
        public String getRecord() {
            return this.record;
        }

    }

    public static class RecognizeDriverLicenseResponseBodyDataFaceResult extends TeaModel {
        @NameInMap("Address")
        public String address;

        @NameInMap("BirthDate")
        public String birthDate;

        @NameInMap("EndDate")
        public String endDate;

        @NameInMap("Gender")
        public String gender;

        @NameInMap("IssueDate")
        public String issueDate;

        @NameInMap("IssueUnit")
        public String issueUnit;

        @NameInMap("LicenseNumber")
        public String licenseNumber;

        @NameInMap("Name")
        public String name;

        @NameInMap("Nationality")
        public String nationality;

        @NameInMap("StartDate")
        public String startDate;

        @NameInMap("VehicleType")
        public String vehicleType;

        public static RecognizeDriverLicenseResponseBodyDataFaceResult build(java.util.Map<String, ?> map) throws Exception {
            RecognizeDriverLicenseResponseBodyDataFaceResult self = new RecognizeDriverLicenseResponseBodyDataFaceResult();
            return TeaModel.build(map, self);
        }

        public RecognizeDriverLicenseResponseBodyDataFaceResult setAddress(String address) {
            this.address = address;
            return this;
        }
        public String getAddress() {
            return this.address;
        }

        public RecognizeDriverLicenseResponseBodyDataFaceResult setBirthDate(String birthDate) {
            this.birthDate = birthDate;
            return this;
        }
        public String getBirthDate() {
            return this.birthDate;
        }

        public RecognizeDriverLicenseResponseBodyDataFaceResult setEndDate(String endDate) {
            this.endDate = endDate;
            return this;
        }
        public String getEndDate() {
            return this.endDate;
        }

        public RecognizeDriverLicenseResponseBodyDataFaceResult setGender(String gender) {
            this.gender = gender;
            return this;
        }
        public String getGender() {
            return this.gender;
        }

        public RecognizeDriverLicenseResponseBodyDataFaceResult setIssueDate(String issueDate) {
            this.issueDate = issueDate;
            return this;
        }
        public String getIssueDate() {
            return this.issueDate;
        }

        public RecognizeDriverLicenseResponseBodyDataFaceResult setIssueUnit(String issueUnit) {
            this.issueUnit = issueUnit;
            return this;
        }
        public String getIssueUnit() {
            return this.issueUnit;
        }

        public RecognizeDriverLicenseResponseBodyDataFaceResult setLicenseNumber(String licenseNumber) {
            this.licenseNumber = licenseNumber;
            return this;
        }
        public String getLicenseNumber() {
            return this.licenseNumber;
        }

        public RecognizeDriverLicenseResponseBodyDataFaceResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public RecognizeDriverLicenseResponseBodyDataFaceResult setNationality(String nationality) {
            this.nationality = nationality;
            return this;
        }
        public String getNationality() {
            return this.nationality;
        }

        public RecognizeDriverLicenseResponseBodyDataFaceResult setStartDate(String startDate) {
            this.startDate = startDate;
            return this;
        }
        public String getStartDate() {
            return this.startDate;
        }

        public RecognizeDriverLicenseResponseBodyDataFaceResult setVehicleType(String vehicleType) {
            this.vehicleType = vehicleType;
            return this;
        }
        public String getVehicleType() {
            return this.vehicleType;
        }

    }

    public static class RecognizeDriverLicenseResponseBodyData extends TeaModel {
        @NameInMap("BackResult")
        public RecognizeDriverLicenseResponseBodyDataBackResult backResult;

        @NameInMap("FaceResult")
        public RecognizeDriverLicenseResponseBodyDataFaceResult faceResult;

        public static RecognizeDriverLicenseResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            RecognizeDriverLicenseResponseBodyData self = new RecognizeDriverLicenseResponseBodyData();
            return TeaModel.build(map, self);
        }

        public RecognizeDriverLicenseResponseBodyData setBackResult(RecognizeDriverLicenseResponseBodyDataBackResult backResult) {
            this.backResult = backResult;
            return this;
        }
        public RecognizeDriverLicenseResponseBodyDataBackResult getBackResult() {
            return this.backResult;
        }

        public RecognizeDriverLicenseResponseBodyData setFaceResult(RecognizeDriverLicenseResponseBodyDataFaceResult faceResult) {
            this.faceResult = faceResult;
            return this;
        }
        public RecognizeDriverLicenseResponseBodyDataFaceResult getFaceResult() {
            return this.faceResult;
        }

    }

}
