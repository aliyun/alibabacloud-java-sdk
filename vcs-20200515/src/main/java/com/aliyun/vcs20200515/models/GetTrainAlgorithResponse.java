// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class GetTrainAlgorithResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetTrainAlgorithResponseBody body;

    public static GetTrainAlgorithResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTrainAlgorithResponse self = new GetTrainAlgorithResponse();
        return TeaModel.build(map, self);
    }

    public GetTrainAlgorithResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTrainAlgorithResponse setBody(GetTrainAlgorithResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTrainAlgorithResponseBody getBody() {
        return this.body;
    }

}
