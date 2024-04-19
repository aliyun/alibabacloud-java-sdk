// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class UpdateScoreForApiResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public UpdateScoreForApiResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateScoreForApiResponse setBody(UpdateScoreForApiResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateScoreForApiResponseBody getBody() {
        return this.body;
    }

}
