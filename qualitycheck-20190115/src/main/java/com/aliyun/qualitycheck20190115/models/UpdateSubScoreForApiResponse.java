// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class UpdateSubScoreForApiResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public UpdateSubScoreForApiResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateSubScoreForApiResponse setBody(UpdateSubScoreForApiResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateSubScoreForApiResponseBody getBody() {
        return this.body;
    }

}
