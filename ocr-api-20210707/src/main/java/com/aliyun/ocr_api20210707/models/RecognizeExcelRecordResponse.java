// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr_api20210707.models;

import com.aliyun.tea.*;

public class RecognizeExcelRecordResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RecognizeExcelRecordResponseBody body;

    public static RecognizeExcelRecordResponse build(java.util.Map<String, ?> map) throws Exception {
        RecognizeExcelRecordResponse self = new RecognizeExcelRecordResponse();
        return TeaModel.build(map, self);
    }

    public RecognizeExcelRecordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RecognizeExcelRecordResponse setBody(RecognizeExcelRecordResponseBody body) {
        this.body = body;
        return this;
    }
    public RecognizeExcelRecordResponseBody getBody() {
        return this.body;
    }

}
