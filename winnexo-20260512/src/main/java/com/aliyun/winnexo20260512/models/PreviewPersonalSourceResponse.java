// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class PreviewPersonalSourceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PreviewPersonalSourceResponseBody body;

    public static PreviewPersonalSourceResponse build(java.util.Map<String, ?> map) throws Exception {
        PreviewPersonalSourceResponse self = new PreviewPersonalSourceResponse();
        return TeaModel.build(map, self);
    }

    public PreviewPersonalSourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PreviewPersonalSourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PreviewPersonalSourceResponse setBody(PreviewPersonalSourceResponseBody body) {
        this.body = body;
        return this;
    }
    public PreviewPersonalSourceResponseBody getBody() {
        return this.body;
    }

}
