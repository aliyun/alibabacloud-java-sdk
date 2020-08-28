// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr20191230.models;

import com.aliyun.tea.*;

public class RecognizeBusinessCardResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public RecognizeBusinessCardResponseData data;

    public static RecognizeBusinessCardResponse build(java.util.Map<String, ?> map) throws Exception {
        RecognizeBusinessCardResponse self = new RecognizeBusinessCardResponse();
        return TeaModel.build(map, self);
    }

    public static class RecognizeBusinessCardResponseData extends TeaModel {
        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("Companies")
        @Validation(required = true)
        public java.util.List<String> companies;

        @NameInMap("Departments")
        @Validation(required = true)
        public java.util.List<String> departments;

        @NameInMap("Titles")
        @Validation(required = true)
        public java.util.List<String> titles;

        @NameInMap("CellPhoneNumbers")
        @Validation(required = true)
        public java.util.List<String> cellPhoneNumbers;

        @NameInMap("OfficePhoneNumbers")
        @Validation(required = true)
        public java.util.List<String> officePhoneNumbers;

        @NameInMap("Addresses")
        @Validation(required = true)
        public java.util.List<String> addresses;

        @NameInMap("Emails")
        @Validation(required = true)
        public java.util.List<String> emails;

        public static RecognizeBusinessCardResponseData build(java.util.Map<String, ?> map) throws Exception {
            RecognizeBusinessCardResponseData self = new RecognizeBusinessCardResponseData();
            return TeaModel.build(map, self);
        }

    }

}
