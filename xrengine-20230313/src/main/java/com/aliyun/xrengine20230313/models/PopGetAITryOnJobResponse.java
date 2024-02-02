// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20230313.models;

import com.aliyun.tea.*;

public class PopGetAITryOnJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PopGetAITryOnJobResponseBody body;

    public static PopGetAITryOnJobResponse build(java.util.Map<String, ?> map) throws Exception {
        PopGetAITryOnJobResponse self = new PopGetAITryOnJobResponse();
        return TeaModel.build(map, self);
    }

    public PopGetAITryOnJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PopGetAITryOnJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PopGetAITryOnJobResponse setBody(PopGetAITryOnJobResponseBody body) {
        this.body = body;
        return this;
    }
    public PopGetAITryOnJobResponseBody getBody() {
        return this.body;
    }

}
