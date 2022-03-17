// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr_api20210707.models;

import com.aliyun.tea.*;

public class RecognizeNonTaxInvoiceResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public String data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static RecognizeNonTaxInvoiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RecognizeNonTaxInvoiceResponseBody self = new RecognizeNonTaxInvoiceResponseBody();
        return TeaModel.build(map, self);
    }

    public RecognizeNonTaxInvoiceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public RecognizeNonTaxInvoiceResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public RecognizeNonTaxInvoiceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public RecognizeNonTaxInvoiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
