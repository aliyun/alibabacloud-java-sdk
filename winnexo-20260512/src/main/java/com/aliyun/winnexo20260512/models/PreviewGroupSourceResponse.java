// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class PreviewGroupSourceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PreviewGroupSourceResponseBody body;

    public static PreviewGroupSourceResponse build(java.util.Map<String, ?> map) throws Exception {
        PreviewGroupSourceResponse self = new PreviewGroupSourceResponse();
        return TeaModel.build(map, self);
    }

    public PreviewGroupSourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PreviewGroupSourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PreviewGroupSourceResponse setBody(PreviewGroupSourceResponseBody body) {
        this.body = body;
        return this;
    }
    public PreviewGroupSourceResponseBody getBody() {
        return this.body;
    }

}
