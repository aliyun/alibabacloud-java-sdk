// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr20191230.models;

import com.aliyun.tea.*;

public class RecognizeBusinessLicenseResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public RecognizeBusinessLicenseResponseBodyData data;

    public static RecognizeBusinessLicenseResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RecognizeBusinessLicenseResponseBody self = new RecognizeBusinessLicenseResponseBody();
        return TeaModel.build(map, self);
    }

    public RecognizeBusinessLicenseResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RecognizeBusinessLicenseResponseBody setData(RecognizeBusinessLicenseResponseBodyData data) {
        this.data = data;
        return this;
    }
    public RecognizeBusinessLicenseResponseBodyData getData() {
        return this.data;
    }

    public static class RecognizeBusinessLicenseResponseBodyDataStamp extends TeaModel {
        @NameInMap("Top")
        public Integer top;

        @NameInMap("Width")
        public Integer width;

        @NameInMap("Height")
        public Integer height;

        @NameInMap("Left")
        public Integer left;

        public static RecognizeBusinessLicenseResponseBodyDataStamp build(java.util.Map<String, ?> map) throws Exception {
            RecognizeBusinessLicenseResponseBodyDataStamp self = new RecognizeBusinessLicenseResponseBodyDataStamp();
            return TeaModel.build(map, self);
        }

        public RecognizeBusinessLicenseResponseBodyDataStamp setTop(Integer top) {
            this.top = top;
            return this;
        }
        public Integer getTop() {
            return this.top;
        }

        public RecognizeBusinessLicenseResponseBodyDataStamp setWidth(Integer width) {
            this.width = width;
            return this;
        }
        public Integer getWidth() {
            return this.width;
        }

        public RecognizeBusinessLicenseResponseBodyDataStamp setHeight(Integer height) {
            this.height = height;
            return this;
        }
        public Integer getHeight() {
            return this.height;
        }

        public RecognizeBusinessLicenseResponseBodyDataStamp setLeft(Integer left) {
            this.left = left;
            return this;
        }
        public Integer getLeft() {
            return this.left;
        }

    }

    public static class RecognizeBusinessLicenseResponseBodyDataTitle extends TeaModel {
        @NameInMap("Top")
        public Integer top;

        @NameInMap("Width")
        public Integer width;

        @NameInMap("Height")
        public Integer height;

        @NameInMap("Left")
        public Integer left;

        public static RecognizeBusinessLicenseResponseBodyDataTitle build(java.util.Map<String, ?> map) throws Exception {
            RecognizeBusinessLicenseResponseBodyDataTitle self = new RecognizeBusinessLicenseResponseBodyDataTitle();
            return TeaModel.build(map, self);
        }

        public RecognizeBusinessLicenseResponseBodyDataTitle setTop(Integer top) {
            this.top = top;
            return this;
        }
        public Integer getTop() {
            return this.top;
        }

        public RecognizeBusinessLicenseResponseBodyDataTitle setWidth(Integer width) {
            this.width = width;
            return this;
        }
        public Integer getWidth() {
            return this.width;
        }

        public RecognizeBusinessLicenseResponseBodyDataTitle setHeight(Integer height) {
            this.height = height;
            return this;
        }
        public Integer getHeight() {
            return this.height;
        }

        public RecognizeBusinessLicenseResponseBodyDataTitle setLeft(Integer left) {
            this.left = left;
            return this;
        }
        public Integer getLeft() {
            return this.left;
        }

    }

    public static class RecognizeBusinessLicenseResponseBodyDataEmblem extends TeaModel {
        @NameInMap("Top")
        public Integer top;

        @NameInMap("Width")
        public Integer width;

        @NameInMap("Height")
        public Integer height;

        @NameInMap("Left")
        public Integer left;

        public static RecognizeBusinessLicenseResponseBodyDataEmblem build(java.util.Map<String, ?> map) throws Exception {
            RecognizeBusinessLicenseResponseBodyDataEmblem self = new RecognizeBusinessLicenseResponseBodyDataEmblem();
            return TeaModel.build(map, self);
        }

        public RecognizeBusinessLicenseResponseBodyDataEmblem setTop(Integer top) {
            this.top = top;
            return this;
        }
        public Integer getTop() {
            return this.top;
        }

        public RecognizeBusinessLicenseResponseBodyDataEmblem setWidth(Integer width) {
            this.width = width;
            return this;
        }
        public Integer getWidth() {
            return this.width;
        }

        public RecognizeBusinessLicenseResponseBodyDataEmblem setHeight(Integer height) {
            this.height = height;
            return this;
        }
        public Integer getHeight() {
            return this.height;
        }

        public RecognizeBusinessLicenseResponseBodyDataEmblem setLeft(Integer left) {
            this.left = left;
            return this;
        }
        public Integer getLeft() {
            return this.left;
        }

    }

    public static class RecognizeBusinessLicenseResponseBodyDataQRCode extends TeaModel {
        @NameInMap("Top")
        public Integer top;

        @NameInMap("Width")
        public Integer width;

        @NameInMap("Height")
        public Integer height;

        @NameInMap("Left")
        public Integer left;

        public static RecognizeBusinessLicenseResponseBodyDataQRCode build(java.util.Map<String, ?> map) throws Exception {
            RecognizeBusinessLicenseResponseBodyDataQRCode self = new RecognizeBusinessLicenseResponseBodyDataQRCode();
            return TeaModel.build(map, self);
        }

        public RecognizeBusinessLicenseResponseBodyDataQRCode setTop(Integer top) {
            this.top = top;
            return this;
        }
        public Integer getTop() {
            return this.top;
        }

        public RecognizeBusinessLicenseResponseBodyDataQRCode setWidth(Integer width) {
            this.width = width;
            return this;
        }
        public Integer getWidth() {
            return this.width;
        }

        public RecognizeBusinessLicenseResponseBodyDataQRCode setHeight(Integer height) {
            this.height = height;
            return this;
        }
        public Integer getHeight() {
            return this.height;
        }

        public RecognizeBusinessLicenseResponseBodyDataQRCode setLeft(Integer left) {
            this.left = left;
            return this;
        }
        public Integer getLeft() {
            return this.left;
        }

    }

    public static class RecognizeBusinessLicenseResponseBodyData extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("Stamp")
        public RecognizeBusinessLicenseResponseBodyDataStamp stamp;

        @NameInMap("EstablishDate")
        public String establishDate;

        @NameInMap("ValidPeriod")
        public String validPeriod;

        @NameInMap("Business")
        public String business;

        @NameInMap("Angle")
        public Float angle;

        @NameInMap("RegisterNumber")
        public String registerNumber;

        @NameInMap("Address")
        public String address;

        @NameInMap("Capital")
        public String capital;

        @NameInMap("Title")
        public RecognizeBusinessLicenseResponseBodyDataTitle title;

        @NameInMap("Emblem")
        public RecognizeBusinessLicenseResponseBodyDataEmblem emblem;

        @NameInMap("Name")
        public String name;

        @NameInMap("QRCode")
        public RecognizeBusinessLicenseResponseBodyDataQRCode QRCode;

        @NameInMap("LegalPerson")
        public String legalPerson;

        public static RecognizeBusinessLicenseResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            RecognizeBusinessLicenseResponseBodyData self = new RecognizeBusinessLicenseResponseBodyData();
            return TeaModel.build(map, self);
        }

        public RecognizeBusinessLicenseResponseBodyData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public RecognizeBusinessLicenseResponseBodyData setStamp(RecognizeBusinessLicenseResponseBodyDataStamp stamp) {
            this.stamp = stamp;
            return this;
        }
        public RecognizeBusinessLicenseResponseBodyDataStamp getStamp() {
            return this.stamp;
        }

        public RecognizeBusinessLicenseResponseBodyData setEstablishDate(String establishDate) {
            this.establishDate = establishDate;
            return this;
        }
        public String getEstablishDate() {
            return this.establishDate;
        }

        public RecognizeBusinessLicenseResponseBodyData setValidPeriod(String validPeriod) {
            this.validPeriod = validPeriod;
            return this;
        }
        public String getValidPeriod() {
            return this.validPeriod;
        }

        public RecognizeBusinessLicenseResponseBodyData setBusiness(String business) {
            this.business = business;
            return this;
        }
        public String getBusiness() {
            return this.business;
        }

        public RecognizeBusinessLicenseResponseBodyData setAngle(Float angle) {
            this.angle = angle;
            return this;
        }
        public Float getAngle() {
            return this.angle;
        }

        public RecognizeBusinessLicenseResponseBodyData setRegisterNumber(String registerNumber) {
            this.registerNumber = registerNumber;
            return this;
        }
        public String getRegisterNumber() {
            return this.registerNumber;
        }

        public RecognizeBusinessLicenseResponseBodyData setAddress(String address) {
            this.address = address;
            return this;
        }
        public String getAddress() {
            return this.address;
        }

        public RecognizeBusinessLicenseResponseBodyData setCapital(String capital) {
            this.capital = capital;
            return this;
        }
        public String getCapital() {
            return this.capital;
        }

        public RecognizeBusinessLicenseResponseBodyData setTitle(RecognizeBusinessLicenseResponseBodyDataTitle title) {
            this.title = title;
            return this;
        }
        public RecognizeBusinessLicenseResponseBodyDataTitle getTitle() {
            return this.title;
        }

        public RecognizeBusinessLicenseResponseBodyData setEmblem(RecognizeBusinessLicenseResponseBodyDataEmblem emblem) {
            this.emblem = emblem;
            return this;
        }
        public RecognizeBusinessLicenseResponseBodyDataEmblem getEmblem() {
            return this.emblem;
        }

        public RecognizeBusinessLicenseResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public RecognizeBusinessLicenseResponseBodyData setQRCode(RecognizeBusinessLicenseResponseBodyDataQRCode QRCode) {
            this.QRCode = QRCode;
            return this;
        }
        public RecognizeBusinessLicenseResponseBodyDataQRCode getQRCode() {
            return this.QRCode;
        }

        public RecognizeBusinessLicenseResponseBodyData setLegalPerson(String legalPerson) {
            this.legalPerson = legalPerson;
            return this;
        }
        public String getLegalPerson() {
            return this.legalPerson;
        }

    }

}
