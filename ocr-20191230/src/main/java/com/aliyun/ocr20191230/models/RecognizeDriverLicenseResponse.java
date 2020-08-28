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

    }

    public static class RecognizeDriverLicenseResponseDataBackResult extends TeaModel {
        @NameInMap("ArchiveNumber")
        @Validation(required = true)
        public String archiveNumber;

        public static RecognizeDriverLicenseResponseDataBackResult build(java.util.Map<String, ?> map) throws Exception {
            RecognizeDriverLicenseResponseDataBackResult self = new RecognizeDriverLicenseResponseDataBackResult();
            return TeaModel.build(map, self);
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

    }

}
