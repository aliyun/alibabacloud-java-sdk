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

    public RecognizeBankCardResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RecognizeBankCardResponse setData(RecognizeBankCardResponseData data) {
        this.data = data;
        return this;
    }
    public RecognizeBankCardResponseData getData() {
        return this.data;
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

        public RecognizeBankCardResponseData setBankName(String bankName) {
            this.bankName = bankName;
            return this;
        }
        public String getBankName() {
            return this.bankName;
        }

        public RecognizeBankCardResponseData setCardNumber(String cardNumber) {
            this.cardNumber = cardNumber;
            return this;
        }
        public String getCardNumber() {
            return this.cardNumber;
        }

        public RecognizeBankCardResponseData setValidDate(String validDate) {
            this.validDate = validDate;
            return this;
        }
        public String getValidDate() {
            return this.validDate;
        }

    }

}
