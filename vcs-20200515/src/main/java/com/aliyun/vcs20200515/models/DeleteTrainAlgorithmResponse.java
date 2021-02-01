// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class DeleteTrainAlgorithmResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteTrainAlgorithmResponseBody body;

    public static DeleteTrainAlgorithmResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteTrainAlgorithmResponse self = new DeleteTrainAlgorithmResponse();
        return TeaModel.build(map, self);
    }

    public DeleteTrainAlgorithmResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteTrainAlgorithmResponse setBody(DeleteTrainAlgorithmResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteTrainAlgorithmResponseBody getBody() {
        return this.body;
    }

}
