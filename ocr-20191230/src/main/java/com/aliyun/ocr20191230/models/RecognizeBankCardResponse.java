// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr20191230.models;

import com.aliyun.tea.*;

public class RecognizeBankCardResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public RecognizeBankCardResponseData data;

    public static RecognizeBankCardResponse build(java.util.Map<String, ?> map) throws Exception {
        RecognizeBankCardResponse self = new RecognizeBankCardResponse();
        return TeaModel.build(map, self);
    }

    public static class RecognizeBankCardResponseData extends TeaModel {
        @NameInMap("BankName")
        @Validation(required = true)
        public String bankName;

        @NameInMap("CardNumber")
        @Validation(required = true)
        public String cardNumber;

        @NameInMap("ValidDate")
        @Validation(required = true)
        public String validDate;

        public static RecognizeBankCardResponseData build(java.util.Map<String, ?> map) throws Exception {
            RecognizeBankCardResponseData self = new RecognizeBankCardResponseData();
            return TeaModel.build(map, self);
        }

    }

}
