// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr_api20210707.models;

import com.aliyun.tea.*;

public class RecognizePurchaseRecordResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RecognizePurchaseRecordResponseBody body;

    public static RecognizePurchaseRecordResponse build(java.util.Map<String, ?> map) throws Exception {
        RecognizePurchaseRecordResponse self = new RecognizePurchaseRecordResponse();
        return TeaModel.build(map, self);
    }

    public RecognizePurchaseRecordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RecognizePurchaseRecordResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RecognizePurchaseRecordResponse setBody(RecognizePurchaseRecordResponseBody body) {
        this.body = body;
        return this;
    }
    public RecognizePurchaseRecordResponseBody getBody() {
        return this.body;
    }

}
