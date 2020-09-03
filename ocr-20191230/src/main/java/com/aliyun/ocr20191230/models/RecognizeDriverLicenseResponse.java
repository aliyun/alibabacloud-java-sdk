// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr20191230.models;

import com.aliyun.tea.*;

public class RecognizeDriverLicenseResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public RecognizeDriverLicenseResponseData data;

    public static RecognizeDriverLicenseResponse build(java.util.Map<String, ?> map) throws Exception {
        RecognizeDriverLicenseResponse self = new RecognizeDriverLicenseResponse();
        return TeaModel.build(map, self);
    }

    public RecognizeDriverLicenseResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RecognizeDriverLicenseResponse setData(RecognizeDriverLicenseResponseData data) {
        this.data = data;
        return this;
    }
    public RecognizeDriverLicenseResponseData getData() {
        return this.data;
    }

    public static class RecognizeDriverLicenseResponseDataFaceResult extends TeaModel {
        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("LicenseNumber")
        @Validation(required = true)
        public String licenseNumber;

        @NameInMap("VehicleType")
        @Validation(required = true)
        public String vehicleType;

        @NameInMap("StartDate")
        @Validation(required = true)
        public String startDate;

        @NameInMap("EndDate")
        @Validation(required = true)
        public String endDate;

        @NameInMap("IssueDate")
        @Validation(required = true)
        public String issueDate;

        @NameInMap("Address")
        @Validation(required = true)
        public String address;

        @NameInMap("Gender")
        @Validation(required = true)
        public String gender;

        public static RecognizeDriverLicenseResponseDataFaceResult build(java.util.Map<String, ?> map) throws Exception {
            RecognizeDriverLicenseResponseDataFaceResult self = new RecognizeDriverLicenseResponseDataFaceResult();
            return TeaModel.build(map, self);
        }

        public RecognizeDriverLicenseResponseDataFaceResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public RecognizeDriverLicenseResponseDataFaceResult setLicenseNumber(String licenseNumber) {
            this.licenseNumber = licenseNumber;
            return this;
        }
        public String getLicenseNumber() {
            return this.licenseNumber;
        }

        public RecognizeDriverLicenseResponseDataFaceResult setVehicleType(String vehicleType) {
            this.vehicleType = vehicleType;
            return this;
        }
        public String getVehicleType() {
            return this.vehicleType;
        }

        public RecognizeDriverLicenseResponseDataFaceResult setStartDate(String startDate) {
            this.startDate = startDate;
            return this;
        }
        public String getStartDate() {
            return this.startDate;
        }

        public RecognizeDriverLicenseResponseDataFaceResult setEndDate(String endDate) {
            this.endDate = endDate;
            return this;
        }
        public String getEndDate() {
            return this.endDate;
        }

        public RecognizeDriverLicenseResponseDataFaceResult setIssueDate(String issueDate) {
            this.issueDate = issueDate;
            return this;
        }
        public String getIssueDate() {
            return this.issueDate;
        }

        public RecognizeDriverLicenseResponseDataFaceResult setAddress(String address) {
            this.address = address;
            return this;
        }
        public String getAddress() {
            return this.address;
        }

        public RecognizeDriverLicenseResponseDataFaceResult setGender(String gender) {
            this.gender = gender;
            return this;
        }
        public String getGender() {
            return this.gender;
        }

    }

    public static class RecognizeDriverLicenseResponseDataBackResult extends TeaModel {
        @NameInMap("ArchiveNumber")
        @Validation(required = true)
        public String archiveNumber;

        public static RecognizeDriverLicenseResponseDataBackResult build(java.util.Map<String, ?> map) throws Exception {
            RecognizeDriverLicenseResponseDataBackResult self = new RecognizeDriverLicenseResponseDataBackResult();
            return TeaModel.build(map, self);
        }

        public RecognizeDriverLicenseResponseDataBackResult setArchiveNumber(String archiveNumber) {
            this.archiveNumber = archiveNumber;
            return this;
        }
        public String getArchiveNumber() {
            return this.archiveNumber;
        }

    }

    public static class RecognizeDriverLicenseResponseData extends TeaModel {
        @NameInMap("FaceResult")
        @Validation(required = true)
        public RecognizeDriverLicenseResponseDataFaceResult faceResult;

        @NameInMap("BackResult")
        @Validation(required = true)
        public RecognizeDriverLicenseResponseDataBackResult backResult;

        public static RecognizeDriverLicenseResponseData build(java.util.Map<String, ?> map) throws Exception {
            RecognizeDriverLicenseResponseData self = new RecognizeDriverLicenseResponseData();
            return TeaModel.build(map, self);
        }

        public RecognizeDriverLicenseResponseData setFaceResult(RecognizeDriverLicenseResponseDataFaceResult faceResult) {
            this.faceResult = faceResult;
            return this;
        }
        public RecognizeDriverLicenseResponseDataFaceResult getFaceResult() {
            return this.faceResult;
        }

        public RecognizeDriverLicenseResponseData setBackResult(RecognizeDriverLicenseResponseDataBackResult backResult) {
            this.backResult = backResult;
            return this;
        }
        public RecognizeDriverLicenseResponseDataBackResult getBackResult() {
            return this.backResult;
        }

    }

}
