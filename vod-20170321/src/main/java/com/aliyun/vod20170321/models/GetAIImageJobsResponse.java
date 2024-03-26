// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetAIImageJobsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAIImageJobsResponseBody body;

    public static GetAIImageJobsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAIImageJobsResponse self = new GetAIImageJobsResponse();
        return TeaModel.build(map, self);
    }

    public GetAIImageJobsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAIImageJobsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAIImageJobsResponse setBody(GetAIImageJobsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAIImageJobsResponseBody getBody() {
        return this.body;
    }

}
