// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rai20240701.models;

import com.aliyun.tea.*;

public class ModelOutputContentAsyncDetectResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModelOutputContentAsyncDetectResponseBody body;

    public static ModelOutputContentAsyncDetectResponse build(java.util.Map<String, ?> map) throws Exception {
        ModelOutputContentAsyncDetectResponse self = new ModelOutputContentAsyncDetectResponse();
        return TeaModel.build(map, self);
    }

    public ModelOutputContentAsyncDetectResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModelOutputContentAsyncDetectResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModelOutputContentAsyncDetectResponse setBody(ModelOutputContentAsyncDetectResponseBody body) {
        this.body = body;
        return this;
    }
    public ModelOutputContentAsyncDetectResponseBody getBody() {
        return this.body;
    }

}
