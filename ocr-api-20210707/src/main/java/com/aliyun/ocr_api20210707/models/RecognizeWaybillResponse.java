// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr_api20210707.models;

import com.aliyun.tea.*;

public class RecognizeWaybillResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RecognizeWaybillResponseBody body;

    public static RecognizeWaybillResponse build(java.util.Map<String, ?> map) throws Exception {
        RecognizeWaybillResponse self = new RecognizeWaybillResponse();
        return TeaModel.build(map, self);
    }

    public RecognizeWaybillResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RecognizeWaybillResponse setBody(RecognizeWaybillResponseBody body) {
        this.body = body;
        return this;
    }
    public RecognizeWaybillResponseBody getBody() {
        return this.body;
    }

}
