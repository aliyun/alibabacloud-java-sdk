// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class PreviewComponentCrdSchemaResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PreviewComponentCrdSchemaResponseBody body;

    public static PreviewComponentCrdSchemaResponse build(java.util.Map<String, ?> map) throws Exception {
        PreviewComponentCrdSchemaResponse self = new PreviewComponentCrdSchemaResponse();
        return TeaModel.build(map, self);
    }

    public PreviewComponentCrdSchemaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PreviewComponentCrdSchemaResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PreviewComponentCrdSchemaResponse setBody(PreviewComponentCrdSchemaResponseBody body) {
        this.body = body;
        return this;
    }
    public PreviewComponentCrdSchemaResponseBody getBody() {
        return this.body;
    }

}
