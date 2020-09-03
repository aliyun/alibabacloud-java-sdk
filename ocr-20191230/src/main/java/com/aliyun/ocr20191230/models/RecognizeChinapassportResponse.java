// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr20191230.models;

import com.aliyun.tea.*;

public class RecognizeChinapassportResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public RecognizeChinapassportResponseData data;

    public static RecognizeChinapassportResponse build(java.util.Map<String, ?> map) throws Exception {
        RecognizeChinapassportResponse self = new RecognizeChinapassportResponse();
        return TeaModel.build(map, self);
    }

    public RecognizeChinapassportResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RecognizeChinapassportResponse setData(RecognizeChinapassportResponseData data) {
        this.data = data;
        return this;
    }
    public RecognizeChinapassportResponseData getData() {
        return this.data;
    }

    public static class RecognizeChinapassportResponseData extends TeaModel {
        @NameInMap("Authority")
        @Validation(required = true)
        public String authority;

        @NameInMap("BirthDate")
        @Validation(required = true)
        public String birthDate;

        @NameInMap("BirthDay")
        @Validation(required = true)
        public String birthDay;

        @NameInMap("BirthPlace")
        @Validation(required = true)
        public String birthPlace;

        @NameInMap("BirthPlaceRaw")
        @Validation(required = true)
        public String birthPlaceRaw;

        @NameInMap("Country")
        @Validation(required = true)
        public String country;

        @NameInMap("ExpiryDate")
        @Validation(required = true)
        public String expiryDate;

        @NameInMap("ExpiryDay")
        @Validation(required = true)
        public String expiryDay;

        @NameInMap("IssueDate")
        @Validation(required = true)
        public String issueDate;

        @NameInMap("IssuePlace")
        @Validation(required = true)
        public String issuePlace;

        @NameInMap("IssuePlaceRaw")
        @Validation(required = true)
        public String issuePlaceRaw;

        @NameInMap("LineZero")
        @Validation(required = true)
        public String lineZero;

        @NameInMap("LineOne")
        @Validation(required = true)
        public String lineOne;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("NameChinese")
        @Validation(required = true)
        public String nameChinese;

        @NameInMap("NameChineseRaw")
        @Validation(required = true)
        public String nameChineseRaw;

        @NameInMap("PassportNo")
        @Validation(required = true)
        public String passportNo;

        @NameInMap("PersonId")
        @Validation(required = true)
        public String personId;

        @NameInMap("Sex")
        @Validation(required = true)
        public String sex;

        @NameInMap("SourceCountry")
        @Validation(required = true)
        public String sourceCountry;

        @NameInMap("Success")
        @Validation(required = true)
        public Boolean success;

        @NameInMap("Type")
        @Validation(required = true)
        public String type;

        public static RecognizeChinapassportResponseData build(java.util.Map<String, ?> map) throws Exception {
            RecognizeChinapassportResponseData self = new RecognizeChinapassportResponseData();
            return TeaModel.build(map, self);
        }

        public RecognizeChinapassportResponseData setAuthority(String authority) {
            this.authority = authority;
            return this;
        }
        public String getAuthority() {
            return this.authority;
        }

        public RecognizeChinapassportResponseData setBirthDate(String birthDate) {
            this.birthDate = birthDate;
            return this;
        }
        public String getBirthDate() {
            return this.birthDate;
        }

        public RecognizeChinapassportResponseData setBirthDay(String birthDay) {
            this.birthDay = birthDay;
            return this;
        }
        public String getBirthDay() {
            return this.birthDay;
        }

        public RecognizeChinapassportResponseData setBirthPlace(String birthPlace) {
            this.birthPlace = birthPlace;
            return this;
        }
        public String getBirthPlace() {
            return this.birthPlace;
        }

        public RecognizeChinapassportResponseData setBirthPlaceRaw(String birthPlaceRaw) {
            this.birthPlaceRaw = birthPlaceRaw;
            return this;
        }
        public String getBirthPlaceRaw() {
            return this.birthPlaceRaw;
        }

        public RecognizeChinapassportResponseData setCountry(String country) {
            this.country = country;
            return this;
        }
        public String getCountry() {
            return this.country;
        }

        public RecognizeChinapassportResponseData setExpiryDate(String expiryDate) {
            this.expiryDate = expiryDate;
            return this;
        }
        public String getExpiryDate() {
            return this.expiryDate;
        }

        public RecognizeChinapassportResponseData setExpiryDay(String expiryDay) {
            this.expiryDay = expiryDay;
            return this;
        }
        public String getExpiryDay() {
            return this.expiryDay;
        }

        public RecognizeChinapassportResponseData setIssueDate(String issueDate) {
            this.issueDate = issueDate;
            return this;
        }
        public String getIssueDate() {
            return this.issueDate;
        }

        public RecognizeChinapassportResponseData setIssuePlace(String issuePlace) {
            this.issuePlace = issuePlace;
            return this;
        }
        public String getIssuePlace() {
            return this.issuePlace;
        }

        public RecognizeChinapassportResponseData setIssuePlaceRaw(String issuePlaceRaw) {
            this.issuePlaceRaw = issuePlaceRaw;
            return this;
        }
        public String getIssuePlaceRaw() {
            return this.issuePlaceRaw;
        }

        public RecognizeChinapassportResponseData setLineZero(String lineZero) {
            this.lineZero = lineZero;
            return this;
        }
        public String getLineZero() {
            return this.lineZero;
        }

        public RecognizeChinapassportResponseData setLineOne(String lineOne) {
            this.lineOne = lineOne;
            return this;
        }
        public String getLineOne() {
            return this.lineOne;
        }

        public RecognizeChinapassportResponseData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public RecognizeChinapassportResponseData setNameChinese(String nameChinese) {
            this.nameChinese = nameChinese;
            return this;
        }
        public String getNameChinese() {
            return this.nameChinese;
        }

        public RecognizeChinapassportResponseData setNameChineseRaw(String nameChineseRaw) {
            this.nameChineseRaw = nameChineseRaw;
            return this;
        }
        public String getNameChineseRaw() {
            return this.nameChineseRaw;
        }

        public RecognizeChinapassportResponseData setPassportNo(String passportNo) {
            this.passportNo = passportNo;
            return this;
        }
        public String getPassportNo() {
            return this.passportNo;
        }

        public RecognizeChinapassportResponseData setPersonId(String personId) {
            this.personId = personId;
            return this;
        }
        public String getPersonId() {
            return this.personId;
        }

        public RecognizeChinapassportResponseData setSex(String sex) {
            this.sex = sex;
            return this;
        }
        public String getSex() {
            return this.sex;
        }

        public RecognizeChinapassportResponseData setSourceCountry(String sourceCountry) {
            this.sourceCountry = sourceCountry;
            return this;
        }
        public String getSourceCountry() {
            return this.sourceCountry;
        }

        public RecognizeChinapassportResponseData setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public RecognizeChinapassportResponseData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
