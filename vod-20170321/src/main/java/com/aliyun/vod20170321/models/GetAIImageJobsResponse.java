// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetAIImageJobsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public GetAIImageJobsResponse setBody(GetAIImageJobsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAIImageJobsResponseBody getBody() {
        return this.body;
    }

}
