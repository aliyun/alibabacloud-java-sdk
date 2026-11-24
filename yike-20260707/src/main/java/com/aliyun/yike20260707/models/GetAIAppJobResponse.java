// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260707.models;

import com.aliyun.tea.*;

public class GetAIAppJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAIAppJobResponseBody body;

    public static GetAIAppJobResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAIAppJobResponse self = new GetAIAppJobResponse();
        return TeaModel.build(map, self);
    }

    public GetAIAppJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAIAppJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAIAppJobResponse setBody(GetAIAppJobResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAIAppJobResponseBody getBody() {
        return this.body;
    }

}
