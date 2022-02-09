// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr_api20210707.models;

import com.aliyun.tea.*;

public class RecognizeDeleteExcelRecordResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RecognizeDeleteExcelRecordResponseBody body;

    public static RecognizeDeleteExcelRecordResponse build(java.util.Map<String, ?> map) throws Exception {
        RecognizeDeleteExcelRecordResponse self = new RecognizeDeleteExcelRecordResponse();
        return TeaModel.build(map, self);
    }

    public RecognizeDeleteExcelRecordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RecognizeDeleteExcelRecordResponse setBody(RecognizeDeleteExcelRecordResponseBody body) {
        this.body = body;
        return this;
    }
    public RecognizeDeleteExcelRecordResponseBody getBody() {
        return this.body;
    }

}
