// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class DeleteScoreForApiResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteScoreForApiResponseBody body;

    public static DeleteScoreForApiResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteScoreForApiResponse self = new DeleteScoreForApiResponse();
        return TeaModel.build(map, self);
    }

    public DeleteScoreForApiResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteScoreForApiResponse setBody(DeleteScoreForApiResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteScoreForApiResponseBody getBody() {
        return this.body;
    }

}
