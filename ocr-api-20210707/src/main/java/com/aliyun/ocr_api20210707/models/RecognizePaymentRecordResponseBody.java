// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr_api20210707.models;

import com.aliyun.tea.*;

public class RecognizePaymentRecordResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public String data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static RecognizePaymentRecordResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RecognizePaymentRecordResponseBody self = new RecognizePaymentRecordResponseBody();
        return TeaModel.build(map, self);
    }

    public RecognizePaymentRecordResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public RecognizePaymentRecordResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public RecognizePaymentRecordResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public RecognizePaymentRecordResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
