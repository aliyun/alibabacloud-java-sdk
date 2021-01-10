// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class RecognizeODPSchemasResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RecognizeODPSchemasResponseBody body;

    public static RecognizeODPSchemasResponse build(java.util.Map<String, ?> map) throws Exception {
        RecognizeODPSchemasResponse self = new RecognizeODPSchemasResponse();
        return TeaModel.build(map, self);
    }

    public RecognizeODPSchemasResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RecognizeODPSchemasResponse setBody(RecognizeODPSchemasResponseBody body) {
        this.body = body;
        return this;
    }
    public RecognizeODPSchemasResponseBody getBody() {
        return this.body;
    }

}
