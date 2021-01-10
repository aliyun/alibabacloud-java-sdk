// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class UpdateSubScoreForApiResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateSubScoreForApiResponseBody body;

    public static UpdateSubScoreForApiResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateSubScoreForApiResponse self = new UpdateSubScoreForApiResponse();
        return TeaModel.build(map, self);
    }

    public UpdateSubScoreForApiResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateSubScoreForApiResponse setBody(UpdateSubScoreForApiResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateSubScoreForApiResponseBody getBody() {
        return this.body;
    }

}
