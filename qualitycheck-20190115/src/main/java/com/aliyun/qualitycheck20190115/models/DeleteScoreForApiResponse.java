// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class DeleteScoreForApiResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public DeleteScoreForApiResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteScoreForApiResponse setBody(DeleteScoreForApiResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteScoreForApiResponseBody getBody() {
        return this.body;
    }

}
