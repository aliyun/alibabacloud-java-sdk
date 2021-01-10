// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class UpdateScoreForApiResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateScoreForApiResponseBody body;

    public static UpdateScoreForApiResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateScoreForApiResponse self = new UpdateScoreForApiResponse();
        return TeaModel.build(map, self);
    }

    public UpdateScoreForApiResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateScoreForApiResponse setBody(UpdateScoreForApiResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateScoreForApiResponseBody getBody() {
        return this.body;
    }

}
