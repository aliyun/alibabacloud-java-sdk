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

    public RecognizeBusinessLicenseResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RecognizeBusinessLicenseResponse setData(RecognizeBusinessLicenseResponseData data) {
        this.data = data;
        return this;
    }
    public RecognizeBusinessLicenseResponseData getData() {
        return this.data;
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

        public RecognizeBusinessLicenseResponseDataEmblem setTop(Integer top) {
            this.top = top;
            return this;
        }
        public Integer getTop() {
            return this.top;
        }

        public RecognizeBusinessLicenseResponseDataEmblem setLeft(Integer left) {
            this.left = left;
            return this;
        }
        public Integer getLeft() {
            return this.left;
        }

        public RecognizeBusinessLicenseResponseDataEmblem setHeight(Integer height) {
            this.height = height;
            return this;
        }
        public Integer getHeight() {
            return this.height;
        }

        public RecognizeBusinessLicenseResponseDataEmblem setWidth(Integer width) {
            this.width = width;
            return this;
        }
        public Integer getWidth() {
            return this.width;
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

        public RecognizeBusinessLicenseResponseDataTitle setTop(Integer top) {
            this.top = top;
            return this;
        }
        public Integer getTop() {
            return this.top;
        }

        public RecognizeBusinessLicenseResponseDataTitle setLeft(Integer left) {
            this.left = left;
            return this;
        }
        public Integer getLeft() {
            return this.left;
        }

        public RecognizeBusinessLicenseResponseDataTitle setHeight(Integer height) {
            this.height = height;
            return this;
        }
        public Integer getHeight() {
            return this.height;
        }

        public RecognizeBusinessLicenseResponseDataTitle setWidth(Integer width) {
            this.width = width;
            return this;
        }
        public Integer getWidth() {
            return this.width;
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

        public RecognizeBusinessLicenseResponseDataStamp setTop(Integer top) {
            this.top = top;
            return this;
        }
        public Integer getTop() {
            return this.top;
        }

        public RecognizeBusinessLicenseResponseDataStamp setLeft(Integer left) {
            this.left = left;
            return this;
        }
        public Integer getLeft() {
            return this.left;
        }

        public RecognizeBusinessLicenseResponseDataStamp setHeight(Integer height) {
            this.height = height;
            return this;
        }
        public Integer getHeight() {
            return this.height;
        }

        public RecognizeBusinessLicenseResponseDataStamp setWidth(Integer width) {
            this.width = width;
            return this;
        }
        public Integer getWidth() {
            return this.width;
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

        public RecognizeBusinessLicenseResponseDataQRCode setTop(Integer top) {
            this.top = top;
            return this;
        }
        public Integer getTop() {
            return this.top;
        }

        public RecognizeBusinessLicenseResponseDataQRCode setLeft(Integer left) {
            this.left = left;
            return this;
        }
        public Integer getLeft() {
            return this.left;
        }

        public RecognizeBusinessLicenseResponseDataQRCode setHeight(Integer height) {
            this.height = height;
            return this;
        }
        public Integer getHeight() {
            return this.height;
        }

        public RecognizeBusinessLicenseResponseDataQRCode setWidth(Integer width) {
            this.width = width;
            return this;
        }
        public Integer getWidth() {
            return this.width;
        }

    }

    public static class RecognizeBusinessLicenseResponseData extends TeaModel {
        @NameInMap("Angle")
        @Validation(required = true)
        public Float angle;

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

        public RecognizeBusinessLicenseResponseData setAngle(Float angle) {
            this.angle = angle;
            return this;
        }
        public Float getAngle() {
            return this.angle;
        }

        public RecognizeBusinessLicenseResponseData setRegisterNumber(String registerNumber) {
            this.registerNumber = registerNumber;
            return this;
        }
        public String getRegisterNumber() {
            return this.registerNumber;
        }

        public RecognizeBusinessLicenseResponseData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public RecognizeBusinessLicenseResponseData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public RecognizeBusinessLicenseResponseData setLegalPerson(String legalPerson) {
            this.legalPerson = legalPerson;
            return this;
        }
        public String getLegalPerson() {
            return this.legalPerson;
        }

        public RecognizeBusinessLicenseResponseData setEstablishDate(String establishDate) {
            this.establishDate = establishDate;
            return this;
        }
        public String getEstablishDate() {
            return this.establishDate;
        }

        public RecognizeBusinessLicenseResponseData setValidPeriod(String validPeriod) {
            this.validPeriod = validPeriod;
            return this;
        }
        public String getValidPeriod() {
            return this.validPeriod;
        }

        public RecognizeBusinessLicenseResponseData setAddress(String address) {
            this.address = address;
            return this;
        }
        public String getAddress() {
            return this.address;
        }

        public RecognizeBusinessLicenseResponseData setCapital(String capital) {
            this.capital = capital;
            return this;
        }
        public String getCapital() {
            return this.capital;
        }

        public RecognizeBusinessLicenseResponseData setBusiness(String business) {
            this.business = business;
            return this;
        }
        public String getBusiness() {
            return this.business;
        }

        public RecognizeBusinessLicenseResponseData setEmblem(RecognizeBusinessLicenseResponseDataEmblem emblem) {
            this.emblem = emblem;
            return this;
        }
        public RecognizeBusinessLicenseResponseDataEmblem getEmblem() {
            return this.emblem;
        }

        public RecognizeBusinessLicenseResponseData setTitle(RecognizeBusinessLicenseResponseDataTitle title) {
            this.title = title;
            return this;
        }
        public RecognizeBusinessLicenseResponseDataTitle getTitle() {
            return this.title;
        }

        public RecognizeBusinessLicenseResponseData setStamp(RecognizeBusinessLicenseResponseDataStamp stamp) {
            this.stamp = stamp;
            return this;
        }
        public RecognizeBusinessLicenseResponseDataStamp getStamp() {
            return this.stamp;
        }

        public RecognizeBusinessLicenseResponseData setQRCode(RecognizeBusinessLicenseResponseDataQRCode QRCode) {
            this.QRCode = QRCode;
            return this;
        }
        public RecognizeBusinessLicenseResponseDataQRCode getQRCode() {
            return this.QRCode;
        }

    }

}
