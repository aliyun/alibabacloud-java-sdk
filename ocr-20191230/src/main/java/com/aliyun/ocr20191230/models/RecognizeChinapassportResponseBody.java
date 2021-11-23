// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr20191230.models;

import com.aliyun.tea.*;

public class RecognizeChinapassportResponseBody extends TeaModel {
    @NameInMap("Data")
    public RecognizeChinapassportResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static RecognizeChinapassportResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RecognizeChinapassportResponseBody self = new RecognizeChinapassportResponseBody();
        return TeaModel.build(map, self);
    }

    public RecognizeChinapassportResponseBody setData(RecognizeChinapassportResponseBodyData data) {
        this.data = data;
        return this;
    }
    public RecognizeChinapassportResponseBodyData getData() {
        return this.data;
    }

    public RecognizeChinapassportResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class RecognizeChinapassportResponseBodyData extends TeaModel {
        @NameInMap("Authority")
        public String authority;

        @NameInMap("BirthDate")
        public String birthDate;

        @NameInMap("BirthDay")
        public String birthDay;

        @NameInMap("BirthPlace")
        public String birthPlace;

        @NameInMap("BirthPlaceRaw")
        public String birthPlaceRaw;

        @NameInMap("Country")
        public String country;

        @NameInMap("ExpiryDate")
        public String expiryDate;

        @NameInMap("ExpiryDay")
        public String expiryDay;

        @NameInMap("IssueDate")
        public String issueDate;

        @NameInMap("IssuePlace")
        public String issuePlace;

        @NameInMap("IssuePlaceRaw")
        public String issuePlaceRaw;

        @NameInMap("LineOne")
        public String lineOne;

        @NameInMap("LineZero")
        public String lineZero;

        @NameInMap("Name")
        public String name;

        @NameInMap("NameChinese")
        public String nameChinese;

        @NameInMap("NameChineseRaw")
        public String nameChineseRaw;

        @NameInMap("PassportNo")
        public String passportNo;

        @NameInMap("PersonId")
        public String personId;

        @NameInMap("Sex")
        public String sex;

        @NameInMap("SourceCountry")
        public String sourceCountry;

        @NameInMap("Success")
        public Boolean success;

        @NameInMap("Type")
        public String type;

        public static RecognizeChinapassportResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            RecognizeChinapassportResponseBodyData self = new RecognizeChinapassportResponseBodyData();
            return TeaModel.build(map, self);
        }

        public RecognizeChinapassportResponseBodyData setAuthority(String authority) {
            this.authority = authority;
            return this;
        }
        public String getAuthority() {
            return this.authority;
        }

        public RecognizeChinapassportResponseBodyData setBirthDate(String birthDate) {
            this.birthDate = birthDate;
            return this;
        }
        public String getBirthDate() {
            return this.birthDate;
        }

        public RecognizeChinapassportResponseBodyData setBirthDay(String birthDay) {
            this.birthDay = birthDay;
            return this;
        }
        public String getBirthDay() {
            return this.birthDay;
        }

        public RecognizeChinapassportResponseBodyData setBirthPlace(String birthPlace) {
            this.birthPlace = birthPlace;
            return this;
        }
        public String getBirthPlace() {
            return this.birthPlace;
        }

        public RecognizeChinapassportResponseBodyData setBirthPlaceRaw(String birthPlaceRaw) {
            this.birthPlaceRaw = birthPlaceRaw;
            return this;
        }
        public String getBirthPlaceRaw() {
            return this.birthPlaceRaw;
        }

        public RecognizeChinapassportResponseBodyData setCountry(String country) {
            this.country = country;
            return this;
        }
        public String getCountry() {
            return this.country;
        }

        public RecognizeChinapassportResponseBodyData setExpiryDate(String expiryDate) {
            this.expiryDate = expiryDate;
            return this;
        }
        public String getExpiryDate() {
            return this.expiryDate;
        }

        public RecognizeChinapassportResponseBodyData setExpiryDay(String expiryDay) {
            this.expiryDay = expiryDay;
            return this;
        }
        public String getExpiryDay() {
            return this.expiryDay;
        }

        public RecognizeChinapassportResponseBodyData setIssueDate(String issueDate) {
            this.issueDate = issueDate;
            return this;
        }
        public String getIssueDate() {
            return this.issueDate;
        }

        public RecognizeChinapassportResponseBodyData setIssuePlace(String issuePlace) {
            this.issuePlace = issuePlace;
            return this;
        }
        public String getIssuePlace() {
            return this.issuePlace;
        }

        public RecognizeChinapassportResponseBodyData setIssuePlaceRaw(String issuePlaceRaw) {
            this.issuePlaceRaw = issuePlaceRaw;
            return this;
        }
        public String getIssuePlaceRaw() {
            return this.issuePlaceRaw;
        }

        public RecognizeChinapassportResponseBodyData setLineOne(String lineOne) {
            this.lineOne = lineOne;
            return this;
        }
        public String getLineOne() {
            return this.lineOne;
        }

        public RecognizeChinapassportResponseBodyData setLineZero(String lineZero) {
            this.lineZero = lineZero;
            return this;
        }
        public String getLineZero() {
            return this.lineZero;
        }

        public RecognizeChinapassportResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public RecognizeChinapassportResponseBodyData setNameChinese(String nameChinese) {
            this.nameChinese = nameChinese;
            return this;
        }
        public String getNameChinese() {
            return this.nameChinese;
        }

        public RecognizeChinapassportResponseBodyData setNameChineseRaw(String nameChineseRaw) {
            this.nameChineseRaw = nameChineseRaw;
            return this;
        }
        public String getNameChineseRaw() {
            return this.nameChineseRaw;
        }

        public RecognizeChinapassportResponseBodyData setPassportNo(String passportNo) {
            this.passportNo = passportNo;
            return this;
        }
        public String getPassportNo() {
            return this.passportNo;
        }

        public RecognizeChinapassportResponseBodyData setPersonId(String personId) {
            this.personId = personId;
            return this;
        }
        public String getPersonId() {
            return this.personId;
        }

        public RecognizeChinapassportResponseBodyData setSex(String sex) {
            this.sex = sex;
            return this;
        }
        public String getSex() {
            return this.sex;
        }

        public RecognizeChinapassportResponseBodyData setSourceCountry(String sourceCountry) {
            this.sourceCountry = sourceCountry;
            return this;
        }
        public String getSourceCountry() {
            return this.sourceCountry;
        }

        public RecognizeChinapassportResponseBodyData setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public RecognizeChinapassportResponseBodyData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
