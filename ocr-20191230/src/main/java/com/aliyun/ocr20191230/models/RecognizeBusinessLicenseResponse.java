// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr20191230.models;

import com.aliyun.tea.*;

public class RecognizeBusinessLicenseResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public RecognizeBusinessLicenseResponseData data;

    public static RecognizeBusinessLicenseResponse build(java.util.Map<String, ?> map) throws Exception {
        RecognizeBusinessLicenseResponse self = new RecognizeBusinessLicenseResponse();
        return TeaModel.build(map, self);
    }

    public static class RecognizeBusinessLicenseResponseDataEmblem extends TeaModel {
        @NameInMap("Top")
        @Validation(required = true)
        public Integer top;

        @NameInMap("Left")
        @Validation(required = true)
        public Integer left;

        @NameInMap("Height")
        @Validation(required = true)
        public Integer height;

        @NameInMap("Width")
        @Validation(required = true)
        public Integer width;

        public static RecognizeBusinessLicenseResponseDataEmblem build(java.util.Map<String, ?> map) throws Exception {
            RecognizeBusinessLicenseResponseDataEmblem self = new RecognizeBusinessLicenseResponseDataEmblem();
            return TeaModel.build(map, self);
        }

    }

    public static class RecognizeBusinessLicenseResponseDataTitle extends TeaModel {
        @NameInMap("Top")
        @Validation(required = true)
        public Integer top;

        @NameInMap("Left")
        @Validation(required = true)
        public Integer left;

        @NameInMap("Height")
        @Validation(required = true)
        public Integer height;

        @NameInMap("Width")
        @Validation(required = true)
        public Integer width;

        public static RecognizeBusinessLicenseResponseDataTitle build(java.util.Map<String, ?> map) throws Exception {
            RecognizeBusinessLicenseResponseDataTitle self = new RecognizeBusinessLicenseResponseDataTitle();
            return TeaModel.build(map, self);
        }

    }

    public static class RecognizeBusinessLicenseResponseDataStamp extends TeaModel {
        @NameInMap("Top")
        @Validation(required = true)
        public Integer top;

        @NameInMap("Left")
        @Validation(required = true)
        public Integer left;

        @NameInMap("Height")
        @Validation(required = true)
        public Integer height;

        @NameInMap("Width")
        @Validation(required = true)
        public Integer width;

        public static RecognizeBusinessLicenseResponseDataStamp build(java.util.Map<String, ?> map) throws Exception {
            RecognizeBusinessLicenseResponseDataStamp self = new RecognizeBusinessLicenseResponseDataStamp();
            return TeaModel.build(map, self);
        }

    }

    public static class RecognizeBusinessLicenseResponseDataQRCode extends TeaModel {
        @NameInMap("Top")
        @Validation(required = true)
        public Integer top;

        @NameInMap("Left")
        @Validation(required = true)
        public Integer left;

        @NameInMap("Height")
        @Validation(required = true)
        public Integer height;

        @NameInMap("Width")
        @Validation(required = true)
        public Integer width;

        public static RecognizeBusinessLicenseResponseDataQRCode build(java.util.Map<String, ?> map) throws Exception {
            RecognizeBusinessLicenseResponseDataQRCode self = new RecognizeBusinessLicenseResponseDataQRCode();
            return TeaModel.build(map, self);
        }

    }

    public static class RecognizeBusinessLicenseResponseData extends TeaModel {
        @NameInMap("Angle")
        @Validation(required = true)
        public String angle;

        @NameInMap("RegisterNumber")
        @Validation(required = true)
        public String registerNumber;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("Type")
        @Validation(required = true)
        public String type;

        @NameInMap("LegalPerson")
        @Validation(required = true)
        public String legalPerson;

        @NameInMap("EstablishDate")
        @Validation(required = true)
        public String establishDate;

        @NameInMap("ValidPeriod")
        @Validation(required = true)
        public String validPeriod;

        @NameInMap("Address")
        @Validation(required = true)
        public String address;

        @NameInMap("Capital")
        @Validation(required = true)
        public String capital;

        @NameInMap("Business")
        @Validation(required = true)
        public String business;

        @NameInMap("Emblem")
        @Validation(required = true)
        public RecognizeBusinessLicenseResponseDataEmblem emblem;

        @NameInMap("Title")
        @Validation(required = true)
        public RecognizeBusinessLicenseResponseDataTitle title;

        @NameInMap("Stamp")
        @Validation(required = true)
        public RecognizeBusinessLicenseResponseDataStamp stamp;

        @NameInMap("QRCode")
        @Validation(required = true)
        public RecognizeBusinessLicenseResponseDataQRCode QRCode;

        public static RecognizeBusinessLicenseResponseData build(java.util.Map<String, ?> map) throws Exception {
            RecognizeBusinessLicenseResponseData self = new RecognizeBusinessLicenseResponseData();
            return TeaModel.build(map, self);
        }

    }

}
