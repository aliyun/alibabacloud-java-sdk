// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr20191230.models;

import com.aliyun.tea.*;

public class RecognizeBankCardResponseBody extends TeaModel {
    @NameInMap("Data")
    public RecognizeBankCardResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static RecognizeBankCardResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RecognizeBankCardResponseBody self = new RecognizeBankCardResponseBody();
        return TeaModel.build(map, self);
    }

    public RecognizeBankCardResponseBody setData(RecognizeBankCardResponseBodyData data) {
        this.data = data;
        return this;
    }
    public RecognizeBankCardResponseBodyData getData() {
        return this.data;
    }

    public RecognizeBankCardResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class RecognizeBankCardResponseBodyData extends TeaModel {
        @NameInMap("BankName")
        public String bankName;

        @NameInMap("CardNumber")
        public String cardNumber;

        @NameInMap("CardType")
        public String cardType;

        @NameInMap("ValidDate")
        public String validDate;

        public static RecognizeBankCardResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            RecognizeBankCardResponseBodyData self = new RecognizeBankCardResponseBodyData();
            return TeaModel.build(map, self);
        }

        public RecognizeBankCardResponseBodyData setBankName(String bankName) {
            this.bankName = bankName;
            return this;
        }
        public String getBankName() {
            return this.bankName;
        }

        public RecognizeBankCardResponseBodyData setCardNumber(String cardNumber) {
            this.cardNumber = cardNumber;
            return this;
        }
        public String getCardNumber() {
            return this.cardNumber;
        }

        public RecognizeBankCardResponseBodyData setCardType(String cardType) {
            this.cardType = cardType;
            return this;
        }
        public String getCardType() {
            return this.cardType;
        }

        public RecognizeBankCardResponseBodyData setValidDate(String validDate) {
            this.validDate = validDate;
            return this;
        }
        public String getValidDate() {
            return this.validDate;
        }

    }

}
