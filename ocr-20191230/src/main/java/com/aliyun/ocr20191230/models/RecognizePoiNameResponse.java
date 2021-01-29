// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr20191230.models;

import com.aliyun.tea.*;

public class RecognizePoiNameResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RecognizePoiNameResponseBody body;

    public static RecognizePoiNameResponse build(java.util.Map<String, ?> map) throws Exception {
        RecognizePoiNameResponse self = new RecognizePoiNameResponse();
        return TeaModel.build(map, self);
    }

    public RecognizePoiNameResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RecognizePoiNameResponse setBody(RecognizePoiNameResponseBody body) {
        this.body = body;
        return this;
    }
    public RecognizePoiNameResponseBody getBody() {
        return this.body;
    }

}
