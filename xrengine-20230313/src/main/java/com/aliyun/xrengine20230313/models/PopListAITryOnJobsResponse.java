// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20230313.models;

import com.aliyun.tea.*;

public class PopListAITryOnJobsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PopListAITryOnJobsResponseBody body;

    public static PopListAITryOnJobsResponse build(java.util.Map<String, ?> map) throws Exception {
        PopListAITryOnJobsResponse self = new PopListAITryOnJobsResponse();
        return TeaModel.build(map, self);
    }

    public PopListAITryOnJobsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PopListAITryOnJobsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PopListAITryOnJobsResponse setBody(PopListAITryOnJobsResponseBody body) {
        this.body = body;
        return this;
    }
    public PopListAITryOnJobsResponseBody getBody() {
        return this.body;
    }

}
