// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class UpdateTrainAlgorithmResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateTrainAlgorithmResponseBody body;

    public static UpdateTrainAlgorithmResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateTrainAlgorithmResponse self = new UpdateTrainAlgorithmResponse();
        return TeaModel.build(map, self);
    }

    public UpdateTrainAlgorithmResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateTrainAlgorithmResponse setBody(UpdateTrainAlgorithmResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateTrainAlgorithmResponseBody getBody() {
        return this.body;
    }

}
