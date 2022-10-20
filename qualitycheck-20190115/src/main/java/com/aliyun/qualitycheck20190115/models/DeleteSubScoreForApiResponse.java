// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class DeleteSubScoreForApiResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteSubScoreForApiResponseBody body;

    public static DeleteSubScoreForApiResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteSubScoreForApiResponse self = new DeleteSubScoreForApiResponse();
        return TeaModel.build(map, self);
    }

    public DeleteSubScoreForApiResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteSubScoreForApiResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteSubScoreForApiResponse setBody(DeleteSubScoreForApiResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteSubScoreForApiResponseBody getBody() {
        return this.body;
    }

}
