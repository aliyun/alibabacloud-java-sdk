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

    }

}
