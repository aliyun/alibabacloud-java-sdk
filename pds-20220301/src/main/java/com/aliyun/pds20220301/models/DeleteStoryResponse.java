// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class DeleteStoryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteStoryResponseBody body;

    public static DeleteStoryResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteStoryResponse self = new DeleteStoryResponse();
        return TeaModel.build(map, self);
    }

    public DeleteStoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteStoryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteStoryResponse setBody(DeleteStoryResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteStoryResponseBody getBody() {
        return this.body;
    }

}
