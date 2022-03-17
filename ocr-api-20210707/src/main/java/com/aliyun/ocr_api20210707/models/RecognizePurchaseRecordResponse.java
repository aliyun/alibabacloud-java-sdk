// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr_api20210707.models;

import com.aliyun.tea.*;

public class RecognizePurchaseRecordResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public RecognizePurchaseRecordResponse setBody(RecognizePurchaseRecordResponseBody body) {
        this.body = body;
        return this;
    }
    public RecognizePurchaseRecordResponseBody getBody() {
        return this.body;
    }

}
