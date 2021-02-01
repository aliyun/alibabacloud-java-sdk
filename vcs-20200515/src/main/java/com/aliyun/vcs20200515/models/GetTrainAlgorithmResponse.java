// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class GetTrainAlgorithmResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetTrainAlgorithmResponseBody body;

    public static GetTrainAlgorithmResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTrainAlgorithmResponse self = new GetTrainAlgorithmResponse();
        return TeaModel.build(map, self);
    }

    public GetTrainAlgorithmResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTrainAlgorithmResponse setBody(GetTrainAlgorithmResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTrainAlgorithmResponseBody getBody() {
        return this.body;
    }

}
