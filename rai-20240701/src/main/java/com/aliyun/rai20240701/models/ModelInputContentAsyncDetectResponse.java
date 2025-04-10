// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rai20240701.models;

import com.aliyun.tea.*;

public class ModelInputContentAsyncDetectResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModelInputContentAsyncDetectResponseBody body;

    public static ModelInputContentAsyncDetectResponse build(java.util.Map<String, ?> map) throws Exception {
        ModelInputContentAsyncDetectResponse self = new ModelInputContentAsyncDetectResponse();
        return TeaModel.build(map, self);
    }

    public ModelInputContentAsyncDetectResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModelInputContentAsyncDetectResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModelInputContentAsyncDetectResponse setBody(ModelInputContentAsyncDetectResponseBody body) {
        this.body = body;
        return this;
    }
    public ModelInputContentAsyncDetectResponseBody getBody() {
        return this.body;
    }

}
