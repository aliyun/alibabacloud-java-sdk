// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20220101.models;

import com.aliyun.tea.*;

public class DeleteInstanceLabelsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteInstanceLabelsResponseBody body;

    public static DeleteInstanceLabelsResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteInstanceLabelsResponse self = new DeleteInstanceLabelsResponse();
        return TeaModel.build(map, self);
    }

    public DeleteInstanceLabelsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteInstanceLabelsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteInstanceLabelsResponse setBody(DeleteInstanceLabelsResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteInstanceLabelsResponseBody getBody() {
        return this.body;
    }

}
